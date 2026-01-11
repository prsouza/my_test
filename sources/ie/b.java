package ie;

import ah.v;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import ge.g0;
import ge.s1;
import ie.g;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l6.b1;
import le.g;
import le.h;
import le.r;
import le.x;
import md.m;
import org.slf4j.helpers.MessageFormatter;
import pd.d;
import xd.l;
import y.c;

public abstract class b<E> implements t<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6419c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "onCloseHandler");

    /* renamed from: a  reason: collision with root package name */
    public final l<E, m> f6420a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6421b = new g();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: s  reason: collision with root package name */
        public final E f6422s;

        public a(E e10) {
            this.f6422s = e10;
        }

        public final r A() {
            return k.B;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("SendBuffered@");
            d10.append(g0.o(this));
            d10.append('(');
            d10.append(this.f6422s);
            d10.append(')');
            return d10.toString();
        }

        public final void x() {
        }

        public final Object y() {
            return this.f6422s;
        }

        public final void z(h<?> hVar) {
        }
    }

    /* renamed from: ie.b$b  reason: collision with other inner class name */
    public static final class C0110b extends h.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f6423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0110b(h hVar, b bVar) {
            super(hVar);
            this.f6423d = bVar;
        }

        public final Object c(Object obj) {
            h hVar = (h) obj;
            if (this.f6423d.l()) {
                return null;
            }
            return a.b.A;
        }
    }

    public b(l<? super E, m> lVar) {
        this.f6420a = lVar;
    }

    public static final void a(b bVar, d dVar, Object obj, h hVar) {
        x p10;
        bVar.g(hVar);
        Throwable C = hVar.C();
        l<E, m> lVar = bVar.f6420a;
        if (lVar == null || (p10 = c.p(lVar, obj, (x) null)) == null) {
            ((ge.l) dVar).resumeWith(b1.k(C));
            return;
        }
        a.b.D(p10, C);
        ((ge.l) dVar).resumeWith(b1.k(p10));
    }

    public final boolean b(Throwable th2) {
        boolean z;
        boolean z10;
        Object obj;
        r rVar;
        h hVar = new h(th2);
        g gVar = this.f6421b;
        while (true) {
            h q10 = gVar.q();
            z = false;
            if (!(q10 instanceof h)) {
                if (q10.i(hVar, gVar)) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            hVar = (h) this.f6421b.q();
        }
        g(hVar);
        if (!(!z10 || (obj = this.onCloseHandler) == null || obj == (rVar = v.B))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6419c;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                yd.x.a(obj, 1);
                ((l) obj).k(th2);
            }
        }
        return z10;
    }

    public Object d(s sVar) {
        boolean z;
        h q10;
        if (i()) {
            g gVar = this.f6421b;
            do {
                q10 = gVar.q();
                if (q10 instanceof q) {
                    return q10;
                }
            } while (!q10.i(sVar, gVar));
            return null;
        }
        g gVar2 = this.f6421b;
        C0110b bVar = new C0110b(sVar, this);
        while (true) {
            h q11 = gVar2.q();
            if (!(q11 instanceof q)) {
                int w6 = q11.w(sVar, gVar2, bVar);
                z = true;
                if (w6 != 1) {
                    if (w6 == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return q11;
            }
        }
        if (!z) {
            return v.A;
        }
        return null;
    }

    public String e() {
        return BuildConfig.FLAVOR;
    }

    public final h<?> f() {
        h q10 = this.f6421b.q();
        h<?> hVar = q10 instanceof h ? (h) q10 : null;
        if (hVar == null) {
            return null;
        }
        g(hVar);
        return hVar;
    }

    public final void g(h<?> hVar) {
        Object obj = null;
        while (true) {
            h q10 = hVar.q();
            o oVar = q10 instanceof o ? (o) q10 : null;
            if (oVar == null) {
                break;
            } else if (!oVar.u()) {
                oVar.r();
            } else {
                obj = v.d0(obj, oVar);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((o) obj).y(hVar);
                return;
            }
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    ((o) arrayList.get(size)).y(hVar);
                    if (i >= 0) {
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final Object h(E e10, d<? super m> dVar) {
        s sVar;
        if (m(e10) == v.f621x) {
            return m.f8555a;
        }
        ge.l E = c.E(ad.c.Y(dVar));
        while (true) {
            if (!(this.f6421b.p() instanceof q) && l()) {
                if (this.f6420a == null) {
                    sVar = new u(e10, E);
                } else {
                    sVar = new v(e10, E, this.f6420a);
                }
                Object d10 = d(sVar);
                if (d10 == null) {
                    E.i(new s1(sVar));
                    break;
                } else if (d10 instanceof h) {
                    a(this, E, e10, (h) d10);
                    break;
                } else if (d10 != v.A && !(d10 instanceof o)) {
                    throw new IllegalStateException(e.a0("enqueueSend returned ", d10).toString());
                }
            }
            Object m10 = m(e10);
            if (m10 == v.f621x) {
                E.resumeWith(m.f8555a);
                break;
            } else if (m10 != v.f622y) {
                if (m10 instanceof h) {
                    a(this, E, e10, (h) m10);
                } else {
                    throw new IllegalStateException(e.a0("offerInternal returned ", m10).toString());
                }
            }
        }
        Object t10 = E.t();
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        if (t10 != aVar) {
            t10 = m.f8555a;
        }
        if (t10 == aVar) {
            return t10;
        }
        return m.f8555a;
    }

    public abstract boolean i();

    public final Object k(E e10) {
        g.a aVar;
        Object m10 = m(e10);
        if (m10 == v.f621x) {
            return m.f8555a;
        }
        if (m10 == v.f622y) {
            h<?> f10 = f();
            if (f10 == null) {
                return g.f6434b;
            }
            g(f10);
            aVar = new g.a(f10.C());
        } else if (m10 instanceof h) {
            h hVar = (h) m10;
            g(hVar);
            aVar = new g.a(hVar.C());
        } else {
            throw new IllegalStateException(e.a0("trySend returned ", m10).toString());
        }
        return aVar;
    }

    public abstract boolean l();

    public Object m(E e10) {
        q o4;
        do {
            o4 = o();
            if (o4 == null) {
                return v.f622y;
            }
        } while (o4.b(e10) == null);
        o4.f();
        return o4.d();
    }

    public final boolean n() {
        return f() != null;
    }

    public q<E> o() {
        h hVar;
        h v10;
        le.g gVar = this.f6421b;
        while (true) {
            hVar = (h) gVar.o();
            if (hVar != gVar && (hVar instanceof q)) {
                if (((((q) hVar) instanceof h) && !hVar.t()) || (v10 = hVar.v()) == null) {
                    break;
                }
                v10.s();
            }
        }
        hVar = null;
        return (q) hVar;
    }

    public final s q() {
        h hVar;
        h v10;
        le.g gVar = this.f6421b;
        while (true) {
            hVar = (h) gVar.o();
            if (hVar != gVar && (hVar instanceof s)) {
                if (((((s) hVar) instanceof h) && !hVar.t()) || (v10 = hVar.v()) == null) {
                    break;
                }
                v10.s();
            }
        }
        hVar = null;
        return (s) hVar;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('@');
        sb2.append(g0.o(this));
        sb2.append(MessageFormatter.DELIM_START);
        h p10 = this.f6421b.p();
        if (p10 == this.f6421b) {
            str = "EmptyQueue";
        } else {
            if (p10 instanceof h) {
                str2 = p10.toString();
            } else if (p10 instanceof o) {
                str2 = "ReceiveQueued";
            } else if (p10 instanceof s) {
                str2 = "SendQueued";
            } else {
                str2 = e.a0("UNEXPECTED:", p10);
            }
            h q10 = this.f6421b.q();
            if (q10 != p10) {
                StringBuilder c10 = b9.m.c(str2, ",queueSize=");
                le.g gVar = this.f6421b;
                int i = 0;
                for (h hVar = (h) gVar.o(); !e.r(hVar, gVar); hVar = hVar.p()) {
                    if (hVar instanceof h) {
                        i++;
                    }
                }
                c10.append(i);
                str = c10.toString();
                if (q10 instanceof h) {
                    str = str + ",closedForSend=" + q10;
                }
            } else {
                str = str2;
            }
        }
        sb2.append(str);
        sb2.append(MessageFormatter.DELIM_STOP);
        sb2.append(e());
        return sb2.toString();
    }
}
