package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.TimeZone;

public final class TimeZoneSerializerAdapter implements w<TimeZone> {
    private final SentryOptions options;

    public TimeZoneSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(TimeZone timeZone, Type type, v vVar) {
        if (timeZone == null) {
            return null;
        }
        try {
            return new u(timeZone.getID());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing TimeZone", th2);
            return null;
        }
    }
}
