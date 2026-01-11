package u4;

import android.content.Context;
import c5.a;
import java.util.Objects;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11693a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11694b;

    /* renamed from: c  reason: collision with root package name */
    public final a f11695c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11696d;

    public c(Context context, a aVar, a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f11693a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f11694b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f11695c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f11696d = str;
    }

    public final Context a() {
        return this.f11693a;
    }

    public final String b() {
        return this.f11696d;
    }

    public final a c() {
        return this.f11695c;
    }

    public final a d() {
        return this.f11694b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f11693a.equals(hVar.a()) || !this.f11694b.equals(hVar.d()) || !this.f11695c.equals(hVar.c()) || !this.f11696d.equals(hVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.f11693a.hashCode() ^ 1000003) * 1000003) ^ this.f11694b.hashCode()) * 1000003) ^ this.f11695c.hashCode()) * 1000003) ^ this.f11696d.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("CreationContext{applicationContext=");
        d10.append(this.f11693a);
        d10.append(", wallClock=");
        d10.append(this.f11694b);
        d10.append(", monotonicClock=");
        d10.append(this.f11695c);
        d10.append(", backendName=");
        return android.support.v4.media.a.e(d10, this.f11696d, "}");
    }
}
