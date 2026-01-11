package t4;

import a5.a0;
import a5.b0;
import a5.g;
import a5.i0;
import android.content.Context;
import cc.a;
import java.util.Objects;
import java.util.concurrent.Executor;
import t4.n;
import u4.l;
import w4.b;
import y4.c;
import y4.d;
import z4.f;
import z4.o;
import z4.p;
import z4.s;
import z4.t;
import z4.u;

public final class j extends w {
    public a<s> A;
    public a<v> B;

    /* renamed from: a  reason: collision with root package name */
    public a<Executor> f11369a = w4.a.a(n.a.f11381a);

    /* renamed from: b  reason: collision with root package name */
    public a<Context> f11370b;

    /* renamed from: c  reason: collision with root package name */
    public u4.j f11371c;

    /* renamed from: s  reason: collision with root package name */
    public a f11372s;

    /* renamed from: t  reason: collision with root package name */
    public i0 f11373t;

    /* renamed from: u  reason: collision with root package name */
    public a<String> f11374u;

    /* renamed from: v  reason: collision with root package name */
    public a<a0> f11375v;

    /* renamed from: w  reason: collision with root package name */
    public a<f> f11376w;

    /* renamed from: x  reason: collision with root package name */
    public a<u> f11377x;

    /* renamed from: y  reason: collision with root package name */
    public a<c> f11378y;
    public a<o> z;

    public j(Context context) {
        Objects.requireNonNull(context, "instance cannot be null");
        b bVar = new b(context);
        this.f11370b = bVar;
        u4.j jVar = new u4.j(bVar);
        this.f11371c = jVar;
        this.f11372s = w4.a.a(new l(bVar, jVar));
        a<Context> aVar = this.f11370b;
        i0 i0Var = new i0(aVar);
        this.f11373t = i0Var;
        g gVar = new g(aVar);
        this.f11374u = gVar;
        a<a0> a10 = w4.a.a(new b0(i0Var, gVar));
        this.f11375v = a10;
        y4.f fVar = new y4.f();
        this.f11376w = fVar;
        a<Context> aVar2 = this.f11370b;
        y4.g gVar2 = new y4.g(aVar2, a10, fVar);
        this.f11377x = gVar2;
        a<Executor> aVar3 = this.f11369a;
        a aVar4 = this.f11372s;
        d dVar = new d(aVar3, aVar4, gVar2, a10, a10);
        this.f11378y = dVar;
        p pVar = new p(aVar2, aVar4, a10, gVar2, aVar3, a10, a10);
        this.z = pVar;
        t tVar = new t(aVar3, a10, gVar2, a10);
        this.A = tVar;
        this.B = w4.a.a(new x(dVar, pVar, tVar));
    }
}
