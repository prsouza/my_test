package n3;

import com.bumptech.glide.load.data.j;
import g3.h;
import java.io.InputStream;
import java.util.Objects;
import m3.g;
import m3.n;
import m3.o;
import m3.p;
import m3.s;

public final class a implements o<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g3.g<Integer> f8875b = g3.g.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    public final n<g, g> f8876a;

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    public static class C0164a implements p<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final n<g, g> f8877a = new n<>();

        public final o<g, InputStream> b(s sVar) {
            return new a(this.f8877a);
        }
    }

    public a(n<g, g> nVar) {
        this.f8876a = nVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Queue<m3.n$a<?>>, java.util.ArrayDeque] */
    public final o.a a(Object obj, int i, int i10, h hVar) {
        g gVar = (g) obj;
        n<g, g> nVar = this.f8876a;
        if (nVar != null) {
            n.a a10 = n.a.a(gVar);
            g a11 = nVar.f8421a.a(a10);
            ? r02 = n.a.f8422d;
            synchronized (r02) {
                r02.offer(a10);
            }
            g gVar2 = a11;
            if (gVar2 == null) {
                n<g, g> nVar2 = this.f8876a;
                Objects.requireNonNull(nVar2);
                nVar2.f8421a.d(n.a.a(gVar), gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new o.a(gVar, new j(gVar, ((Integer) hVar.c(f8875b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
