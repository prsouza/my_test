package z4;

import a5.c;
import a5.d;
import a5.j;
import android.content.Context;
import b5.b;
import c5.a;
import h1.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import t4.h;
import t4.l;
import t4.m;
import t4.q;
import u4.a;
import u4.e;
import u4.g;
import u4.m;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13829a;

    /* renamed from: b  reason: collision with root package name */
    public final e f13830b;

    /* renamed from: c  reason: collision with root package name */
    public final d f13831c;

    /* renamed from: d  reason: collision with root package name */
    public final u f13832d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f13833e;

    /* renamed from: f  reason: collision with root package name */
    public final b f13834f;
    public final a g;

    /* renamed from: h  reason: collision with root package name */
    public final a f13835h;
    public final c i;

    public o(Context context, e eVar, d dVar, u uVar, Executor executor, b bVar, a aVar, a aVar2, c cVar) {
        this.f13829a = context;
        this.f13830b = eVar;
        this.f13831c = dVar;
        this.f13832d = uVar;
        this.f13833e = executor;
        this.f13834f = bVar;
        this.g = aVar;
        this.f13835h = aVar2;
        this.i = cVar;
    }

    public final g a(q qVar, int i10) {
        g a10;
        m mVar = this.f13830b.get(qVar.b());
        g bVar = new u4.b(g.a.OK, 0);
        long j10 = 0;
        while (((Boolean) this.f13834f.a(new j(this, qVar))).booleanValue()) {
            Iterable<j> iterable = (Iterable) this.f13834f.a(new k(this, qVar));
            if (!iterable.iterator().hasNext()) {
                return bVar;
            }
            boolean z = false;
            if (mVar == null) {
                aa.b.A("Uploader", "Unknown backend for %s, deleting event batch for it...", qVar);
                a10 = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (j a11 : iterable) {
                    arrayList.add(a11.a());
                }
                if (qVar.c() != null) {
                    b bVar2 = this.f13834f;
                    c cVar = this.i;
                    Objects.requireNonNull(cVar);
                    x4.a aVar = (x4.a) bVar2.a(new f(cVar));
                    m.a a12 = t4.m.a();
                    a12.e(this.g.a());
                    a12.g(this.f13835h.a());
                    h.b bVar3 = (h.b) a12;
                    bVar3.f11357a = "GDT_CLIENT_METRICS";
                    q4.b bVar4 = new q4.b("proto");
                    Objects.requireNonNull(aVar);
                    l8.h hVar = t4.o.f11382a;
                    Objects.requireNonNull(hVar);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.a(aVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    bVar3.f11359c = new l(bVar4, byteArrayOutputStream.toByteArray());
                    arrayList.add(mVar.b(bVar3.c()));
                }
                a10 = mVar.a(new u4.a(arrayList, qVar.c(), (a.C0228a) null));
            }
            g gVar = a10;
            if (gVar.c() == g.a.TRANSIENT_ERROR) {
                this.f13834f.a(new h(this, iterable, qVar, j10));
                this.f13832d.a(qVar, i10 + 1, true);
                return gVar;
            }
            this.f13834f.a(new g(this, iterable));
            if (gVar.c() == g.a.OK) {
                long max = Math.max(j10, gVar.b());
                if (qVar.c() != null) {
                    z = true;
                }
                if (z) {
                    this.f13834f.a(new a5.l(this));
                }
                j10 = max;
            } else if (gVar.c() == g.a.INVALID_PAYLOAD) {
                HashMap hashMap = new HashMap();
                for (j a13 : iterable) {
                    String h10 = a13.a().h();
                    if (!hashMap.containsKey(h10)) {
                        hashMap.put(h10, 1);
                    } else {
                        hashMap.put(h10, Integer.valueOf(((Integer) hashMap.get(h10)).intValue() + 1));
                    }
                }
                this.f13834f.a(new i(this, hashMap));
            }
            bVar = gVar;
        }
        this.f13834f.a(new m(this, qVar, j10));
        return bVar;
    }
}
