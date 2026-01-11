package mg;

import android.support.v4.media.b;
import lg.c;

public abstract class d implements c, xh.d {

    /* renamed from: o  reason: collision with root package name */
    public static final long[] f8696o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a  reason: collision with root package name */
    public byte[] f8697a;

    /* renamed from: b  reason: collision with root package name */
    public int f8698b;

    /* renamed from: c  reason: collision with root package name */
    public long f8699c;

    /* renamed from: d  reason: collision with root package name */
    public long f8700d;

    /* renamed from: e  reason: collision with root package name */
    public long f8701e;

    /* renamed from: f  reason: collision with root package name */
    public long f8702f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public long f8703h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f8704j;

    /* renamed from: k  reason: collision with root package name */
    public long f8705k;

    /* renamed from: l  reason: collision with root package name */
    public long f8706l;

    /* renamed from: m  reason: collision with root package name */
    public long[] f8707m;

    /* renamed from: n  reason: collision with root package name */
    public int f8708n;

    public d() {
        this.f8697a = new byte[8];
        this.f8707m = new long[80];
        this.f8698b = 0;
        reset();
    }

    public d(d dVar) {
        this.f8697a = new byte[8];
        this.f8707m = new long[80];
        m(dVar);
    }

    public final void f(byte b10) {
        byte[] bArr = this.f8697a;
        int i10 = this.f8698b;
        int i11 = i10 + 1;
        this.f8698b = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            p(bArr, 0);
            this.f8698b = 0;
        }
        this.f8699c++;
    }

    public final int h() {
        return 128;
    }

    public final long i(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    public final long j(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    public final long k(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    public final void l() {
        long j10 = this.f8699c;
        if (j10 > 2305843009213693951L) {
            this.f8700d += j10 >>> 61;
            this.f8699c = j10 & 2305843009213693951L;
        }
    }

    public final void m(d dVar) {
        byte[] bArr = dVar.f8697a;
        System.arraycopy(bArr, 0, this.f8697a, 0, bArr.length);
        this.f8698b = dVar.f8698b;
        this.f8699c = dVar.f8699c;
        this.f8700d = dVar.f8700d;
        this.f8701e = dVar.f8701e;
        this.f8702f = dVar.f8702f;
        this.g = dVar.g;
        this.f8703h = dVar.f8703h;
        this.i = dVar.i;
        this.f8704j = dVar.f8704j;
        this.f8705k = dVar.f8705k;
        this.f8706l = dVar.f8706l;
        long[] jArr = dVar.f8707m;
        System.arraycopy(jArr, 0, this.f8707m, 0, jArr.length);
        this.f8708n = dVar.f8708n;
    }

    public final void n() {
        l();
        long j10 = this.f8699c << 3;
        long j11 = this.f8700d;
        byte b10 = Byte.MIN_VALUE;
        while (true) {
            f(b10);
            if (this.f8698b == 0) {
                break;
            }
            b10 = 0;
        }
        if (this.f8708n > 14) {
            o();
        }
        long[] jArr = this.f8707m;
        jArr[14] = j11;
        jArr[15] = j10;
        o();
    }

    public final void o() {
        l();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f8707m;
            long j10 = jArr[i10 - 2];
            long j11 = ((j10 >>> 6) ^ (((j10 << 45) | (j10 >>> 19)) ^ ((j10 << 3) | (j10 >>> 61)))) + jArr[i10 - 7];
            long j12 = jArr[i10 - 15];
            jArr[i10] = j11 + ((j12 >>> 7) ^ (((j12 << 63) | (j12 >>> 1)) ^ ((j12 << 56) | (j12 >>> 8)))) + jArr[i10 - 16];
        }
        long j13 = this.f8701e;
        long j14 = this.f8702f;
        long j15 = this.g;
        long j16 = this.f8703h;
        long j17 = this.i;
        long j18 = this.f8704j;
        long j19 = this.f8705k;
        long j20 = j13;
        long j21 = this.f8706l;
        int i11 = 0;
        long j22 = j15;
        int i12 = 0;
        long j23 = j17;
        long j24 = j14;
        long j25 = j16;
        long j26 = j19;
        long j27 = j20;
        long j28 = j18;
        long j29 = j22;
        while (i12 < 10) {
            long j30 = j24;
            long k10 = k(j23) + (((~j23) & j26) ^ (j28 & j23));
            long[] jArr2 = f8696o;
            int i13 = i11 + 1;
            long j31 = k10 + jArr2[i11] + this.f8707m[i11] + j21;
            long[] jArr3 = jArr2;
            long j32 = j25 + j31;
            long j33 = j23;
            long j34 = j(j27) + i(j27, j30, j29) + j31;
            long j35 = j27;
            int i14 = i13 + 1;
            long k11 = k(j32) + ((j33 & j32) ^ ((~j32) & j28)) + jArr3[i13] + this.f8707m[i13] + j26;
            long j36 = j29 + k11;
            long j37 = j34;
            long j38 = j(j34) + i(j34, j35, j30) + k11;
            long j39 = j32;
            long k12 = k(j36) + ((j32 & j36) ^ ((~j36) & j33)) + jArr3[i14] + this.f8707m[i14] + j28;
            int i15 = i14 + 1;
            long j40 = j30 + k12;
            long j41 = j38;
            long j42 = j(j38) + i(j38, j37, j35) + k12;
            int i16 = i15 + 1;
            long k13 = k(j40) + ((j36 & j40) ^ ((~j40) & j39)) + jArr3[i15] + this.f8707m[i15] + j33;
            long j43 = j35 + k13;
            long j44 = j(j42);
            long j45 = j42;
            long j46 = j43;
            long i17 = j44 + i(j42, j41, j37) + k13;
            long j47 = j40;
            int i18 = i16 + 1;
            long k14 = k(j46) + ((j40 & j46) ^ ((~j46) & j36)) + jArr3[i16] + this.f8707m[i16] + j39;
            long j48 = j37 + k14;
            long j49 = i17;
            long j50 = j(i17) + i(i17, j45, j41) + k14;
            int i19 = i18 + 1;
            long k15 = k(j48) + ((j46 & j48) ^ ((~j48) & j47)) + jArr3[i18] + this.f8707m[i18] + j36;
            long j51 = j46;
            long j52 = j41 + k15;
            long j53 = j50;
            long j54 = j(j50) + i(j50, j49, j45) + k15;
            long j55 = j48;
            int i20 = i19 + 1;
            long k16 = k(j52) + ((j48 & j52) ^ ((~j52) & j51)) + jArr3[i19] + this.f8707m[i19] + j47;
            long j56 = j52;
            long j57 = j45 + k16;
            long j58 = j54;
            long j59 = j(j54) + i(j54, j53, j49) + k16;
            i11 = i20 + 1;
            long k17 = k(j57) + ((j56 & j57) ^ ((~j57) & j55)) + jArr3[i20] + this.f8707m[i20] + j51;
            i12++;
            j24 = j59;
            j23 = j49 + k17;
            j25 = j53;
            j29 = j58;
            j28 = j57;
            j27 = j(j59) + i(j59, j58, j53) + k17;
            j21 = j55;
            j26 = j56;
        }
        this.f8701e += j27;
        this.f8702f += j24;
        this.g += j29;
        this.f8703h += j25;
        this.i += j23;
        this.f8704j += j28;
        this.f8705k += j26;
        this.f8706l += j21;
        this.f8708n = 0;
        for (int i21 = 0; i21 < 16; i21++) {
            this.f8707m[i21] = 0;
        }
    }

    public final void p(byte[] bArr, int i10) {
        long[] jArr = this.f8707m;
        int i11 = this.f8708n;
        int F = b.F(bArr, i10);
        jArr[i11] = (((long) b.F(bArr, i10 + 4)) & 4294967295L) | ((((long) F) & 4294967295L) << 32);
        int i12 = this.f8708n + 1;
        this.f8708n = i12;
        if (i12 == 16) {
            o();
        }
    }

    public void reset() {
        this.f8699c = 0;
        this.f8700d = 0;
        int i10 = 0;
        this.f8698b = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f8697a;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f8708n = 0;
        while (true) {
            long[] jArr = this.f8707m;
            if (i10 != jArr.length) {
                jArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void update(byte[] bArr, int i10, int i11) {
        while (this.f8698b != 0 && i11 > 0) {
            f(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > this.f8697a.length) {
            p(bArr, i10);
            byte[] bArr2 = this.f8697a;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f8699c += (long) bArr2.length;
        }
        while (i11 > 0) {
            f(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
