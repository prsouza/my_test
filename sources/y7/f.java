package y7;

import androidx.activity.result.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Logger;

public final class f implements Closeable {

    /* renamed from: v  reason: collision with root package name */
    public static final Logger f13502v = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f13503a;

    /* renamed from: b  reason: collision with root package name */
    public int f13504b;

    /* renamed from: c  reason: collision with root package name */
    public int f13505c;

    /* renamed from: s  reason: collision with root package name */
    public a f13506s;

    /* renamed from: t  reason: collision with root package name */
    public a f13507t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f13508u = new byte[16];

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f13509c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f13510a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13511b;

        public a(int i, int i10) {
            this.f13510a = i;
            this.f13511b = i10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f13510a);
            sb2.append(", length = ");
            return d.c(sb2, this.f13511b, "]");
        }
    }

    public interface c {
    }

    /* JADX INFO: finally extract failed */
    public f(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    T(bArr, i, iArr[i10]);
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f13503a = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(this.f13508u);
        int w6 = w(this.f13508u, 0);
        this.f13504b = w6;
        if (((long) w6) <= randomAccessFile2.length()) {
            this.f13505c = w(this.f13508u, 4);
            int w10 = w(this.f13508u, 8);
            int w11 = w(this.f13508u, 12);
            this.f13506s = t(w10);
            this.f13507t = t(w11);
            return;
        }
        StringBuilder d10 = a.a.d("File is truncated. Expected length: ");
        d10.append(this.f13504b);
        d10.append(", Actual length: ");
        d10.append(randomAccessFile2.length());
        throw new IOException(d10.toString());
    }

    public static void T(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    public static int w(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final void B(int i, byte[] bArr, int i10, int i11) throws IOException {
        int R = R(i);
        int i12 = R + i11;
        int i13 = this.f13504b;
        if (i12 <= i13) {
            this.f13503a.seek((long) R);
            this.f13503a.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - R;
        this.f13503a.seek((long) R);
        this.f13503a.readFully(bArr, i10, i14);
        this.f13503a.seek(16);
        this.f13503a.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void E(int i, byte[] bArr, int i10) throws IOException {
        int R = R(i);
        int i11 = R + i10;
        int i12 = this.f13504b;
        if (i11 <= i12) {
            this.f13503a.seek((long) R);
            this.f13503a.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - R;
        this.f13503a.seek((long) R);
        this.f13503a.write(bArr, 0, i13);
        this.f13503a.seek(16);
        this.f13503a.write(bArr, i13 + 0, i10 - i13);
    }

    public final int O() {
        if (this.f13505c == 0) {
            return 16;
        }
        a aVar = this.f13507t;
        int i = aVar.f13510a;
        int i10 = this.f13506s.f13510a;
        if (i >= i10) {
            return (i - i10) + 4 + aVar.f13511b + 16;
        }
        return (((i + 4) + aVar.f13511b) + this.f13504b) - i10;
    }

    public final int R(int i) {
        int i10 = this.f13504b;
        return i < i10 ? i : (i + 16) - i10;
    }

    public final void S(int i, int i10, int i11, int i12) throws IOException {
        byte[] bArr = this.f13508u;
        int[] iArr = {i, i10, i11, i12};
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            T(bArr, i13, iArr[i14]);
            i13 += 4;
        }
        this.f13503a.seek(0);
        this.f13503a.write(this.f13508u);
    }

    public final void a(byte[] bArr) throws IOException {
        int i;
        int i10;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    e(length);
                    boolean s10 = s();
                    if (s10) {
                        i = 16;
                    } else {
                        a aVar = this.f13507t;
                        i = R(aVar.f13510a + 4 + aVar.f13511b);
                    }
                    a aVar2 = new a(i, length);
                    T(this.f13508u, 0, length);
                    E(i, this.f13508u, 4);
                    E(i + 4, bArr, length);
                    if (s10) {
                        i10 = i;
                    } else {
                        i10 = this.f13506s.f13510a;
                    }
                    S(this.f13504b, this.f13505c + 1, i10, i);
                    this.f13507t = aVar2;
                    this.f13505c++;
                    if (s10) {
                        this.f13506s = aVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void c() throws IOException {
        S(LZ4Constants.HASH_TABLE_SIZE, 0, 0, 0);
        this.f13505c = 0;
        a aVar = a.f13509c;
        this.f13506s = aVar;
        this.f13507t = aVar;
        if (this.f13504b > 4096) {
            this.f13503a.setLength((long) LZ4Constants.HASH_TABLE_SIZE);
            this.f13503a.getChannel().force(true);
        }
        this.f13504b = LZ4Constants.HASH_TABLE_SIZE;
    }

    public final synchronized void close() throws IOException {
        this.f13503a.close();
    }

    public final void e(int i) throws IOException {
        int i10 = i + 4;
        int O = this.f13504b - O();
        if (O < i10) {
            int i11 = this.f13504b;
            do {
                O += i11;
                i11 <<= 1;
            } while (O < i10);
            this.f13503a.setLength((long) i11);
            this.f13503a.getChannel().force(true);
            a aVar = this.f13507t;
            int R = R(aVar.f13510a + 4 + aVar.f13511b);
            if (R < this.f13506s.f13510a) {
                FileChannel channel = this.f13503a.getChannel();
                channel.position((long) this.f13504b);
                long j10 = (long) (R - 4);
                if (channel.transferTo(16, j10, channel) != j10) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i12 = this.f13507t.f13510a;
            int i13 = this.f13506s.f13510a;
            if (i12 < i13) {
                int i14 = (this.f13504b + i12) - 16;
                S(i11, this.f13505c, i13, i14);
                this.f13507t = new a(i14, this.f13507t.f13511b);
            } else {
                S(i11, this.f13505c, i13, i12);
            }
            this.f13504b = i11;
        }
    }

    public final synchronized void f(c cVar) throws IOException {
        int i = this.f13506s.f13510a;
        for (int i10 = 0; i10 < this.f13505c; i10++) {
            a t10 = t(i);
            ((g) cVar).a(new b(t10), t10.f13511b);
            i = R(t10.f13510a + 4 + t10.f13511b);
        }
    }

    public final synchronized boolean s() {
        return this.f13505c == 0;
    }

    public final a t(int i) throws IOException {
        if (i == 0) {
            return a.f13509c;
        }
        this.f13503a.seek((long) i);
        return new a(i, this.f13503a.readInt());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        f13502v.log(java.util.logging.Level.WARNING, "read error", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<y7.f> r1 = y7.f.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "fileLength="
            r0.append(r1)
            int r1 = r7.f13504b
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r7.f13505c
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            y7.f$a r1 = r7.f13506s
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            y7.f$a r1 = r7.f13507t
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            monitor-enter(r7)     // Catch:{ IOException -> 0x0076 }
            y7.f$a r1 = r7.f13506s     // Catch:{ all -> 0x0073 }
            int r1 = r1.f13510a     // Catch:{ all -> 0x0073 }
            r2 = 0
            r3 = 1
            r4 = r2
        L_0x0048:
            int r5 = r7.f13505c     // Catch:{ all -> 0x0073 }
            if (r4 >= r5) goto L_0x0071
            y7.f$a r1 = r7.t(r1)     // Catch:{ all -> 0x0073 }
            y7.f$b r5 = new y7.f$b     // Catch:{ all -> 0x0073 }
            r5.<init>(r1)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f13511b     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x005b
            r3 = r2
            goto L_0x0060
        L_0x005b:
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x0073 }
        L_0x0060:
            r0.append(r5)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f13510a     // Catch:{ all -> 0x0073 }
            int r5 = r5 + 4
            int r1 = r1.f13511b     // Catch:{ all -> 0x0073 }
            int r5 = r5 + r1
            int r1 = r7.R(r5)     // Catch:{ all -> 0x0073 }
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0071:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0080
        L_0x0073:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            throw r1     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            java.util.logging.Logger r2 = f13502v
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L_0x0080:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.f.toString():java.lang.String");
    }

    public final synchronized void y() throws IOException {
        if (s()) {
            throw new NoSuchElementException();
        } else if (this.f13505c == 1) {
            c();
        } else {
            a aVar = this.f13506s;
            int R = R(aVar.f13510a + 4 + aVar.f13511b);
            B(R, this.f13508u, 0, 4);
            int w6 = w(this.f13508u, 0);
            S(this.f13504b, this.f13505c - 1, R, this.f13507t.f13510a);
            this.f13505c--;
            this.f13506s = new a(R, w6);
        }
    }

    public final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public int f13512a;

        /* renamed from: b  reason: collision with root package name */
        public int f13513b;

        public b(a aVar) {
            this.f13512a = f.this.R(aVar.f13510a + 4);
            this.f13513b = aVar.f13511b;
        }

        public final int read(byte[] bArr, int i, int i10) throws IOException {
            Objects.requireNonNull(bArr, "buffer");
            if ((i | i10) < 0 || i10 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i11 = this.f13513b;
            if (i11 <= 0) {
                return -1;
            }
            if (i10 > i11) {
                i10 = i11;
            }
            f.this.B(this.f13512a, bArr, i, i10);
            this.f13512a = f.this.R(this.f13512a + i10);
            this.f13513b -= i10;
            return i10;
        }

        public final int read() throws IOException {
            if (this.f13513b == 0) {
                return -1;
            }
            f.this.f13503a.seek((long) this.f13512a);
            int read = f.this.f13503a.read();
            this.f13512a = f.this.R(this.f13512a + 1);
            this.f13513b--;
            return read;
        }
    }
}
