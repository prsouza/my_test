package dc;

import e6.e;
import jc.c;
import tg.d;
import xd.l;
import yd.h;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f4442a = new f();

    public enum a {
        SUBSTRATE(C0064a.f4443b),
        ETHEREUM(b.f4444b);
        
        private final l<byte[], byte[]> hasher;

        /* renamed from: dc.f$a$a  reason: collision with other inner class name */
        public static final class C0064a extends h implements l<byte[], byte[]> {

            /* renamed from: b  reason: collision with root package name */
            public static final C0064a f4443b = null;

            static {
                f4443b = new C0064a();
            }

            public C0064a() {
                super(1);
            }

            public final Object k(Object obj) {
                byte[] bArr = (byte[]) obj;
                e.D(bArr, "it");
                byte[] a10 = c.f7149h.a(bArr);
                e.C(a10, "it.blake2b256()");
                return a10;
            }
        }

        public static final class b extends h implements l<byte[], byte[]> {

            /* renamed from: b  reason: collision with root package name */
            public static final b f4444b = null;

            static {
                f4444b = new b();
            }

            public b() {
                super(1);
            }

            public final Object k(Object obj) {
                byte[] bArr = (byte[]) obj;
                e.D(bArr, "it");
                c cVar = c.f7149h;
                byte[] digest = new d().digest(bArr);
                e.C(digest, "digest.digest(this)");
                return digest;
            }
        }

        private a(l<? super byte[], byte[]> lVar) {
            this.hasher = lVar;
        }

        public final l<byte[], byte[]> getHasher() {
            return this.hasher;
        }
    }

    static {
        d dVar = d.f4432c;
        ((Number) d.f4430a.a()).intValue();
        ((Number) d.f4431b.a()).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03db A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x03dd A[LOOP:3: B:36:0x01fd->B:90:0x03dd, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final dc.e a(byte[] r25, fc.a r26, xd.l<? super byte[], byte[]> r27) {
        /*
            r24 = this;
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r1 = r26.b()
            java.lang.String r1 = yh.c.c(r1)
            r2 = 16
            r0.<init>(r1, r2)
            xg.f r1 = ai.a.a(r0)
            r2 = 0
            byte[] r1 = r1.f(r2)
            java.math.BigInteger r3 = new java.math.BigInteger
            int r4 = r1.length
            r5 = 1
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r5, r4)
            r3.<init>(r5, r1)
            r1 = r25
            r4 = r27
            java.lang.Object r1 = r4.k(r1)
            byte[] r1 = (byte[]) r1
            e8.b r4 = new e8.b
            rg.c r6 = new rg.c
            mg.g r7 = new mg.g
            r7.<init>()
            r6.<init>(r7)
            r4.<init>(r6)
            qg.c r7 = new qg.c
            qg.a r8 = ai.a.f652a
            r7.<init>(r0, r8)
            boolean r0 = r7 instanceof qg.g
            r8 = 0
            if (r0 == 0) goto L_0x004d
            qg.g r7 = (qg.g) r7
            r4.g = r8
            goto L_0x004f
        L_0x004d:
            r4.g = r7
        L_0x004f:
            r4.f4756h = r8
            java.lang.Object r0 = r4.g
            qg.b r0 = (qg.b) r0
            qg.a r0 = r0.F
            java.math.BigInteger r7 = r0.f10448h
            int r9 = r7.bitLength()
            int r10 = r1.length
            r11 = 8
            int r10 = r10 * r11
            java.math.BigInteger r12 = new java.math.BigInteger
            r12.<init>(r5, r1)
            if (r9 >= r10) goto L_0x006d
            int r10 = r10 - r9
            java.math.BigInteger r12 = r12.shiftRight(r10)
        L_0x006d:
            java.lang.Object r9 = r4.g
            qg.b r9 = (qg.b) r9
            qg.c r9 = (qg.c) r9
            java.math.BigInteger r9 = r9.G
            r6.f10797d = r7
            byte[] r10 = r6.f10796c
            java.util.Arrays.fill(r10, r5)
            byte[] r10 = r6.f10795b
            java.util.Arrays.fill(r10, r2)
            java.math.BigInteger r10 = xh.b.f13290a
            int r10 = r7.bitLength()
            int r10 = r10 + 7
            int r10 = r10 / r11
            byte[] r13 = new byte[r10]
            byte[] r14 = r9.toByteArray()
            byte r15 = r14[r2]
            if (r15 != 0) goto L_0x009c
            int r15 = r14.length
            int r15 = r15 - r5
            byte[] r8 = new byte[r15]
            java.lang.System.arraycopy(r14, r5, r8, r2, r15)
            r14 = r8
        L_0x009c:
            int r8 = r14.length
            int r8 = r10 - r8
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r2, r13, r8, r15)
            byte[] r8 = new byte[r10]
            java.math.BigInteger r14 = r6.a(r1)
            int r15 = r14.compareTo(r7)
            if (r15 < 0) goto L_0x00b3
            java.math.BigInteger r14 = r14.subtract(r7)
        L_0x00b3:
            byte[] r14 = r14.toByteArray()
            byte r15 = r14[r2]
            if (r15 != 0) goto L_0x00c3
            int r15 = r14.length
            int r15 = r15 - r5
            byte[] r11 = new byte[r15]
            java.lang.System.arraycopy(r14, r5, r11, r2, r15)
            r14 = r11
        L_0x00c3:
            int r11 = r14.length
            int r11 = r10 - r11
            int r15 = r14.length
            java.lang.System.arraycopy(r14, r2, r8, r11, r15)
            pg.a r11 = r6.f10794a
            qg.f r14 = new qg.f
            byte[] r15 = r6.f10795b
            r14.<init>(r15)
            r11.b(r14)
            pg.a r11 = r6.f10794a
            byte[] r14 = r6.f10796c
            int r15 = r14.length
            r11.d(r14, r15)
            pg.a r11 = r6.f10794a
            r11.c(r2)
            pg.a r11 = r6.f10794a
            r11.d(r13, r10)
            pg.a r11 = r6.f10794a
            r11.d(r8, r10)
            pg.a r11 = r6.f10794a
            byte[] r14 = r6.f10795b
            r11.a(r14)
            pg.a r11 = r6.f10794a
            qg.f r14 = new qg.f
            byte[] r15 = r6.f10795b
            r14.<init>(r15)
            r11.b(r14)
            pg.a r11 = r6.f10794a
            byte[] r14 = r6.f10796c
            int r15 = r14.length
            r11.d(r14, r15)
            pg.a r11 = r6.f10794a
            byte[] r14 = r6.f10796c
            r11.a(r14)
            pg.a r11 = r6.f10794a
            byte[] r14 = r6.f10796c
            int r15 = r14.length
            r11.d(r14, r15)
            pg.a r11 = r6.f10794a
            r11.c(r5)
            pg.a r11 = r6.f10794a
            r11.d(r13, r10)
            pg.a r11 = r6.f10794a
            r11.d(r8, r10)
            pg.a r8 = r6.f10794a
            byte[] r10 = r6.f10795b
            r8.a(r10)
            pg.a r8 = r6.f10794a
            qg.f r10 = new qg.f
            byte[] r11 = r6.f10795b
            r10.<init>(r11)
            r8.b(r10)
            pg.a r8 = r6.f10794a
            byte[] r10 = r6.f10796c
            int r11 = r10.length
            r8.d(r10, r11)
            pg.a r8 = r6.f10794a
            byte[] r6 = r6.f10796c
            r8.a(r6)
            xg.g r6 = new xg.g
            r6.<init>()
        L_0x014d:
            java.lang.Object r8 = r4.f4755f
            rg.a r8 = (rg.a) r8
            rg.c r8 = (rg.c) r8
            java.math.BigInteger r10 = r8.f10797d
            java.math.BigInteger r11 = xh.b.f13290a
            int r10 = r10.bitLength()
            int r10 = r10 + 7
            r11 = 8
            int r10 = r10 / r11
            byte[] r11 = new byte[r10]
        L_0x0162:
            r13 = r2
        L_0x0163:
            if (r13 >= r10) goto L_0x0185
            pg.a r14 = r8.f10794a
            byte[] r15 = r8.f10796c
            int r5 = r15.length
            r14.d(r15, r5)
            pg.a r5 = r8.f10794a
            byte[] r14 = r8.f10796c
            r5.a(r14)
            int r5 = r10 - r13
            byte[] r14 = r8.f10796c
            int r14 = r14.length
            int r5 = java.lang.Math.min(r5, r14)
            byte[] r14 = r8.f10796c
            java.lang.System.arraycopy(r14, r2, r11, r13, r5)
            int r13 = r13 + r5
            r5 = 1
            goto L_0x0163
        L_0x0185:
            java.math.BigInteger r5 = r8.a(r11)
            java.math.BigInteger r13 = rg.c.f10793e
            int r13 = r5.compareTo(r13)
            if (r13 <= 0) goto L_0x041b
            java.math.BigInteger r13 = r8.f10797d
            int r13 = r5.compareTo(r13)
            if (r13 >= 0) goto L_0x041b
            xg.f r8 = r0.g
            xg.f r8 = r6.w1(r8, r5)
            xg.f r8 = r8.n()
            xg.e r8 = r8.c()
            java.math.BigInteger r8 = r8.q()
            java.math.BigInteger r8 = r8.mod(r7)
            java.math.BigInteger r10 = xg.b.f13228a
            boolean r11 = r8.equals(r10)
            if (r11 != 0) goto L_0x0410
            java.math.BigInteger r5 = r5.modInverse(r7)
            java.math.BigInteger r11 = r9.multiply(r8)
            java.math.BigInteger r11 = r12.add(r11)
            java.math.BigInteger r5 = r5.multiply(r11)
            java.math.BigInteger r5 = r5.mod(r7)
            boolean r10 = r5.equals(r10)
            if (r10 != 0) goto L_0x0410
            r0 = 2
            java.math.BigInteger[] r4 = new java.math.BigInteger[r0]
            r4[r2] = r8
            r6 = 1
            r4[r6] = r5
            b3.b r5 = new b3.b
            r7 = r4[r2]
            r4 = r4[r6]
            r5.<init>(r7, r4)
            java.math.BigInteger r6 = ai.a.f653b
            int r6 = r4.compareTo(r6)
            if (r6 > 0) goto L_0x01ec
            r6 = 1
            goto L_0x01ed
        L_0x01ec:
            r6 = r2
        L_0x01ed:
            if (r6 != 0) goto L_0x01fc
            b3.b r5 = new b3.b
            qg.a r6 = ai.a.f652a
            java.math.BigInteger r6 = r6.f10448h
            java.math.BigInteger r4 = r6.subtract(r4)
            r5.<init>(r7, r4)
        L_0x01fc:
            r4 = r2
        L_0x01fd:
            r6 = 4
            if (r4 >= r6) goto L_0x03e5
            if (r4 < 0) goto L_0x0204
            r8 = 1
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            java.lang.String r9 = "recId must be positive"
            c3.k.c1(r8, r9)
            java.lang.Object r8 = r5.f2856a
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            int r8 = r8.signum()
            if (r8 < 0) goto L_0x0216
            r8 = 1
            goto L_0x0217
        L_0x0216:
            r8 = r2
        L_0x0217:
            java.lang.String r9 = "r must be positive"
            c3.k.c1(r8, r9)
            java.lang.Object r8 = r5.f2857b
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            int r8 = r8.signum()
            if (r8 < 0) goto L_0x0228
            r8 = 1
            goto L_0x0229
        L_0x0228:
            r8 = r2
        L_0x0229:
            java.lang.String r9 = "s must be positive"
            c3.k.c1(r8, r9)
            qg.a r8 = ai.a.f652a
            java.math.BigInteger r9 = r8.f10448h
            long r10 = (long) r4
            r12 = 2
            long r10 = r10 / r12
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r10)
            java.lang.Object r11 = r5.f2856a
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            java.math.BigInteger r10 = r10.multiply(r9)
            java.math.BigInteger r10 = r11.add(r10)
            java.math.BigInteger r11 = ah.h0.f529j
            int r11 = r10.compareTo(r11)
            if (r11 < 0) goto L_0x024f
            goto L_0x0284
        L_0x024f:
            r11 = r4 & 1
            r12 = 1
            if (r11 != r12) goto L_0x0256
            r11 = r12
            goto L_0x0257
        L_0x0256:
            r11 = r2
        L_0x0257:
            c3.k r13 = new c3.k
            r13.<init>()
            xg.d r14 = r8.f10447f
            int r14 = r14.k()
            int r14 = r14 + 7
            r15 = 8
            int r14 = r14 / r15
            int r14 = r14 + r12
            byte[] r10 = r13.s0(r10, r14)
            if (r11 == 0) goto L_0x0270
            r11 = 3
            goto L_0x0271
        L_0x0270:
            r11 = r0
        L_0x0271:
            byte r11 = (byte) r11
            r10[r2] = r11
            xg.d r11 = r8.f10447f
            xg.f r10 = r11.g(r10)
            xg.f r11 = r10.l(r9)
            boolean r11 = r11.j()
            if (r11 != 0) goto L_0x028b
        L_0x0284:
            r20 = r1
            r0 = 0
            r11 = 8
            goto L_0x03d3
        L_0x028b:
            java.math.BigInteger r11 = new java.math.BigInteger
            r12 = 1
            r11.<init>(r12, r1)
            java.math.BigInteger r12 = java.math.BigInteger.ZERO
            java.math.BigInteger r11 = r12.subtract(r11)
            java.math.BigInteger r11 = r11.mod(r9)
            java.lang.Object r12 = r5.f2856a
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            java.math.BigInteger r12 = r12.modInverse(r9)
            java.lang.Object r13 = r5.f2857b
            java.math.BigInteger r13 = (java.math.BigInteger) r13
            java.math.BigInteger r13 = r12.multiply(r13)
            java.math.BigInteger r13 = r13.mod(r9)
            java.math.BigInteger r11 = r12.multiply(r11)
            java.math.BigInteger r9 = r11.mod(r9)
            xg.f r8 = r8.g
            xg.d r11 = r8.f13245a
            xg.f r10 = xg.a.e(r11, r10)
            boolean r12 = r11 instanceof xg.d.a
            if (r12 == 0) goto L_0x02de
            r12 = r11
            xg.d$a r12 = (xg.d.a) r12
            boolean r12 = r12.r()
            if (r12 == 0) goto L_0x02de
            xg.f r6 = r8.l(r9)
            xg.f r8 = r10.l(r13)
            xg.f r6 = r6.a(r8)
            r20 = r1
            r11 = 8
            goto L_0x03c0
        L_0x02de:
            bh.c r11 = r11.g
            boolean r12 = r11 instanceof bh.c
            if (r12 == 0) goto L_0x03b8
            xg.f[] r12 = new xg.f[r0]
            r12[r2] = r8
            r8 = 1
            r12[r8] = r10
            java.math.BigInteger[] r10 = new java.math.BigInteger[r0]
            r10[r2] = r9
            r10[r8] = r13
            r8 = r12[r2]
            xg.d r8 = r8.f13245a
            java.math.BigInteger r8 = r8.f13240d
            java.math.BigInteger[] r9 = new java.math.BigInteger[r6]
            r13 = r2
            r14 = r13
        L_0x02fb:
            if (r13 >= r0) goto L_0x0318
            r15 = r10[r13]
            java.math.BigInteger r15 = r15.mod(r8)
            java.math.BigInteger[] r15 = r11.c(r15)
            int r17 = r14 + 1
            r18 = r15[r2]
            r9[r14] = r18
            int r14 = r17 + 1
            r16 = 1
            r15 = r15[r16]
            r9[r17] = r15
            int r13 = r13 + 1
            goto L_0x02fb
        L_0x0318:
            r11.b()
            boolean[] r8 = new boolean[r6]
            xg.q[] r10 = new xg.q[r6]
            byte[][] r6 = new byte[r6][]
            x3.b r13 = r11.a()
            r14 = r2
        L_0x0326:
            if (r14 >= r0) goto L_0x03af
            int r15 = r14 << 1
            int r17 = r15 + 1
            r18 = r9[r15]
            int r19 = r18.signum()
            if (r19 >= 0) goto L_0x0337
            r19 = 1
            goto L_0x0339
        L_0x0337:
            r19 = r2
        L_0x0339:
            r8[r15] = r19
            java.math.BigInteger r0 = r18.abs()
            r18 = r9[r17]
            int r19 = r18.signum()
            if (r19 >= 0) goto L_0x034a
            r19 = 1
            goto L_0x034c
        L_0x034a:
            r19 = r2
        L_0x034c:
            r8[r17] = r19
            java.math.BigInteger r7 = r18.abs()
            int r2 = r0.bitLength()
            r20 = r1
            int r1 = r7.bitLength()
            int r1 = java.lang.Math.max(r2, r1)
            int r1 = android.support.v4.media.b.x0(r1)
            r2 = r12[r14]
            xg.q r1 = android.support.v4.media.b.D1(r2, r1)
            xg.f r2 = android.support.v4.media.b.k1(r11, r2)
            r21 = r9
            xg.d r9 = r2.f13245a
            r22 = r11
            xg.t r11 = new xg.t
            r11.<init>(r1, r13)
            r23 = r12
            java.lang.String r12 = "bc_wnaf"
            xg.l r2 = r9.o(r2, r12, r11)
            xg.q r2 = (xg.q) r2
            int r9 = r1.f13276f
            r11 = 8
            int r9 = java.lang.Math.min(r11, r9)
            int r12 = r2.f13276f
            int r12 = java.lang.Math.min(r11, r12)
            r10[r15] = r1
            r10[r17] = r2
            byte[] r0 = android.support.v4.media.b.r0(r9, r0)
            r6[r15] = r0
            byte[] r0 = android.support.v4.media.b.r0(r12, r7)
            r6[r17] = r0
            int r14 = r14 + 1
            r1 = r20
            r9 = r21
            r11 = r22
            r12 = r23
            r0 = 2
            r2 = 0
            goto L_0x0326
        L_0x03af:
            r20 = r1
            r11 = 8
            xg.f r6 = xg.a.d(r8, r10, r6)
            goto L_0x03c0
        L_0x03b8:
            r20 = r1
            r11 = 8
            xg.f r6 = xg.a.b(r8, r9, r10, r13)
        L_0x03c0:
            xg.a.a(r6)
            r0 = 0
            byte[] r1 = r6.f(r0)
            java.math.BigInteger r0 = new java.math.BigInteger
            int r2 = r1.length
            r6 = 1
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r6, r2)
            r0.<init>(r6, r1)
        L_0x03d3:
            if (r0 == 0) goto L_0x03dd
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x03dd
            r0 = -1
            goto L_0x03e7
        L_0x03dd:
            int r4 = r4 + 1
            r1 = r20
            r0 = 2
            r2 = 0
            goto L_0x01fd
        L_0x03e5:
            r0 = -1
            r4 = -1
        L_0x03e7:
            if (r4 == r0) goto L_0x0408
            int r4 = r4 + 27
            r1 = 1
            byte[] r0 = new byte[r1]
            byte r1 = (byte) r4
            r2 = 0
            r0[r2] = r1
            java.lang.Object r1 = r5.f2856a
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            byte[] r1 = bi.a.a(r1)
            java.lang.Object r2 = r5.f2857b
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            byte[] r2 = bi.a.a(r2)
            dc.e$a r3 = new dc.e$a
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0408:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Could not construct a recoverable key. Are your credentials valid?"
            r0.<init>(r1)
            throw r0
        L_0x0410:
            r20 = r1
            r1 = 1
            r11 = 8
            r5 = r1
            r1 = r20
            r2 = 0
            goto L_0x014d
        L_0x041b:
            r20 = r1
            r1 = 1
            r2 = 8
            pg.a r5 = r8.f10794a
            byte[] r13 = r8.f10796c
            int r14 = r13.length
            r5.d(r13, r14)
            pg.a r5 = r8.f10794a
            r13 = 0
            r5.c(r13)
            pg.a r5 = r8.f10794a
            byte[] r14 = r8.f10795b
            r5.a(r14)
            pg.a r5 = r8.f10794a
            qg.f r14 = new qg.f
            byte[] r15 = r8.f10795b
            r14.<init>(r15)
            r5.b(r14)
            pg.a r5 = r8.f10794a
            byte[] r14 = r8.f10796c
            int r15 = r14.length
            r5.d(r14, r15)
            pg.a r5 = r8.f10794a
            byte[] r14 = r8.f10796c
            r5.a(r14)
            r5 = r1
            r2 = r13
            r1 = r20
            goto L_0x0162
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.f.a(byte[], fc.a, xd.l):dc.e");
    }
}
