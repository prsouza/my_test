package k0;

import f0.f;
import g0.e;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ aa.b f7349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7350b;

    public b(aa.b bVar, int i) {
        this.f7349a = bVar;
        this.f7350b = i;
    }

    public final void run() {
        aa.b bVar = this.f7349a;
        int i = this.f7350b;
        f.c cVar = ((e.a) bVar).I;
        if (cVar != null) {
            cVar.d(i);
        }
    }
}
