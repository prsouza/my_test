package sb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r;
import com.github.mikephil.charting.BuildConfig;
import de.h;
import ge.d0;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import io.nodle.cash.utils.AutoClearedProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.b;
import je.f;
import je.n;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import va.p1;
import va.y0;
import xd.p;
import y.c;
import yd.j;
import yd.v;

public final class q extends i {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f11092w;

    /* renamed from: t  reason: collision with root package name */
    public TransactViewModel f11093t;

    /* renamed from: u  reason: collision with root package name */
    public final AutoClearedProperty f11094u = c.l(this);

    /* renamed from: v  reason: collision with root package name */
    public Map<Integer, View> f11095v = new LinkedHashMap();

    @e(c = "io.nodle.cash.ui.view.fragment.transact.TransactConfirmFragment$onViewCreated$1", f = "TransactConfirmFragment.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f11096a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f11097b;

        /* renamed from: sb.q$a$a  reason: collision with other inner class name */
        public static final class C0216a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q f11098a;

            public C0216a(q qVar) {
                this.f11098a = qVar;
            }

            public final Object a(Object obj, d dVar) {
                gb.i iVar = (gb.i) obj;
                q qVar = this.f11098a;
                h<Object>[] hVarArr = q.f11092w;
                qVar.c().f12444v.setText(iVar.f5331b);
                this.f11098a.c().f12446x.setText(iVar.f5332c);
                this.f11098a.c().f12439b.setText(iVar.f5333d);
                this.f11098a.c().f12443u.setText(iVar.f5334e);
                this.f11098a.c().z.setText(iVar.f5335f);
                Integer num = iVar.f5338k;
                if (num != null) {
                    q qVar2 = this.f11098a;
                    int intValue = num.intValue();
                    TextView textView = qVar2.c().f12441s;
                    String string = qVar2.getString(intValue);
                    String str = iVar.f5339l;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    textView.setText(string + str);
                }
                this.f11098a.c().f12445w.setEnabled(iVar.g);
                if (iVar.f5336h) {
                    this.f11098a.c().f12442t.setVisibility(0);
                } else {
                    this.f11098a.c().f12442t.setVisibility(8);
                }
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(q qVar, d<? super a> dVar) {
            super(2, dVar);
            this.f11097b = qVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f11097b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f11096a;
            if (i == 0) {
                b1.w(obj);
                q qVar = this.f11097b;
                TransactViewModel transactViewModel = qVar.f11093t;
                if (transactViewModel != null) {
                    n<gb.i> nVar = transactViewModel.z;
                    r lifecycle = qVar.getLifecycle();
                    e6.e.C(lifecycle, "lifecycle");
                    je.e<gb.i> a10 = androidx.lifecycle.m.a(nVar, lifecycle, r.c.STARTED);
                    C0216a aVar2 = new C0216a(this.f11097b);
                    this.f11096a = 1;
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

    static {
        j jVar = new j(q.class, "binding", "getBinding()Lio/nodle/cash/databinding/FragmentTransactConfirmBinding;");
        Objects.requireNonNull(v.f13623a);
        f11092w = new h[]{jVar};
    }

    public final y0 c() {
        return (y0) this.f11094u.f(this, f11092w[0]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        e6.e.D(layoutInflater2, "inflater");
        androidx.fragment.app.r activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type io.nodle.cash.ui.view.activity.transact.TransactActivity");
        this.f11093t = ((TransactActivity) activity).k();
        View inflate = layoutInflater2.inflate(R.layout.fragment_transact_confirm, viewGroup, false);
        int i = R.id.amountLabelTextViewView;
        if (((TextView) b.q(inflate, R.id.amountLabelTextViewView)) != null) {
            i = R.id.amountTextView;
            TextView textView = (TextView) b.q(inflate, R.id.amountTextView);
            if (textView != null) {
                i = R.id.cancelButton;
                Button button = (Button) b.q(inflate, R.id.cancelButton);
                if (button != null) {
                    i = R.id.dividerView1;
                    if (b.q(inflate, R.id.dividerView1) != null) {
                        i = R.id.dividerView2;
                        if (b.q(inflate, R.id.dividerView2) != null) {
                            i = R.id.dividerView3;
                            if (b.q(inflate, R.id.dividerView3) != null) {
                                i = R.id.errorTextView;
                                TextView textView2 = (TextView) b.q(inflate, R.id.errorTextView);
                                if (textView2 != null) {
                                    i = R.id.feeLabelTextViewView;
                                    if (((TextView) b.q(inflate, R.id.feeLabelTextViewView)) != null) {
                                        i = R.id.feeProgressBar;
                                        ProgressBar progressBar = (ProgressBar) b.q(inflate, R.id.feeProgressBar);
                                        if (progressBar != null) {
                                            i = R.id.feesTextView;
                                            TextView textView3 = (TextView) b.q(inflate, R.id.feesTextView);
                                            if (textView3 != null) {
                                                i = R.id.fromLabelTextView;
                                                if (((TextView) b.q(inflate, R.id.fromLabelTextView)) != null) {
                                                    i = R.id.fromValueTextView;
                                                    TextView textView4 = (TextView) b.q(inflate, R.id.fromValueTextView);
                                                    if (textView4 != null) {
                                                        i = R.id.payButton;
                                                        Button button2 = (Button) b.q(inflate, R.id.payButton);
                                                        if (button2 != null) {
                                                            i = R.id.titleTextView;
                                                            if (((TextView) b.q(inflate, R.id.titleTextView)) != null) {
                                                                i = R.id.toLabelTextView;
                                                                if (((TextView) b.q(inflate, R.id.toLabelTextView)) != null) {
                                                                    i = R.id.toValueTextView;
                                                                    TextView textView5 = (TextView) b.q(inflate, R.id.toValueTextView);
                                                                    if (textView5 != null) {
                                                                        i = R.id.toolbar;
                                                                        View q10 = b.q(inflate, R.id.toolbar);
                                                                        if (q10 != null) {
                                                                            p1 a10 = p1.a(q10);
                                                                            i = R.id.totalAmountTextView;
                                                                            TextView textView6 = (TextView) b.q(inflate, R.id.totalAmountTextView);
                                                                            if (textView6 != null) {
                                                                                this.f11094u.h(this, f11092w[0], new y0((ConstraintLayout) inflate, textView, button, textView2, progressBar, textView3, textView4, button2, textView5, a10, textView6));
                                                                                ConstraintLayout constraintLayout = c().f12438a;
                                                                                e6.e.C(constraintLayout, "binding.root");
                                                                                return constraintLayout;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11095v.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e6.e.D(view, "view");
        super.onViewCreated(view, bundle);
        g.b(b.u(this), (pd.f) null, new a(this, (d<? super a>) null), 3);
        c().f12445w.setOnClickListener(new ob.c(this, 1));
        c().f12440c.setOnClickListener(new pb.a(this, 1));
        c().f12447y.f12427a.setOnClickListener(new pb.b(this, 1));
    }
}
