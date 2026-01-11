package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryEnvelopeItem.CachedItem f6918a;

    public /* synthetic */ o(SentryEnvelopeItem.CachedItem cachedItem) {
        this.f6918a = cachedItem;
    }

    public final Object call() {
        return Integer.valueOf(this.f6918a.getBytes().length);
    }
}
