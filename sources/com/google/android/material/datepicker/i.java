package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import m0.b;

public final class i extends RecyclerView.m {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3862a = d0.e((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3863b = d0.e((Calendar) null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f3864c;

    public i(h hVar) {
        this.f3864c = hVar;
    }

    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i10;
        if ((recyclerView.getAdapter() instanceof f0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            f0 f0Var = (f0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b next : this.f3864c.f3851c.w()) {
                F f10 = next.f8362a;
                if (!(f10 == null || next.f8363b == null)) {
                    this.f3862a.setTimeInMillis(((Long) f10).longValue());
                    this.f3863b.setTimeInMillis(((Long) next.f8363b).longValue());
                    int i11 = f0Var.i(this.f3862a.get(1));
                    int i12 = f0Var.i(this.f3863b.get(1));
                    View s10 = gridLayoutManager.s(i11);
                    View s11 = gridLayoutManager.s(i12);
                    int i13 = gridLayoutManager.H;
                    int i14 = i11 / i13;
                    int i15 = i12 / i13;
                    for (int i16 = i14; i16 <= i15; i16++) {
                        View s12 = gridLayoutManager.s(gridLayoutManager.H * i16);
                        if (s12 != null) {
                            int top = s12.getTop() + this.f3864c.f3855v.f3833d.f3824a.top;
                            int bottom = s12.getBottom() - this.f3864c.f3855v.f3833d.f3824a.bottom;
                            if (i16 == i14) {
                                i = (s10.getWidth() / 2) + s10.getLeft();
                            } else {
                                i = 0;
                            }
                            if (i16 == i15) {
                                i10 = (s11.getWidth() / 2) + s11.getLeft();
                            } else {
                                i10 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i, (float) top, (float) i10, (float) bottom, this.f3864c.f3855v.f3836h);
                        }
                    }
                }
            }
        }
    }
}
