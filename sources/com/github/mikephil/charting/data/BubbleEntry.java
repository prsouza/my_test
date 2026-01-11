package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

public class BubbleEntry extends Entry {
    private float mSize;

    public BubbleEntry(float f10, float f11, float f12) {
        super(f10, f11);
        this.mSize = f12;
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f10) {
        this.mSize = f10;
    }

    public BubbleEntry copy() {
        return new BubbleEntry(getX(), getY(), this.mSize, getData());
    }

    public BubbleEntry(float f10, float f11, float f12, Object obj) {
        super(f10, f11, obj);
        this.mSize = f12;
    }

    public BubbleEntry(float f10, float f11, float f12, Drawable drawable) {
        super(f10, f11, drawable);
        this.mSize = f12;
    }

    public BubbleEntry(float f10, float f11, float f12, Drawable drawable, Object obj) {
        super(f10, f11, drawable, obj);
        this.mSize = f12;
    }
}
