package ob;

import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import gb.j;
import ge.d0;
import io.nodle.cash.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import je.f;
import l6.b1;
import md.b;
import md.m;
import rd.e;
import rd.i;
import tb.c;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.estimate.SimulatorFragment$initViews$2", f = "SimulatorFragment.kt", l = {56}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9402a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f9403b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f9404a;

        public a(h hVar) {
            this.f9404a = hVar;
        }

        public final Object a(Object obj, pd.d dVar) {
            bb.a aVar;
            j jVar = (j) obj;
            c cVar = this.f9404a.f9410a;
            if (!(cVar == null || (aVar = cVar.f11473w) == null)) {
                int titleTextId = aVar.titleTextId();
                TextView textView = (TextView) this.f9404a.b(R.id.balanceTitleTextView);
                if (textView != null) {
                    textView.setText(titleTextId);
                }
            }
            TextView textView2 = (TextView) this.f9404a.b(R.id.dollarBalanceTextView);
            if (textView2 != null) {
                BigDecimal bigDecimal = jVar.f5342c;
                textView2.setText(ub.f.c("<font color=#878D94>~$</font>" + bigDecimal));
            }
            TextView textView3 = (TextView) this.f9404a.b(R.id.nodlTextView);
            if (textView3 != null) {
                BigDecimal bigDecimal2 = jVar.f5341b;
                textView3.setText(bigDecimal2 + " NODL");
            }
            TextView textView4 = (TextView) this.f9404a.b(R.id.dollarMktPriceTextView);
            if (textView4 != null) {
                BigDecimal bigDecimal3 = jVar.f5343d;
                textView4.setText(ub.f.c("<font color=#878D94>$</font>" + bigDecimal3));
            }
            Button button = (Button) this.f9404a.b(R.id.resetButton);
            int i = 0;
            if (button != null) {
                button.setText(this.f9404a.getString(R.string.resetToCurrentPrice, jVar.f5340a.setScale(2, RoundingMode.DOWN)));
            }
            ((SeekBar) this.f9404a.b(R.id.simSeekbar)).setMax(jVar.f5345f);
            Button button2 = (Button) this.f9404a.b(R.id.resetButton);
            if (button2 != null) {
                if (!jVar.g) {
                    i = 4;
                }
                button2.setVisibility(i);
            }
            if (jVar.f5346h) {
                this.f9404a.c();
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(h hVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f9403b = hVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f9403b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [je.i, je.n<gb.j>] */
    public final Object invokeSuspend(Object obj) {
        ? r12;
        Object obj2 = qd.a.COROUTINE_SUSPENDED;
        int i = this.f9402a;
        if (i == 0) {
            b1.w(obj);
            h hVar = this.f9403b;
            c cVar = hVar.f9410a;
            if (cVar == null || (r12 = cVar.f11472v) == 0) {
                return m.f8555a;
            }
            a aVar = new a(hVar);
            this.f9402a = 1;
            if (r12.b(aVar, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b1.w(obj);
        }
        throw new b();
    }
}
