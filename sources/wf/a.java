package wf;

import java.io.Serializable;
import java.util.Comparator;

public final class a<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f12663a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f12664b;

    /* renamed from: c  reason: collision with root package name */
    public final T f12665c;

    /* renamed from: s  reason: collision with root package name */
    public final T f12666s;

    /* renamed from: t  reason: collision with root package name */
    public transient String f12667t;

    /* renamed from: wf.a$a  reason: collision with other inner class name */
    public enum C0246a implements Comparator {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + obj + ", element2=" + obj2);
        }
        C0246a aVar = C0246a.INSTANCE;
        this.f12663a = aVar;
        if (aVar.compare(obj, obj2) < 1) {
            this.f12666s = obj;
            this.f12665c = obj2;
            return;
        }
        this.f12666s = obj2;
        this.f12665c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f12666s.equals(aVar.f12666s) || !this.f12665c.equals(aVar.f12665c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f12664b;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f12666s.hashCode();
        int hashCode2 = this.f12665c.hashCode() + ((hashCode + ((a.class.hashCode() + 629) * 37)) * 37);
        this.f12664b = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        if (this.f12667t == null) {
            StringBuilder d10 = a.a.d("[");
            d10.append(this.f12666s);
            d10.append("..");
            d10.append(this.f12665c);
            d10.append("]");
            this.f12667t = d10.toString();
        }
        return this.f12667t;
    }
}
