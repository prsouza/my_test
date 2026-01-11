package ef;

import a.b;
import df.c;
import df.d;
import java.util.Arrays;

public final class a extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4830c = new byte[32];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4831b;

    public a(c cVar, int[] iArr) {
        super(cVar);
        if (iArr.length == 10) {
            this.f4831b = iArr;
            return;
        }
        throw new IllegalArgumentException("Invalid radix-2^51 representation");
    }

    public final d a(d dVar) {
        int[] iArr = ((a) dVar).f4831b;
        int[] iArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr2[i] = this.f4831b[i] + iArr[i];
        }
        return new a(this.f4482a, iArr2);
    }

    public final d b(d dVar, int i) {
        a aVar = (a) dVar;
        int i10 = -i;
        int[] iArr = new int[10];
        for (int i11 = 0; i11 < 10; i11++) {
            int[] iArr2 = this.f4831b;
            iArr[i11] = iArr2[i11];
            iArr[i11] = ((iArr2[i11] ^ aVar.f4831b[i11]) & i10) ^ iArr[i11];
        }
        return new a(this.f4482a, iArr);
    }

    public final d c() {
        d f10 = f();
        d d10 = d(f10.f().f());
        d d11 = f10.d(d10);
        d d12 = d10.d(d11.f());
        d f11 = d12.f();
        for (int i = 1; i < 5; i++) {
            f11 = f11.f();
        }
        d d13 = f11.d(d12);
        d f12 = d13.f();
        for (int i10 = 1; i10 < 10; i10++) {
            f12 = f12.f();
        }
        d d14 = f12.d(d13);
        d f13 = d14.f();
        for (int i11 = 1; i11 < 20; i11++) {
            f13 = f13.f();
        }
        d f14 = f13.d(d14).f();
        for (int i12 = 1; i12 < 10; i12++) {
            f14 = f14.f();
        }
        d d15 = f14.d(d13);
        d f15 = d15.f();
        for (int i13 = 1; i13 < 50; i13++) {
            f15 = f15.f();
        }
        d d16 = f15.d(d15);
        d f16 = d16.f();
        for (int i14 = 1; i14 < 100; i14++) {
            f16 = f16.f();
        }
        d f17 = f16.d(d16).f();
        for (int i15 = 1; i15 < 50; i15++) {
            f17 = f17.f();
        }
        d f18 = f17.d(d15).f();
        for (int i16 = 1; i16 < 5; i16++) {
            f18 = f18.f();
        }
        return f18.d(d11);
    }

    public final d d(d dVar) {
        int[] iArr = ((a) dVar).f4831b;
        int[] iArr2 = this.f4831b;
        int i = iArr2[1] * 2;
        int i10 = iArr2[3] * 2;
        int i11 = iArr2[5] * 2;
        int i12 = iArr2[7] * 2;
        int i13 = iArr[1] * 19;
        int i14 = iArr2[9] * 2;
        int i15 = iArr[2] * 19;
        int i16 = iArr[4] * 19;
        int i17 = i11;
        long j10 = ((long) iArr2[0]) * ((long) iArr[0]);
        long j11 = ((long) iArr2[0]) * ((long) iArr[1]);
        long j12 = ((long) iArr2[0]) * ((long) iArr[2]);
        long j13 = ((long) iArr2[0]) * ((long) iArr[3]);
        long j14 = ((long) iArr2[0]) * ((long) iArr[4]);
        long j15 = ((long) iArr2[0]) * ((long) iArr[5]);
        long j16 = ((long) iArr2[0]) * ((long) iArr[6]);
        long j17 = ((long) iArr2[0]) * ((long) iArr[7]);
        long j18 = ((long) iArr2[0]) * ((long) iArr[9]);
        long j19 = (long) i;
        long j20 = ((long) iArr2[1]) * ((long) iArr[0]);
        long j21 = ((long) iArr[1]) * j19;
        long j22 = ((long) iArr2[1]) * ((long) iArr[2]);
        long j23 = ((long) iArr[3]) * j19;
        long j24 = j22;
        long j25 = ((long) iArr2[1]) * ((long) iArr[4]);
        long j26 = ((long) iArr[5]) * j19;
        long j27 = j25;
        long j28 = ((long) iArr2[1]) * ((long) iArr[6]);
        long j29 = ((long) iArr[7]) * j19;
        long j30 = (long) (iArr[9] * 19);
        long j31 = ((long) iArr2[1]) * ((long) iArr[8]);
        long j32 = j19 * j30;
        long j33 = ((long) iArr2[2]) * ((long) iArr[0]);
        long j34 = ((long) iArr2[2]) * ((long) iArr[1]);
        int i18 = iArr[5] * 19;
        long j35 = ((long) iArr2[2]) * ((long) iArr[2]);
        long j36 = ((long) iArr2[2]) * ((long) iArr[3]);
        long j37 = ((long) iArr2[2]) * ((long) iArr[4]);
        long j38 = ((long) iArr2[2]) * ((long) iArr[5]);
        long j39 = ((long) iArr2[2]) * ((long) iArr[6]);
        long j40 = ((long) iArr2[2]) * ((long) iArr[7]);
        long j41 = (long) (iArr[8] * 19);
        long j42 = j35;
        long j43 = ((long) iArr2[2]) * j30;
        long j44 = ((long) iArr2[2]) * j41;
        long j45 = (long) i10;
        long j46 = ((long) iArr2[3]) * ((long) iArr[0]);
        int i19 = iArr[3] * 19;
        long j47 = ((long) iArr[1]) * j45;
        long j48 = ((long) iArr2[3]) * ((long) iArr[2]);
        long j49 = ((long) iArr[3]) * j45;
        long j50 = ((long) iArr2[3]) * ((long) iArr[4]);
        long j51 = ((long) iArr[5]) * j45;
        long j52 = j50;
        long j53 = ((long) iArr2[3]) * ((long) iArr[6]);
        long j54 = (long) (iArr[7] * 19);
        long j55 = j45 * j54;
        long j56 = j53;
        int i20 = iArr[6] * 19;
        long j57 = j45 * j30;
        long j58 = ((long) iArr2[4]) * ((long) iArr[0]);
        long j59 = ((long) iArr2[4]) * ((long) iArr[1]);
        long j60 = ((long) iArr2[4]) * ((long) iArr[2]);
        long j61 = ((long) iArr2[4]) * ((long) iArr[3]);
        long j62 = ((long) iArr2[3]) * j41;
        long j63 = ((long) iArr2[4]) * ((long) iArr[4]);
        long j64 = ((long) iArr2[4]) * ((long) iArr[5]);
        long j65 = (long) i20;
        long j66 = ((long) iArr2[4]) * j65;
        long j67 = ((long) iArr2[4]) * j54;
        long j68 = ((long) iArr2[4]) * j30;
        long j69 = ((long) iArr2[4]) * j41;
        long j70 = (long) i17;
        long j71 = ((long) iArr2[5]) * ((long) iArr[0]);
        long j72 = ((long) iArr[1]) * j70;
        long j73 = j30;
        long j74 = ((long) iArr2[5]) * ((long) iArr[2]);
        long j75 = ((long) iArr[3]) * j70;
        long j76 = j74;
        long j77 = (long) i18;
        long j78 = j70 * j77;
        long j79 = ((long) iArr2[5]) * ((long) iArr[4]);
        long j80 = j70 * j54;
        long j81 = ((long) iArr2[5]) * j65;
        long j82 = j70 * j73;
        long j83 = ((long) iArr2[5]) * j41;
        long j84 = ((long) iArr2[6]) * ((long) iArr[0]);
        long j85 = ((long) iArr2[6]) * ((long) iArr[1]);
        long j86 = ((long) iArr2[6]) * ((long) iArr[2]);
        int i21 = i16;
        long j87 = ((long) iArr2[6]) * ((long) iArr[3]);
        long j88 = (long) i21;
        long j89 = ((long) iArr2[6]) * j88;
        long j90 = ((long) iArr2[6]) * j77;
        long j91 = ((long) iArr2[6]) * j65;
        long j92 = ((long) iArr2[6]) * j54;
        long j93 = ((long) iArr2[6]) * j41;
        long j94 = ((long) iArr2[6]) * j73;
        long j95 = j41;
        long j96 = (long) i12;
        long j97 = ((long) iArr2[7]) * ((long) iArr[0]);
        long j98 = ((long) iArr[1]) * j96;
        int[] iArr3 = iArr;
        long j99 = (long) i19;
        long j100 = j96 * j99;
        long j101 = ((long) iArr2[7]) * ((long) iArr[2]);
        long j102 = j96 * j77;
        long j103 = ((long) iArr2[7]) * j88;
        long j104 = j96 * j54;
        long j105 = ((long) iArr2[7]) * j65;
        long j106 = j96 * j73;
        long j107 = ((long) iArr2[7]) * j95;
        long j108 = ((long) iArr2[8]) * ((long) iArr3[0]);
        long j109 = ((long) iArr2[8]) * ((long) iArr3[1]);
        long j110 = (long) i15;
        long j111 = ((long) iArr2[8]) * j110;
        long j112 = ((long) iArr2[8]) * j99;
        long j113 = ((long) iArr2[8]) * j88;
        long j114 = ((long) iArr2[8]) * j77;
        long j115 = ((long) iArr2[8]) * j65;
        long j116 = ((long) iArr2[8]) * j54;
        long j117 = ((long) iArr2[8]) * j95;
        long j118 = ((long) iArr2[8]) * j73;
        long j119 = j54;
        long j120 = (long) i14;
        long j121 = ((long) iArr2[9]) * ((long) iArr3[0]);
        long j122 = ((long) iArr2[9]) * j110;
        long j123 = ((long) iArr2[9]) * j88;
        long j124 = ((long) iArr2[9]) * j65;
        long j125 = j10 + j32 + j44 + j55 + j66 + j78 + j89 + j100 + j111 + (((long) i13) * j120);
        long j126 = j11 + j20 + j43 + j62 + j67 + j81 + j90 + j103 + j112 + j122;
        long j127 = j12 + j21 + j33 + j57 + j69 + j80 + j91 + j102 + j113 + (j99 * j120);
        long j128 = j13 + j24 + j34 + j46 + j68 + j83 + j92 + j105 + j114 + j123;
        long j129 = j14 + j23 + j42 + j47 + j58 + j82 + j93 + j104 + j115 + (j77 * j120);
        long j130 = j15 + j27 + j36 + j48 + j59 + j71 + j94 + j107 + j116 + j124;
        long j131 = j16 + j26 + j37 + j49 + j60 + j72 + j84 + j106 + j117 + (j120 * j119);
        long j132 = j17 + j28 + j38 + j52 + j61 + j76 + j85 + j97 + j118 + (((long) iArr2[9]) * j95);
        long j133 = (j125 + 33554432) >> 26;
        long j134 = j126 + j133;
        long j135 = j125 - (j133 << 26);
        long j136 = (j129 + 33554432) >> 26;
        long j137 = j130 + j136;
        long j138 = (j134 + 16777216) >> 25;
        long j139 = j127 + j138;
        long j140 = j134 - (j138 << 25);
        long j141 = (j137 + 16777216) >> 25;
        long j142 = j131 + j141;
        long j143 = j137 - (j141 << 25);
        long j144 = (j139 + 33554432) >> 26;
        long j145 = j128 + j144;
        long j146 = j139 - (j144 << 26);
        long j147 = (j142 + 33554432) >> 26;
        long j148 = j132 + j147;
        long j149 = j142 - (j147 << 26);
        long j150 = (j145 + 16777216) >> 25;
        long j151 = (j129 - (j136 << 26)) + j150;
        long j152 = j145 - (j150 << 25);
        long j153 = (j148 + 16777216) >> 25;
        long j154 = (((long) iArr2[0]) * ((long) iArr[8])) + j29 + j39 + j51 + j63 + j75 + j86 + j98 + j108 + (j120 * j73) + j153;
        long j155 = j148 - (j153 << 25);
        long j156 = (j151 + 33554432) >> 26;
        long j157 = j143 + j156;
        long j158 = j151 - (j156 << 26);
        long j159 = (j154 + 33554432) >> 26;
        long j160 = j18 + j31 + j40 + j56 + j64 + j79 + j87 + j101 + j109 + j121 + j159;
        long j161 = j154 - (j159 << 26);
        long j162 = (j160 + 16777216) >> 25;
        long j163 = (19 * j162) + j135;
        long j164 = (j163 + 33554432) >> 26;
        long j165 = j160 - (j162 << 25);
        long j166 = j161;
        long j167 = j163 - (j164 << 26);
        return new a(this.f4482a, new int[]{(int) j167, (int) (j140 + j164), (int) j146, (int) j152, (int) j158, (int) j157, (int) j149, (int) j155, (int) j166, (int) j165});
    }

    public final d e() {
        int[] iArr = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr[i] = -this.f4831b[i];
        }
        return new a(this.f4482a, iArr);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && 1 == b.U(h(), ((a) obj).h())) {
            return true;
        }
        return false;
    }

    public final d f() {
        int[] iArr = this.f4831b;
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = iArr[8];
        int i18 = iArr[9];
        int i19 = i10 * 2;
        int i20 = i14 * 2;
        int i21 = i13 * 2;
        int i22 = i14 * 38;
        int i23 = i16 * 38;
        int i24 = i17 * 19;
        int i25 = i16 * 2;
        long j10 = (long) i;
        long j11 = j10 * j10;
        long j12 = (long) (i * 2);
        int i26 = i18 * 38;
        long j13 = (long) i10;
        long j14 = j12 * j13;
        int i27 = i12 * 2;
        long j15 = (long) i11;
        long j16 = (long) i12;
        long j17 = j12 * j16;
        long j18 = j16;
        long j19 = (long) i13;
        long j20 = j12 * j19;
        long j21 = (long) i14;
        long j22 = j12 * j21;
        long j23 = j21;
        long j24 = (long) i15;
        long j25 = j12 * j24;
        long j26 = (long) i16;
        long j27 = j12 * j26;
        long j28 = j26;
        long j29 = (long) i17;
        long j30 = (long) i18;
        long j31 = j12 * j30;
        long j32 = (long) i19;
        long j33 = j32 * j15;
        long j34 = j30;
        long j35 = (long) i27;
        long j36 = j32 * j35;
        long j37 = j32 * j19;
        long j38 = j35;
        long j39 = (long) i20;
        long j40 = j32 * j39;
        long j41 = j32 * j24;
        long j42 = j39;
        long j43 = (long) i25;
        long j44 = j32 * j29;
        long j45 = j29;
        long j46 = (long) i26;
        long j47 = j15 * j15;
        long j48 = (long) (i11 * 2);
        long j49 = j48 * j19;
        long j50 = j48 * j23;
        long j51 = j48 * j24;
        long j52 = j48 * j28;
        int i28 = i24;
        long j53 = j48 * j18;
        long j54 = (long) i28;
        long j55 = j18 * j38;
        long j56 = j38 * j19;
        long j57 = j38 * j42;
        long j58 = j38 * j24;
        long j59 = j15 * j46;
        long j60 = (long) i23;
        long j61 = j38 * j60;
        long j62 = j38 * j54;
        long j63 = j38 * j46;
        long j64 = j19 * j19;
        long j65 = j48 * j54;
        long j66 = (long) i21;
        long j67 = j66 * j23;
        int i29 = i15 * 19;
        long j68 = j43;
        long j69 = (long) i29;
        long j70 = j66 * j69;
        long j71 = j19 * j60;
        long j72 = j66 * j54;
        long j73 = j19 * j46;
        long j74 = ((long) i22) * j23;
        long j75 = j42 * j69;
        long j76 = j42 * j60;
        long j77 = j42 * j54;
        long j78 = j24 * j60;
        long j79 = j69 * j24;
        long j80 = ((long) (i15 * 2)) * j54;
        long j81 = j60 * j28;
        long j82 = j68 * j54;
        long j83 = j54 * j45;
        long j84 = j11 + (j32 * j46) + j65 + j61 + j70 + j74;
        long j85 = j20 + j36 + j47 + (j42 * j46) + j80 + j81;
        long j86 = (j84 + 33554432) >> 26;
        long j87 = j14 + j59 + j62 + j71 + j75 + j86;
        long j88 = j84 - (j86 << 26);
        long j89 = (j85 + 33554432) >> 26;
        long j90 = j22 + j37 + j53 + (j24 * j46) + j82 + j89;
        long j91 = (j87 + 16777216) >> 25;
        long j92 = (j12 * j15) + (j13 * j32) + j63 + j72 + j76 + j79 + j91;
        long j93 = j87 - (j91 << 25);
        long j94 = (j90 + 16777216) >> 25;
        long j95 = j25 + j40 + j49 + j55 + (j68 * j46) + j83 + j94;
        long j96 = j90 - (j94 << 25);
        long j97 = (j92 + 33554432) >> 26;
        long j98 = j17 + j33 + j73 + j77 + j78 + j97;
        long j99 = j92 - (j97 << 26);
        long j100 = (j95 + 33554432) >> 26;
        long j101 = j27 + j41 + j50 + j56 + (j45 * j46) + j100;
        long j102 = (j98 + 16777216) >> 25;
        long j103 = (j85 - (j89 << 26)) + j102;
        long j104 = (j101 + 16777216) >> 25;
        long j105 = (j12 * j29) + (j32 * j43) + j51 + j57 + j64 + (j46 * j34) + j104;
        long j106 = j101 - (j104 << 25);
        long j107 = (j103 + 33554432) >> 26;
        long j108 = j96 + j107;
        long j109 = j106;
        long j110 = j103 - (j107 << 26);
        long j111 = (j105 + 33554432) >> 26;
        long j112 = j31 + j44 + j52 + j58 + j67 + j111;
        long j113 = j105 - (j111 << 26);
        long j114 = (j112 + 16777216) >> 25;
        long j115 = (19 * j114) + j88;
        long j116 = (j115 + 33554432) >> 26;
        long j117 = j112 - (j114 << 25);
        return new a(this.f4482a, new int[]{(int) (j115 - (j116 << 26)), (int) (j93 + j116), (int) j99, (int) (j98 - (j102 << 25)), (int) j110, (int) j108, (int) (j95 - (j100 << 26)), (int) j109, (int) j113, (int) j117});
    }

    public final d g(d dVar) {
        int[] iArr = ((a) dVar).f4831b;
        int[] iArr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            iArr2[i] = this.f4831b[i] - iArr[i];
        }
        return new a(this.f4482a, iArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4831b);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("[Ed25519FieldElement val=");
        byte[] h10 = h();
        StringBuilder sb2 = new StringBuilder(64);
        for (int i = 0; i < 32; i++) {
            byte b10 = h10[i];
            sb2.append(Character.forDigit((b10 & 240) >> 4, 16));
            sb2.append(Character.forDigit(b10 & 15, 16));
        }
        d10.append(sb2.toString());
        d10.append("]");
        return d10.toString();
    }
}
