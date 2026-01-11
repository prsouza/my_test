package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryId;
import java.lang.reflect.Type;

public final class SentryIdSerializerAdapter implements w<SentryId> {
    private final SentryOptions options;

    public SentryIdSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(SentryId sentryId, Type type, v vVar) {
        if (sentryId == null) {
            return null;
        }
        try {
            return new u(sentryId.toString());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing SentryId", th2);
            return null;
        }
    }
}
