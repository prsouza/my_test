package s7;

import android.content.Intent;
import r8.a;
import r8.b;
import x8.n;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10948a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10949b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10950c;

    public /* synthetic */ g(Object obj, Object obj2, int i) {
        this.f10948a = i;
        this.f10949b = obj;
        this.f10950c = obj2;
    }

    public final void run() {
        a.C0207a<T> aVar;
        switch (this.f10948a) {
            case 0:
                w wVar = (w) this.f10949b;
                b<T> bVar = (b) this.f10950c;
                if (wVar.f10983b == v.f10980a) {
                    synchronized (wVar) {
                        aVar = wVar.f10982a;
                        wVar.f10982a = null;
                        wVar.f10983b = bVar;
                    }
                    aVar.b(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            default:
                ((n) this.f10949b).a((Intent) this.f10950c);
                return;
        }
    }
}
