package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.DateUtils;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Date;

public final class DateSerializerAdapter implements w<Date> {
    private final SentryOptions options;

    public DateSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(Date date, Type type, v vVar) {
        if (date == null) {
            return null;
        }
        try {
            return new u(DateUtils.getTimestamp(date));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing Date", th2);
            return null;
        }
    }
}
