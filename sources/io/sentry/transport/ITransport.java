package io.sentry.transport;

import io.sentry.SentryEnvelope;
import java.io.Closeable;

public interface ITransport extends Closeable {
    void flush(long j10);

    void send(SentryEnvelope sentryEnvelope);

    void send(SentryEnvelope sentryEnvelope, Object obj);
}
