package u1;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f11637a = new HashSet();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f11638a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11639b;

        public a(Uri uri, boolean z) {
            this.f11638a = uri;
            this.f11639b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11639b != aVar.f11639b || !this.f11638a.equals(aVar.f11638a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f11638a.hashCode() * 31) + (this.f11639b ? 1 : 0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<u1.d$a>] */
    public final int a() {
        return this.f11637a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f11637a.equals(((d) obj).f11637a);
    }

    public final int hashCode() {
        return this.f11637a.hashCode();
    }
}
