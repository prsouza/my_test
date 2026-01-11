package io.sentry.transport;

import io.sentry.SentryEnvelope;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.cache.c;
import java.util.ArrayList;
import java.util.Iterator;

public final class NoOpEnvelopeCache implements IEnvelopeCache {
    private static final NoOpEnvelopeCache instance = new NoOpEnvelopeCache();

    public static NoOpEnvelopeCache getInstance() {
        return instance;
    }

    public void discard(SentryEnvelope sentryEnvelope) {
    }

    public Iterator<SentryEnvelope> iterator() {
        return new ArrayList(0).iterator();
    }

    public final /* synthetic */ void store(SentryEnvelope sentryEnvelope) {
        c.a(this, sentryEnvelope);
    }

    public void store(SentryEnvelope sentryEnvelope, Object obj) {
    }
}
