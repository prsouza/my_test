package io.sentry.adapters;

import g9.g;
import i2.j;
import i2.n;
import i2.o;
import i2.p;
import i2.r;
import i2.s;
import i2.t;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.protocol.App;
import io.sentry.protocol.Browser;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.Gpu;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.SentryRuntime;
import java.lang.reflect.Type;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Objects;
import p9.e;
import p9.m;

public final class ContextsDeserializerAdapter implements o<Contexts> {
    private final SentryOptions options;

    public ContextsDeserializerAdapter(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private <T> T parseObject(n nVar, s sVar, String str, Class<T> cls) {
        g.e<String, p> a10 = sVar.f6005a.a(str);
        s sVar2 = (s) (a10 != null ? a10.f5305v : null);
        if (sVar2 == null || (sVar2 instanceof r)) {
            return null;
        }
        j jVar = m.this.f9763c;
        Objects.requireNonNull(jVar);
        return jVar.d(new e(sVar2), cls);
    }

    public Contexts deserialize(p pVar, Type type, n nVar) {
        String str;
        if (pVar != null) {
            try {
                if (!(pVar instanceof r)) {
                    Contexts contexts = new Contexts();
                    s b10 = pVar.b();
                    if (!(b10 instanceof r)) {
                        g gVar = g.this;
                        g.e<K, V> eVar = gVar.f5290t.f5302s;
                        int i = gVar.f5289s;
                        while (true) {
                            g.e<K, V> eVar2 = gVar.f5290t;
                            if (eVar != eVar2) {
                                if (eVar == eVar2) {
                                    throw new NoSuchElementException();
                                } else if (gVar.f5289s == i) {
                                    g.e<K, V> eVar3 = eVar.f5302s;
                                    str = (String) eVar.f5304u;
                                    char c10 = 65535;
                                    switch (str.hashCode()) {
                                        case -1335157162:
                                            if (str.equals(Device.TYPE)) {
                                                c10 = 2;
                                                break;
                                            }
                                            break;
                                        case 3556:
                                            if (str.equals(OperatingSystem.TYPE)) {
                                                c10 = 3;
                                                break;
                                            }
                                            break;
                                        case 96801:
                                            if (str.equals(App.TYPE)) {
                                                c10 = 0;
                                                break;
                                            }
                                            break;
                                        case 102572:
                                            if (str.equals(Gpu.TYPE)) {
                                                c10 = 5;
                                                break;
                                            }
                                            break;
                                        case 110620997:
                                            if (str.equals(SpanContext.TYPE)) {
                                                c10 = 6;
                                                break;
                                            }
                                            break;
                                        case 150940456:
                                            if (str.equals(Browser.TYPE)) {
                                                c10 = 1;
                                                break;
                                            }
                                            break;
                                        case 1550962648:
                                            if (str.equals(SentryRuntime.TYPE)) {
                                                c10 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            App app = (App) parseObject(nVar, b10, str, App.class);
                                            if (app == null) {
                                                break;
                                            } else {
                                                contexts.setApp(app);
                                                break;
                                            }
                                        case 1:
                                            Browser browser = (Browser) parseObject(nVar, b10, str, Browser.class);
                                            if (browser == null) {
                                                break;
                                            } else {
                                                contexts.setBrowser(browser);
                                                break;
                                            }
                                        case 2:
                                            Device device = (Device) parseObject(nVar, b10, str, Device.class);
                                            if (device == null) {
                                                break;
                                            } else {
                                                contexts.setDevice(device);
                                                break;
                                            }
                                        case 3:
                                            OperatingSystem operatingSystem = (OperatingSystem) parseObject(nVar, b10, str, OperatingSystem.class);
                                            if (operatingSystem == null) {
                                                break;
                                            } else {
                                                contexts.setOperatingSystem(operatingSystem);
                                                break;
                                            }
                                        case 4:
                                            SentryRuntime sentryRuntime = (SentryRuntime) parseObject(nVar, b10, str, SentryRuntime.class);
                                            if (sentryRuntime == null) {
                                                break;
                                            } else {
                                                contexts.setRuntime(sentryRuntime);
                                                break;
                                            }
                                        case 5:
                                            Gpu gpu = (Gpu) parseObject(nVar, b10, str, Gpu.class);
                                            if (gpu == null) {
                                                break;
                                            } else {
                                                contexts.setGpu(gpu);
                                                break;
                                            }
                                        case 6:
                                            SpanContext spanContext = (SpanContext) parseObject(nVar, b10, str, SpanContext.class);
                                            if (spanContext == null) {
                                                break;
                                            } else {
                                                contexts.setTrace(spanContext);
                                                break;
                                            }
                                        default:
                                            g.e<String, p> a10 = b10.f6005a.a(str);
                                            p pVar2 = (p) (a10 != null ? a10.f5305v : null);
                                            if (pVar2 != null && !(pVar2 instanceof r)) {
                                                Class<Object> cls = Object.class;
                                                j jVar = m.this.f9763c;
                                                Objects.requireNonNull(jVar);
                                                contexts.put(str, jVar.d(new e(pVar2), cls));
                                                break;
                                            }
                                    }
                                    eVar = eVar3;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            }
                        }
                    }
                    return contexts;
                }
            } catch (t e10) {
                this.options.getLogger().log(SentryLevel.ERROR, e10, "Error when deserializing the %s key.", str);
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error when deserializing Contexts", th2);
            }
        }
        return null;
    }
}
