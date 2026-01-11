package io.sentry;

import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ISerializer f6916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Session f6917b;

    public /* synthetic */ n(ISerializer iSerializer, Session session) {
        this.f6916a = iSerializer;
        this.f6917b = session;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromSession$0(this.f6916a, this.f6917b);
    }
}
