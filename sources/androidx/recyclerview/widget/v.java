package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;

public final class v implements b.C0021b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2591a;

    public v(RecyclerView recyclerView) {
        this.f2591a = recyclerView;
    }

    public final View a(int i) {
        return this.f2591a.getChildAt(i);
    }

    public final int b() {
        return this.f2591a.getChildCount();
    }

    public final int c(View view) {
        return this.f2591a.indexOfChild(view);
    }

    public final void d(int i) {
        View childAt = this.f2591a.getChildAt(i);
        if (childAt != null) {
            this.f2591a.p(childAt);
            childAt.clearAnimation();
        }
        this.f2591a.removeViewAt(i);
    }
}
