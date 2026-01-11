package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.TimeZone;

public final class TimeZoneDeserializerAdapter implements o<TimeZone> {
    private final SentryOptions options;

    public TimeZoneDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public TimeZone deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return TimeZone.getTimeZone(pVar.e());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing TimeZone", th2);
            return null;
        }
    }
}
