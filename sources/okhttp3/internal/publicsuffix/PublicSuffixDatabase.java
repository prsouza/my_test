package okhttp3.internal.publicsuffix;

import a.b;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import fe.o;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.c;
import nd.m;
import org.slf4j.Marker;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f9459e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f9460f = b.n0(Marker.ANY_MARKER);
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* renamed from: h  reason: collision with root package name */
    public static final a f9461h = new a();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f9462a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f9463b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f9464c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f9465d;

    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i) {
            int i10;
            boolean z;
            byte b10;
            int i11;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            a aVar = PublicSuffixDatabase.f9461h;
            int length = bArr3.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr3[i13] != ((byte) 10)) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i10 = i14 + i15;
                    if (bArr3[i10] == ((byte) 10)) {
                        break;
                    }
                    i15++;
                }
                int i16 = i10 - i14;
                int i17 = i;
                boolean z10 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z10) {
                        b10 = 46;
                        z = false;
                    } else {
                        byte b11 = bArr4[i17][i18];
                        byte[] bArr5 = c.f7250a;
                        byte b12 = b11 & 255;
                        z = z10;
                        b10 = b12;
                    }
                    byte b13 = bArr3[i14 + i19];
                    byte[] bArr6 = c.f7250a;
                    i11 = b10 - (b13 & 255);
                    if (i11 == 0) {
                        i19++;
                        i18++;
                        if (i19 == i16) {
                            break;
                        } else if (bArr4[i17].length != i18) {
                            z10 = z;
                        } else if (i17 == bArr4.length - 1) {
                            break;
                        } else {
                            i17++;
                            i18 = -1;
                            z10 = true;
                        }
                    } else {
                        break;
                    }
                }
                if (i11 >= 0) {
                    if (i11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr4[i17].length - i18;
                        int length3 = bArr4.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr4[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                e.C(charset, "UTF_8");
                                return new String(bArr3, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i10 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != false) goto L_0x0035;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            java.lang.String r1 = "unicodeDomain"
            e6.e.C(r0, r1)
            java.util.List r0 = r12.c(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f9462a
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x004c
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f9462a
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x004c
            r1 = r3
        L_0x0020:
            r12.b()     // Catch:{ InterruptedIOException -> 0x003d, IOException -> 0x0028 }
            if (r1 == 0) goto L_0x0059
            goto L_0x0035
        L_0x0026:
            r13 = move-exception
            goto L_0x0042
        L_0x0028:
            r4 = move-exception
            qf.h$a r5 = qf.h.f10446c     // Catch:{ all -> 0x0026 }
            qf.h r5 = qf.h.f10444a     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Failed to read public suffix list"
            r7 = 5
            r5.i(r6, r7, r4)     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0059
        L_0x0035:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x0059
        L_0x003d:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0026 }
            r1 = r2
            goto L_0x0020
        L_0x0042:
            if (r1 == 0) goto L_0x004b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004b:
            throw r13
        L_0x004c:
            java.util.concurrent.CountDownLatch r1 = r12.f9463b     // Catch:{ InterruptedException -> 0x0052 }
            r1.await()     // Catch:{ InterruptedException -> 0x0052 }
            goto L_0x0059
        L_0x0052:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0059:
            byte[] r1 = r12.f9464c
            if (r1 == 0) goto L_0x005f
            r1 = r2
            goto L_0x0060
        L_0x005f:
            r1 = r3
        L_0x0060:
            if (r1 == 0) goto L_0x01cf
            int r1 = r0.size()
            byte[][] r4 = new byte[r1][]
            r5 = r3
        L_0x0069:
            if (r5 >= r1) goto L_0x008b
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = "UTF_8"
            e6.e.C(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r6, r8)
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r7 = "(this as java.lang.String).getBytes(charset)"
            e6.e.C(r6, r7)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0069
        L_0x008b:
            r5 = r3
        L_0x008c:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x00a3
            byte[] r8 = r12.f9464c
            if (r8 == 0) goto L_0x009f
            java.lang.String r8 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r8, r4, r5)
            if (r8 == 0) goto L_0x009c
            goto L_0x00a4
        L_0x009c:
            int r5 = r5 + 1
            goto L_0x008c
        L_0x009f:
            e6.e.c0(r6)
            throw r7
        L_0x00a3:
            r8 = r7
        L_0x00a4:
            if (r1 <= r2) goto L_0x00c7
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r2
            r10 = r3
        L_0x00af:
            if (r10 >= r9) goto L_0x00c7
            byte[] r11 = f9459e
            r5[r10] = r11
            byte[] r11 = r12.f9464c
            if (r11 == 0) goto L_0x00c3
            java.lang.String r11 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r11, r5, r10)
            if (r11 == 0) goto L_0x00c0
            goto L_0x00c8
        L_0x00c0:
            int r10 = r10 + 1
            goto L_0x00af
        L_0x00c3:
            e6.e.c0(r6)
            throw r7
        L_0x00c7:
            r11 = r7
        L_0x00c8:
            if (r11 == 0) goto L_0x00e2
            int r1 = r1 - r2
            r5 = r3
        L_0x00cc:
            if (r5 >= r1) goto L_0x00e2
            byte[] r6 = r12.f9465d
            if (r6 == 0) goto L_0x00dc
            java.lang.String r6 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a.a(r6, r4, r5)
            if (r6 == 0) goto L_0x00d9
            goto L_0x00e3
        L_0x00d9:
            int r5 = r5 + 1
            goto L_0x00cc
        L_0x00dc:
            java.lang.String r13 = "publicSuffixExceptionListBytes"
            e6.e.c0(r13)
            throw r7
        L_0x00e2:
            r6 = r7
        L_0x00e3:
            r1 = 46
            r4 = 33
            if (r6 == 0) goto L_0x0101
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            char[] r6 = new char[r2]
            r6[r3] = r1
            java.util.List r1 = fe.o.x1(r5, r6)
            goto L_0x012d
        L_0x0101:
            if (r8 != 0) goto L_0x0108
            if (r11 != 0) goto L_0x0108
            java.util.List<java.lang.String> r1 = f9460f
            goto L_0x012d
        L_0x0108:
            if (r8 == 0) goto L_0x0113
            char[] r5 = new char[r2]
            r5[r3] = r1
            java.util.List r5 = fe.o.x1(r8, r5)
            goto L_0x0115
        L_0x0113:
            nd.o r5 = nd.o.f8966a
        L_0x0115:
            if (r11 == 0) goto L_0x0120
            char[] r6 = new char[r2]
            r6[r3] = r1
            java.util.List r1 = fe.o.x1(r11, r6)
            goto L_0x0122
        L_0x0120:
            nd.o r1 = nd.o.f8966a
        L_0x0122:
            int r6 = r5.size()
            int r8 = r1.size()
            if (r6 <= r8) goto L_0x012d
            r1 = r5
        L_0x012d:
            int r5 = r0.size()
            int r6 = r1.size()
            if (r5 != r6) goto L_0x0144
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r3)
            if (r5 == r4) goto L_0x0144
            return r7
        L_0x0144:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            char r5 = r5.charAt(r3)
            if (r5 != r4) goto L_0x0159
            int r0 = r0.size()
            int r1 = r1.size()
            goto L_0x0162
        L_0x0159:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + r2
        L_0x0162:
            int r0 = r0 - r1
            java.util.List r13 = r12.c(r13)
            nd.k r1 = new nd.k
            r1.<init>(r13)
            if (r0 < 0) goto L_0x0170
            r13 = r2
            goto L_0x0171
        L_0x0170:
            r13 = r3
        L_0x0171:
            if (r13 == 0) goto L_0x01bd
            if (r0 != 0) goto L_0x0176
            goto L_0x0187
        L_0x0176:
            boolean r13 = r1 instanceof ee.c
            if (r13 == 0) goto L_0x0181
            ee.c r1 = (ee.c) r1
            ee.d r1 = r1.a(r0)
            goto L_0x0187
        L_0x0181:
            ee.b r13 = new ee.b
            r13.<init>(r1, r0)
            r1 = r13
        L_0x0187:
            java.lang.String r13 = ""
            java.lang.String r0 = "<this>"
            e6.e.D(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.util.Iterator r1 = r1.iterator()
        L_0x019a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01b0
            java.lang.Object r4 = r1.next()
            int r3 = r3 + r2
            if (r3 <= r2) goto L_0x01ac
            java.lang.String r5 = "."
            r0.append(r5)
        L_0x01ac:
            a.b.E(r0, r4, r7)
            goto L_0x019a
        L_0x01b0:
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "joinTo(StringBuilder(), …ed, transform).toString()"
            e6.e.C(r13, r0)
            return r13
        L_0x01bd:
            java.lang.String r13 = "Requested element count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r13 = a8.a.b(r13, r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L_0x01cf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        ad.c.z(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() throws java.io.IOException {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0049
            uf.m r1 = new uf.m
            uf.b0 r0 = uf.p.e(r0)
            r1.<init>(r0)
            uf.h r0 = uf.p.b(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r2 = (long) r2     // Catch:{ all -> 0x0042 }
            byte[] r2 = r0.L(r2)     // Catch:{ all -> 0x0042 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0042 }
            long r3 = (long) r3     // Catch:{ all -> 0x0042 }
            byte[] r3 = r0.L(r3)     // Catch:{ all -> 0x0042 }
            ad.c.z(r0, r1)
            monitor-enter(r5)
            e6.e.B(r2)     // Catch:{ all -> 0x003f }
            r5.f9464c = r2     // Catch:{ all -> 0x003f }
            e6.e.B(r3)     // Catch:{ all -> 0x003f }
            r5.f9465d = r3     // Catch:{ all -> 0x003f }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.f9463b
            r0.countDown()
            return
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            ad.c.z(r0, r1)
            throw r2
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.b():void");
    }

    public final List<String> c(String str) {
        int i = 0;
        List<String> x12 = o.x1(str, new char[]{'.'});
        if (!e.r((String) m.c1(x12), BuildConfig.FLAVOR)) {
            return x12;
        }
        int size = x12.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (!(size >= 0)) {
            throw new IllegalArgumentException(a8.a.b("Requested element count ", size, " is less than zero.").toString());
        } else if (size == 0) {
            return nd.o.f8966a;
        } else {
            if (size >= x12.size()) {
                return m.j1(x12);
            }
            if (size == 1) {
                return b.n0(m.X0(x12));
            }
            ArrayList arrayList = new ArrayList(size);
            Iterator<T> it = x12.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i++;
                if (i == size) {
                    break;
                }
            }
            return b.w0(arrayList);
        }
    }
}
