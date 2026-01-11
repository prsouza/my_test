package c0;

import android.app.Notification;
import android.content.res.Resources;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class n extends o {
    public final void b(i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((p) iVar).f3106b.setStyle(new Notification.DecoratedCustomViewStyle());
        }
    }

    public final String g() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public final RemoteViews h() {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        Objects.requireNonNull(this.f3104a);
        RemoteViews remoteViews = this.f3104a.f3099q;
        if (remoteViews == null) {
            return null;
        }
        return l(remoteViews, true);
    }

    public final RemoteViews i() {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT < 24 && (remoteViews = this.f3104a.f3099q) != null) {
            return l(remoteViews, false);
        }
        return null;
    }

    public final void j() {
        if (Build.VERSION.SDK_INT < 24) {
            Objects.requireNonNull(this.f3104a);
            RemoteViews remoteViews = this.f3104a.f3099q;
        }
    }

    public final RemoteViews l(RemoteViews remoteViews, boolean z) {
        ArrayList arrayList;
        int min;
        RemoteViews c10 = c();
        c10.removeAllViews(R.id.actions);
        ArrayList<j> arrayList2 = this.f3104a.f3086b;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator<j> it = arrayList2.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (!next.f3078h) {
                    arrayList3.add(next);
                }
            }
            arrayList = arrayList3;
        }
        boolean z10 = true;
        if (!z || arrayList == null || (min = Math.min(arrayList.size(), 3)) <= 0) {
            z10 = false;
        } else {
            for (int i = 0; i < min; i++) {
                j jVar = (j) arrayList.get(i);
                boolean z11 = jVar.f3080k == null;
                RemoteViews remoteViews2 = new RemoteViews(this.f3104a.f3085a.getPackageName(), z11 ? R.layout.notification_action_tombstone : R.layout.notification_action);
                IconCompat a10 = jVar.a();
                if (a10 != null) {
                    remoteViews2.setImageViewBitmap(R.id.action_image, d(a10, this.f3104a.f3085a.getResources().getColor(R.color.notification_action_color_filter), 0));
                }
                remoteViews2.setTextViewText(R.id.action_text, jVar.f3079j);
                if (!z11) {
                    remoteViews2.setOnClickPendingIntent(R.id.action_container, jVar.f3080k);
                }
                remoteViews2.setContentDescription(R.id.action_container, jVar.f3079j);
                c10.addView(R.id.actions, remoteViews2);
            }
        }
        int i10 = z10 ? 0 : 8;
        c10.setViewVisibility(R.id.actions, i10);
        c10.setViewVisibility(R.id.action_divider, i10);
        c10.setViewVisibility(R.id.title, 8);
        c10.setViewVisibility(R.id.text2, 8);
        c10.setViewVisibility(R.id.text, 8);
        c10.removeAllViews(R.id.notification_main_column);
        c10.addView(R.id.notification_main_column, remoteViews.clone());
        c10.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources = this.f3104a.f3085a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
        float f10 = resources.getConfiguration().fontScale;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        } else if (f10 > 1.3f) {
            f10 = 1.3f;
        }
        float f11 = (f10 - 1.0f) / 0.29999995f;
        c10.setViewPadding(R.id.notification_main_column_container, 0, Math.round((f11 * ((float) dimensionPixelSize2)) + ((1.0f - f11) * ((float) dimensionPixelSize))), 0, 0);
        return c10;
    }
}
