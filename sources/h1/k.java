package h1;

import android.os.CancellationSignal;
import ge.g1;
import java.util.concurrent.CancellationException;
import md.m;
import xd.l;
import yd.h;

public final class k extends h implements l<Throwable, m> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f5738b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g1 f5739c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(CancellationSignal cancellationSignal, g1 g1Var) {
        super(1);
        this.f5738b = cancellationSignal;
        this.f5739c = g1Var;
    }

    public final Object k(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f5738b.cancel();
        this.f5739c.c((CancellationException) null);
        return m.f8555a;
    }
}
