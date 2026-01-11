package sb;

import android.widget.TextView;
import androidx.lifecycle.r;
import gb.h;
import ge.d0;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import je.f;
import je.n;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.transact.KeypadFragment$initViews$1", f = "KeypadFragment.kt", l = {49}, m = "invokeSuspend")
public final class l extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f11081b;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f11082a;

        /* renamed from: sb.l$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0215a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f11083a;

            static {
                int[] iArr = new int[h.values().length];
                iArr[h.UPPER_LIMIT.ordinal()] = 1;
                iArr[h.LOWER_LIMIT.ordinal()] = 2;
                f11083a = iArr;
            }
        }

        public a(n nVar) {
            this.f11082a = nVar;
        }

        public final Object a(Object obj, d dVar) {
            gb.i iVar = (gb.i) obj;
            ri.a.f10801a.a(a8.a.c("nodleBalance ", iVar.f5330a), new Object[0]);
            n nVar = this.f11082a;
            de.h<Object>[] hVarArr = n.f11085w;
            nVar.e().f12413s.f12420b.setText(iVar.f5330a);
            this.f11082a.e().f12414t.setText(iVar.f5333d);
            int i = C0215a.f11083a[iVar.i.ordinal()];
            if (i == 1) {
                n nVar2 = this.f11082a;
                TextView textView = (TextView) nVar2.c(R.id.transactionAmountTextView);
                e6.e.C(textView, "transactionAmountTextView");
                n.d(nVar2, textView);
            } else if (i == 2) {
                n nVar3 = this.f11082a;
                TextView textView2 = (TextView) nVar3.c(R.id.transactionAmountTextView);
                e6.e.C(textView2, "transactionAmountTextView");
                n.d(nVar3, textView2);
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(n nVar, d<? super l> dVar) {
        super(2, dVar);
        this.f11081b = nVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f11081b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f11080a;
        if (i == 0) {
            b1.w(obj);
            n nVar = this.f11081b;
            TransactViewModel transactViewModel = nVar.f11086t;
            if (transactViewModel != null) {
                n<gb.i> nVar2 = transactViewModel.z;
                r lifecycle = nVar.getLifecycle();
                e6.e.C(lifecycle, "lifecycle");
                je.e<gb.i> a10 = androidx.lifecycle.m.a(nVar2, lifecycle, r.c.STARTED);
                a aVar2 = new a(this.f11081b);
                this.f11080a = 1;
                if (((ke.e) a10).b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                e6.e.c0("viewModel");
                throw null;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
