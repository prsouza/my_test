package io.nodle.cash.ui.viewmodel;

import ab.j;
import ah.v;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import c3.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ge.d0;
import ge.g;
import ge.o0;
import ge.v1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import je.h;
import l6.b1;
import md.m;
import rd.i;
import ua.e;
import x8.q0;
import xd.p;

public final class HomeViewModelV2 extends androidx.lifecycle.b implements z {
    public final j0<List<sa.b>> A;
    public final j0<List<sa.b>> B;
    public final j0<String> C;
    public final j0<String> D;
    public final j0<Boolean> E;
    public final j0<Boolean> F;
    public final j0<a> G;
    public final LiveData<Integer> H;
    public final LiveData<String> I;
    public LiveData<List<sa.b>> J;
    public LiveData<List<sa.b>> K;
    public final LiveData<String> L;
    public final LiveData<String> M;
    public final LiveData<Boolean> N;
    public final LiveData<a> O;
    public final h<Boolean> P;
    public String Q;
    public v1 R;

    /* renamed from: s  reason: collision with root package name */
    public final Context f6765s;

    /* renamed from: t  reason: collision with root package name */
    public final ya.b f6766t;

    /* renamed from: u  reason: collision with root package name */
    public final String f6767u = "HomeViewModelV2";

    /* renamed from: v  reason: collision with root package name */
    public final int f6768v = 3;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6769w;

    /* renamed from: x  reason: collision with root package name */
    public final ua.f f6770x;

    /* renamed from: y  reason: collision with root package name */
    public final String f6771y;
    public final j0<String> z;

    public enum a {
        NONE,
        GOTO_MAP,
        GOTO_STATS,
        GOTO_NOTIFICATION,
        GOTO_SETTINGS,
        GOTO_PAY,
        GOTO_RECEIVE,
        DISMISS_RECEIVE,
        SHARE_PK,
        SHOW_REWARDS,
        SHOW_TRANSFERS,
        INIT_SHEET_ACTION,
        GOTO_BROWSER,
        SHOW_APP_REVIEW,
        DISMISS_NOTICE,
        GOTO_ESTIMATION
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6772a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6773b;

        static {
            int[] iArr = new int[ab.a.values().length];
            iArr[ab.a.LOCATION_PERMISSION.ordinal()] = 1;
            iArr[ab.a.BLUETOOTH_PERMISSION.ordinal()] = 2;
            iArr[ab.a.ENABLE_LOCATION.ordinal()] = 3;
            iArr[ab.a.ENABLE_BLUETOOTH.ordinal()] = 4;
            iArr[ab.a.NONE.ordinal()] = 5;
            f6772a = iArr;
            int[] iArr2 = new int[j.values().length];
            iArr2[j.LOCATION_PERMISSION.ordinal()] = 1;
            iArr2[j.BLUETOOTH_PERMISSION.ordinal()] = 2;
            iArr2[j.ENABLE_LOCATION.ordinal()] = 3;
            iArr2[j.ENABLE_BLUETOOTH.ordinal()] = 4;
            f6773b = iArr2;
        }
    }

    @rd.e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$dismissAnnounceNotice$1", f = "HomeViewModelV2.kt", l = {491}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6774a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModelV2 f6775b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(HomeViewModelV2 homeViewModelV2, pd.d<? super c> dVar) {
            super(2, dVar);
            this.f6775b = homeViewModelV2;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new c(this.f6775b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6774a;
            if (i == 0) {
                b1.w(obj);
                this.f6774a = 1;
                if (k.f0(2000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HomeViewModelV2.i(this.f6775b);
            return m.f8555a;
        }
    }

    @rd.e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$loadHistorySummary$1", f = "HomeViewModelV2.kt", l = {183, 184}, m = "invokeSuspend")
    public static final class d extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6776a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ HomeViewModelV2 f6777b;

        public static final class a<T> implements je.f {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ HomeViewModelV2 f6778a;

            public a(HomeViewModelV2 homeViewModelV2) {
                this.f6778a = homeViewModelV2;
            }

            public final Object a(Object obj, pd.d dVar) {
                ua.e eVar = (ua.e) obj;
                if (eVar instanceof e.b) {
                    HomeViewModelV2 homeViewModelV2 = this.f6778a;
                    g.b(jc.b.y(homeViewModelV2), (pd.f) null, new tb.g(homeViewModelV2, (pd.d<? super tb.g>) null), 3);
                    HomeViewModelV2 homeViewModelV22 = this.f6778a;
                    List d10 = homeViewModelV22.A.d();
                    if (d10 != null && (!d10.isEmpty())) {
                        Context context = homeViewModelV22.f6765s;
                        qa.e eVar2 = qa.e.LAST_REWARD_TIMESTAMP;
                        long parseLong = Long.parseLong(v.J(context, eVar2));
                        if (((sa.b) d10.get(0)).f11045y > parseLong) {
                            String str = homeViewModelV22.f6767u;
                            long j10 = ((sa.b) d10.get(0)).f11045y;
                            Log.d(str, "checkForNewRewards: RESET : Latest " + j10 + "  Prev " + parseLong);
                            ab.f.f215a.k((String) null);
                            v.f0(homeViewModelV22.f6765s, qa.e.REWARDS_PENDING_DEVICE_COUNT, 0L);
                            v.f0(homeViewModelV22.f6765s, eVar2, Long.valueOf(((sa.b) d10.get(0)).f11045y));
                        }
                    }
                } else if (eVar instanceof e.a) {
                    this.f6778a.F.j(Boolean.valueOf(((e.a) eVar).f11773c));
                }
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(HomeViewModelV2 homeViewModelV2, pd.d<? super d> dVar) {
            super(2, dVar);
            this.f6777b = homeViewModelV2;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new d(this.f6777b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6776a;
            if (i == 0) {
                b1.w(obj);
                HomeViewModelV2 homeViewModelV2 = this.f6777b;
                ua.f fVar = homeViewModelV2.f6770x;
                String str = homeViewModelV2.f6771y;
                this.f6776a = 1;
                Objects.requireNonNull(fVar);
                obj = g.d(o0.f5434b, new ua.g(fVar, str, 101, (pd.d<? super ua.g>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else if (i == 2) {
                b1.w(obj);
                return m.f8555a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a aVar2 = new a(this.f6777b);
            this.f6776a = 2;
            if (((je.e) obj).b(aVar2, this) == aVar) {
                return aVar;
            }
            return m.f8555a;
        }
    }

    @rd.e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$onCreate$1", f = "HomeViewModelV2.kt", l = {}, m = "invokeSuspend")
    public static final class e extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ HomeViewModelV2 f6779a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(HomeViewModelV2 homeViewModelV2, pd.d<? super e> dVar) {
            super(2, dVar);
            this.f6779a = homeViewModelV2;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new e(this.f6779a, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((e) create((d0) obj, (pd.d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            b1.w(obj);
            HomeViewModelV2 homeViewModelV2 = this.f6779a;
            homeViewModelV2.E.f(new q0(homeViewModelV2, 3));
            return m.f8555a;
        }
    }

    @rd.e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$onResume$1", f = "HomeViewModelV2.kt", l = {126, 127, 129}, m = "invokeSuspend")
    public static final class f extends i implements p<d0, pd.d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public j0 f6780a;

        /* renamed from: b  reason: collision with root package name */
        public int f6781b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ HomeViewModelV2 f6782c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(HomeViewModelV2 homeViewModelV2, pd.d<? super f> dVar) {
            super(2, dVar);
            this.f6782c = homeViewModelV2;
        }

        public final pd.d<m> create(Object obj, pd.d<?> dVar) {
            return new f(this.f6782c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((f) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                qd.a r0 = qd.a.COROUTINE_SUSPENDED
                int r1 = r7.f6781b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0027
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                l6.b1.w(r8)
                goto L_0x0079
            L_0x0013:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001b:
                androidx.lifecycle.j0 r1 = r7.f6780a
                l6.b1.w(r8)
                goto L_0x0059
            L_0x0021:
                androidx.lifecycle.j0 r1 = r7.f6780a
                l6.b1.w(r8)
                goto L_0x0040
            L_0x0027:
                l6.b1.w(r8)
                io.nodle.cash.ui.viewmodel.HomeViewModelV2 r8 = r7.f6782c
                androidx.lifecycle.j0<java.util.List<sa.b>> r1 = r8.A
                ua.f r5 = r8.f6770x
                bb.g r6 = bb.g.REWARD
                int r8 = r8.f6768v
                int r8 = r8 + r4
                r7.f6780a = r1
                r7.f6781b = r4
                java.lang.Object r8 = r5.c(r6, r8, r7)
                if (r8 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r1.j(r8)
                io.nodle.cash.ui.viewmodel.HomeViewModelV2 r8 = r7.f6782c
                androidx.lifecycle.j0<java.util.List<sa.b>> r1 = r8.B
                ua.f r5 = r8.f6770x
                bb.g r6 = bb.g.TRANSFER
                int r8 = r8.f6768v
                int r8 = r8 + r4
                r7.f6780a = r1
                r7.f6781b = r3
                java.lang.Object r8 = r5.c(r6, r8, r7)
                if (r8 != r0) goto L_0x0059
                return r0
            L_0x0059:
                r1.j(r8)
                io.nodle.cash.ui.viewmodel.HomeViewModelV2 r8 = r7.f6782c
                r1 = 0
                r7.f6780a = r1
                r7.f6781b = r2
                java.util.Objects.requireNonNull(r8)
                me.c r2 = ge.o0.f5433a
                tb.i r3 = new tb.i
                r3.<init>(r8, r1)
                java.lang.Object r8 = ge.g.d(r2, r3, r7)
                if (r8 != r0) goto L_0x0074
                goto L_0x0076
            L_0x0074:
                md.m r8 = md.m.f8555a
            L_0x0076:
                if (r8 != r0) goto L_0x0079
                return r0
            L_0x0079:
                md.m r8 = md.m.f8555a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.HomeViewModelV2.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HomeViewModelV2(android.content.Context r9, ya.b r10) {
        /*
            r8 = this;
            java.lang.String r0 = "analytics"
            e6.e.D(r10, r0)
            r0 = r9
            android.app.Application r0 = (android.app.Application) r0
            r8.<init>(r0)
            r8.f6765s = r9
            r8.f6766t = r10
            java.lang.String r10 = "HomeViewModelV2"
            r8.f6767u = r10
            r10 = 3
            r8.f6768v = r10
            ua.f r10 = new ua.f
            c3.k r1 = new c3.k
            r1.<init>()
            db.b r2 = new db.b
            db.g r3 = new db.g
            qa.g r4 = new qa.g
            r4.<init>(r9)
            com.google.gson.Gson r5 = new com.google.gson.Gson
            r5.<init>()
            r3.<init>(r1, r4, r5)
            r2.<init>(r3, r1)
            r10.<init>(r9, r2)
            r8.f6770x = r10
            io.nodle.cash.data.local.CashDatabase$a r10 = io.nodle.cash.data.local.CashDatabase.f6682n
            io.nodle.cash.data.local.CashDatabase r10 = r10.a(r0)
            r10.r()
            qa.e r10 = qa.e.NODLE_PUBLIC_KEY_4
            java.lang.String r10 = ah.v.J(r9, r10)
            r8.f6771y = r10
            qa.e r10 = qa.e.NODLE_PUBLIC_KEY_5
            ah.v.J(r9, r10)
            androidx.lifecycle.j0 r9 = new androidx.lifecycle.j0
            java.lang.String r10 = "0.00"
            r9.<init>(r10)
            r8.z = r9
            androidx.lifecycle.j0 r10 = new androidx.lifecycle.j0
            nd.o r0 = nd.o.f8966a
            r10.<init>(r0)
            r8.A = r10
            androidx.lifecycle.j0 r1 = new androidx.lifecycle.j0
            r1.<init>(r0)
            r8.B = r1
            androidx.lifecycle.j0 r0 = new androidx.lifecycle.j0
            r2 = 0
            r0.<init>(r2)
            r8.C = r0
            androidx.lifecycle.j0 r3 = new androidx.lifecycle.j0
            r3.<init>(r2)
            r8.D = r3
            androidx.lifecycle.j0 r2 = new androidx.lifecycle.j0
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.<init>(r4)
            r8.E = r2
            androidx.lifecycle.j0 r2 = new androidx.lifecycle.j0
            r2.<init>(r4)
            r8.F = r2
            androidx.lifecycle.j0 r4 = new androidx.lifecycle.j0
            io.nodle.cash.ui.viewmodel.HomeViewModelV2$a r5 = io.nodle.cash.ui.viewmodel.HomeViewModelV2.a.NONE
            r4.<init>(r5)
            r8.G = r4
            androidx.lifecycle.j0 r5 = new androidx.lifecycle.j0
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.<init>(r7)
            r8.H = r5
            r8.I = r9
            r8.J = r10
            r8.K = r1
            r8.L = r0
            r8.M = r3
            r8.N = r2
            r8.O = r4
            r9 = 7
            je.h r9 = ge.g0.h(r6, r9)
            je.l r9 = (je.l) r9
            r8.P = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.HomeViewModelV2.<init>(android.content.Context, ya.b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean i(io.nodle.cash.ui.viewmodel.HomeViewModelV2 r14) {
        /*
            java.lang.String r0 = r14.f6767u
            java.lang.String r1 = "showAnnouncements"
            android.util.Log.d(r0, r1)
            android.content.Context r0 = r14.f6765s
            java.lang.String r1 = "cxt"
            e6.e.D(r0, r1)
            qa.e r1 = qa.e.ANNOUNCEMENTS_SEEN
            java.lang.String r1 = ah.v.J(r0, r1)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.lang.String r3 = "announcements_list"
            java.lang.String r3 = ah.v.K(r3)
            r2.<init>(r3)
            int r3 = r2.length()
            r4 = 0
            r5 = r4
        L_0x0025:
            r6 = 1
            r7 = 0
            if (r5 >= r3) goto L_0x0152
            org.json.JSONObject r8 = r2.getJSONObject(r5)
            java.lang.String r9 = "b"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "ANNOUNCEMENT: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r9, r10)
            java.lang.String r9 = "androidVersions"
            org.json.JSONObject r10 = r8.optJSONObject(r9)
            if (r10 == 0) goto L_0x0052
            java.lang.String r11 = "target"
            java.lang.String r10 = r10.optString(r11)
            goto L_0x0053
        L_0x0052:
            r10 = r7
        L_0x0053:
            org.json.JSONObject r9 = r8.optJSONObject(r9)
            if (r9 == 0) goto L_0x0064
            java.lang.String r11 = "range"
            int r9 = r9.optInt(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0065
        L_0x0064:
            r9 = r7
        L_0x0065:
            if (r10 == 0) goto L_0x0070
            int r11 = r10.length()
            if (r11 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r11 = r4
            goto L_0x0071
        L_0x0070:
            r11 = r6
        L_0x0071:
            r12 = 2
            if (r11 == 0) goto L_0x0075
            goto L_0x00d0
        L_0x0075:
            java.lang.String r11 = "versionName"
            e6.e.D(r10, r11)
            java.lang.String r11 = "."
            java.lang.String[] r11 = new java.lang.String[]{r11}
            java.util.List r10 = fe.o.y1(r10, r11)
            java.lang.Object r11 = r10.get(r4)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = java.lang.Integer.parseInt(r11)
            int r11 = r11 * 10000
            java.lang.Object r13 = r10.get(r6)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = java.lang.Integer.parseInt(r13)
            int r13 = r13 * 100
            java.lang.Object r10 = r10.get(r12)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = java.lang.Integer.parseInt(r10)
            int r11 = r11 + r13
            int r11 = r11 + r10
            r10 = -1
            r12 = 30059(0x756b, float:4.2122E-41)
            if (r9 != 0) goto L_0x00ae
            goto L_0x00b7
        L_0x00ae:
            int r13 = r9.intValue()
            if (r13 != r10) goto L_0x00b7
            if (r12 >= r11) goto L_0x00d0
            goto L_0x00ce
        L_0x00b7:
            if (r9 != 0) goto L_0x00ba
            goto L_0x00c3
        L_0x00ba:
            int r10 = r9.intValue()
            if (r10 != 0) goto L_0x00c3
            if (r12 != r11) goto L_0x00d0
            goto L_0x00ce
        L_0x00c3:
            if (r9 != 0) goto L_0x00c6
            goto L_0x00d0
        L_0x00c6:
            int r9 = r9.intValue()
            if (r9 != r6) goto L_0x00d0
            if (r12 < r11) goto L_0x00d0
        L_0x00ce:
            r9 = r6
            goto L_0x00d1
        L_0x00d0:
            r9 = r4
        L_0x00d1:
            java.lang.String r10 = "description"
            java.lang.String r11 = "title"
            if (r9 != 0) goto L_0x00e4
            java.lang.String r6 = r8.optString(r11)
            java.lang.String r7 = r8.optString(r10)
            a.b.q0(r0, r6, r7)
            goto L_0x014e
        L_0x00e4:
            java.lang.String r9 = r8.optString(r11)
            java.lang.String r12 = r8.optString(r10)
            java.lang.String r9 = a.b.Y(r9, r12)
            int r12 = r9.length()
            if (r12 <= 0) goto L_0x00f8
            r12 = r6
            goto L_0x00f9
        L_0x00f8:
            r12 = r4
        L_0x00f9:
            if (r12 == 0) goto L_0x014e
            boolean r9 = fe.o.g1(r1, r9)
            if (r9 != 0) goto L_0x014e
            ab.i r1 = new ab.i
            r1.<init>()
            java.lang.String r2 = r8.optString(r11)
            r1.f272a = r2
            java.lang.String r2 = r8.optString(r10)
            r1.f273b = r2
            java.lang.String r2 = "imageUrl"
            java.lang.String r2 = r8.optString(r2, r7)
            r1.g = r2
            java.lang.String r2 = "link"
            java.lang.String r2 = r8.optString(r2, r7)
            r1.f278h = r2
            r2 = 2131755042(0x7f100022, float:1.9140952E38)
            java.lang.String r2 = r0.getString(r2)
            r1.f274c = r2
            java.lang.String r2 = r1.f278h
            if (r2 == 0) goto L_0x0138
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r2 = r4
            goto L_0x0139
        L_0x0138:
            r2 = r6
        L_0x0139:
            if (r2 != 0) goto L_0x0144
            r2 = 2131755044(0x7f100024, float:1.9140956E38)
            java.lang.String r0 = r0.getString(r2)
            r1.f276e = r0
        L_0x0144:
            r0 = 2131427470(0x7f0b008e, float:1.8476557E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.i = r0
            goto L_0x0153
        L_0x014e:
            int r5 = r5 + 1
            goto L_0x0025
        L_0x0152:
            r1 = r7
        L_0x0153:
            if (r1 == 0) goto L_0x0163
            ge.d0 r14 = jc.b.y(r14)
            tb.l r0 = new tb.l
            r0.<init>(r1, r7)
            r1 = 3
            ge.g.b(r14, r7, r0, r1)
            r4 = r6
        L_0x0163:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.HomeViewModelV2.i(io.nodle.cash.ui.viewmodel.HomeViewModelV2):boolean");
    }

    public static final void j(HomeViewModelV2 homeViewModelV2, BigInteger bigInteger) {
        j0<String> j0Var = homeViewModelV2.z;
        DecimalFormat decimalFormat = new DecimalFormat("0");
        decimalFormat.setMaximumFractionDigits(11);
        decimalFormat.setMinimumFractionDigits(2);
        BigDecimal divide = new BigDecimal(bigInteger).divide(BigDecimal.TEN.pow(11));
        e6.e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
        String format = decimalFormat.format(divide);
        if (format == null) {
            format = "0.00";
        }
        j0Var.j(format);
    }

    @l0(r.b.ON_CREATE)
    private final void onCreate() {
        Log.d(this.f6767u, "onCreate");
        m(a.GOTO_MAP);
        g.b(jc.b.y(this), (pd.f) null, new e(this, (pd.d<? super e>) null), 3);
    }

    @l0(r.b.ON_PAUSE)
    private final void onPause() {
        this.f6769w = false;
    }

    @l0(r.b.ON_RESUME)
    private final void onResume() {
        this.f6769w = true;
        g.b(jc.b.y(this), (pd.f) null, new tb.j(this, (pd.d<? super tb.j>) null), 3);
        g.b(jc.b.y(this), (pd.f) null, new f(this, (pd.d<? super f>) null), 3);
    }

    public final void k() {
        v1 v1Var;
        v1 v1Var2 = this.R;
        boolean z10 = true;
        if (v1Var2 == null || !v1Var2.a()) {
            z10 = false;
        }
        if (z10 && (v1Var = this.R) != null) {
            v1Var.c((CancellationException) null);
        }
        this.F.j(Boolean.FALSE);
    }

    public final void l() {
        Context context = this.f6765s;
        ab.k kVar = ab.k.f279a;
        ab.i iVar = ab.k.f282d;
        a.b.q0(context, iVar != null ? iVar.f272a : null, iVar != null ? iVar.f273b : null);
        m(a.DISMISS_NOTICE);
        g.b(jc.b.y(this), (pd.f) null, new c(this, (pd.d<? super c>) null), 3);
    }

    public final void m(a aVar) {
        e6.e.D(aVar, "action");
        String str = this.f6767u;
        Log.d(str, "ViewModel Action: " + aVar);
        this.G.j(aVar);
    }

    public final void n() {
        k();
        g.b(jc.b.y(this), (pd.f) null, new tb.g(this, (pd.d<? super tb.g>) null), 3);
        this.R = (v1) g.b(jc.b.y(this), (pd.f) null, new d(this, (pd.d<? super d>) null), 3);
    }

    public final void o(View view) {
        e6.e.D(view, "view");
        ViewParent parent = view.getParent().getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        BottomSheetBehavior x10 = BottomSheetBehavior.x(view2);
        e6.e.C(x10, "from(parent)");
        if (x10.J != 3) {
            x10.E(3);
            return;
        }
        x10.E(4);
        view2.postDelayed(new androidx.emoji2.text.k(view2, 3), 100);
    }
}
