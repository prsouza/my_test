package l6;

import android.os.Bundle;
import t6.m;

public final class n extends j {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f7936c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(r rVar, m mVar) {
        super(rVar, mVar);
        this.f7936c = rVar;
    }

    public final void i(Bundle bundle, Bundle bundle2) {
        super.i(bundle, bundle2);
        if (!this.f7936c.f8006f.compareAndSet(true, false)) {
            r.g.g("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f7936c.zzf();
        }
    }

    public final void zzd(Bundle bundle) {
        this.f7936c.f8005e.c(this.f7902a);
        int i = bundle.getInt("error_code");
        r.g.c("onError(%d)", Integer.valueOf(i));
        this.f7902a.a(new a(i));
    }
}
