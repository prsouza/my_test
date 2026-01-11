package i3;

import i3.c;
import java.util.Objects;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f6013a;

    public b(c cVar) {
        this.f6013a = cVar;
    }

    public final void run() {
        c cVar = this.f6013a;
        Objects.requireNonNull(cVar);
        while (true) {
            try {
                cVar.b((c.a) cVar.f6023c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
