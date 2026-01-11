package com.google.android.material.datepicker;

import android.view.View;

public final class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f3890a;

    public r(p pVar) {
        this.f3890a = pVar;
    }

    public final void onClick(View view) {
        p pVar = this.f3890a;
        pVar.J.setEnabled(pVar.b().E());
        this.f3890a.H.toggle();
        p pVar2 = this.f3890a;
        pVar2.h(pVar2.H);
        this.f3890a.f();
    }
}
