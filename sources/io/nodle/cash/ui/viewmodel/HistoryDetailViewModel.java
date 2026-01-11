package io.nodle.cash.ui.viewmodel;

import android.app.Application;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import com.github.mikephil.charting.BuildConfig;
import ge.d0;
import ge.g;
import io.nodle.cash.R;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import xd.p;

public final class HistoryDetailViewModel extends androidx.lifecycle.b implements z {
    public static final b C = new b();
    public static sa.b D = new sa.b();
    public final LiveData<Boolean> A;
    public final LiveData<a> B;

    /* renamed from: s  reason: collision with root package name */
    public final String f6749s = "HistoryDetailViewModel";

    /* renamed from: t  reason: collision with root package name */
    public final Application f6750t;

    /* renamed from: u  reason: collision with root package name */
    public final j0<Integer> f6751u;

    /* renamed from: v  reason: collision with root package name */
    public final j0<String> f6752v;

    /* renamed from: w  reason: collision with root package name */
    public final j0<Boolean> f6753w;

    /* renamed from: x  reason: collision with root package name */
    public final j0<a> f6754x;

    /* renamed from: y  reason: collision with root package name */
    public final LiveData<Integer> f6755y;
    public final LiveData<String> z;

    public enum a {
        NONE,
        HIDE_HISTORY_DETAIL,
        SHOW_BLOCK_EXPLORER
    }

    public static final class b {
    }

    @e(c = "io.nodle.cash.ui.viewmodel.HistoryDetailViewModel$onCreate$1", f = "HistoryDetailViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HistoryDetailViewModel f6756a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(HistoryDetailViewModel historyDetailViewModel, d<? super c> dVar) {
            super(2, dVar);
            this.f6756a = historyDetailViewModel;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new c(this.f6756a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((c) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            b bVar = HistoryDetailViewModel.C;
            sa.b bVar2 = HistoryDetailViewModel.D;
            boolean z = true;
            if (bVar2 == null || !bVar2.c(this.f6756a.f6750t)) {
                z = false;
            }
            Boolean bool = null;
            if (z) {
                this.f6756a.f6751u.k(new Integer(R.string.from));
                j0<String> j0Var = this.f6756a.f6752v;
                sa.b bVar3 = HistoryDetailViewModel.D;
                j0Var.k(bVar3 != null ? bVar3.f11036a : null);
            } else {
                this.f6756a.f6751u.k(new Integer(R.string.to));
                j0<String> j0Var2 = this.f6756a.f6752v;
                sa.b bVar4 = HistoryDetailViewModel.D;
                j0Var2.k(bVar4 != null ? bVar4.f11037b : null);
            }
            j0<Boolean> j0Var3 = this.f6756a.f6753w;
            sa.b bVar5 = HistoryDetailViewModel.D;
            if (bVar5 != null) {
                bool = Boolean.valueOf(bVar5.A);
            }
            j0Var3.k(bool);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistoryDetailViewModel(Application application) {
        super(application);
        e6.e.D(application, "application");
        this.f6750t = application;
        j0<Integer> j0Var = new j0<>(Integer.valueOf(R.string.blank));
        this.f6751u = j0Var;
        j0<String> j0Var2 = new j0<>(BuildConfig.FLAVOR);
        this.f6752v = j0Var2;
        j0<Boolean> j0Var3 = new j0<>(Boolean.FALSE);
        this.f6753w = j0Var3;
        j0<a> j0Var4 = new j0<>(a.NONE);
        this.f6754x = j0Var4;
        this.f6755y = j0Var;
        this.z = j0Var2;
        this.A = j0Var3;
        this.B = j0Var4;
    }

    public final void i(a aVar) {
        e6.e.D(aVar, "action");
        String str = this.f6749s;
        Log.d(str, "ViewModel Action: " + aVar);
        this.f6754x.j(aVar);
    }

    @l0(r.b.ON_CREATE)
    public final void onCreate() {
        g.b(jc.b.y(this), (f) null, new c(this, (d<? super c>) null), 3);
    }
}
