package io.sentry.transport;

import io.sentry.SentryEnvelope;

public final /* synthetic */ class b {
    public static void a(ITransport iTransport, SentryEnvelope sentryEnvelope) {
        iTransport.send(sentryEnvelope, (Object) null);
    }
}
