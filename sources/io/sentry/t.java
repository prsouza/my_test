package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6927a;

    public /* synthetic */ t(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6927a = cachedItem;
    }

    public final Object call() {
        return Integer.valueOf(this.f6927a.getBytes().length);
    }
}
