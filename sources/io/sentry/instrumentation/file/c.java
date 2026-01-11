package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class c implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileInputStream f6895a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f6896b;

    public /* synthetic */ c(SentryFileInputStream sentryFileInputStream, byte[] bArr) {
        this.f6895a = sentryFileInputStream;
        this.f6896b = bArr;
    }

    public final Object call() {
        return this.f6895a.lambda$read$1(this.f6896b);
    }
}
