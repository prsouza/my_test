package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanId;
import java.lang.reflect.Type;

public final class SpanIdSerializerAdapter implements w<SpanId> {
    private final SentryOptions options;

    public SpanIdSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(SpanId spanId, Type type, v vVar) {
        if (spanId == null) {
            return null;
        }
        try {
            return new u(spanId.toString());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SpanId", th2);
            return null;
        }
    }
}
