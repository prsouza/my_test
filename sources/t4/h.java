package t4;

import com.github.mikephil.charting.BuildConfig;
import java.util.Map;
import java.util.Objects;
import t4.m;

public final class h extends m {

    /* renamed from: a  reason: collision with root package name */
    public final String f11351a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f11352b;

    /* renamed from: c  reason: collision with root package name */
    public final l f11353c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11354d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11355e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f11356f;

    public static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        public String f11357a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f11358b;

        /* renamed from: c  reason: collision with root package name */
        public l f11359c;

        /* renamed from: d  reason: collision with root package name */
        public Long f11360d;

        /* renamed from: e  reason: collision with root package name */
        public Long f11361e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f11362f;

        public final m c() {
            String str = this.f11357a == null ? " transportName" : BuildConfig.FLAVOR;
            if (this.f11359c == null) {
                str = a8.a.c(str, " encodedPayload");
            }
            if (this.f11360d == null) {
                str = a8.a.c(str, " eventMillis");
            }
            if (this.f11361e == null) {
                str = a8.a.c(str, " uptimeMillis");
            }
            if (this.f11362f == null) {
                str = a8.a.c(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new h(this.f11357a, this.f11358b, this.f11359c, this.f11360d.longValue(), this.f11361e.longValue(), this.f11362f, (a) null);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final Map<String, String> d() {
            Map<String, String> map = this.f11362f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public final m.a e(long j10) {
            this.f11360d = Long.valueOf(j10);
            return this;
        }

        public final m.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f11357a = str;
            return this;
        }

        public final m.a g(long j10) {
            this.f11361e = Long.valueOf(j10);
            return this;
        }

        public final m.a h(l lVar) {
            Objects.requireNonNull(lVar, "Null encodedPayload");
            this.f11359c = lVar;
            return this;
        }
    }

    public h(String str, Integer num, l lVar, long j10, long j11, Map map, a aVar) {
        this.f11351a = str;
        this.f11352b = num;
        this.f11353c = lVar;
        this.f11354d = j10;
        this.f11355e = j11;
        this.f11356f = map;
    }

    public final Map<String, String> c() {
        return this.f11356f;
    }

    public final Integer d() {
        return this.f11352b;
    }

    public final l e() {
        return this.f11353c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f11351a.equals(mVar.h()) || ((num = this.f11352b) != null ? !num.equals(mVar.d()) : mVar.d() != null) || !this.f11353c.equals(mVar.e()) || this.f11354d != mVar.f() || this.f11355e != mVar.i() || !this.f11356f.equals(mVar.c())) {
            return false;
        }
        return true;
    }

    public final long f() {
        return this.f11354d;
    }

    public final String h() {
        return this.f11351a;
    }

    public final int hashCode() {
        int hashCode = (this.f11351a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11352b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f11354d;
        long j11 = this.f11355e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f11353c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11356f.hashCode();
    }

    public final long i() {
        return this.f11355e;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("EventInternal{transportName=");
        d10.append(this.f11351a);
        d10.append(", code=");
        d10.append(this.f11352b);
        d10.append(", encodedPayload=");
        d10.append(this.f11353c);
        d10.append(", eventMillis=");
        d10.append(this.f11354d);
        d10.append(", uptimeMillis=");
        d10.append(this.f11355e);
        d10.append(", autoMetadata=");
        d10.append(this.f11356f);
        d10.append("}");
        return d10.toString();
    }
}
