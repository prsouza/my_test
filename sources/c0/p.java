package c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.github.mikephil.charting.BuildConfig;
import j0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import s.c;

public final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3105a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f3106b;

    /* renamed from: c  reason: collision with root package name */
    public final m f3107c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f3108d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Bundle> f3109e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f3110f = new Bundle();

    public p(m mVar) {
        List<String> list;
        Bundle bundle;
        Bundle bundle2;
        m mVar2 = mVar;
        this.f3107c = mVar2;
        this.f3105a = mVar2.f3085a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3106b = new Notification.Builder(mVar2.f3085a, mVar2.f3100r);
        } else {
            this.f3106b = new Notification.Builder(mVar2.f3085a);
        }
        Notification notification = mVar2.f3102t;
        this.f3106b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(mVar2.f3089e).setContentText(mVar2.f3090f).setContentInfo((CharSequence) null).setContentIntent(mVar2.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(mVar2.f3091h).setNumber(mVar2.i).setProgress(0, 0, false);
        this.f3106b.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(mVar2.f3092j);
        Iterator<j> it = mVar2.f3086b.iterator();
        while (it.hasNext()) {
            j next = it.next();
            IconCompat a10 = next.a();
            Notification.Action.Builder builder = new Notification.Action.Builder(a10 != null ? a10.j((Context) null) : null, next.f3079j, next.f3080k);
            s[] sVarArr = next.f3074c;
            if (sVarArr != null) {
                int length = sVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (sVarArr.length <= 0) {
                    for (int i = 0; i < length; i++) {
                        builder.addRemoteInput(remoteInputArr[i]);
                    }
                } else {
                    s sVar = sVarArr[0];
                    throw null;
                }
            }
            if (next.f3072a != null) {
                bundle2 = new Bundle(next.f3072a);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", next.f3076e);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                builder.setAllowGeneratedReplies(next.f3076e);
            }
            bundle2.putInt("android.support.action.semanticAction", next.g);
            if (i10 >= 28) {
                builder.setSemanticAction(next.g);
            }
            if (i10 >= 29) {
                builder.setContextual(next.f3078h);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", next.f3077f);
            builder.addExtras(bundle2);
            this.f3106b.addAction(builder.build());
        }
        Bundle bundle3 = mVar2.f3096n;
        if (bundle3 != null) {
            this.f3110f.putAll(bundle3);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f3108d = mVar2.f3099q;
        this.f3106b.setShowWhen(mVar2.f3093k);
        this.f3106b.setLocalOnly(mVar2.f3095m).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        this.f3106b.setCategory((String) null).setColor(mVar2.f3097o).setVisibility(mVar2.f3098p).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
        if (i11 < 28) {
            list = a(b(mVar2.f3087c), mVar2.f3103u);
        } else {
            list = mVar2.f3103u;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                this.f3106b.addPerson(addPerson);
            }
        }
        if (mVar2.f3088d.size() > 0) {
            if (mVar2.f3096n == null) {
                mVar2.f3096n = new Bundle();
            }
            Bundle bundle4 = mVar2.f3096n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i12 = 0; i12 < mVar2.f3088d.size(); i12++) {
                String num = Integer.toString(i12);
                j jVar = mVar2.f3088d.get(i12);
                Object obj = q.f3111a;
                Bundle bundle7 = new Bundle();
                IconCompat a11 = jVar.a();
                bundle7.putInt("icon", a11 != null ? a11.c() : 0);
                bundle7.putCharSequence("title", jVar.f3079j);
                bundle7.putParcelable("actionIntent", jVar.f3080k);
                if (jVar.f3072a != null) {
                    bundle = new Bundle(jVar.f3072a);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar.f3076e);
                bundle7.putBundle("extras", bundle);
                bundle7.putParcelableArray("remoteInputs", q.a(jVar.f3074c));
                bundle7.putBoolean("showsUserInterface", jVar.f3077f);
                bundle7.putInt("semanticAction", jVar.g);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (mVar2.f3096n == null) {
                mVar2.f3096n = new Bundle();
            }
            mVar2.f3096n.putBundle("android.car.EXTENSIONS", bundle4);
            this.f3110f.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            this.f3106b.setExtras(mVar2.f3096n).setRemoteInputHistory((CharSequence[]) null);
            RemoteViews remoteViews = mVar2.f3099q;
            if (remoteViews != null) {
                this.f3106b.setCustomContentView(remoteViews);
            }
        }
        if (i13 >= 26) {
            this.f3106b.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(mVar2.f3100r)) {
                this.f3106b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i13 >= 28) {
            Iterator<r> it2 = mVar2.f3087c.iterator();
            while (it2.hasNext()) {
                Notification.Builder builder2 = this.f3106b;
                Objects.requireNonNull(it2.next());
                builder2.addPerson(new Person.Builder().setName((CharSequence) null).setIcon((Icon) null).setUri((String) null).setKey((String) null).setBot(false).setImportant(false).build());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3106b.setAllowSystemGeneratedContextualActions(mVar2.f3101s);
            this.f3106b.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
        a.a();
    }

    public static List<String> a(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        c cVar = new c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> b(List<r> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (r requireNonNull : list) {
            Objects.requireNonNull(requireNonNull);
            arrayList.add(BuildConfig.FLAVOR);
        }
        return arrayList;
    }
}
