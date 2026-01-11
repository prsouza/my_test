package h1;

import a5.c;
import android.content.Context;
import b5.b;
import e6.e;
import io.nodle.cash.R;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import q.a;

public final /* synthetic */ class f implements a, b.a, Sentry.OptionsConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5698a;

    public /* synthetic */ f(Object obj) {
        this.f5698a = obj;
    }

    public final Object a() {
        return ((c) this.f5698a).c();
    }

    public final Object apply(Object obj) {
        ((l1.a) obj).q((String) this.f5698a);
        return null;
    }

    public final void configure(SentryOptions sentryOptions) {
        a9.c cVar = (a9.c) this.f5698a;
        e.D(cVar, "this$0");
        e.D(sentryOptions, "options");
        sentryOptions.setDsn("https://89596e637b0144e9833d871f5707d3bc@o895878.ingest.sentry.io/5840975");
        Double valueOf = Double.valueOf(1.0d);
        sentryOptions.setSampleRate(valueOf);
        sentryOptions.setTracesSampleRate(valueOf);
        String string = ((Context) cVar.f176b).getString(R.string.gitSHA);
        e.C(string, "context.getString(R.string.gitSHA)");
        sentryOptions.setRelease(string);
        sentryOptions.setEnableAutoSessionTracking(true);
        sentryOptions.setSessionTrackingIntervalMillis(5000);
    }
}
