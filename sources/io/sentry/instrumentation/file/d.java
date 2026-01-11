package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class d implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileInputStream f6897a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f6898b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6899c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6900d;

    public /* synthetic */ d(SentryFileInputStream sentryFileInputStream, byte[] bArr, int i, int i10) {
        this.f6897a = sentryFileInputStream;
        this.f6898b = bArr;
        this.f6899c = i;
        this.f6900d = i10;
    }

    public final Object call() {
        return this.f6897a.lambda$read$2(this.f6898b, this.f6899c, this.f6900d);
    }
}
