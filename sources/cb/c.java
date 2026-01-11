package cb;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import bb.e;
import c0.m;
import c0.n;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.LauncherActivity;
import io.nodle.cash.ui.view.activity.transact.HistoryActivityV2;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3327a = 0;

    public static final Notification a(Context context, e eVar) {
        e6.e.D(eVar, "mode");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notif_nodle_scan);
        remoteViews.setImageViewResource(R.id.iconImageView, eVar.getScanModeIcon());
        remoteViews.setTextViewText(R.id.iconTextView, eVar.name());
        remoteViews.setTextViewText(R.id.messageTextView, context.getString(R.string.app_name) + " : " + context.getString(R.string.notifyScanActive));
        m mVar = new m(context, a.NODLE_SCAN.getId());
        mVar.f3099q = remoteViews;
        mVar.i(new n());
        mVar.f3102t.icon = 2131165408;
        mVar.f3092j = 0;
        mVar.d(false);
        mVar.f3102t.flags |= 2;
        mVar.h((Uri) null);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            mVar.g = PendingIntent.getActivity(context, 0, launchIntentForPackage, 67108864);
        }
        Notification a10 = mVar.a();
        e6.e.C(a10, "notifBuilder.build()");
        return a10;
    }

    public static final void b(Context context) {
        boolean z;
        e6.e.D(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i >= 26) {
                Object systemService = context.getSystemService("notification");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                NotificationManager notificationManager = (NotificationManager) systemService;
                for (NotificationChannel next : notificationManager.getNotificationChannels()) {
                    a[] values = a.values();
                    int length = values.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z = false;
                            break;
                        }
                        if (e6.e.r(next.getId(), values[i10].getId())) {
                            z = true;
                            break;
                        }
                        i10++;
                    }
                    if (!z) {
                        Log.d("c", "Removing notification channel: " + next.getId());
                        notificationManager.cancelAll();
                        notificationManager.deleteNotificationChannel(next.getId());
                    }
                }
            }
            Object systemService2 = context.getSystemService("notification");
            Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager2 = (NotificationManager) systemService2;
            for (a aVar : a.values()) {
                NotificationChannel notificationChannel = new NotificationChannel(aVar.getId(), context.getString(aVar.channelName()), 3);
                notificationChannel.setDescription(context.getString(aVar.description()));
                if (aVar == a.NODLE_SCAN) {
                    notificationChannel.setShowBadge(false);
                    notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                }
                notificationManager2.createNotificationChannel(notificationChannel);
            }
        }
    }

    public static final PendingIntent c(Context context) {
        Intent intent = new Intent(context, LauncherActivity.class);
        Intent intent2 = new Intent(context, HistoryActivityV2.class);
        TaskStackBuilder create = TaskStackBuilder.create(context);
        create.addNextIntent(intent);
        create.addNextIntent(intent2);
        return create.getPendingIntent(0, 134217728);
    }

    public static final void d(Notification notification, Context context, int i) {
        e6.e.D(context, "cxt");
        Object systemService = context.getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(i, notification);
    }
}
