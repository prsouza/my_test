package p1;

import android.view.View;
import android.view.ViewGroup;
import io.nodle.cash.R;

public final class z extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f9567b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f9568c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ a0 f9569s;

    public z(a0 a0Var, ViewGroup viewGroup, View view, View view2) {
        this.f9569s = a0Var;
        this.f9566a = viewGroup;
        this.f9567b = view;
        this.f9568c = view2;
    }

    public final void a(i iVar) {
        this.f9568c.setTag(R.id.save_overlay_view, (Object) null);
        this.f9566a.getOverlay().remove(this.f9567b);
        iVar.z(this);
    }

    public final void b() {
        this.f9566a.getOverlay().remove(this.f9567b);
    }

    public final void c() {
        if (this.f9567b.getParent() == null) {
            this.f9566a.getOverlay().add(this.f9567b);
        } else {
            this.f9569s.cancel();
        }
    }
}
