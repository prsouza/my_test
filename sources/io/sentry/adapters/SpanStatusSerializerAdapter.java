package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanStatus;
import java.lang.reflect.Type;
import java.util.Locale;

public final class SpanStatusSerializerAdapter implements w<SpanStatus> {
    private final SentryOptions options;

    public SpanStatusSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(SpanStatus spanStatus, Type type, v vVar) {
        if (spanStatus == null) {
            return null;
        }
        try {
            return new u(spanStatus.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SpanStatus", th2);
            return null;
        }
    }
}
