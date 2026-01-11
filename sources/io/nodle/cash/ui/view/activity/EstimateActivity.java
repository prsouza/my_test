package io.nodle.cash.ui.view.activity;

import ab.k;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.f;
import androidx.lifecycle.w0;
import com.google.android.material.tabs.TabLayout;
import e6.e;
import h1.c0;
import hb.a;
import hb.b;
import io.nodle.cash.R;
import java.util.LinkedHashMap;
import java.util.Map;
import ob.h;
import pb.o;
import tb.c;

public final class EstimateActivity extends a {
    public static final /* synthetic */ int B = 0;
    public Map<Integer, View> A = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f6706v = "EstimateActivity";

    /* renamed from: w  reason: collision with root package name */
    public c f6707w;

    /* renamed from: x  reason: collision with root package name */
    public h f6708x;

    /* renamed from: y  reason: collision with root package name */
    public ob.a f6709y;
    public o z;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View k(int i) {
        ? r42 = this.A;
        Integer valueOf = Integer.valueOf(R.id.tabLayout);
        View view = (View) r42.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.tabLayout);
        if (findViewById == null) {
            return null;
        }
        r42.put(valueOf, findViewById);
        return findViewById;
    }

    public final void onCreate(Bundle bundle) {
        TabLayout.f i;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_estimate);
        this.f6707w = (c) new w0(this).a(c.class);
        ViewDataBinding d10 = f.d(this, R.layout.activity_estimate);
        e.C(d10, "setContentView(this, R.layout.activity_estimate)");
        va.a aVar = (va.a) d10;
        aVar.r(this);
        aVar.v(this.f6707w);
        k kVar = k.f279a;
        k.f281c.e(this, new c0(this, 3));
        TabLayout tabLayout = (TabLayout) k(R.id.tabLayout);
        if (tabLayout != null) {
            tabLayout.a(new b(this));
        }
        TabLayout tabLayout2 = (TabLayout) k(R.id.tabLayout);
        if (tabLayout2 != null && (i = tabLayout2.i(0)) != null) {
            i.a();
        }
    }
}
