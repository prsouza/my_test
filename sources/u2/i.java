package u2;

import android.graphics.PointF;
import java.util.List;
import r2.a;
import r2.m;

public final class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f11664a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11665b;

    public i(b bVar, b bVar2) {
        this.f11664a = bVar;
        this.f11665b = bVar2;
    }

    public final a<PointF, PointF> a() {
        return new m(this.f11664a.a(), this.f11665b.a());
    }

    public final List<b3.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public final boolean c() {
        return this.f11664a.c() && this.f11665b.c();
    }
}
