package xg;

import java.math.BigInteger;

public final class i {

    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f13256a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f13257b;

        public a(d dVar, f fVar) {
            this.f13256a = dVar;
            this.f13257b = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final xg.l a(xg.l r12) {
            /*
                r11 = this;
                boolean r0 = r12 instanceof xg.h
                r1 = 0
                if (r0 == 0) goto L_0x0008
                xg.h r12 = (xg.h) r12
                goto L_0x0009
            L_0x0008:
                r12 = r1
            L_0x0009:
                xg.d r0 = r11.f13256a
                int r0 = xg.i.a(r0)
                r2 = 250(0xfa, float:3.5E-43)
                if (r0 <= r2) goto L_0x0015
                r2 = 6
                goto L_0x0016
            L_0x0015:
                r2 = 5
            L_0x0016:
                r3 = 1
                int r4 = r3 << r2
                r5 = 0
                if (r12 == 0) goto L_0x002d
                android.support.v4.media.b r6 = r12.f13254b
                if (r6 == 0) goto L_0x0028
                int r6 = r6.v0()
                if (r6 < r4) goto L_0x0028
                r6 = r3
                goto L_0x0029
            L_0x0028:
                r6 = r5
            L_0x0029:
                if (r6 == 0) goto L_0x002d
                r6 = r3
                goto L_0x002e
            L_0x002d:
                r6 = r5
            L_0x002e:
                if (r6 == 0) goto L_0x0031
                return r12
            L_0x0031:
                int r0 = r0 + r2
                int r0 = r0 - r3
                int r0 = r0 / r2
                int r12 = r2 + 1
                xg.f[] r6 = new xg.f[r12]
                xg.f r7 = r11.f13257b
                r6[r5] = r7
                r7 = r3
            L_0x003d:
                if (r7 >= r2) goto L_0x004c
                int r8 = r7 + -1
                r8 = r6[r8]
                xg.f r8 = r8.v(r0)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x003d
            L_0x004c:
                r0 = r6[r5]
                r7 = r6[r3]
                xg.f r0 = r0.t(r7)
                r6[r2] = r0
                xg.d r0 = r11.f13256a
                java.util.Objects.requireNonNull(r0)
                r0.n(r6, r5, r12, r1)
                xg.f[] r12 = new xg.f[r4]
                r0 = r6[r5]
                r12[r5] = r0
                int r0 = r2 + -1
            L_0x0066:
                if (r0 < 0) goto L_0x0080
                r7 = r6[r0]
                int r8 = r3 << r0
                r9 = r8
            L_0x006d:
                if (r9 >= r4) goto L_0x007d
                int r10 = r9 - r8
                r10 = r12[r10]
                xg.f r10 = r10.a(r7)
                r12[r9] = r10
                int r10 = r8 << 1
                int r9 = r9 + r10
                goto L_0x006d
            L_0x007d:
                int r0 = r0 + -1
                goto L_0x0066
            L_0x0080:
                xg.d r0 = r11.f13256a
                java.util.Objects.requireNonNull(r0)
                r0.n(r12, r5, r4, r1)
                xg.h r0 = new xg.h
                r0.<init>()
                xg.d r1 = r11.f13256a
                android.support.v4.media.b r12 = r1.b(r12, r4)
                r0.f13254b = r12
                r12 = r6[r2]
                r0.f13253a = r12
                r0.f13255c = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: xg.i.a.a(xg.l):xg.l");
        }
    }

    public static int a(d dVar) {
        BigInteger bigInteger = dVar.f13240d;
        return bigInteger == null ? dVar.k() + 1 : bigInteger.bitLength();
    }

    public static h b(f fVar) {
        d dVar = fVar.f13245a;
        return (h) dVar.o(fVar, "bc_fixed_point", new a(dVar, fVar));
    }
}
