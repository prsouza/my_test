package io.sentry;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import java.io.File;

public final /* synthetic */ class i implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ILogger f6887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f6888b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ DirectoryProcessor f6889c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ File f6890d;

    public /* synthetic */ i(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
        this.f6887a = iLogger;
        this.f6888b = str;
        this.f6889c = directoryProcessor;
        this.f6890d = file;
    }

    public final void send() {
        j.c(this.f6887a, this.f6888b, this.f6889c, this.f6890d);
    }
}
