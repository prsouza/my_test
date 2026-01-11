package io.sentry;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget f6885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SentryOptions f6886b;

    public /* synthetic */ h(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget sendFireAndForget, SentryOptions sentryOptions) {
        this.f6885a = sendFireAndForget;
        this.f6886b = sentryOptions;
    }

    public final void run() {
        SendCachedEnvelopeFireAndForgetIntegration.lambda$register$0(this.f6885a, this.f6886b);
    }
}
