package t2;

import androidx.fragment.app.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f11256a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11257b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11258c;

    /* renamed from: d  reason: collision with root package name */
    public final a f11259d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11260e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11261f;
    public final float g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11262h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final float f11263j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11264k;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z) {
        this.f11256a = str;
        this.f11257b = str2;
        this.f11258c = f10;
        this.f11259d = aVar;
        this.f11260e = i10;
        this.f11261f = f11;
        this.g = f12;
        this.f11262h = i11;
        this.i = i12;
        this.f11263j = f13;
        this.f11264k = z;
    }

    public final int hashCode() {
        String str = this.f11257b;
        int ordinal = ((this.f11259d.ordinal() + (((int) (((float) m.a(str, this.f11256a.hashCode() * 31, 31)) + this.f11258c)) * 31)) * 31) + this.f11260e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f11261f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f11262h;
    }
}
