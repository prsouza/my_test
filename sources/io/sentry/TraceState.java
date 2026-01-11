package io.sentry;

import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Map;

public final class TraceState {
    private String environment;
    private String publicKey;
    private String release;
    private SentryId traceId;
    private String transaction;
    private TraceStateUser user;

    public static final class TraceStateUser {

        /* renamed from: id  reason: collision with root package name */
        private String f6877id;
        private String segment;

        public TraceStateUser(User user) {
            if (user != null) {
                this.f6877id = user.getId();
                this.segment = getSegment(user);
            }
        }

        public TraceStateUser(String str, String str2) {
            this.f6877id = str;
            this.segment = str2;
        }

        private static String getSegment(User user) {
            Map<String, String> others = user.getOthers();
            if (others != null) {
                return others.get("segment");
            }
            return null;
        }

        public String getId() {
            return this.f6877id;
        }

        public String getSegment() {
            return this.segment;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TraceState(ITransaction iTransaction, User user2, SentryOptions sentryOptions) {
        this(iTransaction.getSpanContext().getTraceId(), new Dsn(sentryOptions.getDsn()).getPublicKey(), sentryOptions.getRelease(), sentryOptions.getEnvironment(), user2 != null ? new TraceStateUser(user2) : null, iTransaction.getName());
    }

    public TraceState(SentryId sentryId, String str) {
        this(sentryId, str, (String) null, (String) null, (TraceStateUser) null, (String) null);
    }

    public TraceState(SentryId sentryId, String str, String str2, String str3, TraceStateUser traceStateUser, String str4) {
        this.traceId = sentryId;
        this.publicKey = str;
        this.release = str2;
        this.environment = str3;
        this.user = traceStateUser;
        this.transaction = str4;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRelease() {
        return this.release;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public TraceStateUser getUser() {
        return this.user;
    }
}
