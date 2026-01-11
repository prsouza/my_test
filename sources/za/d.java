package za;

import ah.v;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.j0;
import bb.e;
import c3.k;
import cb.c;
import g2.b;
import ge.o0;
import hb.a;
import io.nodle.cash.ui.service.NodleService;
import io.nodle.sdk.INodle;
import io.nodle.sdk.android.Nodle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import ri.a;
import u1.c;
import u1.f;
import u1.g;
import u1.u;
import u1.w;
import v1.j;
import yd.t;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f14195a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final j0<Long> f14196b = new j0<>(0L);

    /* renamed from: c  reason: collision with root package name */
    public static final j0<Long> f14197c = new j0<>(0L);

    /* renamed from: d  reason: collision with root package name */
    public static final j0<Long> f14198d = new j0<>(0L);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<String> f14199e = new ConcurrentLinkedQueue<>();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14200a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.LUDICROUS.ordinal()] = 1;
            iArr[e.EXPERT.ordinal()] = 2;
            f14200a = iArr;
        }
    }

    public final void a(Context context) {
        g gVar;
        e6.e.D(context, "cxt");
        b(context);
        ri.a.f10801a.a("restart", new Object[0]);
        c.b(context);
        a.C0097a aVar = hb.a.f5902s;
        if (hb.a.f5904u) {
            NodleService.a aVar2 = NodleService.f6698a;
            Context applicationContext = context.getApplicationContext();
            e6.e.C(applicationContext, "cxt.applicationContext");
            aVar2.a(applicationContext);
            return;
        }
        if (a.f14200a[ad.c.K(context).ordinal()] == 1) {
            NodleService.a aVar3 = NodleService.f6698a;
            Context applicationContext2 = context.getApplicationContext();
            e6.e.C(applicationContext2, "cxt.applicationContext");
            aVar3.a(applicationContext2);
            return;
        }
        Context applicationContext3 = context.getApplicationContext();
        e6.e.C(applicationContext3, "cxt.applicationContext");
        u1.c cVar = new u1.c(new c.a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u.a aVar4 = new u.a();
        aVar4.f11660b.f4300j = cVar;
        w a10 = aVar4.a();
        e6.e.C(a10, "PeriodicWorkRequestBuild…                 .build()");
        u uVar = (u) a10;
        j s22 = j.s2(applicationContext3);
        f fVar = f.REPLACE;
        Objects.requireNonNull(s22);
        if (fVar == f.KEEP) {
            gVar = g.KEEP;
        } else {
            gVar = g.REPLACE;
        }
        new v1.f(s22, "NODLE_SCAN", gVar, Collections.singletonList(uVar), (List<v1.f>) null).r2();
    }

    public final void b(Context context) {
        e6.e.D(context, "cxt");
        a.C0210a aVar = ri.a.f10801a;
        aVar.a("shutdown", new Object[0]);
        e6.e.C(context.getApplicationContext(), "cxt.applicationContext");
        aVar.a("stop", new Object[0]);
        Nodle.Nodle().stop();
        Context applicationContext = context.getApplicationContext();
        e6.e.C(applicationContext, "cxt.applicationContext");
        j s22 = j.s2(applicationContext);
        Objects.requireNonNull(s22);
        ((b) s22.f12153y).a(new e2.b(s22, "NODLE_SCAN", true));
        NodleService.a aVar2 = NodleService.f6698a;
        Context applicationContext2 = context.getApplicationContext();
        e6.e.C(applicationContext2, "cxt.applicationContext");
        applicationContext2.stopService(new Intent(applicationContext2, NodleService.class));
    }

    public final boolean c(Context context) {
        float f10;
        cb.c.b(context);
        a.C0210a aVar = ri.a.f10801a;
        a.C0097a aVar2 = hb.a.f5902s;
        boolean z = hb.a.f5904u;
        aVar.a("start ... foreground:" + z, new Object[0]);
        Context applicationContext = context.getApplicationContext();
        e6.e.C(applicationContext, "cxt.applicationContext");
        String J = v.J(applicationContext, qa.e.NODLE_SDK_DEVKEY);
        if (!(J.length() == 0)) {
            Context applicationContext2 = context.getApplicationContext();
            e6.e.C(applicationContext2, "cxt.applicationContext");
            if (ad.c.Q(applicationContext2)) {
                Context applicationContext3 = context.getApplicationContext();
                e6.e.C(applicationContext3, "cxt.applicationContext");
                boolean z10 = Integer.parseInt(v.J(applicationContext3, qa.e.WIFI_ONLY)) == 1001;
                INodle Nodle = Nodle.Nodle();
                Context applicationContext4 = context.getApplicationContext();
                e6.e.C(applicationContext4, "cxt.applicationContext");
                if (hb.a.f5904u) {
                    f10 = 0.1f;
                } else {
                    int i = a.f14200a[ad.c.K(applicationContext4).ordinal()];
                    f10 = i != 1 ? i != 2 ? 1.0f : 0.6f : 0.3f;
                }
                Nodle.config("ble.scan.interval-x-factor", Float.valueOf(f10));
                Nodle.Nodle().config("dtn.use-cellular", Boolean.valueOf(!z10));
                aVar.a("STARTING NODLE ...", new Object[0]);
                Context applicationContext5 = context.getApplicationContext();
                e6.e.C(applicationContext5, "cxt.applicationContext");
                String J2 = v.J(applicationContext5, qa.e.PARTNER);
                ArrayList arrayList = new ArrayList();
                arrayList.add("v3.0.59");
                if (J2.length() > 0) {
                    arrayList.add(J2);
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                String[] strArr = (String[]) array;
                if (!(strArr.length == 0)) {
                    Nodle.Nodle().start(J, (String[]) Arrays.copyOf(strArr, strArr.length));
                } else {
                    Nodle.Nodle().start(J, new String[0]);
                }
                qa.e eVar = qa.e.PACKET_COUNT;
                aVar.a(android.support.v4.media.a.d("Pref Packet Count: ", Long.parseLong(v.J(context, eVar))), new Object[0]);
                t tVar = new t();
                long parseLong = Long.parseLong(v.J(context, eVar));
                tVar.f13621a = parseLong;
                t tVar2 = new t();
                tVar2.f13621a = parseLong;
                t tVar3 = new t();
                tVar3.f13621a = tVar.f13621a;
                f14196b.k(Long.valueOf(tVar.f13621a));
                f14197c.k(0L);
                f14198d.k(0L);
                ge.g.b(k.j(o0.f5433a), (pd.f) null, new e(tVar, context, tVar2, tVar3, (pd.d<? super e>) null), 3);
                return true;
            }
        }
        aVar.b("ERROR: Could not start nodle.", new Object[0]);
        return false;
    }
}
