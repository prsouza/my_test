package v2;

import a.a;
import o2.l;
import org.slf4j.helpers.MessageFormatter;
import q2.b;
import q2.p;
import u2.h;

public final class o implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12239a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12240b;

    /* renamed from: c  reason: collision with root package name */
    public final h f12241c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12242d;

    public o(String str, int i, h hVar, boolean z) {
        this.f12239a = str;
        this.f12240b = i;
        this.f12241c = hVar;
        this.f12242d = z;
    }

    public final b a(l lVar, w2.b bVar) {
        return new p(lVar, bVar, this);
    }

    public final String toString() {
        StringBuilder d10 = a.d("ShapePath{name=");
        d10.append(this.f12239a);
        d10.append(", index=");
        d10.append(this.f12240b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
