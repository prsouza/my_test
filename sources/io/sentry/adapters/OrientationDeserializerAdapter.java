package io.sentry.adapters;

import i2.n;
import i2.o;
import i2.p;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.lang.reflect.Type;
import java.util.Locale;

public final class OrientationDeserializerAdapter implements o<Device.DeviceOrientation> {
    private final SentryOptions options;

    public OrientationDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public Device.DeviceOrientation deserialize(p pVar, Type type, n nVar) {
        if (pVar == null) {
            return null;
        }
        try {
            return Device.DeviceOrientation.valueOf(pVar.e().toUpperCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing DeviceOrientation", th2);
            return null;
        }
    }
}
