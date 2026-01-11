package p3;

import j3.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class w extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public volatile byte[] f9638a;

    /* renamed from: b  reason: collision with root package name */
    public int f9639b;

    /* renamed from: c  reason: collision with root package name */
    public int f9640c;

    /* renamed from: s  reason: collision with root package name */
    public int f9641s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f9642t;

    /* renamed from: u  reason: collision with root package name */
    public final b f9643u;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public w(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f9643u = bVar;
        this.f9638a = (byte[]) bVar.d(LZ4Constants.MAX_DISTANCE, byte[].class);
    }

    public static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i10 = this.f9641s;
        if (i10 == -1 || this.f9642t - i10 >= (i = this.f9640c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f9641s = -1;
                this.f9642t = 0;
                this.f9639b = read;
            }
            return read;
        }
        if (i10 == 0 && i > bArr.length && this.f9639b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f9643u.d(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f9638a = bArr2;
            this.f9643u.c(bArr);
            bArr = bArr2;
        } else if (i10 > 0) {
            System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
        }
        int i11 = this.f9642t - this.f9641s;
        this.f9642t = i11;
        this.f9641s = 0;
        this.f9639b = 0;
        int read2 = inputStream.read(bArr, i11, bArr.length - i11);
        int i12 = this.f9642t;
        if (read2 > 0) {
            i12 += read2;
        }
        this.f9639b = i12;
        return read2;
    }

    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f9638a == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f9639b - this.f9642t) + inputStream.available();
    }

    public final void close() throws IOException {
        if (this.f9638a != null) {
            this.f9643u.c(this.f9638a);
            this.f9638a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void mark(int i) {
        this.f9640c = Math.max(this.f9640c, i);
        this.f9641s = this.f9642t;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0019=Splitter:B:11:0x0019, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f9638a     // Catch:{ all -> 0x003d }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r3 = r6.f9642t     // Catch:{ all -> 0x003d }
            int r4 = r6.f9639b     // Catch:{ all -> 0x003d }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003d }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f9638a     // Catch:{ all -> 0x003d }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f9638a     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            c()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x0026:
            int r1 = r6.f9639b     // Catch:{ all -> 0x003d }
            int r2 = r6.f9642t     // Catch:{ all -> 0x003d }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r6.f9642t = r1     // Catch:{ all -> 0x003d }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003d }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0037:
            monitor-exit(r6)
            return r5
        L_0x0039:
            c()     // Catch:{ all -> 0x003d }
            throw r2     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.w.read():int");
    }

    public final synchronized void release() {
        if (this.f9638a != null) {
            this.f9643u.c(this.f9638a);
            this.f9638a = null;
        }
    }

    public final synchronized void reset() throws IOException {
        if (this.f9638a != null) {
            int i = this.f9641s;
            if (-1 != i) {
                this.f9642t = i;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f9642t + " markLimit: " + this.f9640c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0;
        }
        byte[] bArr = this.f9638a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i = this.f9639b;
                int i10 = this.f9642t;
                if (((long) (i - i10)) >= j10) {
                    this.f9642t = (int) (((long) i10) + j10);
                    return j10;
                }
                long j11 = ((long) i) - ((long) i10);
                this.f9642t = i;
                if (this.f9641s == -1 || j10 > ((long) this.f9640c)) {
                    long skip = inputStream.skip(j10 - j11);
                    if (skip > 0) {
                        this.f9641s = -1;
                    }
                    return j11 + skip;
                } else if (a(inputStream, bArr) == -1) {
                    return j11;
                } else {
                    int i11 = this.f9639b;
                    int i12 = this.f9642t;
                    if (((long) (i11 - i12)) >= j10 - j11) {
                        this.f9642t = (int) ((((long) i12) + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + ((long) i11)) - ((long) i12);
                    this.f9642t = i11;
                    return j12;
                }
            } else {
                c();
                throw null;
            }
        } else {
            c();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0048, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            byte[] r0 = r7.f9638a     // Catch:{ all -> 0x008e }
            r1 = 0
            if (r0 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x000b
            r8 = 0
            monitor-exit(r7)
            return r8
        L_0x000b:
            java.io.InputStream r2 = r7.in     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0086
            int r3 = r7.f9642t     // Catch:{ all -> 0x008e }
            int r4 = r7.f9639b     // Catch:{ all -> 0x008e }
            if (r3 >= r4) goto L_0x0033
            int r5 = r4 - r3
            if (r5 < r10) goto L_0x001b
            r4 = r10
            goto L_0x001c
        L_0x001b:
            int r4 = r4 - r3
        L_0x001c:
            java.lang.System.arraycopy(r0, r3, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r3 = r7.f9642t     // Catch:{ all -> 0x008e }
            int r3 = r3 + r4
            r7.f9642t = r3     // Catch:{ all -> 0x008e }
            if (r4 == r10) goto L_0x0031
            int r3 = r2.available()     // Catch:{ all -> 0x008e }
            if (r3 != 0) goto L_0x002d
            goto L_0x0031
        L_0x002d:
            int r9 = r9 + r4
            int r3 = r10 - r4
            goto L_0x0034
        L_0x0031:
            monitor-exit(r7)
            return r4
        L_0x0033:
            r3 = r10
        L_0x0034:
            int r4 = r7.f9641s     // Catch:{ all -> 0x008e }
            r5 = -1
            if (r4 != r5) goto L_0x0049
            int r4 = r0.length     // Catch:{ all -> 0x008e }
            if (r3 < r4) goto L_0x0049
            int r4 = r2.read(r8, r9, r3)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0076
            if (r3 != r10) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            int r5 = r10 - r3
        L_0x0047:
            monitor-exit(r7)
            return r5
        L_0x0049:
            int r4 = r7.a(r2, r0)     // Catch:{ all -> 0x008e }
            if (r4 != r5) goto L_0x0056
            if (r3 != r10) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            int r5 = r10 - r3
        L_0x0054:
            monitor-exit(r7)
            return r5
        L_0x0056:
            byte[] r4 = r7.f9638a     // Catch:{ all -> 0x008e }
            if (r0 == r4) goto L_0x0063
            byte[] r0 = r7.f9638a     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            c()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x0063:
            int r4 = r7.f9639b     // Catch:{ all -> 0x008e }
            int r5 = r7.f9642t     // Catch:{ all -> 0x008e }
            int r6 = r4 - r5
            if (r6 < r3) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            int r4 = r4 - r5
        L_0x006e:
            java.lang.System.arraycopy(r0, r5, r8, r9, r4)     // Catch:{ all -> 0x008e }
            int r5 = r7.f9642t     // Catch:{ all -> 0x008e }
            int r5 = r5 + r4
            r7.f9642t = r5     // Catch:{ all -> 0x008e }
        L_0x0076:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x007b
            monitor-exit(r7)
            return r10
        L_0x007b:
            int r5 = r2.available()     // Catch:{ all -> 0x008e }
            if (r5 != 0) goto L_0x0084
            int r10 = r10 - r3
            monitor-exit(r7)
            return r10
        L_0x0084:
            int r9 = r9 + r4
            goto L_0x0034
        L_0x0086:
            c()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008a:
            c()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x008e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.w.read(byte[], int, int):int");
    }
}
