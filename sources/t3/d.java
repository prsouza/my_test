package t3;

import android.graphics.Bitmap;
import r3.b;
import t3.f;

public final class d extends b<c> {
    public d(c cVar) {
        super(cVar);
    }

    public final void a() {
        ((c) this.f10563a).b().prepareToDraw();
    }

    public final int b() {
        f fVar = ((c) this.f10563a).f11292a.f11302a;
        return fVar.f11304a.f() + fVar.f11316o;
    }

    public final Class<c> c() {
        return c.class;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    public final void d() {
        this.f10563a.stop();
        c cVar = this.f10563a;
        cVar.f11295s = true;
        f fVar = cVar.f11292a.f11302a;
        fVar.f11306c.clear();
        Bitmap bitmap = fVar.f11313l;
        if (bitmap != null) {
            fVar.f11308e.e(bitmap);
            fVar.f11313l = null;
        }
        fVar.f11309f = false;
        f.a aVar = fVar.i;
        if (aVar != null) {
            fVar.f11307d.h(aVar);
            fVar.i = null;
        }
        f.a aVar2 = fVar.f11312k;
        if (aVar2 != null) {
            fVar.f11307d.h(aVar2);
            fVar.f11312k = null;
        }
        f.a aVar3 = fVar.f11315n;
        if (aVar3 != null) {
            fVar.f11307d.h(aVar3);
            fVar.f11315n = null;
        }
        fVar.f11304a.clear();
        fVar.f11311j = true;
    }
}
