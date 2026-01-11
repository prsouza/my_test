package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6926a;

    public /* synthetic */ s(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6926a = cachedItem;
    }

    public final Object call() {
        return Integer.valueOf(this.f6926a.getBytes().length);
    }
}
