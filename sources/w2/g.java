package w2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import o2.l;
import q2.c;
import t2.e;
import v2.n;

public final class g extends b {
    public final c z;

    public g(l lVar, e eVar) {
        super(lVar, eVar);
        c cVar = new c(lVar, this, new n("__container", eVar.f12584a, false));
        this.z = cVar;
        cVar.c(Collections.emptyList(), Collections.emptyList());
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        this.z.a(rectF, this.f12568m, z10);
    }

    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.z.e(canvas, matrix, i);
    }

    public final void o(e eVar, int i, List<e> list, e eVar2) {
        this.z.g(eVar, i, list, eVar2);
    }
}
