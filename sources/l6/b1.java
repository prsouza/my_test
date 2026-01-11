package l6;

import android.util.Base64;
import androidx.appcompat.widget.d;
import bj.a;
import c3.k;
import ci.b;
import e6.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import md.g;
import oe.f;
import wi.c;
import xe.p;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static n0 f7788a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f7789b;

    public static final a a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= 16) {
            return new a((long) byteBuffer.getInt(), (long) byteBuffer.getInt(), (long) byteBuffer.getInt(), (long) byteBuffer.getInt());
        }
        throw new c(wi.a.SegmentationFault, "binary is corrupted");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, wi.b>] */
    public static final HashMap b(ByteBuffer byteBuffer, a aVar) {
        e.D(aVar, "page");
        HashMap hashMap = new HashMap();
        while (byteBuffer.remaining() >= 5) {
            byte b10 = byteBuffer.get() & 255;
            if (wi.e.f12716a.get(Integer.valueOf(b10)) != null) {
                hashMap.put(Integer.valueOf(b10), Long.valueOf((long) byteBuffer.getInt()));
                if (byteBuffer.position() >= ((int) aVar.f3039b)) {
                    return hashMap;
                }
            } else {
                throw new c(wi.a.InvalidEventId, "event id is unknown");
            }
        }
        throw new c(wi.a.SegmentationFault, "binary is corrupt");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        ad.c.z(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final pi.c c(pi.c r4, xe.i r5) {
        /*
            java.lang.String r0 = "crcType"
            e6.e.D(r5, r0)
            p4.b r0 = new p4.b
            r0.<init>()
            p4.c r0 = r0.b(r4)
            int[] r1 = xe.k.f13214b     // Catch:{ all -> 0x003c }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x003c }
            r5 = r1[r5]     // Catch:{ all -> 0x003c }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r5 == r2) goto L_0x002e
            if (r5 == r1) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            r5 = 4
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x003c }
            r5[r3] = r3     // Catch:{ all -> 0x003c }
            r5[r2] = r3     // Catch:{ all -> 0x003c }
            r5[r1] = r3     // Catch:{ all -> 0x003c }
            r1 = 3
            r5[r1] = r3     // Catch:{ all -> 0x003c }
            r0.e(r5)     // Catch:{ all -> 0x003c }
            goto L_0x0037
        L_0x002e:
            byte[] r5 = new byte[r1]     // Catch:{ all -> 0x003c }
            r5[r3] = r3     // Catch:{ all -> 0x003c }
            r5[r2] = r3     // Catch:{ all -> 0x003c }
            r0.e(r5)     // Catch:{ all -> 0x003c }
        L_0x0037:
            r5 = 0
            ad.c.z(r0, r5)
            return r4
        L_0x003c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            ad.c.z(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b1.c(pi.c, xe.i):pi.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        ad.c.z(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final pi.c d(xe.q r4, pi.c r5) {
        /*
            java.lang.String r0 = "$this$endCRC"
            e6.e.D(r4, r0)
            p4.b r0 = new p4.b
            r0.<init>()
            p4.c r0 = r0.b(r5)
            xe.i r4 = r4.f13220c     // Catch:{ all -> 0x003e }
            int[] r1 = xe.k.f13213a     // Catch:{ all -> 0x003e }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x003e }
            r4 = r1[r4]     // Catch:{ all -> 0x003e }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r4 == r2) goto L_0x0030
            if (r4 == r1) goto L_0x0020
            goto L_0x0039
        L_0x0020:
            r4 = 4
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x003e }
            r4[r3] = r3     // Catch:{ all -> 0x003e }
            r4[r2] = r3     // Catch:{ all -> 0x003e }
            r4[r1] = r3     // Catch:{ all -> 0x003e }
            r1 = 3
            r4[r1] = r3     // Catch:{ all -> 0x003e }
            r0.e(r4)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x0030:
            byte[] r4 = new byte[r1]     // Catch:{ all -> 0x003e }
            r4[r3] = r3     // Catch:{ all -> 0x003e }
            r4[r2] = r3     // Catch:{ all -> 0x003e }
            r0.e(r4)     // Catch:{ all -> 0x003e }
        L_0x0039:
            r4 = 0
            ad.c.z(r0, r4)
            return r5
        L_0x003e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r5 = move-exception
            ad.c.z(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b1.d(xe.q, pi.c):pi.c");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, xd.p<xe.p, java.io.OutputStream, java.lang.Object>>] */
    public static final void e(p4.c cVar, int i, p pVar) {
        e.D(pVar, "data");
        xd.p pVar2 = (xd.p) xe.c.f13183a.f13172b.get(Integer.valueOf(i));
        if (pVar2 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            pVar2.invoke(pVar, byteArrayOutputStream);
            cVar.e(byteArrayOutputStream.toByteArray());
        } else if (i == 1) {
            cVar.e(((xe.a) pVar).f13170a);
        } else {
            throw new ic.a("block type is unknown");
        }
    }

    public static final void f(p4.c cVar, URI uri) {
        boolean z;
        e.D(uri, "uri");
        boolean z10 = false;
        try {
            k.J(uri);
            z = true;
        } catch (b unused) {
            z = false;
        }
        if (z) {
            cVar.G0(2);
            cVar.D0(2);
            int[] iArr = new int[2];
            try {
                k.t(uri);
                Matcher matcher = Pattern.compile("^([0-9]+)\\.([0-9]+)$").matcher(uri.getSchemeSpecificPart());
                e.C(matcher, "matcher");
                k.u(matcher);
                String group = matcher.group(1);
                e.C(group, "matcher.group(1)");
                iArr[0] = Integer.parseInt(group);
                try {
                    k.t(uri);
                    Matcher matcher2 = Pattern.compile("^([0-9]+)\\.([0-9]+)$").matcher(uri.getSchemeSpecificPart());
                    e.C(matcher2, "matcher");
                    k.u(matcher2);
                    String group2 = matcher2.group(2);
                    e.C(group2, "matcher.group(2)");
                    iArr[1] = Integer.parseInt(group2);
                    cVar.y0(iArr, 2);
                    cVar.A0();
                } catch (b unused2) {
                    throw new IllegalArgumentException();
                }
            } catch (b unused3) {
                throw new IllegalArgumentException();
            }
        } else if (jc.b.m(uri)) {
            cVar.G0(2);
            cVar.D0(1);
            cVar.D0(0);
            cVar.A0();
        } else {
            try {
                jc.b.i(uri);
                z10 = true;
            } catch (ci.a unused4) {
            }
            if (z10) {
                cVar.G0(2);
                cVar.D0(1);
                cVar.H0(uri.getSchemeSpecificPart());
                cVar.A0();
                return;
            }
            StringBuilder q10 = a.b.q("eid not supported: ");
            q10.append(uri.toASCIIString());
            throw new ic.a(q10.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        ad.c.z(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(xe.f r2, java.io.OutputStream r3) {
        /*
            java.lang.String r0 = "$this$cborMarshal"
            e6.e.D(r2, r0)
            p4.b r0 = new p4.b
            r0.<init>()
            ui.a r1 = new ui.a
            r1.<init>(r3)
            p4.c r0 = r0.b(r1)
            r0.F0()     // Catch:{ all -> 0x003c }
            r0.flush()     // Catch:{ all -> 0x003c }
            xe.q r1 = r2.f13195a     // Catch:{ all -> 0x003c }
            i(r1, r3)     // Catch:{ all -> 0x003c }
            java.util.List<xe.j> r2 = r2.f13196b     // Catch:{ all -> 0x003c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x003c }
        L_0x0024:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x003c }
            xe.j r1 = (xe.j) r1     // Catch:{ all -> 0x003c }
            h(r1, r3)     // Catch:{ all -> 0x003c }
            goto L_0x0024
        L_0x0034:
            r0.A0()     // Catch:{ all -> 0x003c }
            r2 = 0
            ad.c.z(r0, r2)
            return
        L_0x003c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r3 = move-exception
            ad.c.z(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b1.g(xe.f, java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        ad.c.z(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(xe.j r6, java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "$this$cborMarshal"
            e6.e.D(r6, r0)
            xe.i r0 = r6.f13211d
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0025
            r1 = 1
            if (r0 == r1) goto L_0x001f
            r1 = 2
            if (r0 != r1) goto L_0x0019
            pi.b r0 = new pi.b
            r0.<init>()
            goto L_0x002a
        L_0x0019:
            md.e r6 = new md.e
            r6.<init>()
            throw r6
        L_0x001f:
            pi.a r0 = new pi.a
            r0.<init>()
            goto L_0x002a
        L_0x0025:
            pi.g r0 = new pi.g
            r0.<init>()
        L_0x002a:
            ui.b r1 = new ui.b
            r1.<init>(r0, r7)
            p4.b r7 = new p4.b
            r7.<init>()
            p4.c r7 = r7.b(r1)
            r1 = 0
            xe.i r2 = r6.f13211d     // Catch:{ all -> 0x007e }
            xe.i r3 = xe.i.NoCRC     // Catch:{ all -> 0x007e }
            if (r2 != r3) goto L_0x0041
            r2 = 5
            goto L_0x0042
        L_0x0041:
            r2 = 6
        L_0x0042:
            r7.G0(r2)     // Catch:{ all -> 0x007e }
            int r2 = r6.f13208a     // Catch:{ all -> 0x007e }
            r7.D0(r2)     // Catch:{ all -> 0x007e }
            int r2 = r6.f13209b     // Catch:{ all -> 0x007e }
            r7.D0(r2)     // Catch:{ all -> 0x007e }
            long r4 = r6.f13210c     // Catch:{ all -> 0x007e }
            r7.E0(r4)     // Catch:{ all -> 0x007e }
            xe.i r2 = r6.f13211d     // Catch:{ all -> 0x007e }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x007e }
            r7.D0(r2)     // Catch:{ all -> 0x007e }
            int r2 = r6.f13208a     // Catch:{ all -> 0x007e }
            xe.p r4 = r6.f13212e     // Catch:{ all -> 0x007e }
            e(r7, r2, r4)     // Catch:{ all -> 0x007e }
            xe.i r2 = r6.f13211d     // Catch:{ all -> 0x007e }
            if (r2 == r3) goto L_0x0077
            r7.flush()     // Catch:{ all -> 0x007e }
            xe.i r6 = r6.f13211d     // Catch:{ all -> 0x007e }
            c(r0, r6)     // Catch:{ all -> 0x007e }
            byte[] r6 = r0.a()     // Catch:{ all -> 0x007e }
            r7.e(r6)     // Catch:{ all -> 0x007e }
        L_0x0077:
            r7.A0()     // Catch:{ all -> 0x007e }
            ad.c.z(r7, r1)
            return
        L_0x007e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            ad.c.z(r7, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b1.h(xe.j, java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        ad.c.z(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(xe.q r8, java.io.OutputStream r9) {
        /*
            java.lang.String r0 = "$this$cborMarshal"
            e6.e.D(r8, r0)
            xe.i r0 = r8.f13220c
            int r0 = r0.ordinal()
            r1 = 2
            if (r0 == 0) goto L_0x0025
            r2 = 1
            if (r0 == r2) goto L_0x001f
            if (r0 != r1) goto L_0x0019
            pi.b r0 = new pi.b
            r0.<init>()
            goto L_0x002a
        L_0x0019:
            md.e r8 = new md.e
            r8.<init>()
            throw r8
        L_0x001f:
            pi.a r0 = new pi.a
            r0.<init>()
            goto L_0x002a
        L_0x0025:
            pi.g r0 = new pi.g
            r0.<init>()
        L_0x002a:
            ui.b r2 = new ui.b
            r2.<init>(r0, r9)
            p4.b r9 = new p4.b
            r9.<init>()
            p4.c r9 = r9.b(r2)
            r2 = 0
            r3 = 8
            xe.i r4 = r8.f13220c     // Catch:{ all -> 0x00b2 }
            xe.i r5 = xe.i.NoCRC     // Catch:{ all -> 0x00b2 }
            if (r4 == r5) goto L_0x0043
            r3 = 9
        L_0x0043:
            long r6 = r8.f13219b     // Catch:{ all -> 0x00b2 }
            r4 = 0
            boolean r6 = ui.c.b(r6, r4)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x004e
            int r3 = r3 + 2
        L_0x004e:
            r9.G0(r3)     // Catch:{ all -> 0x00b2 }
            int r3 = r8.f13218a     // Catch:{ all -> 0x00b2 }
            r9.D0(r3)     // Catch:{ all -> 0x00b2 }
            long r6 = r8.f13219b     // Catch:{ all -> 0x00b2 }
            r9.E0(r6)     // Catch:{ all -> 0x00b2 }
            xe.i r3 = r8.f13220c     // Catch:{ all -> 0x00b2 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x00b2 }
            r9.D0(r3)     // Catch:{ all -> 0x00b2 }
            java.net.URI r3 = r8.f13221d     // Catch:{ all -> 0x00b2 }
            f(r9, r3)     // Catch:{ all -> 0x00b2 }
            java.net.URI r3 = r8.f13222e     // Catch:{ all -> 0x00b2 }
            f(r9, r3)     // Catch:{ all -> 0x00b2 }
            java.net.URI r3 = r8.f13223f     // Catch:{ all -> 0x00b2 }
            f(r9, r3)     // Catch:{ all -> 0x00b2 }
            r9.G0(r1)     // Catch:{ all -> 0x00b2 }
            long r6 = r8.g     // Catch:{ all -> 0x00b2 }
            r9.E0(r6)     // Catch:{ all -> 0x00b2 }
            long r6 = r8.f13224h     // Catch:{ all -> 0x00b2 }
            r9.E0(r6)     // Catch:{ all -> 0x00b2 }
            r9.A0()     // Catch:{ all -> 0x00b2 }
            long r6 = r8.i     // Catch:{ all -> 0x00b2 }
            r9.E0(r6)     // Catch:{ all -> 0x00b2 }
            long r6 = r8.f13219b     // Catch:{ all -> 0x00b2 }
            boolean r1 = ui.c.b(r6, r4)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x009a
            long r3 = r8.f13225j     // Catch:{ all -> 0x00b2 }
            r9.E0(r3)     // Catch:{ all -> 0x00b2 }
            long r3 = r8.f13226k     // Catch:{ all -> 0x00b2 }
            r9.E0(r3)     // Catch:{ all -> 0x00b2 }
        L_0x009a:
            xe.i r1 = r8.f13220c     // Catch:{ all -> 0x00b2 }
            if (r1 == r5) goto L_0x00ab
            r9.flush()     // Catch:{ all -> 0x00b2 }
            d(r8, r0)     // Catch:{ all -> 0x00b2 }
            byte[] r8 = r0.a()     // Catch:{ all -> 0x00b2 }
            r9.e(r8)     // Catch:{ all -> 0x00b2 }
        L_0x00ab:
            r9.A0()     // Catch:{ all -> 0x00b2 }
            ad.c.z(r9, r2)
            return
        L_0x00b2:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            ad.c.z(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b1.i(xe.q, java.io.OutputStream):void");
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static final Object k(Throwable th2) {
        e.D(th2, "exception");
        return new g.a(th2);
    }

    public static final oe.a l(re.b bVar, qe.a aVar, String str) {
        String str2;
        e.D(bVar, "$this$findPolymorphicSerializer");
        oe.a u02 = aVar.p().u0(bVar.c(), str);
        if (u02 != null) {
            return u02;
        }
        de.b c10 = bVar.c();
        e.D(c10, "baseClass");
        String str3 = "in the scope of '" + c10.a() + '\'';
        if (str == null) {
            str2 = a8.a.c("Class discriminator was missing and no default polymorphic serializers were registered ", str3);
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\n" + "Mark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new f(str2);
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 562949953421311L;
        jArr2[1] = ((j10 >>> 49) ^ (j11 << 15)) & 562949953421311L;
        jArr2[2] = ((j11 >>> 34) ^ (j12 << 30)) & 562949953421311L;
        jArr2[3] = (j12 >>> 19) ^ (j13 << 45);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m(jArr, jArr4);
        m(jArr2, jArr5);
        long[] jArr6 = jArr3;
        o(jArr4[0], jArr5[0], jArr6, 0);
        o(jArr4[1], jArr5[1], jArr6, 1);
        o(jArr4[2], jArr5[2], jArr6, 2);
        o(jArr4[3], jArr5[3], jArr6, 3);
        int i = 5;
        while (i > 0) {
            int i10 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i10];
            i = i10;
        }
        o(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        o(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[1] ^ jArr5[3];
        o(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr7 = new long[3];
        o(j10, j12, jArr7, 0);
        o(j11, j13, jArr7, 1);
        long j14 = jArr7[0];
        long j15 = jArr7[1];
        long j16 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j14;
        jArr3[3] = (j14 ^ j15) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j16 ^ j15);
        jArr3[5] = jArr3[5] ^ j16;
        long j17 = jArr3[0];
        long j18 = jArr3[1];
        long j19 = jArr3[2];
        long j20 = jArr3[3];
        long j21 = jArr3[4];
        long j22 = jArr3[5];
        long j23 = jArr3[6];
        long j24 = jArr3[7];
        jArr3[0] = j17 ^ (j18 << 49);
        jArr3[1] = (j18 >>> 15) ^ (j19 << 34);
        jArr3[2] = (j19 >>> 30) ^ (j20 << 19);
        jArr3[3] = ((j20 >>> 45) ^ (j21 << 4)) ^ (j22 << 53);
        jArr3[4] = ((j21 >>> 60) ^ (j23 << 38)) ^ (j22 >>> 11);
        jArr3[5] = (j23 >>> 26) ^ (j24 << 23);
        jArr3[6] = j24 >>> 41;
        jArr3[7] = 0;
    }

    public static void o(long j10, long j11, long[] jArr, int i) {
        long j12 = j10;
        long[] jArr2 = new long[8];
        jArr2[1] = j11;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j11;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j11;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j11;
        int i10 = (int) j12;
        long j13 = (jArr2[(i10 >>> 3) & 7] << 3) ^ jArr2[i10 & 7];
        long j14 = 0;
        int i11 = 36;
        do {
            int i12 = (int) (j12 >>> i11);
            long j15 = (((jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3)) ^ (jArr2[(i12 >>> 6) & 7] << 6)) ^ (jArr2[(i12 >>> 9) & 7] << 9)) ^ (jArr2[(i12 >>> 12) & 7] << 12);
            j13 ^= j15 << i11;
            j14 ^= j15 >>> (-i11);
            i11 -= 15;
        } while (i11 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j13);
        int i13 = i + 1;
        jArr[i13] = jArr[i13] ^ ((j13 >>> 49) ^ (j14 << 15));
    }

    public static void p(long[] jArr, long[] jArr2) {
        e.L(jArr[0], jArr2, 0);
        e.L(jArr[1], jArr2, 2);
        e.L(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static String q(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    str2 = sb4.toString();
                }
            }
            objArr[i10] = str2;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb5.append(str, i11, indexOf);
            sb5.append(objArr[i]);
            i11 = indexOf + 2;
            i++;
        }
        sb5.append(str, i11, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final long r(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        n(jArr, jArr2, jArr4);
        u(jArr4, jArr3);
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        n(jArr, jArr2, jArr4);
        j(jArr3, jArr4, jArr3);
    }

    public static void u(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = j14 ^ (j16 >>> 50);
        long j18 = (j13 ^ ((j16 >>> 1) ^ (j16 << 14))) ^ (j15 >>> 50);
        long j19 = j10 ^ (j17 << 63);
        long j20 = (j11 ^ (j15 << 63)) ^ ((j17 >>> 1) ^ (j17 << 14));
        long j21 = ((j12 ^ (j16 << 63)) ^ ((j15 >>> 1) ^ (j15 << 14))) ^ (j17 >>> 50);
        long j22 = j18 >>> 1;
        jArr2[0] = (j19 ^ j22) ^ (j22 << 15);
        jArr2[1] = (j22 >>> 49) ^ j20;
        jArr2[2] = j21;
        jArr2[3] = 1 & j18;
    }

    public static void v(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        p(jArr, jArr3);
        while (true) {
            u(jArr3, jArr2);
            i--;
            if (i > 0) {
                p(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final void w(Object obj) {
        if (obj instanceof g.a) {
            throw ((g.a) obj).f8543a;
        }
    }

    public static String x(String str, String str2) {
        return d.b(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public static String y(List list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable unused) {
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    public static String z(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        h1.e.b(sb2, str, ":", str2, ":");
        sb2.append(str3);
        return sb2.toString();
    }
}
