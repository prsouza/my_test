package v1;

import androidx.work.ListenableWorker;
import f2.c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import u1.p;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f12157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f12159c;

    public l(m mVar, c cVar, String str) {
        this.f12159c = mVar;
        this.f12157a = cVar;
        this.f12158b = str;
    }

    public final void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.f12157a.get();
            if (aVar == null) {
                p.c().b(m.I, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f12159c.f12164t.f4295c}), new Throwable[0]);
            } else {
                p.c().a(m.I, String.format("%s returned a %s result.", new Object[]{this.f12159c.f12164t.f4295c, aVar}), new Throwable[0]);
                this.f12159c.f12167w = aVar;
            }
        } catch (CancellationException e10) {
            p.c().d(m.I, String.format("%s was cancelled", new Object[]{this.f12158b}), e10);
        } catch (InterruptedException | ExecutionException e11) {
            p.c().b(m.I, String.format("%s failed because it threw an exception/error", new Object[]{this.f12158b}), e11);
        } catch (Throwable th2) {
            this.f12159c.c();
            throw th2;
        }
        this.f12159c.c();
    }
}
