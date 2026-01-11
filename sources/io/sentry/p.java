package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6919a;

    public /* synthetic */ p(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6919a = cachedItem;
    }

    public final Object call() {
        return this.f6919a.getBytes();
    }
}
