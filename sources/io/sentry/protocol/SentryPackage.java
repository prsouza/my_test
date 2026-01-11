package io.sentry.protocol;

import com.github.mikephil.charting.BuildConfig;
import io.sentry.IUnknownPropertiesConsumer;
import io.sentry.util.Objects;
import java.util.Map;

public final class SentryPackage implements IUnknownPropertiesConsumer {
    private String name;
    private Map<String, Object> unknown;
    private String version;

    @Deprecated
    public SentryPackage() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }

    public SentryPackage(String str, String str2) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
        this.version = (String) Objects.requireNonNull(str2, "version is required.");
    }

    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = map;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setName(String str) {
        this.name = (String) Objects.requireNonNull(str, "name is required.");
    }

    public void setVersion(String str) {
        this.version = (String) Objects.requireNonNull(str, "version is required.");
    }
}
