package io.nodle.cash.ui.view.activity.transact;

import a5.p;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.k0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ge.d0;
import ge.g;
import ge.o0;
import ge.v1;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import je.f;
import l6.b1;
import lb.d;
import md.m;
import rd.e;
import rd.i;
import yd.h;
import yd.v;

public final class HistoryActivityV2 extends kb.b {
    public static final /* synthetic */ int D = 0;
    public d A;
    public final k0<Boolean> B = new p(this, 4);
    public Map<Integer, View> C = new LinkedHashMap();

    /* renamed from: y  reason: collision with root package name */
    public final String f6737y = "HistoryActivityV2";
    public final v0 z = new v0(v.a(HistoryViewModelV2.class), new c(this), new b(this));

    @e(c = "io.nodle.cash.ui.view.activity.transact.HistoryActivityV2$onCreate$1", f = "HistoryActivityV2.kt", l = {43}, m = "invokeSuspend")
    public static final class a extends i implements xd.p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6738a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HistoryActivityV2 f6739b;

        /* renamed from: io.nodle.cash.ui.view.activity.transact.HistoryActivityV2$a$a  reason: collision with other inner class name */
        public static final class C0116a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HistoryActivityV2 f6740a;

            public C0116a(HistoryActivityV2 historyActivityV2) {
                this.f6740a = historyActivityV2;
            }

            public final Object a(Object obj, pd.d dVar) {
                List list = (List) obj;
                String str = this.f6740a.f6737y;
                int size = list.size();
                Log.d(str, "HISTORY : " + size);
                RecyclerView recyclerView = (RecyclerView) this.f6740a.k(R.id.historyRecyclerView);
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                }
                RecyclerView recyclerView2 = (RecyclerView) this.f6740a.k(R.id.historyRecyclerView);
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(new d(this.f6740a, list));
                }
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(HistoryActivityV2 historyActivityV2, pd.d<? super a> dVar) {
            super(2, dVar);
            this.f6739b = historyActivityV2;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new a(this.f6739b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: type inference failed for: r5v4, types: [je.n<java.util.List<sa.b>>, je.i] */
        public final Object invokeSuspend(Object obj) {
            Object obj2 = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6738a;
            if (i == 0) {
                b1.w(obj);
                HistoryActivityV2 historyActivityV2 = this.f6739b;
                int i10 = HistoryActivityV2.D;
                ? r52 = historyActivityV2.l().f6763x;
                C0116a aVar = new C0116a(this.f6739b);
                this.f6738a = 1;
                if (r52.b(aVar, this) == obj2) {
                    return obj2;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                b1.w(obj);
            }
            throw new md.b();
        }
    }

    public static final class b extends h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6741b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f6741b = componentActivity;
        }

        public final Object c() {
            return this.f6741b.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends h implements xd.a<x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6742b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f6742b = componentActivity;
        }

        public final Object c() {
            x0 viewModelStore = this.f6742b.getViewModelStore();
            e6.e.C(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<java.lang.Integer, android.view.View>] */
    public final View k(int i) {
        ? r02 = this.C;
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

    public final HistoryViewModelV2 l() {
        return (HistoryViewModelV2) this.z.a();
    }

    public final void onCreate(Bundle bundle) {
        v1 v1Var;
        super.onCreate(bundle);
        l().z.e(this, this.B);
        ViewDataBinding d10 = androidx.databinding.f.d(this, R.layout.activity_history_v2);
        e6.e.C(d10, "setContentView(this, R.layout.activity_history_v2)");
        va.c cVar = (va.c) d10;
        cVar.r(this);
        cVar.v(l());
        g.b(jc.b.u(this), (pd.f) null, new a(this, (pd.d<? super a>) null), 3);
        HistoryViewModelV2 l10 = l();
        bb.g gVar = bb.g.values()[getIntent().getIntExtra("EXTRA_TRANS_TYPE", 0)];
        e6.e.D(gVar, "<set-?>");
        l10.f6761v = gVar;
        HistoryViewModelV2 l11 = l();
        g.b(jc.b.y(l11), (pd.f) null, new tb.f(l11, (pd.d<? super tb.f>) null), 3);
        v1 v1Var2 = l11.B;
        if ((v1Var2 != null && v1Var2.a()) && (v1Var = l11.B) != null) {
            v1Var.c((CancellationException) null);
        }
        l11.B = (v1) g.b(jc.b.y(l11), o0.f5433a, new tb.e(l11, (pd.d<? super tb.e>) null), 2);
        l();
        this.A = new d(this, new ArrayList());
        RecyclerView recyclerView = (RecyclerView) k(R.id.historyRecyclerView);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        }
        RecyclerView recyclerView2 = (RecyclerView) k(R.id.historyRecyclerView);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.A);
        }
        RecyclerView recyclerView3 = (RecyclerView) k(R.id.historyRecyclerView);
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
        }
        RecyclerView recyclerView4 = (RecyclerView) k(R.id.historyRecyclerView);
        if (recyclerView4 != null) {
            recyclerView4.setNestedScrollingEnabled(false);
        }
    }
}
