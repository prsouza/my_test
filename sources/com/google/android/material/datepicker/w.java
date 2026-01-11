package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Iterator;

public final class w implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f3908b;

    public w(x xVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3908b = xVar;
        this.f3907a = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        v a10 = this.f3907a.getAdapter();
        if (i >= a10.c() && i <= a10.e()) {
            h.d dVar = (h.d) this.f3908b.f3911f;
            if (h.this.f3852s.f3814c.y(this.f3907a.getAdapter().getItem(i).longValue())) {
                h.this.f3851c.e();
                Iterator<y<S>> it = h.this.f3914a.iterator();
                while (it.hasNext()) {
                    it.next().a(h.this.f3851c.S());
                }
                h.this.f3857x.getAdapter().d();
                RecyclerView recyclerView = h.this.f3856w;
                if (recyclerView != null) {
                    recyclerView.getAdapter().d();
                }
            }
        }
    }
}
