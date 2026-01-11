package c0;

import android.app.Notification;
import android.os.Bundle;

public final class l extends o {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3084b;

    public final void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    }

    public final void b(i iVar) {
        new Notification.BigTextStyle(((p) iVar).f3106b).setBigContentTitle((CharSequence) null).bigText(this.f3084b);
    }

    public final String g() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    public final l l(CharSequence charSequence) {
        this.f3084b = m.c(charSequence);
        return this;
    }
}
