package androidx.constraintlayout.widget;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import v.a;
import v.e;

public class Barrier extends b {

    /* renamed from: x  reason: collision with root package name */
    public int f1434x;

    /* renamed from: y  reason: collision with root package name */
    public int f1435y;
    public a z;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.z.f12024u0;
    }

    public int getMargin() {
        return this.z.f12025v0;
    }

    public int getType() {
        return this.f1434x;
    }

    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.z = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.f311f0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.z.f12024u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.z.f12025v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1505s = this.z;
        k();
    }

    public final void j(e eVar, boolean z10) {
        int i = this.f1434x;
        this.f1435y = i;
        if (z10) {
            if (i == 5) {
                this.f1435y = 1;
            } else if (i == 6) {
                this.f1435y = 0;
            }
        } else if (i == 5) {
            this.f1435y = 0;
        } else if (i == 6) {
            this.f1435y = 1;
        }
        if (eVar instanceof a) {
            ((a) eVar).f12023t0 = this.f1435y;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.z.f12024u0 = z10;
    }

    public void setDpMargin(int i) {
        this.z.f12025v0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.z.f12025v0 = i;
    }

    public void setType(int i) {
        this.f1434x = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
