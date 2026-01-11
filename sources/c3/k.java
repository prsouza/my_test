package c3;

import ah.v;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import ca.d;
import com.github.mikephil.charting.BuildConfig;
import db.c;
import e6.e;
import fe.o;
import g9.b;
import g9.h;
import ge.d0;
import ge.g1;
import ge.i0;
import ge.j0;
import ge.l;
import hc.g;
import i3.w;
import i7.i;
import ie.p;
import io.nodle.cash.R;
import io.nodle.sdk.NodleContext;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l6.b1;
import l6.r2;
import le.r;
import md.m;
import n0.b0;
import o6.z;
import oe.f;
import org.slf4j.Logger;
import pd.e;
import pd.f;
import s1.a;
import xe.q;

public class k implements g3.k, z, h, d, c, l6.z, b0, a {
    public static long A;
    public static final r B = new r("RESUME_TOKEN");
    public static final /* synthetic */ k C = new k();
    public static final m3.c D = new m3.c();
    public static final k E = new k();
    public static final int[] F = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int[] G = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3175a = {-21389, -2, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3176b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3177c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f3178s = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f3179t = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f3180u = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f3181v = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* renamed from: w  reason: collision with root package name */
    public static final float[][] f3182w = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: x  reason: collision with root package name */
    public static final float[][] f3183x = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: y  reason: collision with root package name */
    public static final float[] f3184y = {95.047f, 100.0f, 108.883f};
    public static final float[][] z = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public /* synthetic */ k() {
    }

    public /* synthetic */ k(b bVar) {
    }

    public static void A(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.m(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && android.support.v4.media.b.C0(iArr3, f3178s))) {
            E(iArr3);
        }
    }

    public static void A0(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((android.support.v4.media.b.s1(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && android.support.v4.media.b.y0(10, iArr3, f3176b))) && android.support.v4.media.b.v(7, f3177c, iArr3) != 0) {
            android.support.v4.media.b.G0(10, iArr3, 7);
        }
    }

    public static void B(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = android.support.v4.media.b.i(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (i > 511 || (i == 511 && android.support.v4.media.b.f0(16, iArr3, f3181v))) {
            i = (android.support.v4.media.b.F0(iArr3) + i) & 511;
        }
        iArr3[16] = i;
    }

    public static void B0(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.X0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            return;
        }
        android.support.v4.media.b.W1(f3175a, iArr, iArr2);
    }

    public static void C(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.n(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && android.support.v4.media.b.D0(iArr3, F))) {
            F(iArr3);
        }
    }

    public static void C0(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.Z0(iArr)) {
            android.support.v4.media.b.p2(iArr2);
        } else {
            android.support.v4.media.b.Y1(f3178s, iArr, iArr2);
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.E0(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && android.support.v4.media.b.C0(iArr2, f3178s))) {
            E(iArr2);
        }
    }

    public static final boolean D0(String str) {
        e.D(str, "method");
        return !e.r(str, "GET") && !e.r(str, "HEAD");
    }

    public static void E(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = (4294967295L & ((long) iArr[3])) + 1 + j11;
        iArr[3] = (int) j14;
        if ((j14 >> 32) != 0) {
            android.support.v4.media.b.G0(7, iArr, 4);
        }
    }

    public static final void E0(Object obj) {
        Log.d("Phrase OTA", String.valueOf(obj));
    }

    public static void F(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = ((((long) iArr[2]) & 4294967295L) - 1) + j11;
        iArr[2] = (int) j13;
        long j14 = (((long) iArr[3]) & 4294967295L) + 1 + (j13 >> 32);
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j17;
            long j18 = (j17 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j18;
            j15 = j18 >> 32;
        }
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + j15);
    }

    public static final Void F0(de.b bVar) {
        e.D(bVar, "$this$platformSpecificSerializerNotRegistered");
        StringBuilder d10 = a.a.d("Serializer for class '");
        d10.append(bVar.a());
        d10.append("' is not found.\n");
        d10.append("Mark the class as @Serializable or provide the serializer explicitly.");
        throw new f(d10.toString());
    }

    public static final long G(yi.a aVar, int i) {
        long k10 = k(aVar);
        if (i == 0) {
            return m(aVar, k10);
        }
        long G2 = G(aVar, i - 1);
        m(aVar, k10);
        return G2;
    }

    public static void G0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) 21389) & 4294967295L;
        long j11 = ((long) iArr[5]) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j12;
        long j13 = ((long) iArr[6]) & 4294967295L;
        long j14 = (j10 * j13) + j11 + (((long) iArr[1]) & 4294967295L) + (j12 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[7]) & 4294967295L;
        long j16 = (j10 * j15) + j13 + (((long) iArr[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[8]) & 4294967295L;
        long j18 = j10;
        long j19 = (j10 * j17) + j15 + (((long) iArr[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = ((long) iArr[9]) & 4294967295L;
        long j21 = (j18 * j20) + j17 + (((long) iArr[4]) & 4294967295L) + (j19 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = (j21 >>> 32) + j20;
        long j23 = j22 & 4294967295L;
        long j24 = (j18 * j23) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j24;
        long j25 = j22 >>> 32;
        long j26 = (j18 * j25) + j23 + (((long) iArr3[1]) & 4294967295L) + (j24 >>> 32);
        iArr3[1] = (int) j26;
        long j27 = j25 + (((long) iArr3[2]) & 4294967295L) + (j26 >>> 32);
        iArr3[2] = (int) j27;
        long j28 = (j27 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j28;
        if (((j28 >>> 32) == 0 ? 0 : android.support.v4.media.b.H0(5, iArr3, 4)) != 0 || (iArr3[4] == -1 && android.support.v4.media.b.A0(iArr3, f3175a))) {
            android.support.v4.media.b.o(5, 21389, iArr3);
        }
    }

    public static final qg.e H(r rVar) {
        e.D(rVar, "$this$ed25519PublicKey");
        qg.e S0 = s(rVar).S0();
        e.C(S0, "ed25519PrivateKey().generatePublicKey()");
        return S0;
    }

    public static void H0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[10]) & 4294967295L;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = ((long) iArr[12]) & 4294967295L;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = ((((long) iArr[7]) & 4294967295L) + j11) - 1;
        long j15 = (((long) iArr[8]) & 4294967295L) + j12;
        long j16 = j12;
        long j17 = (((long) iArr[9]) & 4294967295L) + j13;
        long j18 = j13;
        long j19 = ((((long) iArr[0]) & 4294967295L) - j14) + 0;
        long j20 = j11;
        long j21 = ((((long) iArr[1]) & 4294967295L) - j15) + (j19 >> 32);
        iArr3[1] = (int) j21;
        long j22 = ((((long) iArr[2]) & 4294967295L) - j17) + (j21 >> 32);
        iArr3[2] = (int) j22;
        long j23 = (((((long) iArr[3]) & 4294967295L) + j14) - j10) + (j22 >> 32);
        long j24 = (((((long) iArr[4]) & 4294967295L) + j15) - j20) + (j23 >> 32);
        iArr3[4] = (int) j24;
        long j25 = (((((long) iArr[5]) & 4294967295L) + j17) - j16) + (j24 >> 32);
        iArr3[5] = (int) j25;
        long j26 = (((((long) iArr[6]) & 4294967295L) + j10) - j18) + (j25 >> 32);
        iArr3[6] = (int) j26;
        long j27 = (j26 >> 32) + 1;
        long j28 = (j23 & 4294967295L) + j27;
        long j29 = (j19 & 4294967295L) - j27;
        iArr3[0] = (int) j29;
        long j30 = j29 >> 32;
        if (j30 != 0) {
            long j31 = j30 + (((long) iArr3[1]) & 4294967295L);
            iArr3[1] = (int) j31;
            long j32 = (j31 >> 32) + (4294967295L & ((long) iArr3[2]));
            iArr3[2] = (int) j32;
            j28 += j32 >> 32;
        }
        iArr3[3] = (int) j28;
        if (((j28 >> 32) != 0 && android.support.v4.media.b.G0(7, iArr3, 4) != 0) || (iArr3[6] == -1 && android.support.v4.media.b.C0(iArr3, f3178s))) {
            E(iArr2);
        }
    }

    public static final xe.f I(q qVar) {
        e.D(qVar, "$this$makeBundle");
        return new xe.f(qVar, new ArrayList());
    }

    public static void I0(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int i10 = i;
        int i11 = 16;
        while (true) {
            i11--;
            if (i11 < 0) {
                break;
            }
            int i12 = iArr[16 + i11];
            iArr2[i11 + 0] = (i10 << -9) | (i12 >>> 9);
            i10 = i12;
        }
        int v10 = android.support.v4.media.b.v(16, iArr, iArr2) + ((i10 << -9) >>> 23) + (i >>> 9);
        if (v10 > 511 || (v10 == 511 && android.support.v4.media.b.f0(16, iArr2, f3181v))) {
            v10 = (android.support.v4.media.b.F0(iArr2) + v10) & 511;
        }
        iArr2[16] = v10;
    }

    public static final void J(URI uri) {
        e.D(uri, "$this$checkValidIpnEid");
        t(uri);
        Matcher matcher = Pattern.compile("^([0-9]+)\\.([0-9]+)$").matcher(uri.getSchemeSpecificPart());
        e.C(matcher, "matcher");
        u(matcher);
    }

    public static void J0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[8]) & 4294967295L;
        long j11 = ((long) iArr[9]) & 4294967295L;
        long j12 = ((long) iArr[10]) & 4294967295L;
        long j13 = ((long) iArr[11]) & 4294967295L;
        long j14 = ((long) iArr[12]) & 4294967295L;
        long j15 = ((long) iArr[13]) & 4294967295L;
        long j16 = ((long) iArr[14]) & 4294967295L;
        long j17 = ((long) iArr[15]) & 4294967295L;
        long j18 = j12 + j13;
        long j19 = j15 + j16;
        long j20 = j19 + (j17 << 1);
        long j21 = j10 + j11 + j19;
        long j22 = j18 + j14 + j17 + j21;
        long j23 = j14;
        long j24 = (((long) iArr[0]) & 4294967295L) + j22 + j15 + j16 + j17 + 0;
        iArr3[0] = (int) j24;
        long j25 = j13;
        long j26 = (((((long) iArr[1]) & 4294967295L) + j22) - j10) + j16 + j17 + (j24 >> 32);
        iArr3[1] = (int) j26;
        long j27 = ((((long) iArr[2]) & 4294967295L) - j21) + (j26 >> 32);
        iArr3[2] = (int) j27;
        long j28 = ((((((long) iArr[3]) & 4294967295L) + j22) - j11) - j12) + j15 + (j27 >> 32);
        iArr3[3] = (int) j28;
        long j29 = ((((((long) iArr[4]) & 4294967295L) + j22) - j18) - j10) + j16 + (j28 >> 32);
        iArr3[4] = (int) j29;
        long j30 = (((long) iArr[5]) & 4294967295L) + j20 + j12 + (j29 >> 32);
        iArr3[5] = (int) j30;
        long j31 = (((long) iArr[6]) & 4294967295L) + j25 + j16 + j17 + (j30 >> 32);
        iArr3[6] = (int) j31;
        long j32 = (4294967295L & ((long) iArr[7])) + j22 + j20 + j23 + (j31 >> 32);
        iArr3[7] = (int) j32;
        N0((int) (j32 >> 32), iArr3);
    }

    public static k K(View view) {
        int i = R.id.backButton;
        if (((ImageButton) jc.b.q(view, R.id.backButton)) != null) {
            i = R.id.defaultProgressBar;
            if (((ProgressBar) jc.b.q(view, R.id.defaultProgressBar)) != null) {
                Toolbar toolbar = (Toolbar) view;
                return new k();
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static void K0(int[] iArr) {
        int i = iArr[16];
        int C2 = android.support.v4.media.b.C(16, i >>> 9, iArr) + (i & 511);
        if (C2 > 511 || (C2 == 511 && android.support.v4.media.b.f0(16, iArr, f3181v))) {
            C2 = (android.support.v4.media.b.F0(iArr) + C2) & 511;
        }
        iArr[16] = C2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.k.L(java.lang.Object, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L0(int r14, int[] r15) {
        /*
            r0 = 5
            r1 = 21389(0x538d, float:2.9972E-41)
            if (r14 == 0) goto L_0x0040
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
            if (r2 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r14 = 3
            int r14 = android.support.v4.media.b.H0(r0, r15, r14)
        L_0x003e:
            if (r14 != 0) goto L_0x004e
        L_0x0040:
            r14 = 4
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f3175a
            boolean r14 = android.support.v4.media.b.A0(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            android.support.v4.media.b.o(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.k.L0(int, int[]):void");
    }

    public static void M0(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = ((long) i) & 4294967295L;
            long j12 = ((((long) iArr[0]) & 4294967295L) - j11) + 0;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = (4294967295L & ((long) iArr[3])) + j11 + j13;
            iArr[3] = (int) j16;
            j10 = j16 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 != 0 && android.support.v4.media.b.G0(7, iArr, 4) != 0) || (iArr[6] == -1 && android.support.v4.media.b.C0(iArr, f3178s))) {
            E(iArr);
        }
    }

    public static final void N(p pVar, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th2);
            }
        }
        pVar.c(cancellationException);
    }

    public static void N0(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = ((long) i) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11 + 0;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                j13 = j14 >> 32;
            }
            long j15 = ((((long) iArr[2]) & 4294967295L) - j11) + j13;
            iArr[2] = (int) j15;
            long j16 = (((long) iArr[3]) & 4294967295L) + j11 + (j15 >> 32);
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j19;
                long j20 = (j19 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j20;
                j17 = j20 >> 32;
            }
            long j21 = (4294967295L & ((long) iArr[7])) + j11 + j17;
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && android.support.v4.media.b.D0(iArr, F))) {
            F(iArr);
        }
    }

    public static void O(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void O0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        android.support.v4.media.b.M1(iArr, iArr3);
        G0(iArr3, iArr2);
    }

    public static int P(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    public static void P0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        android.support.v4.media.b.O1(iArr, iArr3);
        H0(iArr3, iArr2);
    }

    public static int Q(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static void Q0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        q0(iArr, iArr3);
        I0(iArr3, iArr2);
    }

    public static Object R(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.a.b(20, "at index ", i));
    }

    public static void R0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        J0(iArr3, iArr2);
    }

    public static Object S(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void S0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        android.support.v4.media.b.M1(iArr, iArr3);
        while (true) {
            G0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.M1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static final int T(int i) {
        boolean z10 = false;
        if (2 <= i && i < 37) {
            z10 = true;
        }
        if (z10) {
            return i;
        }
        StringBuilder d10 = a8.a.d("radix ", i, " was not in valid range ");
        d10.append(new ce.c(2, 36));
        throw new IllegalArgumentException(d10.toString());
    }

    public static void T0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        android.support.v4.media.b.P1(iArr, iArr3);
        while (true) {
            J0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.P1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void U(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    public static void U0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.W1(iArr, iArr2, iArr3) != 0) {
            android.support.v4.media.b.a2(5, 21389, iArr3);
        }
    }

    public static byte[] V(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            byte b10 = 0;
            long v02 = (v0(bArr3, 0) >> 0) & 67108863 & 67108863;
            long v03 = (v0(bArr3, 3) >> 2) & 67108863 & 67108611;
            long v04 = (v0(bArr3, 6) >> 4) & 67108863 & 67092735;
            long v05 = (v0(bArr3, 9) >> 6) & 67108863 & 66076671;
            long v06 = (v0(bArr3, 12) >> 8) & 67108863 & 1048575;
            long j10 = v03 * 5;
            long j11 = v04 * 5;
            long j12 = v05 * 5;
            long j13 = v06 * 5;
            int i = 17;
            byte[] bArr5 = new byte[17];
            long j14 = 0;
            int i10 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i10 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i10);
                System.arraycopy(bArr4, i10, bArr5, b10, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i, b10);
                }
                long v07 = j18 + ((v0(bArr5, b10) >> b10) & 67108863);
                long v08 = j14 + ((v0(bArr5, 3) >> 2) & 67108863);
                long v09 = j15 + ((v0(bArr5, 6) >> 4) & 67108863);
                long v010 = j16 + ((v0(bArr5, 9) >> 6) & 67108863);
                long v011 = j17 + (((v0(bArr5, 12) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
                long j19 = (v011 * j10) + (v010 * j11) + (v09 * j12) + (v08 * j13) + (v07 * v02);
                long j20 = (v011 * j11) + (v010 * j12) + (v09 * j13) + (v08 * v02) + (v07 * v03);
                long j21 = (v011 * j12) + (v010 * j13) + (v09 * v02) + (v08 * v03) + (v07 * v04);
                long j22 = (v010 * v02) + (v09 * v03) + (v08 * v04) + (v07 * v05);
                long j23 = v010 * v03;
                long j24 = v011 * v02;
                long j25 = j20 + (j19 >> 26);
                long j26 = j21 + (j25 >> 26);
                long j27 = (v011 * j13) + j22 + (j26 >> 26);
                long j28 = j24 + j23 + (v09 * v04) + (v08 * v05) + (v07 * v06) + (j27 >> 26);
                long j29 = j28 >> 26;
                j17 = j28 & 67108863;
                long j30 = (j29 * 5) + (j19 & 67108863);
                i10 += 16;
                j15 = j26 & 67108863;
                j16 = j27 & 67108863;
                j18 = j30 & 67108863;
                j14 = (j25 & 67108863) + (j30 >> 26);
                b10 = 0;
                i = 17;
            }
            long j31 = j15 + (j14 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j16 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = j17 + (j33 >> 26);
            long j36 = j35 & 67108863;
            long j37 = ((j35 >> 26) * 5) + j18;
            long j38 = j37 >> 26;
            long j39 = j37 & 67108863;
            long j40 = (j14 & 67108863) + j38;
            long j41 = j39 + 5;
            long j42 = j41 & 67108863;
            long j43 = j40 + (j41 >> 26);
            long j44 = j32 + (j43 >> 26);
            long j45 = j34 + (j44 >> 26);
            long j46 = (j36 + (j45 >> 26)) - 67108864;
            long j47 = j46 >> 63;
            long j48 = ~j47;
            long j49 = (j40 & j47) | (j43 & 67108863 & j48);
            long j50 = (j32 & j47) | (j44 & 67108863 & j48);
            long j51 = (j45 & 67108863 & j48) | (j34 & j47);
            long j52 = (j46 & j48) | (j36 & j47);
            long v012 = v0(bArr3, 16) + (((j39 & j47) | (j42 & j48) | (j49 << 26)) & 4294967295L);
            long j53 = v012 & 4294967295L;
            long v013 = v0(bArr3, 20) + (((j49 >> 6) | (j50 << 20)) & 4294967295L) + (v012 >> 32);
            long v014 = v0(bArr3, 24) + (((j50 >> 12) | (j51 << 14)) & 4294967295L) + (v013 >> 32);
            long v015 = v0(bArr3, 28);
            byte[] bArr6 = new byte[16];
            Y0(bArr6, j53, 0);
            Y0(bArr6, v013 & 4294967295L, 4);
            Y0(bArr6, v014 & 4294967295L, 8);
            Y0(bArr6, (v015 + (((j51 >> 18) | (j52 << 8)) & 4294967295L) + (v014 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static void V0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Y1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = ((4294967295L & ((long) iArr3[3])) - 1) + j11;
            iArr3[3] = (int) j14;
            if ((j14 >> 32) != 0) {
                android.support.v4.media.b.Y(7, iArr3, 4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01bd, code lost:
        if (r3 == 0) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012c, code lost:
        if (r11 == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012e, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017d, code lost:
        if (r11 == false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0196 A[SYNTHETIC, Splitter:B:100:0x0196] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01dc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0178 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0195 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final oe.b W(de.b r16, oe.b... r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.Class<oe.d> r2 = oe.d.class
            java.lang.Class<oe.b> r3 = oe.b.class
            java.lang.String r4 = "args"
            e6.e.D(r1, r4)
            java.lang.Class r4 = aa.b.G(r16)
            boolean r5 = r4.isEnum()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0048
            java.lang.Class<oe.e> r5 = oe.e.class
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            if (r5 != 0) goto L_0x002b
            java.lang.Class<oe.c> r5 = oe.c.class
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            if (r5 != 0) goto L_0x002b
            r5 = r7
            goto L_0x002c
        L_0x002b:
            r5 = r6
        L_0x002c:
            if (r5 == 0) goto L_0x0048
            java.lang.Object[] r0 = r4.getEnumConstants()
            re.r r1 = new re.r
            java.lang.String r2 = r4.getCanonicalName()
            java.lang.String r3 = "canonicalName"
            e6.e.C(r2, r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>"
            java.util.Objects.requireNonNull(r0, r3)
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            r1.<init>(r2, r0)
            return r1
        L_0x0048:
            boolean r5 = r4.isInterface()
            r8 = 0
            if (r5 == 0) goto L_0x0075
            java.lang.Class r1 = aa.b.G(r16)
            java.lang.Class<oe.e> r3 = oe.e.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r3)
            oe.e r1 = (oe.e) r1
            if (r1 == 0) goto L_0x006f
            java.lang.Class r1 = r1.with()
            de.b r1 = yd.v.a(r1)
            de.b r2 = yd.v.a(r2)
            boolean r1 = e6.e.r(r1, r2)
            if (r1 == 0) goto L_0x0074
        L_0x006f:
            oe.d r8 = new oe.d
            r8.<init>(r0)
        L_0x0074:
            return r8
        L_0x0075:
            int r5 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            oe.b[] r1 = (oe.b[]) r1
            java.lang.String r5 = "Companion"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r9 = "companion"
            e6.e.C(r5, r9)     // Catch:{ all -> 0x008f }
            r5.setAccessible(r7)     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x008f }
            goto L_0x0090
        L_0x008f:
            r5 = r8
        L_0x0090:
            java.lang.String r9 = "serializer"
            if (r5 == 0) goto L_0x00e4
            int r10 = r1.length     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            if (r10 != 0) goto L_0x0099
            r10 = r7
            goto L_0x009a
        L_0x0099:
            r10 = r6
        L_0x009a:
            if (r10 == 0) goto L_0x009f
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            goto L_0x00ab
        L_0x009f:
            int r10 = r1.length     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            r12 = r6
        L_0x00a3:
            if (r12 >= r10) goto L_0x00aa
            r11[r12] = r3     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            int r12 = r12 + 1
            goto L_0x00a3
        L_0x00aa:
            r10 = r11
        L_0x00ab:
            java.lang.Class r11 = r5.getClass()     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            int r12 = r10.length     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r12)     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.Class[] r10 = (java.lang.Class[]) r10     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.reflect.Method r10 = r11.getDeclaredMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            int r11 = r1.length     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r11)     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            java.lang.Object r1 = r10.invoke(r5, r1)     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            boolean r5 = r1 instanceof oe.b     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            if (r5 != 0) goto L_0x00c8
            r1 = r8
        L_0x00c8:
            oe.b r1 = (oe.b) r1     // Catch:{ NoSuchMethodException -> 0x00e4, InvocationTargetException -> 0x00cb }
            goto L_0x00e5
        L_0x00cb:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00e3
            java.lang.reflect.InvocationTargetException r2 = new java.lang.reflect.InvocationTargetException
            java.lang.String r3 = r1.getMessage()
            if (r3 == 0) goto L_0x00db
            goto L_0x00df
        L_0x00db:
            java.lang.String r3 = r0.getMessage()
        L_0x00df:
            r2.<init>(r1, r3)
            throw r2
        L_0x00e3:
            throw r0
        L_0x00e4:
            r1 = r8
        L_0x00e5:
            if (r1 == 0) goto L_0x00e8
            return r1
        L_0x00e8:
            java.lang.reflect.Field[] r1 = r4.getDeclaredFields()
            java.lang.String r5 = "jClass.declaredFields"
            e6.e.C(r1, r5)
            int r5 = r1.length
            r10 = r6
            r11 = r10
            r12 = r8
        L_0x00f5:
            java.lang.String r13 = "INSTANCE"
            java.lang.String r14 = "it"
            if (r10 >= r5) goto L_0x012c
            r15 = r1[r10]
            e6.e.C(r15, r14)
            java.lang.String r7 = r15.getName()
            boolean r7 = e6.e.r(r7, r13)
            if (r7 == 0) goto L_0x0120
            java.lang.Class r7 = r15.getType()
            boolean r7 = e6.e.r(r7, r4)
            if (r7 == 0) goto L_0x0120
            int r7 = r15.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L_0x0120
            r7 = 1
            goto L_0x0121
        L_0x0120:
            r7 = r6
        L_0x0121:
            if (r7 == 0) goto L_0x0128
            if (r11 == 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            r12 = r15
            r11 = 1
        L_0x0128:
            int r10 = r10 + 1
            r7 = 1
            goto L_0x00f5
        L_0x012c:
            if (r11 != 0) goto L_0x012f
        L_0x012e:
            r12 = r8
        L_0x012f:
            if (r12 == 0) goto L_0x0191
            java.lang.Object r1 = r12.get(r8)
            java.lang.reflect.Method[] r5 = r4.getMethods()
            java.lang.String r7 = "jClass.methods"
            e6.e.C(r5, r7)
            int r7 = r5.length
            r10 = r6
            r11 = r10
            r12 = r8
        L_0x0142:
            if (r10 >= r7) goto L_0x017d
            r15 = r5[r10]
            e6.e.C(r15, r14)
            java.lang.String r8 = r15.getName()
            boolean r8 = e6.e.r(r8, r9)
            if (r8 == 0) goto L_0x0170
            java.lang.Class[] r8 = r15.getParameterTypes()
            java.lang.String r6 = "it.parameterTypes"
            e6.e.C(r8, r6)
            int r6 = r8.length
            if (r6 != 0) goto L_0x0161
            r6 = 1
            goto L_0x0162
        L_0x0161:
            r6 = 0
        L_0x0162:
            if (r6 == 0) goto L_0x0170
            java.lang.Class r6 = r15.getReturnType()
            boolean r6 = e6.e.r(r6, r3)
            if (r6 == 0) goto L_0x0170
            r6 = 1
            goto L_0x0171
        L_0x0170:
            r6 = 0
        L_0x0171:
            if (r6 == 0) goto L_0x0178
            if (r11 == 0) goto L_0x0176
            goto L_0x017f
        L_0x0176:
            r12 = r15
            r11 = 1
        L_0x0178:
            int r10 = r10 + 1
            r6 = 0
            r8 = 0
            goto L_0x0142
        L_0x017d:
            if (r11 != 0) goto L_0x0180
        L_0x017f:
            r12 = 0
        L_0x0180:
            r3 = 0
            if (r12 == 0) goto L_0x0192
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Object r1 = r12.invoke(r1, r5)
            boolean r5 = r1 instanceof oe.b
            if (r5 != 0) goto L_0x018e
            r1 = 0
        L_0x018e:
            oe.b r1 = (oe.b) r1
            goto L_0x0193
        L_0x0191:
            r3 = r6
        L_0x0192:
            r1 = 0
        L_0x0193:
            if (r1 == 0) goto L_0x0196
            return r1
        L_0x0196:
            java.lang.Class[] r1 = r4.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x01d8 }
            java.lang.String r4 = "jClass.declaredClasses"
            e6.e.C(r1, r4)     // Catch:{ NoSuchFieldException -> 0x01d8 }
            int r4 = r1.length     // Catch:{ NoSuchFieldException -> 0x01d8 }
            r6 = r3
            r5 = 0
        L_0x01a2:
            if (r6 >= r4) goto L_0x01bd
            r7 = r1[r6]     // Catch:{ NoSuchFieldException -> 0x01d8 }
            e6.e.C(r7, r14)     // Catch:{ NoSuchFieldException -> 0x01d8 }
            java.lang.String r8 = r7.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x01d8 }
            java.lang.String r9 = "$serializer"
            boolean r8 = e6.e.r(r8, r9)     // Catch:{ NoSuchFieldException -> 0x01d8 }
            if (r8 == 0) goto L_0x01ba
            if (r3 == 0) goto L_0x01b8
            goto L_0x01bf
        L_0x01b8:
            r5 = r7
            r3 = 1
        L_0x01ba:
            int r6 = r6 + 1
            goto L_0x01a2
        L_0x01bd:
            if (r3 != 0) goto L_0x01c0
        L_0x01bf:
            r5 = 0
        L_0x01c0:
            if (r5 == 0) goto L_0x01ce
            java.lang.reflect.Field r1 = r5.getField(r13)     // Catch:{ NoSuchFieldException -> 0x01d8 }
            if (r1 == 0) goto L_0x01ce
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ NoSuchFieldException -> 0x01d9 }
            goto L_0x01d0
        L_0x01ce:
            r3 = 0
            r1 = r3
        L_0x01d0:
            boolean r4 = r1 instanceof oe.b     // Catch:{ NoSuchFieldException -> 0x01d9 }
            if (r4 != 0) goto L_0x01d5
            r1 = r3
        L_0x01d5:
            oe.b r1 = (oe.b) r1     // Catch:{ NoSuchFieldException -> 0x01d9 }
            goto L_0x01da
        L_0x01d8:
            r3 = 0
        L_0x01d9:
            r1 = r3
        L_0x01da:
            if (r1 == 0) goto L_0x01dd
            return r1
        L_0x01dd:
            java.lang.Class r1 = aa.b.G(r16)
            java.lang.Class<oe.c> r4 = oe.c.class
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r4)
            if (r4 == 0) goto L_0x01ef
            oe.d r8 = new oe.d
            r8.<init>(r0)
            goto L_0x0212
        L_0x01ef:
            java.lang.Class<oe.e> r4 = oe.e.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r4)
            oe.e r1 = (oe.e) r1
            if (r1 == 0) goto L_0x0211
            java.lang.Class r1 = r1.with()
            de.b r1 = yd.v.a(r1)
            de.b r2 = yd.v.a(r2)
            boolean r1 = e6.e.r(r1, r2)
            if (r1 == 0) goto L_0x0211
            oe.d r8 = new oe.d
            r8.<init>(r0)
            goto L_0x0212
        L_0x0211:
            r8 = r3
        L_0x0212:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.k.W(de.b, oe.b[]):oe.b");
    }

    public static void W0(int[] iArr, int[] iArr2, int[] iArr3) {
        int R1 = (android.support.v4.media.b.R1(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (R1 < 0) {
            int i = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= 16) {
                    i = -1;
                    break;
                }
                int i11 = iArr3[i10] - 1;
                iArr3[i10] = i11;
                if (i11 != -1) {
                    break;
                }
                i10++;
            }
            R1 = (R1 + i) & 511;
        }
        iArr3[16] = R1;
    }

    public static byte[] X(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    public static void X0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Z1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                j11 = j12 >> 32;
            }
            long j13 = (((long) iArr3[2]) & 4294967295L) + 1 + j11;
            iArr3[2] = (int) j13;
            long j14 = ((((long) iArr3[3]) & 4294967295L) - 1) + (j13 >> 32);
            iArr3[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j16;
                long j17 = (j16 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j17;
                long j18 = (j17 >> 32) + (((long) iArr3[6]) & 4294967295L);
                iArr3[6] = (int) j18;
                j15 = j18 >> 32;
            }
            iArr3[7] = (int) (((4294967295L & ((long) iArr3[7])) - 1) + j15);
        }
    }

    public static short[] Y(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public static void Y0(byte[] bArr, long j10, int i) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i + i10] = (byte) ((int) (255 & j10));
            i10++;
            j10 >>= 8;
        }
    }

    public static byte[][] Z(short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i10 = 0; i10 < sArr[0].length; i10++) {
                bArr[i][i10] = (byte) sArr[i][i10];
            }
        }
        return bArr;
    }

    public static void Z0(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.F1(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && android.support.v4.media.b.A0(iArr2, f3175a))) {
            android.support.v4.media.b.o(5, 21389, iArr2);
        }
    }

    public static short[][] a0(byte[][] bArr) {
        int length = bArr.length;
        int[] iArr = new int[2];
        iArr[1] = bArr[0].length;
        iArr[0] = length;
        short[][] sArr = (short[][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                sArr[i][i10] = (short) (bArr[i][i10] & 255);
            }
        }
        return sArr;
    }

    public static void a1(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.F1(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && android.support.v4.media.b.C0(iArr2, f3178s))) {
            E(iArr2);
        }
    }

    public static byte[][][] b0(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = sArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i10 = 0; i10 < sArr[0].length; i10++) {
                for (int i11 = 0; i11 < sArr[0][0].length; i11++) {
                    bArr[i][i10][i11] = (byte) sArr[i][i10][i11];
                }
            }
        }
        return bArr;
    }

    public static short[][][] c0(byte[][][] bArr) {
        int length = bArr.length;
        int length2 = bArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = bArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i10 = 0; i10 < bArr[0].length; i10++) {
                for (int i11 = 0; i11 < bArr[0][0].length; i11++) {
                    sArr[i][i10][i11] = (short) (bArr[i][i10][i11] & 255);
                }
            }
        }
        return sArr;
    }

    public static void c1(boolean z10, String str) {
        if (!z10) {
            throw new RuntimeException(str);
        }
    }

    public static final Object d0(xd.p pVar, pd.d dVar) {
        le.q qVar = new le.q(dVar.getContext(), dVar);
        Object n02 = aa.b.n0(qVar, qVar, pVar);
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        return n02;
    }

    public static float e1() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final Object f0(long j10, pd.d dVar) {
        if (j10 <= 0) {
            return m.f8555a;
        }
        l lVar = new l(ad.c.Y(dVar), 1);
        lVar.u();
        if (j10 < Long.MAX_VALUE) {
            n0(lVar.getContext()).f(j10, lVar);
        }
        Object t10 = lVar.t();
        if (t10 == qd.a.COROUTINE_SUSPENDED) {
            return t10;
        }
        return m.f8555a;
    }

    public static boolean f1(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    public static boolean g1(int i, int i10) {
        if (i == 5) {
            if (i10 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i10 != 6 && i10 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i10 != 4) {
            return true;
        }
        if (i == 3 && (i10 == 2 || i10 == 7 || i10 == 1 || i10 == 8)) {
            return true;
        }
        if (i == 2) {
            return i10 == 1 || i10 == 8;
        }
        return false;
    }

    public static final boolean h0(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static boolean h1(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    public static boolean i0(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= sArr[length] == sArr2[length];
        }
        return z10;
    }

    public static final d0 j(pd.f fVar) {
        if (fVar.get(g1.b.f5401a) == null) {
            fVar = fVar.plus(ad.c.b());
        }
        return new le.d(fVar);
    }

    public static boolean j0(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= i0(sArr[length], sArr2[length]);
        }
        return z10;
    }

    public static final long k(yi.a aVar) {
        String str;
        e.D(aVar, "$this$POP");
        Logger logger = yi.b.f13676a;
        StringBuilder q10 = a.b.q("~> POP: ");
        if (aVar.f13672e.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.valueOf(aVar.f13672e.peek().longValue()));
            sb2.append("(");
            Long peek = aVar.f13672e.peek();
            e.C(peek, "stack.peek()");
            sb2.append(j2.a.b(peek.longValue()));
            sb2.append(")");
            str = sb2.toString();
        } else {
            str = "-";
        }
        q10.append(str);
        logger.debug(q10.toString());
        yi.b.b(aVar, yi.b.f13678c);
        Long pop = aVar.f13672e.pop();
        e.C(pop, "stack.pop()");
        return pop.longValue();
    }

    public static boolean k0(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z10 &= j0(sArr[length], sArr2[length]);
        }
        return z10;
    }

    public static final long l(yi.a aVar, int i, long j10) {
        long k10 = k(aVar);
        if (i != 0) {
            long l10 = l(aVar, i - 1, j10);
            aVar.f13672e.push(Long.valueOf(k10));
            return l10;
        }
        m(aVar, j10);
        return k10;
    }

    public static String l0(i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i = 0; i < iVar.size(); i++) {
            byte b10 = iVar.b(i);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 >= 32 && b10 <= 126) {
                            sb2.append((char) b10);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final long m(yi.a aVar, long j10) {
        e.D(aVar, "$this$PUSH");
        yi.b.b(aVar, yi.b.f13679d);
        Long push = aVar.f13672e.push(Long.valueOf(j10));
        e.C(push, "stack.push(value)");
        return push.longValue();
    }

    public static final hc.b m0(String str) {
        int i;
        String str2 = str;
        e.D(str2, "words");
        String normalize = Normalizer.normalize(str2, Normalizer.Form.NFKD);
        e.C(normalize, "normalized");
        int length = normalize.length();
        int i10 = 0;
        while (true) {
            i = -1;
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (Character.isLetter(normalize.charAt(i10))) {
                break;
            } else {
                i10++;
            }
        }
        int length2 = normalize.length() - 1;
        while (true) {
            if (length2 < 0) {
                break;
            } else if (Character.isLetter(normalize.charAt(length2))) {
                i = length2;
                break;
            } else {
                length2--;
            }
        }
        String substring = normalize.substring(i10, i + 1);
        e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        fe.c cVar = g.f5932a;
        String str3 = g.f5933b;
        String b10 = cVar.b(substring, str3);
        List y12 = o.y1(b10, new String[]{str3});
        List y13 = o.y1(b10, new String[]{" "});
        if (y13.size() % 3 == 0) {
            String b12 = nd.m.b1(y13, BuildConfig.FLAVOR, (CharSequence) null, (CharSequence) null, hc.d.f5930b, 30);
            int floor = (int) (Math.floor(((double) b12.length()) / ((double) 33)) * ((double) 32));
            String substring2 = b12.substring(0, floor);
            e.C(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String substring3 = b12.substring(floor);
            e.C(substring3, "(this as java.lang.String).substring(startIndex)");
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < substring2.length(); i11++) {
                sb2.append(substring2.charAt(i11));
                String sb3 = sb2.toString();
                e.C(sb3, "tempStringBuilder.toString()");
                if (sb3.length() == 8) {
                    String sb4 = sb2.toString();
                    e.C(sb4, "tempStringBuilder.toString()");
                    if (sb4.length() > 0) {
                        arrayList.add(Byte.valueOf((byte) Integer.parseInt(sb3, 2)));
                    }
                    fe.i.V0(sb2);
                }
            }
            byte[] h12 = nd.m.h1(arrayList);
            if (h12.length < 16) {
                throw new ic.a();
            } else if (h12.length > 32) {
                throw new ic.a();
            } else if (h12.length % 4 == 0) {
                byte[] f02 = aa.b.f0(h12);
                e.C(f02, "hash");
                byte[] copyOf = Arrays.copyOf(f02, f02.length);
                e.C(copyOf, "java.util.Arrays.copyOf(this, size)");
                String substring4 = nd.m.b1(new md.k(copyOf), BuildConfig.FLAVOR, (CharSequence) null, (CharSequence) null, hc.c.f5929b, 30).substring(0, (h12.length * 8) / 32);
                e.C(substring4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (!(true ^ e.r(substring4, substring3))) {
                    return new hc.b(b10, y12, h12);
                }
                throw new ic.a();
            } else {
                throw new ic.a();
            }
        } else {
            throw new ic.a();
        }
    }

    public static final Context n(NodleContext nodleContext) {
        e.D(nodleContext, "<this>");
        return ((ac.a) nodleContext).f289a;
    }

    public static final j0 n0(pd.f fVar) {
        int i = pd.e.f9878p;
        f.a aVar = fVar.get(e.a.f9879a);
        j0 j0Var = aVar instanceof j0 ? (j0) aVar : null;
        return j0Var == null ? i0.f5406a : j0Var;
    }

    public static String o(aa.a aVar, StringBuilder sb2) {
        sb2.append(" at line " + (aVar.f184u + 1) + " column " + ((aVar.f182s - aVar.f185v) + 1) + " path " + aVar.T());
        return sb2.toString();
    }

    public static final String p(q qVar) {
        e6.e.D(qVar, "$this$ID");
        String str = qVar.f13222e.toASCIIString() + qVar.g + qVar.f13224h + ui.c.b(qVar.f13219b, 0) + qVar.f13225j + qVar.f13226k;
        Charset charset = fe.a.f5086b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        e6.e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        String uuid = UUID.nameUUIDFromBytes(bytes).toString();
        e6.e.C(uuid, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
        return uuid;
    }

    public static String q(zb.h hVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i = 0; i < hVar.size(); i++) {
            int h10 = hVar.h(i);
            if (h10 == 34) {
                str = "\\\"";
            } else if (h10 == 39) {
                str = "\\'";
            } else if (h10 != 92) {
                switch (h10) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (h10 < 32 || h10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((h10 >>> 6) & 3) + 48));
                            sb2.append((char) (((h10 >>> 3) & 7) + 48));
                            h10 = (h10 & 7) + 48;
                        }
                        sb2.append((char) h10);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static void q0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        android.support.v4.media.b.P1(iArr, iArr2);
        long j10 = 4294967295L;
        long j11 = ((long) iArr3[8]) & 4294967295L;
        int i = 16;
        int i10 = 0;
        int i11 = 7;
        int i12 = 16;
        while (true) {
            int i13 = i11 - 1;
            long j12 = j10 & ((long) iArr3[i11 + 8]);
            long j13 = j12 * j12;
            int i14 = i - 1;
            iArr4[i12 + i14] = (i10 << 31) | ((int) (j13 >>> 33));
            i = i14 - 1;
            iArr4[i12 + i] = (int) (j13 >>> 1);
            i10 = (int) j13;
            if (i13 <= 0) {
                break;
            }
            j10 = 4294967295L;
            i12 = 16;
            i11 = i13;
        }
        long j14 = j11 * j11;
        iArr4[16] = (int) j14;
        long j15 = ((long) iArr3[9]) & 4294967295L;
        long j16 = 4294967295L & ((long) iArr4[18]);
        long j17 = (j15 * j11) + ((((long) (i10 << 31)) & 4294967295L) | (j14 >>> 33));
        int i15 = (int) j17;
        iArr4[17] = (((int) (j14 >>> 32)) & 1) | (i15 << 1);
        int i16 = i15 >>> 31;
        long j18 = ((long) iArr3[10]) & 4294967295L;
        long j19 = j15;
        long j20 = ((long) iArr4[19]) & 4294967295L;
        long j21 = (j18 * j11) + j16 + (j17 >>> 32);
        int i17 = (int) j21;
        iArr4[18] = i16 | (i17 << 1);
        long a10 = android.support.v4.media.a.a(j18, j19, j21 >>> 32, j20);
        long j22 = (((long) iArr4[20]) & 4294967295L) + (a10 >>> 32);
        long j23 = ((long) iArr3[11]) & 4294967295L;
        long j24 = (((long) iArr4[21]) & 4294967295L) + (j22 >>> 32);
        long j25 = (j23 * j11) + (a10 & 4294967295L);
        int i18 = (int) j25;
        iArr4[19] = (i17 >>> 31) | (i18 << 1);
        int i19 = i18 >>> 31;
        long a11 = android.support.v4.media.a.a(j23, j19, j25 >>> 32, j22 & 4294967295L);
        long a12 = android.support.v4.media.a.a(j23, j18, a11 >>> 32, j24 & 4294967295L);
        long j26 = (((long) iArr4[22]) & 4294967295L) + (j24 >>> 32) + (a12 >>> 32);
        long j27 = a12 & 4294967295L;
        long j28 = ((long) iArr3[12]) & 4294967295L;
        long j29 = (((long) iArr4[23]) & 4294967295L) + (j26 >>> 32);
        long j30 = j26 & 4294967295L;
        long j31 = (((long) iArr4[24]) & 4294967295L) + (j29 >>> 32);
        long j32 = j29 & 4294967295L;
        long j33 = (j28 * j11) + (a11 & 4294967295L);
        int i20 = (int) j33;
        iArr4[20] = i19 | (i20 << 1);
        int i21 = i20 >>> 31;
        long a13 = android.support.v4.media.a.a(j28, j19, j33 >>> 32, j27);
        long a14 = android.support.v4.media.a.a(j28, j18, a13 >>> 32, j30);
        long j34 = j23;
        long a15 = android.support.v4.media.a.a(j28, j34, a14 >>> 32, j32);
        long j35 = a14 & 4294967295L;
        long j36 = j31 + (a15 >>> 32);
        long j37 = ((long) iArr3[13]) & 4294967295L;
        long j38 = (((long) iArr4[25]) & 4294967295L) + (j36 >>> 32);
        long j39 = j36 & 4294967295L;
        long j40 = (((long) iArr4[26]) & 4294967295L) + (j38 >>> 32);
        long j41 = j38 & 4294967295L;
        long j42 = (j37 * j11) + (a13 & 4294967295L);
        int i22 = (int) j42;
        iArr4[21] = i21 | (i22 << 1);
        int i23 = i22 >>> 31;
        long a16 = android.support.v4.media.a.a(j37, j19, j42 >>> 32, j35);
        long a17 = android.support.v4.media.a.a(j37, j18, a16 >>> 32, a15 & 4294967295L);
        long j43 = j37;
        long a18 = android.support.v4.media.a.a(j43, j34, a17 >>> 32, j39);
        long j44 = a17 & 4294967295L;
        long a19 = android.support.v4.media.a.a(j43, j28, a18 >>> 32, j41);
        long j45 = j40 + (a19 >>> 32);
        long j46 = a19 & 4294967295L;
        long j47 = ((long) iArr3[14]) & 4294967295L;
        long j48 = (((long) iArr4[27]) & 4294967295L) + (j45 >>> 32);
        long j49 = j45 & 4294967295L;
        long j50 = (((long) iArr4[28]) & 4294967295L) + (j48 >>> 32);
        long j51 = j48 & 4294967295L;
        long j52 = (j47 * j11) + (a16 & 4294967295L);
        int i24 = (int) j52;
        iArr4[22] = i23 | (i24 << 1);
        int i25 = i24 >>> 31;
        long a20 = android.support.v4.media.a.a(j47, j19, j52 >>> 32, j44);
        long a21 = android.support.v4.media.a.a(j47, j18, a20 >>> 32, a18 & 4294967295L);
        long j53 = j47;
        long a22 = android.support.v4.media.a.a(j53, j23, a21 >>> 32, j46);
        long j54 = a21 & 4294967295L;
        long a23 = android.support.v4.media.a.a(j53, j28, a22 >>> 32, j49);
        long j55 = a22 & 4294967295L;
        long a24 = android.support.v4.media.a.a(j53, j37, a23 >>> 32, j51);
        long j56 = a23 & 4294967295L;
        long j57 = j50 + (a24 >>> 32);
        long j58 = ((long) iArr3[15]) & 4294967295L;
        long j59 = (((long) iArr4[29]) & 4294967295L) + (j57 >>> 32);
        long j60 = j57 & 4294967295L;
        long j61 = (((long) iArr4[30]) & 4294967295L) + (j59 >>> 32);
        long j62 = j59 & 4294967295L;
        long j63 = (j11 * j58) + (a20 & 4294967295L);
        int i26 = (int) j63;
        iArr4[23] = i25 | (i26 << 1);
        long j64 = j58;
        long a25 = android.support.v4.media.a.a(j19, j64, j63 >>> 32, j54);
        long a26 = android.support.v4.media.a.a(j64, j18, a25 >>> 32, j55);
        long j65 = j58;
        long a27 = android.support.v4.media.a.a(j65, j23, a26 >>> 32, j56);
        long a28 = android.support.v4.media.a.a(j65, j28, a27 >>> 32, a24 & 4294967295L);
        long a29 = android.support.v4.media.a.a(j65, j37, a28 >>> 32, j60);
        long j66 = a29;
        long a30 = android.support.v4.media.a.a(j58, j47, a29 >>> 32, j62);
        long j67 = j61 + (a30 >>> 32);
        int i27 = (int) a25;
        iArr4[24] = (i26 >>> 31) | (i27 << 1);
        int i28 = (int) a26;
        iArr4[25] = (i27 >>> 31) | (i28 << 1);
        int i29 = i28 >>> 31;
        int i30 = (int) a27;
        iArr4[26] = i29 | (i30 << 1);
        int i31 = i30 >>> 31;
        int i32 = (int) a28;
        iArr4[27] = i31 | (i32 << 1);
        int i33 = i32 >>> 31;
        int i34 = (int) j66;
        iArr4[28] = i33 | (i34 << 1);
        int i35 = i34 >>> 31;
        int i36 = (int) a30;
        iArr4[29] = i35 | (i36 << 1);
        int i37 = i36 >>> 31;
        int i38 = (int) j67;
        iArr4[30] = i37 | (i38 << 1);
        iArr4[31] = (i38 >>> 31) | ((iArr4[31] + ((int) (j67 >>> 32))) << 1);
        int A2 = android.support.v4.media.b.A(iArr4, iArr4);
        int y10 = android.support.v4.media.b.y(iArr4, 24, iArr4, 16, android.support.v4.media.b.y(iArr4, 0, iArr4, 8, 0) + A2) + A2;
        int[] iArr5 = new int[8];
        android.support.v4.media.b.c0(iArr3, iArr3, iArr5);
        int[] iArr6 = new int[16];
        android.support.v4.media.b.P1(iArr5, iArr6);
        android.support.v4.media.b.B(32, android.support.v4.media.b.c2(16, iArr6, iArr4, 8) + y10, iArr4, 24);
        int i39 = iArr3[16];
        long j68 = ((long) (i39 << 1)) & 4294967295L;
        long j69 = 0;
        int i40 = 0;
        while (true) {
            int i41 = i40 + 16;
            long j70 = ((((long) iArr3[0 + i40]) & 4294967295L) * j68) + (((long) iArr4[i41]) & 4294967295L) + j69;
            iArr4[i41] = (int) j70;
            long j71 = j70 >>> 32;
            i40++;
            if (i40 >= 16) {
                iArr4[32] = (i39 * i39) + ((int) j71);
                return;
            }
            j69 = j71;
        }
    }

    public static final URI r(int i, int i10) {
        URI uri = new URI("ipn:" + i + '.' + i10);
        J(uri);
        return uri;
    }

    public static int r0(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3184y;
        return g0.a.a((double) (f14 * fArr[0]), (double) (f12 * fArr[1]), (double) (f13 * fArr[2]));
    }

    public static final qg.d s(r rVar) {
        e6.e.D(rVar, "$this$ed25519PrivateKey");
        a.b bVar = (a.b) rVar.f3216b;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters");
        return (qg.d) bVar;
    }

    public static final void t(URI uri) {
        e6.e.D(uri, "$this$checkIpnSchemeAndPath");
        if (!e6.e.r(uri.getScheme(), "ipn")) {
            throw new ci.b();
        } else if (uri.getPath() != null) {
            throw new ci.b();
        }
    }

    public static final boolean t0(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    public static final void u(Matcher matcher) {
        if (!matcher.matches()) {
            throw new ci.b();
        }
    }

    public static float u0(int i) {
        float f10 = ((float) i) / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((double) ((f10 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static final void v(p4.c cVar, af.c cVar2) {
        cVar.G0(((int) cVar2.i) == -1 ? 4 : 6);
        ArrayList arrayList = new ArrayList();
        long j10 = cVar2.f353a;
        boolean z10 = false;
        arrayList.add(0, new af.b(0, j10 > 0, j10));
        long j11 = cVar2.f354b;
        arrayList.add(1, new af.b(1, j11 > 0, j11));
        long j12 = cVar2.f355c;
        arrayList.add(2, new af.b(2, j12 > 0, j12));
        long j13 = cVar2.f356d;
        if (j13 > 0) {
            z10 = true;
        }
        arrayList.add(3, new af.b(3, z10, j13));
        arrayList.addAll(cVar2.f357e);
        cVar.G0(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            af.b bVar = (af.b) it.next();
            e6.e.D(bVar, "item");
            cVar.G0(bVar.f351b ? 2 : 1);
            cVar.z0(bVar.f351b);
            if (bVar.f351b) {
                cVar.E0(bVar.f352c);
            }
            cVar.A0();
        }
        cVar.A0();
        cVar.D0(cVar2.f358f);
        b1.f(cVar, cVar2.g);
        cVar.E0(cVar2.f359h);
        long j14 = cVar2.i;
        if (((int) j14) != -1) {
            cVar.E0(j14);
            cVar.E0(cVar2.f360j);
        }
        cVar.A0();
    }

    public static long v0(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static void w(si.a aVar, StringBuilder sb2, String str, Logger logger) {
        sb2.append(jc.b.e(aVar));
        sb2.append(str);
        logger.debug(sb2.toString());
    }

    public static void w0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        android.support.v4.media.b.m1(iArr, iArr2, iArr4);
        G0(iArr4, iArr3);
    }

    public static final void x(yi.a aVar, byte[] bArr) {
        e6.e.D(aVar, "$this$PUSH");
        e6.e.D(bArr, "bytes");
        if (bArr.length <= 8) {
            ByteBuffer wrap = ByteBuffer.wrap(nd.d.J(new byte[(8 - bArr.length)], bArr));
            e6.e.C(wrap, "ByteBuffer.wrap(ByteArray(8-bytes.size)+bytes)");
            m(aVar, wrap.getLong());
            return;
        }
        wi.a aVar2 = wi.a.InvalidOpcode;
        StringBuilder q10 = a.b.q("unsupported opcode PUSH");
        q10.append(bArr.length);
        throw new wi.c(aVar2, q10.toString());
    }

    public static void x0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        android.support.v4.media.b.o1(iArr, iArr2, iArr4);
        H0(iArr4, iArr3);
    }

    public static void y(yi.a aVar, byte[] bArr, yi.a aVar2, int i) {
        e6.e.D(aVar, "vm");
        e6.e.D(bArr, "<anonymous parameter 1>");
        e6.e.D(aVar2, "$this$SWAP");
        Long pop = aVar2.f13672e.pop();
        e6.e.C(pop, "stack.pop()");
        m(aVar2, l(aVar2, i - 1, pop.longValue()));
    }

    public static void y0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = new int[33];
        android.support.v4.media.b.p1(iArr4, iArr5, iArr6);
        long j10 = ((long) iArr5[8]) & 4294967295L;
        long j11 = ((long) iArr5[9]) & 4294967295L;
        long j12 = ((long) iArr5[10]) & 4294967295L;
        long j13 = ((long) iArr5[11]) & 4294967295L;
        long j14 = ((long) iArr5[12]) & 4294967295L;
        long j15 = ((long) iArr5[13]) & 4294967295L;
        long j16 = ((long) iArr5[14]) & 4294967295L;
        long j17 = ((long) iArr5[15]) & 4294967295L;
        long j18 = ((long) iArr4[8]) & 4294967295L;
        long j19 = 0;
        long j20 = (j18 * j10) + 0;
        long j21 = j10;
        iArr6[16] = (int) j20;
        long j22 = (j18 * j11) + (j20 >>> 32);
        iArr6[17] = (int) j22;
        long j23 = (j18 * j12) + (j22 >>> 32);
        iArr6[18] = (int) j23;
        long j24 = (j18 * j13) + (j23 >>> 32);
        iArr6[19] = (int) j24;
        long j25 = (j18 * j14) + (j24 >>> 32);
        iArr6[20] = (int) j25;
        long j26 = (j18 * j15) + (j25 >>> 32);
        iArr6[21] = (int) j26;
        long j27 = (j18 * j16) + (j26 >>> 32);
        iArr6[22] = (int) j27;
        long j28 = (j18 * j17) + (j27 >>> 32);
        iArr6[23] = (int) j28;
        iArr6[24] = (int) (j28 >>> 32);
        int i = 1;
        int i10 = 1;
        int i11 = 16;
        while (i10 < 8) {
            i11 += i;
            int i12 = i10;
            long j29 = ((long) iArr[i10 + 8]) & 4294967295L;
            int i13 = i11 + 0;
            long j30 = j29;
            long j31 = (j29 * j21) + (((long) iArr6[i13]) & 4294967295L) + 0;
            iArr6[i13] = (int) j31;
            int i14 = i11 + 1;
            int[] iArr7 = iArr6;
            long j32 = (j30 * j11) + (((long) iArr6[i14]) & 4294967295L) + (j31 >>> 32);
            iArr7[i14] = (int) j32;
            int i15 = i11 + 2;
            long j33 = (j30 * j12) + (((long) iArr7[i15]) & 4294967295L) + (j32 >>> 32);
            iArr7[i15] = (int) j33;
            int i16 = i11 + 3;
            long j34 = (j30 * j13) + (((long) iArr7[i16]) & 4294967295L) + (j33 >>> 32);
            iArr7[i16] = (int) j34;
            int i17 = i11 + 4;
            long j35 = (j30 * j14) + (((long) iArr7[i17]) & 4294967295L) + (j34 >>> 32);
            iArr7[i17] = (int) j35;
            int i18 = i11 + 5;
            long j36 = (j30 * j15) + (((long) iArr7[i18]) & 4294967295L) + (j35 >>> 32);
            iArr7[i18] = (int) j36;
            int i19 = i11 + 6;
            long j37 = (j30 * j16) + (((long) iArr7[i19]) & 4294967295L) + (j36 >>> 32);
            iArr7[i19] = (int) j37;
            int i20 = i11 + 7;
            long j38 = (j30 * j17) + (((long) iArr7[i20]) & 4294967295L) + (j37 >>> 32);
            iArr7[i20] = (int) j38;
            iArr7[i11 + 8] = (int) (j38 >>> 32);
            i10 = i12 + 1;
            j11 = j11;
            iArr6 = iArr7;
            i = 1;
        }
        int[] iArr8 = iArr;
        int[] iArr9 = iArr6;
        int A2 = android.support.v4.media.b.A(iArr9, iArr9);
        int i21 = 0;
        int y10 = android.support.v4.media.b.y(iArr9, 24, iArr9, 16, android.support.v4.media.b.y(iArr9, 0, iArr9, 8, 0) + A2) + A2;
        int[] iArr10 = new int[8];
        int[] iArr11 = new int[8];
        int[] iArr12 = iArr2;
        boolean z10 = android.support.v4.media.b.c0(iArr8, iArr8, iArr10) != android.support.v4.media.b.c0(iArr12, iArr12, iArr11);
        int[] iArr13 = new int[16];
        android.support.v4.media.b.p1(iArr10, iArr11, iArr13);
        android.support.v4.media.b.B(32, y10 + (z10 ? android.support.v4.media.b.w(16, iArr13, iArr9, 8) : android.support.v4.media.b.c2(16, iArr13, iArr9, 8)), iArr9, 24);
        int i22 = iArr8[16];
        int i23 = iArr12[16];
        long j39 = ((long) i22) & 4294967295L;
        long j40 = ((long) i23) & 4294967295L;
        while (true) {
            int i24 = i21 + 16;
            long j41 = j39;
            long j42 = ((((long) iArr8[i21]) & 4294967295L) * j40) + ((((long) iArr12[i21]) & 4294967295L) * j39) + (((long) iArr9[i24]) & 4294967295L) + j19;
            iArr9[i24] = (int) j42;
            long j43 = j42 >>> 32;
            i21++;
            if (i21 >= 16) {
                iArr9[32] = (i22 * i23) + ((int) j43);
                I0(iArr9, iArr3);
                return;
            }
            int[] iArr14 = iArr3;
            j19 = j43;
            j39 = j41;
        }
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.k(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && android.support.v4.media.b.A0(iArr3, f3175a))) {
            android.support.v4.media.b.o(5, 21389, iArr3);
        }
    }

    public static void z0(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        android.support.v4.media.b.p1(iArr, iArr2, iArr4);
        J0(iArr4, iArr3);
    }

    public boolean M(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public Object a() {
        return new ConcurrentHashMap();
    }

    public boolean b() {
        return Boolean.parseBoolean(v.K("subscan_enabled"));
    }

    public void b1(String str) {
        if (M(2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public String d() {
        return v.K("subscan_api_url");
    }

    public void d1(String str, Throwable th2) {
        if (M(5)) {
            Log.w("FirebaseCrashlytics", str, th2);
        }
    }

    public void e(View view) {
    }

    public void e0(String str) {
        if (M(3)) {
            Log.d("FirebaseCrashlytics", str, (Throwable) null);
        }
    }

    public boolean f(Object obj, File file, g3.h hVar) {
        try {
            c4.a.b(((t3.c) ((w) obj).get()).f11292a.f11302a.f11304a.getData().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    public void g0(String str, Throwable th2) {
        if (M(6)) {
            Log.e("FirebaseCrashlytics", str, th2);
        }
    }

    public g3.c h(g3.h hVar) {
        return g3.c.SOURCE;
    }

    public void i() {
    }

    public String o0() {
        return v.K("reward_source_accounts");
    }

    public String p0() {
        return v.K("vip_whitelist");
    }

    public byte[] s0(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        } else if (i <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return bArr2;
        }
    }

    public int zza(int i) {
        return i;
    }

    public /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(r2.f8010a);
        y.c.s0(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
