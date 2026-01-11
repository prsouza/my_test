package ge;

import a.a;
import e6.e;
import md.m;
import xd.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5450a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, m> f5451b;

    public u(Object obj, l<? super Throwable, m> lVar) {
        this.f5450a = obj;
        this.f5451b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return e.r(this.f5450a, uVar.f5450a) && e.r(this.f5451b, uVar.f5451b);
    }

    public final int hashCode() {
        Object obj = this.f5450a;
        return this.f5451b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.d("CompletedWithCancellation(result=");
        d10.append(this.f5450a);
        d10.append(", onCancellation=");
        d10.append(this.f5451b);
        d10.append(')');
        return d10.toString();
    }
}
