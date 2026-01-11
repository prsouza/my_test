package com.github.mikephil.charting.components;

import android.graphics.Typeface;
import com.github.mikephil.charting.utils.Utils;

public abstract class ComponentBase {
    public boolean mEnabled = true;
    public int mTextColor = -16777216;
    public float mTextSize = Utils.convertDpToPixel(10.0f);
    public Typeface mTypeface = null;
    public float mXOffset = 5.0f;
    public float mYOffset = 5.0f;

    public int getTextColor() {
        return this.mTextColor;
    }

    public float getTextSize() {
        return this.mTextSize;
    }

    public Typeface getTypeface() {
        return this.mTypeface;
    }

    public float getXOffset() {
        return this.mXOffset;
    }

    public float getYOffset() {
        return this.mYOffset;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setTextColor(int i) {
        this.mTextColor = i;
    }

    public void setTextSize(float f10) {
        if (f10 > 24.0f) {
            f10 = 24.0f;
        }
        if (f10 < 6.0f) {
            f10 = 6.0f;
        }
        this.mTextSize = Utils.convertDpToPixel(f10);
    }

    public void setTypeface(Typeface typeface) {
        this.mTypeface = typeface;
    }

    public void setXOffset(float f10) {
        this.mXOffset = Utils.convertDpToPixel(f10);
    }

    public void setYOffset(float f10) {
        this.mYOffset = Utils.convertDpToPixel(f10);
    }
}
