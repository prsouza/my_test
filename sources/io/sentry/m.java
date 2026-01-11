package io.sentry;

import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ISerializer f6914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SentryBaseEvent f6915b;

    public /* synthetic */ m(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) {
        this.f6914a = iSerializer;
        this.f6915b = sentryBaseEvent;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromEvent$3(this.f6914a, this.f6915b);
    }
}
