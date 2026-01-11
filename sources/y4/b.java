package y4;

import a.a;
import java.util.Objects;
import java.util.logging.Logger;
import q4.h;
import t4.m;
import t4.q;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f13473a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f13474b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f13475c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ m f13476s;

    public /* synthetic */ b(c cVar, q qVar, h hVar, m mVar) {
        this.f13473a = cVar;
        this.f13474b = qVar;
        this.f13475c = hVar;
        this.f13476s = mVar;
    }

    public final void run() {
        c cVar = this.f13473a;
        q qVar = this.f13474b;
        h hVar = this.f13475c;
        m mVar = this.f13476s;
        Objects.requireNonNull(cVar);
        try {
            u4.m mVar2 = cVar.f13480c.get(qVar.b());
            if (mVar2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{qVar.b()});
                c.f13477f.warning(format);
                hVar.b(new IllegalArgumentException(format));
                return;
            }
            cVar.f13482e.a(new a(cVar, qVar, mVar2.b(mVar)));
            hVar.b((Exception) null);
        } catch (Exception e10) {
            Logger logger = c.f13477f;
            StringBuilder d10 = a.d("Error scheduling event ");
            d10.append(e10.getMessage());
            logger.warning(d10.toString());
            hVar.b(e10);
        }
    }
}
