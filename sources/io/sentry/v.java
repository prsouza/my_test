package io.sentry;

public final /* synthetic */ class v implements SpanFinishedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryTracer f6931a;

    public /* synthetic */ v(SentryTracer sentryTracer) {
        this.f6931a = sentryTracer;
    }

    public final void execute(Span span) {
        this.f6931a.lambda$createChild$0(span);
    }
}
