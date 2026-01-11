package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public final class g1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        h1 h1Var = h1.f1266y;
        if (h1Var != null && h1Var.f1267a == view) {
            h1.c((h1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            h1 h1Var2 = h1.z;
            if (h1Var2 != null && h1Var2.f1267a == view) {
                h1Var2.b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new h1(view, charSequence);
    }
}
