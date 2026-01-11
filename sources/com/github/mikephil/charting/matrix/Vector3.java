package com.github.mikephil.charting.matrix;

public final class Vector3 {
    public static final Vector3 UNIT_X = new Vector3(1.0f, 0.0f, 0.0f);
    public static final Vector3 UNIT_Y = new Vector3(0.0f, 1.0f, 0.0f);
    public static final Vector3 UNIT_Z = new Vector3(0.0f, 0.0f, 1.0f);
    public static final Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);

    /* renamed from: x  reason: collision with root package name */
    public float f3606x;

    /* renamed from: y  reason: collision with root package name */
    public float f3607y;
    public float z;

    public Vector3() {
    }

    public final void add(Vector3 vector3) {
        this.f3606x += vector3.f3606x;
        this.f3607y += vector3.f3607y;
        this.z += vector3.z;
    }

    public final Vector3 cross(Vector3 vector3) {
        float f10 = this.f3607y;
        float f11 = vector3.z;
        float f12 = this.z;
        float f13 = vector3.f3607y;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = vector3.f3606x;
        float f16 = this.f3606x;
        return new Vector3(f14, (f12 * f15) - (f11 * f16), (f16 * f13) - (f10 * f15));
    }

    public final float distance2(Vector3 vector3) {
        float f10 = this.f3606x - vector3.f3606x;
        float f11 = this.f3607y - vector3.f3607y;
        float f12 = this.z - vector3.z;
        return (f12 * f12) + (f11 * f11) + (f10 * f10);
    }

    public final void divide(float f10) {
        if (f10 != 0.0f) {
            this.f3606x /= f10;
            this.f3607y /= f10;
            this.z /= f10;
        }
    }

    public final float dot(Vector3 vector3) {
        return (this.z * vector3.z) + (this.f3607y * vector3.f3607y) + (this.f3606x * vector3.f3606x);
    }

    public final float length() {
        return (float) Math.sqrt((double) length2());
    }

    public final float length2() {
        float f10 = this.f3606x;
        float f11 = this.f3607y;
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.z;
        return (f13 * f13) + f12;
    }

    public final void multiply(float f10) {
        this.f3606x *= f10;
        this.f3607y *= f10;
        this.z *= f10;
    }

    public final float normalize() {
        float length = length();
        if (length != 0.0f) {
            this.f3606x /= length;
            this.f3607y /= length;
            this.z /= length;
        }
        return length;
    }

    public final boolean pointsInSameDirection(Vector3 vector3) {
        return dot(vector3) > 0.0f;
    }

    public final void set(Vector3 vector3) {
        this.f3606x = vector3.f3606x;
        this.f3607y = vector3.f3607y;
        this.z = vector3.z;
    }

    public final void subtract(Vector3 vector3) {
        this.f3606x -= vector3.f3606x;
        this.f3607y -= vector3.f3607y;
        this.z -= vector3.z;
    }

    public final void subtractMultiple(Vector3 vector3, float f10) {
        this.f3606x -= vector3.f3606x * f10;
        this.f3607y -= vector3.f3607y * f10;
        this.z -= vector3.z * f10;
    }

    public final void zero() {
        set(0.0f, 0.0f, 0.0f);
    }

    public Vector3(float[] fArr) {
        set(fArr[0], fArr[1], fArr[2]);
    }

    public Vector3(float f10, float f11, float f12) {
        set(f10, f11, f12);
    }

    public final void add(float f10, float f11, float f12) {
        this.f3606x += f10;
        this.f3607y += f11;
        this.z += f12;
    }

    public final void multiply(Vector3 vector3) {
        this.f3606x *= vector3.f3606x;
        this.f3607y *= vector3.f3607y;
        this.z *= vector3.z;
    }

    public final void set(float f10, float f11, float f12) {
        this.f3606x = f10;
        this.f3607y = f11;
        this.z = f12;
    }

    public Vector3(Vector3 vector3) {
        set(vector3);
    }
}
