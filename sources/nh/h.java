package nh;

import android.support.v4.media.b;
import nh.n;

public final class h extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f9079e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9080f;
    public final int g;

    public static class a extends n.a<a> {

        /* renamed from: e  reason: collision with root package name */
        public int f9081e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f9082f = 0;
        public int g = 0;

        public a() {
            super(1);
        }

        public final n.a a() {
            return this;
        }
    }

    public h(a aVar) {
        super(aVar);
        this.f9079e = aVar.f9081e;
        this.f9080f = aVar.f9082f;
        this.g = aVar.g;
    }

    public final byte[] a() {
        byte[] a10 = super.a();
        b.I0(this.f9079e, a10, 16);
        b.I0(this.f9080f, a10, 20);
        b.I0(this.g, a10, 24);
        return a10;
    }
}
