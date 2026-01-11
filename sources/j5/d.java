package j5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f7056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7057c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f7058s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f7059t;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f7059t = bottomAppBar;
        this.f7056b = actionMenuView;
        this.f7057c = i;
        this.f7058s = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f7055a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f7055a) {
            BottomAppBar bottomAppBar = this.f7059t;
            int i = bottomAppBar.f3679n0;
            boolean z = i != 0;
            if (i != 0) {
                bottomAppBar.f3679n0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i);
            }
            BottomAppBar bottomAppBar2 = this.f7059t;
            ActionMenuView actionMenuView = this.f7056b;
            int i10 = this.f7057c;
            boolean z10 = this.f7058s;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i10, z10);
            if (z) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
