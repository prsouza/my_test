package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import io.nodle.cash.R;
import java.util.Calendar;
import java.util.Iterator;
import m0.b;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import x5.t;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3810a = d0.e((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3811b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (p.d(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f3811b = p.e(getContext(), R.attr.nestedScrollable);
        x.p(this, new o());
    }

    /* renamed from: a */
    public final v getAdapter() {
        return (v) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v a10 = getAdapter();
        d<?> dVar = a10.f3903b;
        c cVar = a10.f3905s;
        int max = Math.max(a10.c(), getFirstVisiblePosition());
        int min = Math.min(a10.e(), getLastVisiblePosition());
        Long d10 = a10.getItem(max);
        Long d11 = a10.getItem(min);
        Iterator<b<Long, Long>> it = dVar.w().iterator();
        while (it.hasNext()) {
            b next = it.next();
            F f10 = next.f8362a;
            if (f10 == null) {
                materialCalendarGridView = this;
            } else if (next.f8363b != null) {
                long longValue = ((Long) f10).longValue();
                long longValue2 = ((Long) next.f8363b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(d10 == null || d11 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > d11.longValue() || valueOf2.longValue() < d10.longValue())) {
                    boolean c10 = t.c(this);
                    if (longValue < d10.longValue()) {
                        if (max % a10.f3902a.f3897s == 0) {
                            i16 = 0;
                        } else if (!c10) {
                            i16 = materialCalendarGridView.b(max - 1).getRight();
                        } else {
                            i16 = materialCalendarGridView.b(max - 1).getLeft();
                        }
                        i = i16;
                        i10 = max;
                    } else {
                        materialCalendarGridView.f3810a.setTimeInMillis(longValue);
                        i10 = a10.b(materialCalendarGridView.f3810a.get(5));
                        View b10 = materialCalendarGridView.b(i10);
                        i = (b10.getWidth() / 2) + b10.getLeft();
                    }
                    if (longValue2 > d11.longValue()) {
                        if ((min + 1) % a10.f3902a.f3897s == 0) {
                            i15 = getWidth();
                        } else if (!c10) {
                            i15 = materialCalendarGridView.b(min).getRight();
                        } else {
                            i15 = materialCalendarGridView.b(min).getLeft();
                        }
                        i11 = i15;
                        i12 = min;
                    } else {
                        materialCalendarGridView.f3810a.setTimeInMillis(longValue2);
                        i12 = a10.b(materialCalendarGridView.f3810a.get(5));
                        View b11 = materialCalendarGridView.b(i12);
                        i11 = (b11.getWidth() / 2) + b11.getLeft();
                    }
                    int itemId = (int) a10.getItemId(i10);
                    int i17 = max;
                    int i18 = min;
                    int itemId2 = (int) a10.getItemId(i12);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        v vVar = a10;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b12 = materialCalendarGridView.b(numColumns);
                        int top = b12.getTop() + cVar.f3830a.f3824a.top;
                        int bottom = b12.getBottom() - cVar.f3830a.f3824a.bottom;
                        if (!c10) {
                            i13 = numColumns > i10 ? 0 : i;
                            i14 = i12 > numColumns2 ? getWidth() : i11;
                        } else {
                            int i19 = i12 > numColumns2 ? 0 : i11;
                            int width = numColumns > i10 ? getWidth() : i;
                            i13 = i19;
                            i14 = width;
                        }
                        canvas.drawRect((float) i13, (float) top, (float) i14, (float) bottom, cVar.f3836h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a10 = vVar;
                    }
                    materialCalendarGridView = this;
                    max = i17;
                    min = i18;
                }
            }
        }
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().e());
        } else if (i == 130) {
            setSelection(getAdapter().c());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().c()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().c());
        return true;
    }

    public final void onMeasure(int i, int i10) {
        if (this.f3811b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i10);
    }

    public final void setSelection(int i) {
        if (i < getAdapter().c()) {
            super.setSelection(getAdapter().c());
        } else {
            super.setSelection(i);
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof v) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()}));
        }
    }
}
