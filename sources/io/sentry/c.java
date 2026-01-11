package io.sentry;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6880b;

    public /* synthetic */ c(Object obj, int i) {
        this.f6879a = i;
        this.f6880b = obj;
    }

    public final Object call() {
        switch (this.f6879a) {
            case 0:
                return ((HostnameCache) this.f6880b).lambda$updateCache$1();
            default:
                return ((SentryEnvelopeItem.CachedItem) this.f6880b).getBytes();
        }
    }
}
