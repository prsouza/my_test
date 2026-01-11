package com.google.android.material.appbar;

import android.view.View;
import o0.d;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3653a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3654b;

    public c(AppBarLayout appBarLayout, boolean z) {
        this.f3653a = appBarLayout;
        this.f3654b = z;
    }

    public final boolean a(View view) {
        this.f3653a.setExpanded(this.f3654b);
        return true;
    }
}
