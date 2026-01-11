package ke;

import e6.e;
import fe.g;
import je.f;
import md.m;
import pd.d;
import pd.f;
import rd.c;
import xd.p;

public final class h<T> extends c implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f7518a;

    /* renamed from: b  reason: collision with root package name */
    public final pd.f f7519b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7520c;

    /* renamed from: s  reason: collision with root package name */
    public pd.f f7521s;

    /* renamed from: t  reason: collision with root package name */
    public d<? super m> f7522t;

    public static final class a extends yd.h implements p<Integer, f.a, Integer> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f7523b = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            f.a aVar = (f.a) obj2;
            return Integer.valueOf(((Number) obj).intValue() + 1);
        }
    }

    public h(je.f<? super T> fVar, pd.f fVar2) {
        super(g.f7517a, pd.h.f9881a);
        this.f7518a = fVar;
        this.f7519b = fVar2;
        this.f7520c = ((Number) fVar2.fold(0, a.f7523b)).intValue();
    }

    public final Object a(T t10, d<? super m> dVar) {
        try {
            Object b10 = b(dVar, t10);
            if (b10 == qd.a.COROUTINE_SUSPENDED) {
                return b10;
            }
            return m.f8555a;
        } catch (Throwable th2) {
            this.f7521s = new f(th2, dVar.getContext());
            throw th2;
        }
    }

    public final Object b(d<? super m> dVar, T t10) {
        pd.f context = dVar.getContext();
        ad.c.G(context);
        pd.f fVar = this.f7521s;
        if (fVar != context) {
            if (fVar instanceof f) {
                StringBuilder d10 = a.a.d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                d10.append(((f) fVar).f7515a);
                d10.append(", but then emission attempt of value '");
                d10.append(t10);
                d10.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(g.T0(d10.toString()).toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f7520c) {
                this.f7521s = context;
            } else {
                StringBuilder d11 = a.a.d("Flow invariant is violated:\n\t\tFlow was collected in ");
                d11.append(this.f7519b);
                d11.append(",\n\t\tbut emission happened in ");
                d11.append(context);
                d11.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(d11.toString().toString());
            }
        }
        this.f7522t = dVar;
        Object h10 = i.f7524a.h(this.f7518a, t10, this);
        if (!e.r(h10, qd.a.COROUTINE_SUSPENDED)) {
            this.f7522t = null;
        }
        return h10;
    }

    public final rd.d getCallerFrame() {
        d<? super m> dVar = this.f7522t;
        if (dVar instanceof rd.d) {
            return (rd.d) dVar;
        }
        return null;
    }

    public final pd.f getContext() {
        pd.f fVar = this.f7521s;
        return fVar == null ? pd.h.f9881a : fVar;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object invokeSuspend(Object obj) {
        Throwable a10 = md.g.a(obj);
        if (a10 != null) {
            this.f7521s = new f(a10, getContext());
        }
        d<? super m> dVar = this.f7522t;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return qd.a.COROUTINE_SUSPENDED;
    }

    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
