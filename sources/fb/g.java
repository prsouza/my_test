package fb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.github.mikephil.charting.BuildConfig;
import com.google.gson.Gson;
import dagger.hilt.android.internal.managers.c;
import ge.g0;
import io.nodle.cash.data.local.CashDatabase;
import io.nodle.cash.data.remote.api.SubscanApi;
import io.nodle.cash.ui.CashApp;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.LauncherActivity;
import io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel;
import io.nodle.cash.ui.viewmodel.HistoryViewModelV2;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.cash.ui.viewmodel.ImportAccountViewModel;
import io.nodle.cash.ui.viewmodel.LauncherViewModel;
import io.nodle.cash.ui.viewmodel.OnboardViewModel;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ki.a0;
import l9.a;
import p002if.v;
import qb.k;
import ua.l;

public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public final m9.a f5047a;

    /* renamed from: b  reason: collision with root package name */
    public final g f5048b = this;

    /* renamed from: c  reason: collision with root package name */
    public cc.a<ya.d> f5049c;

    /* renamed from: d  reason: collision with root package name */
    public cc.a<ua.f> f5050d;

    /* renamed from: e  reason: collision with root package name */
    public cc.a<v> f5051e;

    /* renamed from: f  reason: collision with root package name */
    public cc.a<CashDatabase> f5052f;
    public cc.a<ra.c> g;

    public static final class a implements k9.a {

        /* renamed from: a  reason: collision with root package name */
        public final g f5053a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5054b;

        /* renamed from: c  reason: collision with root package name */
        public Activity f5055c;

        public a(g gVar, d dVar) {
            this.f5053a = gVar;
            this.f5054b = dVar;
        }
    }

    public static final class b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final g f5056a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5057b;

        /* renamed from: c  reason: collision with root package name */
        public final b f5058c = this;

        public b(g gVar, d dVar) {
            this.f5056a = gVar;
            this.f5057b = dVar;
        }

        public final a.c a() {
            Application z = y.c.z(this.f5056a.f5047a.f8510a);
            Objects.requireNonNull(z, "Cannot return null from a non-@Nullable @Provides method");
            int i = v6.e.f12305c;
            Object[] objArr = new Object[7];
            objArr[0] = "io.nodle.cash.ui.viewmodel.HistoryViewModelV2";
            objArr[1] = "io.nodle.cash.ui.viewmodel.HomeViewModelV2";
            objArr[2] = "io.nodle.cash.ui.viewmodel.ImportAccountViewModel";
            objArr[3] = "io.nodle.cash.ui.viewmodel.LauncherViewModel";
            objArr[4] = "io.nodle.cash.ui.viewmodel.OnboardViewModel";
            objArr[5] = "io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel";
            System.arraycopy(new String[]{"io.nodle.cash.ui.viewmodel.TransactViewModel"}, 0, objArr, 6, 1);
            return new a.c(z, v6.e.k(7, objArr), new h(this.f5056a, this.f5057b));
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d(HomeActivityV2 homeActivityV2) {
            g.c(this.f5056a);
        }

        public final void e() {
        }

        public final void f() {
        }

        public final k9.c g() {
            return new e(this.f5056a, this.f5057b, this.f5058c);
        }

        public final void h(LauncherActivity launcherActivity) {
            launcherActivity.z = this.f5056a.f5049c.get();
        }
    }

    public static final class c implements k9.b {

        /* renamed from: a  reason: collision with root package name */
        public final g f5059a;

        public c(g gVar) {
            this.f5059a = gVar;
        }
    }

    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final g f5060a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5061b = this;

        /* renamed from: c  reason: collision with root package name */
        public cc.a f5062c;

        public static final class a<T> implements cc.a<T> {
            public final T get() {
                return new c.d();
            }
        }

        public d(g gVar) {
            this.f5060a = gVar;
            this.f5062c = o9.a.a(new a());
        }

        public final k9.a a() {
            return new a(this.f5060a, this.f5061b);
        }

        public final i9.a b() {
            return (i9.a) this.f5062c.get();
        }
    }

    public static final class e implements k9.c {

        /* renamed from: a  reason: collision with root package name */
        public final g f5063a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5064b;

        /* renamed from: c  reason: collision with root package name */
        public final b f5065c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f5066d;

        public e(g gVar, d dVar, b bVar) {
            this.f5063a = gVar;
            this.f5064b = dVar;
            this.f5065c = bVar;
        }
    }

    public static final class f extends d {

        /* renamed from: a  reason: collision with root package name */
        public final b f5067a;

        public f(b bVar) {
            this.f5067a = bVar;
        }

        public final a.c a() {
            return this.f5067a.a();
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e(k kVar) {
            kVar.f10370w = new a9.c(3);
        }
    }

    /* renamed from: fb.g$g  reason: collision with other inner class name */
    public static final class C0083g<T> implements cc.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final g f5068a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5069b;

        public C0083g(g gVar, int i) {
            this.f5068a = gVar;
            this.f5069b = i;
        }

        /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<if.s>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v11, types: [java.util.List<if.s>, java.util.ArrayList] */
        public final T get() {
            int i = this.f5069b;
            if (i == 0) {
                return new ya.d(new u2.e(m9.b.b(this.f5068a.f5047a)), this.f5068a.d(), m9.b.a());
            }
            if (i == 1) {
                return new ua.f(m9.b.b(this.f5068a.f5047a), g.c(this.f5068a));
            }
            if (i == 2) {
                ta.d dVar = new ta.d(m9.b.b(this.f5068a.f5047a));
                e4.a aVar = new e4.a(m9.b.b(this.f5068a.f5047a));
                v.a aVar2 = new v.a();
                aVar2.f6609c.add(dVar);
                aVar2.f6609c.add(aVar);
                e6.e.D(TimeUnit.SECONDS, "unit");
                aVar2.f6622r = jf.c.b();
                aVar2.f6623s = jf.c.b();
                aVar2.f6624t = jf.c.b();
                return new v(aVar2);
            } else if (i == 3) {
                CashDatabase cashDatabase = this.f5068a.f5052f.get();
                e6.e.D(cashDatabase, "cashDatabase");
                T s10 = cashDatabase.s();
                Objects.requireNonNull(s10, "Cannot return null from a non-@Nullable @Provides method");
                return s10;
            } else if (i == 4) {
                return CashDatabase.f6682n.a(m9.b.b(this.f5068a.f5047a));
            } else {
                throw new AssertionError(this.f5069b);
            }
        }
    }

    public static final class h implements k9.d {

        /* renamed from: a  reason: collision with root package name */
        public final g f5070a;

        /* renamed from: b  reason: collision with root package name */
        public final d f5071b;

        public h(g gVar, d dVar) {
            this.f5070a = gVar;
            this.f5071b = dVar;
        }
    }

    public static final class i extends f {

        /* renamed from: a  reason: collision with root package name */
        public final g f5072a;

        /* renamed from: b  reason: collision with root package name */
        public cc.a<HistoryViewModelV2> f5073b;

        /* renamed from: c  reason: collision with root package name */
        public cc.a<HomeViewModelV2> f5074c;

        /* renamed from: d  reason: collision with root package name */
        public cc.a<ImportAccountViewModel> f5075d;

        /* renamed from: e  reason: collision with root package name */
        public cc.a<LauncherViewModel> f5076e;

        /* renamed from: f  reason: collision with root package name */
        public cc.a<OnboardViewModel> f5077f;
        public cc.a<StatsViewModel> g;

        /* renamed from: h  reason: collision with root package name */
        public cc.a<TransactViewModel> f5078h;

        public static final class a<T> implements cc.a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final g f5079a;

            /* renamed from: b  reason: collision with root package name */
            public final i f5080b;

            /* renamed from: c  reason: collision with root package name */
            public final int f5081c;

            public a(g gVar, i iVar, int i) {
                this.f5079a = gVar;
                this.f5080b = iVar;
                this.f5081c = i;
            }

            /* JADX WARNING: type inference failed for: r6v4, types: [java.util.List<ki.f$a>, java.util.ArrayList] */
            public final T get() {
                int i = this.f5081c;
                String str = BuildConfig.FLAVOR;
                switch (i) {
                    case 0:
                        return new HistoryViewModelV2(m9.b.b(this.f5079a.f5047a), this.f5079a.f5050d.get());
                    case 1:
                        return new HomeViewModelV2(m9.b.b(this.f5079a.f5047a), this.f5079a.f5049c.get());
                    case 2:
                        return new ImportAccountViewModel(this.f5079a.f5049c.get());
                    case 3:
                        return new LauncherViewModel(this.f5079a.d(), this.f5079a.f5049c.get());
                    case 4:
                        return new OnboardViewModel(m9.b.b(this.f5079a.f5047a), this.f5079a.d(), this.f5079a.f5049c.get());
                    case 5:
                        qb.e eVar = new qb.e();
                        i iVar = this.f5080b;
                        Objects.requireNonNull(iVar);
                        ub.c cVar = new ub.c();
                        String c10 = iVar.f5072a.d().c(qa.e.NODLE_PUBLIC_KEY_4);
                        String str2 = c10 == null ? str : c10;
                        v vVar = iVar.f5072a.f5051e.get();
                        Gson a10 = m9.b.a();
                        e6.e.D(vVar, "okHttpClient");
                        a0.b bVar = new a0.b();
                        bVar.a();
                        bVar.f7580d.add(new li.a(a10));
                        bVar.f7578b = vVar;
                        Object b10 = bVar.b().b(SubscanApi.class);
                        e6.e.C(b10, "retrofit.create(SubscanApi::class.java)");
                        l lVar = r6;
                        l lVar2 = new l(cVar, str2, new ta.g((SubscanApi) b10, new c3.k()), new ra.g(iVar.f5072a.d(), new ub.c(), iVar.f5072a.g.get()), new db.e(new c3.k(), iVar.f5072a.d(), m9.b.a()), new ah.v(), new g0(), new vb.a(), iVar.f5072a.f5050d.get());
                        return new StatsViewModel(eVar, new qb.c(lVar, new qb.e(), new ub.c()));
                    case 6:
                        Context b11 = m9.b.b(this.f5079a.f5047a);
                        String c11 = this.f5079a.d().c(qa.e.NODLE_PUBLIC_KEY_4);
                        if (c11 != null) {
                            str = c11;
                        }
                        return new TransactViewModel(b11, str, this.f5079a.d());
                    default:
                        throw new AssertionError(this.f5081c);
                }
            }
        }

        public i(g gVar, d dVar) {
            this.f5072a = gVar;
            this.f5073b = new a(gVar, this, 0);
            this.f5074c = new a(gVar, this, 1);
            this.f5075d = new a(gVar, this, 2);
            this.f5076e = new a(gVar, this, 3);
            this.f5077f = new a(gVar, this, 4);
            this.g = new a(gVar, this, 5);
            this.f5078h = new a(gVar, this, 6);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v3 ?, r4v5 ?, r4v4 ?, r4v6 ?]
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
            */
        public final java.util.Map<java.lang.String, cc.a<androidx.lifecycle.u0>> a() {
            /*
                r13 = this;
                r0 = 7
                java.lang.String r1 = "expectedSize"
                y.c.r(r0, r1)
                v6.d$a r0 = new v6.d$a
                r0.<init>()
                cc.a<io.nodle.cash.ui.viewmodel.HistoryViewModelV2> r1 = r13.f5073b
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.HistoryViewModelV2"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.viewmodel.HomeViewModelV2> r1 = r13.f5074c
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.HomeViewModelV2"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.viewmodel.ImportAccountViewModel> r1 = r13.f5075d
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.ImportAccountViewModel"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.viewmodel.LauncherViewModel> r1 = r13.f5076e
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.LauncherViewModel"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.viewmodel.OnboardViewModel> r1 = r13.f5077f
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.OnboardViewModel"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel> r1 = r13.g
                java.lang.String r2 = "io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel"
                r0.a(r2, r1)
                cc.a<io.nodle.cash.ui.viewmodel.TransactViewModel> r1 = r13.f5078h
                java.lang.String r2 = "io.nodle.cash.ui.viewmodel.TransactViewModel"
                r0.a(r2, r1)
                int r1 = r0.f12304b
                java.lang.Object[] r0 = r0.f12303a
                if (r1 != 0) goto L_0x0046
                v6.d<java.lang.Object, java.lang.Object> r0 = v6.h.f12312v
                goto L_0x012e
            L_0x0046:
                r2 = 0
                r3 = 0
                r4 = 1
                if (r1 != r4) goto L_0x005a
                r1 = r0[r3]
                r3 = r0[r4]
                y.c.q(r1, r3)
                v6.h r1 = new v6.h
                r1.<init>(r2, r0, r4)
                r0 = r1
                goto L_0x012e
            L_0x005a:
                int r5 = r0.length
                int r5 = r5 >> r4
                aa.b.w(r1, r5)
                int r5 = v6.e.j(r1)
                if (r1 != r4) goto L_0x006e
                r3 = r0[r3]
                r4 = r0[r4]
                y.c.q(r3, r4)
                goto L_0x0128
            L_0x006e:
                int r2 = r5 + -1
                r4 = 128(0x80, float:1.794E-43)
                r6 = -1
                if (r5 > r4) goto L_0x00b2
                byte[] r4 = new byte[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = r3
            L_0x007b:
                if (r5 >= r1) goto L_0x00af
                int r6 = r5 * 2
                int r6 = r6 + r3
                r7 = r0[r6]
                r8 = r6 ^ 1
                r8 = r0[r8]
                y.c.q(r7, r8)
                int r9 = r7.hashCode()
                int r9 = ah.v.q0(r9)
            L_0x0091:
                r9 = r9 & r2
                byte r10 = r4[r9]
                r11 = 255(0xff, float:3.57E-43)
                r10 = r10 & r11
                if (r10 != r11) goto L_0x009f
                byte r6 = (byte) r6
                r4[r9] = r6
                int r5 = r5 + 1
                goto L_0x007b
            L_0x009f:
                r11 = r0[r10]
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L_0x00aa
                int r9 = r9 + 1
                goto L_0x0091
            L_0x00aa:
                java.lang.IllegalArgumentException r0 = v6.h.d(r7, r8, r0, r10)
                throw r0
            L_0x00af:
                r2 = r4
                goto L_0x0128
            L_0x00b2:
                r4 = 32768(0x8000, float:4.5918E-41)
                if (r5 > r4) goto L_0x00f2
                short[] r4 = new short[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = r3
            L_0x00bd:
                if (r5 >= r1) goto L_0x00af
                int r6 = r5 * 2
                int r6 = r6 + r3
                r7 = r0[r6]
                r8 = r6 ^ 1
                r8 = r0[r8]
                y.c.q(r7, r8)
                int r9 = r7.hashCode()
                int r9 = ah.v.q0(r9)
            L_0x00d3:
                r9 = r9 & r2
                short r10 = r4[r9]
                r11 = 65535(0xffff, float:9.1834E-41)
                r10 = r10 & r11
                if (r10 != r11) goto L_0x00e2
                short r6 = (short) r6
                r4[r9] = r6
                int r5 = r5 + 1
                goto L_0x00bd
            L_0x00e2:
                r11 = r0[r10]
                boolean r11 = r11.equals(r7)
                if (r11 != 0) goto L_0x00ed
                int r9 = r9 + 1
                goto L_0x00d3
            L_0x00ed:
                java.lang.IllegalArgumentException r0 = v6.h.d(r7, r8, r0, r10)
                throw r0
            L_0x00f2:
                int[] r4 = new int[r5]
                java.util.Arrays.fill(r4, r6)
                r5 = r3
            L_0x00f8:
                if (r5 >= r1) goto L_0x00af
                int r7 = r5 * 2
                int r7 = r7 + r3
                r8 = r0[r7]
                r9 = r7 ^ 1
                r9 = r0[r9]
                y.c.q(r8, r9)
                int r10 = r8.hashCode()
                int r10 = ah.v.q0(r10)
            L_0x010e:
                r10 = r10 & r2
                r11 = r4[r10]
                if (r11 != r6) goto L_0x0118
                r4[r10] = r7
                int r5 = r5 + 1
                goto L_0x00f8
            L_0x0118:
                r12 = r0[r11]
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto L_0x0123
                int r10 = r10 + 1
                goto L_0x010e
            L_0x0123:
                java.lang.IllegalArgumentException r0 = v6.h.d(r8, r9, r0, r11)
                throw r0
            L_0x0128:
                v6.h r3 = new v6.h
                r3.<init>(r2, r0, r1)
                r0 = r3
            L_0x012e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.g.i.a():java.util.Map");
        }
    }

    public g(m9.a aVar) {
        this.f5047a = aVar;
        this.f5049c = o9.a.a(new C0083g(this, 0));
        this.f5050d = o9.a.a(new C0083g(this, 1));
        this.f5051e = o9.a.a(new C0083g(this, 2));
        this.f5052f = o9.a.a(new C0083g(this, 4));
        this.g = o9.a.a(new C0083g(this, 3));
    }

    public static db.b c(g gVar) {
        return new db.b(new db.g(new c3.k(), gVar.d(), m9.b.a()), new c3.k());
    }

    public final void a(CashApp cashApp) {
        cashApp.f6688b = this.f5049c.get();
    }

    public final k9.b b() {
        return new c(this.f5048b);
    }

    public final qa.g d() {
        return new qa.g(m9.b.b(this.f5047a));
    }
}
