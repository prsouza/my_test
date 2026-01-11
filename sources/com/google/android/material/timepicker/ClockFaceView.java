package com.google.android.material.timepicker;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import b6.c;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.material.timepicker.ClockHandView;
import e5.a;
import io.nodle.cash.R;
import java.util.Arrays;
import n0.x;
import o0.b;

class ClockFaceView extends c implements ClockHandView.a {
    public final ClockHandView K;
    public final Rect L = new Rect();
    public final RectF M = new RectF();
    public final SparseArray<TextView> N;
    public final b O;
    public final int[] P;
    public final float[] Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public String[] V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public final ColorStateList f4154a0;

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<com.google.android.material.timepicker.ClockHandView$a>, java.util.ArrayList] */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.N = sparseArray;
        this.Q = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.g, R.attr.materialClockStyle, 2131821643);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 1);
        this.f4154a0 = a10;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.K = clockHandView;
        this.R = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.P = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.f4159t.add(this);
        int defaultColor = b.Z(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.O = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        this.V = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.V.length, size); i++) {
            TextView textView = this.N.get(i);
            if (i >= this.V.length) {
                removeView(textView);
                this.N.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.N.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.V[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                x.p(textView, this.O);
                textView.setTextColor(this.f4154a0);
            }
        }
        this.S = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.T = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.U = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void a(float f10) {
        if (Math.abs(this.W - f10) > 0.001f) {
            this.W = f10;
            t();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0175b.a(1, this.V.length, 1).f9186a);
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        t();
    }

    public final void onMeasure(int i, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.U) / Math.max(Math.max(((float) this.S) / ((float) displayMetrics.heightPixels), ((float) this.T) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RadialGradient radialGradient;
        RectF rectF = this.K.f4163x;
        for (int i = 0; i < this.N.size(); i++) {
            TextView textView = this.N.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.L);
                offsetDescendantRectToMyCoords(textView, this.L);
                textView.setSelected(rectF.contains((float) this.L.centerX(), (float) this.L.centerY()));
                this.M.set(this.L);
                this.M.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
                if (!RectF.intersects(rectF, this.M)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF.centerX() - this.M.left, rectF.centerY() - this.M.top, 0.5f * rectF.width(), this.P, this.Q, Shader.TileMode.CLAMP);
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
        }
    }
}
