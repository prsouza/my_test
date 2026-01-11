package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

public abstract class z<S> extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<y<S>> f3914a = new LinkedHashSet<>();

    public boolean b(y<S> yVar) {
        return this.f3914a.add(yVar);
    }
}
