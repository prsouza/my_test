package ki;

import ki.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i.a.C0138a f7598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7599b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f7600c;

    public /* synthetic */ h(i.a.C0138a aVar, d dVar, Throwable th2) {
        this.f7598a = aVar;
        this.f7599b = dVar;
        this.f7600c = th2;
    }

    public final void run() {
        i.a.C0138a aVar = this.f7598a;
        this.f7599b.a(i.a.this, this.f7600c);
    }
}
