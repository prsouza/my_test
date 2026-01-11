package c0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public final class k extends o {

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f3081b;

    /* renamed from: c  reason: collision with root package name */
    public IconCompat f3082c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3083d;

    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    public final void b(i iVar) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((p) iVar).f3106b).setBigContentTitle((CharSequence) null).bigPicture(this.f3081b);
        if (this.f3083d) {
            IconCompat iconCompat = this.f3082c;
            if (iconCompat == null) {
                a.a(bigPicture, (Bitmap) null);
            } else {
                b.a(bigPicture, iconCompat.j(((p) iVar).f3105a));
            }
        }
        if (i >= 31) {
            c.a(bigPicture, false);
        }
    }

    public final String g() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final k l() {
        this.f3082c = null;
        this.f3083d = true;
        return this;
    }
}
