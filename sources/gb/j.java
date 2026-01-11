package gb;

import c3.k;
import e6.e;
import java.math.BigDecimal;
import java.util.Objects;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final BigDecimal f5340a;

    /* renamed from: b  reason: collision with root package name */
    public final BigDecimal f5341b;

    /* renamed from: c  reason: collision with root package name */
    public final BigDecimal f5342c;

    /* renamed from: d  reason: collision with root package name */
    public final BigDecimal f5343d;

    /* renamed from: e  reason: collision with root package name */
    public final BigDecimal f5344e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5345f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5346h;

    public j() {
        this((BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 0, false, false, 255, (k) null);
    }

    public j(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, boolean z, boolean z10) {
        e.D(bigDecimal, "currentMarketPrice");
        e.D(bigDecimal2, "adjustedNodlBalance");
        e.D(bigDecimal3, "adjustedDollarBalance");
        e.D(bigDecimal4, "adjustedMarketPrice");
        e.D(bigDecimal5, "seekMin");
        this.f5340a = bigDecimal;
        this.f5341b = bigDecimal2;
        this.f5342c = bigDecimal3;
        this.f5343d = bigDecimal4;
        this.f5344e = bigDecimal5;
        this.f5345f = i;
        this.g = z;
        this.f5346h = z10;
    }

    public static j a(j jVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, int i, boolean z, boolean z10, int i10) {
        j jVar2 = jVar;
        int i11 = i10;
        BigDecimal bigDecimal6 = (i11 & 1) != 0 ? jVar2.f5340a : bigDecimal;
        BigDecimal bigDecimal7 = (i11 & 2) != 0 ? jVar2.f5341b : bigDecimal2;
        BigDecimal bigDecimal8 = (i11 & 4) != 0 ? jVar2.f5342c : bigDecimal3;
        BigDecimal bigDecimal9 = (i11 & 8) != 0 ? jVar2.f5343d : bigDecimal4;
        BigDecimal bigDecimal10 = (i11 & 16) != 0 ? jVar2.f5344e : bigDecimal5;
        int i12 = (i11 & 32) != 0 ? jVar2.f5345f : i;
        boolean z11 = (i11 & 64) != 0 ? jVar2.g : z;
        boolean z12 = (i11 & 128) != 0 ? jVar2.f5346h : z10;
        Objects.requireNonNull(jVar);
        e.D(bigDecimal6, "currentMarketPrice");
        e.D(bigDecimal7, "adjustedNodlBalance");
        e.D(bigDecimal8, "adjustedDollarBalance");
        e.D(bigDecimal9, "adjustedMarketPrice");
        e.D(bigDecimal10, "seekMin");
        return new j(bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, bigDecimal10, i12, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return e.r(this.f5340a, jVar.f5340a) && e.r(this.f5341b, jVar.f5341b) && e.r(this.f5342c, jVar.f5342c) && e.r(this.f5343d, jVar.f5343d) && e.r(this.f5344e, jVar.f5344e) && this.f5345f == jVar.f5345f && this.g == jVar.g && this.f5346h == jVar.f5346h;
    }

    public final int hashCode() {
        int hashCode = this.f5341b.hashCode();
        int hashCode2 = this.f5342c.hashCode();
        int hashCode3 = (((this.f5344e.hashCode() + ((this.f5343d.hashCode() + ((hashCode2 + ((hashCode + (this.f5340a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f5345f) * 31;
        boolean z = this.g;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z11 = this.f5346h;
        if (!z11) {
            z10 = z11;
        }
        return i + (z10 ? 1 : 0);
    }

    public final String toString() {
        BigDecimal bigDecimal = this.f5340a;
        BigDecimal bigDecimal2 = this.f5341b;
        BigDecimal bigDecimal3 = this.f5342c;
        BigDecimal bigDecimal4 = this.f5343d;
        BigDecimal bigDecimal5 = this.f5344e;
        int i = this.f5345f;
        boolean z = this.g;
        boolean z10 = this.f5346h;
        return "SimulatorUiState(currentMarketPrice=" + bigDecimal + ", adjustedNodlBalance=" + bigDecimal2 + ", adjustedDollarBalance=" + bigDecimal3 + ", adjustedMarketPrice=" + bigDecimal4 + ", seekMin=" + bigDecimal5 + ", seekMax=" + i + ", showReset=" + z + ", autoReset=" + z10 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(java.math.BigDecimal r1, java.math.BigDecimal r2, java.math.BigDecimal r3, java.math.BigDecimal r4, java.math.BigDecimal r5, int r6, boolean r7, boolean r8, int r9, c3.k r10) {
        /*
            r0 = this;
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            java.lang.String r1 = "ZERO"
            e6.e.C(r2, r1)
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            e6.e.C(r3, r1)
            java.math.BigDecimal r4 = java.math.BigDecimal.ZERO
            e6.e.C(r4, r1)
            java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
            e6.e.C(r5, r1)
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            e6.e.C(r6, r1)
            r7 = 100
            r8 = 0
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.j.<init>(java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, int, boolean, boolean, int, c3.k):void");
    }
}
