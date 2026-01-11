package fb;

import android.app.Application;
import dagger.hilt.android.internal.managers.d;
import dagger.hilt.android.internal.managers.e;
import io.nodle.cash.ui.CashApp;
import n9.b;

public abstract class h extends Application implements b {

    /* renamed from: a  reason: collision with root package name */
    public final d f5082a = new d(new a());

    public class a implements e {
        public a() {
        }
    }

    public final Object a() {
        return this.f5082a.a();
    }

    public void onCreate() {
        ((a) this.f5082a.a()).a((CashApp) this);
        super.onCreate();
    }
}
