package io.nodle.cash.ui.view.activity;

import a5.m;
import ab.i;
import ab.j;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.k0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d0.a;
import e6.e;
import ge.g;
import h1.d0;
import hb.d;
import hb.h;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import pb.c;
import pb.j;
import pb.o;
import qb.f;
import qb.k;
import sb.p;
import x7.m0;

public final class HomeActivityV2 extends d {
    public static final /* synthetic */ int H = 0;
    public o A;
    public p B;
    public final k0<HomeViewModelV2.a> C = new d0(this, 6);
    public final k0<List<sa.b>> D = new a5.p(this, 3);
    public final k0<List<sa.b>> E = new m0(this, 1);
    public final k0<Boolean> F = new m(this, 4);
    public Map<Integer, View> G = new LinkedHashMap();

    /* renamed from: y  reason: collision with root package name */
    public final String f6710y = "HomeActivityV2";
    public HomeViewModelV2 z;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6711a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6712b;

        static {
            int[] iArr = new int[HomeViewModelV2.a.values().length];
            iArr[HomeViewModelV2.a.GOTO_MAP.ordinal()] = 1;
            iArr[HomeViewModelV2.a.GOTO_STATS.ordinal()] = 2;
            iArr[HomeViewModelV2.a.GOTO_NOTIFICATION.ordinal()] = 3;
            iArr[HomeViewModelV2.a.GOTO_SETTINGS.ordinal()] = 4;
            iArr[HomeViewModelV2.a.GOTO_PAY.ordinal()] = 5;
            iArr[HomeViewModelV2.a.GOTO_RECEIVE.ordinal()] = 6;
            iArr[HomeViewModelV2.a.DISMISS_RECEIVE.ordinal()] = 7;
            iArr[HomeViewModelV2.a.SHARE_PK.ordinal()] = 8;
            iArr[HomeViewModelV2.a.SHOW_REWARDS.ordinal()] = 9;
            iArr[HomeViewModelV2.a.SHOW_TRANSFERS.ordinal()] = 10;
            iArr[HomeViewModelV2.a.INIT_SHEET_ACTION.ordinal()] = 11;
            iArr[HomeViewModelV2.a.GOTO_BROWSER.ordinal()] = 12;
            iArr[HomeViewModelV2.a.SHOW_APP_REVIEW.ordinal()] = 13;
            iArr[HomeViewModelV2.a.DISMISS_NOTICE.ordinal()] = 14;
            iArr[HomeViewModelV2.a.GOTO_ESTIMATION.ordinal()] = 15;
            f6711a = iArr;
            int[] iArr2 = new int[j.values().length];
            iArr2[j.LOCATION_PERMISSION.ordinal()] = 1;
            iArr2[j.BLUETOOTH_PERMISSION.ordinal()] = 2;
            iArr2[j.ENABLE_LOCATION.ordinal()] = 3;
            iArr2[j.ENABLE_BLUETOOTH.ordinal()] = 4;
            f6712b = iArr2;
        }
    }

    public static final class b extends BottomSheetBehavior.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeActivityV2 f6713a;

        public b(HomeActivityV2 homeActivityV2) {
            this.f6713a = homeActivityV2;
        }

        public final void b(View view) {
        }

        public final void c(View view, int i) {
            HomeViewModelV2 homeViewModelV2;
            if (i == 3) {
                HomeViewModelV2 homeViewModelV22 = this.f6713a.z;
                if (homeViewModelV22 != null) {
                    homeViewModelV22.n();
                }
            } else if (i == 4 && (homeViewModelV2 = this.f6713a.z) != null) {
                homeViewModelV2.k();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View k(int i) {
        ? r02 = this.G;
        View view = (View) r02.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        r02.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void l(String str) {
        j.a aVar = pb.j.F;
        j.a aVar2 = pb.j.F;
        String str2 = pb.j.G;
        if (e.r(str, str2)) {
            Fragment F2 = getSupportFragmentManager().F(str2);
            if (F2 != null) {
                ((pb.j) F2).d();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar3.n(F2);
                aVar3.d();
            } else {
                androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar4.e(R.id.fragmentContainer, new pb.j(), str2, 1);
                aVar4.d();
            }
            a0 supportFragmentManager = getSupportFragmentManager();
            c.a aVar5 = c.f9820c;
            c.a aVar6 = c.f9820c;
            String str3 = c.f9821s;
            Fragment F3 = supportFragmentManager.F(str3);
            if (F3 != null) {
                androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar7.n(F3);
                aVar7.d();
            } else {
                androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar8.e(R.id.flashContainer, new c(), str3, 1);
                aVar8.d();
            }
            a0 supportFragmentManager2 = getSupportFragmentManager();
            Objects.requireNonNull(k.f10366y);
            Fragment F4 = supportFragmentManager2.F(k.A);
            if (F4 != null) {
                androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar9.l(F4);
                aVar9.d();
                return;
            }
            return;
        }
        k.a aVar10 = k.f10366y;
        Objects.requireNonNull(aVar10);
        String str4 = k.A;
        if (e.r(str, str4)) {
            a0 supportFragmentManager3 = getSupportFragmentManager();
            Objects.requireNonNull(aVar10);
            Fragment F5 = supportFragmentManager3.F(str4);
            if (F5 != null) {
                androidx.fragment.app.a aVar11 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar11.n(F5);
                aVar11.d();
                ((k) F5).e().i(f.b.f10357a);
            } else {
                androidx.fragment.app.a aVar12 = new androidx.fragment.app.a(getSupportFragmentManager());
                Objects.requireNonNull(aVar10);
                k kVar = new k();
                Objects.requireNonNull(aVar10);
                aVar12.e(R.id.fragmentContainer, kVar, str4, 1);
                aVar12.d();
            }
            Fragment F6 = getSupportFragmentManager().F(str2);
            if (F6 != null) {
                androidx.fragment.app.a aVar13 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar13.l(F6);
                aVar13.d();
                ((pb.j) F6).c();
            }
            a0 supportFragmentManager4 = getSupportFragmentManager();
            c.a aVar14 = c.f9820c;
            c.a aVar15 = c.f9820c;
            Fragment F7 = supportFragmentManager4.F(c.f9821s);
            if (F7 != null) {
                androidx.fragment.app.a aVar16 = new androidx.fragment.app.a(getSupportFragmentManager());
                aVar16.l(F7);
                aVar16.d();
            }
        }
    }

    public final void m() {
        ab.f.f215a.e();
        ab.k kVar = ab.k.f279a;
        ne.c cVar = ab.k.f280b;
        if (cVar.c()) {
            cVar.a((Object) null);
        }
        kVar.b((i) null);
    }

    public final void n(HomeViewModelV2.a aVar) {
        int i = a.f6711a[aVar.ordinal()];
        if (i == 1) {
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = f0.f.f4887a;
            ((Button) k(R.id.mapTabButton)).setBackground(resources.getDrawable(R.drawable.background_tab, (Resources.Theme) null));
            ((Button) k(R.id.mapTabButton)).setTextColor(getResources().getColor(R.color.backgroundV2, (Resources.Theme) null));
            ((Button) k(R.id.statsTabButton)).setBackgroundColor(0);
            ((Button) k(R.id.statsTabButton)).setTextColor(getResources().getColor(R.color.textV2, (Resources.Theme) null));
        } else if (i == 2) {
            Resources resources2 = getResources();
            ThreadLocal<TypedValue> threadLocal2 = f0.f.f4887a;
            ((Button) k(R.id.statsTabButton)).setBackground(resources2.getDrawable(R.drawable.background_tab, (Resources.Theme) null));
            ((Button) k(R.id.statsTabButton)).setTextColor(getResources().getColor(R.color.backgroundV2, (Resources.Theme) null));
            ((Button) k(R.id.mapTabButton)).setBackgroundColor(0);
            ((Button) k(R.id.mapTabButton)).setTextColor(getResources().getColor(R.color.textV2, (Resources.Theme) null));
        }
    }

    public final void onBackPressed() {
        if (BottomSheetBehavior.x((NestedScrollView) k(R.id.homeBottomSheet)).J == 3) {
            HomeViewModelV2 homeViewModelV2 = this.z;
            if (homeViewModelV2 != null) {
                LinearLayout linearLayout = (LinearLayout) k(R.id.miniLayout);
                e.C(linearLayout, "miniLayout");
                homeViewModelV2.o(linearLayout);
                return;
            }
            return;
        }
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        LiveData<Boolean> liveData;
        LiveData<List<sa.b>> liveData2;
        LiveData<List<sa.b>> liveData3;
        super.onCreate(bundle);
        HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) new w0(this).a(HomeViewModelV2.class);
        this.z = homeViewModelV2;
        LiveData<HomeViewModelV2.a> liveData4 = homeViewModelV2.O;
        if (liveData4 != null) {
            liveData4.e(this, this.C);
        }
        HomeViewModelV2 homeViewModelV22 = this.z;
        if (!(homeViewModelV22 == null || (liveData3 = homeViewModelV22.J) == null)) {
            liveData3.e(this, this.D);
        }
        HomeViewModelV2 homeViewModelV23 = this.z;
        if (!(homeViewModelV23 == null || (liveData2 = homeViewModelV23.K) == null)) {
            liveData2.e(this, this.E);
        }
        HomeViewModelV2 homeViewModelV24 = this.z;
        if (!(homeViewModelV24 == null || (liveData = homeViewModelV24.N) == null)) {
            liveData.e(this, this.F);
        }
        HomeViewModelV2 homeViewModelV25 = this.z;
        if (homeViewModelV25 != null) {
            getLifecycle().a(homeViewModelV25);
        }
        ViewDataBinding d10 = androidx.databinding.f.d(this, R.layout.activity_home_v2);
        e.C(d10, "setContentView(this, R.layout.activity_home_v2)");
        va.e eVar = (va.e) d10;
        eVar.r(this);
        eVar.v(this.z);
        Object obj = d0.a.f4256a;
        ub.d dVar = new ub.d(a.b.b(this, R.drawable.item_divider));
        ((RecyclerView) k(R.id.transferSummaryRecyclerView)).g(dVar);
        ((RecyclerView) k(R.id.rewardSummaryRecyclerView)).g(dVar);
        Button button = (Button) k(R.id.estimationInUsd);
        e.C(button, "estimationInUsd");
        button.setVisibility(8);
        TextView textView = (TextView) k(R.id.nodleCashLabel);
        e.C(textView, "nodleCashLabel");
        textView.setVisibility(0);
        BottomSheetBehavior x10 = BottomSheetBehavior.x((NestedScrollView) k(R.id.homeBottomSheet));
        e.C(x10, "from(homeBottomSheet)");
        x10.s(new b(this));
        HomeViewModelV2 homeViewModelV26 = this.z;
        if (homeViewModelV26 != null) {
            g.b(jc.b.y(homeViewModelV26), (pd.f) null, new h(this, (pd.d<? super h>) null), 3);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        e.D(strArr, "permissions");
        e.D(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ei.c.b(i, strArr, iArr, this);
        m();
    }
}
