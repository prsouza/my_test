package com.github.mikephil.charting.data;

public class RadarEntry extends Entry {
    public RadarEntry(float f10) {
        super(0.0f, f10);
    }

    public float getValue() {
        return getY();
    }

    @Deprecated
    public float getX() {
        return super.getX();
    }

    @Deprecated
    public void setX(float f10) {
        super.setX(f10);
    }

    public RadarEntry(float f10, Object obj) {
        super(0.0f, f10, obj);
    }

    public RadarEntry copy() {
        return new RadarEntry(getY(), getData());
    }
}
