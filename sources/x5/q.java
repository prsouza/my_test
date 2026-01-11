package x5;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f12863a;

    public q(View view) {
        this.f12863a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f12863a.getContext().getSystemService("input_method")).showSoftInput(this.f12863a, 1);
    }
}
