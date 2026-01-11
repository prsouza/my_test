package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.w;

public final class x extends RecyclerView.f<a> {

    /* renamed from: d  reason: collision with root package name */
    public final a f3909d;

    /* renamed from: e  reason: collision with root package name */
    public final d<?> f3910e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f f3911f;
    public final int g;

    public static class a extends RecyclerView.b0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f3912u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f3913v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f3912u = textView;
            WeakHashMap<View, a0> weakHashMap = n0.x.f8842a;
            new w().e(textView, Boolean.TRUE);
            this.f3913v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public x(Context context, d<?> dVar, a aVar, h.f fVar) {
        u uVar = aVar.f3812a;
        u uVar2 = aVar.f3813b;
        u uVar3 = aVar.f3815s;
        if (uVar.compareTo(uVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (uVar3.compareTo(uVar2) <= 0) {
            int i = v.f3901u;
            int i10 = h.A;
            this.g = (context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + (p.d(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f3909d = aVar;
            this.f3910e = dVar;
            this.f3911f = fVar;
            if (!this.f2330a.a()) {
                this.f2331b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int a() {
        return this.f3909d.f3817u;
    }

    public final long b(int i) {
        return this.f3909d.f3812a.o(i).f3894a.getTimeInMillis();
    }

    public final void g(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        u o4 = this.f3909d.f3812a.o(i);
        aVar.f3912u.setText(o4.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f3913v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o4.equals(materialCalendarGridView.getAdapter().f3902a)) {
            v vVar = new v(o4, this.f3910e, this.f3909d);
            materialCalendarGridView.setNumColumns(o4.f3897s);
            materialCalendarGridView.setAdapter((ListAdapter) vVar);
        } else {
            materialCalendarGridView.invalidate();
            v a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f3904c) {
                a10.g(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a10.f3903b;
            if (dVar != null) {
                for (Long longValue2 : dVar.O()) {
                    a10.g(materialCalendarGridView, longValue2.longValue());
                }
                a10.f3904c = a10.f3903b.O();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new w(this, materialCalendarGridView));
    }

    public final RecyclerView.b0 h(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.d(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.o(-1, this.g));
        return new a(linearLayout, true);
    }

    public final u i(int i) {
        return this.f3909d.f3812a.o(i);
    }

    public final int j(u uVar) {
        return this.f3909d.f3812a.p(uVar);
    }
}
