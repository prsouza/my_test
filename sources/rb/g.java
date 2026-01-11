package rb;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import de.h;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import io.nodle.cash.utils.AutoClearedProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import jc.b;
import lb.i;
import va.m0;
import y.c;
import yd.j;
import yd.v;

public final class g extends Fragment {

    /* renamed from: s  reason: collision with root package name */
    public static final a f10651s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ h<Object>[] f10652t;

    /* renamed from: a  reason: collision with root package name */
    public OptionsViewModel f10653a;

    /* renamed from: b  reason: collision with root package name */
    public final AutoClearedProperty f10654b = c.l(this);

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, View> f10655c = new LinkedHashMap();

    public static final class a {
    }

    static {
        j jVar = new j(g.class, "binding", "getBinding()Lio/nodle/cash/databinding/FragmentPrivacyBinding;");
        Objects.requireNonNull(v.f13623a);
        f10652t = new h[]{jVar};
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e.D(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_privacy, viewGroup, false);
        int i = R.id.analyticsSwitch;
        SwitchMaterial switchMaterial = (SwitchMaterial) b.q(inflate, R.id.analyticsSwitch);
        if (switchMaterial != null) {
            i = R.id.analyticsTextView;
            if (((TextView) b.q(inflate, R.id.analyticsTextView)) != null) {
                i = R.id.item_eula;
                TextView textView = (TextView) b.q(inflate, R.id.item_eula);
                if (textView != null) {
                    i = R.id.item_privacy_read;
                    TextView textView2 = (TextView) b.q(inflate, R.id.item_privacy_read);
                    if (textView2 != null) {
                        m0 m0Var = new m0((LinearLayout) inflate, switchMaterial, textView, textView2);
                        AutoClearedProperty autoClearedProperty = this.f10654b;
                        h<Object>[] hVarArr = f10652t;
                        autoClearedProperty.h(this, hVarArr[0], m0Var);
                        r activity = getActivity();
                        OptionsViewModel optionsViewModel = activity != null ? (OptionsViewModel) new w0(activity).a(OptionsViewModel.class) : null;
                        if (optionsViewModel != null) {
                            this.f10653a = optionsViewModel;
                            m0 m0Var2 = (m0) this.f10654b.f(this, hVarArr[0]);
                            SwitchMaterial switchMaterial2 = m0Var2.f12416b;
                            OptionsViewModel optionsViewModel2 = this.f10653a;
                            if (optionsViewModel2 != null) {
                                Application application = optionsViewModel2.f6806s;
                                qa.e eVar = qa.e.APP_ANALYTICS;
                                m.g("App analytics: ", ah.v.J(application, eVar), "OptionsViewModel");
                                switchMaterial2.setChecked(Integer.parseInt(ah.v.J(optionsViewModel2.f6806s, eVar)) == 901);
                                m0Var2.f12416b.setOnClickListener(new f(this));
                                m0Var2.f12417c.setOnClickListener(new e(this));
                                m0Var2.f12418s.setOnClickListener(new i(this, 1));
                                return ((m0) this.f10654b.f(this, hVarArr[0])).f12415a;
                            }
                            e.c0("viewModel");
                            throw null;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10655c.clear();
    }
}
