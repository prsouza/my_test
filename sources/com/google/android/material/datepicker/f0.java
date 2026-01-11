package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.nodle.cash.R;
import java.util.Calendar;
import java.util.Locale;

public final class f0 extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final h<?> f3844d;

    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f3845u;

        public a(TextView textView) {
            super(textView);
            this.f3845u = textView;
        }
    }

    public f0(h<?> hVar) {
        this.f3844d = hVar;
    }

    public final int a() {
        return this.f3844d.f3852s.f3816t;
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        int i10 = this.f3844d.f3852s.f3812a.f3896c + i;
        String string = aVar.f3845u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f3845u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i10)}));
        aVar.f3845u.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i10)}));
        c cVar = this.f3844d.f3855v;
        Calendar d10 = d0.d();
        b bVar = d10.get(1) == i10 ? cVar.f3835f : cVar.f3833d;
        for (Long longValue : this.f3844d.f3851c.O()) {
            d10.setTimeInMillis(longValue.longValue());
            if (d10.get(1) == i10) {
                bVar = cVar.f3834e;
            }
        }
        bVar.b(aVar.f3845u);
        aVar.f3845u.setOnClickListener(new e0(this, i10));
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public final int i(int i) {
        return i - this.f3844d.f3852s.f3812a.f3896c;
    }
}
