package nh;

import android.support.v4.media.b;
import nh.n;

public final class i extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f9083e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9084f;
    public final int g;

    public static class a extends n.a<a> {

        /* renamed from: e  reason: collision with root package name */
        public int f9085e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f9086f = 0;
        public int g = 0;

        public a() {
            super(0);
        }

        public final n.a a() {
            return this;
        }
    }

    public i(a aVar) {
        super(aVar);
        this.f9083e = aVar.f9085e;
        this.f9084f = aVar.f9086f;
        this.g = aVar.g;
    }

    public final byte[] a() {
        byte[] a10 = super.a();
        b.I0(this.f9083e, a10, 16);
        b.I0(this.f9084f, a10, 20);
        b.I0(this.g, a10, 24);
        return a10;
    }
}
