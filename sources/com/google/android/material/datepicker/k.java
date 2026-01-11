package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class k extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f3866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3867b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3868c;

    public k(h hVar, x xVar, MaterialButton materialButton) {
        this.f3868c = hVar;
        this.f3866a = xVar;
        this.f3867b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3867b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i10) {
        int i11;
        if (i < 0) {
            i11 = this.f3868c.c().T0();
        } else {
            i11 = this.f3868c.c().U0();
        }
        this.f3868c.f3853t = this.f3866a.i(i11);
        this.f3867b.setText(this.f3866a.i(i11).l());
    }
}
