package pb;

import ab.i;
import ab.k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import com.google.android.material.bottomsheet.b;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import ne.c;

public final class o extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f9867c = new a();

    /* renamed from: s  reason: collision with root package name */
    public static final String f9868s = o.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public HomeViewModelV2 f9869a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, View> f9870b = new LinkedHashMap();

    public static final class a {
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.r0.J
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427405(0x7f0b004d, float:1.8476425E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.r0 r3 = (va.r0) r3
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
            r2.f9869a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.o.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f9870b.clear();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        e.D(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        k kVar = k.f279a;
        c cVar = k.f280b;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
        kVar.b((i) null);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onViewCreated(View view, Bundle bundle) {
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        k kVar = k.f279a;
        i iVar = k.f282d;
        if (iVar == null) {
            return;
        }
        if (iVar.i != null) {
            Context context = getContext();
            Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            LayoutInflater layoutInflater = (LayoutInflater) systemService;
            Integer num = iVar.i;
            e.B(num);
            int intValue = num.intValue();
            ? r22 = this.f9870b;
            View view2 = (View) r22.get(Integer.valueOf(R.id.noticeContainer));
            if (view2 == null) {
                View view3 = getView();
                if (view3 == null || (view2 = view3.findViewById(R.id.noticeContainer)) == null) {
                    view2 = null;
                } else {
                    r22.put(Integer.valueOf(R.id.noticeContainer), view2);
                }
            }
            ViewDataBinding c10 = f.c(layoutInflater, intValue, (FrameLayout) view2, true, (androidx.databinding.e) null);
            c10.s(3, this.f9869a);
            c10.s(1, this);
            Dialog dialog = getDialog();
            if (dialog != null) {
                ((com.google.android.material.bottomsheet.a) dialog).i().E(3);
                return;
            }
            return;
        }
        throw new Exception("Notice layout cannot be null.");
    }
}
