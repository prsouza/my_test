package df;

import df.e;
import java.io.Serializable;

public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final c f4465a;

    /* renamed from: b  reason: collision with root package name */
    public final ef.a f4466b;

    /* renamed from: c  reason: collision with root package name */
    public final ef.a f4467c;

    /* renamed from: s  reason: collision with root package name */
    public final d f4468s;

    /* renamed from: t  reason: collision with root package name */
    public final e f4469t;

    /* renamed from: u  reason: collision with root package name */
    public final e f4470u;

    /* renamed from: v  reason: collision with root package name */
    public final e f4471v;

    /* renamed from: w  reason: collision with root package name */
    public final e f4472w;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4473a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                df.e$b[] r0 = df.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4473a = r0
                df.e$b r1 = df.e.b.P2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4473a     // Catch:{ NoSuchFieldError -> 0x001d }
                df.e$b r1 = df.e.b.P3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4473a     // Catch:{ NoSuchFieldError -> 0x0028 }
                df.e$b r1 = df.e.b.P3PrecomputedDouble     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4473a     // Catch:{ NoSuchFieldError -> 0x0033 }
                df.e$b r1 = df.e.b.PRECOMP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: df.b.a.<clinit>():void");
        }
    }

    public b(c cVar, byte[] bArr, d dVar) {
        this.f4465a = cVar;
        d a10 = cVar.a(bArr);
        this.f4466b = (ef.a) a10;
        this.f4467c = (ef.a) a10.a(a10);
        this.f4468s = dVar;
        ef.a aVar = cVar.f4474a;
        ef.a aVar2 = cVar.f4475b;
        this.f4469t = e.g(this, aVar, aVar2, aVar2);
        ef.a aVar3 = aVar;
        ef.a aVar4 = aVar2;
        ef.a aVar5 = aVar2;
        ef.a aVar6 = aVar;
        this.f4470u = e.h(this, aVar3, aVar4, aVar5, aVar6, false);
        this.f4471v = e.h(this, aVar3, aVar4, aVar5, aVar6, true);
        this.f4472w = e.i(this, aVar2, aVar2, aVar);
    }

    public final e a(e.b bVar) {
        int i = a.f4473a[bVar.ordinal()];
        if (i == 1) {
            return this.f4469t;
        }
        if (i == 2) {
            return this.f4470u;
        }
        if (i == 3) {
            return this.f4471v;
        }
        if (i != 4) {
            return null;
        }
        return this.f4472w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f4465a.equals(bVar.f4465a) || !this.f4466b.equals(bVar.f4466b) || !this.f4468s.equals(bVar.f4468s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f4465a.hashCode() ^ this.f4466b.hashCode()) ^ this.f4468s.hashCode();
    }
}
