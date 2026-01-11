package i7;

import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.R;
import i7.e;
import i7.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.jpountz.lz4.LZ4BlockOutputStream;
import sun.misc.Unsafe;

public final class t0<T> implements f1<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f6361r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f6362s = p1.o();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6363a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6364b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6365c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6366d;

    /* renamed from: e  reason: collision with root package name */
    public final q0 f6367e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6368f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6369h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f6370j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6371k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6372l;

    /* renamed from: m  reason: collision with root package name */
    public final v0 f6373m;

    /* renamed from: n  reason: collision with root package name */
    public final g0 f6374n;

    /* renamed from: o  reason: collision with root package name */
    public final l1<?, ?> f6375o;

    /* renamed from: p  reason: collision with root package name */
    public final q<?> f6376p;

    /* renamed from: q  reason: collision with root package name */
    public final l0 f6377q;

    public t0(int[] iArr, Object[] objArr, int i10, int i11, q0 q0Var, boolean z, int[] iArr2, int i12, int i13, v0 v0Var, g0 g0Var, l1 l1Var, q qVar, l0 l0Var) {
        this.f6363a = iArr;
        this.f6364b = objArr;
        this.f6365c = i10;
        this.f6366d = i11;
        this.g = q0Var instanceof x;
        this.f6369h = z;
        this.f6368f = qVar != null && qVar.e(q0Var);
        this.i = false;
        this.f6370j = iArr2;
        this.f6371k = i12;
        this.f6372l = i13;
        this.f6373m = v0Var;
        this.f6374n = g0Var;
        this.f6375o = l1Var;
        this.f6376p = qVar;
        this.f6367e = q0Var;
        this.f6377q = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> i7.t0<T> A(i7.d1 r35, i7.v0 r36, i7.g0 r37, i7.l1<?, ?> r38, i7.q<?> r39, i7.l0 r40) {
        /*
            r0 = r35
            int r1 = r0.f6251d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x000b
            i7.a1 r1 = i7.a1.PROTO2
            goto L_0x000d
        L_0x000b:
            i7.a1 r1 = i7.a1.PROTO3
        L_0x000d:
            i7.a1 r3 = i7.a1.PROTO3
            r4 = 0
            if (r1 != r3) goto L_0x0014
            r11 = r2
            goto L_0x0015
        L_0x0014:
            r11 = r4
        L_0x0015:
            java.lang.String r1 = r0.f6249b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r2
            r9 = 13
        L_0x0029:
            int r10 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r6) goto L_0x0039
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0029
        L_0x0039:
            int r8 = r8 << r9
            r5 = r5 | r8
            goto L_0x003d
        L_0x003c:
            r10 = r2
        L_0x003d:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r6) goto L_0x005c
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0049:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r6) goto L_0x0059
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x0049
        L_0x0059:
            int r8 = r8 << r10
            r9 = r9 | r8
            r8 = r12
        L_0x005c:
            if (r9 != 0) goto L_0x0069
            int[] r9 = f6361r
            r7 = r4
            r10 = r7
            r13 = r10
            r14 = r13
            r15 = r14
            r12 = r9
            r9 = r15
            goto L_0x0185
        L_0x0069:
            int r9 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r6) goto L_0x0088
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0075:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0085
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0075
        L_0x0085:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r12
        L_0x0088:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00a7
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x0094:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00a4
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x0094
        L_0x00a4:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00a7:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00c6
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00b3:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00c3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00b3
        L_0x00c3:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00c6:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00e5
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00d2:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00e2
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00d2
        L_0x00e2:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00e5:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0106
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00f1:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0102
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00f1
        L_0x0102:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0106:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0129
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0112:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0124
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0112
        L_0x0124:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0129:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0137:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0149
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0137
        L_0x0149:
            int r4 = r4 << r16
            r15 = r15 | r4
            r4 = r18
            goto L_0x0151
        L_0x014f:
            r4 = r16
        L_0x0151:
            int r16 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0176
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = r16
            r16 = 13
        L_0x015f:
            int r19 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0171
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r16
            r4 = r4 | r7
            int r16 = r16 + 13
            r7 = r19
            goto L_0x015f
        L_0x0171:
            int r7 = r7 << r16
            r4 = r4 | r7
            r16 = r19
        L_0x0176:
            int r7 = r4 + r14
            int r7 = r7 + r15
            int[] r7 = new int[r7]
            int r15 = r8 * 2
            int r15 = r15 + r9
            r9 = r12
            r12 = r7
            r7 = r14
            r14 = r4
            r4 = r8
            r8 = r16
        L_0x0185:
            sun.misc.Unsafe r2 = f6362s
            java.lang.Object[] r6 = r0.f6250c
            r20 = r8
            i7.q0 r8 = r0.f6248a
            java.lang.Class r8 = r8.getClass()
            r21 = r15
            int r15 = r13 * 3
            int[] r15 = new int[r15]
            int r13 = r13 * 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r22 = r14 + r7
            r24 = r14
            r7 = r20
            r25 = r22
            r20 = 0
            r23 = 0
        L_0x01a7:
            if (r7 >= r3) goto L_0x0405
            int r26 = r7 + 1
            char r7 = r1.charAt(r7)
            r27 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01db
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r26
            r26 = 13
        L_0x01bc:
            int r28 = r3 + 1
            char r3 = r1.charAt(r3)
            r29 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x01d5
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r7 = r7 | r3
            int r26 = r26 + 13
            r3 = r28
            r14 = r29
            goto L_0x01bc
        L_0x01d5:
            int r3 = r3 << r26
            r7 = r7 | r3
            r3 = r28
            goto L_0x01df
        L_0x01db:
            r29 = r14
            r3 = r26
        L_0x01df:
            int r14 = r3 + 1
            char r3 = r1.charAt(r3)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0211
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x01f2:
            int r28 = r14 + 1
            char r14 = r1.charAt(r14)
            r30 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r11) goto L_0x020b
            r11 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r26
            r3 = r3 | r11
            int r26 = r26 + 13
            r14 = r28
            r11 = r30
            goto L_0x01f2
        L_0x020b:
            int r11 = r14 << r26
            r3 = r3 | r11
            r14 = r28
            goto L_0x0215
        L_0x0211:
            r30 = r11
            r14 = r26
        L_0x0215:
            r11 = r3 & 255(0xff, float:3.57E-43)
            r26 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0223
            int r9 = r20 + 1
            r12[r20] = r23
            r20 = r9
        L_0x0223:
            r9 = 51
            if (r11 < r9) goto L_0x02cf
            int r9 = r14 + 1
            char r14 = r1.charAt(r14)
            r28 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r9) goto L_0x025b
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r28
            r28 = r14
            r14 = r34
        L_0x023e:
            int r33 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r9) goto L_0x0254
            r9 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r28 = r28 | r9
            int r32 = r32 + 13
            r14 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x023e
        L_0x0254:
            int r9 = r14 << r32
            r14 = r28 | r9
            r9 = r33
            goto L_0x025d
        L_0x025b:
            r9 = r28
        L_0x025d:
            r28 = r9
            int r9 = r11 + -51
            r32 = r10
            r10 = 9
            if (r9 == r10) goto L_0x0281
            r10 = 17
            if (r9 != r10) goto L_0x026c
            goto L_0x0281
        L_0x026c:
            r10 = 12
            if (r9 != r10) goto L_0x028f
            r9 = r5 & 1
            r10 = 1
            if (r9 != r10) goto L_0x028f
            int r9 = r23 / 3
            int r9 = r9 * 2
            int r9 = r9 + r10
            int r10 = r21 + 1
            r21 = r6[r21]
            r13[r9] = r21
            goto L_0x028d
        L_0x0281:
            int r9 = r23 / 3
            int r9 = r9 * 2
            r10 = 1
            int r9 = r9 + r10
            int r10 = r21 + 1
            r21 = r6[r21]
            r13[r9] = r21
        L_0x028d:
            r21 = r10
        L_0x028f:
            int r14 = r14 * 2
            r9 = r6[r14]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x029a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x02a2
        L_0x029a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = S(r8, r9)
            r6[r14] = r9
        L_0x02a2:
            long r9 = r2.objectFieldOffset(r9)
            int r9 = (int) r9
            int r14 = r14 + 1
            r10 = r6[r14]
            r31 = r9
            boolean r9 = r10 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x02b4
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x02bc
        L_0x02b4:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = S(r8, r10)
            r6[r14] = r10
        L_0x02bc:
            long r9 = r2.objectFieldOffset(r10)
            int r9 = (int) r9
            r10 = r9
            r9 = r31
            r0 = 55296(0xd800, float:7.7486E-41)
            r14 = 0
            r31 = r28
            r28 = r3
            r3 = r15
            goto L_0x03ca
        L_0x02cf:
            r32 = r10
            int r9 = r21 + 1
            r10 = r6[r21]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = S(r8, r10)
            r0 = 9
            if (r11 == r0) goto L_0x0349
            r0 = 17
            if (r11 != r0) goto L_0x02e5
            goto L_0x0349
        L_0x02e5:
            r0 = 27
            if (r11 == r0) goto L_0x033a
            r0 = 49
            if (r11 != r0) goto L_0x02ee
            goto L_0x033a
        L_0x02ee:
            r0 = 12
            if (r11 == r0) goto L_0x0327
            r0 = 30
            if (r11 == r0) goto L_0x0327
            r0 = 44
            if (r11 != r0) goto L_0x02fb
            goto L_0x0327
        L_0x02fb:
            r0 = 50
            if (r11 != r0) goto L_0x031b
            int r0 = r24 + 1
            r12[r24] = r23
            int r24 = r23 / 3
            int r24 = r24 * 2
            int r28 = r9 + 1
            r9 = r6[r9]
            r13[r24] = r9
            r9 = r3 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x031f
            int r24 = r24 + 1
            int r9 = r28 + 1
            r28 = r6[r28]
            r13[r24] = r28
            r24 = r0
        L_0x031b:
            r28 = r3
            r3 = 1
            goto L_0x0357
        L_0x031f:
            r24 = r0
            r16 = r28
            r28 = r3
            r3 = 1
            goto L_0x0359
        L_0x0327:
            r0 = r5 & 1
            r28 = r3
            r3 = 1
            if (r0 != r3) goto L_0x0357
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            int r16 = r9 + 1
            r9 = r6[r9]
            r13[r0] = r9
            goto L_0x0359
        L_0x033a:
            r28 = r3
            r3 = 1
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            int r16 = r9 + 1
            r9 = r6[r9]
            r13[r0] = r9
            goto L_0x0359
        L_0x0349:
            r28 = r3
            r3 = 1
            int r0 = r23 / 3
            int r0 = r0 * 2
            int r0 = r0 + r3
            java.lang.Class r16 = r10.getType()
            r13[r0] = r16
        L_0x0357:
            r16 = r9
        L_0x0359:
            long r9 = r2.objectFieldOffset(r10)
            int r9 = (int) r9
            r0 = r5 & 1
            if (r0 != r3) goto L_0x03b2
            r0 = 17
            if (r11 > r0) goto L_0x03b2
            int r0 = r14 + 1
            char r10 = r1.charAt(r14)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r10 < r14) goto L_0x038b
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0375:
            int r31 = r0 + 1
            char r0 = r1.charAt(r0)
            if (r0 < r14) goto L_0x0387
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r19
            r10 = r10 | r0
            int r19 = r19 + 13
            r0 = r31
            goto L_0x0375
        L_0x0387:
            int r0 = r0 << r19
            r10 = r10 | r0
            goto L_0x038d
        L_0x038b:
            r31 = r0
        L_0x038d:
            int r0 = r4 * 2
            int r19 = r10 / 32
            int r19 = r19 + r0
            r0 = r6[r19]
            boolean r3 = r0 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L_0x039c
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x03a4
        L_0x039c:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = S(r8, r0)
            r6[r19] = r0
        L_0x03a4:
            r3 = r15
            long r14 = r2.objectFieldOffset(r0)
            int r0 = (int) r14
            int r10 = r10 % 32
            r14 = r10
            r10 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03ba
        L_0x03b2:
            r3 = r15
            r0 = 55296(0xd800, float:7.7486E-41)
            r31 = r14
            r10 = 0
            r14 = 0
        L_0x03ba:
            r15 = 18
            if (r11 < r15) goto L_0x03c8
            r15 = 49
            if (r11 > r15) goto L_0x03c8
            int r15 = r25 + 1
            r12[r25] = r9
            r25 = r15
        L_0x03c8:
            r21 = r16
        L_0x03ca:
            int r15 = r23 + 1
            r3[r23] = r7
            int r7 = r15 + 1
            r16 = r1
            r0 = r28
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x03db
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03dc
        L_0x03db:
            r1 = 0
        L_0x03dc:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03e3
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03e4
        L_0x03e3:
            r0 = 0
        L_0x03e4:
            r0 = r0 | r1
            int r1 = r11 << 20
            r0 = r0 | r1
            r0 = r0 | r9
            r3[r15] = r0
            int r23 = r7 + 1
            int r0 = r14 << 20
            r0 = r0 | r10
            r3[r7] = r0
            r0 = r35
            r15 = r3
            r1 = r16
            r9 = r26
            r3 = r27
            r14 = r29
            r11 = r30
            r7 = r31
            r10 = r32
            goto L_0x01a7
        L_0x0405:
            r26 = r9
            r32 = r10
            r30 = r11
            r29 = r14
            r3 = r15
            i7.t0 r0 = new i7.t0
            r1 = r35
            i7.q0 r10 = r1.f6248a
            r5 = r0
            r6 = r3
            r7 = r13
            r8 = r32
            r13 = r29
            r14 = r22
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.A(i7.d1, i7.v0, i7.g0, i7.l1, i7.q, i7.l0):i7.t0");
    }

    public static long B(int i10) {
        return (long) (i10 & 1048575);
    }

    public static <T> boolean C(T t10, long j10) {
        return ((Boolean) p1.n(t10, j10)).booleanValue();
    }

    public static <T> double D(T t10, long j10) {
        return ((Double) p1.n(t10, j10)).doubleValue();
    }

    public static <T> float E(T t10, long j10) {
        return ((Float) p1.n(t10, j10)).floatValue();
    }

    public static <T> int F(T t10, long j10) {
        return ((Integer) p1.n(t10, j10)).intValue();
    }

    public static <T> long G(T t10, long j10) {
        return ((Long) p1.n(t10, j10)).longValue();
    }

    public static Field S(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder d10 = d.d("Field ", str, " for ");
            d.h(cls, d10, " not found. Known fields are ");
            d10.append(Arrays.toString(declaredFields));
            throw new RuntimeException(d10.toString());
        }
    }

    public static int W(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static m1 p(Object obj) {
        x xVar = (x) obj;
        m1 m1Var = xVar.unknownFields;
        if (m1Var != m1.f6324f) {
            return m1Var;
        }
        m1 m1Var2 = new m1();
        xVar.unknownFields = m1Var2;
        return m1Var2;
    }

    public static List<?> u(Object obj, long j10) {
        return (List) p1.n(obj, j10);
    }

    public static <T> t0 z(o0 o0Var, v0 v0Var, g0 g0Var, l1 l1Var, q qVar, l0 l0Var) {
        if (o0Var instanceof d1) {
            return A((d1) o0Var, v0Var, g0Var, l1Var, qVar, l0Var);
        }
        j1 j1Var = (j1) o0Var;
        a1 a1Var = a1.PROTO3;
        throw null;
    }

    public final <K, V> int H(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.a aVar) throws IOException {
        Unsafe unsafe = f6362s;
        Object n10 = n(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f6377q.c(object)) {
            Object f10 = this.f6377q.f();
            this.f6377q.a(f10, object);
            unsafe.putObject(t10, j10, f10);
            object = f10;
        }
        this.f6377q.e(n10);
        this.f6377q.h(object);
        int t11 = e.t(bArr, i10, aVar);
        int i13 = aVar.f6252a;
        if (i13 < 0 || i13 > i11 - t11) {
            throw a0.h();
        }
        throw null;
    }

    public final int I(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.a aVar) throws IOException {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        e.a aVar2 = aVar;
        Unsafe unsafe = f6362s;
        long j12 = (long) (this.f6363a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(Double.longBitsToDouble(e.c(bArr, i10))));
                    int i23 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(Float.intBitsToFloat(e.b(bArr, i10))));
                    int i24 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int v10 = e.v(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(aVar2.f6253b));
                    unsafe.putInt(t11, j12, i20);
                    return v10;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int t12 = e.t(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(aVar2.f6252a));
                    unsafe.putInt(t11, j12, i20);
                    return t12;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(e.c(bArr, i10)));
                    int i25 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(e.b(bArr, i10)));
                    int i26 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int v11 = e.v(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(aVar2.f6253b != 0));
                    unsafe.putInt(t11, j12, i20);
                    return v11;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int t13 = e.t(bArr2, i18, aVar2);
                    int i27 = aVar2.f6252a;
                    if (i27 == 0) {
                        unsafe.putObject(t11, j11, BuildConfig.FLAVOR);
                    } else if ((i15 & 536870912) == 0 || q1.e(bArr2, t13, t13 + i27)) {
                        unsafe.putObject(t11, j11, new String(bArr2, t13, i27, z.f6396a));
                        t13 += i27;
                    } else {
                        throw a0.c();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return t13;
                }
                break;
            case 60:
                if (i21 == 2) {
                    int e10 = e.e(o(i22), bArr2, i18, i11, aVar2);
                    Object object = unsafe.getInt(t11, j12) == i20 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, aVar2.f6254c);
                    } else {
                        unsafe.putObject(t11, j11, z.c(object, aVar2.f6254c));
                    }
                    unsafe.putInt(t11, j12, i20);
                    return e10;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int a10 = e.a(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, aVar2.f6254c);
                    unsafe.putInt(t11, j12, i20);
                    return a10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int t14 = e.t(bArr2, i18, aVar2);
                    int i28 = aVar2.f6252a;
                    z.c m10 = m(i22);
                    if (m10 == null || m10.a(i28)) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i28));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        p(t10).b(i19, Long.valueOf((long) i28));
                    }
                    return t14;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int t15 = e.t(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(j.b(aVar2.f6252a)));
                    unsafe.putInt(t11, j12, i20);
                    return t15;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int v12 = e.v(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(j.c(aVar2.f6253b)));
                    unsafe.putInt(t11, j12, i20);
                    return v12;
                }
                break;
            case 68:
                if (i21 == 3) {
                    int d10 = e.d(o(i22), bArr, i10, i11, (i19 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t11, j12) == i20 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, aVar2.f6254c);
                    } else {
                        unsafe.putObject(t11, j11, z.c(object2, aVar2.f6254c));
                    }
                    unsafe.putInt(t11, j12, i20);
                    return d10;
                }
                break;
        }
        return i18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e7, code lost:
        r10 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e9, code lost:
        r8 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02eb, code lost:
        r1 = r34;
        r4 = r6;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02f1, code lost:
        r1 = r34;
        r4 = r5;
        r18 = r6;
        r3 = r7;
        r27 = r9;
        r32 = r13;
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0237, code lost:
        r8 = r8 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023a, code lost:
        r1 = r34;
        r4 = r6;
        r3 = r7;
        r2 = r13;
        r7 = r17;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0268, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a4, code lost:
        r0 = r8 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02e5, code lost:
        r8 = r8 | r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int J(T r30, byte[] r31, int r32, int r33, int r34, i7.e.a r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            sun.misc.Unsafe r9 = f6362s
            r16 = 0
            r0 = r32
            r1 = r34
            r3 = r16
            r4 = r3
            r8 = r4
            r2 = -1
            r7 = -1
        L_0x0018:
            if (r0 >= r13) goto L_0x0487
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = i7.e.s(r0, r12, r4, r11)
            int r4 = r11.f6252a
            r5 = r4
            r4 = r0
            goto L_0x002a
        L_0x0029:
            r5 = r0
        L_0x002a:
            int r0 = r5 >>> 3
            r10 = r5 & 7
            r6 = 3
            if (r0 <= r2) goto L_0x0042
            int r3 = r3 / r6
            int r2 = r15.f6365c
            if (r0 < r2) goto L_0x003f
            int r2 = r15.f6366d
            if (r0 > r2) goto L_0x003f
            int r2 = r15.V(r0, r3)
            goto L_0x0046
        L_0x003f:
            r2 = -1
            r3 = -1
            goto L_0x0048
        L_0x0042:
            int r2 = r15.M(r0)
        L_0x0046:
            r3 = r2
            r2 = -1
        L_0x0048:
            if (r3 != r2) goto L_0x0054
            r32 = r0
            r18 = r5
            r27 = r9
            r3 = r16
            goto L_0x03b6
        L_0x0054:
            int[] r1 = r15.f6363a
            int r2 = r3 + 1
            r2 = r1[r2]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r2 & r18
            int r6 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r5
            r5 = r2 & r18
            long r12 = (long) r5
            r5 = 17
            r21 = r2
            if (r6 > r5) goto L_0x02ff
            int r5 = r3 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r2 = 1
            int r22 = r2 << r5
            r1 = r1 & r18
            if (r1 == r7) goto L_0x008b
            r5 = -1
            r17 = r3
            if (r7 == r5) goto L_0x0084
            long r2 = (long) r7
            r9.putInt(r14, r2, r8)
        L_0x0084:
            long r2 = (long) r1
            int r8 = r9.getInt(r14, r2)
            r7 = r1
            goto L_0x008e
        L_0x008b:
            r17 = r3
            r5 = -1
        L_0x008e:
            r1 = 5
            switch(r6) {
                case 0: goto L_0x02c6;
                case 1: goto L_0x02a7;
                case 2: goto L_0x0287;
                case 3: goto L_0x0287;
                case 4: goto L_0x026b;
                case 5: goto L_0x0244;
                case 6: goto L_0x021c;
                case 7: goto L_0x01ef;
                case 8: goto L_0x01c7;
                case 9: goto L_0x018e;
                case 10: goto L_0x0172;
                case 11: goto L_0x026b;
                case 12: goto L_0x013c;
                case 13: goto L_0x021c;
                case 14: goto L_0x0244;
                case 15: goto L_0x011d;
                case 16: goto L_0x00f3;
                case 17: goto L_0x00a2;
                default: goto L_0x0092;
            }
        L_0x0092:
            r12 = r31
            r13 = r0
            r19 = r5
            r6 = r20
            r5 = r4
            r28 = r17
            r17 = r7
            r7 = r28
            goto L_0x02f1
        L_0x00a2:
            r2 = 3
            if (r10 != r2) goto L_0x00e4
            int r1 = r0 << 3
            r6 = r1 | 4
            r3 = r17
            i7.f1 r1 = r15.o(r3)
            r10 = r0
            r0 = r1
            r1 = r31
            r2 = r4
            r4 = r3
            r3 = r33
            r17 = r7
            r7 = r4
            r4 = r6
            r19 = r5
            r6 = r20
            r5 = r35
            int r0 = i7.e.d(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r22
            if (r1 != 0) goto L_0x00cf
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r12, r1)
            goto L_0x00dc
        L_0x00cf:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.f6254c
            java.lang.Object r1 = i7.z.c(r1, r2)
            r9.putObject(r14, r12, r1)
        L_0x00dc:
            r1 = r8 | r22
            r12 = r31
            r8 = r1
            r13 = r10
            goto L_0x02eb
        L_0x00e4:
            r19 = r5
            r6 = r20
            r28 = r17
            r17 = r7
            r7 = r28
            r12 = r31
            r13 = r0
            goto L_0x0268
        L_0x00f3:
            r19 = r5
            r6 = r20
            r5 = r0
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x0118
            r2 = r12
            r12 = r31
            int r10 = i7.e.v(r12, r4, r11)
            long r0 = r11.f6253b
            long r20 = i7.j.c(r0)
            r0 = r9
            r1 = r30
            r13 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x02a4
        L_0x0118:
            r12 = r31
            r13 = r5
            goto L_0x0268
        L_0x011d:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x0268
            int r0 = i7.e.t(r12, r4, r11)
            int r1 = r11.f6252a
            int r1 = i7.j.b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x02e5
        L_0x013c:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x0268
            int r0 = i7.e.t(r12, r4, r11)
            int r1 = r11.f6252a
            i7.z$c r4 = r15.m(r7)
            if (r4 == 0) goto L_0x016d
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x015f
            goto L_0x016d
        L_0x015f:
            i7.m1 r2 = p(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.b(r6, r1)
            goto L_0x02e7
        L_0x016d:
            r9.putInt(r14, r2, r1)
            goto L_0x02e5
        L_0x0172:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r0 = 2
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r0) goto L_0x0268
            int r0 = i7.e.a(r12, r4, r11)
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x02e5
        L_0x018e:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r0 = 2
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r0) goto L_0x01c3
            i7.f1 r0 = r15.o(r7)
            r5 = r33
            int r0 = i7.e.e(r0, r12, r4, r5, r11)
            r1 = r8 & r22
            if (r1 != 0) goto L_0x01b4
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x0237
        L_0x01b4:
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r11.f6254c
            java.lang.Object r1 = i7.z.c(r1, r4)
            r9.putObject(r14, r2, r1)
            goto L_0x0237
        L_0x01c3:
            r5 = r33
            goto L_0x0268
        L_0x01c7:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r5 = r33
            r13 = r0
            r0 = 2
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r0) goto L_0x0268
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01e5
            int r0 = i7.e.p(r12, r4, r11)
            goto L_0x01e9
        L_0x01e5:
            int r0 = i7.e.q(r12, r4, r11)
        L_0x01e9:
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x0237
        L_0x01ef:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r5 = r33
            r13 = r0
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x0268
            int r0 = i7.e.v(r12, r4, r11)
            r32 = r0
            long r0 = r11.f6253b
            r20 = 0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0211
            r0 = 1
            goto L_0x0213
        L_0x0211:
            r0 = r16
        L_0x0213:
            i7.p1.p(r14, r2, r0)
            r0 = r8 | r22
            r8 = r0
            r0 = r32
            goto L_0x023a
        L_0x021c:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r5 = r33
            r13 = r0
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r1) goto L_0x0268
            int r0 = i7.e.b(r12, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0237:
            r1 = r8 | r22
            r8 = r1
        L_0x023a:
            r1 = r34
            r4 = r6
            r3 = r7
            r2 = r13
            r7 = r17
            r13 = r5
            goto L_0x0018
        L_0x0244:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r5 = r33
            r13 = r0
            r0 = 1
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r0) goto L_0x0268
            long r20 = i7.e.c(r12, r4)
            r0 = r9
            r1 = r30
            r10 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            goto L_0x02e5
        L_0x0268:
            r5 = r4
            goto L_0x02f1
        L_0x026b:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r5 = r4
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x02f1
            int r0 = i7.e.t(r12, r5, r11)
            int r1 = r11.f6252a
            r9.putInt(r14, r2, r1)
            goto L_0x02e5
        L_0x0287:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r5 = r4
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != 0) goto L_0x02f1
            int r10 = i7.e.v(r12, r5, r11)
            long r4 = r11.f6253b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x02a4:
            r0 = r8 | r22
            goto L_0x02e9
        L_0x02a7:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r5 = r4
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r1) goto L_0x02f1
            int r0 = i7.e.b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i7.p1.u(r14, r2, r0)
            int r0 = r5 + 4
            goto L_0x02e5
        L_0x02c6:
            r19 = r5
            r2 = r12
            r6 = r20
            r12 = r31
            r13 = r0
            r5 = r4
            r0 = 1
            r28 = r17
            r17 = r7
            r7 = r28
            if (r10 != r0) goto L_0x02f1
            long r0 = i7.e.c(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            i7.p1.t(r14, r2, r0)
            int r0 = r5 + 8
        L_0x02e5:
            r8 = r8 | r22
        L_0x02e7:
            r10 = r0
            r0 = r8
        L_0x02e9:
            r8 = r0
            r0 = r10
        L_0x02eb:
            r1 = r34
            r4 = r6
            r3 = r7
            goto L_0x0347
        L_0x02f1:
            r1 = r34
            r4 = r5
            r18 = r6
            r3 = r7
            r27 = r9
            r32 = r13
            r7 = r17
            goto L_0x03b6
        L_0x02ff:
            r5 = r4
            r17 = r7
            r4 = r20
            r19 = -1
            r7 = r3
            r2 = r12
            r12 = r31
            r13 = r0
            r0 = 27
            if (r6 != r0) goto L_0x035b
            r0 = 2
            if (r10 != r0) goto L_0x034e
            java.lang.Object r0 = r9.getObject(r14, r2)
            i7.z$d r0 = (i7.z.d) r0
            boolean r1 = r0.p0()
            if (r1 != 0) goto L_0x0330
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0327
            r1 = 10
            goto L_0x0329
        L_0x0327:
            int r1 = r1 * 2
        L_0x0329:
            i7.z$d r0 = r0.B(r1)
            r9.putObject(r14, r2, r0)
        L_0x0330:
            r6 = r0
            i7.f1 r0 = r15.o(r7)
            r1 = r4
            r2 = r31
            r3 = r5
            r10 = r4
            r4 = r33
            r5 = r6
            r6 = r35
            int r0 = i7.e.f(r0, r1, r2, r3, r4, r5, r6)
            r1 = r34
            r3 = r7
            r4 = r10
        L_0x0347:
            r2 = r13
            r7 = r17
        L_0x034a:
            r13 = r33
            goto L_0x0018
        L_0x034e:
            r18 = r4
            r15 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r32 = r13
            goto L_0x03ad
        L_0x035b:
            r0 = 49
            if (r6 > r0) goto L_0x0393
            r1 = r21
            long r0 = (long) r1
            r20 = r0
            r0 = r29
            r1 = r30
            r22 = r2
            r2 = r31
            r3 = r5
            r18 = r4
            r4 = r33
            r15 = r5
            r5 = r18
            r24 = r6
            r6 = r13
            r25 = r7
            r7 = r10
            r26 = r8
            r8 = r25
            r27 = r9
            r9 = r20
            r11 = r24
            r32 = r13
            r12 = r22
            r14 = r35
            int r4 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r4 == r15) goto L_0x03ae
            r0 = r4
            goto L_0x03f0
        L_0x0393:
            r22 = r2
            r18 = r4
            r15 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r32 = r13
            r1 = r21
            r0 = 50
            r9 = r24
            if (r9 != r0) goto L_0x03d3
            r0 = 2
            if (r10 == r0) goto L_0x03bf
        L_0x03ad:
            r4 = r15
        L_0x03ae:
            r1 = r34
            r7 = r17
            r3 = r25
            r8 = r26
        L_0x03b6:
            r6 = r1
            r25 = r3
            r2 = r4
            r9 = r18
            r14 = 0
            goto L_0x0413
        L_0x03bf:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r25
            r6 = r22
            r8 = r35
            r0.H(r1, r2, r3, r4, r5, r6, r8)
            r14 = 0
            throw r14
        L_0x03d3:
            r14 = 0
            r0 = r29
            r2 = r1
            r1 = r30
            r8 = r2
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r32
            r7 = r10
            r10 = r22
            r12 = r25
            r13 = r35
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x040a
        L_0x03f0:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r1 = r34
            r11 = r35
            r7 = r17
            r4 = r18
            r3 = r25
            r8 = r26
            r9 = r27
            goto L_0x0018
        L_0x040a:
            r6 = r34
            r2 = r0
            r7 = r17
            r9 = r18
            r8 = r26
        L_0x0413:
            if (r9 != r6) goto L_0x0420
            if (r6 == 0) goto L_0x0420
            r10 = r29
            r13 = r30
            r0 = r2
            r1 = r6
            r4 = r9
            goto L_0x0490
        L_0x0420:
            r10 = r29
            boolean r0 = r10.f6368f
            if (r0 == 0) goto L_0x0465
            r11 = r35
            i7.p r0 = r11.f6255d
            i7.p r1 = i7.p.a()
            if (r0 == r1) goto L_0x0460
            i7.q0 r0 = r10.f6367e
            i7.p r1 = r11.f6255d
            java.util.Map<i7.p$a, i7.x$e<?, ?>> r1 = r1.f6340a
            i7.p$a r3 = new i7.p$a
            r12 = r32
            r3.<init>(r0, r12)
            java.lang.Object r0 = r1.get(r3)
            i7.x$e r0 = (i7.x.e) r0
            if (r0 != 0) goto L_0x0457
            i7.m1 r4 = p(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = i7.e.r(r0, r1, r2, r3, r4, r5)
            r13 = r30
            goto L_0x047a
        L_0x0457:
            r13 = r30
            r0 = r13
            i7.x$c r0 = (i7.x.c) r0
            r0.w()
            throw r14
        L_0x0460:
            r13 = r30
            r12 = r32
            goto L_0x046b
        L_0x0465:
            r13 = r30
            r12 = r32
            r11 = r35
        L_0x046b:
            i7.m1 r4 = p(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = i7.e.r(r0, r1, r2, r3, r4, r5)
        L_0x047a:
            r1 = r6
            r4 = r9
            r15 = r10
            r2 = r12
            r14 = r13
            r3 = r25
            r9 = r27
            r12 = r31
            goto L_0x034a
        L_0x0487:
            r17 = r7
            r26 = r8
            r27 = r9
            r13 = r14
            r10 = r15
            r14 = 0
        L_0x0490:
            r2 = -1
            if (r7 == r2) goto L_0x0499
            long r2 = (long) r7
            r5 = r27
            r5.putInt(r13, r2, r8)
        L_0x0499:
            int r2 = r10.f6371k
        L_0x049b:
            int r3 = r10.f6372l
            if (r2 >= r3) goto L_0x04ab
            int[] r3 = r10.f6370j
            r3 = r3[r2]
            i7.l1<?, ?> r5 = r10.f6375o
            r10.l(r13, r3, r14, r5)
            int r2 = r2 + 1
            goto L_0x049b
        L_0x04ab:
            if (r1 != 0) goto L_0x04b7
            r2 = r33
            if (r0 != r2) goto L_0x04b2
            goto L_0x04bd
        L_0x04b2:
            i7.a0 r0 = i7.a0.g()
            throw r0
        L_0x04b7:
            r2 = r33
            if (r0 > r2) goto L_0x04be
            if (r4 != r1) goto L_0x04be
        L_0x04bd:
            return r0
        L_0x04be:
            i7.a0 r0 = i7.a0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.J(java.lang.Object, byte[], int, int, int, i7.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0236, code lost:
        if (r0 != r15) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        r19 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0145, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0169, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016b, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016e, code lost:
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ec, code lost:
        if (r0 != r15) goto L_0x024a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int K(T r28, byte[] r29, int r30, int r31, i7.e.a r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f6362s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = r10
            r2 = r16
        L_0x0014:
            if (r0 >= r13) goto L_0x025e
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = i7.e.s(r0, r12, r3, r11)
            int r3 = r11.f6252a
            r8 = r0
            r17 = r3
            goto L_0x0029
        L_0x0026:
            r17 = r0
            r8 = r3
        L_0x0029:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.f6365c
            if (r7 < r0) goto L_0x003e
            int r0 = r15.f6366d
            if (r7 > r0) goto L_0x003e
            int r0 = r15.V(r7, r2)
            goto L_0x0044
        L_0x003e:
            r4 = r10
            goto L_0x0045
        L_0x0040:
            int r0 = r15.M(r7)
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 != r10) goto L_0x0052
            r24 = r7
            r2 = r8
            r18 = r9
            r26 = r10
            r19 = r16
            goto L_0x023a
        L_0x0052:
            int[] r0 = r15.f6363a
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0171
            r0 = 1
            switch(r3) {
                case 0: goto L_0x015a;
                case 1: goto L_0x0147;
                case 2: goto L_0x0135;
                case 3: goto L_0x0135;
                case 4: goto L_0x0127;
                case 5: goto L_0x0117;
                case 6: goto L_0x0106;
                case 7: goto L_0x00ef;
                case 8: goto L_0x00d8;
                case 9: goto L_0x00b7;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0127;
                case 12: goto L_0x009b;
                case 13: goto L_0x0106;
                case 14: goto L_0x0117;
                case 15: goto L_0x0088;
                case 16: goto L_0x006d;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x01af
        L_0x006d:
            if (r6 != 0) goto L_0x01af
            int r6 = i7.e.v(r12, r8, r11)
            r19 = r1
            long r0 = r11.f6253b
            long r21 = i7.j.c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x0145
        L_0x0088:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016e
            int r0 = i7.e.t(r12, r8, r11)
            int r1 = r11.f6252a
            int r1 = i7.j.b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x016b
        L_0x009b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016e
            int r0 = i7.e.t(r12, r8, r11)
            int r1 = r11.f6252a
            r9.putInt(r14, r2, r1)
            goto L_0x016b
        L_0x00aa:
            r2 = r1
            if (r6 != r10) goto L_0x01af
            int r0 = i7.e.a(r12, r8, r11)
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x0113
        L_0x00b7:
            r2 = r1
            if (r6 != r10) goto L_0x01af
            i7.f1 r0 = r15.o(r4)
            int r0 = i7.e.e(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00ce
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x0113
        L_0x00ce:
            java.lang.Object r5 = r11.f6254c
            java.lang.Object r1 = i7.z.c(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0113
        L_0x00d8:
            r2 = r1
            if (r6 != r10) goto L_0x01af
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00e5
            int r0 = i7.e.p(r12, r8, r11)
            goto L_0x00e9
        L_0x00e5:
            int r0 = i7.e.q(r12, r8, r11)
        L_0x00e9:
            java.lang.Object r1 = r11.f6254c
            r9.putObject(r14, r2, r1)
            goto L_0x0113
        L_0x00ef:
            r2 = r1
            if (r6 != 0) goto L_0x01af
            int r1 = i7.e.v(r12, r8, r11)
            long r5 = r11.f6253b
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r0 = r16
        L_0x0101:
            i7.p1.p(r14, r2, r0)
            r0 = r1
            goto L_0x0113
        L_0x0106:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01af
            int r0 = i7.e.b(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0113:
            r19 = r4
            goto L_0x01a9
        L_0x0117:
            r2 = r1
            if (r6 != r0) goto L_0x01af
            long r5 = i7.e.c(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0169
        L_0x0127:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016e
            int r0 = i7.e.t(r12, r8, r11)
            int r1 = r11.f6252a
            r9.putInt(r14, r2, r1)
            goto L_0x016b
        L_0x0135:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x016e
            int r6 = i7.e.v(r12, r8, r11)
            long r4 = r11.f6253b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x0145:
            r0 = r6
            goto L_0x016b
        L_0x0147:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x016e
            int r0 = i7.e.b(r12, r8)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            i7.p1.u(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x016b
        L_0x015a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x016e
            long r0 = i7.e.c(r12, r8)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            i7.p1.t(r14, r2, r0)
        L_0x0169:
            int r0 = r8 + 8
        L_0x016b:
            r19 = r10
            goto L_0x01a9
        L_0x016e:
            r19 = r10
            goto L_0x01b1
        L_0x0171:
            r0 = 27
            if (r3 != r0) goto L_0x01b9
            if (r6 != r10) goto L_0x01af
            java.lang.Object r0 = r9.getObject(r14, r1)
            i7.z$d r0 = (i7.z.d) r0
            boolean r3 = r0.p0()
            if (r3 != 0) goto L_0x0195
            int r3 = r0.size()
            if (r3 != 0) goto L_0x018c
            r3 = 10
            goto L_0x018e
        L_0x018c:
            int r3 = r3 * 2
        L_0x018e:
            i7.z$d r0 = r0.B(r3)
            r9.putObject(r14, r1, r0)
        L_0x0195:
            r5 = r0
            i7.f1 r0 = r15.o(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = i7.e.f(r0, r1, r2, r3, r4, r5, r6)
        L_0x01a9:
            r1 = r7
            r2 = r19
            r10 = -1
            goto L_0x0014
        L_0x01af:
            r19 = r4
        L_0x01b1:
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            goto L_0x0206
        L_0x01b9:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01ef
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0239
            goto L_0x0238
        L_0x01ef:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x021c
            r7 = r30
            if (r7 == r10) goto L_0x0208
        L_0x0206:
            r2 = r15
            goto L_0x023a
        L_0x0208:
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            r0.H(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x021c:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0239
        L_0x0238:
            goto L_0x024a
        L_0x0239:
            r2 = r0
        L_0x023a:
            i7.m1 r4 = p(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = i7.e.r(r0, r1, r2, r3, r4, r5)
        L_0x024a:
            r2 = r19
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r1 = r24
            r10 = r26
            goto L_0x0014
        L_0x025e:
            r1 = r13
            if (r0 != r1) goto L_0x0262
            return r0
        L_0x0262:
            i7.a0 r0 = i7.a0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.K(java.lang.Object, byte[], int, int, i7.e$a):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0376 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    public final int L(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, i7.e.a r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f6362s
            java.lang.Object r12 = r11.getObject(r1, r9)
            i7.z$d r12 = (i7.z.d) r12
            boolean r13 = r12.p0()
            r14 = 2
            if (r13 != 0) goto L_0x0034
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002c
            r13 = 10
            goto L_0x002d
        L_0x002c:
            int r13 = r13 * r14
        L_0x002d:
            i7.z$d r12 = r12.B(r13)
            r11.putObject(r1, r9, r12)
        L_0x0034:
            r9 = 0
            r11 = 5
            r13 = 1
            switch(r27) {
                case 18: goto L_0x0346;
                case 19: goto L_0x0317;
                case 20: goto L_0x02ec;
                case 21: goto L_0x02ec;
                case 22: goto L_0x02d2;
                case 23: goto L_0x02a9;
                case 24: goto L_0x0280;
                case 25: goto L_0x0246;
                case 26: goto L_0x018f;
                case 27: goto L_0x0175;
                case 28: goto L_0x011b;
                case 29: goto L_0x02d2;
                case 30: goto L_0x00e5;
                case 31: goto L_0x0280;
                case 32: goto L_0x02a9;
                case 33: goto L_0x00b2;
                case 34: goto L_0x007f;
                case 35: goto L_0x0346;
                case 36: goto L_0x0317;
                case 37: goto L_0x02ec;
                case 38: goto L_0x02ec;
                case 39: goto L_0x02d2;
                case 40: goto L_0x02a9;
                case 41: goto L_0x0280;
                case 42: goto L_0x0246;
                case 43: goto L_0x02d2;
                case 44: goto L_0x00e5;
                case 45: goto L_0x0280;
                case 46: goto L_0x02a9;
                case 47: goto L_0x00b2;
                case 48: goto L_0x007f;
                case 49: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0375
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0375
            i7.f1 r1 = r0.o(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = i7.e.d(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f6254c
            r12.add(r8)
        L_0x005d:
            if (r4 >= r5) goto L_0x0375
            int r8 = i7.e.t(r3, r4, r7)
            int r9 = r7.f6252a
            if (r2 == r9) goto L_0x0069
            goto L_0x0375
        L_0x0069:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = i7.e.d(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f6254c
            r12.add(r8)
            goto L_0x005d
        L_0x007f:
            if (r6 != r14) goto L_0x0087
            int r1 = i7.e.m(r3, r4, r12, r7)
            goto L_0x0376
        L_0x0087:
            if (r6 != 0) goto L_0x0375
            i7.h0 r12 = (i7.h0) r12
            int r1 = i7.e.v(r3, r4, r7)
            long r8 = r7.f6253b
            long r8 = i7.j.c(r8)
            r12.d(r8)
        L_0x0098:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x00a4
            goto L_0x0376
        L_0x00a4:
            int r1 = i7.e.v(r3, r4, r7)
            long r8 = r7.f6253b
            long r8 = i7.j.c(r8)
            r12.d(r8)
            goto L_0x0098
        L_0x00b2:
            if (r6 != r14) goto L_0x00ba
            int r1 = i7.e.l(r3, r4, r12, r7)
            goto L_0x0376
        L_0x00ba:
            if (r6 != 0) goto L_0x0375
            i7.y r12 = (i7.y) r12
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            int r4 = i7.j.b(r4)
            r12.d(r4)
        L_0x00cb:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x00d7
            goto L_0x0376
        L_0x00d7:
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            int r4 = i7.j.b(r4)
            r12.d(r4)
            goto L_0x00cb
        L_0x00e5:
            if (r6 != r14) goto L_0x00ec
            int r2 = i7.e.n(r3, r4, r12, r7)
            goto L_0x00fd
        L_0x00ec:
            if (r6 != 0) goto L_0x0375
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = i7.e.u(r2, r3, r4, r5, r6, r7)
        L_0x00fd:
            i7.x r1 = (i7.x) r1
            i7.m1 r3 = r1.unknownFields
            i7.m1 r4 = i7.m1.f6324f
            if (r3 != r4) goto L_0x0106
            r3 = 0
        L_0x0106:
            i7.z$c r4 = r0.m(r8)
            i7.l1<?, ?> r5 = r0.f6375o
            r6 = r22
            java.lang.Object r3 = i7.g1.y(r6, r12, r4, r3, r5)
            i7.m1 r3 = (i7.m1) r3
            if (r3 == 0) goto L_0x0118
            r1.unknownFields = r3
        L_0x0118:
            r1 = r2
            goto L_0x0376
        L_0x011b:
            if (r6 != r14) goto L_0x0375
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x0170
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x016b
            if (r4 != 0) goto L_0x0131
            i7.i$f r4 = i7.i.f6271b
            r12.add(r4)
            goto L_0x0139
        L_0x0131:
            i7.i r6 = i7.i.e(r3, r1, r4)
            r12.add(r6)
        L_0x0138:
            int r1 = r1 + r4
        L_0x0139:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x0145
            goto L_0x0376
        L_0x0145:
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x0166
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0161
            if (r4 != 0) goto L_0x0159
            i7.i$f r4 = i7.i.f6271b
            r12.add(r4)
            goto L_0x0139
        L_0x0159:
            i7.i r6 = i7.i.e(r3, r1, r4)
            r12.add(r6)
            goto L_0x0138
        L_0x0161:
            i7.a0 r1 = i7.a0.h()
            throw r1
        L_0x0166:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x016b:
            i7.a0 r1 = i7.a0.h()
            throw r1
        L_0x0170:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x0175:
            if (r6 != r14) goto L_0x0375
            i7.f1 r1 = r0.o(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = i7.e.f(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0376
        L_0x018f:
            if (r6 != r14) goto L_0x0375
            r13 = 536870912(0x20000000, double:2.652494739E-315)
            long r13 = r25 & r13
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01e4
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x01df
            if (r4 != 0) goto L_0x01aa
            r12.add(r6)
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i7.z.f6396a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01b4:
            int r1 = r1 + r4
        L_0x01b5:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r8 = r7.f6252a
            if (r2 == r8) goto L_0x01c1
            goto L_0x0376
        L_0x01c1:
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x01da
            if (r4 != 0) goto L_0x01cf
            r12.add(r6)
            goto L_0x01b5
        L_0x01cf:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = i7.z.f6396a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01b4
        L_0x01da:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x01df:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x01e4:
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x0241
            if (r4 != 0) goto L_0x01f2
            r12.add(r6)
            goto L_0x0205
        L_0x01f2:
            int r8 = r1 + r4
            boolean r9 = i7.q1.e(r3, r1, r8)
            if (r9 == 0) goto L_0x023c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i7.z.f6396a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0204:
            r1 = r8
        L_0x0205:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r8 = r7.f6252a
            if (r2 == r8) goto L_0x0211
            goto L_0x0376
        L_0x0211:
            int r1 = i7.e.t(r3, r4, r7)
            int r4 = r7.f6252a
            if (r4 < 0) goto L_0x0237
            if (r4 != 0) goto L_0x021f
            r12.add(r6)
            goto L_0x0205
        L_0x021f:
            int r8 = r1 + r4
            boolean r9 = i7.q1.e(r3, r1, r8)
            if (r9 == 0) goto L_0x0232
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = i7.z.f6396a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0204
        L_0x0232:
            i7.a0 r1 = i7.a0.c()
            throw r1
        L_0x0237:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x023c:
            i7.a0 r1 = i7.a0.c()
            throw r1
        L_0x0241:
            i7.a0 r1 = i7.a0.f()
            throw r1
        L_0x0246:
            if (r6 != r14) goto L_0x024e
            int r1 = i7.e.g(r3, r4, r12, r7)
            goto L_0x0376
        L_0x024e:
            if (r6 != 0) goto L_0x0375
            i7.f r12 = (i7.f) r12
            int r1 = i7.e.v(r3, r4, r7)
            long r14 = r7.f6253b
            int r4 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            r6 = 0
            if (r4 == 0) goto L_0x025f
            r4 = r13
            goto L_0x0260
        L_0x025f:
            r4 = r6
        L_0x0260:
            r12.d(r4)
        L_0x0263:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r8 = r7.f6252a
            if (r2 == r8) goto L_0x026f
            goto L_0x0376
        L_0x026f:
            int r1 = i7.e.v(r3, r4, r7)
            long r14 = r7.f6253b
            int r4 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x027b
            r4 = r13
            goto L_0x027c
        L_0x027b:
            r4 = r6
        L_0x027c:
            r12.d(r4)
            goto L_0x0263
        L_0x0280:
            if (r6 != r14) goto L_0x0288
            int r1 = i7.e.i(r3, r4, r12, r7)
            goto L_0x0376
        L_0x0288:
            if (r6 != r11) goto L_0x0375
            i7.y r12 = (i7.y) r12
            int r1 = i7.e.b(r18, r19)
            r12.d(r1)
        L_0x0293:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x02a1
            goto L_0x0376
        L_0x02a1:
            int r1 = i7.e.b(r3, r4)
            r12.d(r1)
            goto L_0x0293
        L_0x02a9:
            if (r6 != r14) goto L_0x02b1
            int r1 = i7.e.j(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02b1:
            if (r6 != r13) goto L_0x0375
            i7.h0 r12 = (i7.h0) r12
            long r8 = i7.e.c(r18, r19)
            r12.d(r8)
        L_0x02bc:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x02ca
            goto L_0x0376
        L_0x02ca:
            long r8 = i7.e.c(r3, r4)
            r12.d(r8)
            goto L_0x02bc
        L_0x02d2:
            if (r6 != r14) goto L_0x02da
            int r1 = i7.e.n(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02da:
            if (r6 != 0) goto L_0x0375
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = i7.e.u(r21, r22, r23, r24, r25, r26)
            goto L_0x0376
        L_0x02ec:
            if (r6 != r14) goto L_0x02f4
            int r1 = i7.e.o(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02f4:
            if (r6 != 0) goto L_0x0375
            i7.h0 r12 = (i7.h0) r12
            int r1 = i7.e.v(r3, r4, r7)
            long r8 = r7.f6253b
            r12.d(r8)
        L_0x0301:
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x030d
            goto L_0x0376
        L_0x030d:
            int r1 = i7.e.v(r3, r4, r7)
            long r8 = r7.f6253b
            r12.d(r8)
            goto L_0x0301
        L_0x0317:
            if (r6 != r14) goto L_0x031e
            int r1 = i7.e.k(r3, r4, r12, r7)
            goto L_0x0376
        L_0x031e:
            if (r6 != r11) goto L_0x0375
            i7.v r12 = (i7.v) r12
            int r1 = i7.e.b(r18, r19)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.d(r1)
        L_0x032d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x033a
            goto L_0x0376
        L_0x033a:
            int r1 = i7.e.b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.d(r1)
            goto L_0x032d
        L_0x0346:
            if (r6 != r14) goto L_0x034d
            int r1 = i7.e.h(r3, r4, r12, r7)
            goto L_0x0376
        L_0x034d:
            if (r6 != r13) goto L_0x0375
            i7.n r12 = (i7.n) r12
            long r8 = i7.e.c(r18, r19)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.d(r8)
        L_0x035c:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0376
            int r4 = i7.e.t(r3, r1, r7)
            int r6 = r7.f6252a
            if (r2 == r6) goto L_0x0369
            goto L_0x0376
        L_0x0369:
            long r8 = i7.e.c(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.d(r8)
            goto L_0x035c
        L_0x0375:
            r1 = r4
        L_0x0376:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.L(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, i7.e$a):int");
    }

    public final int M(int i10) {
        if (i10 < this.f6365c || i10 > this.f6366d) {
            return -1;
        }
        return V(i10, 0);
    }

    public final int N(int i10) {
        return this.f6363a[i10 + 2];
    }

    public final <E> void O(Object obj, long j10, e1 e1Var, f1<E> f1Var, p pVar) throws IOException {
        e1Var.G(this.f6374n.c(obj, j10), f1Var, pVar);
    }

    public final <E> void P(Object obj, int i10, e1 e1Var, f1<E> f1Var, p pVar) throws IOException {
        e1Var.v(this.f6374n.c(obj, (long) (i10 & 1048575)), f1Var, pVar);
    }

    public final void Q(Object obj, int i10, e1 e1Var) throws IOException {
        if ((536870912 & i10) != 0) {
            p1.x(obj, (long) (i10 & 1048575), e1Var.K());
        } else if (this.g) {
            p1.x(obj, (long) (i10 & 1048575), e1Var.m());
        } else {
            p1.x(obj, (long) (i10 & 1048575), e1Var.u());
        }
    }

    public final void R(Object obj, int i10, e1 e1Var) throws IOException {
        if ((536870912 & i10) != 0) {
            e1Var.t(this.f6374n.c(obj, (long) (i10 & 1048575)));
        } else {
            e1Var.q(this.f6374n.c(obj, (long) (i10 & 1048575)));
        }
    }

    public final void T(T t10, int i10) {
        if (!this.f6369h) {
            int N = N(i10);
            long j10 = (long) (N & 1048575);
            p1.v(t10, j10, p1.l(t10, j10) | (1 << (N >>> 20)));
        }
    }

    public final void U(T t10, int i10, int i11) {
        p1.v(t10, (long) (N(i11) & 1048575), i10);
    }

    public final int V(int i10, int i11) {
        int length = (this.f6363a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f6363a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int X(int i10) {
        return this.f6363a[i10 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y(T r19, i7.u1 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f6368f
            if (r3 == 0) goto L_0x0021
            i7.q<?> r3 = r0.f6376p
            i7.t r3 = r3.c(r1)
            boolean r5 = r3.h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f6363a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f6362s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x04f9
            int r12 = r0.X(r10)
            int[] r13 = r0.f6363a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f6369h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005b
            r4 = 17
            if (r15 > r4) goto L_0x005b
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0055
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0055:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x005e
        L_0x005b:
            r17 = r10
            r4 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x007b
            i7.q<?> r9 = r0.f6376p
            r9.a(r5)
            if (r14 < 0) goto L_0x007b
            i7.q<?> r9 = r0.f6376p
            r9.j(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005e
        L_0x0079:
            r5 = 0
            goto L_0x005e
        L_0x007b:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x04e7;
                case 1: goto L_0x04d8;
                case 2: goto L_0x04c9;
                case 3: goto L_0x04ba;
                case 4: goto L_0x04ab;
                case 5: goto L_0x049c;
                case 6: goto L_0x048d;
                case 7: goto L_0x047e;
                case 8: goto L_0x0471;
                case 9: goto L_0x045d;
                case 10: goto L_0x044b;
                case 11: goto L_0x043b;
                case 12: goto L_0x042b;
                case 13: goto L_0x041b;
                case 14: goto L_0x040b;
                case 15: goto L_0x03fb;
                case 16: goto L_0x03eb;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c7;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a7;
                case 21: goto L_0x0397;
                case 22: goto L_0x0387;
                case 23: goto L_0x0377;
                case 24: goto L_0x0367;
                case 25: goto L_0x0357;
                case 26: goto L_0x0348;
                case 27: goto L_0x0335;
                case 28: goto L_0x0326;
                case 29: goto L_0x0316;
                case 30: goto L_0x0306;
                case 31: goto L_0x02f6;
                case 32: goto L_0x02e6;
                case 33: goto L_0x02d6;
                case 34: goto L_0x02c6;
                case 35: goto L_0x02b6;
                case 36: goto L_0x02a6;
                case 37: goto L_0x0296;
                case 38: goto L_0x0286;
                case 39: goto L_0x0276;
                case 40: goto L_0x0266;
                case 41: goto L_0x0256;
                case 42: goto L_0x0246;
                case 43: goto L_0x0236;
                case 44: goto L_0x0226;
                case 45: goto L_0x0216;
                case 46: goto L_0x0206;
                case 47: goto L_0x01f6;
                case 48: goto L_0x01e6;
                case 49: goto L_0x01d3;
                case 50: goto L_0x01ca;
                case 51: goto L_0x01b8;
                case 52: goto L_0x01a6;
                case 53: goto L_0x0194;
                case 54: goto L_0x0182;
                case 55: goto L_0x0170;
                case 56: goto L_0x015e;
                case 57: goto L_0x014c;
                case 58: goto L_0x013a;
                case 59: goto L_0x012b;
                case 60: goto L_0x0115;
                case 61: goto L_0x0101;
                case 62: goto L_0x00f0;
                case 63: goto L_0x00df;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00ac;
                case 67: goto L_0x009b;
                case 68: goto L_0x0086;
                default: goto L_0x0083;
            }
        L_0x0083:
            r13 = 0
            goto L_0x04f5
        L_0x0086:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.f1 r9 = r0.o(r12)
            r10 = r2
            i7.m r10 = (i7.m) r10
            r10.h(r14, r4, r9)
            goto L_0x0083
        L_0x009b:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = G(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.p(r14, r9)
            goto L_0x0083
        L_0x00ac:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.o(r14, r4)
            goto L_0x0083
        L_0x00bd:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = G(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.n(r14, r9)
            goto L_0x0083
        L_0x00ce:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.m(r14, r4)
            goto L_0x0083
        L_0x00df:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.d(r14, r4)
            goto L_0x0083
        L_0x00f0:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.q(r14, r4)
            goto L_0x0083
        L_0x0101:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.i r4 = (i7.i) r4
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.b(r14, r4)
            goto L_0x0083
        L_0x0115:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.f1 r9 = r0.o(r12)
            r10 = r2
            i7.m r10 = (i7.m) r10
            r10.k(r14, r4, r9)
            goto L_0x0083
        L_0x012b:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.a0(r14, r4, r2)
            goto L_0x0083
        L_0x013a:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            boolean r4 = C(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.a(r14, r4)
            goto L_0x0083
        L_0x014c:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.e(r14, r4)
            goto L_0x0083
        L_0x015e:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = G(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.f(r14, r9)
            goto L_0x0083
        L_0x0170:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            int r4 = F(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.i(r14, r4)
            goto L_0x0083
        L_0x0182:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = G(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.r(r14, r9)
            goto L_0x0083
        L_0x0194:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            long r9 = G(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.j(r14, r9)
            goto L_0x0083
        L_0x01a6:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            float r4 = E(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.g(r14, r4)
            goto L_0x0083
        L_0x01b8:
            boolean r4 = r0.t(r1, r14, r12)
            if (r4 == 0) goto L_0x0083
            double r9 = D(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.c(r14, r9)
            goto L_0x0083
        L_0x01ca:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.Z(r2, r14, r4, r12)
            goto L_0x0083
        L_0x01d3:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.f1 r10 = r0.o(r12)
            i7.g1.K(r4, r9, r2, r10)
            goto L_0x0083
        L_0x01e6:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            i7.g1.R(r4, r9, r2, r13)
            goto L_0x0083
        L_0x01f6:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.Q(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0206:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.P(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0216:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.O(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0226:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.G(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0236:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.T(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0246:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.D(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0256:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.H(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0266:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.I(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0276:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.L(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0286:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.U(r4, r9, r2, r13)
            goto L_0x0083
        L_0x0296:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.M(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02a6:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.J(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02b6:
            r13 = 1
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.F(r4, r9, r2, r13)
            goto L_0x0083
        L_0x02c6:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            i7.g1.R(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x02d6:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.Q(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x02e6:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.P(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x02f6:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.O(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0306:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.G(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0316:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.T(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0326:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.E(r4, r9, r2)
            goto L_0x0083
        L_0x0335:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.f1 r10 = r0.o(r12)
            i7.g1.N(r4, r9, r2, r10)
            goto L_0x0083
        L_0x0348:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.S(r4, r9, r2)
            goto L_0x0083
        L_0x0357:
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            i7.g1.D(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0367:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.H(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0377:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.I(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0387:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.L(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x0397:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.U(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x03a7:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.M(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x03b7:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.J(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x03c7:
            r13 = 0
            int[] r4 = r0.f6363a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            i7.g1.F(r4, r9, r2, r13)
            goto L_0x04f5
        L_0x03d7:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.f1 r9 = r0.o(r12)
            r10 = r2
            i7.m r10 = (i7.m) r10
            r10.h(r14, r4, r9)
            goto L_0x04f5
        L_0x03eb:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r9 = r8.getLong(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.p(r14, r9)
            goto L_0x04f5
        L_0x03fb:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.o(r14, r4)
            goto L_0x04f5
        L_0x040b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r9 = r8.getLong(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.n(r14, r9)
            goto L_0x04f5
        L_0x041b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.m(r14, r4)
            goto L_0x04f5
        L_0x042b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.d(r14, r4)
            goto L_0x04f5
        L_0x043b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.q(r14, r4)
            goto L_0x04f5
        L_0x044b:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.i r4 = (i7.i) r4
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.b(r14, r4)
            goto L_0x04f5
        L_0x045d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r8.getObject(r1, r9)
            i7.f1 r9 = r0.o(r12)
            r10 = r2
            i7.m r10 = (i7.m) r10
            r10.k(r14, r4, r9)
            goto L_0x04f5
        L_0x0471:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.a0(r14, r4, r2)
            goto L_0x04f5
        L_0x047e:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            boolean r4 = i7.p1.h(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.a(r14, r4)
            goto L_0x04f5
        L_0x048d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.e(r14, r4)
            goto L_0x04f5
        L_0x049c:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r9 = r8.getLong(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.f(r14, r9)
            goto L_0x04f5
        L_0x04ab:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            int r4 = r8.getInt(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.i(r14, r4)
            goto L_0x04f5
        L_0x04ba:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r9 = r8.getLong(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.r(r14, r9)
            goto L_0x04f5
        L_0x04c9:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            long r9 = r8.getLong(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.j(r14, r9)
            goto L_0x04f5
        L_0x04d8:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            float r4 = i7.p1.k(r1, r9)
            r9 = r2
            i7.m r9 = (i7.m) r9
            r9.g(r14, r4)
            goto L_0x04f5
        L_0x04e7:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x04f5
            double r9 = i7.p1.j(r1, r9)
            r4 = r2
            i7.m r4 = (i7.m) r4
            r4.c(r14, r9)
        L_0x04f5:
            int r10 = r12 + 3
            goto L_0x002b
        L_0x04f9:
            if (r5 == 0) goto L_0x0510
            i7.q<?> r4 = r0.f6376p
            r4.j(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x050e
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x04f9
        L_0x050e:
            r5 = 0
            goto L_0x04f9
        L_0x0510:
            i7.l1<?, ?> r3 = r0.f6375o
            r0.b0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.Y(java.lang.Object, i7.u1):void");
    }

    public final <K, V> void Z(u1 u1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f6377q.e(n(i11));
            Map<?, ?> g8 = this.f6377q.g(obj);
            m mVar = (m) u1Var;
            Objects.requireNonNull(mVar.f6323a);
            Iterator<Map.Entry<?, ?>> it = g8.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                mVar.f6323a.P(i10, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    public final void a(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.f6363a.length; i10 += 3) {
            int X = X(i10);
            long j10 = (long) (1048575 & X);
            int i11 = this.f6363a[i10];
            switch ((X & 267386880) >>> 20) {
                case 0:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.t(t10, j10, p1.j(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 1:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.u(t10, j10, p1.k(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 2:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.w(t10, j10, p1.m(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 3:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.w(t10, j10, p1.m(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 4:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 5:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.w(t10, j10, p1.m(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 6:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 7:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.p(t10, j10, p1.h(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 8:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.x(t10, j10, p1.n(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 9:
                    x(t10, t11, i10);
                    break;
                case 10:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.x(t10, j10, p1.n(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 11:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 12:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 13:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 14:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.w(t10, j10, p1.m(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 15:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.v(t10, j10, p1.l(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 16:
                    if (!s(t11, i10)) {
                        break;
                    } else {
                        p1.w(t10, j10, p1.m(t11, j10));
                        T(t10, i10);
                        break;
                    }
                case 17:
                    x(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case R.styleable.MapAttrs_zOrderOnTop:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f6374n.b(t10, t11, j10);
                    break;
                case 50:
                    l0 l0Var = this.f6377q;
                    Class<?> cls = g1.f6262a;
                    p1.x(t10, j10, l0Var.a(p1.n(t10, j10), p1.n(t11, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!t(t11, i11, i10)) {
                        break;
                    } else {
                        p1.x(t10, j10, p1.n(t11, j10));
                        U(t10, i11, i10);
                        break;
                    }
                case 60:
                    y(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                case 65:
                case 66:
                case 67:
                    if (!t(t11, i11, i10)) {
                        break;
                    } else {
                        p1.x(t10, j10, p1.n(t11, j10));
                        U(t10, i11, i10);
                        break;
                    }
                case 68:
                    y(t10, t11, i10);
                    break;
            }
        }
        l1<?, ?> l1Var = this.f6375o;
        Class<?> cls2 = g1.f6262a;
        l1Var.o(t10, l1Var.k(l1Var.g(t10), l1Var.g(t11)));
        if (this.f6368f) {
            g1.A(this.f6376p, t10, t11);
        }
    }

    public final void a0(int i10, Object obj, u1 u1Var) throws IOException {
        if (obj instanceof String) {
            ((m) u1Var).f6323a.O(i10, (String) obj);
            return;
        }
        ((m) u1Var).b(i10, (i) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05e7  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x062f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x068f  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06d7  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06e9  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x06fb  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x072f  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0753  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0777  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07ad  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07e3  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0819  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x083d  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x084f  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0861  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0873  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0885  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08bf  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08d1  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08e3  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0907  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0919  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x092b  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x094f  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0977  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0989  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x099b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x09ad  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x09bf  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x09d1  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x09fb  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0a0d  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0a1f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0a30  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0a41  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0a52  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0a63  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0a74  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a85  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a9d  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0542 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x006a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0a95 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(T r17, i7.u1 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r2
            i7.m r3 = (i7.m) r3
            java.util.Objects.requireNonNull(r3)
            i7.u1$a r4 = i7.u1.a.ASCENDING
            i7.u1$a r5 = i7.u1.a.DESCENDING
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r8 = 1
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            if (r4 != r5) goto L_0x0559
            i7.l1<?, ?> r4 = r0.f6375o
            r0.b0(r4, r1, r2)
            boolean r4 = r0.f6368f
            if (r4 == 0) goto L_0x0065
            i7.q<?> r4 = r0.f6376p
            i7.t r4 = r4.c(r1)
            boolean r5 = r4.h()
            if (r5 != 0) goto L_0x0065
            boolean r5 = r4.f6358c
            if (r5 == 0) goto L_0x004b
            i7.c0$c r5 = new i7.c0$c
            i7.i1<T, java.lang.Object> r4 = r4.f6356a
            i7.i1<K, V>$b r11 = r4.f6287v
            if (r11 != 0) goto L_0x0041
            i7.i1$b r11 = new i7.i1$b
            r11.<init>()
            r4.f6287v = r11
        L_0x0041:
            i7.i1<K, V>$b r4 = r4.f6287v
            java.util.Iterator r4 = r4.iterator()
            r5.<init>(r4)
            goto L_0x005e
        L_0x004b:
            i7.i1<T, java.lang.Object> r4 = r4.f6356a
            i7.i1<K, V>$b r5 = r4.f6287v
            if (r5 != 0) goto L_0x0058
            i7.i1$b r5 = new i7.i1$b
            r5.<init>()
            r4.f6287v = r5
        L_0x0058:
            i7.i1<K, V>$b r4 = r4.f6287v
            java.util.Iterator r5 = r4.iterator()
        L_0x005e:
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x0067
        L_0x0065:
            r4 = 0
            r5 = 0
        L_0x0067:
            int[] r11 = r0.f6363a
            int r11 = r11.length
        L_0x006a:
            int r11 = r11 + -3
            if (r11 < 0) goto L_0x0542
            int r12 = r0.X(r11)
            int[] r13 = r0.f6363a
            r13 = r13[r11]
        L_0x0076:
            if (r4 == 0) goto L_0x0093
            i7.q<?> r14 = r0.f6376p
            r14.a(r4)
            if (r13 >= 0) goto L_0x0093
            i7.q<?> r14 = r0.f6376p
            r14.j(r4)
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x0076
        L_0x0091:
            r4 = 0
            goto L_0x0076
        L_0x0093:
            r14 = r12 & r9
            int r14 = r14 >>> 20
            switch(r14) {
                case 0: goto L_0x0531;
                case 1: goto L_0x0520;
                case 2: goto L_0x050f;
                case 3: goto L_0x04fe;
                case 4: goto L_0x04ed;
                case 5: goto L_0x04dc;
                case 6: goto L_0x04cb;
                case 7: goto L_0x04ba;
                case 8: goto L_0x04a9;
                case 9: goto L_0x0494;
                case 10: goto L_0x0481;
                case 11: goto L_0x0470;
                case 12: goto L_0x045f;
                case 13: goto L_0x044e;
                case 14: goto L_0x043d;
                case 15: goto L_0x042c;
                case 16: goto L_0x041b;
                case 17: goto L_0x0406;
                case 18: goto L_0x03f5;
                case 19: goto L_0x03e4;
                case 20: goto L_0x03d3;
                case 21: goto L_0x03c2;
                case 22: goto L_0x03b1;
                case 23: goto L_0x03a0;
                case 24: goto L_0x038f;
                case 25: goto L_0x037e;
                case 26: goto L_0x036d;
                case 27: goto L_0x0358;
                case 28: goto L_0x0347;
                case 29: goto L_0x0336;
                case 30: goto L_0x0325;
                case 31: goto L_0x0314;
                case 32: goto L_0x0303;
                case 33: goto L_0x02f2;
                case 34: goto L_0x02e1;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bf;
                case 37: goto L_0x02ae;
                case 38: goto L_0x029d;
                case 39: goto L_0x028c;
                case 40: goto L_0x027b;
                case 41: goto L_0x026a;
                case 42: goto L_0x0259;
                case 43: goto L_0x0248;
                case 44: goto L_0x0237;
                case 45: goto L_0x0226;
                case 46: goto L_0x0215;
                case 47: goto L_0x0204;
                case 48: goto L_0x01f3;
                case 49: goto L_0x01de;
                case 50: goto L_0x01d3;
                case 51: goto L_0x01c2;
                case 52: goto L_0x01b1;
                case 53: goto L_0x01a0;
                case 54: goto L_0x018f;
                case 55: goto L_0x017e;
                case 56: goto L_0x016d;
                case 57: goto L_0x015c;
                case 58: goto L_0x014b;
                case 59: goto L_0x013a;
                case 60: goto L_0x0125;
                case 61: goto L_0x0112;
                case 62: goto L_0x0101;
                case 63: goto L_0x00f0;
                case 64: goto L_0x00df;
                case 65: goto L_0x00cf;
                case 66: goto L_0x00bf;
                case 67: goto L_0x00af;
                case 68: goto L_0x009b;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x006a
        L_0x009b:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.f1 r14 = r0.o(r11)
            r3.h(r13, r12, r14)
            goto L_0x006a
        L_0x00af:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = G(r1, r14)
            r3.p(r13, r14)
            goto L_0x006a
        L_0x00bf:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.o(r13, r12)
            goto L_0x006a
        L_0x00cf:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = G(r1, r14)
            r3.n(r13, r14)
            goto L_0x006a
        L_0x00df:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.m(r13, r12)
            goto L_0x006a
        L_0x00f0:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.d(r13, r12)
            goto L_0x006a
        L_0x0101:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.q(r13, r12)
            goto L_0x006a
        L_0x0112:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.i r12 = (i7.i) r12
            r3.b(r13, r12)
            goto L_0x006a
        L_0x0125:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.f1 r14 = r0.o(r11)
            r3.k(r13, r12, r14)
            goto L_0x006a
        L_0x013a:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            r0.a0(r13, r12, r2)
            goto L_0x006a
        L_0x014b:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            boolean r12 = C(r1, r14)
            r3.a(r13, r12)
            goto L_0x006a
        L_0x015c:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.e(r13, r12)
            goto L_0x006a
        L_0x016d:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = G(r1, r14)
            r3.f(r13, r14)
            goto L_0x006a
        L_0x017e:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = F(r1, r14)
            r3.i(r13, r12)
            goto L_0x006a
        L_0x018f:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = G(r1, r14)
            r3.r(r13, r14)
            goto L_0x006a
        L_0x01a0:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = G(r1, r14)
            r3.j(r13, r14)
            goto L_0x006a
        L_0x01b1:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            float r12 = E(r1, r14)
            r3.g(r13, r12)
            goto L_0x006a
        L_0x01c2:
            boolean r14 = r0.t(r1, r13, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            double r14 = D(r1, r14)
            r3.c(r13, r14)
            goto L_0x006a
        L_0x01d3:
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            r0.Z(r2, r13, r12, r11)
            goto L_0x006a
        L_0x01de:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.f1 r14 = r0.o(r11)
            i7.g1.K(r13, r12, r2, r14)
            goto L_0x006a
        L_0x01f3:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.R(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0204:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.Q(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0215:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.P(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0226:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.O(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0237:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.G(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0248:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.T(r13, r12, r2, r8)
            goto L_0x006a
        L_0x0259:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.D(r13, r12, r2, r8)
            goto L_0x006a
        L_0x026a:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.H(r13, r12, r2, r8)
            goto L_0x006a
        L_0x027b:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.I(r13, r12, r2, r8)
            goto L_0x006a
        L_0x028c:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.L(r13, r12, r2, r8)
            goto L_0x006a
        L_0x029d:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.U(r13, r12, r2, r8)
            goto L_0x006a
        L_0x02ae:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.M(r13, r12, r2, r8)
            goto L_0x006a
        L_0x02bf:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.J(r13, r12, r2, r8)
            goto L_0x006a
        L_0x02d0:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.F(r13, r12, r2, r8)
            goto L_0x006a
        L_0x02e1:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.R(r13, r12, r2, r7)
            goto L_0x006a
        L_0x02f2:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.Q(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0303:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.P(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0314:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.O(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0325:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.G(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0336:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.T(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0347:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.E(r13, r12, r2)
            goto L_0x006a
        L_0x0358:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.f1 r14 = r0.o(r11)
            i7.g1.N(r13, r12, r2, r14)
            goto L_0x006a
        L_0x036d:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.S(r13, r12, r2)
            goto L_0x006a
        L_0x037e:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.D(r13, r12, r2, r7)
            goto L_0x006a
        L_0x038f:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.H(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03a0:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.I(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03b1:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.L(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03c2:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.U(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03d3:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.M(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03e4:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.J(r13, r12, r2, r7)
            goto L_0x006a
        L_0x03f5:
            int[] r13 = r0.f6363a
            r13 = r13[r11]
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            java.util.List r12 = (java.util.List) r12
            i7.g1.F(r13, r12, r2, r7)
            goto L_0x006a
        L_0x0406:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.f1 r14 = r0.o(r11)
            r3.h(r13, r12, r14)
            goto L_0x006a
        L_0x041b:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = i7.p1.m(r1, r14)
            r3.p(r13, r14)
            goto L_0x006a
        L_0x042c:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.o(r13, r12)
            goto L_0x006a
        L_0x043d:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = i7.p1.m(r1, r14)
            r3.n(r13, r14)
            goto L_0x006a
        L_0x044e:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.m(r13, r12)
            goto L_0x006a
        L_0x045f:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.d(r13, r12)
            goto L_0x006a
        L_0x0470:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.q(r13, r12)
            goto L_0x006a
        L_0x0481:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.i r12 = (i7.i) r12
            r3.b(r13, r12)
            goto L_0x006a
        L_0x0494:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            i7.f1 r14 = r0.o(r11)
            r3.k(r13, r12, r14)
            goto L_0x006a
        L_0x04a9:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            java.lang.Object r12 = i7.p1.n(r1, r14)
            r0.a0(r13, r12, r2)
            goto L_0x006a
        L_0x04ba:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            boolean r12 = i7.p1.h(r1, r14)
            r3.a(r13, r12)
            goto L_0x006a
        L_0x04cb:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.e(r13, r12)
            goto L_0x006a
        L_0x04dc:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = i7.p1.m(r1, r14)
            r3.f(r13, r14)
            goto L_0x006a
        L_0x04ed:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            int r12 = i7.p1.l(r1, r14)
            r3.i(r13, r12)
            goto L_0x006a
        L_0x04fe:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = i7.p1.m(r1, r14)
            r3.r(r13, r14)
            goto L_0x006a
        L_0x050f:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            long r14 = i7.p1.m(r1, r14)
            r3.j(r13, r14)
            goto L_0x006a
        L_0x0520:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            float r12 = i7.p1.k(r1, r14)
            r3.g(r13, r12)
            goto L_0x006a
        L_0x0531:
            boolean r14 = r0.s(r1, r11)
            if (r14 == 0) goto L_0x006a
            r12 = r12 & r6
            long r14 = (long) r12
            double r14 = i7.p1.j(r1, r14)
            r3.c(r13, r14)
            goto L_0x006a
        L_0x0542:
            if (r4 == 0) goto L_0x0abb
            i7.q<?> r1 = r0.f6376p
            r1.j(r4)
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0557
            java.lang.Object r1 = r5.next()
            r4 = r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x0542
        L_0x0557:
            r4 = 0
            goto L_0x0542
        L_0x0559:
            boolean r4 = r0.f6369h
            if (r4 == 0) goto L_0x0ab8
            boolean r4 = r0.f6368f
            if (r4 == 0) goto L_0x0578
            i7.q<?> r4 = r0.f6376p
            i7.t r4 = r4.c(r1)
            boolean r5 = r4.h()
            if (r5 != 0) goto L_0x0578
            java.util.Iterator r4 = r4.k()
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x057a
        L_0x0578:
            r4 = 0
            r5 = 0
        L_0x057a:
            int[] r11 = r0.f6363a
            int r11 = r11.length
            r12 = r7
        L_0x057e:
            if (r12 >= r11) goto L_0x0a9b
            int r13 = r0.X(r12)
            int[] r14 = r0.f6363a
            r14 = r14[r12]
        L_0x0588:
            if (r5 == 0) goto L_0x05a5
            i7.q<?> r15 = r0.f6376p
            r15.a(r5)
            if (r14 < 0) goto L_0x05a5
            i7.q<?> r15 = r0.f6376p
            r15.j(r5)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05a3
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0588
        L_0x05a3:
            r5 = 0
            goto L_0x0588
        L_0x05a5:
            r15 = r13 & r9
            int r15 = r15 >>> 20
            switch(r15) {
                case 0: goto L_0x0a85;
                case 1: goto L_0x0a74;
                case 2: goto L_0x0a63;
                case 3: goto L_0x0a52;
                case 4: goto L_0x0a41;
                case 5: goto L_0x0a30;
                case 6: goto L_0x0a1f;
                case 7: goto L_0x0a0d;
                case 8: goto L_0x09fb;
                case 9: goto L_0x09e5;
                case 10: goto L_0x09d1;
                case 11: goto L_0x09bf;
                case 12: goto L_0x09ad;
                case 13: goto L_0x099b;
                case 14: goto L_0x0989;
                case 15: goto L_0x0977;
                case 16: goto L_0x0965;
                case 17: goto L_0x094f;
                case 18: goto L_0x093d;
                case 19: goto L_0x092b;
                case 20: goto L_0x0919;
                case 21: goto L_0x0907;
                case 22: goto L_0x08f5;
                case 23: goto L_0x08e3;
                case 24: goto L_0x08d1;
                case 25: goto L_0x08bf;
                case 26: goto L_0x08ad;
                case 27: goto L_0x0897;
                case 28: goto L_0x0885;
                case 29: goto L_0x0873;
                case 30: goto L_0x0861;
                case 31: goto L_0x084f;
                case 32: goto L_0x083d;
                case 33: goto L_0x082b;
                case 34: goto L_0x0819;
                case 35: goto L_0x0807;
                case 36: goto L_0x07f5;
                case 37: goto L_0x07e3;
                case 38: goto L_0x07d1;
                case 39: goto L_0x07bf;
                case 40: goto L_0x07ad;
                case 41: goto L_0x079b;
                case 42: goto L_0x0789;
                case 43: goto L_0x0777;
                case 44: goto L_0x0765;
                case 45: goto L_0x0753;
                case 46: goto L_0x0741;
                case 47: goto L_0x072f;
                case 48: goto L_0x071d;
                case 49: goto L_0x0707;
                case 50: goto L_0x06fb;
                case 51: goto L_0x06e9;
                case 52: goto L_0x06d7;
                case 53: goto L_0x06c5;
                case 54: goto L_0x06b3;
                case 55: goto L_0x06a1;
                case 56: goto L_0x068f;
                case 57: goto L_0x067d;
                case 58: goto L_0x066b;
                case 59: goto L_0x0659;
                case 60: goto L_0x0643;
                case 61: goto L_0x062f;
                case 62: goto L_0x061d;
                case 63: goto L_0x060b;
                case 64: goto L_0x05f9;
                case 65: goto L_0x05e7;
                case 66: goto L_0x05d5;
                case 67: goto L_0x05c3;
                case 68: goto L_0x05ae;
                default: goto L_0x05ac;
            }
        L_0x05ac:
            goto L_0x0a95
        L_0x05ae:
            boolean r15 = r0.t(r1, r14, r12)
            if (r15 == 0) goto L_0x0a95
            r13 = r13 & r6
            long r9 = (long) r13
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.f1 r10 = r0.o(r12)
            r3.h(r14, r9, r10)
            goto L_0x0a95
        L_0x05c3:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = G(r1, r9)
            r3.p(r14, r9)
            goto L_0x0a95
        L_0x05d5:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.o(r14, r9)
            goto L_0x0a95
        L_0x05e7:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = G(r1, r9)
            r3.n(r14, r9)
            goto L_0x0a95
        L_0x05f9:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.m(r14, r9)
            goto L_0x0a95
        L_0x060b:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.d(r14, r9)
            goto L_0x0a95
        L_0x061d:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.q(r14, r9)
            goto L_0x0a95
        L_0x062f:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.i r9 = (i7.i) r9
            r3.b(r14, r9)
            goto L_0x0a95
        L_0x0643:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.f1 r10 = r0.o(r12)
            r3.k(r14, r9, r10)
            goto L_0x0a95
        L_0x0659:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            r0.a0(r14, r9, r2)
            goto L_0x0a95
        L_0x066b:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            boolean r9 = C(r1, r9)
            r3.a(r14, r9)
            goto L_0x0a95
        L_0x067d:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.e(r14, r9)
            goto L_0x0a95
        L_0x068f:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = G(r1, r9)
            r3.f(r14, r9)
            goto L_0x0a95
        L_0x06a1:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = F(r1, r9)
            r3.i(r14, r9)
            goto L_0x0a95
        L_0x06b3:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = G(r1, r9)
            r3.r(r14, r9)
            goto L_0x0a95
        L_0x06c5:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = G(r1, r9)
            r3.j(r14, r9)
            goto L_0x0a95
        L_0x06d7:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            float r9 = E(r1, r9)
            r3.g(r14, r9)
            goto L_0x0a95
        L_0x06e9:
            boolean r9 = r0.t(r1, r14, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            double r9 = D(r1, r9)
            r3.c(r14, r9)
            goto L_0x0a95
        L_0x06fb:
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            r0.Z(r2, r14, r9, r12)
            goto L_0x0a95
        L_0x0707:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.f1 r13 = r0.o(r12)
            i7.g1.K(r9, r10, r2, r13)
            goto L_0x0a95
        L_0x071d:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.R(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x072f:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.Q(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0741:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.P(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0753:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.O(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0765:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.G(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0777:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.T(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0789:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.D(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x079b:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.H(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x07ad:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.I(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x07bf:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.L(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x07d1:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.U(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x07e3:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.M(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x07f5:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.J(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0807:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.F(r9, r10, r2, r8)
            goto L_0x0a95
        L_0x0819:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.R(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x082b:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.Q(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x083d:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.P(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x084f:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.O(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x0861:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.G(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x0873:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.T(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x0885:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.E(r9, r10, r2)
            goto L_0x0a95
        L_0x0897:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.f1 r13 = r0.o(r12)
            i7.g1.N(r9, r10, r2, r13)
            goto L_0x0a95
        L_0x08ad:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.S(r9, r10, r2)
            goto L_0x0a95
        L_0x08bf:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.D(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x08d1:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.H(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x08e3:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.I(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x08f5:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.L(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x0907:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.U(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x0919:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.M(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x092b:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.J(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x093d:
            int[] r9 = r0.f6363a
            r9 = r9[r12]
            r10 = r13 & r6
            long r13 = (long) r10
            java.lang.Object r10 = i7.p1.n(r1, r13)
            java.util.List r10 = (java.util.List) r10
            i7.g1.F(r9, r10, r2, r7)
            goto L_0x0a95
        L_0x094f:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.f1 r10 = r0.o(r12)
            r3.h(r14, r9, r10)
            goto L_0x0a95
        L_0x0965:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = i7.p1.m(r1, r9)
            r3.p(r14, r9)
            goto L_0x0a95
        L_0x0977:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.o(r14, r9)
            goto L_0x0a95
        L_0x0989:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = i7.p1.m(r1, r9)
            r3.n(r14, r9)
            goto L_0x0a95
        L_0x099b:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.m(r14, r9)
            goto L_0x0a95
        L_0x09ad:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.d(r14, r9)
            goto L_0x0a95
        L_0x09bf:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.q(r14, r9)
            goto L_0x0a95
        L_0x09d1:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.i r9 = (i7.i) r9
            r3.b(r14, r9)
            goto L_0x0a95
        L_0x09e5:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            i7.f1 r10 = r0.o(r12)
            r3.k(r14, r9, r10)
            goto L_0x0a95
        L_0x09fb:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            java.lang.Object r9 = i7.p1.n(r1, r9)
            r0.a0(r14, r9, r2)
            goto L_0x0a95
        L_0x0a0d:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            boolean r9 = i7.p1.h(r1, r9)
            r3.a(r14, r9)
            goto L_0x0a95
        L_0x0a1f:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.e(r14, r9)
            goto L_0x0a95
        L_0x0a30:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = i7.p1.m(r1, r9)
            r3.f(r14, r9)
            goto L_0x0a95
        L_0x0a41:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            int r9 = i7.p1.l(r1, r9)
            r3.i(r14, r9)
            goto L_0x0a95
        L_0x0a52:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = i7.p1.m(r1, r9)
            r3.r(r14, r9)
            goto L_0x0a95
        L_0x0a63:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            long r9 = i7.p1.m(r1, r9)
            r3.j(r14, r9)
            goto L_0x0a95
        L_0x0a74:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            float r9 = i7.p1.k(r1, r9)
            r3.g(r14, r9)
            goto L_0x0a95
        L_0x0a85:
            boolean r9 = r0.s(r1, r12)
            if (r9 == 0) goto L_0x0a95
            r9 = r13 & r6
            long r9 = (long) r9
            double r9 = i7.p1.j(r1, r9)
            r3.c(r14, r9)
        L_0x0a95:
            int r12 = r12 + 3
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x057e
        L_0x0a9b:
            if (r5 == 0) goto L_0x0ab2
            i7.q<?> r3 = r0.f6376p
            r3.j(r5)
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x0ab0
            java.lang.Object r3 = r4.next()
            r5 = r3
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0a9b
        L_0x0ab0:
            r5 = 0
            goto L_0x0a9b
        L_0x0ab2:
            i7.l1<?, ?> r3 = r0.f6375o
            r0.b0(r3, r1, r2)
            goto L_0x0abb
        L_0x0ab8:
            r16.Y(r17, r18)
        L_0x0abb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.b(java.lang.Object, i7.u1):void");
    }

    public final <UT, UB> void b0(l1<UT, UB> l1Var, T t10, u1 u1Var) throws IOException {
        l1Var.s(l1Var.g(t10), u1Var);
    }

    public final void c(T t10, byte[] bArr, int i10, int i11, e.a aVar) throws IOException {
        if (this.f6369h) {
            K(t10, bArr, i10, i11, aVar);
        } else {
            J(t10, bArr, i10, i11, 0, aVar);
        }
    }

    public final void d(T t10, e1 e1Var, p pVar) throws IOException {
        Objects.requireNonNull(pVar);
        v(this.f6375o, this.f6376p, t10, e1Var, pVar);
    }

    public final void e(T t10) {
        int i10;
        int i11 = this.f6371k;
        while (true) {
            i10 = this.f6372l;
            if (i11 >= i10) {
                break;
            }
            long X = (long) (X(this.f6370j[i11]) & 1048575);
            Object n10 = p1.n(t10, X);
            if (n10 != null) {
                p1.x(t10, X, this.f6377q.d(n10));
            }
            i11++;
        }
        int length = this.f6370j.length;
        while (i10 < length) {
            this.f6374n.a(t10, (long) this.f6370j[i10]);
            i10++;
        }
        this.f6375o.j(t10);
        if (this.f6368f) {
            this.f6376p.f(t10);
        }
    }

    public final boolean f(T t10) {
        int i10;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z = true;
            if (i12 >= this.f6371k) {
                return !this.f6368f || this.f6376p.c(t10).i();
            }
            int i14 = this.f6370j[i12];
            int i15 = this.f6363a[i14];
            int X = X(i14);
            if (!this.f6369h) {
                int i16 = this.f6363a[i14 + 2];
                int i17 = i16 & 1048575;
                i10 = 1 << (i16 >>> 20);
                if (i17 != i11) {
                    i13 = f6362s.getInt(t10, (long) i17);
                    i11 = i17;
                }
            } else {
                i10 = 0;
            }
            if ((268435456 & X) != 0) {
                if (!(this.f6369h ? s(t10, i14) : (i13 & i10) != 0)) {
                    return false;
                }
            }
            int i18 = (267386880 & X) >>> 20;
            if (i18 == 9 || i18 == 17) {
                if (this.f6369h) {
                    z = s(t10, i14);
                } else if ((i13 & i10) == 0) {
                    z = false;
                }
                if (z && !o(i14).f(p1.n(t10, (long) (X & 1048575)))) {
                    return false;
                }
            } else {
                if (i18 != 27) {
                    if (i18 == 60 || i18 == 68) {
                        if (t(t10, i15, i14) && !o(i14).f(p1.n(t10, (long) (X & 1048575)))) {
                            return false;
                        }
                    } else if (i18 != 49) {
                        if (i18 == 50 && !this.f6377q.g(p1.n(t10, (long) (X & 1048575))).isEmpty()) {
                            this.f6377q.e(n(i14));
                            throw null;
                        }
                    }
                }
                List list = (List) p1.n(t10, (long) (X & 1048575));
                if (!list.isEmpty()) {
                    f1 o4 = o(i14);
                    int i19 = 0;
                    while (true) {
                        if (i19 >= list.size()) {
                            break;
                        } else if (!o4.f(list.get(i19))) {
                            z = false;
                            break;
                        } else {
                            i19++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i12++;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (i7.g1.B(i7.p1.n(r10, r6), i7.p1.n(r11, r6)) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (i7.g1.B(i7.p1.n(r10, r6), i7.p1.n(r11, r6)) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (i7.p1.m(r10, r6) == i7.p1.m(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (i7.p1.m(r10, r6) == i7.p1.m(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        if (i7.g1.B(i7.p1.n(r10, r6), i7.p1.n(r11, r6)) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010e, code lost:
        if (i7.g1.B(i7.p1.n(r10, r6), i7.p1.n(r11, r6)) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0124, code lost:
        if (i7.g1.B(i7.p1.n(r10, r6), i7.p1.n(r11, r6)) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        if (i7.p1.h(r10, r6) == i7.p1.h(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0148, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x015c, code lost:
        if (i7.p1.m(r10, r6) == i7.p1.m(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x016d, code lost:
        if (i7.p1.l(r10, r6) == i7.p1.l(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0180, code lost:
        if (i7.p1.m(r10, r6) == i7.p1.m(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        if (i7.p1.m(r10, r6) == i7.p1.m(r11, r6)) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(i7.p1.k(r10, r6)) == java.lang.Float.floatToIntBits(i7.p1.k(r11, r6))) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(i7.p1.j(r10, r6)) == java.lang.Double.doubleToLongBits(i7.p1.j(r11, r6))) goto L_0x01c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f6363a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d0
            int r4 = r9.X(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014c;
                case 6: goto L_0x013a;
                case 7: goto L_0x0128;
                case 8: goto L_0x0112;
                case 9: goto L_0x00fc;
                case 10: goto L_0x00e6;
                case 11: goto L_0x00d4;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00b0;
                case 14: goto L_0x009c;
                case 15: goto L_0x008a;
                case 16: goto L_0x0076;
                case 17: goto L_0x0060;
                case 18: goto L_0x0052;
                case 19: goto L_0x0052;
                case 20: goto L_0x0052;
                case 21: goto L_0x0052;
                case 22: goto L_0x0052;
                case 23: goto L_0x0052;
                case 24: goto L_0x0052;
                case 25: goto L_0x0052;
                case 26: goto L_0x0052;
                case 27: goto L_0x0052;
                case 28: goto L_0x0052;
                case 29: goto L_0x0052;
                case 30: goto L_0x0052;
                case 31: goto L_0x0052;
                case 32: goto L_0x0052;
                case 33: goto L_0x0052;
                case 34: goto L_0x0052;
                case 35: goto L_0x0052;
                case 36: goto L_0x0052;
                case 37: goto L_0x0052;
                case 38: goto L_0x0052;
                case 39: goto L_0x0052;
                case 40: goto L_0x0052;
                case 41: goto L_0x0052;
                case 42: goto L_0x0052;
                case 43: goto L_0x0052;
                case 44: goto L_0x0052;
                case 45: goto L_0x0052;
                case 46: goto L_0x0052;
                case 47: goto L_0x0052;
                case 48: goto L_0x0052;
                case 49: goto L_0x0052;
                case 50: goto L_0x0044;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c9
        L_0x001c:
            int r4 = r9.N(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = i7.p1.l(r10, r4)
            int r4 = i7.p1.l(r11, r4)
            if (r8 != r4) goto L_0x002e
            r4 = r3
            goto L_0x002f
        L_0x002e:
            r4 = r1
        L_0x002f:
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = i7.p1.n(r10, r6)
            java.lang.Object r5 = i7.p1.n(r11, r6)
            boolean r4 = i7.g1.B(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x01c9
        L_0x0041:
            r3 = r1
            goto L_0x01c9
        L_0x0044:
            java.lang.Object r3 = i7.p1.n(r10, r6)
            java.lang.Object r4 = i7.p1.n(r11, r6)
            boolean r3 = i7.g1.B(r3, r4)
            goto L_0x01c9
        L_0x0052:
            java.lang.Object r3 = i7.p1.n(r10, r6)
            java.lang.Object r4 = i7.p1.n(r11, r6)
            boolean r3 = i7.g1.B(r3, r4)
            goto L_0x01c9
        L_0x0060:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = i7.p1.n(r10, r6)
            java.lang.Object r5 = i7.p1.n(r11, r6)
            boolean r4 = i7.g1.B(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x01c9
        L_0x0076:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            long r4 = i7.p1.m(r10, r6)
            long r6 = i7.p1.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            goto L_0x01c9
        L_0x008a:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x009c:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            long r4 = i7.p1.m(r10, r6)
            long r6 = i7.p1.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            goto L_0x01c9
        L_0x00b0:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x00c2:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x00d4:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x00e6:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = i7.p1.n(r10, r6)
            java.lang.Object r5 = i7.p1.n(r11, r6)
            boolean r4 = i7.g1.B(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x01c9
        L_0x00fc:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = i7.p1.n(r10, r6)
            java.lang.Object r5 = i7.p1.n(r11, r6)
            boolean r4 = i7.g1.B(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x01c9
        L_0x0112:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = i7.p1.n(r10, r6)
            java.lang.Object r5 = i7.p1.n(r11, r6)
            boolean r4 = i7.g1.B(r4, r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x01c9
        L_0x0128:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            boolean r4 = i7.p1.h(r10, r6)
            boolean r5 = i7.p1.h(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x013a:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x014c:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            long r4 = i7.p1.m(r10, r6)
            long r6 = i7.p1.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            goto L_0x01c9
        L_0x015f:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            int r4 = i7.p1.l(r10, r6)
            int r5 = i7.p1.l(r11, r6)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x0170:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            long r4 = i7.p1.m(r10, r6)
            long r6 = i7.p1.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            goto L_0x01c9
        L_0x0183:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            long r4 = i7.p1.m(r10, r6)
            long r6 = i7.p1.m(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            goto L_0x01c9
        L_0x0196:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            float r4 = i7.p1.k(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = i7.p1.k(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x0041
            goto L_0x01c9
        L_0x01af:
            boolean r4 = r9.k(r10, r11, r2)
            if (r4 == 0) goto L_0x0041
            double r4 = i7.p1.j(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = i7.p1.j(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
        L_0x01c9:
            if (r3 != 0) goto L_0x01cc
            return r1
        L_0x01cc:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d0:
            i7.l1<?, ?> r0 = r9.f6375o
            java.lang.Object r0 = r0.g(r10)
            i7.l1<?, ?> r2 = r9.f6375o
            java.lang.Object r2 = r2.g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e3
            return r1
        L_0x01e3:
            boolean r0 = r9.f6368f
            if (r0 == 0) goto L_0x01f8
            i7.q<?> r0 = r9.f6376p
            i7.t r10 = r0.c(r10)
            i7.q<?> r0 = r9.f6376p
            i7.t r11 = r0.c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.g(java.lang.Object, java.lang.Object):boolean");
    }

    public final int h(T t10) {
        return this.f6369h ? r(t10) : q(t10);
    }

    public final T i() {
        return this.f6373m.a(this.f6367e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f6363a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.X(r1)
            int[] r4 = r8.f6363a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0229
        L_0x0020:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = G(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = G(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = C(r9, r5)
            int r3 = i7.z.a(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = G(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = F(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = G(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = G(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = E(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.t(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = D(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = i7.p1.n(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = i7.p1.m(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = i7.p1.m(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = i7.p1.n(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = i7.p1.n(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = i7.p1.h(r9, r5)
            int r3 = i7.z.a(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = i7.p1.m(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = i7.p1.l(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = i7.p1.m(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = i7.p1.m(r9, r5)
            int r3 = i7.z.b(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = i7.p1.k(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = i7.p1.j(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i7.z.b(r3)
        L_0x0227:
            int r3 = r3 + r2
            r2 = r3
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            i7.l1<?, ?> r0 = r8.f6375o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f6368f
            if (r1 == 0) goto L_0x024b
            int r0 = r0 * 53
            i7.q<?> r1 = r8.f6376p
            i7.t r9 = r1.c(r9)
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x024b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.j(java.lang.Object):int");
    }

    public final boolean k(T t10, T t11, int i10) {
        return s(t10, i10) == s(t11, i10);
    }

    public final <UT, UB> UB l(Object obj, int i10, UB ub2, l1<UT, UB> l1Var) {
        z.c m10;
        int i11 = this.f6363a[i10];
        Object n10 = p1.n(obj, (long) (X(i10) & 1048575));
        if (n10 == null || (m10 = m(i10)) == null) {
            return ub2;
        }
        Map<?, ?> h10 = this.f6377q.h(n10);
        this.f6377q.e(n(i10));
        for (Map.Entry next : h10.entrySet()) {
            if (!m10.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    l1Var.m();
                }
                next.getKey();
                next.getValue();
                throw null;
            }
        }
        return ub2;
    }

    public final z.c m(int i10) {
        return (z.c) this.f6364b[((i10 / 3) * 2) + 1];
    }

    public final Object n(int i10) {
        return this.f6364b[(i10 / 3) * 2];
    }

    public final f1 o(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f6364b;
        f1 f1Var = (f1) objArr[i11];
        if (f1Var != null) {
            return f1Var;
        }
        f1 a10 = b1.f6235c.a((Class) objArr[i11 + 1]);
        this.f6364b[i11] = a10;
        return a10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0338, code lost:
        r3 = androidx.appcompat.widget.d.a(r7, r6, r5, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int q(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f6362s
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int[] r5 = r14.f6363a
            int r5 = r5.length
            if (r2 >= r5) goto L_0x0502
            int r5 = r14.X(r2)
            int[] r6 = r14.f6363a
            r7 = r6[r2]
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r5
            int r8 = r8 >>> 20
            r9 = 17
            r10 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 > r9) goto L_0x0034
            int r9 = r2 + 2
            r6 = r6[r9]
            r9 = r6 & r10
            int r11 = r6 >>> 20
            r12 = 1
            int r11 = r12 << r11
            if (r9 == r1) goto L_0x0052
            long r12 = (long) r9
            int r1 = r0.getInt(r15, r12)
            r4 = r1
            r1 = r9
            goto L_0x0052
        L_0x0034:
            boolean r6 = r14.i
            if (r6 == 0) goto L_0x0050
            i7.u r6 = i7.u.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r8 < r6) goto L_0x0050
            i7.u r6 = i7.u.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r8 > r6) goto L_0x0050
            int[] r6 = r14.f6363a
            int r9 = r2 + 2
            r6 = r6[r9]
            r6 = r6 & r10
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r11 = 0
        L_0x0052:
            r5 = r5 & r10
            long r9 = (long) r5
            switch(r8) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04bc;
                case 6: goto L_0x04b3;
                case 7: goto L_0x04aa;
                case 8: goto L_0x0490;
                case 9: goto L_0x047e;
                case 10: goto L_0x046e;
                case 11: goto L_0x0460;
                case 12: goto L_0x0452;
                case 13: goto L_0x0448;
                case 14: goto L_0x043e;
                case 15: goto L_0x0430;
                case 16: goto L_0x0422;
                case 17: goto L_0x040e;
                case 18: goto L_0x0402;
                case 19: goto L_0x03f6;
                case 20: goto L_0x03ea;
                case 21: goto L_0x03de;
                case 22: goto L_0x03d2;
                case 23: goto L_0x03c6;
                case 24: goto L_0x03ba;
                case 25: goto L_0x03ae;
                case 26: goto L_0x03a2;
                case 27: goto L_0x0392;
                case 28: goto L_0x0386;
                case 29: goto L_0x037a;
                case 30: goto L_0x036e;
                case 31: goto L_0x0362;
                case 32: goto L_0x0356;
                case 33: goto L_0x034a;
                case 34: goto L_0x033e;
                case 35: goto L_0x031c;
                case 36: goto L_0x02ff;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02c5;
                case 39: goto L_0x02a7;
                case 40: goto L_0x0289;
                case 41: goto L_0x026b;
                case 42: goto L_0x024b;
                case 43: goto L_0x022d;
                case 44: goto L_0x020f;
                case 45: goto L_0x01f1;
                case 46: goto L_0x01d3;
                case 47: goto L_0x01b5;
                case 48: goto L_0x0197;
                case 49: goto L_0x0187;
                case 50: goto L_0x0177;
                case 51: goto L_0x016b;
                case 52: goto L_0x015f;
                case 53: goto L_0x014f;
                case 54: goto L_0x013f;
                case 55: goto L_0x012f;
                case 56: goto L_0x0123;
                case 57: goto L_0x0117;
                case 58: goto L_0x010b;
                case 59: goto L_0x00ed;
                case 60: goto L_0x00d9;
                case 61: goto L_0x00c7;
                case 62: goto L_0x00b7;
                case 63: goto L_0x00a7;
                case 64: goto L_0x009b;
                case 65: goto L_0x008f;
                case 66: goto L_0x007f;
                case 67: goto L_0x006f;
                case 68: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x04fe
        L_0x0059:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.q0 r5 = (i7.q0) r5
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.l.j(r7, r5, r6)
            goto L_0x04fd
        L_0x006f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            long r5 = G(r15, r9)
            int r5 = i7.l.s(r7, r5)
            goto L_0x04fd
        L_0x007f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = F(r15, r9)
            int r5 = i7.l.q(r7, r5)
            goto L_0x04fd
        L_0x008f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.p(r7)
            goto L_0x04fd
        L_0x009b:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.o(r7)
            goto L_0x04fd
        L_0x00a7:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = F(r15, r9)
            int r5 = i7.l.f(r7, r5)
            goto L_0x04fd
        L_0x00b7:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = F(r15, r9)
            int r5 = i7.l.x(r7, r5)
            goto L_0x04fd
        L_0x00c7:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.i r5 = (i7.i) r5
            int r5 = i7.l.c(r7, r5)
            goto L_0x04fd
        L_0x00d9:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.g1.n(r7, r5, r6)
            goto L_0x04fd
        L_0x00ed:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            boolean r6 = r5 instanceof i7.i
            if (r6 == 0) goto L_0x0103
            i7.i r5 = (i7.i) r5
            int r5 = i7.l.c(r7, r5)
            goto L_0x04fd
        L_0x0103:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = i7.l.u(r7, r5)
            goto L_0x04fd
        L_0x010b:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.b(r7)
            goto L_0x04fd
        L_0x0117:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.g(r7)
            goto L_0x04fd
        L_0x0123:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.h(r7)
            goto L_0x04fd
        L_0x012f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = F(r15, r9)
            int r5 = i7.l.k(r7, r5)
            goto L_0x04fd
        L_0x013f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            long r5 = G(r15, r9)
            int r5 = i7.l.z(r7, r5)
            goto L_0x04fd
        L_0x014f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            long r5 = G(r15, r9)
            int r5 = i7.l.m(r7, r5)
            goto L_0x04fd
        L_0x015f:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.i(r7)
            goto L_0x04fd
        L_0x016b:
            boolean r5 = r14.t(r15, r7, r2)
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.e(r7)
            goto L_0x04fd
        L_0x0177:
            i7.l0 r5 = r14.f6377q
            java.lang.Object r6 = r0.getObject(r15, r9)
            java.lang.Object r8 = r14.n(r2)
            int r5 = r5.b(r7, r6, r8)
            goto L_0x04fd
        L_0x0187:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.g1.i(r7, r5, r6)
            goto L_0x04fd
        L_0x0197:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.s(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x01ab
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01ab:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x01b5:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.q(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x01c9
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01c9:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x01d3:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x01e7
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x01e7:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x01f1:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0205
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0205:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x020f:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.d(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0223
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0223:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x022d:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.v(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0241
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0241:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x024b:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            java.lang.Class<?> r8 = i7.g1.f6262a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0261
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0261:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x026b:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x027f
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x027f:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x0289:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x029d
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x029d:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x02a7:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.k(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x02bb
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02bb:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x02c5:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.x(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x02d9
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02d9:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x02e2:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.m(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x02f6
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x02f6:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x02ff:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0313
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0313:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
            goto L_0x0338
        L_0x031c:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04fe
            boolean r8 = r14.i
            if (r8 == 0) goto L_0x0330
            long r8 = (long) r6
            r0.putInt(r15, r8, r5)
        L_0x0330:
            int r6 = i7.l.w(r7)
            int r7 = i7.l.y(r5)
        L_0x0338:
            int r3 = androidx.appcompat.widget.d.a(r7, r6, r5, r3)
            goto L_0x04fe
        L_0x033e:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.r(r7, r5)
            goto L_0x04fd
        L_0x034a:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.p(r7, r5)
            goto L_0x04fd
        L_0x0356:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.g(r7, r5)
            goto L_0x04fd
        L_0x0362:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.e(r7, r5)
            goto L_0x04fd
        L_0x036e:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.c(r7, r5)
            goto L_0x04fd
        L_0x037a:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.u(r7, r5)
            goto L_0x04fd
        L_0x0386:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.b(r7, r5)
            goto L_0x04fd
        L_0x0392:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.g1.o(r7, r5, r6)
            goto L_0x04fd
        L_0x03a2:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.t(r7, r5)
            goto L_0x04fd
        L_0x03ae:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.a(r7, r5)
            goto L_0x04fd
        L_0x03ba:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.e(r7, r5)
            goto L_0x04fd
        L_0x03c6:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.g(r7, r5)
            goto L_0x04fd
        L_0x03d2:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.j(r7, r5)
            goto L_0x04fd
        L_0x03de:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.w(r7, r5)
            goto L_0x04fd
        L_0x03ea:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.l(r7, r5)
            goto L_0x04fd
        L_0x03f6:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.e(r7, r5)
            goto L_0x04fd
        L_0x0402:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.g(r7, r5)
            goto L_0x04fd
        L_0x040e:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.q0 r5 = (i7.q0) r5
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.l.j(r7, r5, r6)
            goto L_0x04fd
        L_0x0422:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            long r5 = r0.getLong(r15, r9)
            int r5 = i7.l.s(r7, r5)
            goto L_0x04fd
        L_0x0430:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = r0.getInt(r15, r9)
            int r5 = i7.l.q(r7, r5)
            goto L_0x04fd
        L_0x043e:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.p(r7)
            goto L_0x04fd
        L_0x0448:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.o(r7)
            goto L_0x04fd
        L_0x0452:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = r0.getInt(r15, r9)
            int r5 = i7.l.f(r7, r5)
            goto L_0x04fd
        L_0x0460:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = r0.getInt(r15, r9)
            int r5 = i7.l.x(r7, r5)
            goto L_0x04fd
        L_0x046e:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.i r5 = (i7.i) r5
            int r5 = i7.l.c(r7, r5)
            goto L_0x04fd
        L_0x047e:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            i7.f1 r6 = r14.o(r2)
            int r5 = i7.g1.n(r7, r5, r6)
            goto L_0x04fd
        L_0x0490:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.getObject(r15, r9)
            boolean r6 = r5 instanceof i7.i
            if (r6 == 0) goto L_0x04a3
            i7.i r5 = (i7.i) r5
            int r5 = i7.l.c(r7, r5)
            goto L_0x04fd
        L_0x04a3:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = i7.l.u(r7, r5)
            goto L_0x04fd
        L_0x04aa:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.b(r7)
            goto L_0x04fd
        L_0x04b3:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.g(r7)
            goto L_0x04fd
        L_0x04bc:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.h(r7)
            goto L_0x04fd
        L_0x04c5:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = r0.getInt(r15, r9)
            int r5 = i7.l.k(r7, r5)
            goto L_0x04fd
        L_0x04d2:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            long r5 = r0.getLong(r15, r9)
            int r5 = i7.l.z(r7, r5)
            goto L_0x04fd
        L_0x04df:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            long r5 = r0.getLong(r15, r9)
            int r5 = i7.l.m(r7, r5)
            goto L_0x04fd
        L_0x04ec:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.i(r7)
            goto L_0x04fd
        L_0x04f5:
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04fe
            int r5 = i7.l.e(r7)
        L_0x04fd:
            int r3 = r3 + r5
        L_0x04fe:
            int r2 = r2 + 3
            goto L_0x0006
        L_0x0502:
            i7.l1<?, ?> r0 = r14.f6375o
            java.lang.Object r1 = r0.g(r15)
            int r0 = r0.h(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f6368f
            if (r1 == 0) goto L_0x0560
            i7.q<?> r1 = r14.f6376p
            i7.t r15 = r1.c(r15)
            r1 = 0
            r2 = 0
        L_0x0519:
            i7.i1<T, java.lang.Object> r3 = r15.f6356a
            int r3 = r3.e()
            if (r1 >= r3) goto L_0x0539
            i7.i1<T, java.lang.Object> r3 = r15.f6356a
            java.util.Map$Entry r3 = r3.d(r1)
            java.lang.Object r4 = r3.getKey()
            i7.t$b r4 = (i7.t.b) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = i7.t.e(r4, r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L_0x0519
        L_0x0539:
            i7.i1<T, java.lang.Object> r15 = r15.f6356a
            java.lang.Iterable r15 = r15.f()
            java.util.Iterator r15 = r15.iterator()
        L_0x0543:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x055f
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            i7.t$b r3 = (i7.t.b) r3
            java.lang.Object r1 = r1.getValue()
            int r1 = i7.t.e(r3, r1)
            int r2 = r2 + r1
            goto L_0x0543
        L_0x055f:
            int r0 = r0 + r2
        L_0x0560:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.q(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0317, code lost:
        r3 = androidx.appcompat.widget.d.a(r6, r4, r5, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f6362s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f6363a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e4
            int r4 = r11.X(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f6363a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            i7.u r4 = i7.u.DOUBLE_LIST_PACKED
            int r4 = r4.id()
            if (r5 < r4) goto L_0x0034
            i7.u r4 = i7.u.SINT64_LIST_PACKED
            int r4 = r4.id()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f6363a
            int r10 = r2 + 2
            r4 = r4[r10]
            r4 = r4 & r7
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            switch(r5) {
                case 0: goto L_0x04d5;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04bb;
                case 3: goto L_0x04ac;
                case 4: goto L_0x049d;
                case 5: goto L_0x0492;
                case 6: goto L_0x0487;
                case 7: goto L_0x047c;
                case 8: goto L_0x045f;
                case 9: goto L_0x044b;
                case 10: goto L_0x0439;
                case 11: goto L_0x0429;
                case 12: goto L_0x0419;
                case 13: goto L_0x040d;
                case 14: goto L_0x0401;
                case 15: goto L_0x03f1;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cb;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ad;
                case 21: goto L_0x03a3;
                case 22: goto L_0x0399;
                case 23: goto L_0x038f;
                case 24: goto L_0x0385;
                case 25: goto L_0x037b;
                case 26: goto L_0x0371;
                case 27: goto L_0x0363;
                case 28: goto L_0x0359;
                case 29: goto L_0x034f;
                case 30: goto L_0x0345;
                case 31: goto L_0x033b;
                case 32: goto L_0x0331;
                case 33: goto L_0x0327;
                case 34: goto L_0x031d;
                case 35: goto L_0x02fb;
                case 36: goto L_0x02de;
                case 37: goto L_0x02c1;
                case 38: goto L_0x02a4;
                case 39: goto L_0x0286;
                case 40: goto L_0x0268;
                case 41: goto L_0x024a;
                case 42: goto L_0x022a;
                case 43: goto L_0x020c;
                case 44: goto L_0x01ee;
                case 45: goto L_0x01d0;
                case 46: goto L_0x01b2;
                case 47: goto L_0x0194;
                case 48: goto L_0x0176;
                case 49: goto L_0x0168;
                case 50: goto L_0x0158;
                case 51: goto L_0x014c;
                case 52: goto L_0x0140;
                case 53: goto L_0x0130;
                case 54: goto L_0x0120;
                case 55: goto L_0x0110;
                case 56: goto L_0x0104;
                case 57: goto L_0x00f8;
                case 58: goto L_0x00ec;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0098;
                case 63: goto L_0x0088;
                case 64: goto L_0x007c;
                case 65: goto L_0x0070;
                case 66: goto L_0x0060;
                case 67: goto L_0x0050;
                case 68: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x04e0
        L_0x003a:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.q0 r4 = (i7.q0) r4
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.l.j(r6, r4, r5)
            goto L_0x04df
        L_0x0050:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = G(r12, r8)
            int r4 = i7.l.s(r6, r4)
            goto L_0x04df
        L_0x0060:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = F(r12, r8)
            int r4 = i7.l.q(r6, r4)
            goto L_0x04df
        L_0x0070:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.p(r6)
            goto L_0x04df
        L_0x007c:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.o(r6)
            goto L_0x04df
        L_0x0088:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = F(r12, r8)
            int r4 = i7.l.f(r6, r4)
            goto L_0x04df
        L_0x0098:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = F(r12, r8)
            int r4 = i7.l.x(r6, r4)
            goto L_0x04df
        L_0x00a8:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.i r4 = (i7.i) r4
            int r4 = i7.l.c(r6, r4)
            goto L_0x04df
        L_0x00ba:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.g1.n(r6, r4, r5)
            goto L_0x04df
        L_0x00ce:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            boolean r5 = r4 instanceof i7.i
            if (r5 == 0) goto L_0x00e4
            i7.i r4 = (i7.i) r4
            int r4 = i7.l.c(r6, r4)
            goto L_0x04df
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = i7.l.u(r6, r4)
            goto L_0x04df
        L_0x00ec:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.b(r6)
            goto L_0x04df
        L_0x00f8:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.g(r6)
            goto L_0x04df
        L_0x0104:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.h(r6)
            goto L_0x04df
        L_0x0110:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = F(r12, r8)
            int r4 = i7.l.k(r6, r4)
            goto L_0x04df
        L_0x0120:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = G(r12, r8)
            int r4 = i7.l.z(r6, r4)
            goto L_0x04df
        L_0x0130:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = G(r12, r8)
            int r4 = i7.l.m(r6, r4)
            goto L_0x04df
        L_0x0140:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.i(r6)
            goto L_0x04df
        L_0x014c:
            boolean r4 = r11.t(r12, r6, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.e(r6)
            goto L_0x04df
        L_0x0158:
            i7.l0 r4 = r11.f6377q
            java.lang.Object r5 = i7.p1.n(r12, r8)
            java.lang.Object r7 = r11.n(r2)
            int r4 = r4.b(r6, r5, r7)
            goto L_0x04df
        L_0x0168:
            java.util.List r4 = u(r12, r8)
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.g1.i(r6, r4, r5)
            goto L_0x04df
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.s(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.q(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.d(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.v(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            java.lang.Class<?> r7 = i7.g1.f6262a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x0240
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0240:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x024a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x025e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025e:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x0268:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x027c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027c:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x0286:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.k(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x029a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x029a:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x02a4:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.x(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x02b8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b8:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x02c1:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.m(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x02d5
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d5:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x02de:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.f(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x02f2
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f2:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
            goto L_0x0317
        L_0x02fb:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = i7.g1.h(r5)
            if (r5 <= 0) goto L_0x04e0
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x030f
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030f:
            int r4 = i7.l.w(r6)
            int r6 = i7.l.y(r5)
        L_0x0317:
            int r3 = androidx.appcompat.widget.d.a(r6, r4, r5, r3)
            goto L_0x04e0
        L_0x031d:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.r(r6, r4)
            goto L_0x04df
        L_0x0327:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.p(r6, r4)
            goto L_0x04df
        L_0x0331:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.g(r6, r4)
            goto L_0x04df
        L_0x033b:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.e(r6, r4)
            goto L_0x04df
        L_0x0345:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.c(r6, r4)
            goto L_0x04df
        L_0x034f:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.u(r6, r4)
            goto L_0x04df
        L_0x0359:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.b(r6, r4)
            goto L_0x04df
        L_0x0363:
            java.util.List r4 = u(r12, r8)
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.g1.o(r6, r4, r5)
            goto L_0x04df
        L_0x0371:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.t(r6, r4)
            goto L_0x04df
        L_0x037b:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.a(r6, r4)
            goto L_0x04df
        L_0x0385:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.e(r6, r4)
            goto L_0x04df
        L_0x038f:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.g(r6, r4)
            goto L_0x04df
        L_0x0399:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.j(r6, r4)
            goto L_0x04df
        L_0x03a3:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.w(r6, r4)
            goto L_0x04df
        L_0x03ad:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.l(r6, r4)
            goto L_0x04df
        L_0x03b7:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.e(r6, r4)
            goto L_0x04df
        L_0x03c1:
            java.util.List r4 = u(r12, r8)
            int r4 = i7.g1.g(r6, r4)
            goto L_0x04df
        L_0x03cb:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.q0 r4 = (i7.q0) r4
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.l.j(r6, r4, r5)
            goto L_0x04df
        L_0x03e1:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = i7.p1.m(r12, r8)
            int r4 = i7.l.s(r6, r4)
            goto L_0x04df
        L_0x03f1:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.p1.l(r12, r8)
            int r4 = i7.l.q(r6, r4)
            goto L_0x04df
        L_0x0401:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.p(r6)
            goto L_0x04df
        L_0x040d:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.o(r6)
            goto L_0x04df
        L_0x0419:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.p1.l(r12, r8)
            int r4 = i7.l.f(r6, r4)
            goto L_0x04df
        L_0x0429:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.p1.l(r12, r8)
            int r4 = i7.l.x(r6, r4)
            goto L_0x04df
        L_0x0439:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.i r4 = (i7.i) r4
            int r4 = i7.l.c(r6, r4)
            goto L_0x04df
        L_0x044b:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            i7.f1 r5 = r11.o(r2)
            int r4 = i7.g1.n(r6, r4, r5)
            goto L_0x04df
        L_0x045f:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            java.lang.Object r4 = i7.p1.n(r12, r8)
            boolean r5 = r4 instanceof i7.i
            if (r5 == 0) goto L_0x0475
            i7.i r4 = (i7.i) r4
            int r4 = i7.l.c(r6, r4)
            goto L_0x04df
        L_0x0475:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = i7.l.u(r6, r4)
            goto L_0x04df
        L_0x047c:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.b(r6)
            goto L_0x04df
        L_0x0487:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.g(r6)
            goto L_0x04df
        L_0x0492:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.h(r6)
            goto L_0x04df
        L_0x049d:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.p1.l(r12, r8)
            int r4 = i7.l.k(r6, r4)
            goto L_0x04df
        L_0x04ac:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = i7.p1.m(r12, r8)
            int r4 = i7.l.z(r6, r4)
            goto L_0x04df
        L_0x04bb:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            long r4 = i7.p1.m(r12, r8)
            int r4 = i7.l.m(r6, r4)
            goto L_0x04df
        L_0x04ca:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.i(r6)
            goto L_0x04df
        L_0x04d5:
            boolean r4 = r11.s(r12, r2)
            if (r4 == 0) goto L_0x04e0
            int r4 = i7.l.e(r6)
        L_0x04df:
            int r3 = r3 + r4
        L_0x04e0:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e4:
            i7.l1<?, ?> r0 = r11.f6375o
            java.lang.Object r12 = r0.g(r12)
            int r12 = r0.h(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.r(java.lang.Object):int");
    }

    public final boolean s(T t10, int i10) {
        boolean equals;
        if (this.f6369h) {
            int X = X(i10);
            long j10 = (long) (X & 1048575);
            switch ((X & 267386880) >>> 20) {
                case 0:
                    if (p1.j(t10, j10) != Utils.DOUBLE_EPSILON) {
                        return true;
                    }
                    return false;
                case 1:
                    if (p1.k(t10, j10) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (p1.m(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (p1.m(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (p1.m(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return p1.h(t10, j10);
                case 8:
                    Object n10 = p1.n(t10, j10);
                    if (n10 instanceof String) {
                        equals = ((String) n10).isEmpty();
                        break;
                    } else if (n10 instanceof i) {
                        equals = i.f6271b.equals(n10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (p1.n(t10, j10) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = i.f6271b.equals(p1.n(t10, j10));
                    break;
                case 11:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (p1.m(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (p1.l(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (p1.m(t10, j10) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (p1.n(t10, j10) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        int N = N(i10);
        if ((p1.l(t10, (long) (N & 1048575)) & (1 << (N >>> 20))) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t(T t10, int i10, int i11) {
        return p1.l(t10, (long) (N(i11) & 1048575)) == i10;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final <UT, UB, ET extends i7.t.b<ET>> void v(i7.l1<UT, UB> r11, i7.q<ET> r12, T r13, i7.e1 r14, i7.p r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            int r3 = r14.p()     // Catch:{ all -> 0x05b9 }
            int r6 = r10.M(r3)     // Catch:{ all -> 0x05b9 }
            if (r6 >= 0) goto L_0x0067
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r4) goto L_0x0028
            int r12 = r10.f6371k
        L_0x0014:
            int r14 = r10.f6372l
            if (r12 >= r14) goto L_0x0022
            int[] r14 = r10.f6370j
            r14 = r14[r12]
            r10.l(r13, r14, r1, r11)
            int r12 = r12 + 1
            goto L_0x0014
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r11.n(r13, r1)
        L_0x0027:
            return
        L_0x0028:
            boolean r4 = r10.f6368f     // Catch:{ all -> 0x05b9 }
            if (r4 != 0) goto L_0x002e
            r3 = r0
            goto L_0x0034
        L_0x002e:
            i7.q0 r4 = r10.f6367e     // Catch:{ all -> 0x05b9 }
            java.lang.Object r3 = r12.b(r15, r4, r3)     // Catch:{ all -> 0x05b9 }
        L_0x0034:
            if (r3 == 0) goto L_0x0041
            if (r2 != 0) goto L_0x003c
            i7.t r2 = r12.d(r13)     // Catch:{ all -> 0x05b9 }
        L_0x003c:
            java.lang.Object r1 = r12.g(r3)     // Catch:{ all -> 0x05b9 }
            goto L_0x0003
        L_0x0041:
            r11.p()     // Catch:{ all -> 0x05b9 }
            if (r1 != 0) goto L_0x004a
            java.lang.Object r1 = r11.f(r13)     // Catch:{ all -> 0x05b9 }
        L_0x004a:
            boolean r3 = r11.l(r1, r14)     // Catch:{ all -> 0x05b9 }
            if (r3 == 0) goto L_0x0051
            goto L_0x0003
        L_0x0051:
            int r12 = r10.f6371k
        L_0x0053:
            int r14 = r10.f6372l
            if (r12 >= r14) goto L_0x0061
            int[] r14 = r10.f6370j
            r14 = r14[r12]
            r10.l(r13, r14, r1, r11)
            int r12 = r12 + 1
            goto L_0x0053
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            r11.n(r13, r1)
        L_0x0066:
            return
        L_0x0067:
            int r5 = r10.X(r6)     // Catch:{ all -> 0x05b9 }
            int r4 = W(r5)     // Catch:{ a -> 0x0594 }
            switch(r4) {
                case 0: goto L_0x0568;
                case 1: goto L_0x0558;
                case 2: goto L_0x0548;
                case 3: goto L_0x0538;
                case 4: goto L_0x0528;
                case 5: goto L_0x0518;
                case 6: goto L_0x0508;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04f0;
                case 9: goto L_0x04b9;
                case 10: goto L_0x04a9;
                case 11: goto L_0x0499;
                case 12: goto L_0x0476;
                case 13: goto L_0x0466;
                case 14: goto L_0x0456;
                case 15: goto L_0x0446;
                case 16: goto L_0x0436;
                case 17: goto L_0x03ff;
                case 18: goto L_0x03f0;
                case 19: goto L_0x03e1;
                case 20: goto L_0x03d2;
                case 21: goto L_0x03c3;
                case 22: goto L_0x03b4;
                case 23: goto L_0x03a5;
                case 24: goto L_0x0396;
                case 25: goto L_0x0387;
                case 26: goto L_0x0382;
                case 27: goto L_0x0375;
                case 28: goto L_0x0366;
                case 29: goto L_0x0357;
                case 30: goto L_0x0340;
                case 31: goto L_0x0331;
                case 32: goto L_0x0322;
                case 33: goto L_0x0313;
                case 34: goto L_0x0304;
                case 35: goto L_0x02f5;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02d7;
                case 38: goto L_0x02c8;
                case 39: goto L_0x02b9;
                case 40: goto L_0x02aa;
                case 41: goto L_0x029b;
                case 42: goto L_0x028c;
                case 43: goto L_0x027d;
                case 44: goto L_0x0266;
                case 45: goto L_0x0257;
                case 46: goto L_0x0248;
                case 47: goto L_0x0239;
                case 48: goto L_0x022a;
                case 49: goto L_0x0217;
                case 50: goto L_0x020a;
                case 51: goto L_0x01f6;
                case 52: goto L_0x01e2;
                case 53: goto L_0x01ce;
                case 54: goto L_0x01ba;
                case 55: goto L_0x01a6;
                case 56: goto L_0x0192;
                case 57: goto L_0x017e;
                case 58: goto L_0x016a;
                case 59: goto L_0x0162;
                case 60: goto L_0x0129;
                case 61: goto L_0x0119;
                case 62: goto L_0x0105;
                case 63: goto L_0x00de;
                case 64: goto L_0x00ca;
                case 65: goto L_0x00b6;
                case 66: goto L_0x00a2;
                case 67: goto L_0x008e;
                case 68: goto L_0x007a;
                default: goto L_0x0072;
            }     // Catch:{ a -> 0x0594 }
        L_0x0072:
            if (r1 != 0) goto L_0x0578
            java.lang.Object r1 = r11.m()     // Catch:{ a -> 0x0594 }
            goto L_0x0578
        L_0x007a:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.f1 r7 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r7 = r14.I(r7, r15)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x008e:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.j()     // Catch:{ a -> 0x0594 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x00a2:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            int r7 = r14.h()     // Catch:{ a -> 0x0594 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x00b6:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.r()     // Catch:{ a -> 0x0594 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x00ca:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            int r7 = r14.B()     // Catch:{ a -> 0x0594 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x00de:
            int r4 = r14.c()     // Catch:{ a -> 0x0594 }
            i7.z$c r7 = r10.m(r6)     // Catch:{ a -> 0x0594 }
            if (r7 == 0) goto L_0x00f5
            boolean r7 = r7.a(r4)     // Catch:{ a -> 0x0594 }
            if (r7 == 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            java.lang.Object r1 = i7.g1.C(r3, r4, r1, r11)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x00f5:
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r7, r4)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0105:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            int r7 = r14.x()     // Catch:{ a -> 0x0594 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0119:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.i r7 = r14.u()     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0129:
            boolean r4 = r10.t(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            if (r4 == 0) goto L_0x014b
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            java.lang.Object r4 = i7.p1.n(r13, r7)     // Catch:{ a -> 0x0594 }
            i7.f1 r7 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r7 = r14.E(r7, r15)     // Catch:{ a -> 0x0594 }
            java.lang.Object r4 = i7.z.c(r4, r7)     // Catch:{ a -> 0x0594 }
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r7, r4)     // Catch:{ a -> 0x0594 }
            goto L_0x015d
        L_0x014b:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.f1 r7 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r7 = r14.E(r7, r15)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
        L_0x015d:
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0162:
            r10.Q(r13, r5, r14)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x016a:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            boolean r7 = r14.o()     // Catch:{ a -> 0x0594 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x017e:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            int r7 = r14.n()     // Catch:{ a -> 0x0594 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0192:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.f()     // Catch:{ a -> 0x0594 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x01a6:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            int r7 = r14.z()     // Catch:{ a -> 0x0594 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x01ba:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.d()     // Catch:{ a -> 0x0594 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x01ce:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.J()     // Catch:{ a -> 0x0594 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x01e2:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            float r7 = r14.readFloat()     // Catch:{ a -> 0x0594 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x01f6:
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            double r7 = r14.readDouble()     // Catch:{ a -> 0x0594 }
            java.lang.Double r7 = java.lang.Double.valueOf(r7)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r7)     // Catch:{ a -> 0x0594 }
            r10.U(r13, r3, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x020a:
            java.lang.Object r7 = r10.n(r6)     // Catch:{ a -> 0x0594 }
            r4 = r10
            r5 = r13
            r8 = r15
            r9 = r14
            r4.w(r5, r6, r7, r8, r9)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0217:
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.f1 r9 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            r3 = r10
            r4 = r13
            r5 = r7
            r7 = r14
            r8 = r9
            r9 = r15
            r3.O(r4, r5, r7, r8, r9)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x022a:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.i(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0239:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.b(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0248:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.H(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0257:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.g(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0266:
            i7.g0 r4 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r4 = r4.c(r13, r7)     // Catch:{ a -> 0x0594 }
            r14.N(r4)     // Catch:{ a -> 0x0594 }
            i7.z$c r5 = r10.m(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r1 = i7.g1.y(r3, r4, r5, r1, r11)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x027d:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.k(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x028c:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.l(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x029b:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.e(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02aa:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.L(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02b9:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.M(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02c8:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.s(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02d7:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.F(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02e6:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.w(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x02f5:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.D(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0304:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.i(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0313:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.b(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0322:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.H(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0331:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.g(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0340:
            i7.g0 r4 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r4 = r4.c(r13, r7)     // Catch:{ a -> 0x0594 }
            r14.N(r4)     // Catch:{ a -> 0x0594 }
            i7.z$c r5 = r10.m(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r1 = i7.g1.y(r3, r4, r5, r1, r11)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0357:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.k(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0366:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.C(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0375:
            i7.f1 r7 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            r3 = r10
            r4 = r13
            r6 = r14
            r8 = r15
            r3.P(r4, r5, r6, r7, r8)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0382:
            r10.R(r13, r5, r14)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0387:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.l(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0396:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.e(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03a5:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.L(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03b4:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.M(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03c3:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.s(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03d2:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.F(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03e1:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.w(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03f0:
            i7.g0 r3 = r10.f6374n     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            java.util.List r3 = r3.c(r13, r4)     // Catch:{ a -> 0x0594 }
            r14.D(r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x03ff:
            boolean r3 = r10.s(r13, r6)     // Catch:{ a -> 0x0594 }
            if (r3 == 0) goto L_0x0422
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            java.lang.Object r3 = i7.p1.n(r13, r3)     // Catch:{ a -> 0x0594 }
            i7.f1 r4 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r4 = r14.I(r4, r15)     // Catch:{ a -> 0x0594 }
            java.lang.Object r3 = i7.z.c(r3, r4)     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0422:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.f1 r5 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r5 = r14.I(r5, r15)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0436:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.j()     // Catch:{ a -> 0x0594 }
            i7.p1.w(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0446:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            int r5 = r14.h()     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0456:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.r()     // Catch:{ a -> 0x0594 }
            i7.p1.w(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0466:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            int r5 = r14.B()     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0476:
            int r4 = r14.c()     // Catch:{ a -> 0x0594 }
            i7.z$c r7 = r10.m(r6)     // Catch:{ a -> 0x0594 }
            if (r7 == 0) goto L_0x048d
            boolean r7 = r7.a(r4)     // Catch:{ a -> 0x0594 }
            if (r7 == 0) goto L_0x0487
            goto L_0x048d
        L_0x0487:
            java.lang.Object r1 = i7.g1.C(r3, r4, r1, r11)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x048d:
            long r7 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r7, r4)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0499:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            int r5 = r14.x()     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x04a9:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.i r5 = r14.u()     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x04b9:
            boolean r3 = r10.s(r13, r6)     // Catch:{ a -> 0x0594 }
            if (r3 == 0) goto L_0x04dc
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            java.lang.Object r3 = i7.p1.n(r13, r3)     // Catch:{ a -> 0x0594 }
            i7.f1 r4 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r4 = r14.E(r4, r15)     // Catch:{ a -> 0x0594 }
            java.lang.Object r3 = i7.z.c(r3, r4)     // Catch:{ a -> 0x0594 }
            long r4 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r4, r3)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x04dc:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            i7.f1 r5 = r10.o(r6)     // Catch:{ a -> 0x0594 }
            java.lang.Object r5 = r14.E(r5, r15)     // Catch:{ a -> 0x0594 }
            i7.p1.x(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x04f0:
            r10.Q(r13, r5, r14)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x04f8:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            boolean r5 = r14.o()     // Catch:{ a -> 0x0594 }
            i7.p1.p(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0508:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            int r5 = r14.n()     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0518:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.f()     // Catch:{ a -> 0x0594 }
            i7.p1.w(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0528:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            int r5 = r14.z()     // Catch:{ a -> 0x0594 }
            i7.p1.v(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0538:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.d()     // Catch:{ a -> 0x0594 }
            i7.p1.w(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0548:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            long r7 = r14.J()     // Catch:{ a -> 0x0594 }
            i7.p1.w(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0558:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            float r5 = r14.readFloat()     // Catch:{ a -> 0x0594 }
            i7.p1.u(r13, r3, r5)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0568:
            long r3 = B(r5)     // Catch:{ a -> 0x0594 }
            double r7 = r14.readDouble()     // Catch:{ a -> 0x0594 }
            i7.p1.t(r13, r3, r7)     // Catch:{ a -> 0x0594 }
            r10.T(r13, r6)     // Catch:{ a -> 0x0594 }
            goto L_0x0003
        L_0x0578:
            boolean r3 = r11.l(r1, r14)     // Catch:{ a -> 0x0594 }
            if (r3 != 0) goto L_0x0003
            int r12 = r10.f6371k
        L_0x0580:
            int r14 = r10.f6372l
            if (r12 >= r14) goto L_0x058e
            int[] r14 = r10.f6370j
            r14 = r14[r12]
            r10.l(r13, r14, r1, r11)
            int r12 = r12 + 1
            goto L_0x0580
        L_0x058e:
            if (r1 == 0) goto L_0x0593
            r11.n(r13, r1)
        L_0x0593:
            return
        L_0x0594:
            r11.p()     // Catch:{ all -> 0x05b9 }
            if (r1 != 0) goto L_0x059d
            java.lang.Object r1 = r11.f(r13)     // Catch:{ all -> 0x05b9 }
        L_0x059d:
            boolean r3 = r11.l(r1, r14)     // Catch:{ all -> 0x05b9 }
            if (r3 != 0) goto L_0x0003
            int r12 = r10.f6371k
        L_0x05a5:
            int r14 = r10.f6372l
            if (r12 >= r14) goto L_0x05b3
            int[] r14 = r10.f6370j
            r14 = r14[r12]
            r10.l(r13, r14, r1, r11)
            int r12 = r12 + 1
            goto L_0x05a5
        L_0x05b3:
            if (r1 == 0) goto L_0x05b8
            r11.n(r13, r1)
        L_0x05b8:
            return
        L_0x05b9:
            r12 = move-exception
            int r14 = r10.f6371k
        L_0x05bc:
            int r15 = r10.f6372l
            if (r14 >= r15) goto L_0x05ca
            int[] r15 = r10.f6370j
            r15 = r15[r14]
            r10.l(r13, r15, r1, r11)
            int r14 = r14 + 1
            goto L_0x05bc
        L_0x05ca:
            if (r1 == 0) goto L_0x05cf
            r11.n(r13, r1)
        L_0x05cf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t0.v(i7.l1, i7.q, java.lang.Object, i7.e1, i7.p):void");
    }

    public final <K, V> void w(Object obj, int i10, Object obj2, p pVar, e1 e1Var) throws IOException {
        long X = (long) (X(i10) & 1048575);
        Object n10 = p1.n(obj, X);
        if (n10 == null) {
            n10 = this.f6377q.f();
            p1.x(obj, X, n10);
        } else if (this.f6377q.c(n10)) {
            Object f10 = this.f6377q.f();
            this.f6377q.a(f10, n10);
            p1.x(obj, X, f10);
            n10 = f10;
        }
        this.f6377q.h(n10);
        this.f6377q.e(obj2);
        e1Var.y();
    }

    public final void x(T t10, T t11, int i10) {
        long X = (long) (X(i10) & 1048575);
        if (s(t11, i10)) {
            Object n10 = p1.n(t10, X);
            Object n11 = p1.n(t11, X);
            if (n10 != null && n11 != null) {
                p1.x(t10, X, z.c(n10, n11));
                T(t10, i10);
            } else if (n11 != null) {
                p1.x(t10, X, n11);
                T(t10, i10);
            }
        }
    }

    public final void y(T t10, T t11, int i10) {
        int X = X(i10);
        int i11 = this.f6363a[i10];
        long j10 = (long) (X & 1048575);
        if (t(t11, i11, i10)) {
            Object n10 = p1.n(t10, j10);
            Object n11 = p1.n(t11, j10);
            if (n10 != null && n11 != null) {
                p1.x(t10, j10, z.c(n10, n11));
                U(t10, i11, i10);
            } else if (n11 != null) {
                p1.x(t10, j10, n11);
                U(t10, i11, i10);
            }
        }
    }
}
