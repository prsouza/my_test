package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.h;

public final class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f3869a;

    public l(h hVar) {
        this.f3869a = hVar;
    }

    public final void onClick(View view) {
        h hVar = this.f3869a;
        h.e eVar = hVar.f3854u;
        h.e eVar2 = h.e.YEAR;
        if (eVar == eVar2) {
            hVar.f(h.e.DAY);
        } else if (eVar == h.e.DAY) {
            hVar.f(eVar2);
        }
    }
}
