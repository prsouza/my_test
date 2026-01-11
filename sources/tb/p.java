package tb;

import ge.d0;
import je.f;
import je.j;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import ua.b;

@e(c = "io.nodle.cash.ui.viewmodel.NotificationViewModel$getNotifications$1", f = "NotificationViewModel.kt", l = {32, 33}, m = "invokeSuspend")
public final class p extends i implements xd.p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11507a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f11508b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f11509a;

        public a(r rVar) {
            this.f11509a = rVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nd.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: nd.o} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: nd.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(java.lang.Object r9, pd.d r10) {
            /*
                r8 = this;
                ua.e r9 = (ua.e) r9
                boolean r10 = r9 instanceof ua.e.b
                if (r10 == 0) goto L_0x0078
                T r9 = r9.f11771a
                r10 = r9
                java.util.List r10 = (java.util.List) r10
                tb.r r9 = r8.f11509a
                java.lang.String r9 = r9.f11516t
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "notifications "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                android.util.Log.d(r9, r0)
                tb.r r0 = r8.f11509a
                je.o r1 = r0.f11517u
            L_0x0027:
                java.lang.Object r9 = r1.getValue()
                r2 = r9
                gb.g r2 = (gb.g) r2
                if (r10 == 0) goto L_0x005b
                java.util.ArrayList r3 = new java.util.ArrayList
                int r4 = nd.g.S0(r10)
                r3.<init>(r4)
                java.util.Iterator r4 = r10.iterator()
            L_0x003d:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x005d
                java.lang.Object r5 = r4.next()
                bb.b r5 = (bb.b) r5
                tb.n r6 = new tb.n
                r6.<init>(r0, r5)
                tb.o r7 = new tb.o
                r7.<init>(r0, r5)
                gb.f r5 = jc.b.C(r5, r6, r7)
                r3.add(r5)
                goto L_0x003d
            L_0x005b:
                nd.o r3 = nd.o.f8966a
            L_0x005d:
                r4 = 1
                if (r10 == 0) goto L_0x0069
                boolean r5 = r10.isEmpty()
                if (r5 == 0) goto L_0x0067
                goto L_0x0069
            L_0x0067:
                r5 = 0
                goto L_0x006a
            L_0x0069:
                r5 = r4
            L_0x006a:
                r4 = r4 ^ r5
                r5 = 0
                r6 = 4
                gb.g r2 = gb.g.a(r2, r3, r4, r5, r6)
                boolean r9 = r1.g(r9, r2)
                if (r9 == 0) goto L_0x0027
                goto L_0x007a
            L_0x0078:
                boolean r9 = r9 instanceof ua.e.a
            L_0x007a:
                md.m r9 = md.m.f8555a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.p.a.a(java.lang.Object, pd.d):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(r rVar, d<? super p> dVar) {
        super(2, dVar);
        this.f11508b = rVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new p(this.f11508b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11507a;
        if (i == 0) {
            b1.w(obj);
            ua.d dVar = new ua.d(this.f11508b.f11515s);
            this.f11507a = 1;
            obj = new j(new b(dVar, (d<? super b>) null));
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a aVar2 = new a(this.f11508b);
        this.f11507a = 2;
        if (((je.e) obj).b(aVar2, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
