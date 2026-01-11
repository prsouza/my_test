package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class t<S> extends z<S> {

    /* renamed from: b  reason: collision with root package name */
    public int f3891b;

    /* renamed from: c  reason: collision with root package name */
    public d<S> f3892c;

    /* renamed from: s  reason: collision with root package name */
    public a f3893s;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f3891b = bundle.getInt("THEME_RES_ID_KEY");
        this.f3892c = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f3893s = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f3891b));
        return this.f3892c.a0();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f3891b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3892c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3893s);
    }
}
