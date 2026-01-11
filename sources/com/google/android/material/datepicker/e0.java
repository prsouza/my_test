package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.h;

public final class e0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f0 f3842b;

    public e0(f0 f0Var, int i) {
        this.f3842b = f0Var;
        this.f3841a = i;
    }

    public final void onClick(View view) {
        u h10 = u.h(this.f3841a, this.f3842b.f3844d.f3853t.f3895b);
        a aVar = this.f3842b.f3844d.f3852s;
        if (h10.compareTo(aVar.f3812a) < 0) {
            h10 = aVar.f3812a;
        } else if (h10.compareTo(aVar.f3813b) > 0) {
            h10 = aVar.f3813b;
        }
        this.f3842b.f3844d.e(h10);
        this.f3842b.f3844d.f(h.e.DAY);
    }
}
