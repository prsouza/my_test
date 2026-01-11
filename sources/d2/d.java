package d2;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public String f4276a;

    /* renamed from: b  reason: collision with root package name */
    public Long f4277b;

    public d() {
        this.f4276a = "reschedule_needed";
        this.f4277b = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f4276a.equals(dVar.f4276a)) {
            return false;
        }
        Long l10 = this.f4277b;
        Long l11 = dVar.f4277b;
        if (l10 != null) {
            return l10.equals(l11);
        }
        if (l11 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4276a.hashCode() * 31;
        Long l10 = this.f4277b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public d(String str, long j10) {
        this.f4276a = str;
        this.f4277b = Long.valueOf(j10);
    }
}
