package com.google.android.material.datepicker;

import android.view.View;
import io.nodle.cash.R;
import n0.a;
import o0.b;

public final class j extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f3865d;

    public j(h hVar) {
        this.f3865d = hVar;
    }

    public final void d(View view, b bVar) {
        String str;
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
        if (this.f3865d.z.getVisibility() == 0) {
            str = this.f3865d.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f3865d.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        bVar.t(str);
    }
}
