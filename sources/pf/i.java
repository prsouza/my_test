package pf;

import e6.e;
import java.io.IOException;
import java.util.Objects;
import lf.a;
import pf.f;
import yd.u;

public final class i extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.e f9983e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f9984f = false;
    public final /* synthetic */ u g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, f.e eVar, u uVar) {
        super(str, true);
        this.f9983e = eVar;
        this.g = uVar;
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, pf.q>] */
    public final long a() {
        long a10;
        int i;
        q[] qVarArr;
        f.e eVar = this.f9983e;
        boolean z = this.f9984f;
        T t10 = this.g;
        Objects.requireNonNull(eVar);
        e.D(t10, "settings");
        u uVar = new u();
        synchronized (f.this.N) {
            synchronized (f.this) {
                u uVar2 = f.this.H;
                if (!z) {
                    T uVar3 = new u();
                    uVar3.b(uVar2);
                    uVar3.b(t10);
                    t10 = uVar3;
                }
                uVar.f13622a = t10;
                a10 = ((long) t10.a()) - ((long) uVar2.a());
                if (a10 != 0) {
                    if (!f.this.f9953c.isEmpty()) {
                        Object[] array = f.this.f9953c.values().toArray(new q[0]);
                        if (array != null) {
                            qVarArr = (q[]) array;
                            f fVar = f.this;
                            u uVar4 = uVar.f13622a;
                            Objects.requireNonNull(fVar);
                            e.D(uVar4, "<set-?>");
                            fVar.H = uVar4;
                            f.this.z.c(new g(f.this.f9954s + " onSettings", eVar, uVar), 0);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                }
                qVarArr = null;
                f fVar2 = f.this;
                u uVar42 = uVar.f13622a;
                Objects.requireNonNull(fVar2);
                e.D(uVar42, "<set-?>");
                fVar2.H = uVar42;
                f.this.z.c(new g(f.this.f9954s + " onSettings", eVar, uVar), 0);
            }
            try {
                f.this.N.a(uVar.f13622a);
            } catch (IOException e10) {
                f.a(f.this, e10);
            }
        }
        if (qVarArr == null) {
            return -1;
        }
        for (q qVar : qVarArr) {
            synchronized (qVar) {
                qVar.f10017d += a10;
                if (a10 > 0) {
                    qVar.notifyAll();
                }
            }
        }
        return -1;
    }
}
