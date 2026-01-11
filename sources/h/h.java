package h;

import android.os.Build;
import android.view.View;
import g0.b;
import n0.e0;
import n0.n;
import n0.x;

public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f5579a;

    public h(g gVar) {
        this.f5579a = gVar;
    }

    public final e0 a(View view, e0 e0Var) {
        e0.e eVar;
        int f10 = e0Var.f();
        int Z = this.f5579a.Z(e0Var);
        if (f10 != Z) {
            int d10 = e0Var.d();
            int e10 = e0Var.e();
            int c10 = e0Var.c();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                eVar = new e0.d(e0Var);
            } else if (i >= 29) {
                eVar = new e0.c(e0Var);
            } else {
                eVar = new e0.b(e0Var);
            }
            eVar.d(b.b(d10, Z, e10, c10));
            e0Var = eVar.b();
        }
        return x.k(view, e0Var);
    }
}
