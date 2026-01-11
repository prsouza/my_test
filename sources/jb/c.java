package jb;

import android.content.Context;
import e.b;
import io.nodle.cash.ui.view.activity.onboard.OnboardActivity;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7129a;

    public c(d dVar) {
        this.f7129a = dVar;
    }

    public final void a(Context context) {
        d dVar = this.f7129a;
        if (!dVar.f7132x) {
            dVar.f7132x = true;
            OnboardActivity onboardActivity = (OnboardActivity) dVar;
            ((i) dVar.a()).b();
        }
    }
}
