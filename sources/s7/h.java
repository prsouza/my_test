package s7;

import r8.b;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s f10951a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10952b;

    public /* synthetic */ h(s sVar, b bVar) {
        this.f10951a = sVar;
        this.f10952b = bVar;
    }

    public final void run() {
        s sVar = this.f10951a;
        b bVar = this.f10952b;
        synchronized (sVar) {
            if (sVar.f10977b == null) {
                sVar.f10976a.add(bVar);
            } else {
                sVar.f10977b.add(bVar.get());
            }
        }
    }
}
