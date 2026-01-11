package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.DateUtils;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.lang.reflect.Type;
import java.util.Date;

public final class DateDeserializerAdapter implements o<Date> {
    private final SentryOptions options;

    public DateDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public Date deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return DateUtils.getDateTime(pVar.e());
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing millis timestamp format.", th2);
            return null;
        }
    }
}
