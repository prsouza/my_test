package s8;

import e6.e;
import mb.c;
import mb.g;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10992a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10993b;

    public /* synthetic */ b(Object obj, int i) {
        this.f10992a = i;
        this.f10993b = obj;
    }

    public final void run() {
        switch (this.f10992a) {
            case 0:
                ((e) this.f10993b).b(false);
                return;
            default:
                c cVar = (c) this.f10993b;
                int i = g.f8529s;
                e.D(cVar, "this$0");
                c.b bVar = cVar.f8520s;
                if (bVar != null) {
                    bVar.c();
                    return;
                }
                return;
        }
    }
}
