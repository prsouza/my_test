package qa;

import e6.e;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f10331a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10332b;

    /* renamed from: c  reason: collision with root package name */
    public final List<d> f10333c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10334d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10335e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f10336f;
    public boolean g;

    public d(String str, String str2, List list, int i, Integer num, boolean z) {
        this.f10331a = str;
        this.f10332b = str2;
        this.f10333c = list;
        this.f10334d = i;
        this.f10335e = false;
        this.f10336f = num;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e.r(this.f10331a, dVar.f10331a) && e.r(this.f10332b, dVar.f10332b) && e.r(this.f10333c, dVar.f10333c) && this.f10334d == dVar.f10334d && this.f10335e == dVar.f10335e && e.r(this.f10336f, dVar.f10336f) && this.g == dVar.g;
    }

    public final int hashCode() {
        int hashCode = this.f10331a.hashCode() * 31;
        String str = this.f10332b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<d> list = this.f10333c;
        int hashCode3 = (((hashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f10334d) * 31;
        boolean z = this.f10335e;
        boolean z10 = true;
        if (z) {
            z = true;
        }
        int i10 = (hashCode3 + (z ? 1 : 0)) * 31;
        Integer num = this.f10336f;
        if (num != null) {
            i = num.hashCode();
        }
        int i11 = (i10 + i) * 31;
        boolean z11 = this.g;
        if (!z11) {
            z10 = z11;
        }
        return i11 + (z10 ? 1 : 0);
    }

    public final String toString() {
        String str = this.f10331a;
        String str2 = this.f10332b;
        List<d> list = this.f10333c;
        int i = this.f10334d;
        boolean z = this.f10335e;
        Integer num = this.f10336f;
        boolean z10 = this.g;
        return "Option(label=" + str + ", description=" + str2 + ", childOptions=" + list + ", viewType=" + i + ", isExpanded=" + z + ", icon=" + num + ", divider=" + z10 + ")";
    }

    public d(String str, String str2, List list, int i) {
        this(str, str2, list, i, (Integer) null, false);
    }
}
