package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.Objects;

public final class d extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public c f1595a;

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.f1595a == null) {
            this.f1595a = new c();
        }
        c cVar = this.f1595a;
        Objects.requireNonNull(cVar);
        int childCount = getChildCount();
        cVar.f1515c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!cVar.f1514b || id2 != -1) {
                if (!cVar.f1515c.containsKey(Integer.valueOf(id2))) {
                    cVar.f1515c.put(Integer.valueOf(id2), new c.a());
                }
                c.a aVar2 = cVar.f1515c.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof b) {
                        b bVar = (b) childAt;
                        aVar2.c(id2, aVar);
                        if (bVar instanceof Barrier) {
                            c.b bVar2 = aVar2.f1519d;
                            bVar2.f1546h0 = 1;
                            Barrier barrier = (Barrier) bVar;
                            bVar2.f1543f0 = barrier.getType();
                            aVar2.f1519d.f1547i0 = barrier.getReferencedIds();
                            aVar2.f1519d.f1544g0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id2, aVar);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1595a;
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1596r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1597s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1598t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f1599u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1600v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f1601w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1602x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1603y0;
        public float z0;

        public a() {
            this.f1596r0 = 1.0f;
            this.f1597s0 = false;
            this.f1598t0 = 0.0f;
            this.f1599u0 = 0.0f;
            this.f1600v0 = 0.0f;
            this.f1601w0 = 0.0f;
            this.f1602x0 = 1.0f;
            this.f1603y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1596r0 = 1.0f;
            this.f1597s0 = false;
            this.f1598t0 = 0.0f;
            this.f1599u0 = 0.0f;
            this.f1600v0 = 0.0f;
            this.f1601w0 = 0.0f;
            this.f1602x0 = 1.0f;
            this.f1603y0 = 1.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ad.c.f314h0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f1596r0 = obtainStyledAttributes.getFloat(index, this.f1596r0);
                } else if (index == 28) {
                    this.f1598t0 = obtainStyledAttributes.getFloat(index, this.f1598t0);
                    this.f1597s0 = true;
                } else if (index == 23) {
                    this.f1600v0 = obtainStyledAttributes.getFloat(index, this.f1600v0);
                } else if (index == 24) {
                    this.f1601w0 = obtainStyledAttributes.getFloat(index, this.f1601w0);
                } else if (index == 22) {
                    this.f1599u0 = obtainStyledAttributes.getFloat(index, this.f1599u0);
                } else if (index == 20) {
                    this.f1602x0 = obtainStyledAttributes.getFloat(index, this.f1602x0);
                } else if (index == 21) {
                    this.f1603y0 = obtainStyledAttributes.getFloat(index, this.f1603y0);
                } else if (index == 16) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
