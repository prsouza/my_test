package aa;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import b9.m;
import bc.i;
import ca.d;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.common.api.Api;
import e6.e;
import g9.h;
import ge.t;
import ie.e;
import ie.k;
import io.nodle.cash.R;
import io.nodle.sdk.NodleContext;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import ji.l;
import l6.b1;
import le.q;
import le.r;
import md.f;
import o6.l;
import o6.z;
import p002if.a0;
import p002if.d0;
import qc.a;
import xd.p;
import xe.j;
import yd.c;
import yd.x;

public /* synthetic */ class b implements d, p002if.b, z, h, l {
    public static final int[] A = {16842948, 16842987, 16842993, R.attr.fastScrollEnabled, R.attr.fastScrollHorizontalThumbDrawable, R.attr.fastScrollHorizontalTrackDrawable, R.attr.fastScrollVerticalThumbDrawable, R.attr.fastScrollVerticalTrackDrawable, R.attr.layoutManager, R.attr.reverseLayout, R.attr.spanCount, R.attr.stackFromEnd};
    public static final r B = new r("NONE");
    public static final r C = new r("PENDING");
    public static final r D = new r("NULL");
    public static final r E = new r("UNDEFINED");
    public static final r F = new r("REUSABLE_CLAIMED");
    public static final /* synthetic */ b G = new b();
    public static b H;

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f189a = {Api.BaseClientBuilder.API_PRIORITY_OTHER, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f190b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f191c = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f192s = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f193t = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f194u = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f195v = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f196w = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f197x = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* renamed from: y  reason: collision with root package name */
    public static final long[] f198y = {-5270498306774157648L, 5270498306774195053L, 19634136210L};
    public static final int[] z = {R.attr.shimmer_auto_start, R.attr.shimmer_base_alpha, R.attr.shimmer_base_color, R.attr.shimmer_clip_to_children, R.attr.shimmer_colored, R.attr.shimmer_direction, R.attr.shimmer_dropoff, R.attr.shimmer_duration, R.attr.shimmer_fixed_height, R.attr.shimmer_fixed_width, R.attr.shimmer_height_ratio, R.attr.shimmer_highlight_alpha, R.attr.shimmer_highlight_color, R.attr.shimmer_intensity, R.attr.shimmer_repeat_count, R.attr.shimmer_repeat_delay, R.attr.shimmer_repeat_mode, R.attr.shimmer_shape, R.attr.shimmer_tilt, R.attr.shimmer_width_ratio};

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(g9.b bVar) {
    }

    public static void A(String str, String str2, Object obj) {
        String K = K(str);
        if (Log.isLoggable(K, 3)) {
            Log.d(K, String.format(str2, new Object[]{obj}));
        }
    }

    public static void B(String str, String str2, Object... objArr) {
        String K = K(str);
        if (Log.isLoggable(K, 3)) {
            Log.d(K, String.format(str2, objArr));
        }
    }

    public static byte[] C(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                bArr2[i] = (byte) ((bArr[i] << 1) & 254);
                if (i < 15) {
                    bArr2[i] = (byte) (bArr2[i] | ((byte) ((bArr[i + 1] >> 7) & 1)));
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: se.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object D(se.d r6, oe.a r7) {
        /*
            java.lang.String r0 = "$this$decodeSerializableValuePolymorphic"
            e6.e.D(r6, r0)
            java.lang.String r0 = "deserializer"
            e6.e.D(r7, r0)
            boolean r0 = r7 instanceof re.b
            if (r0 == 0) goto L_0x00f8
            se.a r0 = r6.m()
            te.c r0 = r0.f11102a
            boolean r0 = r0.f11575h
            if (r0 == 0) goto L_0x001a
            goto L_0x00f8
        L_0x001a:
            se.e r0 = r6.n()
            pe.e r1 = r7.a()
            boolean r2 = r0 instanceof se.q
            r3 = -1
            if (r2 == 0) goto L_0x00c4
            se.q r0 = (se.q) r0
            se.a r1 = r6.m()
            te.c r1 = r1.f11102a
            java.lang.String r1 = r1.i
            java.lang.Object r2 = r0.get(r1)
            se.e r2 = (se.e) r2
            r4 = 0
            if (r2 == 0) goto L_0x006e
            boolean r5 = r2 instanceof se.s
            if (r5 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r4 = r2
        L_0x0040:
            se.s r4 = (se.s) r4
            if (r4 == 0) goto L_0x0049
            java.lang.String r4 = r4.d()
            goto L_0x006e
        L_0x0049:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Element "
            java.lang.StringBuilder r7 = a.a.d(r7)
            java.lang.Class r0 = r2.getClass()
            de.b r0 = yd.v.a(r0)
            r7.append(r0)
            java.lang.String r0 = " is not a "
            r7.append(r0)
            java.lang.String r0 = "JsonPrimitive"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x006e:
            re.b r7 = (re.b) r7
            android.support.v4.media.b r2 = r6.p()
            de.b r7 = r7.c()
            oe.a r7 = r2.u0(r7, r4)
            if (r7 == 0) goto L_0x009a
            se.a r6 = r6.m()
            java.lang.String r2 = "$this$readPolymorphicJson"
            e6.e.D(r6, r2)
            java.lang.String r2 = "discriminator"
            e6.e.D(r1, r2)
            te.j r2 = new te.j
            pe.e r3 = r7.a()
            r2.<init>(r6, r0, r1, r3)
            java.lang.Object r6 = D(r2, r7)
            return r6
        L_0x009a:
            if (r4 != 0) goto L_0x009f
            java.lang.String r6 = "missing class discriminator ('null')"
            goto L_0x00b5
        L_0x009f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "class discriminator '"
            r6.append(r7)
            r6.append(r4)
            r7 = 39
            r6.append(r7)
            java.lang.String r6 = r6.toString()
        L_0x00b5:
            java.lang.String r7 = "Polymorphic serializer was not found for "
            java.lang.String r6 = a8.a.c(r7, r6)
            java.lang.String r7 = r0.toString()
            te.d r6 = a.b.j(r3, r6, r7)
            throw r6
        L_0x00c4:
            java.lang.String r6 = "Expected "
            java.lang.StringBuilder r6 = a.a.d(r6)
            java.lang.Class<se.q> r7 = se.q.class
            de.b r7 = yd.v.a(r7)
            r6.append(r7)
            java.lang.String r7 = " as the serialized body of "
            r6.append(r7)
            java.lang.String r7 = r1.b()
            r6.append(r7)
            java.lang.String r7 = ", but had "
            r6.append(r7)
            java.lang.Class r7 = r0.getClass()
            de.b r7 = yd.v.a(r7)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            te.d r6 = a.b.i(r3, r6)
            throw r6
        L_0x00f8:
            java.lang.Object r6 = r7.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.b.D(se.d, oe.a):java.lang.Object");
    }

    public static void E(String str, String str2, Throwable th2) {
        String K = K(str);
        if (Log.isLoggable(K, 6)) {
            Log.e(K, str2, th2);
        }
    }

    public static final Class G(de.b bVar) {
        e.D(bVar, "<this>");
        return ((c) bVar).b();
    }

    public static final Class H(de.b bVar) {
        e.D(bVar, "<this>");
        Class<?> b10 = ((c) bVar).b();
        if (!b10.isPrimitive()) {
            return b10;
        }
        String name = b10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? b10 : Double.class;
            case 104431:
                return !name.equals("int") ? b10 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? b10 : Byte.class;
            case 3052374:
                return !name.equals("char") ? b10 : Character.class;
            case 3327612:
                return !name.equals("long") ? b10 : Long.class;
            case 3625364:
                return !name.equals("void") ? b10 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? b10 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? b10 : Float.class;
            case 109413500:
                return !name.equals("short") ? b10 : Short.class;
            default:
                return b10;
        }
    }

    public static String I(int i) {
        if (i == 5) {
            return "qTESLA-p-I";
        }
        if (i == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException(m.b("unknown security category: ", i));
    }

    public static final qc.d J(Map map, String str) {
        e.D(map, "$this$getOrCreate");
        e.D(str, "definition");
        Object obj = map.get(str);
        if (obj == null) {
            obj = new qc.d((a<?, ?>) null);
            map.put(str, obj);
        }
        return (qc.d) obj;
    }

    public static String K(String str) {
        return a8.a.c("TransportRuntime.", str);
    }

    public static void L(String str, Object obj) {
        String K = K("CctTransportBackend");
        if (Log.isLoggable(K, 4)) {
            Log.i(K, String.format(str, new Object[]{obj}));
        }
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = (jArr[2] << 18) ^ (j11 >>> 46);
        long j13 = ((j11 << 9) ^ (j10 >>> 55)) & 36028797018963967L;
        long j14 = j10 & 36028797018963967L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = (j16 >>> 46) ^ (jArr2[2] << 18);
        long j18 = ((j15 >>> 55) ^ (j16 << 9)) & 36028797018963967L;
        long j19 = j15 & 36028797018963967L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr4;
        N(j14, j19, jArr5, 0);
        N(j12, j17, jArr5, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        long[] jArr6 = jArr4;
        N(j20, j21, jArr6, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        N(j14 ^ j22, j19 ^ j23, jArr6, 6);
        N(j20 ^ j22, j21 ^ j23, jArr6, 8);
        long j24 = jArr4[6] ^ jArr4[8];
        long j25 = jArr4[7] ^ jArr4[9];
        long j26 = (j24 << 1) ^ jArr4[6];
        long j27 = (j24 ^ (j25 << 1)) ^ jArr4[7];
        long j28 = jArr4[0];
        long j29 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j30 = jArr4[1] ^ jArr4[5];
        long j31 = ((j26 ^ j28) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j32 = (((j29 ^ j27) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j31 >>> 55);
        long j33 = (j30 ^ j25) ^ (j32 >>> 55);
        long j34 = j32 & 36028797018963967L;
        long j35 = ((j31 & 36028797018963967L) >>> 1) ^ ((j34 & 1) << 54);
        long j36 = j35 ^ (j35 << 1);
        long j37 = j36 ^ (j36 << 2);
        long j38 = j37 ^ (j37 << 4);
        long j39 = j38 ^ (j38 << 8);
        long j40 = j39 ^ (j39 << 16);
        long j41 = (j40 ^ (j40 << 32)) & 36028797018963967L;
        long j42 = ((j34 >>> 1) ^ ((j33 & 1) << 54)) ^ (j41 >>> 54);
        long j43 = j42 ^ (j42 << 1);
        long j44 = j43 ^ (j43 << 2);
        long j45 = j44 ^ (j44 << 4);
        long j46 = j45 ^ (j45 << 8);
        long j47 = j46 ^ (j46 << 16);
        long j48 = (j47 ^ (j47 << 32)) & 36028797018963967L;
        long j49 = (j33 >>> 1) ^ (j48 >>> 54);
        long j50 = j49 ^ (j49 << 1);
        long j51 = j50 ^ (j50 << 2);
        long j52 = j51 ^ (j51 << 4);
        long j53 = j52 ^ (j52 << 8);
        long j54 = j53 ^ (j53 << 16);
        long j55 = j54 ^ (j54 << 32);
        jArr3[0] = j28;
        jArr3[1] = (j29 ^ j41) ^ jArr4[2];
        jArr3[2] = ((j30 ^ j48) ^ j41) ^ jArr4[3];
        jArr3[3] = j48 ^ j55;
        jArr3[4] = jArr4[2] ^ j55;
        jArr3[5] = jArr4[3];
        long j56 = jArr3[0];
        long j57 = jArr3[1];
        long j58 = jArr3[2];
        long j59 = jArr3[3];
        long j60 = jArr3[4];
        long j61 = jArr3[5];
        jArr3[0] = j56 ^ (j57 << 55);
        jArr3[1] = (j57 >>> 9) ^ (j58 << 46);
        jArr3[2] = (j58 >>> 18) ^ (j59 << 37);
        jArr3[3] = (j59 >>> 27) ^ (j60 << 28);
        jArr3[4] = (j60 >>> 36) ^ (j61 << 19);
        jArr3[5] = j61 >>> 45;
    }

    public static void N(long j10, long j11, long[] jArr, int i) {
        long j12 = j10;
        long[] jArr2 = new long[8];
        jArr2[1] = j11;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j11;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j11;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j11;
        long j13 = jArr2[((int) j12) & 3];
        long j14 = 0;
        int i10 = 47;
        do {
            int i11 = (int) (j12 >>> i10);
            long j15 = (jArr2[i11 & 7] ^ (jArr2[(i11 >>> 3) & 7] << 3)) ^ (jArr2[(i11 >>> 6) & 7] << 6);
            j13 ^= j15 << i10;
            j14 ^= j15 >>> (-i10);
            i10 -= 9;
        } while (i10 > 0);
        jArr[i] = 36028797018963967L & j13;
        jArr[i + 1] = (j13 >>> 55) ^ (j14 << 9);
    }

    public static void O(long[] jArr, long[] jArr2) {
        e.L(jArr[0], jArr2, 0);
        e.L(jArr[1], jArr2, 2);
        e.L(jArr[2], jArr2, 4);
    }

    public static final int P(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static final Map Q(f fVar) {
        e.D(fVar, "pair");
        Map singletonMap = Collections.singletonMap(fVar.f8541a, fVar.f8542b);
        e.C(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static void R(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        android.support.v4.media.b.m1(iArr, iArr2, iArr4);
        X(iArr4, iArr3);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        M(jArr, jArr2, jArr4);
        Y(jArr4, jArr3);
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        android.support.v4.media.b.o1(iArr, iArr2, iArr4);
        Z(iArr4, iArr3);
    }

    public static void U(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        android.support.v4.media.b.q1(iArr, iArr2, iArr4);
        a0(iArr4, iArr3);
    }

    public static void V(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        M(jArr, jArr2, jArr4);
        m(jArr3, jArr4, jArr3);
    }

    public static void W(int[] iArr, int[] iArr2) {
        if (android.support.v4.media.b.X0(iArr)) {
            iArr2[0] = 0;
            iArr2[1] = 0;
            iArr2[2] = 0;
            iArr2[3] = 0;
            iArr2[4] = 0;
            return;
        }
        android.support.v4.media.b.W1(f189a, iArr, iArr2);
    }

    public static void X(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[5]) & 4294967295L;
        long j11 = ((long) iArr[6]) & 4294967295L;
        long j12 = ((long) iArr[7]) & 4294967295L;
        long j13 = ((long) iArr[8]) & 4294967295L;
        long j14 = ((long) iArr[9]) & 4294967295L;
        long j15 = (((long) iArr[0]) & 4294967295L) + j10 + (j10 << 31) + 0;
        iArr3[0] = (int) j15;
        long j16 = (((long) iArr[1]) & 4294967295L) + j11 + (j11 << 31) + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = (((long) iArr[2]) & 4294967295L) + j12 + (j12 << 31) + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = (((long) iArr[3]) & 4294967295L) + j13 + (j13 << 31) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        long j19 = (4294967295L & ((long) iArr[4])) + j14 + (j14 << 31) + (j18 >>> 32);
        iArr3[4] = (int) j19;
        b0((int) (j19 >>> 32), iArr3);
    }

    public static void Y(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = j13 ^ ((((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)) ^ (j15 >>> 28));
        long j17 = j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36));
        long j18 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((j14 >>> 28) ^ (((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)));
        long j19 = j10 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36));
        long j20 = j17 ^ ((j16 >>> 28) ^ (((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)));
        long j21 = j18 >>> 35;
        jArr2[0] = (((j19 ^ j21) ^ (j21 << 3)) ^ (j21 << 6)) ^ (j21 << 7);
        jArr2[1] = j20;
        jArr2[2] = 34359738367L & j18;
    }

    public static void Z(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) 6803) & 4294967295L;
        long j11 = ((long) iArr[7]) & 4294967295L;
        long j12 = (j10 * j11) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j12;
        long j13 = ((long) iArr[8]) & 4294967295L;
        long j14 = (j10 * j13) + j11 + (((long) iArr[1]) & 4294967295L) + (j12 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[9]) & 4294967295L;
        long j16 = (j10 * j15) + j13 + (((long) iArr[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[10]) & 4294967295L;
        long j18 = j10;
        long j19 = (j10 * j17) + j15 + (((long) iArr[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = ((long) iArr[11]) & 4294967295L;
        long j21 = (j18 * j20) + j17 + (((long) iArr[4]) & 4294967295L) + (j19 >>> 32);
        iArr3[4] = (int) j21;
        long j22 = ((long) iArr[12]) & 4294967295L;
        long j23 = (j18 * j22) + j20 + (((long) iArr[5]) & 4294967295L) + (j21 >>> 32);
        iArr3[5] = (int) j23;
        long j24 = ((long) iArr[13]) & 4294967295L;
        long j25 = (j18 * j24) + j22 + (((long) iArr[6]) & 4294967295L) + (j23 >>> 32);
        iArr3[6] = (int) j25;
        long j26 = (j25 >>> 32) + j24;
        long j27 = j26 & 4294967295L;
        long j28 = (j18 * j27) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j28;
        long j29 = j26 >>> 32;
        long j30 = (j18 * j29) + j27 + (((long) iArr3[1]) & 4294967295L) + (j28 >>> 32);
        iArr3[1] = (int) j30;
        long j31 = j29 + (((long) iArr3[2]) & 4294967295L) + (j30 >>> 32);
        iArr3[2] = (int) j31;
        long j32 = (j31 >>> 32) + (4294967295L & ((long) iArr3[3]));
        iArr3[3] = (int) j32;
        if (((j32 >>> 32) == 0 ? 0 : android.support.v4.media.b.H0(7, iArr3, 4)) != 0 || (iArr3[6] == -1 && android.support.v4.media.b.C0(iArr3, f192s))) {
            android.support.v4.media.b.o(7, 6803, iArr3);
        }
    }

    public static void a0(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j10 = ((long) iArr[17]) & 4294967295L;
        long j11 = ((long) iArr[20]) & 4294967295L;
        long j12 = ((long) iArr[21]) & 4294967295L;
        long j13 = ((long) iArr[19]) & 4294967295L;
        long j14 = ((long) iArr[22]) & 4294967295L;
        long j15 = ((long) iArr[18]) & 4294967295L;
        long j16 = ((long) iArr[23]) & 4294967295L;
        long j17 = ((long) iArr[16]) & 4294967295L;
        long j18 = ((((long) iArr[12]) & 4294967295L) + j11) - 1;
        long j19 = j11;
        long j20 = (((long) iArr[13]) & 4294967295L) + j14;
        long j21 = (((long) iArr[14]) & 4294967295L) + j14 + j16;
        long j22 = (((long) iArr[15]) & 4294967295L) + j16;
        long j23 = j10 + j12;
        long j24 = j12 - j16;
        long j25 = j18 + j24;
        long j26 = j14 - j16;
        long j27 = (((long) iArr[0]) & 4294967295L) + j25 + 0;
        iArr3[0] = (int) j27;
        long j28 = (((((long) iArr[1]) & 4294967295L) + j16) - j18) + j20 + (j27 >> 32);
        iArr3[1] = (int) j28;
        long j29 = (((((long) iArr[2]) & 4294967295L) - j12) - j20) + j21 + (j28 >> 32);
        iArr3[2] = (int) j29;
        long j30 = ((((long) iArr[3]) & 4294967295L) - j21) + j22 + j25 + (j29 >> 32);
        iArr3[3] = (int) j30;
        long j31 = (((((((long) iArr[4]) & 4294967295L) + j17) + j12) + j20) - j22) + j25 + (j30 >> 32);
        iArr3[4] = (int) j31;
        long j32 = ((((long) iArr[5]) & 4294967295L) - j17) + j20 + j21 + j23 + (j31 >> 32);
        iArr3[5] = (int) j32;
        long j33 = (((((long) iArr[6]) & 4294967295L) + j15) - j10) + j21 + j22 + (j32 >> 32);
        iArr3[6] = (int) j33;
        long j34 = ((((((long) iArr[7]) & 4294967295L) + j17) + j13) - j15) + j22 + (j33 >> 32);
        iArr3[7] = (int) j34;
        long j35 = (((((((long) iArr[8]) & 4294967295L) + j17) + j10) + j19) - j13) + (j34 >> 32);
        iArr3[8] = (int) j35;
        long j36 = (((((long) iArr[9]) & 4294967295L) + j15) - j19) + j23 + (j35 >> 32);
        iArr3[9] = (int) j36;
        long j37 = ((((((long) iArr[10]) & 4294967295L) + j15) + j13) - j24) + j26 + (j36 >> 32);
        iArr3[10] = (int) j37;
        long j38 = ((((((long) iArr[11]) & 4294967295L) + j13) + j19) - j26) + (j37 >> 32);
        iArr3[11] = (int) j38;
        d0((int) ((j38 >> 32) + 1), iArr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r12 == 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b0(int r12, int[] r13) {
        /*
            r0 = 5
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r12 == 0) goto L_0x0036
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r12
            long r6 = r6 & r4
            long r6 = r6 * r2
            r12 = 0
            r2 = r13[r12]
            long r2 = (long) r2
            long r2 = r2 & r4
            long r6 = r6 + r2
            r2 = 0
            long r6 = r6 + r2
            int r8 = (int) r6
            r13[r12] = r8
            r8 = 32
            long r6 = r6 >>> r8
            r9 = 1
            r10 = r13[r9]
            long r10 = (long) r10
            long r4 = r4 & r10
            long r6 = r6 + r4
            int r4 = (int) r6
            r13[r9] = r4
            long r4 = r6 >>> r8
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            r12 = 2
            int r12 = android.support.v4.media.b.H0(r0, r13, r12)
        L_0x0034:
            if (r12 != 0) goto L_0x0044
        L_0x0036:
            r12 = 4
            r12 = r13[r12]
            r2 = -1
            if (r12 != r2) goto L_0x0047
            int[] r12 = f189a
            boolean r12 = android.support.v4.media.b.A0(r13, r12)
            if (r12 == 0) goto L_0x0047
        L_0x0044:
            android.support.v4.media.b.C(r0, r1, r13)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.b.b0(int, int[]):void");
    }

    public static ie.e c(int i, ie.d dVar, int i10) {
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            i = 0;
        }
        if ((i10 & 2) != 0) {
            dVar = ie.d.SUSPEND;
        }
        int i11 = 1;
        if (i == -2) {
            if (dVar == ie.d.SUSPEND) {
                Objects.requireNonNull(ie.e.f6430f);
                i11 = e.a.f6432b;
            }
            return new ie.c(i11, dVar, (xd.l) null);
        } else if (i == -1) {
            if (dVar == ie.d.SUSPEND) {
                z10 = true;
            }
            if (z10) {
                return new k((xd.l) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new ie.l((xd.l) null);
            }
            if (i == 1 && dVar == ie.d.DROP_OLDEST) {
                return new k((xd.l) null);
            }
            return new ie.c(i, dVar, (xd.l) null);
        } else if (dVar == ie.d.SUSPEND) {
            return new ie.r((xd.l) null);
        } else {
            return new ie.c(1, dVar, (xd.l) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (r14 == 0) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c0(int r14, int[] r15) {
        /*
            r0 = 7
            r1 = 6803(0x1a93, float:9.533E-42)
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
            r14 = 6
            r14 = r15[r14]
            r2 = -1
            if (r14 != r2) goto L_0x0051
            int[] r14 = f192s
            boolean r14 = android.support.v4.media.b.C0(r15, r14)
            if (r14 == 0) goto L_0x0051
        L_0x004e:
            android.support.v4.media.b.o(r0, r1, r15)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.b.c0(int, int[]):void");
    }

    public static /* synthetic */ int d(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static void d0(int i, int[] iArr) {
        long j10;
        if (i != 0) {
            long j11 = ((long) i) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11 + 0;
            iArr[0] = (int) j12;
            long j13 = ((((long) iArr[1]) & 4294967295L) - j11) + (j12 >> 32);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = (((long) iArr[3]) & 4294967295L) + j11 + j14;
            iArr[3] = (int) j16;
            long j17 = (4294967295L & ((long) iArr[4])) + j11 + (j16 >> 32);
            iArr[4] = (int) j17;
            j10 = j17 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 != 0 && android.support.v4.media.b.G0(12, iArr, 5) != 0) || (iArr[11] == -1 && android.support.v4.media.b.y0(12, iArr, f195v))) {
            n(iArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r8.n0() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e0(pd.d r6, java.lang.Object r7, xd.l r8) {
        /*
            boolean r0 = r6 instanceof le.e
            if (r0 == 0) goto L_0x00b6
            le.e r6 = (le.e) r6
            java.lang.Object r8 = ad.c.B0(r7, r8)
            ge.z r0 = r6.f8237s
            pd.f r1 = r6.getContext()
            boolean r0 = r0.v0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f8239u = r8
            r6.f5430c = r1
            ge.z r7 = r6.f8237s
            pd.f r8 = r6.getContext()
            r7.p0(r8, r6)
            goto L_0x00b9
        L_0x0026:
            ge.y1 r0 = ge.y1.f5472a
            ge.u0 r0 = ge.y1.a()
            boolean r2 = r0.A0()
            if (r2 == 0) goto L_0x003b
            r6.f8239u = r8
            r6.f5430c = r1
            r0.y0(r6)
            goto L_0x00b9
        L_0x003b:
            r0.z0(r1)
            r2 = 0
            pd.f r3 = r6.getContext()     // Catch:{ all -> 0x00a9 }
            ge.g1$b r4 = ge.g1.b.f5401a     // Catch:{ all -> 0x00a9 }
            pd.f$a r3 = r3.get(r4)     // Catch:{ all -> 0x00a9 }
            ge.g1 r3 = (ge.g1) r3     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x006b
            boolean r4 = r3.a()     // Catch:{ all -> 0x00a9 }
            if (r4 != 0) goto L_0x006b
            java.util.concurrent.CancellationException r3 = r3.S()     // Catch:{ all -> 0x00a9 }
            boolean r4 = r8 instanceof ge.u     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x0062
            ge.u r8 = (ge.u) r8     // Catch:{ all -> 0x00a9 }
            xd.l<java.lang.Throwable, md.m> r8 = r8.f5451b     // Catch:{ all -> 0x00a9 }
            r8.k(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0062:
            java.lang.Object r8 = l6.b1.k(r3)     // Catch:{ all -> 0x00a9 }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00a9 }
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = 0
        L_0x006c:
            if (r8 != 0) goto L_0x00a2
            pd.d<T> r8 = r6.f8238t     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r6.f8240v     // Catch:{ all -> 0x00a9 }
            pd.f r4 = r8.getContext()     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = le.t.b(r4, r3)     // Catch:{ all -> 0x00a9 }
            le.r r5 = le.t.f8267a     // Catch:{ all -> 0x00a9 }
            if (r3 == r5) goto L_0x0083
            ge.c2 r8 = ge.y.d(r8, r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0084
        L_0x0083:
            r8 = r2
        L_0x0084:
            pd.d<T> r5 = r6.f8238t     // Catch:{ all -> 0x0095 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0091
            boolean r7 = r8.n0()     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x00a2
        L_0x0091:
            le.t.a(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
            if (r8 == 0) goto L_0x009e
            boolean r8 = r8.n0()     // Catch:{ all -> 0x00a9 }
            if (r8 == 0) goto L_0x00a1
        L_0x009e:
            le.t.a(r4, r3)     // Catch:{ all -> 0x00a9 }
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            boolean r7 = r0.C0()     // Catch:{ all -> 0x00a9 }
            if (r7 != 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a9:
            r7 = move-exception
            r6.f(r7, r2)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r0.w0(r1)
            goto L_0x00b9
        L_0x00b1:
            r6 = move-exception
            r0.w0(r1)
            throw r6
        L_0x00b6:
            r6.resumeWith(r7)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.b.e0(pd.d, java.lang.Object, xd.l):void");
    }

    public static final ji.l f() {
        l.a r10 = ji.l.r();
        r10.o(Utils.DOUBLE_EPSILON);
        r10.p(Utils.DOUBLE_EPSILON);
        r10.l(Utils.DOUBLE_EPSILON);
        r10.m(0.0f);
        r10.n(0);
        return (ji.l) r10.i();
    }

    public static byte[] f0(byte[] bArr) {
        int length = bArr.length;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr, 0, length);
            return instance.digest();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void g0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        android.support.v4.media.b.M1(iArr, iArr3);
        X(iArr3, iArr2);
    }

    public static final ji.l h(i iVar) {
        l.a r10 = ji.l.r();
        r10.n(iVar.e());
        r10.o(iVar.b());
        r10.p(iVar.a());
        r10.l(iVar.c());
        r10.m(iVar.d());
        return (ji.l) r10.i();
    }

    public static void h0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        android.support.v4.media.b.O1(iArr, iArr3);
        Z(iArr3, iArr2);
    }

    public static final j i(byte[] bArr) {
        return new j(1, 0, 0, (xe.i) null, new xe.a(bArr), 14);
    }

    public static void i0(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        android.support.v4.media.b.Q1(iArr, iArr3);
        a0(iArr3, iArr2);
    }

    public static void j(yi.a aVar, byte[] bArr, yi.a aVar2, int i) {
        long j10;
        e6.e.D(aVar, "vm");
        e6.e.D(bArr, "<anonymous parameter 1>");
        e6.e.D(aVar2, "$this$DUP");
        int i10 = i - 1;
        long k10 = c3.k.k(aVar2);
        if (i10 != 0) {
            j10 = c3.k.G(aVar2, i10 - 1);
            c3.k.m(aVar2, k10);
        } else {
            j10 = c3.k.m(aVar2, k10);
        }
        c3.k.m(aVar2, j10);
    }

    public static void j0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[10];
        android.support.v4.media.b.M1(iArr, iArr3);
        while (true) {
            X(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.M1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.k(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && android.support.v4.media.b.A0(iArr3, f189a))) {
            android.support.v4.media.b.C(5, -2147483647, iArr3);
        }
    }

    public static void k0(long[] jArr, int i, long[] jArr2) {
        long[] jArr3 = new long[6];
        O(jArr, jArr3);
        while (true) {
            Y(jArr3, jArr2);
            i--;
            if (i > 0) {
                O(jArr2, jArr3);
            } else {
                return;
            }
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.i(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && android.support.v4.media.b.y0(12, iArr3, f195v))) {
            n(iArr3);
        }
    }

    public static void l0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[14];
        android.support.v4.media.b.O1(iArr, iArr3);
        while (true) {
            Z(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.O1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void m0(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[24];
        android.support.v4.media.b.Q1(iArr, iArr3);
        while (true) {
            a0(iArr3, iArr2);
            i--;
            if (i > 0) {
                android.support.v4.media.b.Q1(iArr2, iArr3);
            } else {
                return;
            }
        }
    }

    public static void n(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = (((long) iArr[3]) & 4294967295L) + 1 + j12;
        iArr[3] = (int) j14;
        long j15 = (4294967295L & ((long) iArr[4])) + 1 + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            android.support.v4.media.b.G0(12, iArr, 5);
        }
    }

    public static final Object n0(q qVar, Object obj, p pVar) {
        Object obj2;
        Object V;
        try {
            x.a(pVar, 2);
            obj2 = pVar.invoke(obj, qVar);
        } catch (Throwable th2) {
            obj2 = new t(th2);
        }
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        if (obj2 == aVar || (V = qVar.V(obj2)) == a.b.f5s) {
            return aVar;
        }
        if (!(V instanceof t)) {
            return a.b.R0(V);
        }
        throw ((t) V).f5447a;
    }

    public static String o(int i, int i10, String str) {
        if (i < 0) {
            return b1.q("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i10 >= 0) {
            return b1.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.b(26, "negative size: ", i10));
        }
    }

    public static void o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.W1(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - (4294967295L & ((long) -2147483647));
            iArr3[0] = (int) j10;
            if ((j10 >> 32) != 0) {
                android.support.v4.media.b.Y(5, iArr3, 1);
            }
        }
    }

    public static void p(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void p0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.Y1(iArr, iArr2, iArr3) != 0) {
            android.support.v4.media.b.a2(7, 6803, iArr3);
        }
    }

    public static void q(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void q0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (android.support.v4.media.b.R1(12, iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = (((long) iArr3[1]) & 4294967295L) + 1 + (j10 >> 32);
            iArr3[1] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j12 = j13 >> 32;
            }
            long j14 = ((((long) iArr3[3]) & 4294967295L) - 1) + j12;
            iArr3[3] = (int) j14;
            long j15 = ((4294967295L & ((long) iArr3[4])) - 1) + (j14 >> 32);
            iArr3[4] = (int) j15;
            if ((j15 >> 32) != 0) {
                android.support.v4.media.b.Y(12, iArr3, 5);
            }
        }
    }

    public static void r(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final Map r0(Map map) {
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        e6.e.C(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static void s(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(b1.q(str, Character.valueOf(c10)));
        }
    }

    public static final void s0(Map map, a aVar) {
        e6.e.D(map, "$this$type");
        e6.e.D(aVar, "type");
        J(map, aVar.f10398a).f10406b = aVar;
    }

    public static int t(int i, int i10) {
        String str;
        if (i >= 0 && i < i10) {
            return i;
        }
        if (i < 0) {
            str = b1.q("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else if (i10 >= 0) {
            str = b1.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            throw new IllegalArgumentException(android.support.v4.media.a.b(26, "negative size: ", i10));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static Object u(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        return obj;
    }

    public static Object v(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int w(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return i;
        }
        throw new IndexOutOfBoundsException(o(i, i10, "index"));
    }

    public static void x(int i, int i10, int i11) {
        String str;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                str = o(i, i11, "start index");
            } else if (i10 < 0 || i10 > i11) {
                str = o(i10, i11, "end index");
            } else {
                str = b1.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void y(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static byte[] z(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public void F(e6.k kVar, float f10, float f11) {
        throw null;
    }

    public Object a() {
        return new TreeMap();
    }

    public void b(d0 d0Var, a0 a0Var) {
        e6.e.D(a0Var, "response");
    }

    public int e(NodleContext nodleContext) {
        NetworkCapabilities networkCapabilities;
        e6.e.D(nodleContext, "context");
        ((a9.c) nodleContext.getSdkConfig()).g("NodleNetwork");
        Object systemService = ((ac.a) nodleContext).f289a.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return 1;
        }
        if (!networkCapabilities.hasTransport(1)) {
            if (networkCapabilities.hasTransport(0)) {
                return 2;
            }
            if (!networkCapabilities.hasTransport(3)) {
                return networkCapabilities.hasTransport(2) ? 4 : 1;
            }
        }
        return 3;
    }

    public /* synthetic */ Object zza() {
        return new n6.c();
    }

    public Object zza(IBinder iBinder) {
        int i = o6.b.f9318a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof o6.c ? (o6.c) queryLocalInterface : new o6.a(iBinder);
    }
}
