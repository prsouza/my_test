package y4;

import a5.d;
import b5.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import q4.h;
import t4.m;
import t4.q;
import t4.v;
import u4.e;
import z4.u;

public final class c implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f13477f = Logger.getLogger(v.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final u f13478a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f13479b;

    /* renamed from: c  reason: collision with root package name */
    public final e f13480c;

    /* renamed from: d  reason: collision with root package name */
    public final d f13481d;

    /* renamed from: e  reason: collision with root package name */
    public final b f13482e;

    public c(Executor executor, e eVar, u uVar, d dVar, b bVar) {
        this.f13479b = executor;
        this.f13480c = eVar;
        this.f13478a = uVar;
        this.f13481d = dVar;
        this.f13482e = bVar;
    }

    public final void a(q qVar, m mVar, h hVar) {
        this.f13479b.execute(new b(this, qVar, hVar, mVar));
    }
}
