package a7;

import h7.a0;
import h7.i0;
import i7.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f141a;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f142a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f143b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                a7.f$b[] r0 = a7.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f143b = r0
                r1 = 1
                a7.f$b r2 = a7.f.b.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f143b     // Catch:{ NoSuchFieldError -> 0x001d }
                a7.f$b r3 = a7.f.b.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f143b     // Catch:{ NoSuchFieldError -> 0x0028 }
                a7.f$b r4 = a7.f.b.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f143b     // Catch:{ NoSuchFieldError -> 0x0033 }
                a7.f$b r5 = a7.f.b.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                h7.i0[] r4 = h7.i0.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f142a = r4
                h7.i0 r5 = h7.i0.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f142a     // Catch:{ NoSuchFieldError -> 0x004e }
                h7.i0 r4 = h7.i0.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f142a     // Catch:{ NoSuchFieldError -> 0x0058 }
                h7.i0 r1 = h7.i0.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f142a     // Catch:{ NoSuchFieldError -> 0x0062 }
                h7.i0 r1 = h7.i0.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a7.f.a.<clinit>():void");
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public f(a0 a0Var) {
        this.f141a = a0Var;
    }

    public static f a(String str, byte[] bArr, b bVar) {
        i0 i0Var;
        a0.b E = a0.E();
        E.m();
        a0.x((a0) E.f6389b, str);
        i e10 = i.e(bArr, 0, bArr.length);
        E.m();
        a0.y((a0) E.f6389b, e10);
        int i = a.f143b[bVar.ordinal()];
        if (i == 1) {
            i0Var = i0.TINK;
        } else if (i == 2) {
            i0Var = i0.LEGACY;
        } else if (i == 3) {
            i0Var = i0.RAW;
        } else if (i == 4) {
            i0Var = i0.CRUNCHY;
        } else {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        E.m();
        a0.z((a0) E.f6389b, i0Var);
        return new f((a0) E.k());
    }
}
