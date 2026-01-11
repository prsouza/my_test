package io.sentry;

import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Attachment f6912a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f6913b;

    public /* synthetic */ l(Attachment attachment, long j10) {
        this.f6912a = attachment;
        this.f6913b = j10;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromAttachment$9(this.f6912a, this.f6913b);
    }
}
