package io.sentry;

import io.sentry.protocol.SentryTransaction;

public interface EventProcessor {
    SentryEvent process(SentryEvent sentryEvent, Object obj);

    SentryTransaction process(SentryTransaction sentryTransaction, Object obj);
}
