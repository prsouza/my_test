package te;

import android.support.v4.media.b;
import c3.k;
import e6.e;
import ue.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11569a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11570b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11571c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11572d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11573e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11574f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11575h;
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11576j;

    /* renamed from: k  reason: collision with root package name */
    public final b f11577k;

    public c() {
        this(false, false, false, false, false, (String) null, false, false, (String) null, false, (b) null, 2047, (k) null);
    }

    public c(boolean z, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, b bVar, int i10, k kVar) {
        a aVar = ue.b.f11935a;
        e.D(aVar, "serializersModule");
        this.f11569a = false;
        this.f11570b = false;
        this.f11571c = false;
        this.f11572d = false;
        this.f11573e = false;
        this.f11574f = "    ";
        this.g = false;
        this.f11575h = false;
        this.i = "type";
        this.f11576j = false;
        this.f11577k = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11569a == cVar.f11569a && this.f11570b == cVar.f11570b && this.f11571c == cVar.f11571c && this.f11572d == cVar.f11572d && this.f11573e == cVar.f11573e && e.r(this.f11574f, cVar.f11574f) && this.g == cVar.g && this.f11575h == cVar.f11575h && e.r(this.i, cVar.i) && this.f11576j == cVar.f11576j && e.r(this.f11577k, cVar.f11577k);
    }

    public final int hashCode() {
        boolean z = this.f11569a;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i10 = (z ? 1 : 0) * true;
        boolean z11 = this.f11570b;
        if (z11) {
            z11 = true;
        }
        int i11 = (i10 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.f11571c;
        if (z12) {
            z12 = true;
        }
        int i12 = (i11 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.f11572d;
        if (z13) {
            z13 = true;
        }
        int i13 = (i12 + (z13 ? 1 : 0)) * 31;
        boolean z14 = this.f11573e;
        if (z14) {
            z14 = true;
        }
        int i14 = (i13 + (z14 ? 1 : 0)) * 31;
        String str = this.f11574f;
        int i15 = 0;
        int hashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z15 = this.g;
        if (z15) {
            z15 = true;
        }
        int i16 = (hashCode + (z15 ? 1 : 0)) * 31;
        boolean z16 = this.f11575h;
        if (z16) {
            z16 = true;
        }
        int i17 = (i16 + (z16 ? 1 : 0)) * 31;
        String str2 = this.i;
        int hashCode2 = (i17 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z17 = this.f11576j;
        if (!z17) {
            z10 = z17;
        }
        int i18 = (hashCode2 + (z10 ? 1 : 0)) * 31;
        b bVar = this.f11577k;
        if (bVar != null) {
            i15 = bVar.hashCode();
        }
        return i18 + i15;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("JsonConf(encodeDefaults=");
        d10.append(this.f11569a);
        d10.append(", ignoreUnknownKeys=");
        d10.append(this.f11570b);
        d10.append(", isLenient=");
        d10.append(this.f11571c);
        d10.append(", allowStructuredMapKeys=");
        d10.append(this.f11572d);
        d10.append(", prettyPrint=");
        d10.append(this.f11573e);
        d10.append(", prettyPrintIndent=");
        d10.append(this.f11574f);
        d10.append(", coerceInputValues=");
        d10.append(this.g);
        d10.append(", useArrayPolymorphism=");
        d10.append(this.f11575h);
        d10.append(", classDiscriminator=");
        d10.append(this.i);
        d10.append(", allowSpecialFloatingPointValues=");
        d10.append(this.f11576j);
        d10.append(", serializersModule=");
        d10.append(this.f11577k);
        d10.append(")");
        return d10.toString();
    }
}
