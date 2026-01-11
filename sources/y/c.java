package y;

import ag.u0;
import ah.v;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.l1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import b6.b;
import bd.i;
import c4.a;
import com.google.android.gms.common.api.Api;
import fe.k;
import ge.l;
import ge.q0;
import ge.r0;
import i3.w;
import io.nodle.cash.utils.AutoClearedProperty;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.IDN;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l6.b1;
import l6.s;
import le.r;
import le.x;
import md.g;
import mg.e;
import mg.f;
import mg.g;
import mg.h;
import mg.j;
import nd.o;
import pd.d;
import v7.a;
import zc.p;

public final class c implements u3.c, a, lg.a {

    /* renamed from: a  reason: collision with root package name */
    public static c f13316a;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13317b = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f13318c = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f13319s = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* renamed from: t  reason: collision with root package name */
    public static final r f13320t = new r("REMOVED_TASK");

    /* renamed from: u  reason: collision with root package name */
    public static final r f13321u = new r("CLOSED_EMPTY");

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f13322v = {0, 4489, 8978, 12955, 17956, 22445, 25910, 29887, 35912, 40385, 44890, 48851, 51820, 56293, 59774, 63735, 4225, 264, 13203, 8730, 22181, 18220, 30135, 25662, 40137, 36160, 49115, 44626, 56045, 52068, 63999, 59510, 8450, 12427, 528, 5017, 26406, 30383, 17460, 21949, 44362, 48323, 36440, 40913, 60270, 64231, 51324, 55797, 12675, 8202, 4753, 792, 30631, 26158, 21685, 17724, 48587, 44098, 40665, 36688, 64495, 60006, 55549, 51572, 16900, 21389, 24854, 28831, 1056, 5545, 10034, 14011, 52812, 57285, 60766, 64727, 34920, 39393, 43898, 47859, 21125, 17164, 29079, 24606, 5281, 1320, 14259, 9786, 57037, 53060, 64991, 60502, 39145, 35168, 48123, 43634, 25350, 29327, 16404, 20893, 9506, 13483, 1584, 6073, 61262, 65223, 52316, 56789, 43370, 47331, 35448, 39921, 29575, 25102, 20629, 16668, 13731, 9258, 5809, 1848, 65487, 60998, 56541, 52564, 47595, 43106, 39673, 35696, 33800, 38273, 42778, 46739, 49708, 54181, 57662, 61623, 2112, 6601, 11090, 15067, 20068, 24557, 28022, 31999, 38025, 34048, 47003, 42514, 53933, 49956, 61887, 57398, 6337, 2376, 15315, 10842, 24293, 20332, 32247, 27774, 42250, 46211, 34328, 38801, 58158, 62119, 49212, 53685, 10562, 14539, 2640, 7129, 28518, 32495, 19572, 24061, 46475, 41986, 38553, 34576, 62383, 57894, 53437, 49460, 14787, 10314, 6865, 2904, 32743, 28270, 23797, 19836, 50700, 55173, 58654, 62615, 32808, 37281, 41786, 45747, 19012, 23501, 26966, 30943, 3168, 7657, 12146, 16123, 54925, 50948, 62879, 58390, 37033, 33056, 46011, 41522, 23237, 19276, 31191, 26718, 7393, 3432, 16371, 11898, 59150, 63111, 50204, 54677, 41258, 45219, 33336, 37809, 27462, 31439, 18516, 23005, 11618, 15595, 3696, 8185, 63375, 58886, 54429, 50452, 45483, 40994, 37561, 33584, 31687, 27214, 22741, 18780, 15843, 11370, 7921, 3960};

    /* renamed from: w  reason: collision with root package name */
    public static final long[] f13323w = {0, 4067132163L, 3778769143L, 324072436, 3348797215L, 904991772, 648144872, 3570033899L, 2329499855L, 2024987596, 1809983544, 2575936315L, 1296289744, 3207089363L, 2893594407L, 1578318884, 274646895, 3795141740L, 4049975192L, 51262619, 3619967088L, 632279923, 922689671, 3298075524L, 2592579488L, 1760304291, 2075979607, 2312596564L, 1562183871, 2943781820L, 3156637768L, 1313733451, 549293790, 3537243613L, 3246849577L, 871202090, 3878099393L, 357341890, 102525238, 4101499445L, 2858735121L, 1477399826, 1264559846, 3107202533L, 1845379342, 2677391885L, 2361733625L, 2125378298, 820201905, 3263744690L, 3520608582L, 598981189, 4151959214L, 85089709, 373468761, 3827903834L, 3124367742L, 1213305469, 1526817161, 2842354314L, 2107672161, 2412447074L, 2627466902L, 1861252501, 1098587580, 3004210879L, 2688576843L, 1378610760, 2262928035L, 1955203488, 1742404180, 2511436119L, 3416409459L, 969524848, 714683780, 3639785095L, 205050476, 4266873199L, 3976438427L, 526918040, 1361435347, 2739821008L, 2954799652L, 1114974503, 2529119692L, 1691668175, 2005155131, 2247081528L, 3690758684L, 697762079, 986182379, 3366744552L, 476452099, 3993867776L, 4250756596L, 255256311, 1640403810, 2477592673L, 2164122517L, 1922457750, 2791048317L, 1412925310, 1197962378, 3037525897L, 3944729517L, 427051182, 170179418, 4165941337L, 746937522, 3740196785L, 3451792453L, 1070968646, 1905808397, 2213795598L, 2426610938L, 1657317369, 3053634322L, 1147748369, 1463399397, 2773627110L, 4215344322L, 153784257, 444234805, 3893493558L, 1021025245, 3467647198L, 3722505002L, 797665321, 2197175160L, 1889384571, 1674398607, 2443626636L, 1164749927, 3070701412L, 2757221520L, 1446797203, 137323447, 4198817972L, 3910406976L, 461344835, 3484808360L, 1037989803, 781091935, 3705997148L, 2460548119L, 1623424788, 1939049696, 2180517859L, 1429367560, 2807687179L, 3020495871L, 1180866812, 410100952, 3927582683L, 4182430767L, 186734380, 3756733383L, 763408580, 1053836080, 3434856499L, 2722870694L, 1344288421, 1131464017, 2971354706L, 1708204729, 2545590714L, 2229949006L, 1988219213, 680717673, 3673779818L, 3383336350L, 1002577565, 4010310262L, 493091189, 238226049, 4233660802L, 2987750089L, 1082061258, 1395524158, 2705686845L, 1972364758, 2279892693L, 2494862625L, 1725896226, 952904198, 3399985413L, 3656866545L, 731699698, 4283874585L, 222117402, 510512622, 3959836397L, 3280807620L, 837199303, 582374963, 3504198960L, 68661723, 4135334616L, 3844915500L, 390545967, 1230274059, 3141532936L, 2825850620L, 1510247935, 2395924756L, 2091215383, 1878366691, 2644384480L, 3553878443L, 565732008, 854102364, 3229815391L, 340358836, 3861050807L, 4117890627L, 119113024, 1493875044, 2875275879L, 3090270611L, 1247431312, 2660249211L, 1828433272, 2141937292, 2378227087L, 3811616794L, 291187481, 34330861, 4032846830L, 615137029, 3603020806L, 3314634738L, 939183345, 1776939221, 2609017814L, 2295496738L, 2058945313, 2926798794L, 1545135305, 1330124605, 3173225534L, 4084100981L, 17165430, 307568514, 3762199681L, 888469610, 3332340585L, 3587147933L, 665062302, 2042050490, 2346497209L, 2559330125L, 1793573966, 3190661285L, 1279665062, 1595330642, 2910671697L};

    /* renamed from: x  reason: collision with root package name */
    public static final char[] f13324x = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int A(Context context, int i, int i10) {
        TypedValue a10 = b.a(context, i);
        return a10 != null ? a10.data : i10;
    }

    public static int B(View view, int i) {
        return b.b(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static jg.a C(String str) {
        if (str.equals("SHA-1")) {
            return new jg.a(gg.a.f5487a, u0.f450a);
        }
        if (str.equals("SHA-224")) {
            return new jg.a(fg.a.f5126d, u0.f450a);
        }
        if (str.equals("SHA-256")) {
            return new jg.a(fg.a.f5123a, u0.f450a);
        }
        if (str.equals("SHA-384")) {
            return new jg.a(fg.a.f5124b, u0.f450a);
        }
        if (str.equals("SHA-512")) {
            return new jg.a(fg.a.f5125c, u0.f450a);
        }
        throw new IllegalArgumentException(a8.a.c("unrecognised digest algorithm: ", str));
    }

    public static lg.b D(jg.a aVar) {
        if (aVar.f7256a.m(gg.a.f5487a)) {
            return new e();
        }
        if (aVar.f7256a.m(fg.a.f5126d)) {
            return new f();
        }
        if (aVar.f7256a.m(fg.a.f5123a)) {
            return new g();
        }
        if (aVar.f7256a.m(fg.a.f5124b)) {
            return new h();
        }
        if (aVar.f7256a.m(fg.a.f5125c)) {
            return new j();
        }
        StringBuilder d10 = a.a.d("unrecognised OID in digest algorithm identifier: ");
        d10.append(aVar.f7256a);
        throw new IllegalArgumentException(d10.toString());
    }

    public static final l E(d dVar) {
        if (!(dVar instanceof le.e)) {
            return new l(dVar, 1);
        }
        l j10 = ((le.e) dVar).j();
        if (j10 == null || !j10.z()) {
            j10 = null;
        }
        return j10 == null ? new l(dVar, 2) : j10;
    }

    public static void F(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = (j12 >>> 49) ^ (j13 << 15);
    }

    public static void G(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = ((jArr[1] << 7) ^ (j10 >>> 57)) & 144115188075855871L;
        long j12 = j10 & 144115188075855871L;
        long j13 = jArr2[0];
        long j14 = ((jArr2[1] << 7) ^ (j13 >>> 57)) & 144115188075855871L;
        long j15 = 144115188075855871L & j13;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr4;
        I(j12, j15, jArr4, 0);
        I(j11, j14, jArr5, 2);
        I(j12 ^ j11, j15 ^ j14, jArr5, 4);
        long j16 = jArr5[1] ^ jArr5[2];
        long j17 = jArr5[0];
        long j18 = jArr5[3];
        long j19 = (jArr5[4] ^ j17) ^ j16;
        long j20 = j16 ^ (jArr5[5] ^ j18);
        jArr3[0] = j17 ^ (j19 << 57);
        jArr3[1] = (j19 >>> 7) ^ (j20 << 50);
        jArr3[2] = (j20 >>> 14) ^ (j18 << 43);
        jArr3[3] = j18 >>> 21;
    }

    public static void H(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        F(jArr, jArr4);
        F(jArr2, jArr5);
        long[] jArr6 = jArr3;
        J(jArr4[0], jArr5[0], jArr6, 0);
        J(jArr4[1], jArr5[1], jArr6, 1);
        J(jArr4[2], jArr5[2], jArr6, 2);
        J(jArr4[3], jArr5[3], jArr6, 3);
        int i = 5;
        while (i > 0) {
            int i10 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i10];
            i = i10;
        }
        J(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        J(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[1] ^ jArr5[3];
        J(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr7 = new long[3];
        J(j10, j12, jArr7, 0);
        J(j11, j13, jArr7, 1);
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
        jArr3[0] = j17 ^ (j18 << 59);
        jArr3[1] = (j18 >>> 5) ^ (j19 << 54);
        jArr3[2] = (j19 >>> 10) ^ (j20 << 49);
        jArr3[3] = (j20 >>> 15) ^ (j21 << 44);
        jArr3[4] = (j21 >>> 20) ^ (j22 << 39);
        jArr3[5] = (j22 >>> 25) ^ (j23 << 34);
        jArr3[6] = (j23 >>> 30) ^ (j24 << 29);
        jArr3[7] = j24 >>> 35;
    }

    public static void I(long j10, long j11, long[] jArr, int i) {
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

    public static void J(long j10, long j11, long[] jArr, int i) {
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
        int i11 = 54;
        do {
            int i12 = (int) (j12 >>> i11);
            long j15 = jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3);
            j13 ^= j15 << i11;
            j14 ^= j15 >>> (-i11);
            i11 -= 6;
        } while (i11 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j13);
        int i13 = i + 1;
        jArr[i13] = jArr[i13] ^ ((j13 >>> 59) ^ (j14 << 5));
    }

    public static void K(long[] jArr, long[] jArr2) {
        e6.e.L(jArr[0], jArr2, 0);
        e6.e.L(jArr[1], jArr2, 2);
    }

    public static void L(long[] jArr, long[] jArr2) {
        e6.e.L(jArr[0], jArr2, 0);
        e6.e.L(jArr[1], jArr2, 2);
        e6.e.L(jArr[2], jArr2, 4);
        e6.e.L(jArr[3], jArr2, 6);
    }

    public static boolean M(int i) {
        boolean z;
        double d10;
        double d11;
        double d12;
        if (i != 0) {
            ThreadLocal<double[]> threadLocal = g0.a.f5201a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d13 = ((double) red) / 255.0d;
                if (d13 < 0.04045d) {
                    d10 = d13 / 12.92d;
                } else {
                    d10 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
                }
                double d14 = ((double) green) / 255.0d;
                if (d14 < 0.04045d) {
                    d11 = d14 / 12.92d;
                } else {
                    d11 = Math.pow((d14 + 0.055d) / 1.055d, 2.4d);
                }
                double d15 = d11;
                double d16 = ((double) blue) / 255.0d;
                if (d16 < 0.04045d) {
                    d12 = d16 / 12.92d;
                } else {
                    d12 = Math.pow((d16 + 0.055d) / 1.055d, 2.4d);
                }
                double d17 = d12;
                z = false;
                dArr[0] = ((0.1805d * d17) + (0.3576d * d15) + (0.4124d * d10)) * 100.0d;
                dArr[1] = ((0.0722d * d17) + (0.7152d * d15) + (0.2126d * d10)) * 100.0d;
                double d18 = d17 * 0.9505d;
                dArr[2] = (d18 + (d15 * 0.1192d) + (d10 * 0.0193d)) * 100.0d;
                if (dArr[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z = false;
        }
        return z;
    }

    public static int N(int i, int i10, float f10) {
        return g0.a.b(g0.a.e(i10, Math.round(((float) Color.alpha(i10)) * f10)), i);
    }

    public static final bd.f O(s sVar, int i) {
        e6.e.D(sVar, "$this$module");
        for (bd.f fVar : ((Map) sVar.f8013c).values()) {
            BigInteger bigInteger = fVar.g;
            BigInteger valueOf = BigInteger.valueOf((long) i);
            e6.e.C(valueOf, "BigInteger.valueOf(this.toLong())");
            if (e6.e.r(bigInteger, valueOf)) {
                return fVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final bd.f P(s sVar, String str) {
        e6.e.D(sVar, "$this$module");
        bd.f fVar = (bd.f) ((Map) sVar.f8013c).get(str);
        if (fVar != null) {
            return fVar;
        }
        throw new NoSuchElementException();
    }

    public static final bd.f Q(s sVar, int i) {
        Object obj;
        e6.e.D(sVar, "$this$moduleOrNull");
        try {
            obj = O(sVar, i);
        } catch (Throwable th2) {
            obj = b1.k(th2);
        }
        if (obj instanceof g.a) {
            obj = null;
        }
        return (bd.f) obj;
    }

    public static void R(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        android.support.v4.media.b.n1(iArr, iArr2, iArr4);
        Z(iArr4, iArr3);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        G(jArr, jArr2, jArr4);
        a0(jArr4, jArr3);
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        H(jArr, jArr2, jArr4);
        b0(jArr4, jArr3);
    }

    public static void U(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        G(jArr, jArr2, jArr4);
        i(jArr3, jArr4, jArr3);
    }

    public static void V(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        H(jArr, jArr2, jArr4);
        j(jArr3, jArr4, jArr3);
    }

    public static void W(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.Y0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            iArr2[5] = 0;
            return;
        }
        android.support.v4.media.b.X1(f13317b, iArr, iArr2);
    }

    public static InputConnection X(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof l1) {
                    editorInfo.hintText = ((l1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static final byte[] Y(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(LZ4Constants.HASH_TABLE_SIZE_64K, inputStream.available()));
        t(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        e6.e.C(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static void Z(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) 4553) & 4294967295L;
        long j11 = ((long) iArr[6]) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j12;
        long j13 = ((long) iArr[7]) & 4294967295L;
        long j14 = (j10 * j13) + j11 + (((long) iArr[1]) & 4294967295L) + (j12 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[8]) & 4294967295L;
        long j16 = (j10 * j15) + j13 + (((long) iArr[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[9]) & 4294967295L;
        long j18 = j10;
        long j19 = (j10 * j17) + j15 + (((long) iArr[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = ((long) iArr[10]) & 4294967295L;
        long j21 = (j18 * j20) + j17 + (((long) iArr[4]) & 4294967295L) + (j19 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = ((long) iArr[11]) & 4294967295L;
        long j23 = (j18 * j22) + j20 + (((long) iArr[5]) & 4294967295L) + (j21 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = (j23 >>> 32) + j22;
        long j25 = j24 & 4294967295L;
        long j26 = (j18 * j25) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j26;
        long j27 = j24 >>> 32;
        long j28 = (j18 * j27) + j25 + (((long) iArr3[1]) & 4294967295L) + (j26 >>> 32);
        iArr3[1] = (int) j28;
        long j29 = j27 + (((long) iArr3[2]) & 4294967295L) + (j28 >>> 32);
        iArr3[2] = (int) j29;
        long j30 = (j29 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j30;
        if (((j30 >>> 32) == 0 ? 0 : android.support.v4.media.b.H0(6, iArr3, 4)) != 0 || (iArr3[5] == -1 && android.support.v4.media.b.B0(iArr3, f13317b))) {
            android.support.v4.media.b.o(6, 4553, iArr3);
        }
    }

    public static final wi.c a(int i) {
        wi.a aVar = wi.a.HandlerNotFound;
        StringBuilder q10 = a.b.q("handler not found for event ");
        byte[] array = ByteBuffer.allocate(4).putInt(i).array();
        e6.e.C(array, "ByteBuffer.allocate(4).putInt(this).array()");
        q10.append(j2.a.c(array));
        return new wi.c(aVar, q10.toString());
    }

    public static void a0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = j12 ^ ((j13 >>> 40) ^ (j13 >>> 49));
        long j15 = j10 ^ ((j14 << 15) ^ (j14 << 24));
        long j16 = (j11 ^ ((j13 << 15) ^ (j13 << 24))) ^ ((j14 >>> 40) ^ (j14 >>> 49));
        long j17 = j16 >>> 49;
        jArr2[0] = (j15 ^ j17) ^ (j17 << 9);
        jArr2[1] = 562949953421311L & j16;
    }

    public static void b0(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j15 ^ (j17 >>> 31);
        long j19 = (j14 ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j16 >>> 31);
        long j20 = ((j13 ^ (j17 << 23)) ^ ((j16 >>> 41) ^ (j16 << 33))) ^ (j18 >>> 31);
        long j21 = j10 ^ (j19 << 23);
        long j22 = ((j12 ^ (j16 << 23)) ^ ((j18 >>> 41) ^ (j18 << 33))) ^ (j19 >>> 31);
        long j23 = j20 >>> 41;
        jArr2[0] = j21 ^ j23;
        long j24 = j23 << 10;
        jArr2[1] = j24 ^ ((j11 ^ (j18 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33)));
        jArr2[2] = j22;
        jArr2[3] = 2199023255551L & j20;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c0(int r14, int[] r15) {
        /*
            r0 = 6
            r1 = 4553(0x11c9, float:6.38E-42)
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
            r14 = 5
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f13317b
            boolean r14 = android.support.v4.media.b.B0(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            android.support.v4.media.b.o(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.c0(int, int[]):void");
    }

    public static final wi.c d(String str) {
        return new wi.c(wi.a.InvalidMemoryAccess, a8.a.c("invalid memory access: ", str));
    }

    public static final Object d0(Map map, int i) {
        if (map != null) {
            Collection values = map.values();
            e6.e.D(values, "<this>");
            Object obj = null;
            if (values instanceof List) {
                List list = (List) values;
                if (i >= 0 && i <= a.b.c0(list)) {
                    obj = list.get(i);
                }
            } else if (i >= 0) {
                Iterator it = values.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i == i10) {
                        obj = next;
                        break;
                    }
                    i10 = i11;
                }
            }
            if (obj != null) {
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final void e(gf.a aVar, OutputStream outputStream) {
        e6.e.D(aVar, "$this$cborMarshalData");
        e6.e.D(outputStream, "out");
        p4.c b10 = new p4.b().b(new ui.a(outputStream));
        try {
            b10.G0(v.m(aVar) ? 6 : 5);
            b10.G0(aVar.f5478a.size());
            for (Integer intValue : aVar.f5478a) {
                b10.D0(intValue.intValue());
            }
            b10.A0();
            b10.D0(aVar.f5479b);
            b10.E0(aVar.f5480c);
            b1.f(b10, aVar.f5481d);
            if (v.m(aVar)) {
                if (aVar.f5479b == 1) {
                    aa.b bVar = aVar.f5482e;
                    if (bVar != null) {
                        g(b10, (gf.e) bVar);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.Ed25519SecurityParameter");
                    }
                } else {
                    throw new ic.a("security block is unknown");
                }
            }
            b10.G0(aVar.f5483f.size());
            for (gf.b next : aVar.f5483f) {
                if (aVar.f5479b != 1) {
                    throw new ic.a("security block is unknown");
                } else if (next != null) {
                    b10.G0(1);
                    b10.G0(2);
                    b10.D0(0);
                    b10.e(ui.c.c(((gf.f) next).f5486a));
                    b10.A0();
                    b10.A0();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type io.nodle.dtn.bpv7.bpsec.Ed25519SecurityResult");
                }
            }
            b10.A0();
            b10.A0();
            ad.c.z(b10, (Throwable) null);
        } catch (Throwable th2) {
            ad.c.z(b10, th);
            throw th2;
        }
    }

    public static void e0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        android.support.v4.media.b.N1(iArr, iArr3);
        Z(iArr3, iArr2);
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, wi.b>] */
    /* JADX WARNING: type inference failed for: r10v13, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, wi.b>] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0181 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(oi.a r9, b.i r10) {
        /*
            java.lang.String r0 = "<this>"
            e6.e.D(r9, r0)
            b.e r1 = r10.s()
            zb.h r1 = r1.f2769s
            byte[] r1 = r1.i()
            java.lang.String r2 = "sxOrder.signature.signerPubKey.toByteArray()"
            e6.e.C(r1, r2)
            r2 = 32
            byte[] r3 = new byte[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            byte[] r1 = xh.a.a(r3)
            java.lang.String r3 = "sxOrder.signature.signer…d25519PublicKey().encoded"
            e6.e.C(r1, r3)
            bf.c$a r3 = bf.c.a.f3000b
            java.lang.String r1 = nd.f.M(r1, r3)
            io.nodle.sdk.NodleContext r5 = r9.f9450a
            e6.e.D(r5, r0)
            m2.a r5 = r5.getSdkConfig()
            a9.c r5 = (a9.c) r5
            java.lang.String r6 = "nodle.pub-key"
            java.lang.String r7 = "a2fe252365c4359dba8cc33f9f2ff40c5d51ff60ec12fad5a903fb36e07a2ff9"
            java.lang.Object r5 = r5.a(r6, r7)
            java.lang.String r5 = (java.lang.String) r5
            byte[] r5 = bf.c.b(r5)
            byte[] r6 = new byte[r2]
            java.lang.System.arraycopy(r5, r4, r6, r4, r2)
            byte[] r2 = xh.a.a(r6)
            java.lang.String r5 = "ctx.getNodlePubKey().hex…d25519PublicKey().encoded"
            e6.e.C(r2, r5)
            java.lang.String r2 = nd.f.M(r2, r3)
            boolean r1 = e6.e.r(r1, r2)
            if (r1 == 0) goto L_0x0295
            b.e r1 = r10.s()
            java.lang.String r2 = "sxOrder.signature"
            e6.e.C(r1, r2)
            byte[] r2 = a.b.B(r10)
            zb.h r3 = r1.f2769s
            byte[] r3 = r3.i()
            java.lang.String r5 = "signerPubKey.toByteArray()"
            e6.e.C(r3, r5)
            qg.e r5 = new qg.e
            r5.<init>(r3)
            zb.h r1 = r1.f2770t
            byte[] r1 = r1.i()
            java.lang.String r3 = "signature.toByteArray()"
            e6.e.C(r1, r3)
            rg.b$a r3 = new rg.b$a
            r3.<init>()
            r3.reset()
            int r6 = r2.length
            r3.write(r2, r4, r6)
            r3.c(r5, r1)
            b.f r1 = r10.r()
            b.h r1 = r1.r()
            b.o r1 = r1.u()
            int r1 = r1.f2819s
            java.lang.String r2 = "iotee.vm.max-ram"
            r3 = 1207566336(0x47fa0000, float:128000.0)
            java.lang.String r4 = " maximum="
            if (r1 < 0) goto L_0x0255
            b.f r1 = r10.r()
            b.h r1 = r1.r()
            b.o r1 = r1.u()
            int r1 = r1.f2819s
            float r1 = (float) r1
            io.nodle.sdk.NodleContext r5 = r9.f9450a
            e6.e.D(r5, r0)
            m2.a r5 = r5.getSdkConfig()
            java.lang.Float r6 = java.lang.Float.valueOf(r3)
            a9.c r5 = (a9.c) r5
            java.lang.Object r5 = r5.a(r2, r6)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0255
            b.f r1 = r10.r()
            b.h r1 = r1.r()
            b.n r1 = r1.t()
            long r1 = r1.B
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            java.lang.String r5 = "iotee.vm.max-lifetime"
            r6 = 1299657024(0x4d773140, float:2.592E8)
            if (r3 < 0) goto L_0x021f
            float r3 = (float) r1
            io.nodle.sdk.NodleContext r7 = r9.f9450a
            e6.e.D(r7, r0)
            m2.a r7 = r7.getSdkConfig()
            java.lang.Float r8 = java.lang.Float.valueOf(r6)
            a9.c r7 = (a9.c) r7
            java.lang.Object r7 = r7.a(r5, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 > 0) goto L_0x021f
            b.f r9 = r10.r()
            zb.h r9 = r9.f2773s
            byte[] r9 = r9.i()
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            java.lang.String r0 = "bin"
            e6.e.C(r9, r0)
            bj.a r0 = l6.b1.a(r9)
            long r1 = r0.f3038a
            int r1 = (int) r1
            java.nio.Buffer r1 = r9.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.util.HashMap r9 = l6.b1.b(r9, r0)
            java.util.Set r1 = r9.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0138:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0197
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            r5 = 1073741824(0x40000000, float:2.0)
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0159
            long r3 = r3 - r5
            long r5 = r0.f3041d
            goto L_0x0179
        L_0x0159:
            r5 = 805306368(0x30000000, float:4.656613E-10)
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0164
            long r3 = r3 - r5
            long r5 = r0.f3040c
            goto L_0x0179
        L_0x0164:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x016f
            long r3 = r3 - r5
            long r5 = r0.f3039b
            goto L_0x0179
        L_0x016f:
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x017a
            long r3 = r3 - r5
            long r5 = r0.f3038a
        L_0x0179:
            long r3 = r3 + r5
        L_0x017a:
            long r5 = r0.f3040c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0181
            goto L_0x0138
        L_0x0181:
            bj.b r9 = new bj.b
            java.util.Map<java.lang.Integer, wi.b> r10 = wi.e.f12716a
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r0 = "event callback is unreachable: "
            java.lang.String r10 = e6.e.a0(r0, r10)
            r9.<init>(r10)
            throw r9
        L_0x0197:
            b.f r0 = r10.r()
            b.h r0 = r0.r()
            b.g r0 = r0.r()
            zb.t$b r0 = r0.f2778s
            java.lang.String r1 = "sxOrder.data.manifest.events.idList"
            e6.e.C(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x01ae:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e7
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Map<java.lang.Integer, wi.b> r2 = wi.e.f12716a
            java.lang.Object r3 = r2.get(r1)
            if (r3 == 0) goto L_0x01d9
            java.lang.Object r3 = r9.get(r1)
            if (r3 == 0) goto L_0x01c9
            goto L_0x01ae
        L_0x01c9:
            bj.b r9 = new bj.b
            java.lang.Object r10 = r2.get(r1)
            java.lang.String r0 = "manifest: tx has no callback for requested event "
            java.lang.String r10 = e6.e.a0(r0, r10)
            r9.<init>(r10)
            throw r9
        L_0x01d9:
            wi.c r9 = new wi.c
            wi.a r10 = wi.a.InvalidEventId
            java.lang.String r0 = "manifest: event declared is unknown "
            java.lang.String r0 = e6.e.a0(r0, r1)
            r9.<init>(r10, r0)
            throw r9
        L_0x01e7:
            b.f r9 = r10.r()
            b.h r9 = r9.r()
            b.n r9 = r9.t()
            zb.h r9 = r9.z
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x021e
            b.f r9 = r10.r()     // Catch:{ IllegalArgumentException -> 0x0216 }
            b.h r9 = r9.r()     // Catch:{ IllegalArgumentException -> 0x0216 }
            b.n r9 = r9.t()     // Catch:{ IllegalArgumentException -> 0x0216 }
            zb.h r9 = r9.z     // Catch:{ IllegalArgumentException -> 0x0216 }
            byte[] r9 = r9.i()     // Catch:{ IllegalArgumentException -> 0x0216 }
            java.lang.String r10 = "sxOrder.data.manifest.ta…serviceUUID.toByteArray()"
            e6.e.C(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0216 }
            di.d.b(r9)     // Catch:{ IllegalArgumentException -> 0x0216 }
            goto L_0x021e
        L_0x0216:
            bj.b r9 = new bj.b
            java.lang.String r10 = "bluetooth target service uuid is invalid"
            r9.<init>(r10)
            throw r9
        L_0x021e:
            return
        L_0x021f:
            bj.b r10 = new bj.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "tx lifetime refused. requested="
            r3.append(r7)
            r3.append(r1)
            r3.append(r4)
            io.nodle.sdk.NodleContext r9 = r9.f9450a
            e6.e.D(r9, r0)
            m2.a r9 = r9.getSdkConfig()
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            a9.c r9 = (a9.c) r9
            java.lang.Object r9 = r9.a(r5, r0)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            r10.<init>(r9)
            throw r10
        L_0x0255:
            bj.b r1 = new bj.b
            java.lang.String r5 = "vm parameter refused. requested="
            java.lang.StringBuilder r5 = a.b.q(r5)
            b.f r10 = r10.r()
            b.h r10 = r10.r()
            b.o r10 = r10.u()
            int r10 = r10.f2819s
            r5.append(r10)
            r5.append(r4)
            io.nodle.sdk.NodleContext r9 = r9.f9450a
            e6.e.D(r9, r0)
            m2.a r9 = r9.getSdkConfig()
            java.lang.Float r10 = java.lang.Float.valueOf(r3)
            a9.c r9 = (a9.c) r9
            java.lang.Object r9 = r9.a(r2, r10)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            r1.<init>(r9)
            throw r1
        L_0x0295:
            bj.b r9 = new bj.b
            java.lang.String r10 = "certification authority is not trusted"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.f(oi.a, b.i):void");
    }

    public static void f0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        K(jArr, jArr3);
        a0(jArr3, jArr2);
    }

    public static final void g(p4.c cVar, gf.e eVar) {
        cVar.G0(2);
        cVar.G0(2);
        cVar.D0(0);
        cVar.e(eVar.I.getEncoded());
        cVar.A0();
        cVar.G0(2);
        cVar.D0(1);
        cVar.E0(eVar.J);
        cVar.A0();
        cVar.A0();
    }

    public static void g0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        L(jArr, jArr3);
        b0(jArr3, jArr2);
    }

    public static final int h(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static void h0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[12];
        android.support.v4.media.b.N1(iArr, iArr3);
        while (true) {
            Z(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.N1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void i0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[4];
        K(jArr, jArr3);
        while (true) {
            a0(jArr3, jArr2);
            i--;
            if (i > 0) {
                K(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void j0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[8];
        L(jArr, jArr3);
        while (true) {
            b0(jArr3, jArr2);
            i--;
            if (i > 0) {
                L(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static LiveData k(je.e eVar) {
        pd.h hVar = pd.h.f9881a;
        e6.e.D(eVar, "<this>");
        return new androidx.lifecycle.h(hVar, 5000, new n(eVar, (d<? super n>) null));
    }

    public static final String k0(bd.h hVar, kc.a aVar, Object... objArr) {
        int i;
        List list;
        List list2;
        int length = objArr.length;
        i iVar = hVar.f2987b;
        e6.e.D(iVar, "$this$dimension");
        int i10 = 0;
        if (iVar instanceof i.b) {
            i = 0;
        } else if (iVar instanceof i.a) {
            i = ((i.a) iVar).f2990a.size();
        } else {
            throw new md.e();
        }
        if (length <= i) {
            i iVar2 = hVar.f2987b;
            if (iVar2 instanceof i.b) {
                list = o.f8966a;
            } else if (iVar2 instanceof i.a) {
                list = ((i.a) iVar2).f2990a;
            } else {
                throw new md.e();
            }
            if (iVar2 instanceof i.b) {
                list2 = o.f8966a;
            } else if (iVar2 instanceof i.a) {
                list2 = ((i.a) iVar2).f2991b;
            } else {
                throw new md.e();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jc.c cVar = jc.c.f7149h;
            String str = hVar.f2989d;
            Charset charset = fe.a.f5086b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = str.getBytes(charset);
            e6.e.C(bytes, "(this as java.lang.String).getBytes(charset)");
            jc.d dVar = jc.c.f7148f;
            byteArrayOutputStream.write(dVar.a(bytes));
            String str2 = hVar.f2986a;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = str2.getBytes(charset);
            e6.e.C(bytes2, "(this as java.lang.String).getBytes(charset)");
            byteArrayOutputStream.write(dVar.a(bytes2));
            int length2 = objArr.length;
            int i11 = 0;
            while (i10 < length2) {
                Object obj = objArr[i10];
                int i12 = i11 + 1;
                qc.a aVar2 = (qc.a) list.get(i11);
                p pVar = (p) list2.get(i11);
                if (aVar2 != null) {
                    byteArrayOutputStream.write(pVar.getHashingFunction().k(ad.c.x(aVar2, aVar, obj)));
                    i10++;
                    i11 = i12;
                } else {
                    throw new IllegalStateException("Cannot resolve key or value type for storage entry `" + (hVar.f2989d + '.' + hVar.f2986a) + '`');
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            e6.e.C(byteArray, "keyOutputStream.toByteArray()");
            return jc.b.B(byteArray, true);
        }
        throw new IllegalArgumentException("Storage entry has different type than requested for storage key");
    }

    public static AutoClearedProperty l(Fragment fragment) {
        e6.e.D(fragment, "<this>");
        return new AutoClearedProperty((xd.l) null);
    }

    public static void l0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.X1(iArr, iArr2, iArr3) != 0) {
            android.support.v4.media.b.a2(6, 4553, iArr3);
        }
    }

    public static final wi.c m(int i) {
        wi.a aVar = wi.a.InvalidOpcode;
        StringBuilder q10 = a.b.q("unsupported opcode ");
        byte[] array = ByteBuffer.allocate(4).putInt(i).array();
        e6.e.C(array, "ByteBuffer.allocate(4).putInt(this).array()");
        q10.append(j2.a.c(array));
        return new wi.c(aVar, q10.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m0(java.lang.String r23, long r24, long r26, long r28) {
        /*
            r0 = r23
            r1 = r26
            r3 = r28
            java.lang.String r5 = n0(r23)
            if (r5 != 0) goto L_0x0010
            r5 = r24
            goto L_0x00a1
        L_0x0010:
            r6 = 10
            c3.k.T(r6)
            int r7 = r5.length()
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x001e
            goto L_0x0076
        L_0x001e:
            char r10 = r5.charAt(r8)
            r11 = 48
            int r11 = e6.e.F(r10, r11)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 >= 0) goto L_0x0041
            if (r7 != r9) goto L_0x0032
            goto L_0x0076
        L_0x0032:
            r11 = 45
            if (r10 != r11) goto L_0x003a
            r12 = -9223372036854775808
            r10 = r9
            goto L_0x0042
        L_0x003a:
            r11 = 43
            if (r10 != r11) goto L_0x0076
            r11 = r8
            r10 = r9
            goto L_0x0043
        L_0x0041:
            r10 = r8
        L_0x0042:
            r11 = r10
        L_0x0043:
            r14 = 0
            r16 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r18 = r16
        L_0x004c:
            if (r10 >= r7) goto L_0x007e
            char r8 = r5.charAt(r10)
            int r8 = java.lang.Character.digit(r8, r6)
            if (r8 >= 0) goto L_0x0059
            goto L_0x0076
        L_0x0059:
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L_0x006b
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x0076
            r20 = r10
            long r9 = (long) r6
            long r18 = r12 / r9
            int r9 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r9 >= 0) goto L_0x006d
            goto L_0x0076
        L_0x006b:
            r20 = r10
        L_0x006d:
            long r9 = (long) r6
            long r14 = r14 * r9
            long r8 = (long) r8
            long r21 = r12 + r8
            int r10 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r10 >= 0) goto L_0x0078
        L_0x0076:
            r6 = 0
            goto L_0x008a
        L_0x0078:
            long r14 = r14 - r8
            int r10 = r20 + 1
            r8 = 0
            r9 = 1
            goto L_0x004c
        L_0x007e:
            if (r11 == 0) goto L_0x0085
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            goto L_0x008a
        L_0x0085:
            long r6 = -r14
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x008a:
            r7 = 39
            java.lang.String r8 = "System property '"
            if (r6 == 0) goto L_0x00d6
            long r5 = r6.longValue()
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x009e
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x009e
            r9 = 1
            goto L_0x009f
        L_0x009e:
            r9 = 0
        L_0x009f:
            if (r9 == 0) goto L_0x00a2
        L_0x00a1:
            return r5
        L_0x00a2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r8)
            r10.append(r0)
            java.lang.String r0 = "' should be in range "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ".."
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", but is '"
            r10.append(r0)
            r10.append(r5)
            r10.append(r7)
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00d6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r5)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.m0(java.lang.String, long, long, long):long");
    }

    public static final wi.c n(String str) {
        e6.e.D(str, "msg");
        return new wi.c(wi.a.MissingPermission, a8.a.c("missing permission for protected call: ", str));
    }

    public static final String n0(String str) {
        int i = le.s.f8266a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final bd.e o(bd.f fVar, String str) {
        Map<String, bd.e> map = fVar.f2981c;
        bd.e eVar = map != null ? map.get(str) : null;
        if (eVar != null) {
            return eVar;
        }
        throw new NoSuchElementException();
    }

    public static final boolean o0(String str, boolean z) {
        String n02 = n0(str);
        return n02 == null ? z : Boolean.parseBoolean(n02);
    }

    public static final x p(xd.l lVar, Object obj, x xVar) {
        try {
            lVar.k(obj);
        } catch (Throwable th2) {
            if (xVar == null || xVar.getCause() == th2) {
                return new x(e6.e.a0("Exception in undelivered element handler for ", obj), th2);
            }
            a.b.D(xVar, th2);
        }
        return xVar;
    }

    public static int p0(String str, int i, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) m0(str, (long) i, (long) i10, (long) i11);
    }

    public static void q(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(valueOf);
            throw new NullPointerException(sb2.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(valueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
    }

    public static int r(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static final String r0(String str) {
        InetAddress inetAddress;
        e6.e.D(str, "$this$toCanonicalHost");
        int i = 0;
        int i10 = -1;
        if (fe.o.g1(str, ":")) {
            if (!k.d1(str, "[", false) || !str.endsWith("]")) {
                inetAddress = u(str, 0, str.length());
            } else {
                inetAddress = u(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < address.length) {
                    int i13 = i11;
                    while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                        i13 += 2;
                    }
                    int i14 = i13 - i11;
                    if (i14 > i12 && i14 >= 4) {
                        i10 = i11;
                        i12 = i14;
                    }
                    i11 = i13 + 2;
                }
                uf.e eVar = new uf.e();
                while (i < address.length) {
                    if (i == i10) {
                        eVar.y0(58);
                        i += i12;
                        if (i == 16) {
                            eVar.y0(58);
                        }
                    } else {
                        if (i > 0) {
                            eVar.y0(58);
                        }
                        byte b10 = address[i];
                        byte[] bArr = jf.c.f7250a;
                        eVar.n((long) (((b10 & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return eVar.T();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                e6.e.C(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                e6.e.C(locale, "Locale.US");
                String lowerCase = ascii.toLowerCase(locale);
                e6.e.C(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        break;
                    }
                    char charAt = lowerCase.charAt(i15);
                    if (e6.e.F(charAt, 31) <= 0) {
                        break;
                    } else if (e6.e.F(charAt, 127) >= 0) {
                        break;
                    } else if (fe.o.l1(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        break;
                    } else {
                        i15++;
                    }
                }
                i = 1;
                if (i != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static int s(int i, int i10, int i11) {
        return i < i10 ? i10 : i > i11 ? i11 : i;
    }

    public static Object s0(Object obj) {
        Objects.requireNonNull(obj, "Cannot return null from a non-@Nullable @Provides method");
        return obj;
    }

    public static long t(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];
        int read = inputStream.read(bArr);
        long j10 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
            read = inputStream.read(bArr);
        }
        return j10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        r0 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress u(java.lang.String r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r8 = r4
            r9 = r8
            r7 = r5
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00df
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            boolean r14 = fe.k.c1(r0, r14, r6, r5)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0027
            return r10
        L_0x0027:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r0 = r2
            r8 = r7
            goto L_0x00e0
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00ac
        L_0x0033:
            if (r7 == 0) goto L_0x00ab
            java.lang.String r11 = ":"
            boolean r11 = fe.k.c1(r0, r11, r6, r5)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = fe.k.c1(r0, r11, r6, r5)
            if (r6 == 0) goto L_0x00aa
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x009c
            if (r11 != r2) goto L_0x0052
        L_0x0050:
            r0 = r5
            goto L_0x00a2
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L_0x005d
            goto L_0x0050
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r15 = r5
            r14 = r9
        L_0x0061:
            if (r14 >= r1) goto L_0x008b
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = e6.e.F(r5, r2)
            if (r16 < 0) goto L_0x008b
            r4 = 57
            int r4 = e6.e.F(r5, r4)
            if (r4 <= 0) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            if (r15 != 0) goto L_0x007d
            if (r9 == r14) goto L_0x007d
            goto L_0x00a1
        L_0x007d:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x0084
            goto L_0x00a1
        L_0x0084:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x008b:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0090
            goto L_0x00a1
        L_0x0090:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x004c
        L_0x009c:
            int r6 = r6 + r13
            if (r11 != r6) goto L_0x00a1
            r0 = 1
            goto L_0x00a2
        L_0x00a1:
            r0 = 0
        L_0x00a2:
            if (r0 != 0) goto L_0x00a5
            return r10
        L_0x00a5:
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00e0
        L_0x00aa:
            return r10
        L_0x00ab:
            r9 = r6
        L_0x00ac:
            r6 = r9
            r2 = 0
        L_0x00ae:
            if (r6 >= r1) goto L_0x00c2
            char r4 = r0.charAt(r6)
            int r4 = jf.c.r(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00ae
        L_0x00c2:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00de
            if (r4 <= r13) goto L_0x00c9
            goto L_0x00de
        L_0x00c9:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00de:
            return r10
        L_0x00df:
            r0 = r2
        L_0x00e0:
            if (r7 == r0) goto L_0x00f5
            r1 = -1
            if (r8 != r1) goto L_0x00e6
            return r10
        L_0x00e6:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00f5:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.u(java.lang.String, int, int):java.net.InetAddress");
    }

    public static final long v(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }

    public static final void w(ge.k kVar, q0 q0Var) {
        ((l) kVar).i(new r0(q0Var));
    }

    public static boolean x(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final fc.a y(fc.b bVar, byte[] bArr, List list) {
        e6.e.D(bVar, "$this$generate");
        fc.a d10 = bVar.d(bArr);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d10 = bVar.b(d10, (ec.a) it.next());
        }
        return d10;
    }

    public static Application z(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public w b(w wVar, g3.h hVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((t3.c) wVar.get()).f11292a.f11302a.f11304a.getData().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = c4.a.f3219a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f3222a == 0 && bVar.f3223b == bVar.f3224c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new q3.b(bArr);
    }

    public void c(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", (Throwable) null);
        }
    }
}
