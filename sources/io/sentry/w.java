package io.sentry;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IHub f6932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SentryOptions f6933b;

    public /* synthetic */ w(IHub iHub, SentryOptions sentryOptions) {
        this.f6932a = iHub;
        this.f6933b = sentryOptions;
    }

    public final void run() {
        this.f6932a.flush(this.f6933b.getFlushTimeoutMillis());
    }
}
