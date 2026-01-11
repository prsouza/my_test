package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class q extends s {
    public q(RecyclerView.n nVar) {
        super(nVar);
    }

    public final int b(View view) {
        return this.f2585a.D(view) + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
    }

    public final int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        Objects.requireNonNull(this.f2585a);
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f2364b;
        return view.getMeasuredWidth() + rect.left + rect.right + oVar.leftMargin + oVar.rightMargin;
    }

    public final int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        Objects.requireNonNull(this.f2585a);
        Rect rect = ((RecyclerView.o) view.getLayoutParams()).f2364b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + oVar.topMargin + oVar.bottomMargin;
    }

    public final int e(View view) {
        return this.f2585a.C(view) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
    }

    public final int f() {
        return this.f2585a.f2355p;
    }

    public final int g() {
        RecyclerView.n nVar = this.f2585a;
        return nVar.f2355p - nVar.L();
    }

    public final int h() {
        return this.f2585a.L();
    }

    public final int i() {
        return this.f2585a.f2353n;
    }

    public final int j() {
        return this.f2585a.f2354o;
    }

    public final int k() {
        return this.f2585a.K();
    }

    public final int l() {
        RecyclerView.n nVar = this.f2585a;
        return (nVar.f2355p - nVar.K()) - this.f2585a.L();
    }

    public final int n(View view) {
        this.f2585a.Q(view, this.f2587c);
        return this.f2587c.right;
    }

    public final int o(View view) {
        this.f2585a.Q(view, this.f2587c);
        return this.f2587c.left;
    }

    public final void p(int i) {
        this.f2585a.U(i);
    }
}
