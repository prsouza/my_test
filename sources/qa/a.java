package qa;

import e6.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f10325a;

    /* renamed from: b  reason: collision with root package name */
    public String f10326b;

    /* renamed from: c  reason: collision with root package name */
    public String f10327c;

    public a(String str, String str2, String str3) {
        this.f10325a = str;
        this.f10326b = str2;
        this.f10327c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.r(this.f10325a, aVar.f10325a) && e.r(this.f10326b, aVar.f10326b) && e.r(this.f10327c, aVar.f10327c);
    }

    public final int hashCode() {
        int hashCode = this.f10325a.hashCode() * 31;
        String str = this.f10326b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10327c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f10325a;
        String str2 = this.f10326b;
        String str3 = this.f10327c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("InfoData(title=");
        sb2.append(str);
        sb2.append(", url=");
        sb2.append(str2);
        sb2.append(", infoText=");
        return android.support.v4.media.a.e(sb2, str3, ")");
    }
}
