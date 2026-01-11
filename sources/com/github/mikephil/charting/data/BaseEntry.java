package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

public abstract class BaseEntry {
    private Object mData;
    private Drawable mIcon;

    /* renamed from: y  reason: collision with root package name */
    private float f3604y;

    public BaseEntry() {
        this.f3604y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.f3604y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f10) {
        this.f3604y = f10;
    }

    public BaseEntry(float f10) {
        this.mData = null;
        this.mIcon = null;
        this.f3604y = f10;
    }

    public BaseEntry(float f10, Object obj) {
        this(f10);
        this.mData = obj;
    }

    public BaseEntry(float f10, Drawable drawable) {
        this(f10);
        this.mIcon = drawable;
    }

    public BaseEntry(float f10, Drawable drawable, Object obj) {
        this(f10);
        this.mIcon = drawable;
        this.mData = obj;
    }
}
