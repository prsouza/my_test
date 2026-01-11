package h1;

import mb.c;
import mb.e;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5791a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5792b;

    public /* synthetic */ z(Object obj, int i) {
        this.f5791a = i;
        this.f5792b = obj;
    }

    public final void run() {
        switch (this.f5791a) {
            case 0:
                ((a0) this.f5792b).f5651a.a();
                return;
            default:
                c cVar = (c) this.f5792b;
                int i = e.f8523s;
                e6.e.D(cVar, "this$0");
                c.b bVar = cVar.f8520s;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                return;
        }
    }
}
