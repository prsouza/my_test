package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Map;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final e.a<?> f3563b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, e.a<?>> f3564a = new HashMap();

    public class a implements e.a<Object> {
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3565a;

        public b(Object obj) {
            this.f3565a = obj;
        }

        public final Object a() {
            return this.f3565a;
        }

        public final void b() {
        }
    }
}
