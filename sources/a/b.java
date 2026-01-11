package a;

import ah.v;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.a0;
import b.i;
import ca.d;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.f;
import f0.f;
import g9.h;
import ge.c1;
import ge.c2;
import ge.m0;
import ge.n0;
import ge.t0;
import ge.y;
import h1.e0;
import h1.k0;
import io.nodle.cash.R;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import l6.b1;
import l6.y0;
import l6.z;
import le.r;
import le.t;
import lg.a;
import nd.o;
import p002if.k;
import pd.f;
import se.s;
import ui.c;
import v3.g;
import xd.l;
import xe.e;
import xe.j;

public /* synthetic */ class b implements k, z, g, h, d, a {
    public static final r A = new r("CONDITION_FALSE");
    public static Field B;
    public static boolean C;
    public static final int[] D = {-19, -1, -1, -1, -1, -1, -1, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    public static final int[] E = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f2a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    /* renamed from: b  reason: collision with root package name */
    public static b f3b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final r f4c = new r("COMPLETING_ALREADY");

    /* renamed from: s  reason: collision with root package name */
    public static final r f5s = new r("COMPLETING_WAITING_CHILDREN");

    /* renamed from: t  reason: collision with root package name */
    public static final r f6t = new r("COMPLETING_RETRY");

    /* renamed from: u  reason: collision with root package name */
    public static final r f7u = new r("TOO_LATE_TO_CANCEL");

    /* renamed from: v  reason: collision with root package name */
    public static final r f8v = new r("SEALED");

    /* renamed from: w  reason: collision with root package name */
    public static final t0 f9w = new t0(false);

    /* renamed from: x  reason: collision with root package name */
    public static final t0 f10x = new t0(true);

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ b f11y = new b();
    public static final y0 z = new y0(0);

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(g9.b bVar) {
    }

    public static final boolean A(j jVar, e eVar) {
        e6.e.D(jVar, "$this$isFlagSet");
        e6.e.D(eVar, "flag");
        return c.b(jVar.f13210c, eVar.f13194a);
    }

    public static final void A0(m0 m0Var, pd.d dVar, boolean z10) {
        Object h10 = m0Var.h();
        Throwable c10 = m0Var.c(h10);
        Object k10 = c10 != null ? b1.k(c10) : m0Var.e(h10);
        if (z10) {
            le.e eVar = (le.e) dVar;
            pd.d<T> dVar2 = eVar.f8238t;
            Object obj = eVar.f8240v;
            f context = dVar2.getContext();
            Object b10 = t.b(context, obj);
            c2<?> d10 = b10 != t.f8267a ? y.d(dVar2, context, b10) : null;
            try {
                eVar.f8238t.resumeWith(k10);
            } finally {
                if (d10 == null || d10.n0()) {
                    t.a(context, b10);
                }
            }
        } else {
            dVar.resumeWith(k10);
        }
    }

    public static final byte[] B(i iVar) {
        tg.e eVar = new tg.e();
        eVar.update(iVar.r().e());
        eVar.update(iVar.f2788t.i());
        eVar.update(ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN).putLong(iVar.f2789u).array());
        byte[] digest = eVar.digest();
        e6.e.C(digest, "sha.digest()");
        return digest;
    }

    public static final int B0(uf.y yVar, int i) {
        int i10;
        e6.e.D(yVar, "$this$segment");
        int[] iArr = yVar.f12004v;
        int i11 = i + 1;
        int i12 = 0;
        int length = yVar.f12003u.length;
        e6.e.D(iArr, "$this$binarySearch");
        int i13 = length - 1;
        while (true) {
            if (i12 <= i13) {
                i10 = (i12 + i13) >>> 1;
                int i14 = iArr[i10];
                if (i14 >= i11) {
                    if (i14 <= i11) {
                        break;
                    }
                    i13 = i10 - 1;
                } else {
                    i12 = i10 + 1;
                }
            } else {
                i10 = (-i12) - 1;
                break;
            }
        }
        return i10 >= 0 ? i10 : ~i10;
    }

    public static void C(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void C0(View view, a0 a0Var) {
        view.setTag(R.id.view_tree_lifecycle_owner, a0Var);
    }

    public static final void D(Throwable th2, Throwable th3) {
        e6.e.D(th2, "<this>");
        e6.e.D(th3, "exception");
        if (th2 != th3) {
            sd.b.f11100a.a(th2, th3);
        }
    }

    public static void D0(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof e6.f) {
            ((e6.f) background).n(f10);
        }
    }

    public static final void E(Appendable appendable, Object obj, l lVar) {
        boolean z10;
        if (lVar != null) {
            appendable.append((CharSequence) lVar.k(obj));
            return;
        }
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof CharSequence;
        }
        if (z10) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    public static void E0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof e6.f) {
            F0(view, (e6.f) background);
        }
    }

    public static final int F(yi.a aVar) {
        e6.e.D(aVar, "<this>");
        b.j r10 = aVar.b().r(161);
        if (r10 != null) {
            b.d dVar = r10.f2793s == 2 ? (b.d) r10.f2794t : b.d.f2764t;
            if (dVar != null) {
                return dVar.f2766s;
            }
        }
        return 0;
    }

    public static void F0(View view, e6.f fVar) {
        u5.a aVar = fVar.f4653a.f4665b;
        if (aVar != null && aVar.f11711a) {
            float b10 = x5.t.b(view);
            f.b bVar = fVar.f4653a;
            if (bVar.f4674m != b10) {
                bVar.f4674m = b10;
                fVar.w();
            }
        }
    }

    public static final j G(xe.f fVar, int i) {
        T t10;
        boolean z10;
        e6.e.D(fVar, "$this$getBlockType");
        Iterator<T> it = fVar.f13196b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((j) t10).f13208a == i) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        return (j) t10;
    }

    public static final boolean H(Context context) {
        e6.e.D(context, "context");
        return v.C(context, "android.permission.BLUETOOTH") == 0 && v.C(context, "android.permission.BLUETOOTH_ADMIN") == 0;
    }

    public static void H0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        x0(iArr3, iArr2);
    }

    public static final byte[] I(p4.d dVar) {
        e6.e.D(dVar, "$this$readByteArray");
        if (dVar.V0() == h4.k.VALUE_EMBEDDED_OBJECT) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dVar.W0(h4.b.f5814a, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            e6.e.C(byteArray, "buffer.toByteArray()");
            return byteArray;
        }
        StringBuilder q10 = q("expected byte array but got ");
        q10.append(dVar.Q0());
        throw new xe.l(q10.toString());
    }

    public static void I0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        j0(jArr, jArr3);
        y0(jArr3, jArr2);
    }

    public static final BigInteger J(Object obj) {
        if (!(obj instanceof BigInteger)) {
            obj = null;
        }
        BigInteger bigInteger = (BigInteger) obj;
        if (bigInteger != null) {
            return bigInteger;
        }
        k0();
        throw null;
    }

    public static void J0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        while (true) {
            x0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.P1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void K(byte[] bArr, lg.b bVar) {
        bVar.update(bArr, 0, bArr.length);
    }

    public static void K0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[9];
        j0(jArr, jArr3);
        while (true) {
            y0(jArr3, jArr2);
            i--;
            if (i > 0) {
                j0(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static final void L(p4.d dVar) {
        e6.e.D(dVar, "$this$readCloseArray");
        if (dVar.V0() != h4.k.END_ARRAY) {
            StringBuilder q10 = q("expected end array but got ");
            q10.append(dVar.Q0());
            throw new xe.l(q10.toString());
        }
    }

    public static int L0(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            j11 = (long) android.support.v4.media.b.G0(7, iArr, 1);
        }
        long j12 = ((4294967295L & ((long) iArr[7])) - 2147483648L) + j11;
        iArr[7] = (int) j12;
        return (int) (j12 >> 32);
    }

    public static final boolean M(xe.f fVar, int i) {
        boolean z10;
        e6.e.D(fVar, "$this$hasBlockType");
        List<j> list = fVar.f13196b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (j jVar : list) {
                if (jVar.f13208a == i) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void M0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Z1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                j11 = (long) android.support.v4.media.b.Y(7, iArr3, 1);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + 2147483648L + j11);
        }
    }

    public static int[] N(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static final void N0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final byte[] O(byte[] bArr, int i, int i10) {
        return nd.d.H(bArr, i, i10 + i);
    }

    public static final Void O0(te.h hVar, Number number) {
        e6.e.D(hVar, "$this$throwInvalidFloatingPointDecoded");
        e6.e.D(number, "result");
        hVar.c("Unexpected special floating-point value " + number + ". By default, " + "non-finite floating point values are prohibited because they do not conform JSON specification. " + "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", hVar.f11580a);
        throw null;
    }

    public static wh.a P(wh.b bVar, wh.e eVar) {
        wh.b bVar2 = bVar;
        wh.e eVar2 = eVar;
        Class<int> cls = int.class;
        int i = bVar2.f12682a;
        int i10 = 1 << i;
        int e10 = eVar.e();
        int[] iArr = new int[2];
        iArr[1] = i10;
        int i11 = 0;
        iArr[0] = e10;
        int[][] iArr2 = (int[][]) Array.newInstance(cls, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i10;
        iArr3[0] = e10;
        int[][] iArr4 = (int[][]) Array.newInstance(cls, iArr3);
        for (int i12 = 0; i12 < i10; i12++) {
            int[] iArr5 = iArr4[0];
            int[] iArr6 = eVar2.f12688c;
            int i13 = eVar2.f12687b;
            int i14 = iArr6[i13];
            while (true) {
                i13--;
                if (i13 < 0) {
                    break;
                }
                i14 = eVar2.f12686a.d(i14, i12) ^ eVar2.f12688c[i13];
            }
            iArr5[i12] = bVar2.b(i14);
        }
        for (int i15 = 1; i15 < e10; i15++) {
            for (int i16 = 0; i16 < i10; i16++) {
                iArr4[i15][i16] = bVar2.d(iArr4[i15 - 1][i16], i16);
            }
        }
        int i17 = 0;
        while (i17 < e10) {
            int i18 = i11;
            while (i18 < i10) {
                for (int i19 = i11; i19 <= i17; i19++) {
                    iArr2[i17][i18] = bVar2.d(iArr4[i19][i18], eVar2.d((e10 + i19) - i17)) ^ iArr2[i17][i18];
                }
                i18++;
                i11 = 0;
            }
            i17++;
            i11 = 0;
        }
        int[] iArr7 = new int[2];
        iArr7[1] = (i10 + 31) >>> 5;
        iArr7[0] = e10 * i;
        int[][] iArr8 = (int[][]) Array.newInstance(cls, iArr7);
        for (int i20 = 0; i20 < i10; i20++) {
            int i21 = i20 >>> 5;
            int i22 = 1 << (i20 & 31);
            for (int i23 = 0; i23 < e10; i23++) {
                int i24 = iArr2[i23][i20];
                for (int i25 = 0; i25 < i; i25++) {
                    if (((i24 >>> i25) & 1) != 0) {
                        int[] iArr9 = iArr8[(((i23 + 1) * i) - i25) - 1];
                        iArr9[i21] = iArr9[i21] ^ i22;
                    }
                }
            }
        }
        return new wh.a(i10, iArr8);
    }

    public static void P0(int[] iArr, int[] iArr2) {
        android.support.v4.media.b.F1(8, iArr, 0, iArr2);
        if (android.support.v4.media.b.D0(iArr2, D)) {
            L0(iArr2);
        }
    }

    public static aa.b Q(int i) {
        if (i == 0) {
            return new e6.h();
        }
        if (i != 1) {
            return new e6.h();
        }
        return new e6.d();
    }

    public static void Q0(int i, lg.b bVar) {
        bVar.f((byte) (i >>> 24));
        bVar.f((byte) (i >>> 16));
        bVar.f((byte) (i >>> 8));
        bVar.f((byte) i);
    }

    public static final int R(p4.d dVar) {
        e6.e.D(dVar, "$this$readInt");
        h4.k V0 = dVar.V0();
        e6.e.C(V0, "t");
        if (V0.isNumeric()) {
            return dVar.R0();
        }
        StringBuilder q10 = q("expected number but got ");
        q10.append(dVar.Q0());
        throw new xe.l(q10.toString());
    }

    public static final Object R0(Object obj) {
        ge.b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f5378a) == null) ? obj : b1Var;
    }

    public static final long S(p4.d dVar) {
        e6.e.D(dVar, "$this$readLong");
        h4.k V0 = dVar.V0();
        e6.e.C(V0, "t");
        if (V0.isNumeric()) {
            return dVar.S0();
        }
        StringBuilder q10 = q("expected number but got ");
        q10.append(dVar.Q0());
        throw new xe.l(q10.toString());
    }

    public static int T(int i, int i10) {
        int i11 = i ^ i10;
        int i12 = 0;
        for (int i13 = 0; i13 < 8; i13++) {
            i12 |= i11 >> i13;
        }
        return (i12 ^ 1) & 1;
    }

    public static int U(byte[] bArr, byte[] bArr2) {
        byte b10 = 0;
        for (int i = 0; i < 32; i++) {
            b10 |= bArr[i] ^ bArr2[i];
        }
        return T(b10, 0);
    }

    public static boolean V(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z10 &= iArr[length] == iArr2[length];
        }
        return z10;
    }

    public static int W(float f10, int i, int i10) {
        if (i == i10) {
            return i;
        }
        float f11 = ((float) ((i >> 24) & 255)) / 255.0f;
        float e10 = e(((float) ((i >> 16) & 255)) / 255.0f);
        float e11 = e(((float) ((i >> 8) & 255)) / 255.0f);
        float e12 = e(((float) (i & 255)) / 255.0f);
        float e13 = e(((float) ((i10 >> 16) & 255)) / 255.0f);
        float e14 = e(((float) ((i10 >> 8) & 255)) / 255.0f);
        float e15 = e(((float) (i10 & 255)) / 255.0f);
        float a10 = a.a(((float) ((i10 >> 24) & 255)) / 255.0f, f11, f10, f11);
        float a11 = a.a(e13, e10, f10, e10);
        float a12 = a.a(e14, e11, f10, e11);
        float a13 = a.a(e15, e12, f10, e12);
        int round = Math.round(k(a11) * 255.0f) << 16;
        return Math.round(k(a13) * 255.0f) | round | (Math.round(a10 * 255.0f) << 24) | (Math.round(k(a12) * 255.0f) << 8);
    }

    public static final void X(p4.d dVar) {
        e6.e.D(dVar, "$this$readStartArray");
        if (dVar.V0() != h4.k.START_ARRAY) {
            StringBuilder q10 = q("expected start array but got ");
            q10.append(dVar.Q0());
            throw new xe.l(q10.toString());
        }
    }

    public static final String Y(String str, String str2) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return fe.k.b1(str + str2, " ", BuildConfig.FLAVOR);
    }

    public static ColorStateList Z(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.a aVar;
        Object obj = d0.a.f4256a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = f0.f.f4887a;
        f.b bVar = new f.b(resources, theme);
        synchronized (f0.f.f4889c) {
            SparseArray sparseArray = f0.f.f4888b.get(bVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (f.a) sparseArray.get(i)) == null)) {
                if (aVar.f4891b.equals(resources.getConfiguration())) {
                    colorStateList2 = aVar.f4890a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal2 = f0.f.f4887a;
        TypedValue typedValue = threadLocal2.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal2.set(typedValue);
        }
        boolean z10 = true;
        resources.getValue(i, typedValue, true);
        int i10 = typedValue.type;
        if (i10 < 28 || i10 > 31) {
            z10 = false;
        }
        if (!z10) {
            try {
                colorStateList = f0.b.a(resources, resources.getXml(i), theme);
            } catch (Exception e10) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (f0.f.f4889c) {
            WeakHashMap<f.b, SparseArray<f.a>> weakHashMap = f0.f.f4888b;
            SparseArray sparseArray2 = weakHashMap.get(bVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(bVar, sparseArray2);
            }
            sparseArray2.append(i, new f.a(colorStateList, bVar.f4892a.getConfiguration()));
        }
        return colorStateList;
    }

    public static Drawable a0(Context context, int i) {
        return androidx.appcompat.widget.t0.d().f(context, i);
    }

    public static final int b0(s sVar) {
        return Integer.parseInt(sVar.d());
    }

    public static final int c0(List list) {
        e6.e.D(list, "<this>");
        return list.size() - 1;
    }

    public static final ge.z d0(e0 e0Var) {
        e6.e.D(e0Var, "<this>");
        Map<String, Object> map = e0Var.f5684l;
        e6.e.C(map, "backingFieldMap");
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            Executor executor = e0Var.f5676b;
            e6.e.C(executor, "queryExecutor");
            if (executor instanceof n0) {
                n0 n0Var = (n0) executor;
            }
            obj = new ge.y0(executor);
            map.put("QueryDispatcher", obj);
        }
        return (ge.z) obj;
    }

    public static float e(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    public static final ge.z e0(e0 e0Var) {
        e6.e.D(e0Var, "<this>");
        Map<String, Object> map = e0Var.f5684l;
        e6.e.C(map, "backingFieldMap");
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            k0 k0Var = e0Var.f5677c;
            e6.e.C(k0Var, "transactionExecutor");
            if (k0Var instanceof n0) {
                n0 n0Var = (n0) k0Var;
            }
            obj = new ge.y0(k0Var);
            map.put("TransactionDispatcher", obj);
        }
        return (ge.z) obj;
    }

    public static final te.d f(Number number, String str, String str2) {
        e6.e.D(number, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e6.e.D(str, "key");
        e6.e.D(str2, "output");
        return i(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, " + "non-finite floating point values are prohibited because they do not conform JSON specification. " + "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\n" + "Current output: " + s0(str2, -1));
    }

    public static byte[] f0(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static void g0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        jArr2[0] = j10 & 144115188075855871L;
        jArr2[1] = ((j10 >>> 57) ^ (j11 << 7)) & 144115188075855871L;
        jArr2[2] = ((j11 >>> 50) ^ (j12 << 14)) & 144115188075855871L;
        jArr2[3] = ((j12 >>> 43) ^ (j13 << 21)) & 144115188075855871L;
        jArr2[4] = (j13 >>> 36) ^ (j14 << 28);
    }

    public static final te.e h(pe.e eVar) {
        StringBuilder d10 = a.d("Value of type '");
        d10.append(eVar.b());
        d10.append("' can't be used in JSON as a key in the map. ");
        d10.append("It should have either primitive or enum kind, but its kind is '");
        d10.append(eVar.c());
        d10.append("'.\n");
        d10.append("Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
        return new te.e(d10.toString());
    }

    public static void h0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        g0(jArr, jArr4);
        g0(jArr2, jArr5);
        long[] jArr6 = new long[26];
        long[] jArr7 = jArr6;
        i0(jArr4[0], jArr5[0], jArr7, 0);
        i0(jArr4[1], jArr5[1], jArr7, 2);
        i0(jArr4[2], jArr5[2], jArr7, 4);
        i0(jArr4[3], jArr5[3], jArr7, 6);
        i0(jArr4[4], jArr5[4], jArr7, 8);
        long j10 = jArr4[0] ^ jArr4[1];
        long j11 = jArr5[0] ^ jArr5[1];
        long j12 = jArr4[0] ^ jArr4[2];
        long j13 = jArr5[0] ^ jArr5[2];
        long j14 = jArr4[2] ^ jArr4[4];
        long j15 = jArr5[2] ^ jArr5[4];
        long j16 = jArr4[3] ^ jArr4[4];
        long j17 = jArr5[3] ^ jArr5[4];
        i0(j12 ^ jArr4[3], j13 ^ jArr5[3], jArr7, 18);
        i0(j14 ^ jArr4[1], j15 ^ jArr5[1], jArr7, 20);
        long j18 = j10 ^ j16;
        long j19 = j11 ^ j17;
        long j20 = j18 ^ jArr4[2];
        long[] jArr8 = jArr6;
        i0(j18, j19, jArr8, 22);
        i0(j20, jArr5[2] ^ j19, jArr8, 24);
        i0(j10, j11, jArr8, 10);
        i0(j12, j13, jArr8, 12);
        i0(j14, j15, jArr8, 14);
        i0(j16, j17, jArr8, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j21 = jArr6[0] ^ jArr6[1];
        long j22 = jArr6[2] ^ j21;
        long j23 = jArr6[10] ^ j22;
        jArr3[1] = j23;
        long j24 = jArr6[3] ^ jArr6[4];
        long j25 = j22 ^ (j24 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j25;
        long j26 = j21 ^ j24;
        long j27 = jArr6[5] ^ jArr6[6];
        long j28 = (j26 ^ j27) ^ jArr6[8];
        long j29 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j28 ^ j29) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j30 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j31 = j30 ^ jArr6[17];
        jArr3[8] = j31;
        long j32 = (j30 ^ j27) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j32;
        long j33 = j23 ^ j32;
        long j34 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j34 ^ (jArr6[18] ^ jArr6[23])) ^ j33;
        jArr3[5] = ((j25 ^ j31) ^ j34) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = (((((j28 ^ jArr6[0]) ^ jArr6[9]) ^ j29) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        long j35 = jArr3[0];
        long j36 = jArr3[1];
        long j37 = jArr3[2];
        long j38 = jArr3[3];
        long j39 = jArr3[4];
        long j40 = jArr3[5];
        long j41 = jArr3[6];
        long j42 = jArr3[7];
        long j43 = jArr3[8];
        long j44 = jArr3[9];
        jArr3[0] = j35 ^ (j36 << 57);
        jArr3[1] = (j36 >>> 7) ^ (j37 << 50);
        jArr3[2] = (j37 >>> 14) ^ (j38 << 43);
        jArr3[3] = (j38 >>> 21) ^ (j39 << 36);
        jArr3[4] = (j39 >>> 28) ^ (j40 << 29);
        jArr3[5] = (j40 >>> 35) ^ (j41 << 22);
        jArr3[6] = (j41 >>> 42) ^ (j42 << 15);
        jArr3[7] = (j42 >>> 49) ^ (j43 << 8);
        jArr3[8] = (j43 >>> 56) ^ (j44 << 1);
        jArr3[9] = j44 >>> 63;
    }

    public static final te.d i(int i, String str) {
        e6.e.D(str, "message");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new te.d(str);
    }

    public static void i0(long j10, long j11, long[] jArr, int i) {
        long j12 = j10;
        long[] jArr2 = new long[8];
        jArr2[1] = j11;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j11;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j11;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j11;
        long j13 = jArr2[((int) j12) & 7];
        long j14 = 0;
        int i10 = 48;
        do {
            int i11 = (int) (j12 >>> i10);
            long j15 = (jArr2[i11 & 7] ^ (jArr2[(i11 >>> 3) & 7] << 3)) ^ (jArr2[(i11 >>> 6) & 7] << 6);
            j13 ^= j15 << i10;
            j14 ^= j15 >>> (-i10);
            i10 -= 9;
        } while (i10 > 0);
        jArr[i] = 144115188075855871L & j13;
        jArr[i + 1] = (((((j12 & 72198606942111744L) & ((j11 << 7) >> 63)) >>> 8) ^ j14) << 7) ^ (j13 >>> 57);
    }

    public static final te.d j(int i, String str, String str2) {
        e6.e.D(str, "message");
        e6.e.D(str2, "input");
        return i(i, str + "\nJSON input: " + s0(str2, i));
    }

    public static void j0(long[] jArr, long[] jArr2) {
        e6.e.L(jArr[0], jArr2, 0);
        e6.e.L(jArr[1], jArr2, 2);
        e6.e.L(jArr[2], jArr2, 4);
        e6.e.L(jArr[3], jArr2, 6);
        jArr2[8] = e6.e.K((int) jArr[4]);
    }

    public static float k(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow((double) f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final Void k0() {
        throw new IllegalStateException("Binding is incompatible");
    }

    public static final long l(yi.a aVar, wi.d dVar) {
        e6.e.D(aVar, "<this>");
        b.j r10 = aVar.b().r(dVar.f12715a);
        if (r10 != null) {
            b.a aVar2 = r10.f2793s == 3 ? (b.a) r10.f2794t : b.a.f2751u;
            if (aVar2 != null) {
                return aVar2.f2754t;
            }
        }
        return 0;
    }

    public static final boolean l0(int i) {
        return i == 1 || i == 2;
    }

    public static final di.b m(yi.a aVar) {
        e6.e.D(aVar, "<this>");
        di.b bVar = (di.b) aVar.f13675j.get("ble");
        if (bVar != null) {
            return bVar;
        }
        throw new wi.c(wi.a.BleError, "ble interface not available");
    }

    public static boolean m0(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static Class n(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static final List n0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        e6.e.C(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final Object o(p4.d dVar, boolean z10, l lVar) {
        e6.e.D(dVar, "$this$readStruct");
        if (!z10) {
            X(dVar);
        } else {
            w(dVar);
        }
        try {
            return lVar.k(dVar);
        } finally {
            L(dVar);
        }
    }

    public static final List o0(Object... objArr) {
        e6.e.D(objArr, "elements");
        return objArr.length > 0 ? nd.d.D(objArr) : o.f8966a;
    }

    public static final String p(xe.f fVar) {
        e6.e.D(fVar, "$this$ID");
        return c3.k.p(fVar.f13195a);
    }

    public static final List p0(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static StringBuilder q(String str) {
        return a.d(str);
    }

    public static final void q0(Context context, String str, String str2) {
        e6.e.D(context, "cxt");
        qa.e eVar = qa.e.ANNOUNCEMENTS_SEEN;
        String J = v.J(context, eVar);
        String Y = Y(str, str2);
        Log.d("b", "markAsSeen keyString: " + Y);
        if ((Y.length() > 0) && !fe.o.g1(J, Y)) {
            Log.d("b", "markAsSeen MARKED AS SEEN");
            v.f0(context, eVar, J + Y + "|");
        }
    }

    public static DateFormat r(int i, int i10) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(jc.b.c("Unknown DateFormat style: ", i));
        }
        sb2.append(str);
        sb2.append(" ");
        if (i10 == 0 || i10 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i10 == 2) {
            str2 = "h:mm:ss a";
        } else if (i10 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(jc.b.c("Unknown DateFormat style: ", i10));
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }

    public static String r0(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb2.append(str.charAt(i));
            if (str2.length() > i) {
                sb2.append(str2.charAt(i));
            }
        }
        return sb2.toString();
    }

    public static final List s(p4.d dVar, l lVar) {
        e6.e.D(dVar, "$this$readArray");
        X(dVar);
        ArrayList arrayList = new ArrayList();
        while (dVar.V0() != h4.k.END_ARRAY) {
            arrayList.add(lVar.k(dVar));
        }
        return arrayList;
    }

    public static final String s0(String str, int i) {
        if (str.length() < 200) {
            return str;
        }
        String str2 = ".....";
        if (i == -1) {
            int length = str.length() - 60;
            if (length <= 0) {
                return str;
            }
            StringBuilder d10 = a.d(str2);
            String substring = str.substring(length);
            e6.e.C(substring, "(this as java.lang.String).substring(startIndex)");
            d10.append(substring);
            return d10.toString();
        }
        int i10 = i - 30;
        int i11 = i + 30;
        String str3 = i10 <= 0 ? BuildConfig.FLAVOR : str2;
        if (i11 >= str.length()) {
            str2 = BuildConfig.FLAVOR;
        }
        StringBuilder d11 = a.d(str3);
        if (i10 < 0) {
            i10 = 0;
        }
        int length2 = str.length();
        if (i11 > length2) {
            i11 = length2;
        }
        String substring2 = str.substring(i10, i11);
        e6.e.C(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        d11.append(substring2);
        d11.append(str2);
        return d11.toString();
    }

    public static final oi.a t(yi.a aVar) {
        e6.e.D(aVar, "<this>");
        oi.a aVar2 = (oi.a) aVar.f13675j.get("core");
        if (aVar2 != null) {
            return aVar2;
        }
        throw new wi.c(wi.a.BleError, "location is not available");
    }

    public static void t0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        android.support.v4.media.b.p1(iArr, iArr2, iArr4);
        x0(iArr4, iArr3);
    }

    public static final xe.f u(xe.f fVar, j jVar, boolean z10) {
        e6.e.D(fVar, "$this$addBlock");
        e6.e.D(jVar, "block");
        if (jVar.f13208a != 1 || !M(fVar, 1)) {
            if (z10) {
                List<j> list = fVar.f13196b;
                int size = list.size() + 1;
                if (jVar.f13208a != 1) {
                    jVar.f13209b = size;
                } else {
                    jVar.f13209b = 1;
                }
                list.add(jVar);
            } else {
                fVar.f13196b.add(jVar);
            }
        }
        List<j> list2 = fVar.f13196b;
        if (list2.size() > 1) {
            nd.h.T0(list2, new xe.g());
        }
        return fVar;
    }

    public static void u0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        h0(jArr, jArr2, jArr4);
        y0(jArr4, jArr3);
    }

    public static final j v(xe.f fVar, int i) {
        T t10;
        boolean z10;
        e6.e.D(fVar, "$this$getBlockNumber");
        Iterator<T> it = fVar.f13196b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (((j) t10).f13209b == i) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        return (j) t10;
    }

    public static void v0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        h0(jArr, jArr2, jArr4);
        C(jArr3, jArr4, jArr3);
    }

    public static final void w(p4.d dVar) {
        e6.e.D(dVar, "$this$assertStartArray");
        if (!(dVar.f6183b == h4.k.START_ARRAY)) {
            StringBuilder q10 = q("expected start array but got ");
            q10.append(dVar.Q0());
            throw new xe.l(q10.toString());
        }
    }

    public static final List w0(List list) {
        int size = list.size();
        if (size == 0) {
            return o.f8966a;
        }
        if (size != 1) {
            return list;
        }
        return n0(list.get(0));
    }

    public static final boolean x() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        return defaultAdapter.isEnabled();
    }

    public static void x0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        int i = iArr[7];
        int i10 = i;
        int i11 = 0;
        while (i11 < 8) {
            int i12 = iArr[i11 + 8];
            iArr3[0 + i11] = (i10 >>> 31) | (i12 << 1);
            i11++;
            i10 = i12;
        }
        long j10 = ((long) 19) & 4294967295L;
        long j11 = ((((long) iArr3[0]) & 4294967295L) * j10) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j11;
        long j12 = ((((long) iArr3[1]) & 4294967295L) * j10) + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr3[1] = (int) j12;
        int i13 = i;
        long j13 = ((((long) iArr3[2]) & 4294967295L) * j10) + (((long) iArr[2]) & 4294967295L) + (j12 >>> 32);
        iArr3[2] = (int) j13;
        long j14 = ((((long) iArr3[3]) & 4294967295L) * j10) + (((long) iArr[3]) & 4294967295L) + (j13 >>> 32);
        iArr3[3] = (int) j14;
        long j15 = ((((long) iArr3[4]) & 4294967295L) * j10) + (((long) iArr[4]) & 4294967295L) + (j14 >>> 32);
        iArr3[4] = (int) j15;
        long j16 = ((((long) iArr3[5]) & 4294967295L) * j10) + (((long) iArr[5]) & 4294967295L) + (j15 >>> 32);
        iArr3[5] = (int) j16;
        long j17 = ((((long) iArr3[6]) & 4294967295L) * j10) + (((long) iArr[6]) & 4294967295L) + (j16 >>> 32);
        iArr3[6] = (int) j17;
        long j18 = (j10 * (((long) iArr3[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j17 >>> 32);
        iArr3[7] = (int) j18;
        int i14 = iArr3[7];
        iArr3[7] = android.support.v4.media.b.C(7, (((i14 >>> 31) - (i13 >>> 31)) + (((int) (j18 >>> 32)) << 1)) * 19, iArr3) + (Integer.MAX_VALUE & i14);
        if (android.support.v4.media.b.D0(iArr3, D)) {
            L0(iArr2);
        }
    }

    public static final boolean y(Context context) {
        e6.e.D(context, "context");
        return v.C(context, "android.permission.ACCESS_FINE_LOCATION") == 0 && v.C(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static void y0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = j14 ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        long j20 = j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49));
        long j21 = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        long j22 = j19 >>> 27;
        jArr2[0] = (((j20 ^ j22) ^ (j22 << 5)) ^ (j22 << 7)) ^ (j22 << 12);
        jArr2[1] = j21;
        jArr2[2] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[3] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[4] = 134217727 & j19;
    }

    public static final boolean z(xe.f fVar, xe.d dVar) {
        e6.e.D(fVar, "$this$hasBlockType");
        e6.e.D(dVar, "blockType");
        return M(fVar, dVar.f13189a);
    }

    public static void z0(int i, int[] iArr) {
        int i10 = iArr[7];
        iArr[7] = android.support.v4.media.b.C(7, ((i << 1) | (i10 >>> 31)) * 19, iArr) + (i10 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (android.support.v4.media.b.D0(iArr, D)) {
            L0(iArr);
        }
    }

    public void G0(View view, int i) {
        if (!C) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                B = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            C = true;
        }
        Field field = B;
        if (field != null) {
            try {
                B.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public Object a() {
        return new LinkedHashSet();
    }

    public void b(p002if.r rVar) {
        e6.e.D(rVar, ImagesContract.URL);
    }

    public void c(p002if.r rVar, List list) {
        e6.e.D(rVar, ImagesContract.URL);
    }

    public void d() {
    }

    public int zza(int i) {
        return i;
    }
}
