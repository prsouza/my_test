package mb;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, View> f8515a = new LinkedHashMap();

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.i0.O
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427399(0x7f0b0047, float:1.8476413E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.i0 r3 = (va.i0) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.OnboardViewModel> r4 = io.nodle.cash.ui.viewmodel.OnboardViewModel.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.OnboardViewModel r1 = (io.nodle.cash.ui.viewmodel.OnboardViewModel) r1
        L_0x0034:
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f8515a.clear();
    }
}
