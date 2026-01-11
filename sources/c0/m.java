package c0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import io.nodle.cash.R;
import java.util.ArrayList;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public Context f3085a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<j> f3086b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<r> f3087c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<j> f3088d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f3089e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3090f;
    public PendingIntent g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f3091h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f3092j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3093k = true;

    /* renamed from: l  reason: collision with root package name */
    public o f3094l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3095m = false;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f3096n;

    /* renamed from: o  reason: collision with root package name */
    public int f3097o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f3098p = 0;

    /* renamed from: q  reason: collision with root package name */
    public RemoteViews f3099q;

    /* renamed from: r  reason: collision with root package name */
    public String f3100r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3101s;

    /* renamed from: t  reason: collision with root package name */
    public Notification f3102t;
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<String> f3103u;

    public m(Context context, String str) {
        Notification notification = new Notification();
        this.f3102t = notification;
        this.f3085a = context;
        this.f3100r = str;
        notification.when = System.currentTimeMillis();
        this.f3102t.audioStreamType = -1;
        this.f3092j = 0;
        this.f3103u = new ArrayList<>();
        this.f3101s = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notification;
        Bundle bundle;
        RemoteViews h10;
        p pVar = new p(this);
        o oVar = pVar.f3107c.f3094l;
        if (oVar != null) {
            oVar.b(pVar);
        }
        RemoteViews i10 = oVar != null ? oVar.i() : null;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            notification = pVar.f3106b.build();
        } else if (i11 >= 24) {
            notification = pVar.f3106b.build();
        } else {
            pVar.f3106b.setExtras(pVar.f3110f);
            notification = pVar.f3106b.build();
            RemoteViews remoteViews = pVar.f3108d;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
        }
        if (i10 != null) {
            notification.contentView = i10;
        } else {
            RemoteViews remoteViews2 = pVar.f3107c.f3099q;
            if (remoteViews2 != null) {
                notification.contentView = remoteViews2;
            }
        }
        if (!(oVar == null || (h10 = oVar.h()) == null)) {
            notification.bigContentView = h10;
        }
        if (oVar != null) {
            pVar.f3107c.f3094l.j();
        }
        if (!(oVar == null || (bundle = notification.extras) == null)) {
            oVar.a(bundle);
        }
        return notification;
    }

    public final long b() {
        if (this.f3093k) {
            return this.f3102t.when;
        }
        return 0;
    }

    public final m d(boolean z) {
        if (z) {
            this.f3102t.flags |= 16;
        } else {
            this.f3102t.flags &= -17;
        }
        return this;
    }

    public final m e(CharSequence charSequence) {
        this.f3090f = c(charSequence);
        return this;
    }

    public final m f(CharSequence charSequence) {
        this.f3089e = c(charSequence);
        return this;
    }

    public final m g(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f3085a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f3091h = bitmap;
        return this;
    }

    public final m h(Uri uri) {
        Notification notification = this.f3102t;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        return this;
    }

    public final m i(o oVar) {
        if (this.f3094l != oVar) {
            this.f3094l = oVar;
            if (oVar != null) {
                oVar.k(this);
            }
        }
        return this;
    }
}
