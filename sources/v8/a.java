package v8;

import v8.d;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12339b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12340c;

    /* renamed from: d  reason: collision with root package name */
    public final f f12341d;

    /* renamed from: e  reason: collision with root package name */
    public final d.a f12342e;

    public a(String str, String str2, String str3, f fVar, d.a aVar) {
        this.f12338a = str;
        this.f12339b = str2;
        this.f12340c = str3;
        this.f12341d = fVar;
        this.f12342e = aVar;
    }

    public final f a() {
        return this.f12341d;
    }

    public final String b() {
        return this.f12339b;
    }

    public final String c() {
        return this.f12340c;
    }

    public final d.a d() {
        return this.f12342e;
    }

    public final String e() {
        return this.f12338a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f12338a;
        if (str != null ? str.equals(dVar.e()) : dVar.e() == null) {
            String str2 = this.f12339b;
            if (str2 != null ? str2.equals(dVar.b()) : dVar.b() == null) {
                String str3 = this.f12340c;
                if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
                    f fVar = this.f12341d;
                    if (fVar != null ? fVar.equals(dVar.a()) : dVar.a() == null) {
                        d.a aVar = this.f12342e;
                        if (aVar == null) {
                            if (dVar.d() == null) {
                                return true;
                            }
                        } else if (aVar.equals(dVar.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12338a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12339b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12340c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f12341d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.a aVar = this.f12342e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("InstallationResponse{uri=");
        d10.append(this.f12338a);
        d10.append(", fid=");
        d10.append(this.f12339b);
        d10.append(", refreshToken=");
        d10.append(this.f12340c);
        d10.append(", authToken=");
        d10.append(this.f12341d);
        d10.append(", responseCode=");
        d10.append(this.f12342e);
        d10.append("}");
        return d10.toString();
    }
}
