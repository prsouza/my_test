package c0;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.github.mikephil.charting.BuildConfig;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f3072a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f3073b;

    /* renamed from: c  reason: collision with root package name */
    public final s[] f3074c;

    /* renamed from: d  reason: collision with root package name */
    public final s[] f3075d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3076e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3077f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3078h;
    @Deprecated
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3079j;

    /* renamed from: k  reason: collision with root package name */
    public PendingIntent f3080k;

    public j(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat b10 = i10 == 0 ? null : IconCompat.b((Resources) null, BuildConfig.FLAVOR, i10);
        Bundle bundle = new Bundle();
        this.f3077f = true;
        this.f3073b = b10;
        if (b10 != null && b10.f() == 2) {
            this.i = b10.c();
        }
        this.f3079j = m.c(charSequence);
        this.f3080k = pendingIntent;
        this.f3072a = bundle;
        this.f3074c = null;
        this.f3075d = null;
        this.f3076e = true;
        this.g = 0;
        this.f3077f = true;
        this.f3078h = false;
    }

    public final IconCompat a() {
        int i10;
        if (this.f3073b == null && (i10 = this.i) != 0) {
            this.f3073b = IconCompat.b((Resources) null, BuildConfig.FLAVOR, i10);
        }
        return this.f3073b;
    }
}
