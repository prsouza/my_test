package v8;

import com.github.mikephil.charting.BuildConfig;
import v8.f;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final String f12343a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12344b;

    /* renamed from: c  reason: collision with root package name */
    public final f.b f12345c;

    public static final class a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public String f12346a;

        /* renamed from: b  reason: collision with root package name */
        public Long f12347b;

        /* renamed from: c  reason: collision with root package name */
        public f.b f12348c;

        public final f a() {
            String str = this.f12347b == null ? " tokenExpirationTimestamp" : BuildConfig.FLAVOR;
            if (str.isEmpty()) {
                return new b(this.f12346a, this.f12347b.longValue(), this.f12348c);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final f.a b(long j10) {
            this.f12347b = Long.valueOf(j10);
            return this;
        }
    }

    public b(String str, long j10, f.b bVar) {
        this.f12343a = str;
        this.f12344b = j10;
        this.f12345c = bVar;
    }

    public final f.b b() {
        return this.f12345c;
    }

    public final String c() {
        return this.f12343a;
    }

    public final long d() {
        return this.f12344b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f12343a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f12344b == fVar.d()) {
                f.b bVar = this.f12345c;
                if (bVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12343a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f12344b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f12345c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i10 ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("TokenResult{token=");
        d10.append(this.f12343a);
        d10.append(", tokenExpirationTimestamp=");
        d10.append(this.f12344b);
        d10.append(", responseCode=");
        d10.append(this.f12345c);
        d10.append("}");
        return d10.toString();
    }
}
