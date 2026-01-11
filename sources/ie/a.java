package ie;

import ah.v;
import ge.g0;
import ge.k;
import ie.g;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import l6.b1;
import le.h;
import le.r;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import xd.l;

public abstract class a<E> extends b<E> implements e<E> {

    /* renamed from: ie.a$a  reason: collision with other inner class name */
    public static class C0109a<E> extends o<E> {

        /* renamed from: s  reason: collision with root package name */
        public final k<Object> f6410s;

        /* renamed from: t  reason: collision with root package name */
        public final int f6411t;

        public C0109a(k<Object> kVar, int i) {
            this.f6410s = kVar;
            this.f6411t = i;
        }

        public final r b(Object obj) {
            if (this.f6410s.q(this.f6411t == 1 ? new g(obj) : obj, x(obj)) == null) {
                return null;
            }
            return c3.k.B;
        }

        public final void f() {
            this.f6410s.d();
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("ReceiveElement@");
            d10.append(g0.o(this));
            d10.append("[receiveMode=");
            d10.append(this.f6411t);
            d10.append(']');
            return d10.toString();
        }

        public final void y(h<?> hVar) {
            if (this.f6411t == 1) {
                this.f6410s.resumeWith(new g(new g.a(hVar.f6437s)));
                return;
            }
            k<Object> kVar = this.f6410s;
            Throwable th2 = hVar.f6437s;
            if (th2 == null) {
                th2 = new i();
            }
            kVar.resumeWith(b1.k(th2));
        }
    }

    public static final class b<E> extends C0109a<E> {

        /* renamed from: u  reason: collision with root package name */
        public final l<E, m> f6412u;

        public b(k<Object> kVar, int i, l<? super E, m> lVar) {
            super(kVar, i);
            this.f6412u = lVar;
        }

        public final l<Throwable, m> x(E e10) {
            return new le.m(this.f6412u, e10, this.f6410s.getContext());
        }
    }

    public final class c extends ge.d {

        /* renamed from: a  reason: collision with root package name */
        public final o<?> f6413a;

        public c(o<?> oVar) {
            this.f6413a = oVar;
        }

        public final void a(Throwable th2) {
            if (this.f6413a.u()) {
                Objects.requireNonNull(a.this);
            }
        }

        public final Object k(Object obj) {
            Throwable th2 = (Throwable) obj;
            if (this.f6413a.u()) {
                Objects.requireNonNull(a.this);
            }
            return m.f8555a;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("RemoveReceiveOnCancel[");
            d10.append(this.f6413a);
            d10.append(']');
            return d10.toString();
        }
    }

    public static final class d extends h.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a f6415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(h hVar, a aVar) {
            super(hVar);
            this.f6415d = aVar;
        }

        public final Object c(Object obj) {
            h hVar = (h) obj;
            if (this.f6415d.t()) {
                return null;
            }
            return a.b.A;
        }
    }

    @rd.e(c = "kotlinx.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {633}, m = "receiveCatching-JP2dKIU")
    public static final class e extends rd.c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f6416a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a<E> f6417b;

        /* renamed from: c  reason: collision with root package name */
        public int f6418c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a<E> aVar, pd.d<? super e> dVar) {
            super(dVar);
            this.f6417b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6416a = obj;
            this.f6418c |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            Object p10 = this.f6417b.p(this);
            if (p10 == qd.a.COROUTINE_SUSPENDED) {
                return p10;
            }
            return new g(p10);
        }
    }

    public a(l<? super E, m> lVar) {
        super(lVar);
    }

    public final void c(CancellationException cancellationException) {
        if (!u()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(e6.e.a0(getClass().getSimpleName(), " was cancelled"));
            }
            v(b(cancellationException));
        }
    }

    public final Object j(pd.d<? super E> dVar) {
        Object x10 = x();
        if (x10 == v.z || (x10 instanceof h)) {
            return y(0, dVar);
        }
        return x10;
    }

    public final q<E> o() {
        q<E> o4 = super.o();
        if (o4 != null) {
            boolean z = o4 instanceof h;
        }
        return o4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object p(pd.d<? super ie.g<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ie.a.e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            ie.a$e r0 = (ie.a.e) r0
            int r1 = r0.f6418c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6418c = r1
            goto L_0x0018
        L_0x0013:
            ie.a$e r0 = new ie.a$e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f6416a
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f6418c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            l6.b1.w(r5)
            goto L_0x0052
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            l6.b1.w(r5)
            java.lang.Object r5 = r4.x()
            le.r r2 = ah.v.z
            if (r5 == r2) goto L_0x0049
            boolean r0 = r5 instanceof ie.h
            if (r0 == 0) goto L_0x0048
            ie.h r5 = (ie.h) r5
            java.lang.Throwable r5 = r5.f6437s
            ie.g$a r0 = new ie.g$a
            r0.<init>(r5)
            r5 = r0
        L_0x0048:
            return r5
        L_0x0049:
            r0.f6418c = r3
            java.lang.Object r5 = r4.y(r3, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            ie.g r5 = (ie.g) r5
            java.lang.Object r5 = r5.f6435a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.a.p(pd.d):java.lang.Object");
    }

    public boolean r(o<? super E> oVar) {
        int w6;
        h q10;
        if (!s()) {
            le.g gVar = this.f6421b;
            d dVar = new d(oVar, this);
            do {
                h q11 = gVar.q();
                if (!(!(q11 instanceof s))) {
                    break;
                }
                w6 = q11.w(oVar, gVar, dVar);
                if (w6 == 1) {
                    return true;
                }
            } while (w6 != 2);
        } else {
            le.g gVar2 = this.f6421b;
            do {
                q10 = gVar2.q();
                if (!(!(q10 instanceof s))) {
                }
            } while (!q10.i(oVar, gVar2));
            return true;
        }
        return false;
    }

    public abstract boolean s();

    public abstract boolean t();

    public boolean u() {
        h p10 = this.f6421b.p();
        h hVar = null;
        h hVar2 = p10 instanceof h ? (h) p10 : null;
        if (hVar2 != null) {
            g(hVar2);
            hVar = hVar2;
        }
        return hVar != null && t();
    }

    public void v(boolean z) {
        h<?> f10 = f();
        if (f10 != null) {
            Object obj = null;
            while (true) {
                h q10 = f10.q();
                if (q10 instanceof le.g) {
                    w(obj, f10);
                    return;
                } else if (!q10.u()) {
                    q10.r();
                } else {
                    obj = v.d0(obj, (s) q10);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public void w(Object obj, h<?> hVar) {
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((s) obj).z(hVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((s) arrayList.get(size)).z(hVar);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public Object x() {
        while (true) {
            s q10 = q();
            if (q10 == null) {
                return v.z;
            }
            if (q10.A() != null) {
                q10.x();
                return q10.y();
            }
            q10.B();
        }
    }

    public final <R> Object y(int i, pd.d<? super R> dVar) {
        C0109a aVar;
        ge.l E = y.c.E(ad.c.Y(dVar));
        if (this.f6420a == null) {
            aVar = new C0109a(E, i);
        } else {
            aVar = new b(E, i, this.f6420a);
        }
        while (true) {
            if (r(aVar)) {
                E.i(new c(aVar));
                break;
            }
            Object x10 = x();
            if (x10 instanceof h) {
                aVar.y((h) x10);
                break;
            } else if (x10 != v.z) {
                E.o(aVar.f6411t == 1 ? new g(x10) : x10, aVar.x(x10));
            }
        }
        Object t10 = E.t();
        qd.a aVar2 = qd.a.COROUTINE_SUSPENDED;
        return t10;
    }
}
