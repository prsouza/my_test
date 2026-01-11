package ge;

import md.m;

public final class u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final z f5456a;

    /* renamed from: b  reason: collision with root package name */
    public final k<m> f5457b;

    public u1(z zVar, k<? super m> kVar) {
        this.f5456a = zVar;
        this.f5457b = kVar;
    }

    public final void run() {
        this.f5457b.m(this.f5456a);
    }
}
