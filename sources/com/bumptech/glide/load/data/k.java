package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import j3.b;
import java.io.IOException;
import java.io.InputStream;
import p3.w;

public final class k implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final w f3576a;

    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final b f3577a;

        public a(b bVar) {
            this.f3577a = bVar;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final e b(Object obj) {
            return new k((InputStream) obj, this.f3577a);
        }
    }

    public k(InputStream inputStream, b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f3576a = wVar;
        wVar.mark(5242880);
    }

    public final void b() {
        this.f3576a.release();
    }

    /* renamed from: c */
    public final InputStream a() throws IOException {
        this.f3576a.reset();
        return this.f3576a;
    }
}
