package gb;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.ImagesContract;
import e6.e;
import md.m;
import xd.a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f5320a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5321b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5322c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5323d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5324e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5325f;
    public final a<m> g;

    /* renamed from: h  reason: collision with root package name */
    public final a<m> f5326h;

    public f(int i, String str, String str2, String str3, String str4, boolean z, a<m> aVar, a<m> aVar2) {
        e.D(str, "title");
        e.D(str2, "detail");
        e.D(str3, "time");
        e.D(str4, ImagesContract.URL);
        e.D(aVar, "onSelect");
        e.D(aVar2, "onSeen");
        this.f5320a = i;
        this.f5321b = str;
        this.f5322c = str2;
        this.f5323d = str3;
        this.f5324e = str4;
        this.f5325f = z;
        this.g = aVar;
        this.f5326h = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5320a == fVar.f5320a && e.r(this.f5321b, fVar.f5321b) && e.r(this.f5322c, fVar.f5322c) && e.r(this.f5323d, fVar.f5323d) && e.r(this.f5324e, fVar.f5324e) && this.f5325f == fVar.f5325f && e.r(this.g, fVar.g) && e.r(this.f5326h, fVar.f5326h);
    }

    public final int hashCode() {
        int a10 = androidx.fragment.app.m.a(this.f5324e, androidx.fragment.app.m.a(this.f5323d, androidx.fragment.app.m.a(this.f5322c, androidx.fragment.app.m.a(this.f5321b, this.f5320a * 31, 31), 31), 31), 31);
        boolean z = this.f5325f;
        if (z) {
            z = true;
        }
        int hashCode = this.g.hashCode();
        return this.f5326h.hashCode() + ((hashCode + ((a10 + (z ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f5320a;
        String str = this.f5321b;
        String str2 = this.f5322c;
        String str3 = this.f5323d;
        String str4 = this.f5324e;
        boolean z = this.f5325f;
        a<m> aVar = this.g;
        a<m> aVar2 = this.f5326h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NotificationItemUiState(id=");
        sb2.append(i);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", detail=");
        h1.e.b(sb2, str2, ", time=", str3, ", url=");
        sb2.append(str4);
        sb2.append(", isSeen=");
        sb2.append(z);
        sb2.append(", onSelect=");
        sb2.append(aVar);
        sb2.append(", onSeen=");
        sb2.append(aVar2);
        sb2.append(")");
        return sb2.toString();
    }

    public f() {
        this(0, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, d.f5318b, e.f5319b);
    }
}
