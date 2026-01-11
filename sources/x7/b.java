package x7;

import a.a;
import java.io.File;
import java.util.Objects;
import z7.a0;

public final class b extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f12892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12893b;

    /* renamed from: c  reason: collision with root package name */
    public final File f12894c;

    public b(a0 a0Var, String str, File file) {
        this.f12892a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f12893b = str;
        this.f12894c = file;
    }

    public final a0 a() {
        return this.f12892a;
    }

    public final File b() {
        return this.f12894c;
    }

    public final String c() {
        return this.f12893b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (!this.f12892a.equals(b0Var.a()) || !this.f12893b.equals(b0Var.c()) || !this.f12894c.equals(b0Var.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f12892a.hashCode() ^ 1000003) * 1000003) ^ this.f12893b.hashCode()) * 1000003) ^ this.f12894c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("CrashlyticsReportWithSessionId{report=");
        d10.append(this.f12892a);
        d10.append(", sessionId=");
        d10.append(this.f12893b);
        d10.append(", reportFile=");
        d10.append(this.f12894c);
        d10.append("}");
        return d10.toString();
    }
}
