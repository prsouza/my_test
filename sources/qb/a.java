package qb;

import bb.f;
import bb.g;
import ge.d0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import ua.l;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.stats.GetStatsUseCase$getStats$2", f = "StatsUseCase.kt", l = {21}, m = "invokeSuspend")
public final class a extends i implements p<d0, d<? super List<? extends r>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f10344a;

    /* renamed from: b  reason: collision with root package name */
    public int f10345b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f10346c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar, d<? super a> dVar) {
        super(2, dVar);
        this.f10346c = cVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new a(this.f10346c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List<r> list;
        Iterator<T> it;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f10345b;
        if (i == 0) {
            b1.w(obj);
            List<r> a10 = this.f10346c.f10348b.a();
            long j10 = ((r) nd.m.c1(a10)).f10389b.f3439a;
            l lVar = this.f10346c.f10347a;
            this.f10344a = (ArrayList) a10;
            this.f10345b = 1;
            obj2 = lVar.d(j10, this);
            if (obj2 == aVar) {
                return aVar;
            }
            list = a10;
        } else if (i == 1) {
            list = this.f10344a;
            b1.w(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Objects.requireNonNull(this.f10346c);
        ArrayList arrayList = new ArrayList();
        for (Object next : (List) obj2) {
            if (((f) next).g == g.REWARD) {
                arrayList.add(next);
            }
        }
        List f1 = nd.m.f1(arrayList, new b());
        if (f1.isEmpty()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(nd.g.S0(list));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            r rVar = (r) it2.next();
            BigInteger bigInteger3 = BigInteger.ZERO;
            ArrayList arrayList3 = new ArrayList();
            BigInteger bigInteger4 = bigInteger3;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= rVar.f10392e.size()) {
                    it = it2;
                    bigInteger = bigInteger4;
                    break;
                }
                q qVar = rVar.f10392e.get(i10);
                if (i11 == f1.size()) {
                    e6.e.C(bigInteger3, "intervalAmount");
                    arrayList3.add(q.a(qVar, bigInteger3));
                    e6.e.C(bigInteger4, "totalAmount");
                    BigInteger add = bigInteger4.add(bigInteger3);
                    e6.e.C(add, "this.add(other)");
                    i10++;
                    it = it2;
                    bigInteger = add;
                    break;
                }
                f fVar = (f) f1.get(i11);
                BigInteger bigInteger5 = bigInteger4;
                long j11 = fVar.f2946b;
                Iterator<T> it3 = it2;
                if (j11 < qVar.f10384a) {
                    bigInteger2 = bigInteger5;
                } else if (j11 >= qVar.f10385b) {
                    e6.e.C(bigInteger3, "intervalAmount");
                    arrayList3.add(q.a(qVar, bigInteger3));
                    BigInteger bigInteger6 = bigInteger5;
                    e6.e.C(bigInteger6, "totalAmount");
                    BigInteger add2 = bigInteger6.add(bigInteger3);
                    e6.e.C(add2, "this.add(other)");
                    i10++;
                    bigInteger4 = add2;
                    bigInteger3 = BigInteger.ZERO;
                    it2 = it3;
                } else {
                    bigInteger2 = bigInteger5;
                    e6.e.C(bigInteger3, "intervalAmount");
                    bigInteger3 = bigInteger3.add(fVar.f2949e);
                    e6.e.C(bigInteger3, "this.add(other)");
                }
                i11++;
                bigInteger4 = bigInteger2;
                it2 = it3;
            }
            while (i10 < rVar.f10392e.size()) {
                arrayList3.add(rVar.f10392e.get(i10));
                i10++;
            }
            e6.e.C(bigInteger, "totalAmount");
            s sVar = rVar.f10388a;
            ce.f fVar2 = rVar.f10389b;
            String str = rVar.f10390c;
            e6.e.D(sVar, "periodType");
            e6.e.D(fVar2, "dateRange");
            e6.e.D(str, "dateRangeLabel");
            arrayList2.add(new r(sVar, fVar2, str, bigInteger, arrayList3));
            it2 = it;
        }
        return arrayList2;
    }
}
