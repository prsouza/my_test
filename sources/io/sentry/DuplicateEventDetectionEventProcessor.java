package io.sentry;

import io.sentry.protocol.SentryTransaction;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class DuplicateEventDetectionEventProcessor implements EventProcessor {
    private final Map<Throwable, Object> capturedObjects = Collections.synchronizedMap(new WeakHashMap());
    private final SentryOptions options;

    public DuplicateEventDetectionEventProcessor(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options are required");
    }

    private static List<Throwable> allCauses(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static <T> boolean containsAnyKey(Map<T, Object> map, List<T> list) {
        for (T containsKey : list) {
            if (map.containsKey(containsKey)) {
                return true;
            }
        }
        return false;
    }

    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        if (this.options.isEnableDeduplication()) {
            Throwable throwable = sentryEvent.getThrowable();
            if (throwable != null) {
                if (this.capturedObjects.containsKey(throwable) || containsAnyKey(this.capturedObjects, allCauses(throwable))) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", sentryEvent.getEventId());
                    return null;
                }
                this.capturedObjects.put(throwable, (Object) null);
            }
        } else {
            this.options.getLogger().log(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return sentryEvent;
    }

    public final /* synthetic */ SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        return b.b(this, sentryTransaction, obj);
    }
}
