package io.sentry;

import io.sentry.Scope;

public final /* synthetic */ class k implements Scope.IWithSession {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryClient f6909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SentryEvent f6910b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6911c;

    public /* synthetic */ k(SentryClient sentryClient, SentryEvent sentryEvent, Object obj) {
        this.f6909a = sentryClient;
        this.f6910b = sentryEvent;
        this.f6911c = obj;
    }

    public final void accept(Session session) {
        this.f6909a.lambda$updateSessionData$0(this.f6910b, this.f6911c, session);
    }
}
