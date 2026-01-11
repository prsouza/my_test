package h;

public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static t f5611d;

    /* renamed from: a  reason: collision with root package name */
    public long f5612a;

    /* renamed from: b  reason: collision with root package name */
    public long f5613b;

    /* renamed from: c  reason: collision with root package name */
    public int f5614c;

    public final void a(long j10, double d10, double d11) {
        float f10 = ((float) (j10 - 946728000000L)) / 8.64E7f;
        float f11 = (0.01720197f * f10) + 6.24006f;
        double d12 = (double) f11;
        double sin = (Math.sin((double) (f11 * 3.0f)) * 5.236000106378924E-6d) + (Math.sin((double) (2.0f * f11)) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double d13 = (-d11) / 360.0d;
        double sin2 = (Math.sin(2.0d * sin) * -0.0069d) + (Math.sin(d12) * 0.0053d) + ((double) (((float) Math.round(((double) (f10 - 9.0E-4f)) - d13)) + 9.0E-4f)) + d13;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d14 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d14))) / (Math.cos(asin) * Math.cos(d14));
        if (sin3 >= 1.0d) {
            this.f5614c = 1;
            this.f5612a = -1;
            this.f5613b = -1;
        } else if (sin3 <= -1.0d) {
            this.f5614c = 0;
            this.f5612a = -1;
            this.f5613b = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin3) / 6.283185307179586d));
            this.f5612a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f5613b = round;
            if (round >= j10 || this.f5612a <= j10) {
                this.f5614c = 1;
            } else {
                this.f5614c = 0;
            }
        }
    }
}
