package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import io.nodle.cash.R;

public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1282a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1283b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1284c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1285d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1286e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1287f = new int[2];
    public final int[] g = new int[2];

    public i1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1285d = layoutParams;
        this.f1282a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1283b = inflate;
        this.f1284c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(i1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131820553;
        layoutParams.flags = 24;
    }

    public final void a() {
        if (this.f1283b.getParent() != null) {
            ((WindowManager) this.f1282a.getSystemService("window")).removeView(this.f1283b);
        }
    }
}
