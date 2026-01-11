package k3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f7418a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7419b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7420c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7421d;

    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f7422e = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a  reason: collision with root package name */
        public final Context f7423a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f7424b;

        /* renamed from: c  reason: collision with root package name */
        public b f7425c;

        /* renamed from: d  reason: collision with root package name */
        public float f7426d = ((float) f7422e);

        public a(Context context) {
            this.f7423a = context;
            this.f7424b = (ActivityManager) context.getSystemService("activity");
            this.f7425c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f7424b.isLowRamDevice()) {
                this.f7426d = 0.0f;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f7427a;

        public b(DisplayMetrics displayMetrics) {
            this.f7427a = displayMetrics;
        }
    }

    public j(a aVar) {
        this.f7420c = aVar.f7423a;
        int i = aVar.f7424b.isLowRamDevice() ? 2097152 : 4194304;
        this.f7421d = i;
        ActivityManager activityManager = aVar.f7424b;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f7425c.f7427a;
        float f10 = (float) (displayMetrics.widthPixels * displayMetrics.heightPixels * 4);
        int round2 = Math.round(aVar.f7426d * f10);
        int round3 = Math.round(f10 * 2.0f);
        int i10 = round - i;
        int i11 = round3 + round2;
        if (i11 <= i10) {
            this.f7419b = round3;
            this.f7418a = round2;
        } else {
            float f11 = ((float) i10) / (aVar.f7426d + 2.0f);
            this.f7419b = Math.round(2.0f * f11);
            this.f7418a = Math.round(f11 * aVar.f7426d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder d10 = a.a.d("Calculation complete, Calculated memory cache size: ");
            d10.append(a(this.f7419b));
            d10.append(", pool size: ");
            d10.append(a(this.f7418a));
            d10.append(", byte array size: ");
            d10.append(a(i));
            d10.append(", memory class limited? ");
            d10.append(i11 > round);
            d10.append(", max size: ");
            d10.append(a(round));
            d10.append(", memoryClass: ");
            d10.append(aVar.f7424b.getMemoryClass());
            d10.append(", isLowMemoryDevice: ");
            d10.append(aVar.f7424b.isLowRamDevice());
            Log.d("MemorySizeCalculator", d10.toString());
        }
    }

    public final String a(int i) {
        return Formatter.formatFileSize(this.f7420c, (long) i);
    }
}
