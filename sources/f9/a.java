package f9;

import e6.e;

public abstract class a {

    /* renamed from: f9.a$a  reason: collision with other inner class name */
    public static final class C0082a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final b f5019a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5020b;

        public C0082a(b bVar, String str) {
            this.f5019a = bVar;
            this.f5020b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0082a)) {
                return false;
            }
            C0082a aVar = (C0082a) obj;
            return e.r(this.f5019a, aVar.f5019a) && e.r(this.f5020b, aVar.f5020b);
        }

        public final int hashCode() {
            b bVar = this.f5019a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            String str = this.f5020b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Data(data=");
            d10.append(this.f5019a);
            d10.append(", version=");
            return android.support.v4.media.a.e(d10, this.f5020b, ")");
        }
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f5021a;

        public b(Throwable th2) {
            this.f5021a = th2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && e.r(this.f5021a, ((b) obj).f5021a);
            }
            return true;
        }

        public final int hashCode() {
            Throwable th2 = this.f5021a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Error(e=");
            d10.append(this.f5021a);
            d10.append(")");
            return d10.toString();
        }
    }

    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f5022a = new c();
    }
}
