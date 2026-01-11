package io.sentry;

import io.sentry.cache.EnvelopeCache;
import io.sentry.protocol.SentryTransaction;

public enum SentryItemType {
    Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Unknown("__unknown__");
    
    private final String itemType;

    private SentryItemType(String str) {
        this.itemType = str;
    }

    public static SentryItemType resolve(Object obj) {
        return obj instanceof SentryEvent ? Event : obj instanceof SentryTransaction ? Transaction : obj instanceof Session ? Session : Attachment;
    }

    public String getItemType() {
        return this.itemType;
    }
}
