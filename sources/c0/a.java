package c0;

import android.app.Activity;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f3052a;

    public a(Activity activity) {
        this.f3052a = activity;
    }

    public final void run() {
        if (!this.f3052a.isFinishing() && !d.b(this.f3052a)) {
            this.f3052a.recreate();
        }
    }
}
