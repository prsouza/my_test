package n3;

import g3.h;
import java.io.InputStream;
import java.net.URL;
import m3.g;
import m3.o;
import m3.p;
import m3.s;

public final class e implements o<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final o<g, InputStream> f8898a;

    public static class a implements p<URL, InputStream> {
        public final o<URL, InputStream> b(s sVar) {
            return new e(sVar.b(g.class, InputStream.class));
        }
    }

    public e(o<g, InputStream> oVar) {
        this.f8898a = oVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        return this.f8898a.a(new g((URL) obj), i, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        URL url = (URL) obj;
        return true;
    }
}
