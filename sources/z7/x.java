package z7;

import a.a;
import java.util.Objects;
import u7.d;
import z7.c0;

public final class x extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f14156a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14157b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14158c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14159d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14160e;

    /* renamed from: f  reason: collision with root package name */
    public final d f14161f;

    public x(String str, String str2, String str3, String str4, int i, d dVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f14156a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f14157b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f14158c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f14159d = str4;
        this.f14160e = i;
        Objects.requireNonNull(dVar, "Null developmentPlatformProvider");
        this.f14161f = dVar;
    }

    public final String a() {
        return this.f14156a;
    }

    public final int b() {
        return this.f14160e;
    }

    public final d c() {
        return this.f14161f;
    }

    public final String d() {
        return this.f14159d;
    }

    public final String e() {
        return this.f14157b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        if (!this.f14156a.equals(aVar.a()) || !this.f14157b.equals(aVar.e()) || !this.f14158c.equals(aVar.f()) || !this.f14159d.equals(aVar.d()) || this.f14160e != aVar.b() || !this.f14161f.equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public final String f() {
        return this.f14158c;
    }

    public final int hashCode() {
        return ((((((((((this.f14156a.hashCode() ^ 1000003) * 1000003) ^ this.f14157b.hashCode()) * 1000003) ^ this.f14158c.hashCode()) * 1000003) ^ this.f14159d.hashCode()) * 1000003) ^ this.f14160e) * 1000003) ^ this.f14161f.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("AppData{appIdentifier=");
        d10.append(this.f14156a);
        d10.append(", versionCode=");
        d10.append(this.f14157b);
        d10.append(", versionName=");
        d10.append(this.f14158c);
        d10.append(", installUuid=");
        d10.append(this.f14159d);
        d10.append(", deliveryMechanism=");
        d10.append(this.f14160e);
        d10.append(", developmentPlatformProvider=");
        d10.append(this.f14161f);
        d10.append("}");
        return d10.toString();
    }
}
