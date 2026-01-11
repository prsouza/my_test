package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import o0.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3648a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3649b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3650c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3651d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3652e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f3652e = baseBehavior;
        this.f3648a = coordinatorLayout;
        this.f3649b = appBarLayout;
        this.f3650c = view;
        this.f3651d = i;
    }

    public final boolean a(View view) {
        this.f3652e.G(this.f3648a, this.f3649b, this.f3650c, this.f3651d, new int[]{0, 0});
        return true;
    }
}
