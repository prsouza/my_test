package aj;

import a.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f680a;

    /* renamed from: b  reason: collision with root package name */
    public final long f681b = 0;

    public h(int i) {
        this.f680a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f680a == hVar.f680a && this.f681b == hVar.f681b;
    }

    public final int hashCode() {
        long j10 = this.f681b;
        return ((int) (j10 ^ (j10 >>> 32))) + (this.f680a * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("SdkMetric(metric_id=");
        q10.append(this.f680a);
        q10.append(", value=");
        q10.append(this.f681b);
        q10.append(')');
        return q10.toString();
    }
}
