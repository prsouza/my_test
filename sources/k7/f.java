package k7;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f7465a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7466b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7467c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7468d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7469e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7470f;
    public final String g;

    public f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f7466b = str;
        this.f7465a = str2;
        this.f7467c = str3;
        this.f7468d = str4;
        this.f7469e = str5;
        this.f7470f = str6;
        this.g = str7;
    }

    public static f a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new f(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Objects.equal(this.f7466b, fVar.f7466b) || !Objects.equal(this.f7465a, fVar.f7465a) || !Objects.equal(this.f7467c, fVar.f7467c) || !Objects.equal(this.f7468d, fVar.f7468d) || !Objects.equal(this.f7469e, fVar.f7469e) || !Objects.equal(this.f7470f, fVar.f7470f) || !Objects.equal(this.g, fVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7466b, this.f7465a, this.f7467c, this.f7468d, this.f7469e, this.f7470f, this.g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f7466b).add("apiKey", this.f7465a).add("databaseUrl", this.f7467c).add("gcmSenderId", this.f7469e).add("storageBucket", this.f7470f).add("projectId", this.g).toString();
    }
}
