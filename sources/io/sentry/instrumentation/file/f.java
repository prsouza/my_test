package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class f implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileOutputStream f6903a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f6904b;

    public /* synthetic */ f(SentryFileOutputStream sentryFileOutputStream, byte[] bArr) {
        this.f6903a = sentryFileOutputStream;
        this.f6904b = bArr;
    }

    public final Object call() {
        return this.f6903a.lambda$write$1(this.f6904b);
    }
}
