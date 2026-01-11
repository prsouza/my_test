package m3;

import android.net.Uri;
import g3.h;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m3.o;

public final class y<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f8467b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final o<g, Data> f8468a;

    public static class a implements p<Uri, InputStream> {
        public final o<Uri, InputStream> b(s sVar) {
            return new y(sVar.b(g.class, InputStream.class));
        }
    }

    public y(o<g, Data> oVar) {
        this.f8468a = oVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        return this.f8468a.a(new g(((Uri) obj).toString()), i, i10, hVar);
    }

    public final boolean b(Object obj) {
        return f8467b.contains(((Uri) obj).getScheme());
    }
}
