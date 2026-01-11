package w;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import v.e;
import v.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f12484a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f12485b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f12486c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f12487a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f12488b;

        /* renamed from: c  reason: collision with root package name */
        public int f12489c;

        /* renamed from: d  reason: collision with root package name */
        public int f12490d;

        /* renamed from: e  reason: collision with root package name */
        public int f12491e;

        /* renamed from: f  reason: collision with root package name */
        public int f12492f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f12493h;
        public boolean i;

        /* renamed from: j  reason: collision with root package name */
        public int f12494j;
    }

    /* renamed from: w.b$b  reason: collision with other inner class name */
    public interface C0243b {
    }

    public b(f fVar) {
        this.f12486c = fVar;
    }

    public final boolean a(C0243b bVar, e eVar, int i) {
        a aVar = this.f12485b;
        e.b[] bVarArr = eVar.U;
        aVar.f12487a = bVarArr[0];
        aVar.f12488b = bVarArr[1];
        aVar.f12489c = eVar.r();
        this.f12485b.f12490d = eVar.k();
        a aVar2 = this.f12485b;
        aVar2.i = false;
        aVar2.f12494j = i;
        e.b bVar2 = aVar2.f12487a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z10 = aVar2.f12488b == bVar3;
        boolean z11 = z && eVar.Y > 0.0f;
        boolean z12 = z10 && eVar.Y > 0.0f;
        if (z11 && eVar.f12083t[0] == 4) {
            aVar2.f12487a = e.b.FIXED;
        }
        if (z12 && eVar.f12083t[1] == 4) {
            aVar2.f12488b = e.b.FIXED;
        }
        ((ConstraintLayout.c) bVar).b(eVar, aVar2);
        eVar.Q(this.f12485b.f12491e);
        eVar.L(this.f12485b.f12492f);
        a aVar3 = this.f12485b;
        eVar.E = aVar3.f12493h;
        eVar.I(aVar3.g);
        a aVar4 = this.f12485b;
        aVar4.f12494j = 0;
        return aVar4.i;
    }

    public final void b(f fVar, int i, int i10, int i11) {
        int i12 = fVar.f12056d0;
        int i13 = fVar.f12058e0;
        fVar.O(0);
        fVar.N(0);
        fVar.Q(i10);
        fVar.L(i11);
        fVar.O(i12);
        fVar.N(i13);
        f fVar2 = this.f12486c;
        fVar2.f12093u0 = i;
        fVar2.T();
    }

    public final void c(f fVar) {
        this.f12484a.clear();
        int size = fVar.f12108r0.size();
        for (int i = 0; i < size; i++) {
            e eVar = fVar.f12108r0.get(i);
            e.b[] bVarArr = eVar.U;
            e.b bVar = bVarArr[0];
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                this.f12484a.add(eVar);
            }
        }
        fVar.b0();
    }
}
