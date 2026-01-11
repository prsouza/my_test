package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import java.lang.reflect.Type;
import java.util.Locale;

public final class SpanStatusDeserializerAdapter implements o<SpanStatus> {
    private final SentryOptions options;

    public SpanStatusDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public SpanStatus deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return SpanStatus.valueOf(pVar.e().toUpperCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SpanStatus", th2);
            return null;
        }
    }
}
