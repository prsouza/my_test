package v2;

import a.a;
import java.util.Arrays;
import java.util.List;
import o2.l;
import org.slf4j.helpers.MessageFormatter;
import q2.b;
import q2.c;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12236a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f12237b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12238c;

    public n(String str, List<b> list, boolean z) {
        this.f12236a = str;
        this.f12237b = list;
        this.f12238c = z;
    }

    public final b a(l lVar, w2.b bVar) {
        return new c(lVar, bVar, this);
    }

    public final String toString() {
        StringBuilder d10 = a.d("ShapeGroup{name='");
        d10.append(this.f12236a);
        d10.append("' Shapes: ");
        d10.append(Arrays.toString(this.f12237b.toArray()));
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
