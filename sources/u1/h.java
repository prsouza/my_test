package u1;

import android.app.Notification;
import org.slf4j.helpers.MessageFormatter;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final int f11640a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11641b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f11642c;

    public h(int i, Notification notification, int i10) {
        this.f11640a = i;
        this.f11642c = notification;
        this.f11641b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f11640a == hVar.f11640a && this.f11641b == hVar.f11641b) {
            return this.f11642c.equals(hVar.f11642c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11642c.hashCode() + (((this.f11640a * 31) + this.f11641b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f11640a + ", mForegroundServiceType=" + this.f11641b + ", mNotification=" + this.f11642c + MessageFormatter.DELIM_STOP;
    }
}
