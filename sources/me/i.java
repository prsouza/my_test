package me;

import a.a;
import ge.g0;

public final class i extends g {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f8582c;

    public i(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f8582c = runnable;
    }

    public final void run() {
        try {
            this.f8582c.run();
        } finally {
            this.f8581b.a();
        }
    }

    public final String toString() {
        StringBuilder d10 = a.d("Task[");
        d10.append(g0.n(this.f8582c));
        d10.append('@');
        d10.append(g0.o(this.f8582c));
        d10.append(", ");
        d10.append(this.f8580a);
        d10.append(", ");
        d10.append(this.f8581b);
        d10.append(']');
        return d10.toString();
    }
}
