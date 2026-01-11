package io.nodle.cash.ui.view.activity;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import e6.e;
import hb.f;
import io.nodle.cash.ui.viewmodel.LauncherViewModel;
import java.util.LinkedHashMap;
import yd.h;
import yd.v;

public final class LauncherActivity extends f {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public final v0 f6714y = new v0(v.a(LauncherViewModel.class), new b(this), new a(this));
    public ya.b z;

    public static final class a extends h implements xd.a<w0.b> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6715b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f6715b = componentActivity;
        }

        public final Object c() {
            return this.f6715b.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends h implements xd.a<x0> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f6716b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f6716b = componentActivity;
        }

        public final Object c() {
            x0 viewModelStore = this.f6716b.getViewModelStore();
            e.C(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    public LauncherActivity() {
        new LinkedHashMap();
    }

    public final LauncherViewModel k() {
        return (LauncherViewModel) this.f6714y.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0272, code lost:
        if ((r2.length() == 0) == true) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            cb.c.b(r11)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "intent"
            e6.e.C(r12, r0)
            java.lang.String r12 = r12.getAction()
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x009b
            int r2 = r12.hashCode()
            r3 = -889270726(0xffffffffcafece3a, float:-8349469.0)
            if (r2 == r3) goto L_0x0022
            goto L_0x009b
        L_0x0022:
            java.lang.String r2 = "io.nodle.cash.ACTION_GET_PUBLIC_KEY"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x009b
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r2 = "from"
            java.lang.String r12 = r12.getStringExtra(r2)
            if (r12 != 0) goto L_0x0038
            java.lang.String r12 = ""
        L_0x0038:
            io.nodle.cash.ui.viewmodel.LauncherViewModel r2 = r11.k()
            java.lang.String r2 = r2.f6793u
            if (r2 == 0) goto L_0x0049
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r2 = r1
            goto L_0x004a
        L_0x0049:
            r2 = r0
        L_0x004a:
            if (r2 == 0) goto L_0x0063
            android.content.Context r2 = r11.getApplicationContext()
            r3 = 2131755369(0x7f100169, float:1.9141615E38)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r12
            java.lang.String r12 = r11.getString(r3, r4)
            android.widget.Toast r12 = android.widget.Toast.makeText(r2, r12, r0)
            r12.show()
            goto L_0x009b
        L_0x0063:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r11)
            r3 = 2131755367(0x7f100167, float:1.9141611E38)
            r2.setTitle(r3)
            r3 = 2131755368(0x7f100168, float:1.9141613E38)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r12
            io.nodle.cash.ui.viewmodel.LauncherViewModel r12 = r11.k()
            java.lang.String r12 = r12.f6793u
            r4[r0] = r12
            java.lang.String r12 = r11.getString(r3, r4)
            r2.setMessage(r12)
            r12 = 2131755500(0x7f1001ec, float:1.9141881E38)
            hb.j r3 = new hb.j
            r3.<init>(r11)
            r2.setPositiveButton(r12, r3)
            r12 = 2131755306(0x7f10012a, float:1.9141488E38)
            hb.k r3 = hb.k.f5922a
            r2.setNegativeButton(r12, r3)
            r2.show()
        L_0x009b:
            androidx.lifecycle.v r12 = jc.b.u(r11)
            hb.l r2 = new hb.l
            r3 = 0
            r2.<init>(r11, r3)
            r4 = 3
            ge.g.b(r12, r3, r2, r4)
            io.nodle.cash.ui.viewmodel.LauncherViewModel r12 = r11.k()
            android.content.SharedPreferences r2 = ah.v.Q(r11)
            k1.a r2 = (k1.a) r2
            android.content.SharedPreferences$Editor r2 = r2.edit()
            k1.a$b r2 = (k1.a.b) r2
            r2.apply()
            qa.f r2 = r12.f6790c
            qa.e r5 = qa.e.LAUNCH_COUNT
            long r6 = r2.b(r5)
            r8 = 1
            long r6 = r6 + r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.a(r5, r6)
            ya.b r2 = r12.f6791s
            r2.c()
            ya.b r2 = r12.f6791s
            ya.f$a r5 = new ya.f$a
            ya.g r6 = ya.g.APP_STARTED
            r5.<init>(r6, r3)
            r2.b(r5)
            r2 = 2131755349(0x7f100155, float:1.9141575E38)
            java.lang.String r2 = r11.getString(r2)
            if (r2 == 0) goto L_0x010a
            qa.f r5 = r12.f6790c
            qa.e r6 = qa.e.PARTNER
            java.lang.String r5 = r5.c(r6)
            java.lang.Object r7 = r6.m16default()
            boolean r5 = e6.e.r(r5, r7)
            if (r5 == 0) goto L_0x010a
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x0102
            r5 = r0
            goto L_0x0103
        L_0x0102:
            r5 = r1
        L_0x0103:
            if (r5 == 0) goto L_0x010a
            qa.f r5 = r12.f6790c
            r5.a(r6, r2)
        L_0x010a:
            qa.f r2 = r12.f6790c
            qa.e r5 = qa.e.PARTNER
            java.lang.String r2 = r2.c(r5)
            if (r2 == 0) goto L_0x0120
            ya.b r5 = r12.f6791s
            ya.h r6 = new ya.h
            ya.i r7 = ya.i.PARTNER
            r6.<init>(r7, r2)
            r5.a(r6)
        L_0x0120:
            java.lang.String r2 = r12.f6794v
            if (r2 == 0) goto L_0x0131
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x012c
            r2 = r0
            goto L_0x012d
        L_0x012c:
            r2 = r1
        L_0x012d:
            if (r2 != r0) goto L_0x0131
            r2 = r0
            goto L_0x0132
        L_0x0131:
            r2 = r1
        L_0x0132:
            if (r2 == 0) goto L_0x0178
            t7.g r2 = t7.g.a()
            java.lang.String r5 = r12.f6794v
            x7.x r2 = r2.f11438a
            x7.q r2 = r2.g
            y7.k r2 = r2.f12962d
            java.util.Objects.requireNonNull(r2)
            r6 = 1024(0x400, float:1.435E-42)
            java.lang.String r5 = y7.b.a(r5, r6)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r6 = r2.f13530f
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r7 = r2.f13530f     // Catch:{ all -> 0x0175 }
            java.lang.Object r7 = r7.getReference()     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0175 }
            if (r5 != 0) goto L_0x015c
            if (r7 != 0) goto L_0x015a
            r7 = r0
            goto L_0x0160
        L_0x015a:
            r7 = r1
            goto L_0x0160
        L_0x015c:
            boolean r7 = r5.equals(r7)     // Catch:{ all -> 0x0175 }
        L_0x0160:
            if (r7 == 0) goto L_0x0164
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            goto L_0x0178
        L_0x0164:
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r7 = r2.f13530f     // Catch:{ all -> 0x0175 }
            r7.set(r5, r0)     // Catch:{ all -> 0x0175 }
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            x7.f r5 = r2.f13526b
            y7.i r6 = new y7.i
            r6.<init>(r2)
            r5.b(r6)
            goto L_0x0178
        L_0x0175:
            r12 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0175 }
            throw r12
        L_0x0178:
            b9.c r2 = b9.c.a()
            java.lang.String r5 = "getInstance()"
            e6.e.C(r2, r5)
            com.google.firebase.remoteconfig.internal.a r5 = r2.g
            com.google.firebase.remoteconfig.internal.b r6 = r5.f4240h
            android.content.SharedPreferences r6 = r6.f4246a
            long r7 = com.google.firebase.remoteconfig.internal.a.f4232j
            java.lang.String r9 = "minimum_fetch_interval_in_seconds"
            long r6 = r6.getLong(r9, r7)
            c9.e r8 = r5.f4239f
            com.google.android.gms.tasks.Task r8 = r8.b()
            java.util.concurrent.Executor r9 = r5.f4236c
            c9.g r10 = new c9.g
            r10.<init>(r5, r6)
            com.google.android.gms.tasks.Task r5 = r8.continueWithTask(r9, r10)
            android.support.v4.media.a r6 = android.support.v4.media.a.f727a
            com.google.android.gms.tasks.Task r5 = r5.onSuccessTask(r6)
            java.util.concurrent.Executor r6 = r2.f2914c
            h1.d0 r7 = new h1.d0
            r7.<init>(r2, r4)
            com.google.android.gms.tasks.Task r2 = r5.onSuccessTask(r6, r7)
            h1.b r4 = h1.b.f5657v
            r2.addOnCompleteListener((android.app.Activity) r11, r4)
            cb.c.b(r11)
            r2 = 2131755314(0x7f100132, float:1.9141504E38)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r4 = "context.getString(R.string.notification_topics)"
            e6.e.C(r2, r4)
            java.lang.String r4 = " "
            java.lang.String r5 = ""
            java.lang.String r2 = fe.k.b1(r2, r4, r5)
            java.lang.String r4 = ","
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.util.List r2 = fe.o.y1(r2, r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x01db:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x020d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.firebase.messaging.a r5 = com.google.firebase.messaging.FirebaseMessaging.f4202m
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r5 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r5)
            k7.d r6 = k7.d.c()     // Catch:{ all -> 0x020a }
            com.google.firebase.messaging.FirebaseMessaging r6 = com.google.firebase.messaging.FirebaseMessaging.getInstance(r6)     // Catch:{ all -> 0x020a }
            monitor-exit(r5)
            com.google.android.gms.tasks.Task<x8.m0> r5 = r6.f4211h
            x8.p r6 = new x8.p
            r6.<init>(r4)
            com.google.android.gms.tasks.Task r5 = r5.onSuccessTask(r6)
            h1.d0 r6 = new h1.d0
            r7 = 5
            r6.<init>(r4, r7)
            r5.addOnCompleteListener(r6)
            goto L_0x01db
        L_0x020a:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
        L_0x020d:
            ab.f r2 = ab.f.f215a
            r2.f()
            ne.c r4 = ab.f.f217c
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x021d
            r4.a(r3)
        L_0x021d:
            r2.o(r3, r0)
            r2.e()
            qa.f r2 = r12.f6790c
            qa.e r3 = qa.e.MNEMONIC
            java.lang.String r2 = r2.c(r3)
            java.lang.String r4 = r12.f6792t
            java.lang.String r5 = r12.f6793u
            java.lang.String r6 = "nodlePk4: "
            androidx.fragment.app.m.g(r6, r5, r4)
            java.lang.String r4 = r12.f6792t
            java.lang.String r5 = r12.f6794v
            java.lang.String r6 = "nodlePk5: "
            androidx.fragment.app.m.g(r6, r5, r4)
            java.lang.String r4 = r12.f6792t
            java.lang.String r5 = "mnemonics: "
            androidx.fragment.app.m.g(r5, r2, r4)
            java.lang.String r4 = r12.f6794v
            if (r4 == 0) goto L_0x0251
            int r4 = r4.length()
            if (r4 != 0) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r4 = r1
            goto L_0x0252
        L_0x0251:
            r4 = r0
        L_0x0252:
            java.lang.String r5 = "goto"
            if (r4 != 0) goto L_0x02bc
            if (r2 == 0) goto L_0x0261
            int r2 = r2.length()
            if (r2 != 0) goto L_0x025f
            goto L_0x0261
        L_0x025f:
            r2 = r1
            goto L_0x0262
        L_0x0261:
            r2 = r0
        L_0x0262:
            if (r2 == 0) goto L_0x0265
            goto L_0x02bc
        L_0x0265:
            java.lang.String r2 = r12.f6793u
            if (r2 == 0) goto L_0x0275
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0271
            r2 = r0
            goto L_0x0272
        L_0x0271:
            r2 = r1
        L_0x0272:
            if (r2 != r0) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r0 = r1
        L_0x0276:
            if (r0 == 0) goto L_0x029f
            qa.f r0 = r12.f6790c
            java.lang.String r0 = r0.c(r3)
            java.util.List r0 = ub.f.d(r0)
            za.h r1 = za.h.f14215a
            r2 = 37
            java.lang.String r0 = r1.g(r0, r2)
            r12.f6793u = r0
            java.lang.String r1 = r12.f6792t
            java.lang.String r2 = "Updated nodlePk4: "
            androidx.fragment.app.m.g(r2, r0, r1)
            qa.f r0 = r12.f6790c
            qa.e r1 = qa.e.NODLE_PUBLIC_KEY_4
            java.lang.String r2 = r12.f6793u
            e6.e.B(r2)
            r0.a(r1, r2)
        L_0x029f:
            je.o r0 = r12.f6795w
        L_0x02a1:
            java.lang.Object r12 = r0.getValue()
            r1 = r12
            gb.c r1 = (gb.c) r1
            gb.b r2 = gb.b.GOTO_HOME
            java.util.Objects.requireNonNull(r1)
            e6.e.D(r2, r5)
            gb.c r1 = new gb.c
            r1.<init>(r2)
            boolean r12 = r0.g(r12, r1)
            if (r12 == 0) goto L_0x02a1
            goto L_0x02d8
        L_0x02bc:
            je.o r12 = r12.f6795w
        L_0x02be:
            java.lang.Object r0 = r12.getValue()
            r1 = r0
            gb.c r1 = (gb.c) r1
            gb.b r2 = gb.b.GOTO_ONBOARDING
            java.util.Objects.requireNonNull(r1)
            e6.e.D(r2, r5)
            gb.c r1 = new gb.c
            r1.<init>(r2)
            boolean r0 = r12.g(r0, r1)
            if (r0 == 0) goto L_0x02be
        L_0x02d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.view.activity.LauncherActivity.onCreate(android.os.Bundle):void");
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
