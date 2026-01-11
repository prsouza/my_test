package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class a0 extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2455a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2456b = new a();

    public class a extends RecyclerView.r {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2457a = false;

        public a() {
        }

        public final void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f2457a) {
                this.f2457a = false;
                a0.this.b();
            }
        }

        public final void b(RecyclerView recyclerView, int i, int i10) {
            if (i != 0 || i10 != 0) {
                this.f2457a = true;
            }
        }
    }

    public abstract int[] a(RecyclerView.n nVar, View view);

    public final void b() {
        RecyclerView.n layoutManager;
        View view;
        RecyclerView recyclerView = this.f2455a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            u uVar = (u) this;
            if (layoutManager.f()) {
                view = uVar.d(layoutManager, uVar.f(layoutManager));
            } else {
                view = layoutManager.e() ? uVar.d(layoutManager, uVar.e(layoutManager)) : null;
            }
            if (view != null) {
                int[] a10 = a(layoutManager, view);
                if (a10[0] != 0 || a10[1] != 0) {
                    this.f2455a.g0(a10[0], a10[1], false);
                }
            }
        }
    }
}
