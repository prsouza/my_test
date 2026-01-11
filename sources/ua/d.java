package ua;

import android.app.Application;
import e6.e;
import io.nodle.cash.data.local.CashDatabase;
import io.sentry.protocol.App;
import ra.a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f11769a = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final a f11770b;

    public d(Application application) {
        e.D(application, App.TYPE);
        this.f11770b = CashDatabase.f6682n.a(application).r();
    }
}
