package tb;

import ah.v;
import android.app.Application;
import android.util.Log;
import androidx.lifecycle.b;
import c3.k;
import gb.j;
import ge.d0;
import ge.g;
import ge.g1;
import io.sentry.protocol.App;
import java.math.BigDecimal;
import java.math.RoundingMode;
import je.n;
import je.o;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import xd.p;

public final class c extends b {

    /* renamed from: s  reason: collision with root package name */
    public final Application f11469s;

    /* renamed from: t  reason: collision with root package name */
    public final String f11470t = c.class.getSimpleName();

    /* renamed from: u  reason: collision with root package name */
    public final o f11471u;

    /* renamed from: v  reason: collision with root package name */
    public final n<j> f11472v;

    /* renamed from: w  reason: collision with root package name */
    public bb.a f11473w;

    /* renamed from: x  reason: collision with root package name */
    public final BigDecimal f11474x;

    /* renamed from: y  reason: collision with root package name */
    public final BigDecimal f11475y;

    @e(c = "io.nodle.cash.ui.viewmodel.EstimateViewModel$doEstimation$1", f = "EstimateViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f11476a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ bb.a f11477b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f11478c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, bb.a aVar, int i, d<? super a> dVar) {
            super(2, dVar);
            this.f11476a = cVar;
            this.f11477b = aVar;
            this.f11478c = i;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f11476a, this.f11477b, this.f11478c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((a) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            BigDecimal bigDecimal;
            Object value;
            j jVar;
            BigDecimal bigDecimal2;
            BigDecimal bigDecimal3;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            String J = v.J(this.f11476a.f11469s, qa.e.NODLE_AMOUNT);
            e6.e.D(J, "rawNodle");
            BigDecimal divide = new BigDecimal(J).divide(BigDecimal.TEN.pow(11));
            e6.e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
            BigDecimal bigDecimal4 = this.f11476a.f11474x;
            BigDecimal valueOf = BigDecimal.valueOf((long) this.f11477b.dayCount());
            e6.e.C(valueOf, "valueOf(this.toLong())");
            BigDecimal multiply = bigDecimal4.multiply(valueOf);
            e6.e.C(multiply, "this.multiply(other)");
            BigDecimal add = divide.add(multiply);
            if (this.f11478c == this.f11476a.k()) {
                bigDecimal = ((j) this.f11476a.f11471u.getValue()).f5340a;
            } else {
                BigDecimal bigDecimal5 = ((j) this.f11476a.f11471u.getValue()).f5344e;
                BigDecimal valueOf2 = BigDecimal.valueOf((long) this.f11478c);
                e6.e.C(valueOf2, "valueOf(this.toLong())");
                BigDecimal multiply2 = valueOf2.multiply(this.f11476a.f11475y);
                e6.e.C(multiply2, "this.multiply(other)");
                bigDecimal = bigDecimal5.add(multiply2);
            }
            c cVar = this.f11476a;
            String str = cVar.f11470t;
            BigDecimal bigDecimal6 = ((j) cVar.f11471u.getValue()).f5340a;
            Log.d(str, "adjMarketPrice:" + bigDecimal + " , currentMarketPrice:" + bigDecimal6);
            o oVar = this.f11476a.f11471u;
            do {
                value = oVar.getValue();
                jVar = (j) value;
                e6.e.C(add, "adjNodlBalance");
                e6.e.C(bigDecimal, "adjMarketPrice");
                BigDecimal multiply3 = add.multiply(bigDecimal);
                e6.e.C(multiply3, "this.multiply(other)");
                BigDecimal scale = multiply3.setScale(2, RoundingMode.DOWN);
                if (scale == null) {
                    scale = BigDecimal.ZERO;
                }
                bigDecimal2 = scale;
                e6.e.C(bigDecimal2, "adjNodlBalance.times(adj….DOWN) ?: BigDecimal.ZERO");
                BigDecimal scale2 = bigDecimal.setScale(2, RoundingMode.DOWN);
                if (scale2 == null) {
                    scale2 = BigDecimal.ZERO;
                }
                bigDecimal3 = scale2;
                e6.e.C(bigDecimal3, "adjMarketPrice.setScale(….DOWN) ?: BigDecimal.ZERO");
            } while (!oVar.g(value, j.a(jVar, (BigDecimal) null, add, bigDecimal2, bigDecimal3, (BigDecimal) null, 0, !e6.e.r(bigDecimal, jVar.f5340a), false, 49)));
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Application application) {
        super(application);
        e6.e.D(application, App.TYPE);
        this.f11469s = application;
        o oVar = new o(new j((BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, (BigDecimal) null, 0, false, false, 255, (k) null));
        this.f11471u = oVar;
        this.f11472v = new je.i(oVar);
        this.f11473w = bb.a.YEAR;
        this.f11474x = new BigDecimal(v.K("avg_reward"));
        this.f11475y = new BigDecimal(String.valueOf(0.1d));
    }

    public static final void i(c cVar, BigDecimal bigDecimal) {
        c cVar2 = cVar;
        BigDecimal bigDecimal2 = bigDecimal;
        if (!e6.e.r(bigDecimal2, ((j) cVar2.f11471u.getValue()).f5340a)) {
            String str = cVar2.f11470t;
            Log.d(str, "Price: $" + bigDecimal2);
            String J = v.J(cVar2.f11469s, qa.e.NODLE_AMOUNT);
            e6.e.D(J, "rawNodle");
            BigDecimal divide = new BigDecimal(J).divide(BigDecimal.TEN.pow(11));
            e6.e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
            BigDecimal bigDecimal3 = cVar2.f11474x;
            BigDecimal valueOf = BigDecimal.valueOf((long) cVar2.f11473w.dayCount());
            e6.e.C(valueOf, "valueOf(this.toLong())");
            BigDecimal multiply = bigDecimal3.multiply(valueOf);
            String str2 = "this.multiply(other)";
            e6.e.C(multiply, str2);
            BigDecimal add = divide.add(multiply);
            BigDecimal multiply2 = bigDecimal2.multiply(new BigDecimal(String.valueOf(0.2d)));
            e6.e.C(multiply2, str2);
            BigDecimal valueOf2 = BigDecimal.valueOf((long) 100);
            e6.e.C(valueOf2, "valueOf(this.toLong())");
            BigDecimal multiply3 = bigDecimal2.multiply(valueOf2);
            e6.e.C(multiply3, str2);
            BigDecimal subtract = multiply3.subtract(multiply2);
            e6.e.C(subtract, "this.subtract(other)");
            BigDecimal divide2 = subtract.divide(cVar2.f11475y, RoundingMode.HALF_EVEN);
            e6.e.C(divide2, "this.divide(other, RoundingMode.HALF_EVEN)");
            int intValue = divide2.intValue();
            o oVar = cVar2.f11471u;
            while (true) {
                Object value = oVar.getValue();
                j jVar = (j) value;
                e6.e.C(add, "adjNodlBalance");
                BigDecimal multiply4 = add.multiply(bigDecimal2);
                e6.e.C(multiply4, str2);
                BigDecimal scale = multiply4.setScale(2, RoundingMode.DOWN);
                if (scale == null) {
                    scale = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal4 = scale;
                e6.e.C(bigDecimal4, "adjNodlBalance.times(pri….DOWN) ?: BigDecimal.ZERO");
                BigDecimal scale2 = bigDecimal2.setScale(2, RoundingMode.DOWN);
                if (scale2 == null) {
                    scale2 = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal5 = scale2;
                e6.e.C(bigDecimal5, "price.setScale(2, Roundi….DOWN) ?: BigDecimal.ZERO");
                String str3 = str2;
                o oVar2 = oVar;
                if (oVar2.g(value, j.a(jVar, bigDecimal, add, bigDecimal4, bigDecimal5, multiply2, intValue, false, true, 64))) {
                    v.f0(cVar2.f11469s, qa.e.NODLE_DOLLAR_PRICE, bigDecimal2);
                    return;
                } else {
                    oVar = oVar2;
                    str2 = str3;
                }
            }
        }
    }

    public final g1 j(bb.a aVar, int i) {
        e6.e.D(aVar, "period");
        return g.b(jc.b.y(this), (f) null, new a(this, aVar, i, (d<? super a>) null), 3);
    }

    public final int k() {
        BigDecimal subtract = ((j) this.f11471u.getValue()).f5340a.subtract(((j) this.f11471u.getValue()).f5344e);
        e6.e.C(subtract, "this.subtract(other)");
        return subtract.divide(this.f11475y).intValue();
    }
}
