package v2;

import android.graphics.Path;
import o2.l;
import org.slf4j.helpers.MessageFormatter;
import q2.b;
import q2.f;
import u2.a;
import u2.d;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12230a;

    /* renamed from: b  reason: collision with root package name */
    public final Path.FillType f12231b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12232c;

    /* renamed from: d  reason: collision with root package name */
    public final a f12233d;

    /* renamed from: e  reason: collision with root package name */
    public final d f12234e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12235f;

    public m(String str, boolean z, Path.FillType fillType, a aVar, d dVar, boolean z10) {
        this.f12232c = str;
        this.f12230a = z;
        this.f12231b = fillType;
        this.f12233d = aVar;
        this.f12234e = dVar;
        this.f12235f = z10;
    }

    public final b a(l lVar, w2.b bVar) {
        return new f(lVar, bVar, this);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("ShapeFill{color=, fillEnabled=");
        d10.append(this.f12230a);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
