package z7;

import a.a;
import android.os.Build;
import java.util.Objects;
import z7.c0;

public final class y extends c0.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f14162a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14163b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14164c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14165d;

    /* renamed from: e  reason: collision with root package name */
    public final long f14166e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14167f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final String f14168h;
    public final String i;

    public y(int i10, int i11, long j10, long j11, boolean z, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f14162a = i10;
        Objects.requireNonNull(str, "Null model");
        this.f14163b = str;
        this.f14164c = i11;
        this.f14165d = j10;
        this.f14166e = j11;
        this.f14167f = z;
        this.g = i12;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f14168h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.i = str3;
    }

    public final int a() {
        return this.f14162a;
    }

    public final int b() {
        return this.f14164c;
    }

    public final long c() {
        return this.f14166e;
    }

    public final boolean d() {
        return this.f14167f;
    }

    public final String e() {
        return this.f14168h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.b)) {
            return false;
        }
        c0.b bVar = (c0.b) obj;
        if (this.f14162a == bVar.a() && this.f14163b.equals(bVar.f()) && this.f14164c == bVar.b() && this.f14165d == bVar.i() && this.f14166e == bVar.c() && this.f14167f == bVar.d() && this.g == bVar.h() && this.f14168h.equals(bVar.e()) && this.i.equals(bVar.g())) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f14163b;
    }

    public final String g() {
        return this.i;
    }

    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        long j10 = this.f14165d;
        long j11 = this.f14166e;
        return ((((((((((((((((this.f14162a ^ 1000003) * 1000003) ^ this.f14163b.hashCode()) * 1000003) ^ this.f14164c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f14167f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f14168h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final long i() {
        return this.f14165d;
    }

    public final String toString() {
        StringBuilder d10 = a.d("DeviceData{arch=");
        d10.append(this.f14162a);
        d10.append(", model=");
        d10.append(this.f14163b);
        d10.append(", availableProcessors=");
        d10.append(this.f14164c);
        d10.append(", totalRam=");
        d10.append(this.f14165d);
        d10.append(", diskSpace=");
        d10.append(this.f14166e);
        d10.append(", isEmulator=");
        d10.append(this.f14167f);
        d10.append(", state=");
        d10.append(this.g);
        d10.append(", manufacturer=");
        d10.append(this.f14168h);
        d10.append(", modelClass=");
        return android.support.v4.media.a.e(d10, this.i, "}");
    }
}
