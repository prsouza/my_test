package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f4059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.h f4060b;

    public b(TabLayout.h hVar, View view) {
        this.f4060b = hVar;
        this.f4059a = view;
    }

    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.f4059a.getVisibility() == 0) {
            this.f4060b.f(this.f4059a);
        }
    }
}
