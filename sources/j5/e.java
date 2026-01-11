package j5;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f7060a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7061b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f7062c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f7063s;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f7063s = bottomAppBar;
        this.f7060a = actionMenuView;
        this.f7061b = i;
        this.f7062c = z;
    }

    public final void run() {
        ActionMenuView actionMenuView = this.f7060a;
        actionMenuView.setTranslationX((float) this.f7063s.y(actionMenuView, this.f7061b, this.f7062c));
    }
}
