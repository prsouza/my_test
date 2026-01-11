package io.sentry.instrumentation.file;

import io.sentry.instrumentation.file.FileIOSpanManager;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class b implements FileIOSpanManager.FileIOCallable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SentryFileInputStream f6893a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f6894b;

    public /* synthetic */ b(SentryFileInputStream sentryFileInputStream, AtomicInteger atomicInteger) {
        this.f6893a = sentryFileInputStream;
        this.f6894b = atomicInteger;
    }

    public final Object call() {
        return this.f6893a.lambda$read$0(this.f6894b);
    }
}
