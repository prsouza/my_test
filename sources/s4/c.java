package s4;

import a.a;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f10895a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10896b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10897c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10898d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10899e;

    /* renamed from: f  reason: collision with root package name */
    public final String f10900f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10901h;
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final String f10902j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10903k;

    /* renamed from: l  reason: collision with root package name */
    public final String f10904l;

    public c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f10895a = num;
        this.f10896b = str;
        this.f10897c = str2;
        this.f10898d = str3;
        this.f10899e = str4;
        this.f10900f = str5;
        this.g = str6;
        this.f10901h = str7;
        this.i = str8;
        this.f10902j = str9;
        this.f10903k = str10;
        this.f10904l = str11;
    }

    public final String a() {
        return this.f10904l;
    }

    public final String b() {
        return this.f10902j;
    }

    public final String c() {
        return this.f10898d;
    }

    public final String d() {
        return this.f10901h;
    }

    public final String e() {
        return this.f10897c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f10895a;
        if (num != null ? num.equals(aVar.l()) : aVar.l() == null) {
            String str = this.f10896b;
            if (str != null ? str.equals(aVar.i()) : aVar.i() == null) {
                String str2 = this.f10897c;
                if (str2 != null ? str2.equals(aVar.e()) : aVar.e() == null) {
                    String str3 = this.f10898d;
                    if (str3 != null ? str3.equals(aVar.c()) : aVar.c() == null) {
                        String str4 = this.f10899e;
                        if (str4 != null ? str4.equals(aVar.k()) : aVar.k() == null) {
                            String str5 = this.f10900f;
                            if (str5 != null ? str5.equals(aVar.j()) : aVar.j() == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(aVar.g()) : aVar.g() == null) {
                                    String str7 = this.f10901h;
                                    if (str7 != null ? str7.equals(aVar.d()) : aVar.d() == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(aVar.f()) : aVar.f() == null) {
                                            String str9 = this.f10902j;
                                            if (str9 != null ? str9.equals(aVar.b()) : aVar.b() == null) {
                                                String str10 = this.f10903k;
                                                if (str10 != null ? str10.equals(aVar.h()) : aVar.h() == null) {
                                                    String str11 = this.f10904l;
                                                    if (str11 == null) {
                                                        if (aVar.a() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.a())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return this.i;
    }

    public final String g() {
        return this.g;
    }

    public final String h() {
        return this.f10903k;
    }

    public final int hashCode() {
        Integer num = this.f10895a;
        int i10 = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f10896b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10897c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f10898d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f10899e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f10900f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f10901h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f10902j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f10903k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f10904l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return hashCode11 ^ i10;
    }

    public final String i() {
        return this.f10896b;
    }

    public final String j() {
        return this.f10900f;
    }

    public final String k() {
        return this.f10899e;
    }

    public final Integer l() {
        return this.f10895a;
    }

    public final String toString() {
        StringBuilder d10 = a.d("AndroidClientInfo{sdkVersion=");
        d10.append(this.f10895a);
        d10.append(", model=");
        d10.append(this.f10896b);
        d10.append(", hardware=");
        d10.append(this.f10897c);
        d10.append(", device=");
        d10.append(this.f10898d);
        d10.append(", product=");
        d10.append(this.f10899e);
        d10.append(", osBuild=");
        d10.append(this.f10900f);
        d10.append(", manufacturer=");
        d10.append(this.g);
        d10.append(", fingerprint=");
        d10.append(this.f10901h);
        d10.append(", locale=");
        d10.append(this.i);
        d10.append(", country=");
        d10.append(this.f10902j);
        d10.append(", mccMnc=");
        d10.append(this.f10903k);
        d10.append(", applicationBuild=");
        return android.support.v4.media.a.e(d10, this.f10904l, "}");
    }
}
