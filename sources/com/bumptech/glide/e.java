package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f3524a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, Object> f3525a = new HashMap();
    }

    public e(a aVar) {
        this.f3524a = Collections.unmodifiableMap(new HashMap(aVar.f3525a));
    }

    public final boolean a(Class<Object> cls) {
        return this.f3524a.containsKey(cls);
    }
}
