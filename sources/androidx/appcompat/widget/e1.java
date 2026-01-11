package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import n.a;

public final class e1 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f1216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f1 f1217b;

    public e1(f1 f1Var) {
        this.f1217b = f1Var;
        this.f1216a = new a(f1Var.f1230a.getContext(), f1Var.i);
    }

    public final void onClick(View view) {
        f1 f1Var = this.f1217b;
        Window.Callback callback = f1Var.f1239l;
        if (callback != null && f1Var.f1240m) {
            callback.onMenuItemSelected(0, this.f1216a);
        }
    }
}
