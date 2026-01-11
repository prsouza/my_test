package s7;

import android.support.v4.media.a;
import b9.m;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f10966a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10967b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10968c;

    public n(Class<?> cls, int i, int i10) {
        this.f10966a = cls;
        this.f10967b = i;
        this.f10968c = i10;
    }

    public final boolean a() {
        return this.f10967b == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f10966a == nVar.f10966a && this.f10967b == nVar.f10967b && this.f10968c == nVar.f10968c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10966a.hashCode() ^ 1000003) * 1000003) ^ this.f10967b) * 1000003) ^ this.f10968c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f10966a);
        sb2.append(", type=");
        int i = this.f10967b;
        sb2.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i10 = this.f10968c;
        if (i10 == 0) {
            str = "direct";
        } else if (i10 == 1) {
            str = "provider";
        } else if (i10 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(m.b("Unsupported injection: ", i10));
        }
        return a.e(sb2, str, "}");
    }
}
