package androidx.lifecycle;

import androidx.lifecycle.h0;
import c3.k;
import ge.d0;
import ge.g;
import ge.g1;
import ge.o0;
import ge.v1;
import ge.w1;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import le.l;
import md.m;
import me.c;
import p.b;
import pd.d;
import pd.f;
import xd.p;

public final class h<T> extends h0<T> {

    /* renamed from: m  reason: collision with root package name */
    public e<T> f2118m;

    public static final class a extends yd.h implements xd.a<m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h<T> f2119b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h<T> hVar) {
            super(0);
            this.f2119b = hVar;
        }

        public final Object c() {
            this.f2119b.f2118m = null;
            return m.f8555a;
        }
    }

    public h(f fVar, long j10, p<? super f0<T>, ? super d<? super m>, ? extends Object> pVar) {
        w1 w1Var = new w1((g1) fVar.get(g1.b.f5401a));
        c cVar = o0.f5433a;
        this.f2118m = new e(this, pVar, j10, k.j(l.f8259a.w0().plus(fVar).plus(w1Var)), new a(this));
    }

    public final void g() {
        b.e eVar = (b.e) this.f2120l.iterator();
        if (!eVar.hasNext()) {
            e<T> eVar2 = this.f2118m;
            if (eVar2 != null) {
                v1 v1Var = eVar2.g;
                if (v1Var != null) {
                    v1Var.c((CancellationException) null);
                }
                eVar2.g = null;
                if (eVar2.f2102f == null) {
                    eVar2.f2102f = g.b(eVar2.f2100d, (f) null, new d(eVar2, (d<? super d>) null), 3);
                    return;
                }
                return;
            }
            return;
        }
        Objects.requireNonNull((h0.a) ((Map.Entry) eVar.next()).getValue());
        throw null;
    }

    public final void h() {
        b.e eVar = (b.e) this.f2120l.iterator();
        if (!eVar.hasNext()) {
            e<T> eVar2 = this.f2118m;
            if (eVar2 == null) {
                return;
            }
            if (eVar2.g == null) {
                d0 d0Var = eVar2.f2100d;
                c cVar = o0.f5433a;
                eVar2.g = (v1) g.b(d0Var, l.f8259a.w0(), new c(eVar2, (d<? super c>) null), 2);
                return;
            }
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        Objects.requireNonNull((h0.a) ((Map.Entry) eVar.next()).getValue());
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(pd.d<? super md.m> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.i
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.i r0 = (androidx.lifecycle.i) r0
            int r1 = r0.f2123c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2123c = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.i r0 = new androidx.lifecycle.i
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f2121a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r0 = r0.f2123c
            if (r0 == 0) goto L_0x0030
            r1 = 1
            if (r0 != r1) goto L_0x0028
            r0 = 0
            l6.b1.w(r5)
            goto L_0x0034
        L_0x0028:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0030:
            l6.b1.w(r5)
            r0 = r4
        L_0x0034:
            java.util.Objects.requireNonNull(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.h.l(pd.d):void");
    }
}
