package sb;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.k0;
import e6.e;
import h1.c0;
import io.nodle.cash.ui.viewmodel.HistoryDetailViewModel;
import java.util.LinkedHashMap;
import java.util.Map;

public final class j extends com.google.android.material.bottomsheet.b {

    /* renamed from: s  reason: collision with root package name */
    public static final a f11071s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final String f11072t = j.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public HistoryDetailViewModel f11073a;

    /* renamed from: b  reason: collision with root package name */
    public final k0<HistoryDetailViewModel.a> f11074b = new c0(this, 4);

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, View> f11075c = new LinkedHashMap();

    public static final class a {
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11076a;

        static {
            int[] iArr = new int[HistoryDetailViewModel.a.values().length];
            iArr[HistoryDetailViewModel.a.HIDE_HISTORY_DETAIL.ordinal()] = 1;
            iArr[HistoryDetailViewModel.a.SHOW_BLOCK_EXPLORER.ordinal()] = 2;
            f11076a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            java.lang.String r7 = "inflater"
            e6.e.D(r5, r7)
            java.lang.String r7 = f11072t
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel$b r0 = io.nodle.cash.ui.viewmodel.HistoryDetailViewModel.C
            sa.b r0 = io.nodle.cash.ui.viewmodel.HistoryDetailViewModel.D
            r1 = 0
            if (r0 == 0) goto L_0x001b
            bb.g r0 = r0.z
            if (r0 == 0) goto L_0x001b
            int r0 = r0.getTitle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "historyDetail: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r7, r0)
            androidx.lifecycle.w0 r7 = new androidx.lifecycle.w0
            r7.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.HistoryDetailViewModel> r0 = io.nodle.cash.ui.viewmodel.HistoryDetailViewModel.class
            androidx.lifecycle.u0 r7 = r7.a(r0)
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel r7 = (io.nodle.cash.ui.viewmodel.HistoryDetailViewModel) r7
            r4.f11073a = r7
            androidx.lifecycle.LiveData<io.nodle.cash.ui.viewmodel.HistoryDetailViewModel$a> r7 = r7.B
            if (r7 == 0) goto L_0x0048
            androidx.lifecycle.k0<io.nodle.cash.ui.viewmodel.HistoryDetailViewModel$a> r0 = r4.f11074b
            r7.e(r4, r0)
        L_0x0048:
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel r7 = r4.f11073a
            if (r7 == 0) goto L_0x0053
            androidx.lifecycle.r r0 = r4.getLifecycle()
            r0.a(r7)
        L_0x0053:
            r7 = 0
            int r0 = va.n0.P
            androidx.databinding.DataBinderMapperImpl r0 = androidx.databinding.f.f1682a
            r0 = 2131427403(0x7f0b004b, float:1.8476421E38)
            androidx.databinding.ViewDataBinding r5 = androidx.databinding.ViewDataBinding.h(r5, r0, r6, r7, r1)
            va.n0 r5 = (va.n0) r5
            java.lang.String r6 = "inflate(inflater, container, false)"
            e6.e.C(r5, r6)
            androidx.lifecycle.a0 r6 = r4.getViewLifecycleOwner()
            r5.r(r6)
            io.nodle.cash.ui.viewmodel.HistoryDetailViewModel r6 = r4.f11073a
            r5.v(r6)
            android.view.View r5 = r5.f1668t
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.j.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11075c.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            ((com.google.android.material.bottomsheet.a) dialog).i().E(3);
        }
    }
}
