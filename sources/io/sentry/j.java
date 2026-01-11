package io.sentry;

import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import java.io.File;

public final /* synthetic */ class j {
    public static boolean a(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory sendFireAndForgetFactory, String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.log(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    public static SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget b(SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForgetFactory sendFireAndForgetFactory, DirectoryProcessor directoryProcessor, String str, ILogger iLogger) {
        return new i(iLogger, str, directoryProcessor, new File(str));
    }

    public static /* synthetic */ void c(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.log(sentryLevel, "Started processing cached files from %s", str);
        directoryProcessor.processDirectory(file);
        iLogger.log(sentryLevel, "Finished processing cached files from %s", str);
    }
}
