package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.SentryId;
import java.lang.reflect.Type;

public final class SentryIdDeserializerAdapter implements o<SentryId> {
    private final SentryOptions options;

    public SentryIdDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public SentryId deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return new SentryId(pVar.e());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing SentryId", th2);
            return null;
        }
    }
}
