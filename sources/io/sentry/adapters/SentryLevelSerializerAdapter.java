package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Locale;

public final class SentryLevelSerializerAdapter implements w<SentryLevel> {
    private final SentryOptions options;

    public SentryLevelSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(SentryLevel sentryLevel, Type type, v vVar) {
        if (sentryLevel == null) {
            return null;
        }
        try {
            return new u(sentryLevel.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SentryLevel", th2);
            return null;
        }
    }
}
