package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class b0 extends LinearLayoutManager {
    public b0(Context context, int i) {
        super(i);
    }

    public final void G0(RecyclerView recyclerView, int i) {
        a0 a0Var = new a0(recyclerView.getContext());
        a0Var.f2382a = i;
        H0(a0Var);
    }
}
