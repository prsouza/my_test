package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6924a;

    public /* synthetic */ q(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6924a = cachedItem;
    }

    public final Object call() {
        return this.f6924a.getBytes();
    }
}
