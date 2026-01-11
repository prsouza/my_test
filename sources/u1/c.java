package u1;

import android.os.Build;

public final class c {
    public static final c i = new c(new a());

    /* renamed from: a  reason: collision with root package name */
    public q f11626a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11627b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11628c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11629d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11630e;

    /* renamed from: f  reason: collision with root package name */
    public long f11631f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public d f11632h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public q f11633a = q.NOT_REQUIRED;

        /* renamed from: b  reason: collision with root package name */
        public long f11634b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f11635c = -1;

        /* renamed from: d  reason: collision with root package name */
        public d f11636d = new d();
    }

    public c() {
        this.f11626a = q.NOT_REQUIRED;
        this.f11631f = -1;
        this.g = -1;
        this.f11632h = new d();
    }

    public final boolean a() {
        return this.f11632h.a() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11627b == cVar.f11627b && this.f11628c == cVar.f11628c && this.f11629d == cVar.f11629d && this.f11630e == cVar.f11630e && this.f11631f == cVar.f11631f && this.g == cVar.g && this.f11626a == cVar.f11626a) {
            return this.f11632h.equals(cVar.f11632h);
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f11631f;
        long j11 = this.g;
        return this.f11632h.hashCode() + (((((((((((((this.f11626a.hashCode() * 31) + (this.f11627b ? 1 : 0)) * 31) + (this.f11628c ? 1 : 0)) * 31) + (this.f11629d ? 1 : 0)) * 31) + (this.f11630e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public c(a aVar) {
        this.f11626a = q.NOT_REQUIRED;
        this.f11631f = -1;
        this.g = -1;
        this.f11632h = new d();
        this.f11627b = false;
        int i10 = Build.VERSION.SDK_INT;
        this.f11628c = false;
        this.f11626a = aVar.f11633a;
        this.f11629d = false;
        this.f11630e = false;
        if (i10 >= 24) {
            this.f11632h = aVar.f11636d;
            this.f11631f = aVar.f11634b;
            this.g = aVar.f11635c;
        }
    }

    public c(c cVar) {
        this.f11626a = q.NOT_REQUIRED;
        this.f11631f = -1;
        this.g = -1;
        this.f11632h = new d();
        this.f11627b = cVar.f11627b;
        this.f11628c = cVar.f11628c;
        this.f11626a = cVar.f11626a;
        this.f11629d = cVar.f11629d;
        this.f11630e = cVar.f11630e;
        this.f11632h = cVar.f11632h;
    }
}
