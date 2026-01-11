package net.jpountz.lz4;

import b9.m;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4BlockOutputStream extends FilterOutputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int COMPRESSION_LEVEL_BASE = 10;
    public static final int COMPRESSION_METHOD_LZ4 = 32;
    public static final int COMPRESSION_METHOD_RAW = 16;
    public static final int DEFAULT_SEED = -1756908916;
    public static final int HEADER_LENGTH;
    public static final byte[] MAGIC;
    public static final int MAGIC_LENGTH;
    public static final int MAX_BLOCK_SIZE = 33554432;
    public static final int MIN_BLOCK_SIZE = 64;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;

    /* renamed from: o  reason: collision with root package name */
    private int f8994o;
    private final boolean syncFlush;

    static {
        Class<LZ4BlockOutputStream> cls = LZ4BlockOutputStream.class;
        byte[] bArr = {76, 90, 52, 66, 108, 111, 99, 107};
        MAGIC = bArr;
        int length = bArr.length;
        MAGIC_LENGTH = length;
        HEADER_LENGTH = length + 1 + 4 + 4 + 4;
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor, Checksum checksum2, boolean z) {
        super(outputStream);
        this.blockSize = i;
        this.compressor = lZ4Compressor;
        this.checksum = checksum2;
        this.compressionLevel = compressionLevel(i);
        this.buffer = new byte[i];
        byte[] bArr = new byte[(lZ4Compressor.maxCompressedLength(i) + HEADER_LENGTH)];
        this.compressedBuffer = bArr;
        this.syncFlush = z;
        this.f8994o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
    }

    private static int compressionLevel(int i) {
        if (i < 64) {
            throw new IllegalArgumentException(m.b("blockSize must be >= 64, got ", i));
        } else if (i <= 33554432) {
            return Math.max(0, (32 - Integer.numberOfLeadingZeros(i - 1)) - 10);
        } else {
            throw new IllegalArgumentException(m.b("blockSize must be <= 33554432, got ", i));
        }
    }

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    private void flushBufferedData() throws IOException {
        int i;
        if (this.f8994o != 0) {
            this.checksum.reset();
            this.checksum.update(this.buffer, 0, this.f8994o);
            int value = (int) this.checksum.getValue();
            LZ4Compressor lZ4Compressor = this.compressor;
            byte[] bArr = this.buffer;
            int i10 = this.f8994o;
            byte[] bArr2 = this.compressedBuffer;
            int i11 = HEADER_LENGTH;
            int compress = lZ4Compressor.compress(bArr, 0, i10, bArr2, i11);
            int i12 = this.f8994o;
            if (compress >= i12) {
                i = 16;
                System.arraycopy(this.buffer, 0, this.compressedBuffer, i11, i12);
            } else {
                i12 = compress;
                i = 32;
            }
            byte[] bArr3 = this.compressedBuffer;
            int i13 = MAGIC_LENGTH;
            bArr3[i13] = (byte) (i | this.compressionLevel);
            writeIntLE(i12, bArr3, i13 + 1);
            writeIntLE(this.f8994o, this.compressedBuffer, i13 + 5);
            writeIntLE(value, this.compressedBuffer, i13 + 9);
            this.out.write(this.compressedBuffer, 0, i11 + i12);
            this.f8994o = 0;
        }
    }

    private static void writeIntLE(int i, byte[] bArr, int i10) {
        int i11 = i10 + 1;
        bArr[i10] = (byte) i;
        int i12 = i11 + 1;
        bArr[i11] = (byte) (i >>> 8);
        bArr[i12] = (byte) (i >>> 16);
        bArr[i12 + 1] = (byte) (i >>> 24);
    }

    public void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.close();
            this.out = null;
        }
    }

    public void finish() throws IOException {
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i = MAGIC_LENGTH;
        bArr[i] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i + 1);
        writeIntLE(0, this.compressedBuffer, i + 5);
        writeIntLE(0, this.compressedBuffer, i + 9);
        this.out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        this.out.flush();
    }

    public void flush() throws IOException {
        if (this.out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            this.out.flush();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "(out=" + this.out + ", blockSize=" + this.blockSize + ", compressor=" + this.compressor + ", checksum=" + this.checksum + ")";
    }

    public void write(int i) throws IOException {
        ensureNotFinished();
        if (this.f8994o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i10 = this.f8994o;
        this.f8994o = i10 + 1;
        bArr[i10] = (byte) i;
    }

    public void write(byte[] bArr, int i, int i10) throws IOException {
        SafeUtils.checkRange(bArr, i, i10);
        ensureNotFinished();
        while (true) {
            int i11 = this.f8994o;
            int i12 = i11 + i10;
            int i13 = this.blockSize;
            if (i12 > i13) {
                int i14 = i13 - i11;
                System.arraycopy(bArr, i, this.buffer, i11, i13 - i11);
                this.f8994o = this.blockSize;
                flushBufferedData();
                i += i14;
                i10 -= i14;
            } else {
                System.arraycopy(bArr, i, this.buffer, i11, i10);
                this.f8994o += i10;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor) {
        this(outputStream, i, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(DEFAULT_SEED).asChecksum(), false);
    }

    public void write(byte[] bArr) throws IOException {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, LZ4Constants.MAX_DISTANCE);
    }
}
