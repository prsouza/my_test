package e6;

import ag.n;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import androidx.fragment.app.o;
import b.i;
import c3.k;
import ca.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d0.a;
import dc.e;
import dd.c;
import de.b;
import ed.g;
import ed.m;
import f0.f;
import io.nodle.cash.R;
import java.math.BigInteger;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import le.x;
import pa.a;
import qc.a;
import rc.c;
import rc.g;
import rc.h;
import xd.p;
import yd.v;
import zb.r;

public class e implements d, a, a.C0200a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4643a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4644b = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4645c = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f4646s = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f4647t = {16843173, 16843551, 16844359, R.attr.alpha, R.attr.lStar};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f4648u = {R.attr.fontProviderAuthority, R.attr.fontProviderCerts, R.attr.fontProviderFetchStrategy, R.attr.fontProviderFetchTimeout, R.attr.fontProviderPackage, R.attr.fontProviderQuery, R.attr.fontProviderSystemFontFamily};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f4649v = {16844082, 16844083, 16844095, 16844143, 16844144, R.attr.font, R.attr.fontStyle, R.attr.fontVariationSettings, R.attr.fontWeight, R.attr.ttcIndex};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f4650w = {16843165, 16843166, 16843169, 16843170, 16843171, 16843172, 16843265, 16843275, 16844048, 16844049, 16844050, 16844051};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f4651x = {16843173, 16844052};

    /* renamed from: y  reason: collision with root package name */
    public static final e f4652y = new e();

    public static void A(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a8.a.c(str, " must not be null"));
            W(illegalStateException, e.class.getName());
            throw illegalStateException;
        }
    }

    public static void B(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            W(nullPointerException, e.class.getName());
            throw nullPointerException;
        }
    }

    public static void C(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(a8.a.c(str, " must not be null"));
            W(nullPointerException, e.class.getName());
            throw nullPointerException;
        }
    }

    public static void D(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(G(str));
            W(nullPointerException, e.class.getName());
            throw nullPointerException;
        }
    }

    public static void E(Object obj, String str) {
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(G(str));
            W(illegalArgumentException, e.class.getName());
            throw illegalArgumentException;
        }
    }

    public static int F(int i, int i10) {
        if (i < i10) {
            return -1;
        }
        return i == i10 ? 0 : 1;
    }

    public static String G(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static float H(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot((double) (f12 - f10), (double) (f13 - f11));
    }

    public static c I(dd.d dVar, b bVar) {
        return new c(new ed.a(aa.b.G(bVar)), dVar, null);
    }

    public static c J(dd.d dVar, android.support.v4.media.b[] bVarArr) {
        return new c(new m(bVarArr), dVar, null);
    }

    public static long K(int i) {
        int i10 = ((i >>> 8) ^ i) & 65280;
        int i11 = i ^ (i10 ^ (i10 << 8));
        int i12 = ((i11 >>> 4) ^ i11) & 15728880;
        int i13 = i11 ^ (i12 ^ (i12 << 4));
        int i14 = ((i13 >>> 2) ^ i13) & 202116108;
        int i15 = i13 ^ (i14 ^ (i14 << 2));
        int i16 = ((i15 >>> 1) ^ i15) & 572662306;
        int i17 = i15 ^ (i16 ^ (i16 << 1));
        return ((((long) (i17 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i17));
    }

    public static void L(long j10, long[] jArr, int i) {
        long j11 = ((j10 >>> 16) ^ j10) & 4294901760L;
        long j12 = j10 ^ (j11 ^ (j11 << 16));
        long j13 = ((j12 >>> 8) ^ j12) & 280375465148160L;
        long j14 = j12 ^ (j13 ^ (j13 << 8));
        long j15 = ((j14 >>> 4) ^ j14) & 67555025218437360L;
        long j16 = j14 ^ (j15 ^ (j15 << 4));
        long j17 = ((j16 >>> 2) ^ j16) & 868082074056920076L;
        long j18 = j16 ^ (j17 ^ (j17 << 2));
        long j19 = ((j18 >>> 1) ^ j18) & 2459565876494606882L;
        long j20 = j18 ^ (j19 ^ (j19 << 1));
        jArr[i] = j20 & 6148914691236517205L;
        jArr[i + 1] = (j20 >>> 1) & 6148914691236517205L;
    }

    public static n N(String str) {
        if (str.equals("SHA-256")) {
            return fg.a.f5123a;
        }
        if (str.equals("SHA-512")) {
            return fg.a.f5125c;
        }
        if (str.equals("SHAKE128")) {
            return fg.a.g;
        }
        if (str.equals("SHAKE256")) {
            return fg.a.f5129h;
        }
        throw new IllegalArgumentException(a8.a.c("unrecognized digest: ", str));
    }

    public static int P(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static final Iterator Q(Object[] objArr) {
        D(objArr, "array");
        return new yd.a(objArr);
    }

    public static float R(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    public static final void S(Context context, String str) {
        D(context, "cxt");
        if (!(str == null || str.length() == 0)) {
            Resources resources = context.getResources();
            ThreadLocal<TypedValue> threadLocal = f.f4887a;
            Integer valueOf = Integer.valueOf(resources.getColor(R.color.backgroundV2, (Resources.Theme) null) | -16777216);
            Intent intent = new Intent("android.intent.action.VIEW");
            Bundle bundle = new Bundle();
            if (valueOf != null) {
                bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
            }
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtras(bundle);
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            intent.setData(Uri.parse(str));
            Object obj = d0.a.f4256a;
            a.C0057a.b(context, intent, (Bundle) null);
        }
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        android.support.v4.media.b.p1(iArr, iArr2, iArr4);
        U(iArr4, iArr3);
    }

    public static void U(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) 977) & 4294967295L;
        long j11 = ((long) iArr[8]) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j12;
        long j13 = ((long) iArr[9]) & 4294967295L;
        long j14 = (j10 * j13) + j11 + (((long) iArr[1]) & 4294967295L) + (j12 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[10]) & 4294967295L;
        long j16 = (j10 * j15) + j13 + (((long) iArr[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[11]) & 4294967295L;
        long j18 = j10;
        long j19 = (j10 * j17) + j15 + (((long) iArr[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = ((long) iArr[12]) & 4294967295L;
        long j21 = (j18 * j20) + j17 + (((long) iArr[4]) & 4294967295L) + (j19 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = ((long) iArr[13]) & 4294967295L;
        long j23 = (j18 * j22) + j20 + (((long) iArr[5]) & 4294967295L) + (j21 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = ((long) iArr[14]) & 4294967295L;
        long j25 = (j18 * j24) + j22 + (((long) iArr[6]) & 4294967295L) + (j23 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = j25 >>> 32;
        long j27 = ((long) iArr[15]) & 4294967295L;
        long j28 = (j18 * j27) + j24 + (((long) iArr[7]) & 4294967295L) + j26;
        iArr3[7] = (int) j28;
        long j29 = (j28 >>> 32) + j27;
        long j30 = j29 & 4294967295L;
        long j31 = (j18 * j30) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j31;
        long j32 = j29 >>> 32;
        long j33 = (j18 * j32) + j30 + (((long) iArr3[1]) & 4294967295L) + (j31 >>> 32);
        iArr3[1] = (int) j33;
        long j34 = j32 + (((long) iArr3[2]) & 4294967295L) + (j33 >>> 32);
        iArr3[2] = (int) j34;
        long j35 = (j34 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j35;
        if (((j35 >>> 32) == 0 ? 0 : android.support.v4.media.b.H0(8, iArr3, 4)) != 0 || (iArr3[7] == -1 && android.support.v4.media.b.D0(iArr3, f4644b))) {
            android.support.v4.media.b.o(8, 977, iArr3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003f, code lost:
        if (r14 == 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void V(int r14, int[] r15) {
        /*
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            if (r14 == 0) goto L_0x0041
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r14
            long r6 = r6 & r4
            long r2 = r2 * r6
            r14 = 0
            r8 = r15[r14]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            r8 = 0
            long r2 = r2 + r8
            int r10 = (int) r2
            r15[r14] = r10
            r10 = 32
            long r2 = r2 >>> r10
            r11 = 1
            r12 = r15[r11]
            long r12 = (long) r12
            long r12 = r12 & r4
            long r6 = r6 + r12
            long r6 = r6 + r2
            int r2 = (int) r6
            r15[r11] = r2
            long r2 = r6 >>> r10
            r6 = 2
            r7 = r15[r6]
            long r11 = (long) r7
            long r4 = r4 & r11
            long r2 = r2 + r4
            int r4 = (int) r2
            r15[r6] = r4
            long r2 = r2 >>> r10
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r14 = 3
            int r14 = android.support.v4.media.b.H0(r0, r15, r14)
        L_0x003f:
            if (r14 != 0) goto L_0x004f
        L_0x0041:
            r14 = 7
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0052
            int[] r14 = f4644b
            boolean r14 = android.support.v4.media.b.D0(r15, r14)
            if (r14 == 0) goto L_0x0052
        L_0x004f:
            android.support.v4.media.b.o(r0, r1, r15)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.e.V(int, int[]):void");
    }

    public static Throwable W(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i = i10;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th2;
    }

    public static c X(dd.d dVar, dd.d dVar2) {
        D(dVar2, "schema");
        return new c(new g(dVar2), dVar, null);
    }

    public static void Y(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        U(iArr3, iArr2);
    }

    public static void Z(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        while (true) {
            U(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.P1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static String a0(String str, Object obj) {
        return androidx.fragment.app.m.c(str, obj);
    }

    public static void b0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Z1(iArr, iArr2, iArr3) != 0) {
            android.support.v4.media.b.a2(8, 977, iArr3);
        }
    }

    public static void c0(String str) {
        x xVar = new x(o.c("lateinit property ", str, " has not been initialized"));
        W(xVar, e.class.getName());
        throw xVar;
    }

    public static long d0(long j10) {
        long j11 = ((j10 >>> 1) ^ j10) & 2459565876494606882L;
        long j12 = j10 ^ (j11 ^ (j11 << 1));
        long j13 = ((j12 >>> 2) ^ j12) & 868082074056920076L;
        long j14 = j12 ^ (j13 ^ (j13 << 2));
        long j15 = ((j14 >>> 4) ^ j14) & 67555025218437360L;
        long j16 = j14 ^ (j15 ^ (j15 << 4));
        long j17 = ((j16 >>> 8) ^ j16) & 280375465148160L;
        long j18 = j16 ^ (j17 ^ (j17 << 8));
        long j19 = ((j18 >>> 16) ^ j18) & 4294901760L;
        return j18 ^ (j19 ^ (j19 << 16));
    }

    public static c e0(dd.d dVar, android.support.v4.media.b bVar) {
        return new c(new ed.e(bVar), dVar, null);
    }

    public static c f0(dd.d dVar, dd.d dVar2) {
        D(dVar2, "schema");
        return new c(new ed.e(new g(dVar2)), dVar, null);
    }

    public static final long j(yi.a aVar, long j10) {
        long j11;
        long j12;
        D(aVar, "$this$mapAddress");
        long j13 = (long) 1073741824;
        if (j10 >= j13) {
            j11 = j10 - j13;
            j12 = aVar.a().f3041d;
        } else {
            long j14 = (long) 805306368;
            if (j10 >= j14) {
                j11 = j10 - j14;
                j12 = aVar.a().f3040c;
            } else {
                long j15 = (long) 536870912;
                if (j10 >= j15) {
                    j11 = j10 - j15;
                    j12 = aVar.a().f3039b;
                } else {
                    long j16 = (long) 268435456;
                    if (j10 < j16) {
                        return 0;
                    }
                    j11 = j10 - j16;
                    j12 = aVar.a().f3038a;
                }
            }
        }
        return j11 + j12;
    }

    public static final i k(ze.i iVar) {
        bf.a aVar = bf.a.f2992a;
        return (i) r.i(i.f2785w, bf.a.b(((aj.n) iVar).f701e));
    }

    public static final void l(URI uri) {
        D(uri, "$this$checkValidEid");
        if (uri.getScheme() != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                int hashCode = scheme.hashCode();
                if (hashCode != 99806) {
                    if (hashCode == 104487 && scheme.equals("ipn")) {
                        k.J(uri);
                    }
                } else if (scheme.equals("dtn")) {
                    jc.b.i(uri);
                }
            }
        } else {
            throw new ci.a();
        }
    }

    public static final void n(yi.a aVar, long j10, long j11) {
        D(aVar, "$this$assertMemoryReadable");
        if (j10 < 0) {
            throw y.c.d("address is unreachable (underflow)");
        } else if (j10 + j11 > ((long) aVar.f13674h.length)) {
            throw y.c.d("address is unreachable (overflow)");
        }
    }

    public static final byte[] o(yi.a aVar) {
        D(aVar, "$this$IN_BYTES");
        ByteBuffer v10 = v(aVar, k.k(aVar), k.k(aVar));
        byte[] bArr = new byte[v10.remaining()];
        v10.get(bArr);
        return bArr;
    }

    public static final byte[] p(yi.a aVar, int i) {
        D(aVar, "$this$IN_BYTES");
        ByteBuffer v10 = v(aVar, k.k(aVar), (long) i);
        byte[] bArr = new byte[v10.remaining()];
        v10.get(bArr);
        return bArr;
    }

    public static boolean r(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final ByteBuffer u(yi.a aVar, int i) {
        D(aVar, "$this$OUT_BYTES");
        return y(aVar, k.k(aVar), (long) i);
    }

    public static final ByteBuffer v(yi.a aVar, long j10, long j11) {
        D(aVar, "$this$readMemoryBlockBB");
        long j12 = j(aVar, j10);
        n(aVar, j12, j11);
        ByteBuffer slice = ByteBuffer.wrap(aVar.f13674h, (int) j12, (int) j11).slice();
        C(slice, "ByteBuffer.wrap(ram, off.toInt(), len).slice()");
        return slice;
    }

    public static final void w(yi.a aVar) {
        D(aVar, "$this$M_LOAD64");
        k.m(aVar, v(aVar, k.k(aVar), 8).getLong());
        yi.b.b(aVar, ((long) 8) * yi.b.f13679d);
    }

    public static final ByteBuffer x(yi.a aVar) {
        D(aVar, "$this$OUT_BYTES");
        return y(aVar, k.k(aVar), k.k(aVar));
    }

    public static final ByteBuffer y(yi.a aVar, long j10, long j11) {
        D(aVar, "$this$writeMemoryBlock");
        long j12 = j(aVar, j10);
        int i = (int) j11;
        if (j12 < 0) {
            throw y.c.d("address is unreachable (underflow)");
        } else if (j11 + j12 > ((long) aVar.f13674h.length)) {
            throw y.c.d("address is unreachable (overflow)");
        } else if (j12 >= aVar.a().f3041d) {
            ByteBuffer slice = ByteBuffer.wrap(aVar.f13674h, (int) j12, i).slice();
            C(slice, "ByteBuffer.wrap(ram, off.toInt(), len).slice()");
            return slice;
        } else {
            throw y.c.d("protected memory");
        }
    }

    public List M(qc.a aVar, p pVar) {
        ArrayList arrayList;
        if (aVar instanceof tc.n) {
            return nd.o.f8966a;
        }
        if (aVar instanceof h) {
            List<qc.d> list = ((h) aVar).f10666b;
            arrayList = new ArrayList(nd.g.S0(list));
            for (qc.d dVar : list) {
                arrayList.add(pVar.invoke(null, dVar.f10406b));
            }
        } else if (!(aVar instanceof rc.g)) {
            return a.b.n0(pVar.invoke(null, aVar));
        } else {
            LinkedHashMap<String, qc.d> linkedHashMap = ((rc.g) aVar).f10664b;
            arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry next : linkedHashMap.entrySet()) {
                arrayList.add(pVar.invoke(next.getKey(), ((qc.d) next.getValue()).f10406b));
            }
        }
        return arrayList;
    }

    public void O(float f10, float f11, float f12, k kVar) {
        kVar.e(f10, 0.0f);
    }

    public void a(String str, Object... objArr) {
    }

    public void b(Throwable th2, Object... objArr) {
    }

    public void c(String str, Object... objArr) {
    }

    public Object d(oc.b bVar, Object obj) {
        dc.e eVar = (dc.e) obj;
        D(bVar, "typeRegistry");
        qc.a<?, ?> a10 = bVar.a("ExtrinsicSignature");
        if (a10 == null) {
            throw new IllegalStateException("Type ExtrinsicSignature was not found.".toString());
        } else if (a10 instanceof rc.c) {
            dc.b bVar2 = eVar.f4435a;
            byte[] a11 = eVar.a();
            D(bVar2, "encryptionType");
            D(a11, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new c.a(fe.k.W0(bVar2.getRawName()), a11);
        } else if (!(a10 instanceof rc.g)) {
            StringBuilder d10 = a.a.d("Unknown signature type: ");
            d10.append(a10.f10398a);
            throw new UnsupportedOperationException(d10.toString());
        } else if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            BigInteger valueOf = BigInteger.valueOf((long) aVar.f4437c[0]);
            C(valueOf, "BigInteger.valueOf(this.toLong())");
            return new g.a(nd.x.u0(new md.f("r", aVar.f4438d), new md.f("s", aVar.f4439e), new md.f("v", valueOf)));
        } else {
            StringBuilder d11 = a.a.d("Cannot construct extrinsic signature from ");
            d11.append(((yd.d) v.a(eVar.getClass())).a());
            throw new IllegalArgumentException(d11.toString().toString());
        }
    }

    public void h(String str, Object... objArr) {
    }

    public void i(String str, Object... objArr) {
    }

    public void m(k5.b bVar, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(attributeSet, e5.a.f4619c);
        C(obtainStyledAttributes, "view.context.obtainStyle…ble.BottomNavigationView)");
        int resourceId = obtainStyledAttributes.getResourceId(e5.a.BottomNavigationView_menu, -1);
        if (resourceId != -1) {
            Context context = bVar.getContext();
            C(context, "view.context");
            e9.d dVar = new e9.d(context);
            Menu menu = bVar.getMenu();
            C(menu, "view.menu");
            dVar.a(resourceId, menu);
        }
        obtainStyledAttributes.recycle();
    }

    public CharSequence[] q(Context context, AttributeSet attributeSet, int[] iArr) {
        int length = iArr.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C(obtainStyledAttributes, "context.obtainStyledAttributes(attrSet, styleable)");
        int length2 = iArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            int resourceId = obtainStyledAttributes.getResourceId(i10, -1);
            if (resourceId != -1) {
                charSequenceArr[i10] = context.getResources().getText(resourceId);
            }
        }
        obtainStyledAttributes.recycle();
        return charSequenceArr;
    }

    public Void z(Object obj) {
        throw new IllegalArgumentException(androidx.fragment.app.m.c("Cannot construct StorageEntryType from ", obj));
    }
}
