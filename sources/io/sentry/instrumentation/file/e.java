package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class e implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileOutputStream f6901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6902b;

    public /* synthetic */ e(SentryFileOutputStream sentryFileOutputStream, int i) {
        this.f6901a = sentryFileOutputStream;
        this.f6902b = i;
    }

    public final Object call() {
        return this.f6901a.lambda$write$0(this.f6902b);
    }
}
