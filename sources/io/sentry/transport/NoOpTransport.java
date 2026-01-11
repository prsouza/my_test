package io.sentry.transport;

import io.sentry.SentryEnvelope;

public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    private NoOpTransport() {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    public void close() {
    }

    public void flush(long j10) {
    }

    public final /* synthetic */ void send(SentryEnvelope sentryEnvelope) {
        b.a(this, sentryEnvelope);
    }

    public void send(SentryEnvelope sentryEnvelope, Object obj) {
    }
}
