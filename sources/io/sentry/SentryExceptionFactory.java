package io.sentry;

import com.github.mikephil.charting.BuildConfig;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.SentryStackTrace;
import io.sentry.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

final class SentryExceptionFactory {
    private final SentryStackTraceFactory sentryStackTraceFactory;

    public SentryExceptionFactory(SentryStackTraceFactory sentryStackTraceFactory2) {
        this.sentryStackTraceFactory = (SentryStackTraceFactory) Objects.requireNonNull(sentryStackTraceFactory2, "The SentryStackTraceFactory is required.");
    }

    private SentryException getSentryException(Throwable th2, Mechanism mechanism, Thread thread, boolean z) {
        Package packageR = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        SentryException sentryException = new SentryException();
        String message = th2.getMessage();
        if (packageR != null) {
            name = name.replace(packageR.getName() + ".", BuildConfig.FLAVOR);
        }
        String name2 = packageR != null ? packageR.getName() : null;
        List<SentryStackFrame> stackFrames = this.sentryStackTraceFactory.getStackFrames(th2.getStackTrace());
        if (stackFrames != null && !stackFrames.isEmpty()) {
            SentryStackTrace sentryStackTrace = new SentryStackTrace(stackFrames);
            if (z) {
                sentryStackTrace.setSnapshot(Boolean.TRUE);
            }
            sentryException.setStacktrace(sentryStackTrace);
        }
        if (thread != null) {
            sentryException.setThreadId(Long.valueOf(thread.getId()));
        }
        sentryException.setType(name);
        sentryException.setMechanism(mechanism);
        sentryException.setModule(name2);
        sentryException.setValue(message);
        return sentryException;
    }

    private List<SentryException> getSentryExceptions(Deque<SentryException> deque) {
        return new ArrayList(deque);
    }

    public Deque<SentryException> extractExceptionQueue(Throwable th2) {
        Thread thread;
        boolean z;
        Mechanism mechanism;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th2 != null && hashSet.add(th2)) {
            if (th2 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th2;
                mechanism = exceptionMechanismException.getExceptionMechanism();
                Throwable throwable = exceptionMechanismException.getThrowable();
                thread = exceptionMechanismException.getThread();
                Throwable th3 = throwable;
                z = exceptionMechanismException.isSnapshot();
                th2 = th3;
            } else {
                thread = Thread.currentThread();
                z = false;
                mechanism = null;
            }
            arrayDeque.addFirst(getSentryException(th2, mechanism, thread, z));
            th2 = th2.getCause();
        }
        return arrayDeque;
    }

    public List<SentryException> getSentryExceptions(Throwable th2) {
        return getSentryExceptions(extractExceptionQueue(th2));
    }
}
