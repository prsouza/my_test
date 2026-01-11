package hb;

import android.content.Context;
import e.b;
import io.nodle.cash.ui.view.activity.LauncherActivity;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5915a;

    public e(f fVar) {
        this.f5915a = fVar;
    }

    public final void a(Context context) {
        f fVar = this.f5915a;
        if (!fVar.f5918x) {
            fVar.f5918x = true;
            ((m) fVar.a()).h((LauncherActivity) fVar);
        }
    }
}
