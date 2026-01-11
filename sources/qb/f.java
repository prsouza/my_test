package qb;

public abstract class f {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final int f10356a;

        public a(int i) {
            this.f10356a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f10356a == ((a) obj).f10356a;
        }

        public final int hashCode() {
            return this.f10356a;
        }

        public final String toString() {
            return a8.a.b("OnTabSelected(index=", this.f10356a, ")");
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f10357a = new b();
    }
}
