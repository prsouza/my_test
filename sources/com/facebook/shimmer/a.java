package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import b9.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f3585a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3586b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public int f3587c;

    /* renamed from: d  reason: collision with root package name */
    public int f3588d;

    /* renamed from: e  reason: collision with root package name */
    public int f3589e;

    /* renamed from: f  reason: collision with root package name */
    public int f3590f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f3591h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f3592j;

    /* renamed from: k  reason: collision with root package name */
    public float f3593k;

    /* renamed from: l  reason: collision with root package name */
    public float f3594l;

    /* renamed from: m  reason: collision with root package name */
    public float f3595m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3596n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3597o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3598p;

    /* renamed from: q  reason: collision with root package name */
    public int f3599q;

    /* renamed from: r  reason: collision with root package name */
    public int f3600r;

    /* renamed from: s  reason: collision with root package name */
    public long f3601s;

    /* renamed from: t  reason: collision with root package name */
    public long f3602t;

    /* renamed from: com.facebook.shimmer.a$a  reason: collision with other inner class name */
    public static class C0039a extends b<C0039a> {
        public C0039a() {
            this.f3603a.f3598p = true;
        }

        public final b c() {
            return this;
        }
    }

    public static abstract class b<T extends b<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final a f3603a = new a();

        public final a a() {
            a aVar = this.f3603a;
            int i = aVar.f3590f;
            if (i != 1) {
                int[] iArr = aVar.f3586b;
                int i10 = aVar.f3589e;
                iArr[0] = i10;
                int i11 = aVar.f3588d;
                iArr[1] = i11;
                iArr[2] = i11;
                iArr[3] = i10;
            } else {
                int[] iArr2 = aVar.f3586b;
                int i12 = aVar.f3588d;
                iArr2[0] = i12;
                iArr2[1] = i12;
                int i13 = aVar.f3589e;
                iArr2[2] = i13;
                iArr2[3] = i13;
            }
            if (i != 1) {
                aVar.f3585a[0] = Math.max(((1.0f - aVar.f3593k) - aVar.f3594l) / 2.0f, 0.0f);
                aVar.f3585a[1] = Math.max(((1.0f - aVar.f3593k) - 0.001f) / 2.0f, 0.0f);
                aVar.f3585a[2] = Math.min(((aVar.f3593k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                aVar.f3585a[3] = Math.min(((aVar.f3593k + 1.0f) + aVar.f3594l) / 2.0f, 1.0f);
            } else {
                float[] fArr = aVar.f3585a;
                fArr[0] = 0.0f;
                fArr[1] = Math.min(aVar.f3593k, 1.0f);
                aVar.f3585a[2] = Math.min(aVar.f3593k + aVar.f3594l, 1.0f);
                aVar.f3585a[3] = 1.0f;
            }
            return this.f3603a;
        }

        public T b(TypedArray typedArray) {
            if (typedArray.hasValue(3)) {
                this.f3603a.f3596n = typedArray.getBoolean(3, this.f3603a.f3596n);
                c();
            }
            if (typedArray.hasValue(0)) {
                this.f3603a.f3597o = typedArray.getBoolean(0, this.f3603a.f3597o);
                c();
            }
            if (typedArray.hasValue(1)) {
                a aVar = this.f3603a;
                aVar.f3589e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (aVar.f3589e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                a aVar2 = this.f3603a;
                aVar2.f3588d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (16777215 & aVar2.f3588d);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j10 = (long) typedArray.getInt(7, (int) this.f3603a.f3601s);
                if (j10 >= 0) {
                    this.f3603a.f3601s = j10;
                    c();
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.a.d("Given a negative duration: ", j10));
                }
            }
            if (typedArray.hasValue(14)) {
                this.f3603a.f3599q = typedArray.getInt(14, this.f3603a.f3599q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j11 = (long) typedArray.getInt(15, (int) this.f3603a.f3602t);
                if (j11 >= 0) {
                    this.f3603a.f3602t = j11;
                    c();
                } else {
                    throw new IllegalArgumentException(android.support.v4.media.a.d("Given a negative repeat delay: ", j11));
                }
            }
            if (typedArray.hasValue(16)) {
                this.f3603a.f3600r = typedArray.getInt(16, this.f3603a.f3600r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i = typedArray.getInt(5, this.f3603a.f3587c);
                if (i == 1) {
                    d(1);
                } else if (i == 2) {
                    d(2);
                } else if (i != 3) {
                    d(0);
                } else {
                    d(3);
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, this.f3603a.f3590f) != 1) {
                    this.f3603a.f3590f = 0;
                    c();
                } else {
                    this.f3603a.f3590f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f10 = typedArray.getFloat(6, this.f3603a.f3594l);
                if (f10 >= 0.0f) {
                    this.f3603a.f3594l = f10;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f10);
                }
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, this.f3603a.g);
                if (dimensionPixelSize >= 0) {
                    this.f3603a.g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(m.b("Given invalid width: ", dimensionPixelSize));
                }
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, this.f3603a.f3591h);
                if (dimensionPixelSize2 >= 0) {
                    this.f3603a.f3591h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(m.b("Given invalid height: ", dimensionPixelSize2));
                }
            }
            if (typedArray.hasValue(13)) {
                float f11 = typedArray.getFloat(13, this.f3603a.f3593k);
                if (f11 >= 0.0f) {
                    this.f3603a.f3593k = f11;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f11);
                }
            }
            if (typedArray.hasValue(19)) {
                float f12 = typedArray.getFloat(19, this.f3603a.i);
                if (f12 >= 0.0f) {
                    this.f3603a.i = f12;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f12);
                }
            }
            if (typedArray.hasValue(10)) {
                float f13 = typedArray.getFloat(10, this.f3603a.f3592j);
                if (f13 >= 0.0f) {
                    this.f3603a.f3592j = f13;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f13);
                }
            }
            if (typedArray.hasValue(18)) {
                this.f3603a.f3595m = typedArray.getFloat(18, this.f3603a.f3595m);
                c();
            }
            return c();
        }

        public abstract T c();

        public final T d(int i) {
            this.f3603a.f3587c = i;
            return c();
        }
    }

    public static class c extends b<c> {
        public c() {
            this.f3603a.f3598p = false;
        }

        public final b b(TypedArray typedArray) {
            super.b(typedArray);
            if (typedArray.hasValue(2)) {
                int color = typedArray.getColor(2, this.f3603a.f3589e);
                a aVar = this.f3603a;
                aVar.f3589e = (color & 16777215) | (aVar.f3589e & -16777216);
            }
            if (typedArray.hasValue(12)) {
                this.f3603a.f3588d = typedArray.getColor(12, this.f3603a.f3588d);
            }
            return this;
        }

        public final b c() {
            return this;
        }
    }

    public a() {
        new RectF();
        this.f3587c = 0;
        this.f3588d = -1;
        this.f3589e = 1291845631;
        this.f3590f = 0;
        this.g = 0;
        this.f3591h = 0;
        this.i = 1.0f;
        this.f3592j = 1.0f;
        this.f3593k = 0.0f;
        this.f3594l = 0.5f;
        this.f3595m = 20.0f;
        this.f3596n = true;
        this.f3597o = true;
        this.f3598p = true;
        this.f3599q = -1;
        this.f3600r = 1;
        this.f3601s = 1000;
    }
}
