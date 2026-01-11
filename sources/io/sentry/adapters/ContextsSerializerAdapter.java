package io.sentry.adapters;

import i2.j;
import i2.p;
import i2.s;
import i2.t;
import i2.v;
import i2.w;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.protocol.Contexts;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;
import p9.f;
import p9.m;

public final class ContextsSerializerAdapter implements w<Contexts> {
    private final SentryOptions options;

    public ContextsSerializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    public p serialize(Contexts contexts, Type type, v vVar) {
        if (contexts == null) {
            return null;
        }
        s sVar = new s();
        for (Map.Entry entry : contexts.entrySet()) {
            try {
                j jVar = m.this.f9763c;
                Objects.requireNonNull(jVar);
                f fVar = new f();
                jVar.j(entry.getValue(), Object.class, fVar);
                p x02 = fVar.x0();
                if (x02 != null) {
                    sVar.g((String) entry.getKey(), x02);
                }
            } catch (t unused) {
                this.options.getLogger().log(SentryLevel.ERROR, "%s context key isn't serializable.", new Object[0]);
            }
        }
        return sVar;
    }
}
