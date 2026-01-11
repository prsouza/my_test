package x8;

import android.util.Log;
import androidx.fragment.app.o;
import com.google.android.gms.common.internal.Objects;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;

public final class j0 {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f13069d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    public final String f13070a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13071b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13072c;

    public j0(@TopicOperation.TopicOperations String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str}));
            str3 = str2.substring(8);
        }
        if (str3 == null || !f13069d.matcher(str3).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str3, "[a-zA-Z0-9-_.~%]{1,900}"}));
        }
        this.f13070a = str3;
        this.f13071b = str;
        this.f13072c = o.c(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (!this.f13070a.equals(j0Var.f13070a) || !this.f13071b.equals(j0Var.f13071b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f13071b, this.f13070a);
    }
}
