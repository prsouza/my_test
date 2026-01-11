package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6925a;

    public /* synthetic */ r(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6925a = cachedItem;
    }

    public final Object call() {
        return this.f6925a.getBytes();
    }
}
