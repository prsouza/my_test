package io.sentry;

import a.b;
import io.sentry.protocol.SentryId;
import org.slf4j.helpers.MessageFormatter;

public final class UserFeedback {
    private String comments;
    private String email;
    private final SentryId eventId;
    private String name;

    public UserFeedback(SentryId sentryId) {
        this(sentryId, (String) null, (String) null, (String) null);
    }

    public UserFeedback(SentryId sentryId, String str, String str2, String str3) {
        this.eventId = sentryId;
        this.name = str;
        this.email = str2;
        this.comments = str3;
    }

    public String getComments() {
        return this.comments;
    }

    public String getEmail() {
        return this.email;
    }

    public SentryId getEventId() {
        return this.eventId;
    }

    public String getName() {
        return this.name;
    }

    public void setComments(String str) {
        this.comments = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder q10 = b.q("UserFeedback{eventId=");
        q10.append(this.eventId);
        q10.append(", name='");
        q10.append(this.name);
        q10.append('\'');
        q10.append(", email='");
        q10.append(this.email);
        q10.append('\'');
        q10.append(", comments='");
        q10.append(this.comments);
        q10.append('\'');
        q10.append(MessageFormatter.DELIM_STOP);
        return q10.toString();
    }
}
