package l6;

import java.util.HashSet;
import java.util.Iterator;
import p6.a;
import t6.b;
import t6.h;
import t6.q;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8064b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8065c;

    public /* synthetic */ w(Object obj, Object obj2, int i) {
        this.f8063a = i;
        this.f8064b = obj;
        this.f8065c = obj2;
    }

    public final void run() {
        switch (this.f8063a) {
            case 0:
                x xVar = (x) this.f8064b;
                synchronized (xVar) {
                    Iterator it = new HashSet(xVar.f9697d).iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
                return;
            case 1:
                d2 d2Var = (d2) this.f8065c;
                ((e2) this.f8064b).f7834a.b(d2Var.f2905b, d2Var.f7818d, d2Var.f7819e);
                return;
            default:
                synchronized (((h) this.f8065c).f11410b) {
                    b bVar = ((h) this.f8065c).f11411c;
                    if (bVar != null) {
                        bVar.onFailure(((q) this.f8064b).b());
                    }
                }
                return;
        }
    }

    public w(h hVar, q qVar) {
        this.f8063a = 2;
        this.f8065c = hVar;
        this.f8064b = qVar;
    }
}
