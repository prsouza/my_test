package rb;

import a.b;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lb.m;

public final class d extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10646c = new a();

    /* renamed from: a  reason: collision with root package name */
    public OptionsViewModel f10647a;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, View> f10648b = new LinkedHashMap();

    public static final class a {
    }

    public d() {
        Class<d> cls = d.class;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r42 = this.f10648b;
        Integer valueOf = Integer.valueOf(R.id.optionsRecyclerView);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.optionsRecyclerView)) == null) {
            return null;
        }
        r42.put(valueOf, findViewById);
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
            int r5 = va.k0.L
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427400(0x7f0b0048, float:1.8476415E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.k0 r3 = (va.k0) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<io.nodle.cash.ui.viewmodel.OptionsViewModel> r4 = io.nodle.cash.ui.viewmodel.OptionsViewModel.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            io.nodle.cash.ui.viewmodel.OptionsViewModel r1 = (io.nodle.cash.ui.viewmodel.OptionsViewModel) r1
        L_0x0034:
            r2.f10647a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.d.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10648b.clear();
    }

    public final void onResume() {
        super.onResume();
        RecyclerView.f adapter = ((RecyclerView) b(R.id.optionsRecyclerView)).getAdapter();
        if (adapter != null) {
            adapter.d();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) b(R.id.optionsRecyclerView);
        OptionsViewModel optionsViewModel = this.f10647a;
        m mVar = null;
        if (optionsViewModel != null) {
            Application application = optionsViewModel.f6806s;
            e.D(application, "context");
            String string = application.getResources().getString(R.string.settingsEcoMode);
            e.C(string, "context.resources.getStr…R.string.settingsEcoMode)");
            String string2 = application.getResources().getString(R.string.settingsExpertMode);
            e.C(string2, "context.resources.getStr…tring.settingsExpertMode)");
            String string3 = application.getResources().getString(R.string.settingsLudicrousMode);
            e.C(string3, "context.resources.getStr…ng.settingsLudicrousMode)");
            List o02 = b.o0(new qa.d(string, application.getString(R.string.ecoModeDetail), (List) null, R.layout.item_option_scanmode, Integer.valueOf(R.drawable.radio_mode_eco), false), new qa.d(string2, application.getString(R.string.expertModeDetail), (List) null, R.layout.item_option_scanmode, Integer.valueOf(R.drawable.radio_mode_expert), false), new qa.d(string3, application.getString(R.string.ludicrousModeDetail), (List) null, R.layout.item_option_scanmode, Integer.valueOf(R.drawable.radio_mode_ludicrous), false));
            String string4 = application.getResources().getString(R.string.titleBackup);
            e.C(string4, "context.resources.getString(R.string.titleBackup)");
            String string5 = application.getResources().getString(R.string.settingsLogout);
            e.C(string5, "context.resources.getStr…(R.string.settingsLogout)");
            List o03 = b.o0(new qa.d(string4, (String) null, (List) null, R.layout.item_option), new qa.d(string5, (String) null, (List) null, R.layout.item_option, (Integer) null, true));
            String string6 = application.getResources().getString(R.string.settingsWiFi);
            e.C(string6, "context.resources.getString(R.string.settingsWiFi)");
            String string7 = application.getResources().getString(R.string.ignoreBatteryTitle);
            e.C(string7, "context.resources.getStr…tring.ignoreBatteryTitle)");
            List o04 = b.o0(new qa.d(string6, application.getResources().getString(R.string.wifiOffloadDetail), (List) null, R.layout.item_option_app_setting), new qa.d(string7, application.getResources().getString(R.string.ignoreBatteryRationale), (List) null, R.layout.item_option_app_setting));
            String string8 = application.getResources().getString(R.string.settingsMode);
            e.C(string8, "context.resources.getString(R.string.settingsMode)");
            String string9 = application.getResources().getString(R.string.settingsWalletSettings);
            e.C(string9, "context.resources.getStr…g.settingsWalletSettings)");
            String string10 = application.getResources().getString(R.string.settingsAppSettings);
            e.C(string10, "context.resources.getStr…ring.settingsAppSettings)");
            String string11 = application.getResources().getString(R.string.settingsPrivacyAnalytics);
            e.C(string11, "context.resources.getStr…settingsPrivacyAnalytics)");
            String string12 = application.getResources().getString(R.string.faq);
            e.C(string12, "context.resources.getString(R.string.faq)");
            String string13 = application.getResources().getString(R.string.settingsCommunity);
            e.C(string13, "context.resources.getStr…string.settingsCommunity)");
            String string14 = application.getResources().getString(R.string.settingsAboutUs);
            e.C(string14, "context.resources.getStr…R.string.settingsAboutUs)");
            mVar = new m(b.o0(new qa.d(string8, (String) null, o02, R.layout.item_option), new qa.d(string9, (String) null, o03, R.layout.item_option, (Integer) null, true), new qa.d(string10, (String) null, o04, R.layout.item_option), new qa.d(string11, (String) null, (List) null, R.layout.item_option), new qa.d(string12, (String) null, (List) null, R.layout.item_option), new qa.d(string13, (String) null, (List) null, R.layout.item_option), new qa.d(string14, (String) null, (List) null, R.layout.item_option, (Integer) null, true)), (String) null);
        }
        recyclerView.setAdapter(mVar);
    }
}
