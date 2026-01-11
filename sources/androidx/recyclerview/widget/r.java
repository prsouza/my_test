package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class r extends s {
    public r(RecyclerView.n nVar) {
        super(nVar);
    }

    public final int b(View view) {
        return this.f2585a.A(view) + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
    }

    public final int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        Objects.requireNonNull(this.f2585a);
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f2364b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + oVar.topMargin + oVar.bottomMargin;
    }

    public final int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        Objects.requireNonNull(this.f2585a);
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f2364b;
        return view.getMeasuredWidth() + rect.left + rect.right + oVar.leftMargin + oVar.rightMargin;
    }

    public final int e(View view) {
        return this.f2585a.E(view) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
    }

    public final int f() {
        return this.f2585a.f2356q;
    }

    public final int g() {
        RecyclerView.n nVar = this.f2585a;
        return nVar.f2356q - nVar.J();
    }

    public final int h() {
        return this.f2585a.J();
    }

    public final int i() {
        return this.f2585a.f2354o;
    }

    public final int j() {
        return this.f2585a.f2353n;
    }

    public final int k() {
        return this.f2585a.M();
    }

    public final int l() {
        RecyclerView.n nVar = this.f2585a;
        return (nVar.f2356q - nVar.M()) - this.f2585a.J();
    }

    public final int n(View view) {
        this.f2585a.Q(view, this.f2587c);
        return this.f2587c.bottom;
    }

    public final int o(View view) {
        this.f2585a.Q(view, this.f2587c);
        return this.f2587c.top;
    }

    public final void p(int i) {
        this.f2585a.V(i);
    }
}
