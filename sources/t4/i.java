package t4;

import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import q4.d;
import t4.q;

public final class i extends q {

    /* renamed from: a  reason: collision with root package name */
    public final String f11363a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11364b;

    /* renamed from: c  reason: collision with root package name */
    public final d f11365c;

    public static final class a extends q.a {

        /* renamed from: a  reason: collision with root package name */
        public String f11366a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f11367b;

        /* renamed from: c  reason: collision with root package name */
        public d f11368c;

        public final q.a a(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f11366a = str;
            return this;
        }

        public final q b() {
            String str = this.f11366a == null ? " backendName" : BuildConfig.FLAVOR;
            if (this.f11368c == null) {
                str = a8.a.c(str, " priority");
            }
            if (str.isEmpty()) {
                return new i(this.f11366a, this.f11367b, this.f11368c);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final q.a c(d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f11368c = dVar;
            return this;
        }
    }

    public i(String str, byte[] bArr, d dVar) {
        this.f11363a = str;
        this.f11364b = bArr;
        this.f11365c = dVar;
    }

    public final String b() {
        return this.f11363a;
    }

    public final byte[] c() {
        return this.f11364b;
    }

    public final d d() {
        return this.f11365c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f11363a.equals(qVar.b())) {
            if (Arrays.equals(this.f11364b, qVar instanceof i ? ((i) qVar).f11364b : qVar.c()) && this.f11365c.equals(qVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11363a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f11364b)) * 1000003) ^ this.f11365c.hashCode();
    }
}
