package mb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import e6.e;
import gb.g;
import io.nodle.cash.R;
import java.util.LinkedHashMap;
import java.util.Map;
import va.g0;

public final class a extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final C0157a f8513b = new C0157a();

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, View> f8514a = new LinkedHashMap();

    /* renamed from: mb.a$a  reason: collision with other inner class name */
    public static final class C0157a {
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [je.n<gb.g>, je.i] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ? r42;
        g gVar;
        e.D(layoutInflater, "inflater");
        int i = g0.J;
        DataBinderMapperImpl dataBinderMapperImpl = f.f1682a;
        gb.f fVar = null;
        g0 g0Var = (g0) ViewDataBinding.h(layoutInflater, R.layout.fragment_notif_detail, viewGroup, false, (Object) null);
        e.C(g0Var, "inflate(inflater, container, false)");
        g0Var.r(getViewLifecycleOwner());
        r activity = getActivity();
        tb.r rVar = activity != null ? (tb.r) new w0(activity).a(tb.r.class) : null;
        if (!(rVar == null || (r42 = rVar.f11518v) == 0 || (gVar = (g) r42.getValue()) == null)) {
            fVar = gVar.f5329c;
        }
        g0Var.v(fVar);
        return g0Var.f1668t;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f8514a.clear();
    }
}
