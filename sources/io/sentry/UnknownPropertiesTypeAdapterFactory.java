package io.sentry;

import aa.a;
import aa.c;
import g9.d;
import g9.g;
import g9.i;
import i2.a0;
import i2.j;
import i2.p;
import i2.r;
import i2.s;
import i2.t;
import i2.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.NoSuchElementException;

final class UnknownPropertiesTypeAdapterFactory implements a0 {
    private static final a0 instance = new UnknownPropertiesTypeAdapterFactory();

    public static final class UnknownPropertiesTypeAdapter<T extends IUnknownPropertiesConsumer> extends z<T> {
        private final Collection<String> propertyNames;
        private final z<T> typeAdapter;

        private UnknownPropertiesTypeAdapter(z<T> zVar, Collection<String> collection) {
            this.typeAdapter = zVar;
            this.propertyNames = collection;
        }

        /* access modifiers changed from: private */
        public static <T extends IUnknownPropertiesConsumer> z<T> create(Class<? super T> cls, z<T> zVar, d dVar, i2.d dVar2) {
            return new UnknownPropertiesTypeAdapter(zVar, getPropertyNames(cls, dVar, dVar2));
        }

        private static Collection<String> getPropertyNames(Class<?> cls, d dVar, i2.d dVar2) {
            ArrayList arrayList = new ArrayList();
            Class<? super Object> cls2 = cls;
            while (cls2.getSuperclass() != null && cls2 != Object.class) {
                for (Field field : cls2.getDeclaredFields()) {
                    if (!dVar.c(field, false)) {
                        arrayList.add(dVar2.a(field));
                    }
                }
                cls2 = cls2.getSuperclass();
            }
            return arrayList;
        }

        public T read(a aVar) {
            boolean z = aVar.f180b;
            aVar.f180b = true;
            try {
                p a10 = i.a(aVar);
                aVar.f180b = z;
                if (a10 instanceof r) {
                    return null;
                }
                s b10 = a10.b();
                HashMap hashMap = new HashMap();
                g gVar = g.this;
                g.e<K, V> eVar = gVar.f5290t.f5302s;
                int i = gVar.f5289s;
                while (true) {
                    g.e<K, V> eVar2 = gVar.f5290t;
                    if (!(eVar != eVar2)) {
                        T t10 = (IUnknownPropertiesConsumer) this.typeAdapter.fromJsonTree(b10);
                        if (!hashMap.isEmpty()) {
                            t10.acceptUnknownProperties(hashMap);
                        }
                        return t10;
                    } else if (eVar == eVar2) {
                        throw new NoSuchElementException();
                    } else if (gVar.f5289s == i) {
                        g.e<K, V> eVar3 = eVar.f5302s;
                        String str = (String) eVar.f5304u;
                        if (!this.propertyNames.contains(str)) {
                            hashMap.put(str, eVar.f5305v);
                        }
                        eVar = eVar3;
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
            } catch (StackOverflowError e10) {
                throw new t("Failed parsing JSON source: " + aVar + " to Json", e10);
            } catch (OutOfMemoryError e11) {
                throw new t("Failed parsing JSON source: " + aVar + " to Json", e11);
            } catch (Throwable th2) {
                aVar.f180b = z;
                throw th2;
            }
        }

        public void write(c cVar, T t10) {
            this.typeAdapter.write(cVar, t10);
        }
    }

    private UnknownPropertiesTypeAdapterFactory() {
    }

    public static a0 get() {
        return instance;
    }

    public <T> z<T> create(j jVar, x9.a<T> aVar) {
        if (!IUnknownPropertiesConsumer.class.isAssignableFrom(aVar.f13148a)) {
            return null;
        }
        return UnknownPropertiesTypeAdapter.create(aVar.f13148a, jVar.b(this, aVar), jVar.f5988f, jVar.g);
    }
}
