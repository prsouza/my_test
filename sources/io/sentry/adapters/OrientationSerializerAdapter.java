package io.sentry.adapters;

import i2.p;
import i2.u;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Device;
import java.lang.reflect.Type;
import java.util.Locale;

public final class OrientationSerializerAdapter implements w<Device.DeviceOrientation> {
    private final SentryOptions options;

    public OrientationSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(Device.DeviceOrientation deviceOrientation, Type type, v vVar) {
        if (deviceOrientation == null) {
            return null;
        }
        try {
            return new u(deviceOrientation.name().toLowerCase(Locale.ROOT));
        } catch (Throwable th2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Error when serializing DeviceOrientation", th2);
            return null;
        }
    }
}
