package com.google.android.material.datepicker;

import android.view.View;

public final class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f3870a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3871b;

    public m(h hVar, x xVar) {
        this.f3871b = hVar;
        this.f3870a = xVar;
    }

    public final void onClick(View view) {
        int T0 = this.f3871b.c().T0() + 1;
        if (T0 < this.f3871b.f3857x.getAdapter().a()) {
            this.f3871b.e(this.f3870a.i(T0));
        }
    }
}
