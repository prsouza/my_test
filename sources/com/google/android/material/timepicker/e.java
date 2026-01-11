package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

public final class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f4170a;

    public e(TimePickerView timePickerView) {
        this.f4170a = timePickerView;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f4170a;
        int i = TimePickerView.J;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
