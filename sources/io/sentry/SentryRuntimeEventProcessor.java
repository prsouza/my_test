package io.sentry;

import io.sentry.protocol.SentryRuntime;
import io.sentry.protocol.SentryTransaction;

final class SentryRuntimeEventProcessor implements EventProcessor {
    private final String javaVendor;
    private final String javaVersion;

    public SentryRuntimeEventProcessor() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }

    public SentryRuntimeEventProcessor(String str, String str2) {
        this.javaVersion = str;
        this.javaVendor = str2;
    }

    private <T extends SentryBaseEvent> T process(T t10) {
        if (t10.getContexts().getRuntime() == null) {
            t10.getContexts().setRuntime(new SentryRuntime());
        }
        SentryRuntime runtime = t10.getContexts().getRuntime();
        if (runtime != null && runtime.getName() == null && runtime.getVersion() == null) {
            runtime.setName(this.javaVendor);
            runtime.setVersion(this.javaVersion);
        }
        return t10;
    }

    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        return (SentryEvent) process(sentryEvent);
    }

    public SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        return (SentryTransaction) process(sentryTransaction);
    }
}
