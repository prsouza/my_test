package com.google.android.material.datepicker;

import android.view.View;

public final class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f3872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3873b;

    public n(h hVar, x xVar) {
        this.f3873b = hVar;
        this.f3872a = xVar;
    }

    public final void onClick(View view) {
        int U0 = this.f3873b.c().U0() - 1;
        if (U0 >= 0) {
            this.f3873b.e(this.f3872a.i(U0));
        }
    }
}
