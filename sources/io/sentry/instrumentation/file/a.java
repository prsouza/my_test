package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class a implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileInputStream f6891a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f6892b;

    public /* synthetic */ a(SentryFileInputStream sentryFileInputStream, long j10) {
        this.f6891a = sentryFileInputStream;
        this.f6892b = j10;
    }

    public final Object call() {
        return this.f6891a.lambda$skip$3(this.f6892b);
    }
}
