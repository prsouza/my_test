package z7;

import androidx.activity.result.d;
import com.github.mikephil.charting.BuildConfig;
import z7.a0;

public final class r extends a0.e.d.a.b.C0277d.C0279b {

    /* renamed from: a  reason: collision with root package name */
    public final long f14121a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14122b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14123c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14124d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14125e;

    public static final class a extends a0.e.d.a.b.C0277d.C0279b.C0280a {

        /* renamed from: a  reason: collision with root package name */
        public Long f14126a;

        /* renamed from: b  reason: collision with root package name */
        public String f14127b;

        /* renamed from: c  reason: collision with root package name */
        public String f14128c;

        /* renamed from: d  reason: collision with root package name */
        public Long f14129d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f14130e;

        public final a0.e.d.a.b.C0277d.C0279b a() {
            String str = this.f14126a == null ? " pc" : BuildConfig.FLAVOR;
            if (this.f14127b == null) {
                str = a8.a.c(str, " symbol");
            }
            if (this.f14129d == null) {
                str = a8.a.c(str, " offset");
            }
            if (this.f14130e == null) {
                str = a8.a.c(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.f14126a.longValue(), this.f14127b, this.f14128c, this.f14129d.longValue(), this.f14130e.intValue());
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }
    }

    public r(long j10, String str, String str2, long j11, int i) {
        this.f14121a = j10;
        this.f14122b = str;
        this.f14123c = str2;
        this.f14124d = j11;
        this.f14125e = i;
    }

    public final String a() {
        return this.f14123c;
    }

    public final int b() {
        return this.f14125e;
    }

    public final long c() {
        return this.f14124d;
    }

    public final long d() {
        return this.f14121a;
    }

    public final String e() {
        return this.f14122b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b.C0277d.C0279b)) {
            return false;
        }
        a0.e.d.a.b.C0277d.C0279b bVar = (a0.e.d.a.b.C0277d.C0279b) obj;
        if (this.f14121a == bVar.d() && this.f14122b.equals(bVar.e()) && ((str = this.f14123c) != null ? str.equals(bVar.a()) : bVar.a() == null) && this.f14124d == bVar.c() && this.f14125e == bVar.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f14121a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14122b.hashCode()) * 1000003;
        String str = this.f14123c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f14124d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f14125e;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Frame{pc=");
        d10.append(this.f14121a);
        d10.append(", symbol=");
        d10.append(this.f14122b);
        d10.append(", file=");
        d10.append(this.f14123c);
        d10.append(", offset=");
        d10.append(this.f14124d);
        d10.append(", importance=");
        return d.c(d10, this.f14125e, "}");
    }
}
