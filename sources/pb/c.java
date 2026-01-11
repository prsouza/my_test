package pb;

import ah.v;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import e6.e;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.LinkedHashMap;
import java.util.Map;
import pd.d;
import pd.f;

public final class c extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9820c = new a();

    /* renamed from: s  reason: collision with root package name */
    public static final String f9821s = c.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public HomeViewModelV2 f9822a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, View> f9823b = new LinkedHashMap();

    public static final class a {
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9824a;

        static {
            int[] iArr = new int[ab.b.values().length];
            iArr[ab.b.DISCOVER_DEVICES.ordinal()] = 1;
            iArr[ab.b.NONE.ordinal()] = 2;
            f9824a = iArr;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r02 = this.f9823b;
        View view = (View) r02.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        r02.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.x.I
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427393(0x7f0b0041, float:1.84764E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.x r3 = (va.x) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.HomeViewModelV2> r4 = io.nodle.cash.ui.viewmodel.HomeViewModelV2.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.HomeViewModelV2 r1 = (io.nodle.cash.ui.viewmodel.HomeViewModelV2) r1
        L_0x0034:
            r2.f9822a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f9823b.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        HomeViewModelV2 homeViewModelV2 = this.f9822a;
        if (homeViewModelV2 != null) {
            g.b(jc.b.y(homeViewModelV2), (f) null, new d(this, (d<? super d>) null), 3);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((TextView) b(R.id.pendingTextView), View.ALPHA, new float[]{1.0f, 0.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((TextView) b(R.id.pendingTextView), View.ALPHA, new float[]{0.5f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        HomeViewModelV2 homeViewModelV22 = this.f9822a;
        if (homeViewModelV22 != null) {
            g.b(jc.b.y(homeViewModelV22), (f) null, new h(this, ofFloat, animatorSet, (d<? super h>) null), 3);
        }
        Context context = getContext();
        if (context != null) {
            long parseLong = Long.parseLong(v.J(context, qa.e.REWARDS_PENDING_DEVICE_COUNT));
            if (parseLong > 0) {
                ab.f fVar = ab.f.f215a;
                fVar.k(fVar.g(context, parseLong));
            }
        }
    }
}
