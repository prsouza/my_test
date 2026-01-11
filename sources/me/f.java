package me;

import ge.x0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class f extends x0 {

    /* renamed from: b  reason: collision with root package name */
    public a f8579b;

    public f(int i, int i10, long j10) {
        this.f8579b = new a(i, i10, j10, "DefaultDispatcher");
    }

    public final void p0(pd.f fVar, Runnable runnable) {
        a aVar = this.f8579b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f8556w;
        aVar.e(runnable, j.f8588f, false);
    }
}
