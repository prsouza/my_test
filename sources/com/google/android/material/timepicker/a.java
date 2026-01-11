package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f4166a;

    public a(ClockFaceView clockFaceView) {
        this.f4166a = clockFaceView;
    }

    public final boolean onPreDraw() {
        if (!this.f4166a.isShown()) {
            return true;
        }
        this.f4166a.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f4166a;
        int height = ((this.f4166a.getHeight() / 2) - clockFaceView.K.f4160u) - clockFaceView.R;
        if (height != clockFaceView.I) {
            clockFaceView.I = height;
            clockFaceView.s();
            ClockHandView clockHandView = clockFaceView.K;
            clockHandView.C = clockFaceView.I;
            clockHandView.invalidate();
        }
        return true;
    }
}
