package a8;

import a8.c;
import android.util.JsonReader;
import io.sentry.Sentry;
import io.sentry.SentryOptions;

public final /* synthetic */ class b implements c.a, Sentry.OptionsConfiguration {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f168a = new b();

    public final Object a(JsonReader jsonReader) {
        return c.b(jsonReader);
    }

    public final void configure(SentryOptions sentryOptions) {
        sentryOptions.setEnableExternalConfiguration(true);
    }
}
