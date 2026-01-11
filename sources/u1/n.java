package u1;

import android.content.Intent;
import ge.k;
import java.util.concurrent.CancellationException;
import l6.b1;
import l6.m1;
import z6.a;

public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11647a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11648b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f11649c;

    public /* synthetic */ n(Object obj, Object obj2, int i) {
        this.f11647a = i;
        this.f11648b = obj;
        this.f11649c = obj2;
    }

    public final void run() {
        switch (this.f11647a) {
            case 0:
                try {
                    ((k) this.f11648b).resumeWith(((a) this.f11649c).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        ((k) this.f11648b).l(cause);
                        return;
                    } else {
                        ((k) this.f11648b).resumeWith(b1.k(cause));
                        return;
                    }
                }
            default:
                ((m1) this.f11648b).f7931b.a((Intent) this.f11649c);
                return;
        }
    }
}
