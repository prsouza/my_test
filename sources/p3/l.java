package p3;

import g3.g;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9599a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final a f9600b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f9601c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f9602d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final b f9603e;

    /* renamed from: f  reason: collision with root package name */
    public static final g<l> f9604f;
    public static final boolean g = true;

    public static class a extends l {
        public final e a(int i, int i10, int i11, int i12) {
            if (b(i, i10, i11, i12) == 1.0f) {
                return e.QUALITY;
            }
            if (l.g) {
                return e.QUALITY;
            }
            return e.MEMORY;
        }

        public final float b(int i, int i10, int i11, int i12) {
            return Math.min(1.0f, l.f9599a.b(i, i10, i11, i12));
        }
    }

    public static class b extends l {
        public final e a(int i, int i10, int i11, int i12) {
            return e.QUALITY;
        }

        public final float b(int i, int i10, int i11, int i12) {
            return Math.max(((float) i11) / ((float) i), ((float) i12) / ((float) i10));
        }
    }

    public static class c extends l {
        public final e a(int i, int i10, int i11, int i12) {
            if (l.g) {
                return e.QUALITY;
            }
            return e.MEMORY;
        }

        public final float b(int i, int i10, int i11, int i12) {
            if (l.g) {
                return Math.min(((float) i11) / ((float) i), ((float) i12) / ((float) i10));
            }
            int max = Math.max(i10 / i12, i / i11);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    public static class d extends l {
        public final e a(int i, int i10, int i11, int i12) {
            return e.QUALITY;
        }

        public final float b(int i, int i10, int i11, int i12) {
            return 1.0f;
        }
    }

    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        b bVar = new b();
        f9601c = bVar;
        f9603e = bVar;
        f9604f = g.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    public abstract e a(int i, int i10, int i11, int i12);

    public abstract float b(int i, int i10, int i11, int i12);
}
