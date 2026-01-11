package nh;

import android.support.v4.media.b;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f9100a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9101b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9102c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9103d;

    public static abstract class a<T extends a> {

        /* renamed from: a  reason: collision with root package name */
        public final int f9104a;

        /* renamed from: b  reason: collision with root package name */
        public int f9105b = 0;

        /* renamed from: c  reason: collision with root package name */
        public long f9106c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f9107d = 0;

        public a(int i) {
            this.f9104a = i;
        }

        public abstract T a();

        public final T b(int i) {
            this.f9107d = i;
            return a();
        }

        public final T c(int i) {
            this.f9105b = i;
            return a();
        }

        public final T d(long j10) {
            this.f9106c = j10;
            return a();
        }
    }

    public n(a aVar) {
        this.f9100a = aVar.f9105b;
        this.f9101b = aVar.f9106c;
        this.f9102c = aVar.f9104a;
        this.f9103d = aVar.f9107d;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        b.I0(this.f9100a, bArr, 0);
        b.h1(this.f9101b, bArr, 4);
        b.I0(this.f9102c, bArr, 12);
        b.I0(this.f9103d, bArr, 28);
        return bArr;
    }
}
