package z7;

import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import z7.a0;

public final class f extends a0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f14024a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14025b;

    public static final class a extends a0.d.a.C0269a {

        /* renamed from: a  reason: collision with root package name */
        public String f14026a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f14027b;

        public final a0.d.a a() {
            String str = this.f14026a == null ? " filename" : BuildConfig.FLAVOR;
            if (this.f14027b == null) {
                str = a8.a.c(str, " contents");
            }
            if (str.isEmpty()) {
                return new f(this.f14026a, this.f14027b);
            }
            throw new IllegalStateException(a8.a.c("Missing required properties:", str));
        }

        public final a0.d.a.C0269a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f14027b = bArr;
            return this;
        }

        public final a0.d.a.C0269a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f14026a = str;
            return this;
        }
    }

    public f(String str, byte[] bArr) {
        this.f14024a = str;
        this.f14025b = bArr;
    }

    public final byte[] a() {
        return this.f14025b;
    }

    public final String b() {
        return this.f14024a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d.a)) {
            return false;
        }
        a0.d.a aVar = (a0.d.a) obj;
        if (this.f14024a.equals(aVar.b())) {
            if (Arrays.equals(this.f14025b, aVar instanceof f ? ((f) aVar).f14025b : aVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14024a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14025b);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("File{filename=");
        d10.append(this.f14024a);
        d10.append(", contents=");
        d10.append(Arrays.toString(this.f14025b));
        d10.append("}");
        return d10.toString();
    }
}
