package v2;

import a.a;
import android.graphics.PointF;
import o2.l;
import org.slf4j.helpers.MessageFormatter;
import q2.n;
import u2.b;
import u2.f;
import u2.m;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f12217a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f12218b;

    /* renamed from: c  reason: collision with root package name */
    public final f f12219c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12220d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12221e;

    public j(String str, m<PointF, PointF> mVar, f fVar, b bVar, boolean z) {
        this.f12217a = str;
        this.f12218b = mVar;
        this.f12219c = fVar;
        this.f12220d = bVar;
        this.f12221e = z;
    }

    public final q2.b a(l lVar, w2.b bVar) {
        return new n(lVar, bVar, this);
    }

    public final String toString() {
        StringBuilder d10 = a.d("RectangleShape{position=");
        d10.append(this.f12218b);
        d10.append(", size=");
        d10.append(this.f12219c);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
