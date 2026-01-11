package o6;

import t6.a;
import t6.m;
import t6.q;

public final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f9324b;

    public /* synthetic */ h(p pVar, m mVar) {
        this.f9323a = pVar;
        this.f9324b = mVar;
    }

    public final void a(q qVar) {
        p pVar = this.f9323a;
        m mVar = this.f9324b;
        synchronized (pVar.f9338f) {
            pVar.f9337e.remove(mVar);
        }
    }
}
