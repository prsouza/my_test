package p3;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;

public final class k implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f9594a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9595b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9596a;

        public a(ByteBuffer byteBuffer) {
            this.f9596a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final short a() throws c.a {
            if (this.f9596a.remaining() >= 1) {
                return (short) (this.f9596a.get() & 255);
            }
            throw new c.a();
        }

        public final int b() throws c.a {
            return (a() << 8) | a();
        }

        public final long skip(long j10) {
            int min = (int) Math.min((long) this.f9596a.remaining(), j10);
            ByteBuffer byteBuffer = this.f9596a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f9597a;

        public b(byte[] bArr, int i) {
            this.f9597a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public final short a(int i) {
            if (this.f9597a.remaining() - i >= 2) {
                return this.f9597a.getShort(i);
            }
            return -1;
        }

        public final int b(int i) {
            if (this.f9597a.remaining() - i >= 4) {
                return this.f9597a.getInt(i);
            }
            return -1;
        }
    }

    public interface c {

        public static final class a extends IOException {
            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        short a() throws IOException;

        int b() throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f9598a;

        public d(InputStream inputStream) {
            this.f9598a = inputStream;
        }

        public final short a() throws IOException {
            int read = this.f9598a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public final int b() throws IOException {
            return (a() << 8) | a();
        }

        public final int c(byte[] bArr, int i) throws IOException {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i && (i11 = this.f9598a.read(bArr, i10, i - i10)) != -1) {
                i10 += i11;
            }
            if (i10 != 0 || i11 != -1) {
                return i10;
            }
            throw new c.a();
        }

        public final long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f9598a.skip(j11);
                if (skip <= 0) {
                    if (this.f9598a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return d(new a(byteBuffer));
    }

    public final int b(InputStream inputStream, j3.b bVar) throws IOException {
        byte[] bArr;
        Objects.requireNonNull(inputStream, "Argument must not be null");
        d dVar = new d(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        try {
            int b10 = dVar.b();
            if ((b10 & 65496) == 65496 || b10 == 19789 || b10 == 18761) {
                int e10 = e(dVar);
                if (e10 != -1) {
                    bArr = (byte[]) bVar.d(e10, byte[].class);
                    int f10 = f(dVar, bArr, e10);
                    bVar.c(bArr);
                    return f10;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + b10);
                return -1;
            }
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th2) {
            bVar.c(bArr);
            throw th2;
        }
    }

    public final ImageHeaderParser.ImageType c(InputStream inputStream) throws IOException {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return d(new d(inputStream));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType d(p3.k.c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.b()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.a()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.a()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.b()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.b()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.a()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.k.d(p3.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final int e(c cVar) throws IOException {
        short a10;
        int b10;
        long j10;
        long skip;
        do {
            d dVar = (d) cVar;
            short a11 = dVar.a();
            if (a11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + a11);
                }
                return -1;
            }
            a10 = dVar.a();
            if (a10 == 218) {
                return -1;
            }
            if (a10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            b10 = dVar.b() - 2;
            if (a10 == 225) {
                return b10;
            }
            j10 = (long) b10;
            skip = dVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + a10 + ", wanted to skip: " + b10 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public final int f(c cVar, byte[] bArr, int i) throws IOException {
        ByteOrder byteOrder;
        int c10 = ((d) cVar).c(bArr, i);
        if (c10 != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + c10);
            }
            return -1;
        }
        boolean z = bArr != null && i > f9594a.length;
        if (z) {
            int i10 = 0;
            while (true) {
                byte[] bArr2 = f9594a;
                if (i10 >= bArr2.length) {
                    break;
                } else if (bArr[i10] != bArr2[i10]) {
                    z = false;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i);
            short a10 = bVar.a(6);
            if (a10 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a10 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a10);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.f9597a.order(byteOrder);
            int b10 = bVar.b(10) + 6;
            short a11 = bVar.a(b10);
            for (int i11 = 0; i11 < a11; i11++) {
                int i12 = (i11 * 12) + b10 + 2;
                short a12 = bVar.a(i12);
                if (a12 == 274) {
                    short a13 = bVar.a(i12 + 2);
                    if (a13 >= 1 && a13 <= 12) {
                        int b11 = bVar.b(i12 + 4);
                        if (b11 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i11 + " tagType=" + a12 + " formatCode=" + a13 + " componentCount=" + b11);
                            }
                            int i13 = b11 + f9595b[a13];
                            if (i13 <= 4) {
                                int i14 = i12 + 8;
                                if (i14 < 0 || i14 > bVar.f9597a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i14 + " tagType=" + a12);
                                    }
                                } else if (i13 >= 0 && i13 + i14 <= bVar.f9597a.remaining()) {
                                    return bVar.a(i14);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a12);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a13);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a13);
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
