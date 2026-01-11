package q6;

import android.app.PendingIntent;
import com.google.android.play.core.review.ReviewInfo;
import java.util.Objects;

public final class a extends ReviewInfo {

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f10311a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10312b;

    public a(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f10311a = pendingIntent;
        this.f10312b = z;
    }

    public final PendingIntent a() {
        return this.f10311a;
    }

    public final boolean b() {
        return this.f10312b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            return this.f10311a.equals(reviewInfo.a()) && this.f10312b == reviewInfo.b();
        }
    }

    public final int hashCode() {
        return ((this.f10311a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f10312b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f10311a.toString();
        boolean z = this.f10312b;
        StringBuilder sb2 = new StringBuilder(obj.length() + 40);
        sb2.append("ReviewInfo{pendingIntent=");
        sb2.append(obj);
        sb2.append(", isNoOp=");
        sb2.append(z);
        sb2.append("}");
        return sb2.toString();
    }
}
