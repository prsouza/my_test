package io.sentry.protocol;

import a8.a;
import com.github.mikephil.charting.BuildConfig;
import java.util.UUID;

public final class SentryId {
    public static final SentryId EMPTY_ID = new SentryId(new UUID(0, 0));
    private final UUID uuid;

    public SentryId() {
        this((UUID) null);
    }

    public SentryId(String str) {
        this.uuid = fromStringSentryId(str);
    }

    public SentryId(UUID uuid2) {
        this.uuid = uuid2 == null ? UUID.randomUUID() : uuid2;
    }

    private UUID fromStringSentryId(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException(a.c("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ", str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SentryId.class != obj.getClass()) {
            return false;
        }
        return this.uuid.compareTo(((SentryId) obj).uuid) == 0;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    public String toString() {
        return this.uuid.toString().replace("-", BuildConfig.FLAVOR);
    }
}
