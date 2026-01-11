package u8;

import com.github.mikephil.charting.BuildConfig;
import java.util.Objects;
import u8.c;
import u8.d;

public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final String f11728b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f11729c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11730d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11731e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11732f;
    public final long g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11733h;

    /* renamed from: u8.a$a  reason: collision with other inner class name */
    public static final class C0229a extends d.a {

        /* renamed from: a  reason: collision with root package name */
        public String f11734a;

        /* renamed from: b  reason: collision with root package name */
        public c.a f11735b;

        /* renamed from: c  reason: collision with root package name */
        public String f11736c;

        /* renamed from: d  reason: collision with root package name */
        public String f11737d;

        /* renamed from: e  reason: collision with root package name */
        public Long f11738e;

        /* renamed from: f  reason: collision with root package name */
        public Long f11739f;
        public String g;

        public C0229a() {
        }

        public final d a() {
            String str = this.f11735b == null ? " registrationStatus" : BuildConfig.FLAVOR;
            if (this.f11738e == null) {
                str = a8.a.c(str, " expiresInSecs");
            }
            if (this.f11739f == null) {
                str = a8.a.c(str, " tokenCreationEpochInSecs");
            }
            if (str.isEmpty()) {
                return new a(this.f11734a, this.f11735b, this.f11736c, this.f11737d, this.f11738e.longValue(), this.f11739f.longValue(), this.g);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final d.a b(long j10) {
            this.f11738e = Long.valueOf(j10);
            return this;
        }

        public final d.a c(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f11735b = aVar;
            return this;
        }

        public final d.a d(long j10) {
            this.f11739f = Long.valueOf(j10);
            return this;
        }

        public C0229a(d dVar) {
            this.f11734a = dVar.c();
            this.f11735b = dVar.f();
            this.f11736c = dVar.a();
            this.f11737d = dVar.e();
            this.f11738e = Long.valueOf(dVar.b());
            this.f11739f = Long.valueOf(dVar.g());
            this.g = dVar.d();
        }
    }

    public a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f11728b = str;
        this.f11729c = aVar;
        this.f11730d = str2;
        this.f11731e = str3;
        this.f11732f = j10;
        this.g = j11;
        this.f11733h = str4;
    }

    public final String a() {
        return this.f11730d;
    }

    public final long b() {
        return this.f11732f;
    }

    public final String c() {
        return this.f11728b;
    }

    public final String d() {
        return this.f11733h;
    }

    public final String e() {
        return this.f11731e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f11728b;
        if (str3 != null ? str3.equals(dVar.c()) : dVar.c() == null) {
            if (this.f11729c.equals(dVar.f()) && ((str = this.f11730d) != null ? str.equals(dVar.a()) : dVar.a() == null) && ((str2 = this.f11731e) != null ? str2.equals(dVar.e()) : dVar.e() == null) && this.f11732f == dVar.b() && this.g == dVar.g()) {
                String str4 = this.f11733h;
                if (str4 == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final c.a f() {
        return this.f11729c;
    }

    public final long g() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.f11728b;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f11729c.hashCode()) * 1000003;
        String str2 = this.f11730d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f11731e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f11732f;
        long j11 = this.g;
        int i10 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f11733h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i10 ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("PersistedInstallationEntry{firebaseInstallationId=");
        d10.append(this.f11728b);
        d10.append(", registrationStatus=");
        d10.append(this.f11729c);
        d10.append(", authToken=");
        d10.append(this.f11730d);
        d10.append(", refreshToken=");
        d10.append(this.f11731e);
        d10.append(", expiresInSecs=");
        d10.append(this.f11732f);
        d10.append(", tokenCreationEpochInSecs=");
        d10.append(this.g);
        d10.append(", fisError=");
        return android.support.v4.media.a.e(d10, this.f11733h, "}");
    }
}
