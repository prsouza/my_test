package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6930a;

    public /* synthetic */ u(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6930a = cachedItem;
    }

    public final Object call() {
        return Integer.valueOf(this.f6930a.getBytes().length);
    }
}
