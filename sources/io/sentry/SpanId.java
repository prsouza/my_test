package io.sentry;

import com.github.mikephil.charting.BuildConfig;
import io.sentry.util.Objects;
import java.util.UUID;

public final class SpanId {
    public static final SpanId EMPTY_ID = new SpanId(new UUID(0, 0).toString());
    private final String value;

    public SpanId() {
        this(UUID.randomUUID());
    }

    public SpanId(String str) {
        this.value = (String) Objects.requireNonNull(str, "value is required");
    }

    private SpanId(UUID uuid) {
        this(uuid.toString().replace("-", BuildConfig.FLAVOR).substring(0, 16));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SpanId.class != obj.getClass()) {
            return false;
        }
        return this.value.equals(((SpanId) obj).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value;
    }
}
