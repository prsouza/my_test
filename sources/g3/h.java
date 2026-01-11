package g3;

import c4.b;
import g3.g;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;
import s.a;

public final class h implements f {

    /* renamed from: b  reason: collision with root package name */
    public final a<g<?>, Object> f5237b = new b();

    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            a<g<?>, Object> aVar = this.f5237b;
            if (i < aVar.f10843c) {
                g i10 = aVar.i(i);
                Object m10 = this.f5237b.m(i);
                g.b<T> bVar = i10.f5234b;
                if (i10.f5236d == null) {
                    i10.f5236d = i10.f5235c.getBytes(f.f5231a);
                }
                bVar.a(i10.f5236d, m10, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(g<T> gVar) {
        if (this.f5237b.containsKey(gVar)) {
            return this.f5237b.getOrDefault(gVar, null);
        }
        return gVar.f5233a;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [c4.b, s.a<g3.g<?>, java.lang.Object>] */
    public final void d(h hVar) {
        this.f5237b.j(hVar.f5237b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5237b.equals(((h) obj).f5237b);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [c4.b, s.a<g3.g<?>, java.lang.Object>] */
    public final int hashCode() {
        return this.f5237b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Options{values=");
        d10.append(this.f5237b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
