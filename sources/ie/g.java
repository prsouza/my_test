package ie;

import e6.e;

public final class g<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f6434b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f6435a;

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f6436a;

        public a(Throwable th2) {
            this.f6436a = th2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && e.r(this.f6436a, ((a) obj).f6436a);
        }

        public final int hashCode() {
            Throwable th2 = this.f6436a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Closed(");
            d10.append(this.f6436a);
            d10.append(')');
            return d10.toString();
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ g(Object obj) {
        this.f6435a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f6435a;
        if ((obj instanceof g) && e.r(obj2, ((g) obj).f6435a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6435a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f6435a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
