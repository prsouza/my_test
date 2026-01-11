package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.cache.IEnvelopeCache;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class a implements RejectedExecutionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IEnvelopeCache f6928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ILogger f6929b;

    public /* synthetic */ a(IEnvelopeCache iEnvelopeCache, ILogger iLogger) {
        this.f6928a = iEnvelopeCache;
        this.f6929b = iLogger;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AsyncHttpTransport.lambda$initExecutor$0(this.f6928a, this.f6929b, runnable, threadPoolExecutor);
    }
}
