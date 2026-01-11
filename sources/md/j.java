package md;

import e6.e;

public final class j implements Comparable<j> {

    /* renamed from: a  reason: collision with root package name */
    public final byte f8550a;

    public /* synthetic */ j(byte b10) {
        this.f8550a = b10;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return e.F(this.f8550a & 255, ((j) obj).f8550a & 255);
    }

    public final boolean equals(Object obj) {
        byte b10 = this.f8550a;
        if ((obj instanceof j) && b10 == ((j) obj).f8550a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8550a;
    }

    public final String toString() {
        return String.valueOf(this.f8550a & 255);
    }
}
