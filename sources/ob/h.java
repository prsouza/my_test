package ob;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import bb.a;
import com.google.android.material.tabs.TabLayout;
import e6.e;
import ge.g;
import io.nodle.cash.R;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.b;
import pd.d;
import pd.f;
import tb.c;

public final class h extends Fragment {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f9409s = 0;

    /* renamed from: a  reason: collision with root package name */
    public c f9410a;

    /* renamed from: b  reason: collision with root package name */
    public int f9411b;

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, View> f9412c = new LinkedHashMap();

    public h() {
        Class<h> cls = h.class;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View b(int i) {
        View findViewById;
        ? r02 = this.f9412c;
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

    public final void c() {
        SeekBar seekBar = (SeekBar) b(R.id.simSeekbar);
        if (seekBar != null) {
            c cVar = this.f9410a;
            seekBar.setProgress(cVar != null ? cVar.k() : 0);
        }
        Button button = (Button) b(R.id.resetButton);
        if (button != null) {
            button.setVisibility(4);
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [androidx.lifecycle.u0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r5 = "inflater"
            e6.e.D(r3, r5)
            int r5 = va.v0.I
            androidx.databinding.DataBinderMapperImpl r5 = androidx.databinding.f.f1682a
            r5 = 2131427407(0x7f0b004f, float:1.847643E38)
            r0 = 0
            r1 = 0
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.ViewDataBinding.h(r3, r5, r4, r0, r1)
            va.v0 r3 = (va.v0) r3
            java.lang.String r4 = "inflate(inflater, container, false)"
            e6.e.C(r3, r4)
            androidx.lifecycle.a0 r4 = r2.getViewLifecycleOwner()
            r3.r(r4)
            androidx.fragment.app.r r4 = r2.getActivity()
            if (r4 == 0) goto L_0x0034
            androidx.lifecycle.w0 r5 = new androidx.lifecycle.w0
            r5.<init>(r4)
            java.lang.Class<tb.c> r4 = tb.c.class
            androidx.lifecycle.u0 r4 = r5.a(r4)
            r1 = r4
            tb.c r1 = (tb.c) r1
        L_0x0034:
            r2.f9410a = r1
            r3.v(r1)
            android.view.View r3 = r3.f1668t
            java.lang.String r4 = "binding.root"
            e6.e.C(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f9412c.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        a aVar;
        TabLayout.f i;
        TabLayout.f fVar;
        TabLayout tabLayout;
        TextView textView;
        e.D(view, "view");
        super.onViewCreated(view, bundle);
        c cVar = this.f9410a;
        if (!(cVar == null || (textView = (TextView) b(R.id.balanceDetailTextView)) == null)) {
            textView.setText(getString(R.string.estimatedBalanceExplanation, cVar.f11474x));
        }
        g.b(b.u(this), (f) null, new d(this, (d<? super d>) null), 3);
        SeekBar seekBar = (SeekBar) b(R.id.simSeekbar);
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new e(this));
        }
        for (a aVar2 : a.values()) {
            TabLayout tabLayout2 = (TabLayout) b(R.id.tabLayout);
            if (tabLayout2 != null) {
                fVar = tabLayout2.j();
                fVar.b(getString(aVar2.labelId()));
                fVar.c(getString(aVar2.labelId()));
                int ordinal = aVar2.ordinal();
                fVar.f4044h = ordinal;
                TabLayout.h hVar = fVar.g;
                if (hVar != null) {
                    hVar.setId(ordinal);
                }
            } else {
                fVar = null;
            }
            if (!(fVar == null || (tabLayout = (TabLayout) b(R.id.tabLayout)) == null)) {
                tabLayout.b(fVar);
            }
        }
        TabLayout tabLayout3 = (TabLayout) b(R.id.tabLayout);
        if (tabLayout3 != null) {
            tabLayout3.a(new f(this));
        }
        c cVar2 = this.f9410a;
        if (!(cVar2 == null || (aVar = cVar2.f11473w) == null)) {
            int ordinal2 = aVar.ordinal();
            TabLayout tabLayout4 = (TabLayout) b(R.id.tabLayout);
            if (!(tabLayout4 == null || (i = tabLayout4.i(ordinal2)) == null)) {
                i.a();
            }
        }
        Button button = (Button) b(R.id.resetButton);
        if (button != null) {
            button.setOnClickListener(new b(this, 0));
        }
        Button button2 = (Button) b(R.id.resetButton);
        if (button2 != null) {
            button2.performClick();
        }
        Button button3 = (Button) b(R.id.learnMoreButton);
        if (button3 != null) {
            button3.setOnClickListener(new c(this, 0));
        }
        c cVar3 = this.f9410a;
        if (cVar3 != null) {
            g.b(b.y(cVar3), (f) null, new tb.d(cVar3, (d<? super tb.d>) null), 3);
        }
    }
}
