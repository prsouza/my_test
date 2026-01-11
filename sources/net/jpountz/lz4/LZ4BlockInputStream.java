package net.jpountz.lz4;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4BlockInputStream extends FilterInputStream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] buffer;
    private final Checksum checksum;
    private byte[] compressedBuffer;
    private final LZ4FastDecompressor decompressor;
    private boolean finished;

    /* renamed from: o  reason: collision with root package name */
    private int f8993o;
    private int originalLen;
    private final boolean stopOnEmptyBlock;

    static {
        Class<LZ4BlockInputStream> cls = LZ4BlockInputStream.class;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2, boolean z) {
        super(inputStream);
        this.decompressor = lZ4FastDecompressor;
        this.checksum = checksum2;
        this.stopOnEmptyBlock = z;
        this.buffer = new byte[0];
        this.compressedBuffer = new byte[LZ4BlockOutputStream.HEADER_LENGTH];
        this.originalLen = 0;
        this.f8993o = 0;
        this.finished = false;
    }

    private void readFully(byte[] bArr, int i) throws IOException {
        if (!tryReadFully(bArr, i)) {
            throw new EOFException(LZ4FrameInputStream.PREMATURE_EOS);
        }
    }

    private void refill() throws IOException {
        if (tryReadFully(this.compressedBuffer, LZ4BlockOutputStream.HEADER_LENGTH)) {
            int i = 0;
            while (true) {
                int i10 = LZ4BlockOutputStream.MAGIC_LENGTH;
                if (i >= i10) {
                    byte[] bArr = this.compressedBuffer;
                    byte b10 = bArr[i10] & 255;
                    byte b11 = b10 & 240;
                    int i11 = (b10 & 15) + 10;
                    if (b11 == 16 || b11 == 32) {
                        int readIntLE = SafeUtils.readIntLE(bArr, i10 + 1);
                        this.originalLen = SafeUtils.readIntLE(this.compressedBuffer, i10 + 5);
                        int readIntLE2 = SafeUtils.readIntLE(this.compressedBuffer, i10 + 9);
                        int i12 = this.originalLen;
                        if (i12 > (1 << i11) || i12 < 0 || readIntLE < 0 || ((i12 == 0 && readIntLE != 0) || ((i12 != 0 && readIntLE == 0) || (b11 == 16 && i12 != readIntLE)))) {
                            throw new IOException("Stream is corrupted");
                        } else if (i12 != 0 || readIntLE != 0) {
                            byte[] bArr2 = this.buffer;
                            if (bArr2.length < i12) {
                                this.buffer = new byte[Math.max(i12, (bArr2.length * 3) / 2)];
                            }
                            if (b11 == 16) {
                                readFully(this.buffer, this.originalLen);
                            } else if (b11 == 32) {
                                byte[] bArr3 = this.compressedBuffer;
                                if (bArr3.length < readIntLE) {
                                    this.compressedBuffer = new byte[Math.max(readIntLE, (bArr3.length * 3) / 2)];
                                }
                                readFully(this.compressedBuffer, readIntLE);
                                try {
                                    if (readIntLE != this.decompressor.decompress(this.compressedBuffer, 0, this.buffer, 0, this.originalLen)) {
                                        throw new IOException("Stream is corrupted");
                                    }
                                } catch (LZ4Exception e10) {
                                    throw new IOException("Stream is corrupted", e10);
                                }
                            } else {
                                throw new AssertionError();
                            }
                            this.checksum.reset();
                            this.checksum.update(this.buffer, 0, this.originalLen);
                            if (((int) this.checksum.getValue()) == readIntLE2) {
                                this.f8993o = 0;
                                return;
                            }
                            throw new IOException("Stream is corrupted");
                        } else if (readIntLE2 != 0) {
                            throw new IOException("Stream is corrupted");
                        } else if (!this.stopOnEmptyBlock) {
                            refill();
                            return;
                        } else {
                            this.finished = true;
                            return;
                        }
                    } else {
                        throw new IOException("Stream is corrupted");
                    }
                } else if (this.compressedBuffer[i] == LZ4BlockOutputStream.MAGIC[i]) {
                    i++;
                } else {
                    throw new IOException("Stream is corrupted");
                }
            }
        } else if (!this.stopOnEmptyBlock) {
            this.finished = true;
        } else {
            throw new EOFException(LZ4FrameInputStream.PREMATURE_EOS);
        }
    }

    private boolean tryReadFully(byte[] bArr, int i) throws IOException {
        int i10 = 0;
        while (i10 < i) {
            int read = this.in.read(bArr, i10, i - i10);
            if (read < 0) {
                return false;
            }
            i10 += read;
        }
        return true;
    }

    public int available() throws IOException {
        return this.originalLen - this.f8993o;
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        if (this.finished) {
            return -1;
        }
        if (this.f8993o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i = this.f8993o;
        this.f8993o = i + 1;
        return bArr[i] & 255;
    }

    public void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public long skip(long j10) throws IOException {
        if (j10 <= 0 || this.finished) {
            return 0;
        }
        if (this.f8993o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return 0;
        }
        int min = (int) Math.min(j10, (long) (this.originalLen - this.f8993o));
        this.f8993o += min;
        return (long) min;
    }

    public String toString() {
        return getClass().getSimpleName() + "(in=" + this.in + ", decompressor=" + this.decompressor + ", checksum=" + this.checksum + ")";
    }

    public int read(byte[] bArr, int i, int i10) throws IOException {
        SafeUtils.checkRange(bArr, i, i10);
        if (this.finished) {
            return -1;
        }
        if (this.f8993o == this.originalLen) {
            refill();
        }
        if (this.finished) {
            return -1;
        }
        int min = Math.min(i10, this.originalLen - this.f8993o);
        System.arraycopy(this.buffer, this.f8993o, bArr, i, min);
        this.f8993o += min;
        return min;
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor, Checksum checksum2) {
        this(inputStream, lZ4FastDecompressor, checksum2, true);
    }

    public LZ4BlockInputStream(InputStream inputStream, LZ4FastDecompressor lZ4FastDecompressor) {
        this(inputStream, lZ4FastDecompressor, XXHashFactory.fastestInstance().newStreamingHash32(LZ4BlockOutputStream.DEFAULT_SEED).asChecksum(), true);
    }

    public LZ4BlockInputStream(InputStream inputStream, boolean z) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor(), XXHashFactory.fastestInstance().newStreamingHash32(LZ4BlockOutputStream.DEFAULT_SEED).asChecksum(), z);
    }

    public LZ4BlockInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().fastDecompressor());
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
