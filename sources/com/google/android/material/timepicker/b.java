package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import io.nodle.cash.R;
import n0.a;
import o0.b;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f4167d;

    public b(ClockFaceView clockFaceView) {
        this.f4167d = clockFaceView;
    }

    public final void d(View view, o0.b bVar) {
        this.f8771a.onInitializeAccessibilityNodeInfo(view, bVar.f9173a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            bVar.A(this.f4167d.N.get(intValue - 1));
        }
        bVar.q(b.c.a(0, 1, intValue, 1, view.isSelected()));
        bVar.o(true);
        bVar.b(b.a.f9176e);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float x10 = view.getX() + (((float) view.getWidth()) / 2.0f);
        float height = (((float) view.getHeight()) / 2.0f) + view.getY();
        this.f4167d.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
        this.f4167d.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
        return true;
    }
}
