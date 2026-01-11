package c0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.nodle.cash.R;
import java.text.NumberFormat;
import java.util.Objects;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public m f3104a;

    public void a(Bundle bundle) {
        String g = g();
        if (g != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", g);
        }
    }

    public abstract void b(i iVar);

    public final RemoteViews c() {
        boolean z;
        boolean z10;
        Resources resources = this.f3104a.f3085a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.f3104a.f3085a.getPackageName(), R.layout.notification_template_custom_big);
        m mVar = this.f3104a;
        int i = mVar.f3092j;
        int i10 = 0;
        if (mVar.f3091h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, this.f3104a.f3091h);
            if (this.f3104a.f3102t.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                m mVar2 = this.f3104a;
                remoteViews.setImageViewBitmap(R.id.right_icon, f(mVar2.f3102t.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2), mVar2.f3097o));
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (mVar.f3102t.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
            m mVar3 = this.f3104a;
            remoteViews.setImageViewBitmap(R.id.icon, f(mVar3.f3102t.icon, dimensionPixelSize2, dimensionPixelSize3, mVar3.f3097o));
        }
        CharSequence charSequence = this.f3104a.f3089e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.f3104a.f3090f;
        boolean z11 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z = true;
        } else {
            z = false;
        }
        Objects.requireNonNull(this.f3104a);
        if (this.f3104a.i > 0) {
            if (this.f3104a.i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format((long) this.f3104a.i));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            z10 = true;
            z = true;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
            z10 = false;
        }
        Objects.requireNonNull(this.f3104a);
        if (this.f3104a.b() != 0) {
            Objects.requireNonNull(this.f3104a);
            remoteViews.setViewVisibility(R.id.time, 0);
            remoteViews.setLong(R.id.time, "setTime", this.f3104a.b());
        } else {
            z11 = z10;
        }
        remoteViews.setViewVisibility(R.id.right_side, z11 ? 0 : 8);
        if (!z) {
            i10 = 8;
        }
        remoteViews.setViewVisibility(R.id.line3, i10);
        return remoteViews;
    }

    public final Bitmap d(IconCompat iconCompat, int i, int i10) {
        Drawable i11 = iconCompat.i(this.f3104a.f3085a);
        int intrinsicWidth = i10 == 0 ? i11.getIntrinsicWidth() : i10;
        if (i10 == 0) {
            i10 = i11.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i10, Bitmap.Config.ARGB_8888);
        i11.setBounds(0, 0, intrinsicWidth, i10);
        if (i != 0) {
            i11.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        i11.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap e(int i, int i10) {
        Context context = this.f3104a.f3085a;
        PorterDuff.Mode mode = IconCompat.f1642k;
        if (context != null) {
            return d(IconCompat.b(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i, i10);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public final Bitmap f(int i, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 0;
        }
        Bitmap e10 = e(i12, i10);
        Canvas canvas = new Canvas(e10);
        Drawable mutate = this.f3104a.f3085a.getResources().getDrawable(i).mutate();
        mutate.setFilterBitmap(true);
        int i13 = (i10 - i11) / 2;
        int i14 = i11 + i13;
        mutate.setBounds(i13, i13, i14, i14);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return e10;
    }

    public abstract String g();

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public void j() {
    }

    public final void k(m mVar) {
        if (this.f3104a != mVar) {
            this.f3104a = mVar;
            if (mVar != null) {
                mVar.i(this);
            }
        }
    }
}
