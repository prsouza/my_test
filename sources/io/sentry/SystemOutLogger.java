package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

public final class SystemOutLogger implements ILogger {
    private String captureStackTrace(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    public void log(SentryLevel sentryLevel, String str, Throwable th2) {
        if (th2 == null) {
            log(sentryLevel, str, new Object[0]);
            return;
        }
        System.out.println(String.format("%s: %s\n%s", new Object[]{sentryLevel, String.format(str, new Object[]{th2.toString()}), captureStackTrace(th2)}));
    }

    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", new Object[]{sentryLevel, String.format(str, objArr)}));
    }

    public void log(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            log(sentryLevel, str, objArr);
            return;
        }
        System.out.println(String.format("%s: %s \n %s\n%s", new Object[]{sentryLevel, String.format(str, objArr), th2.toString(), captureStackTrace(th2)}));
    }
}
