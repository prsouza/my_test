package mg;

import android.support.v4.media.b;
import java.util.Arrays;
import lg.c;

public final class a implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final long[] f8675m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* renamed from: n  reason: collision with root package name */
    public static final byte[][] f8676n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* renamed from: a  reason: collision with root package name */
    public int f8677a;

    /* renamed from: b  reason: collision with root package name */
    public int f8678b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f8679c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f8680d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f8681e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f8682f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public long[] f8683h;
    public long[] i;

    /* renamed from: j  reason: collision with root package name */
    public long f8684j;

    /* renamed from: k  reason: collision with root package name */
    public long f8685k;

    /* renamed from: l  reason: collision with root package name */
    public long f8686l;

    public a() {
        this(512);
    }

    public a(int i10) {
        this.f8677a = 64;
        this.f8678b = 0;
        this.f8679c = null;
        this.f8680d = null;
        this.f8681e = null;
        this.f8682f = null;
        this.g = 0;
        this.f8683h = new long[16];
        this.i = null;
        this.f8684j = 0;
        this.f8685k = 0;
        this.f8686l = 0;
        if (i10 < 8 || i10 > 512 || i10 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f8682f = new byte[128];
        this.f8678b = 0;
        this.f8677a = i10 / 8;
        i();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: long[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(mg.a r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 64
            r4.f8677a = r0
            r0 = 0
            r4.f8678b = r0
            r1 = 0
            r4.f8679c = r1
            r4.f8680d = r1
            r4.f8681e = r1
            r4.f8682f = r1
            r4.g = r0
            r0 = 16
            long[] r0 = new long[r0]
            r4.f8683h = r0
            r4.i = r1
            r2 = 0
            r4.f8684j = r2
            r4.f8685k = r2
            r4.f8686l = r2
            int r0 = r5.g
            r4.g = r0
            byte[] r0 = r5.f8682f
            byte[] r0 = xh.a.a(r0)
            r4.f8682f = r0
            int r0 = r5.f8678b
            r4.f8678b = r0
            byte[] r0 = r5.f8681e
            byte[] r0 = xh.a.a(r0)
            r4.f8681e = r0
            int r0 = r5.f8677a
            r4.f8677a = r0
            long[] r0 = r5.i
            if (r0 != 0) goto L_0x0046
            goto L_0x004d
        L_0x0046:
            java.lang.Object r0 = r0.clone()
            r1 = r0
            long[] r1 = (long[]) r1
        L_0x004d:
            r4.i = r1
            byte[] r0 = r5.f8680d
            byte[] r0 = xh.a.a(r0)
            r4.f8680d = r0
            byte[] r0 = r5.f8679c
            byte[] r0 = xh.a.a(r0)
            r4.f8679c = r0
            long r0 = r5.f8684j
            r4.f8684j = r0
            long r0 = r5.f8685k
            r4.f8685k = r0
            long r0 = r5.f8686l
            r4.f8686l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.a.<init>(mg.a):void");
    }

    public static long j(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    public final void a(long j10, long j11, int i10, int i11, int i12, int i13) {
        long[] jArr = this.f8683h;
        jArr[i10] = jArr[i10] + jArr[i11] + j10;
        jArr[i13] = j(jArr[i13] ^ jArr[i10], 32);
        long[] jArr2 = this.f8683h;
        jArr2[i12] = jArr2[i12] + jArr2[i13];
        jArr2[i11] = j(jArr2[i11] ^ jArr2[i12], 24);
        long[] jArr3 = this.f8683h;
        jArr3[i10] = jArr3[i10] + jArr3[i11] + j11;
        jArr3[i13] = j(jArr3[i13] ^ jArr3[i10], 16);
        long[] jArr4 = this.f8683h;
        jArr4[i12] = jArr4[i12] + jArr4[i13];
        jArr4[i11] = j(jArr4[i11] ^ jArr4[i12], 63);
    }

    public final int b(byte[] bArr, int i10) {
        long[] jArr;
        int i11;
        this.f8686l = -1;
        long j10 = this.f8684j;
        int i12 = this.g;
        long j11 = j10 + ((long) i12);
        this.f8684j = j11;
        if (i12 > 0 && j11 == 0) {
            this.f8685k++;
        }
        e(this.f8682f, 0);
        Arrays.fill(this.f8682f, (byte) 0);
        Arrays.fill(this.f8683h, 0);
        int i13 = 0;
        while (true) {
            jArr = this.i;
            if (i13 >= jArr.length || (i11 = i13 * 8) >= this.f8677a) {
                Arrays.fill(jArr, 0);
                reset();
            } else {
                long j12 = jArr[i13];
                byte[] bArr2 = new byte[8];
                b.J0((int) (4294967295L & j12), bArr2, 0);
                b.J0((int) (j12 >>> 32), bArr2, 4);
                int i14 = this.f8677a;
                if (i11 < i14 - 8) {
                    System.arraycopy(bArr2, 0, bArr, i11 + i10, 8);
                } else {
                    System.arraycopy(bArr2, 0, bArr, i10 + i11, i14 - i11);
                }
                i13++;
            }
        }
        Arrays.fill(jArr, 0);
        reset();
        return this.f8677a;
    }

    public final String c() {
        return "BLAKE2b";
    }

    public final int d() {
        return this.f8677a;
    }

    public final void e(byte[] bArr, int i10) {
        long[] jArr = this.i;
        int i11 = 0;
        System.arraycopy(jArr, 0, this.f8683h, 0, jArr.length);
        long[] jArr2 = f8675m;
        System.arraycopy(jArr2, 0, this.f8683h, this.i.length, 4);
        long[] jArr3 = this.f8683h;
        jArr3[12] = this.f8684j ^ jArr2[4];
        jArr3[13] = this.f8685k ^ jArr2[5];
        jArr3[14] = this.f8686l ^ jArr2[6];
        jArr3[15] = jArr2[7];
        long[] jArr4 = new long[16];
        for (int i12 = 0; i12 < 16; i12++) {
            jArr4[i12] = b.g1(bArr, (i12 * 8) + i10);
        }
        int i13 = 0;
        while (i13 < 12) {
            byte[][] bArr2 = f8676n;
            int i14 = i13;
            long[] jArr5 = jArr4;
            a(jArr4[bArr2[i13][0]], jArr4[bArr2[i13][1]], 0, 4, 8, 12);
            a(jArr5[bArr2[i14][2]], jArr5[bArr2[i14][3]], 1, 5, 9, 13);
            a(jArr5[bArr2[i14][4]], jArr5[bArr2[i14][5]], 2, 6, 10, 14);
            a(jArr5[bArr2[i14][6]], jArr5[bArr2[i14][7]], 3, 7, 11, 15);
            a(jArr5[bArr2[i14][8]], jArr5[bArr2[i14][9]], 0, 5, 10, 15);
            a(jArr5[bArr2[i14][10]], jArr5[bArr2[i14][11]], 1, 6, 11, 12);
            a(jArr5[bArr2[i14][12]], jArr5[bArr2[i14][13]], 2, 7, 8, 13);
            a(jArr5[bArr2[i14][14]], jArr5[bArr2[i14][15]], 3, 4, 9, 14);
            i13 = i14 + 1;
            jArr4 = jArr5;
        }
        while (true) {
            long[] jArr6 = this.i;
            if (i11 < jArr6.length) {
                long j10 = jArr6[i11];
                long[] jArr7 = this.f8683h;
                jArr6[i11] = (j10 ^ jArr7[i11]) ^ jArr7[i11 + 8];
                i11++;
            } else {
                return;
            }
        }
    }

    public final void f(byte b10) {
        int i10 = this.g;
        if (128 - i10 == 0) {
            long j10 = this.f8684j + 128;
            this.f8684j = j10;
            if (j10 == 0) {
                this.f8685k++;
            }
            e(this.f8682f, 0);
            Arrays.fill(this.f8682f, (byte) 0);
            this.f8682f[0] = b10;
            this.g = 1;
            return;
        }
        this.f8682f[i10] = b10;
        this.g = i10 + 1;
    }

    public final int h() {
        return 128;
    }

    public final void i() {
        if (this.i == null) {
            long[] jArr = new long[8];
            this.i = jArr;
            long[] jArr2 = f8675m;
            jArr[0] = jArr2[0] ^ ((long) ((this.f8677a | (this.f8678b << 8)) | 16842752));
            jArr[1] = jArr2[1];
            jArr[2] = jArr2[2];
            jArr[3] = jArr2[3];
            jArr[4] = jArr2[4];
            jArr[5] = jArr2[5];
            byte[] bArr = this.f8679c;
            if (bArr != null) {
                jArr[4] = jArr[4] ^ b.g1(bArr, 0);
                long[] jArr3 = this.i;
                jArr3[5] = jArr3[5] ^ b.g1(this.f8679c, 8);
            }
            long[] jArr4 = this.i;
            jArr4[6] = jArr2[6];
            jArr4[7] = jArr2[7];
            byte[] bArr2 = this.f8680d;
            if (bArr2 != null) {
                jArr4[6] = b.g1(bArr2, 0) ^ jArr4[6];
                long[] jArr5 = this.i;
                jArr5[7] = jArr5[7] ^ b.g1(this.f8680d, 8);
            }
        }
    }

    public final void reset() {
        this.g = 0;
        this.f8686l = 0;
        this.f8684j = 0;
        this.f8685k = 0;
        this.i = null;
        Arrays.fill(this.f8682f, (byte) 0);
        byte[] bArr = this.f8681e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f8682f, 0, bArr.length);
            this.g = 128;
        }
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void update(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0061
            if (r14 != 0) goto L_0x0005
            goto L_0x0061
        L_0x0005:
            int r0 = r11.g
            r1 = 1
            r3 = 0
            r5 = 128(0x80, double:6.32E-322)
            r7 = 0
            if (r0 == 0) goto L_0x003f
            int r8 = 128 - r0
            if (r8 >= r14) goto L_0x0034
            byte[] r9 = r11.f8682f
            java.lang.System.arraycopy(r12, r13, r9, r0, r8)
            long r9 = r11.f8684j
            long r9 = r9 + r5
            r11.f8684j = r9
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            long r9 = r11.f8685k
            long r9 = r9 + r1
            r11.f8685k = r9
        L_0x0027:
            byte[] r0 = r11.f8682f
            r11.e(r0, r7)
            r11.g = r7
            byte[] r0 = r11.f8682f
            java.util.Arrays.fill(r0, r7)
            goto L_0x0040
        L_0x0034:
            byte[] r1 = r11.f8682f
            java.lang.System.arraycopy(r12, r13, r1, r0, r14)
        L_0x0039:
            int r12 = r11.g
            int r12 = r12 + r14
            r11.g = r12
            return
        L_0x003f:
            r8 = r7
        L_0x0040:
            int r14 = r14 + r13
            int r0 = r14 + -128
            int r13 = r13 + r8
        L_0x0044:
            if (r13 >= r0) goto L_0x005a
            long r8 = r11.f8684j
            long r8 = r8 + r5
            r11.f8684j = r8
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            long r8 = r11.f8685k
            long r8 = r8 + r1
            r11.f8685k = r8
        L_0x0054:
            r11.e(r12, r13)
            int r13 = r13 + 128
            goto L_0x0044
        L_0x005a:
            byte[] r0 = r11.f8682f
            int r14 = r14 - r13
            java.lang.System.arraycopy(r12, r13, r0, r7, r14)
            goto L_0x0039
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.a.update(byte[], int, int):void");
    }
}
