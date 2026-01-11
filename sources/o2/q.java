package o2;

import java.util.Arrays;

public final class q<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f9292a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f9293b;

    public q(V v10) {
        this.f9292a = v10;
        this.f9293b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        V v10 = this.f9292a;
        if (v10 != null && v10.equals(qVar.f9292a)) {
            return true;
        }
        Throwable th2 = this.f9293b;
        if (th2 == null || qVar.f9293b == null) {
            return false;
        }
        return th2.toString().equals(this.f9293b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9292a, this.f9293b});
    }

    public q(Throwable th2) {
        this.f9293b = th2;
        this.f9292a = null;
    }
}
