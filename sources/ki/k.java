package ki;

import ge.l;
import p002if.b0;
import p002if.d;

public abstract class k<ResponseT, ReturnT> extends b0<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final y f7607a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f7608b;

    /* renamed from: c  reason: collision with root package name */
    public final f<b0, ResponseT> f7609c;

    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, ReturnT> f7610d;

        public a(y yVar, d.a aVar, f<b0, ResponseT> fVar, c<ResponseT, ReturnT> cVar) {
            super(yVar, aVar, fVar);
            this.f7610d = cVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [ki.b, ki.b<ResponseT>] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ReturnT c(ki.b<ResponseT> r1, java.lang.Object[] r2) {
            /*
                r0 = this;
                ki.c<ResponseT, ReturnT> r2 = r0.f7610d
                java.lang.Object r1 = r2.b(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ki.k.a.c(ki.b, java.lang.Object[]):java.lang.Object");
        }
    }

    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f7611d;

        public b(y yVar, d.a aVar, f fVar, c cVar) {
            super(yVar, aVar, fVar);
            this.f7611d = cVar;
        }

        public final Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f7611d.b(bVar);
            pd.d dVar = objArr[objArr.length - 1];
            try {
                l lVar = new l(ad.c.Y(dVar), 1);
                lVar.i(new m(bVar2));
                bVar2.t(new n(lVar));
                Object t10 = lVar.t();
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                return t10;
            } catch (Exception e10) {
                return q.a(e10, dVar);
            }
        }
    }

    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final c<ResponseT, b<ResponseT>> f7612d;

        public c(y yVar, d.a aVar, f<b0, ResponseT> fVar, c<ResponseT, b<ResponseT>> cVar) {
            super(yVar, aVar, fVar);
            this.f7612d = cVar;
        }

        public final Object c(b<ResponseT> bVar, Object[] objArr) {
            b bVar2 = (b) this.f7612d.b(bVar);
            pd.d dVar = objArr[objArr.length - 1];
            try {
                l lVar = new l(ad.c.Y(dVar), 1);
                lVar.i(new o(bVar2));
                bVar2.t(new p(lVar));
                Object t10 = lVar.t();
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                return t10;
            } catch (Exception e10) {
                return q.a(e10, dVar);
            }
        }
    }

    public k(y yVar, d.a aVar, f<b0, ResponseT> fVar) {
        this.f7607a = yVar;
        this.f7608b = aVar;
        this.f7609c = fVar;
    }

    public final ReturnT a(Object[] objArr) {
        return c(new r(this.f7607a, objArr, this.f7608b, this.f7609c), objArr);
    }

    public abstract ReturnT c(b<ResponseT> bVar, Object[] objArr);
}
