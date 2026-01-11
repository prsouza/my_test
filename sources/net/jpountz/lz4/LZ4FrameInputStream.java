package net.jpountz.lz4;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4FrameInputStream extends FilterInputStream {
    public static final String BLOCK_HASH_MISMATCH = "Block checksum mismatch";
    public static final String DESCRIPTOR_HASH_MISMATCH = "Stream frame descriptor corrupted";
    public static final int MAGIC_SKIPPABLE_BASE = 407710288;
    public static final String NOT_SUPPORTED = "Stream unsupported";
    public static final String PREMATURE_EOS = "Stream ended prematurely";
    private ByteBuffer buffer;
    private final XXHash32 checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private final boolean readSingleFrame;
    private long totalContentSize;

    public LZ4FrameInputStream(InputStream inputStream) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    private boolean nextFrameInfo() throws IOException {
        while (true) {
            int i = 0;
            do {
                int read = this.in.read(this.readNumberBuff.array(), i, 4 - i);
                if (read < 0) {
                    return false;
                }
                i += read;
            } while (i < 4);
            int i10 = this.readNumberBuff.getInt(0);
            if (i10 == 407708164) {
                readHeader();
                return true;
            } else if ((i10 >>> 4) == 25481893) {
                skippableFrame();
            } else {
                throw new IOException(NOT_SUPPORTED);
            }
        }
    }

    private void readBlock() throws IOException {
        byte[] bArr;
        int readInt = readInt(this.in);
        boolean z = (Integer.MIN_VALUE & readInt) == 0;
        int i = readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != 0) {
            if (z) {
                bArr = this.compressedBuffer;
            } else {
                bArr = this.rawBuffer;
            }
            byte[] bArr2 = bArr;
            if (i <= this.maxBlockSize) {
                int i10 = 0;
                while (i10 < i) {
                    int read = this.in.read(bArr2, i10, i - i10);
                    if (read >= 0) {
                        i10 += read;
                    } else {
                        throw new IOException(PREMATURE_EOS);
                    }
                }
                if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) || readInt(this.in) == this.checksum.hash(bArr2, 0, i, 0)) {
                    if (z) {
                        try {
                            LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                            byte[] bArr3 = this.rawBuffer;
                            i = lZ4SafeDecompressor.decompress(bArr2, 0, i, bArr3, 0, bArr3.length);
                        } catch (LZ4Exception e10) {
                            throw new IOException(e10);
                        }
                    }
                    if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
                        this.frameInfo.updateStreamHash(this.rawBuffer, 0, i);
                    }
                    this.totalContentSize += (long) i;
                    this.buffer.limit(i);
                    this.buffer.rewind();
                    return;
                }
                throw new IOException(BLOCK_HASH_MISMATCH);
            }
            throw new IOException(String.format(Locale.ROOT, "Block size %s exceeded max: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.maxBlockSize)}));
        } else if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(this.in) != this.frameInfo.currentStreamHash()) {
            throw new IOException("Content checksum mismatch");
        } else if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
            this.frameInfo.finish();
        } else {
            throw new IOException("Size check mismatch");
        }
    }

    private void readHeader() throws IOException {
        this.headerBuffer.rewind();
        int read = this.in.read();
        if (read >= 0) {
            int read2 = this.in.read();
            if (read2 >= 0) {
                byte b10 = (byte) (read & 255);
                LZ4FrameOutputStream.FLG fromByte = LZ4FrameOutputStream.FLG.fromByte(b10);
                this.headerBuffer.put(b10);
                byte b11 = (byte) (read2 & 255);
                LZ4FrameOutputStream.BD fromByte2 = LZ4FrameOutputStream.BD.fromByte(b11);
                this.headerBuffer.put(b11);
                this.frameInfo = new LZ4FrameOutputStream.FrameInfo(fromByte, fromByte2);
                if (fromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
                    long readLong = readLong(this.in);
                    this.expectedContentSize = readLong;
                    this.headerBuffer.putLong(readLong);
                }
                this.totalContentSize = 0;
                byte hash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
                int read3 = this.in.read();
                if (read3 < 0) {
                    throw new IOException(PREMATURE_EOS);
                } else if (hash == ((byte) (read3 & 255))) {
                    int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
                    this.maxBlockSize = blockMaximumSize;
                    this.compressedBuffer = new byte[blockMaximumSize];
                    byte[] bArr = new byte[blockMaximumSize];
                    this.rawBuffer = bArr;
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    this.buffer = wrap;
                    wrap.limit(0);
                } else {
                    throw new IOException(DESCRIPTOR_HASH_MISMATCH);
                }
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        } else {
            throw new IOException(PREMATURE_EOS);
        }
    }

    private int readInt(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        } while (i < 4);
        return this.readNumberBuff.getInt(0);
    }

    private long readLong(InputStream inputStream) throws IOException {
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (read >= 0) {
                i += read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        } while (i < 8);
        return this.readNumberBuff.getLong(0);
    }

    private void skippableFrame() throws IOException {
        int readInt = readInt(this.in);
        byte[] bArr = new byte[1024];
        while (readInt > 0) {
            int read = this.in.read(bArr, 0, Math.min(readInt, 1024));
            if (read >= 0) {
                readInt -= read;
            } else {
                throw new IOException(PREMATURE_EOS);
            }
        }
    }

    public int available() throws IOException {
        return this.buffer.remaining();
    }

    public void close() throws IOException {
        super.close();
    }

    public long getExpectedContentSize() {
        if (this.readSingleFrame) {
            return this.expectedContentSize;
        }
        throw new UnsupportedOperationException("Operation not permitted when multiple frames can be read");
    }

    public boolean isExpectedContentSizeDefined() {
        if (!this.readSingleFrame || this.expectedContentSize < 0) {
            return false;
        }
        return true;
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException("mark not supported");
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }

    public synchronized void reset() throws IOException {
        throw new UnsupportedOperationException("reset not supported");
    }

    public long skip(long j10) throws IOException {
        if (j10 <= 0) {
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return 0;
            }
            readBlock();
        }
        long min = Math.min(j10, (long) this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) min));
        return min;
    }

    public LZ4FrameInputStream(InputStream inputStream, boolean z) throws IOException {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32(), z);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) throws IOException {
        this(inputStream, lZ4SafeDecompressor, xXHash32, false);
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32, boolean z) throws IOException {
        super(inputStream);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.headerBuffer = wrap.order(byteOrder);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1;
        this.totalContentSize = 0;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(byteOrder);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        this.readSingleFrame = z;
        nextFrameInfo();
    }

    public int read(byte[] bArr, int i, int i10) throws IOException {
        if (i < 0 || i10 < 0 || i + i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && (this.readSingleFrame || !nextFrameInfo())) {
                return -1;
            }
            readBlock();
        }
        int min = Math.min(i10, this.buffer.remaining());
        this.buffer.get(bArr, i, min);
        return min;
    }
}
