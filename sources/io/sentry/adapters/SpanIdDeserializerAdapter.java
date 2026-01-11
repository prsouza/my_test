package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanId;
import java.lang.reflect.Type;

public final class SpanIdDeserializerAdapter implements o<SpanId> {
    private final SentryOptions options;

    public SpanIdDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public SpanId deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return new SpanId(pVar.e());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SpanId", th2);
            return null;
        }
    }
}
