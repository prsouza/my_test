package ub;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11916a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11917b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11918c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11919d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11920e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11921f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11922h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11923j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11924k;

    public a() {
        this(false, false, false, false, false, false, false, false, false, false, false);
    }

    public static a a(a aVar, boolean z, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10) {
        a aVar2 = aVar;
        int i11 = i10;
        boolean z15 = false;
        boolean z16 = (i11 & 1) != 0 ? aVar2.f11916a : false;
        boolean z17 = (i11 & 2) != 0 ? aVar2.f11917b : z;
        boolean z18 = (i11 & 4) != 0 ? aVar2.f11918c : false;
        boolean z19 = (i11 & 8) != 0 ? aVar2.f11919d : z10;
        boolean z20 = (i11 & 16) != 0 ? aVar2.f11920e : false;
        boolean z21 = (i11 & 32) != 0 ? aVar2.f11921f : z11;
        boolean z22 = (i11 & 64) != 0 ? aVar2.g : false;
        boolean z23 = (i11 & 128) != 0 ? aVar2.f11922h : z12;
        if ((i11 & 256) != 0) {
            z15 = aVar2.i;
        }
        return new a(z16, z17, z18, z19, z20, z21, z22, z23, z15, (i11 & 512) != 0 ? aVar2.f11923j : z13, (i11 & 1024) != 0 ? aVar2.f11924k : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11916a == aVar.f11916a && this.f11917b == aVar.f11917b && this.f11918c == aVar.f11918c && this.f11919d == aVar.f11919d && this.f11920e == aVar.f11920e && this.f11921f == aVar.f11921f && this.g == aVar.g && this.f11922h == aVar.f11922h && this.i == aVar.i && this.f11923j == aVar.f11923j && this.f11924k == aVar.f11924k;
    }

    public final int hashCode() {
        boolean z = this.f11916a;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i10 = (z ? 1 : 0) * true;
        boolean z11 = this.f11917b;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f11918c;
        if (z12) {
            z12 = true;
        }
        int i12 = (i11 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f11919d;
        if (z13) {
            z13 = true;
        }
        int i13 = (i12 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f11920e;
        if (z14) {
            z14 = true;
        }
        int i14 = (i13 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.f11921f;
        if (z15) {
            z15 = true;
        }
        int i15 = (i14 + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.g;
        if (z16) {
            z16 = true;
        }
        int i16 = (i15 + (z16 ? 1 : 0)) * 31;
        boolean z17 = this.f11922h;
        if (z17) {
            z17 = true;
        }
        int i17 = (i16 + (z17 ? 1 : 0)) * 31;
        boolean z18 = this.i;
        if (z18) {
            z18 = true;
        }
        int i18 = (i17 + (z18 ? 1 : 0)) * 31;
        boolean z19 = this.f11923j;
        if (z19) {
            z19 = true;
        }
        int i19 = (i18 + (z19 ? 1 : 0)) * 31;
        boolean z20 = this.f11924k;
        if (!z20) {
            z10 = z20;
        }
        return i19 + (z10 ? 1 : 0);
    }

    public final String toString() {
        boolean z = this.f11916a;
        boolean z10 = this.f11917b;
        boolean z11 = this.f11918c;
        boolean z12 = this.f11919d;
        boolean z13 = this.f11920e;
        boolean z14 = this.f11921f;
        boolean z15 = this.g;
        boolean z16 = this.f11922h;
        boolean z17 = this.i;
        boolean z18 = this.f11923j;
        boolean z19 = this.f11924k;
        return "AppMetadata(bleFirstEnabled=" + z + ", bleEnabled=" + z10 + ", blePermissionFirstGranted=" + z11 + ", blePermissionGranted=" + z12 + ", locFirstEnabled=" + z13 + ", locEnabled=" + z14 + ", locPermissionFirstGranted=" + z15 + ", locPermissionGranted=" + z16 + ", onboardComplete=" + z17 + ", onboardStarted=" + z18 + ", walletSetupDone=" + z19 + ")";
    }

    public a(boolean z, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.f11916a = z;
        this.f11917b = z10;
        this.f11918c = z11;
        this.f11919d = z12;
        this.f11920e = z13;
        this.f11921f = z14;
        this.g = z15;
        this.f11922h = z16;
        this.i = z17;
        this.f11923j = z18;
        this.f11924k = z19;
    }
}
