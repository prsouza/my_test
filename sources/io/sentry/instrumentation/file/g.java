package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;

public final /* synthetic */ class g implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileOutputStream f6905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f6906b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6907c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f6908d;

    public /* synthetic */ g(SentryFileOutputStream sentryFileOutputStream, byte[] bArr, int i, int i10) {
        this.f6905a = sentryFileOutputStream;
        this.f6906b = bArr;
        this.f6907c = i;
        this.f6908d = i10;
    }

    public final Object call() {
        return this.f6905a.lambda$write$2(this.f6906b, this.f6907c, this.f6908d);
    }
}
