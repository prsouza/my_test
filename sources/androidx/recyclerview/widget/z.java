package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public abstract class z extends RecyclerView.k {
    public boolean g = true;

    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.k.c cVar, RecyclerView.k.c cVar2) {
        int i;
        int i10;
        int i11 = cVar.f2339a;
        int i12 = cVar.f2340b;
        if (b0Var2.t()) {
            int i13 = cVar.f2339a;
            i = cVar.f2340b;
            i10 = i13;
        } else {
            i10 = cVar2.f2339a;
            i = cVar2.f2340b;
        }
        k kVar = (k) this;
        if (b0Var == b0Var2) {
            return kVar.h(b0Var, i11, i12, i10, i);
        }
        float translationX = b0Var.f2311a.getTranslationX();
        float translationY = b0Var.f2311a.getTranslationY();
        float alpha = b0Var.f2311a.getAlpha();
        kVar.m(b0Var);
        b0Var.f2311a.setTranslationX(translationX);
        b0Var.f2311a.setTranslationY(translationY);
        b0Var.f2311a.setAlpha(alpha);
        kVar.m(b0Var2);
        b0Var2.f2311a.setTranslationX((float) (-((int) (((float) (i10 - i11)) - translationX))));
        b0Var2.f2311a.setTranslationY((float) (-((int) (((float) (i - i12)) - translationY))));
        b0Var2.f2311a.setAlpha(0.0f);
        kVar.f2508k.add(new k.a(b0Var, b0Var2, i11, i12, i10, i));
        return true;
    }

    public abstract boolean h(RecyclerView.b0 b0Var, int i, int i10, int i11, int i12);
}
