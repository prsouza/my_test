package l6;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

public final class f0 extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    public final String f7844a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7845b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7846c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7847d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7848e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7849f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7850h;
    public final String i;

    public f0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f7844a = str;
        this.f7845b = i10;
        this.f7846c = i11;
        this.f7847d = j10;
        this.f7848e = j11;
        this.f7849f = i12;
        this.g = i13;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f7850h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.i = str3;
    }

    public final long a() {
        return this.f7847d;
    }

    public final int b() {
        return this.f7846c;
    }

    public final String c() {
        return this.f7844a;
    }

    public final int d() {
        return this.f7845b;
    }

    public final long e() {
        return this.f7848e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f7844a.equals(assetPackState.c()) && this.f7845b == assetPackState.d() && this.f7846c == assetPackState.b() && this.f7847d == assetPackState.a() && this.f7848e == assetPackState.e() && this.f7849f == assetPackState.f() && this.g == assetPackState.g() && this.f7850h.equals(assetPackState.j()) && this.i.equals(assetPackState.k());
        }
    }

    public final int f() {
        return this.f7849f;
    }

    public final int g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.f7844a.hashCode();
        int i10 = this.f7845b;
        int i11 = this.f7846c;
        long j10 = this.f7847d;
        long j11 = this.f7848e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f7849f) * 1000003) ^ this.g) * 1000003) ^ this.f7850h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String j() {
        return this.f7850h;
    }

    public final String k() {
        return this.i;
    }

    public final String toString() {
        String str = this.f7844a;
        int i10 = this.f7845b;
        int i11 = this.f7846c;
        long j10 = this.f7847d;
        long j11 = this.f7848e;
        int i12 = this.f7849f;
        int i13 = this.g;
        String str2 = this.f7850h;
        String str3 = this.i;
        StringBuilder sb2 = new StringBuilder(str3.length() + str2.length() + str.length() + 261);
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append(", updateAvailability=");
        sb2.append(i13);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
