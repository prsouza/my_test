package z7;

import a.a;
import z7.a0;

public final class h extends a0.e.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f14046a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14047b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14048c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.a.C0270a f14049d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f14050e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14051f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f14046a = str;
        this.f14047b = str2;
        this.f14048c = str3;
        this.f14050e = str4;
        this.f14051f = str5;
        this.g = str6;
    }

    public final String a() {
        return this.f14051f;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.f14048c;
    }

    public final String d() {
        return this.f14046a;
    }

    public final String e() {
        return this.f14050e;
    }

    public final boolean equals(Object obj) {
        String str;
        a0.e.a.C0270a aVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.a)) {
            return false;
        }
        a0.e.a aVar2 = (a0.e.a) obj;
        if (this.f14046a.equals(aVar2.d()) && this.f14047b.equals(aVar2.g()) && ((str = this.f14048c) != null ? str.equals(aVar2.c()) : aVar2.c() == null) && ((aVar = this.f14049d) != null ? aVar.equals(aVar2.f()) : aVar2.f() == null) && ((str2 = this.f14050e) != null ? str2.equals(aVar2.e()) : aVar2.e() == null) && ((str3 = this.f14051f) != null ? str3.equals(aVar2.a()) : aVar2.a() == null)) {
            String str4 = this.g;
            if (str4 == null) {
                if (aVar2.b() == null) {
                    return true;
                }
            } else if (str4.equals(aVar2.b())) {
                return true;
            }
        }
        return false;
    }

    public final a0.e.a.C0270a f() {
        return this.f14049d;
    }

    public final String g() {
        return this.f14047b;
    }

    public final int hashCode() {
        int hashCode = (((this.f14046a.hashCode() ^ 1000003) * 1000003) ^ this.f14047b.hashCode()) * 1000003;
        String str = this.f14048c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.C0270a aVar = this.f14049d;
        int hashCode3 = (hashCode2 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        String str2 = this.f14050e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14051f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.d("Application{identifier=");
        d10.append(this.f14046a);
        d10.append(", version=");
        d10.append(this.f14047b);
        d10.append(", displayVersion=");
        d10.append(this.f14048c);
        d10.append(", organization=");
        d10.append(this.f14049d);
        d10.append(", installationUuid=");
        d10.append(this.f14050e);
        d10.append(", developmentPlatform=");
        d10.append(this.f14051f);
        d10.append(", developmentPlatformVersion=");
        return android.support.v4.media.a.e(d10, this.g, "}");
    }
}
