package io.sentry.transport;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelope;
import io.sentry.util.Objects;
import java.io.OutputStream;

public final class StdoutTransport implements ITransport {
    private final ISerializer serializer;

    public StdoutTransport(ISerializer iSerializer) {
        this.serializer = (ISerializer) Objects.requireNonNull(iSerializer, "Serializer is required");
    }

    public void close() {
    }

    public void flush(long j10) {
        System.out.println("Flushing");
    }

    public final /* synthetic */ void send(SentryEnvelope sentryEnvelope) {
        b.a(this, sentryEnvelope);
    }

    public void send(SentryEnvelope sentryEnvelope, Object obj) {
        Objects.requireNonNull(sentryEnvelope, "SentryEnvelope is required");
        try {
            this.serializer.serialize(sentryEnvelope, (OutputStream) System.out);
        } catch (Throwable unused) {
        }
    }
}
