package com.google.android.material.datepicker;

import android.view.View;
import n0.e0;
import n0.n;

public final class q implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3888b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3889c;

    public q(int i, View view, int i10) {
        this.f3887a = i;
        this.f3888b = view;
        this.f3889c = i10;
    }

    public final e0 a(View view, e0 e0Var) {
        int i = e0Var.b(7).f5204b;
        if (this.f3887a >= 0) {
            this.f3888b.getLayoutParams().height = this.f3887a + i;
            View view2 = this.f3888b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f3888b;
        view3.setPadding(view3.getPaddingLeft(), this.f3889c + i, this.f3888b.getPaddingRight(), this.f3888b.getPaddingBottom());
        return e0Var;
    }
}
