package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import e6.f;
import e6.g;
import e6.i;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public class c extends ConstraintLayout {
    public final a H;
    public int I;
    public f J;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            view.setId(x.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.H);
            handler.post(this.H);
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.H);
            handler.post(this.H);
        }
    }

    public final void s() {
        int childCount = getChildCount();
        int i = 1;
        for (int i10 = 0; i10 < childCount; i10++) {
            if ("skip".equals(getChildAt(i10).getTag())) {
                i++;
            }
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.c(this);
        float f10 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i12 = this.I;
                if (!cVar.f1515c.containsKey(Integer.valueOf(id2))) {
                    cVar.f1515c.put(Integer.valueOf(id2), new c.a());
                }
                c.b bVar = cVar.f1515c.get(Integer.valueOf(id2)).f1519d;
                bVar.z = R.id.circle_center;
                bVar.A = i12;
                bVar.B = f10;
                f10 = (360.0f / ((float) (childCount - i))) + f10;
            }
        }
        cVar.a(this);
    }

    public final void setBackgroundColor(int i) {
        this.J.o(ColorStateList.valueOf(i));
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f fVar = new f();
        this.J = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f4653a.f4664a;
        Objects.requireNonNull(iVar);
        i.a aVar = new i.a(iVar);
        aVar.f4698e = gVar;
        aVar.f4699f = gVar;
        aVar.g = gVar;
        aVar.f4700h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.J.o(ColorStateList.valueOf(-1));
        f fVar2 = this.J;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4639y, i, 0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.H = new a();
        obtainStyledAttributes.recycle();
    }
}
