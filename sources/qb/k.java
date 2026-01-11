package qb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.lifecycle.q;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.tabs.TabLayout;
import de.h;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel;
import io.nodle.cash.utils.AutoClearedProperty;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import qb.f;
import va.x0;
import yd.j;
import yd.v;

public final class k extends d {
    public static final String A = "StatsFragment";

    /* renamed from: y  reason: collision with root package name */
    public static final a f10366y = new a();
    public static final /* synthetic */ h<Object>[] z;

    /* renamed from: t  reason: collision with root package name */
    public final long f10367t = 200;

    /* renamed from: u  reason: collision with root package name */
    public final v0 f10368u;

    /* renamed from: v  reason: collision with root package name */
    public final AutoClearedProperty f10369v;

    /* renamed from: w  reason: collision with root package name */
    public vb.b f10370w;

    /* renamed from: x  reason: collision with root package name */
    public Map<Integer, View> f10371x = new LinkedHashMap();

    public static final class a {
    }

    public static final class b extends BarDataSet {

        /* renamed from: a  reason: collision with root package name */
        public final float f10372a;

        public b(float f10, List<? extends BarEntry> list) {
            super(list, (String) null);
            this.f10372a = f10;
        }

        public final int getEntryIndex(Entry entry) {
            return this.mValues.indexOf((BarEntry) entry);
        }

        public final float getYMax() {
            return Math.max(super.getYMax(), this.f10372a);
        }
    }

    public final class c implements OnChartValueSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        public final r f10373a;

        public c(r rVar) {
            this.f10373a = rVar;
        }

        public final void onNothingSelected() {
            k kVar = k.this;
            a aVar = k.f10366y;
            kVar.c();
        }

        public final void onValueSelected(Entry entry, Highlight highlight) {
            String str;
            if (highlight != null) {
                k kVar = k.this;
                float x10 = highlight.getX();
                float xPx = highlight.getXPx();
                r rVar = this.f10373a;
                a aVar = k.f10366y;
                Objects.requireNonNull(kVar);
                List<q> list = rVar.f10392e;
                int i = (int) x10;
                e6.e.D(list, "<this>");
                q qVar = (i < 0 || i > a.b.c0(list)) ? null : list.get(i);
                if (qVar != null) {
                    TextView textView = kVar.d().f12434v;
                    vb.b bVar = kVar.f10370w;
                    if (bVar != null) {
                        textView.setText(bVar.c(qVar.f10387d));
                        TextView textView2 = kVar.d().f12437y;
                        int i10 = d.f10375a[rVar.f10388a.ordinal()];
                        if (i10 == 1) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                            str = o.c(simpleDateFormat.format(Long.valueOf(qVar.f10384a)), " - ", simpleDateFormat.format(Long.valueOf(qVar.f10385b)));
                        } else if (i10 == 2) {
                            str = new SimpleDateFormat("E, MMMM d").format(Long.valueOf(qVar.f10384a));
                        } else if (i10 == 3) {
                            str = new SimpleDateFormat("MMMM d").format(Long.valueOf(qVar.f10384a));
                        } else if (i10 == 4) {
                            str = new SimpleDateFormat("MMMM, yyyy").format(Long.valueOf(qVar.f10384a));
                        } else {
                            throw new md.e();
                        }
                        textView2.setText(str);
                        LinearLayout linearLayout = kVar.d().f12430c;
                        e6.e.C(linearLayout, "binding.bubbleLayout");
                        if (linearLayout.getVisibility() == 0) {
                            x0 d10 = kVar.d();
                            d10.f12430c.post(new i(xPx, d10, kVar));
                            return;
                        }
                        x0 d11 = kVar.d();
                        x0 d12 = kVar.d();
                        LinearLayout linearLayout2 = d12.f12430c;
                        e6.e.C(linearLayout2, "bubbleLayout");
                        if (!(linearLayout2.getVisibility() == 0)) {
                            LinearLayout linearLayout3 = d12.f12430c;
                            e6.e.C(linearLayout3, "bubbleLayout");
                            linearLayout3.setVisibility(0);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d12.f12430c, "alpha", new float[]{0.0f, 1.0f});
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d12.z, "alpha", new float[]{1.0f, 0.0f});
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat});
                            animatorSet.setInterpolator(new AccelerateInterpolator());
                            animatorSet.setDuration(kVar.f10367t);
                            animatorSet.addListener(new o(d12));
                            animatorSet.start();
                        }
                        d11.f12430c.post(new h(xPx, d11));
                        d11.f12432t.post(new j(d11, xPx));
                        return;
                    }
                    e6.e.c0("nodleFormatter");
                    throw null;
                }
            }
        }
    }

    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10375a;

        static {
            int[] iArr = new int[s.values().length];
            iArr[s.DAY.ordinal()] = 1;
            iArr[s.WEEK.ordinal()] = 2;
            iArr[s.MONTH.ordinal()] = 3;
            iArr[s.YEAR.ordinal()] = 4;
            f10375a = iArr;
        }
    }

    public static final class e extends yd.h implements xd.a<Fragment> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f10376b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f10376b = fragment;
        }

        public final Object c() {
            return this.f10376b;
        }
    }

    public static final class f extends yd.h implements xd.a<androidx.lifecycle.x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ xd.a f10377b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(xd.a aVar) {
            super(0);
            this.f10377b = aVar;
        }

        public final Object c() {
            androidx.lifecycle.x0 viewModelStore = ((y0) this.f10377b.c()).getViewModelStore();
            e6.e.C(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static final class g extends yd.h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ xd.a f10378b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f10379c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(xd.a aVar, Fragment fragment) {
            super(0);
            this.f10378b = aVar;
            this.f10379c = fragment;
        }

        public final Object c() {
            Object c10 = this.f10378b.c();
            w0.b bVar = null;
            q qVar = c10 instanceof q ? (q) c10 : null;
            if (qVar != null) {
                bVar = qVar.getDefaultViewModelProviderFactory();
            }
            if (bVar == null) {
                bVar = this.f10379c.getDefaultViewModelProviderFactory();
            }
            e6.e.C(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
            return bVar;
        }
    }

    static {
        j jVar = new j(k.class, "binding", "getBinding()Lio/nodle/cash/databinding/FragmentStatsBinding;");
        Objects.requireNonNull(v.f13623a);
        z = new h[]{jVar};
    }

    public k() {
        e eVar = new e(this);
        this.f10368u = new v0(v.a(StatsViewModel.class), new f(eVar), new g(eVar, this));
        this.f10369v = y.c.l(this);
    }

    public final void c() {
        x0 d10 = d();
        View view = d10.f12431s;
        e6.e.C(view, "bubbleLineView");
        if (view.getVisibility() == 0) {
            View view2 = d10.f12431s;
            e6.e.C(view2, "bubbleLineView");
            view2.setVisibility(8);
            ImageView imageView = d10.f12432t;
            e6.e.C(imageView, "bubbleNotchView");
            imageView.setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d10.f12430c, "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d10.z, "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setInterpolator(new AccelerateInterpolator());
            animatorSet.setDuration(this.f10367t);
            animatorSet.addListener(new l(d10));
            animatorSet.start();
        }
        d().f12433u.highlightValues((Highlight[]) null);
    }

    public final x0 d() {
        return (x0) this.f10369v.f(this, z[0]);
    }

    public final StatsViewModel e() {
        return (StatsViewModel) this.f10368u.a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        e6.e.D(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(R.layout.fragment_stats, viewGroup, false);
        int i = R.id.bubbleContainer;
        FrameLayout frameLayout = (FrameLayout) jc.b.q(inflate, R.id.bubbleContainer);
        if (frameLayout != null) {
            i = R.id.bubbleLayout;
            LinearLayout linearLayout = (LinearLayout) jc.b.q(inflate, R.id.bubbleLayout);
            if (linearLayout != null) {
                i = R.id.bubbleLineView;
                View q10 = jc.b.q(inflate, R.id.bubbleLineView);
                if (q10 != null) {
                    i = R.id.bubbleNotchView;
                    ImageView imageView = (ImageView) jc.b.q(inflate, R.id.bubbleNotchView);
                    if (imageView != null) {
                        i = R.id.chart;
                        BarChart barChart = (BarChart) jc.b.q(inflate, R.id.chart);
                        if (barChart != null) {
                            i = R.id.nodlTextView;
                            TextView textView = (TextView) jc.b.q(inflate, R.id.nodlTextView);
                            if (textView != null) {
                                i = R.id.shimmerLayout;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) jc.b.q(inflate, R.id.shimmerLayout);
                                if (shimmerFrameLayout != null) {
                                    i = R.id.tabLayout;
                                    TabLayout tabLayout = (TabLayout) jc.b.q(inflate, R.id.tabLayout);
                                    if (tabLayout != null) {
                                        i = R.id.timeTextView;
                                        TextView textView2 = (TextView) jc.b.q(inflate, R.id.timeTextView);
                                        if (textView2 != null) {
                                            i = R.id.totalAmountContainer;
                                            LinearLayout linearLayout2 = (LinearLayout) jc.b.q(inflate, R.id.totalAmountContainer);
                                            if (linearLayout2 != null) {
                                                i = R.id.totalNodlTextView;
                                                TextView textView3 = (TextView) jc.b.q(inflate, R.id.totalNodlTextView);
                                                if (textView3 != null) {
                                                    i = R.id.totalTimeTextView;
                                                    TextView textView4 = (TextView) jc.b.q(inflate, R.id.totalTimeTextView);
                                                    if (textView4 != null) {
                                                        this.f10369v.h(this, z[0], new x0((LinearLayout) inflate, frameLayout, linearLayout, q10, imageView, barChart, textView, shimmerFrameLayout, tabLayout, textView2, linearLayout2, textView3, textView4));
                                                        LinearLayout linearLayout3 = d().f12428a;
                                                        e6.e.C(linearLayout3, "binding.root");
                                                        return linearLayout3;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, android.view.View>] */
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10371x.clear();
    }

    public final void onResume() {
        super.onResume();
        e().i(f.b.f10357a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        e6.e.D(view, "view");
        super.onViewCreated(view, bundle);
        y.c.k(e().f11466s).e(getViewLifecycleOwner(), new r4.c(this));
        y.c.k(e().f11468u).e(getViewLifecycleOwner(), new a5.o(this));
    }
}
