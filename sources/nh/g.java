package nh;

import android.support.v4.media.b;
import nh.n;

public final class g extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f9075e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9076f;

    public static class a extends n.a<a> {

        /* renamed from: e  reason: collision with root package name */
        public int f9077e = 0;

        /* renamed from: f  reason: collision with root package name */
        public int f9078f = 0;

        public a() {
            super(2);
        }

        public final n.a a() {
            return this;
        }

        public final n e() {
            return new g(this);
        }
    }

    public g(a aVar) {
        super(aVar);
        this.f9075e = aVar.f9077e;
        this.f9076f = aVar.f9078f;
    }

    public final byte[] a() {
        byte[] a10 = super.a();
        b.I0(0, a10, 16);
        b.I0(this.f9075e, a10, 20);
        b.I0(this.f9076f, a10, 24);
        return a10;
    }
}
