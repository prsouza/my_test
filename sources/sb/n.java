package sb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.h;
import e6.e;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import io.nodle.cash.utils.AutoClearedProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.b;
import pd.d;
import pd.f;
import va.b0;
import va.m1;
import y.c;
import yd.j;
import yd.v;

public final class n extends h {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f11085w;

    /* renamed from: t  reason: collision with root package name */
    public TransactViewModel f11086t;

    /* renamed from: u  reason: collision with root package name */
    public final AutoClearedProperty f11087u = c.l(this);

    /* renamed from: v  reason: collision with root package name */
    public Map<Integer, View> f11088v = new LinkedHashMap();

    static {
        j jVar = new j(n.class, "binding", "getBinding()Lio/nodle/cash/databinding/FragmentKeypadBinding;");
        Objects.requireNonNull(v.f13623a);
        f11085w = new h[]{jVar};
    }

    public static final void d(n nVar, TextView textView) {
        Objects.requireNonNull(nVar);
        int currentTextColor = textView.getCurrentTextColor();
        Animation loadAnimation = AnimationUtils.loadAnimation(nVar.getContext(), R.anim.shake);
        loadAnimation.setAnimationListener(new k(textView, nVar, currentTextColor));
        textView.startAnimation(loadAnimation);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View c(int i) {
        View findViewById;
        ? r42 = this.f11088v;
        Integer valueOf = Integer.valueOf(R.id.transactionAmountTextView);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.transactionAmountTextView)) == null) {
            return null;
        }
        r42.put(valueOf, findViewById);
        return findViewById;
    }

    public final b0 e() {
        return (b0) this.f11087u.f(this, f11085w[0]);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e.D(layoutInflater, "inflater");
        r activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type io.nodle.cash.ui.view.activity.transact.TransactActivity");
        this.f11086t = ((TransactActivity) activity).k();
        View inflate = layoutInflater.inflate(R.layout.fragment_keypad, viewGroup, false);
        int i = R.id.keypadRecyclerView;
        RecyclerView recyclerView = (RecyclerView) b.q(inflate, R.id.keypadRecyclerView);
        if (recyclerView != null) {
            i = R.id.payButton;
            Button button = (Button) b.q(inflate, R.id.payButton);
            if (button != null) {
                i = R.id.toolbar;
                View q10 = b.q(inflate, R.id.toolbar);
                if (q10 != null) {
                    int i10 = R.id.closeButton;
                    ImageButton imageButton = (ImageButton) b.q(q10, R.id.closeButton);
                    if (imageButton != null) {
                        i10 = R.id.nodleAmountTextView;
                        TextView textView = (TextView) b.q(q10, R.id.nodleAmountTextView);
                        if (textView != null) {
                            Toolbar toolbar = (Toolbar) q10;
                            m1 m1Var = new m1(imageButton, textView);
                            TextView textView2 = (TextView) b.q(inflate, R.id.transactionAmountTextView);
                            if (textView2 != null) {
                                this.f11087u.h(this, f11085w[0], new b0((ConstraintLayout) inflate, recyclerView, button, m1Var, textView2));
                                ConstraintLayout constraintLayout = e().f12410a;
                                e.C(constraintLayout, "binding.root");
                                return constraintLayout;
                            }
                            i = R.id.transactionAmountTextView;
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(q10.getResources().getResourceName(i10)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11088v.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        g.b(b.u(this), (f) null, new l(this, (d<? super l>) null), 3);
        e().f12411b.setAdapter(new lb.g(new m(this)));
        e().f12411b.setLayoutManager(new GridLayoutManager(getContext(), 3));
        e().f12412c.setOnClickListener(new mb.f(this, 1));
        e().f12413s.f12419a.setOnClickListener(new ob.b(this, 1));
    }
}
