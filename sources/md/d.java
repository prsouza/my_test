package md;

import e6.e;

public final class d implements Comparable<d> {

    /* renamed from: t  reason: collision with root package name */
    public static final d f8536t = new d();

    /* renamed from: a  reason: collision with root package name */
    public final int f8537a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f8538b = 6;

    /* renamed from: c  reason: collision with root package name */
    public final int f8539c = 21;

    /* renamed from: s  reason: collision with root package name */
    public final int f8540s = 67093;

    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        e.D(dVar, "other");
        return this.f8540s - dVar.f8540s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar == null) {
            return false;
        }
        if (this.f8540s == dVar.f8540s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8540s;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8537a);
        sb2.append('.');
        sb2.append(this.f8538b);
        sb2.append('.');
        sb2.append(this.f8539c);
        return sb2.toString();
    }
}
