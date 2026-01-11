package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Locale;

public final class SentryLevelDeserializerAdapter implements o<SentryLevel> {
    private final SentryOptions options;

    public SentryLevelDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public SentryLevel deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return SentryLevel.valueOf(pVar.e().toUpperCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SentryLevel", th2);
            return null;
        }
    }
}
