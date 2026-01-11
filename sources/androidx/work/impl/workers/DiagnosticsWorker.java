package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import d2.g;
import d2.h;
import d2.i;
import d2.k;
import d2.l;
import d2.o;
import d2.q;
import d2.s;
import d2.t;
import d2.u;
import h1.g0;
import j1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import u1.c;
import u1.p;
import v1.j;

public class DiagnosticsWorker extends Worker {

    /* renamed from: v  reason: collision with root package name */
    public static final String f2750v = p.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    public static String i(k kVar, s sVar, h hVar, List<o> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        for (o next : list) {
            g a10 = ((i) hVar).a(next.f4293a);
            Integer num = null;
            if (a10 != null) {
                num = Integer.valueOf(a10.f4281b);
            }
            String str = next.f4293a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            g0 e10 = g0.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                e10.D(1);
            } else {
                e10.r(1, str);
            }
            lVar.f4287a.b();
            Cursor o4 = lVar.f4287a.o(e10);
            try {
                ArrayList arrayList = new ArrayList(o4.getCount());
                while (o4.moveToNext()) {
                    arrayList.add(o4.getString(0));
                }
                o4.close();
                e10.release();
                List<String> a11 = ((t) sVar).a(next.f4293a);
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{next.f4293a, next.f4295c, num, next.f4294b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", a11)}));
            } catch (Throwable th2) {
                o4.close();
                e10.release();
                throw th2;
            }
        }
        return sb2.toString();
    }

    public final ListenableWorker.a h() {
        g0 g0Var;
        ArrayList arrayList;
        h hVar;
        s sVar;
        k kVar;
        int i;
        WorkDatabase workDatabase = j.s2(this.f2624a).f12152x;
        d2.p w6 = workDatabase.w();
        k u10 = workDatabase.u();
        s x10 = workDatabase.x();
        h t10 = workDatabase.t();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        q qVar = (q) w6;
        Objects.requireNonNull(qVar);
        g0 e10 = g0.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        e10.X(1, currentTimeMillis);
        qVar.f4311a.b();
        Cursor o4 = qVar.f4311a.o(e10);
        try {
            int a10 = b.a(o4, "required_network_type");
            int a11 = b.a(o4, "requires_charging");
            int a12 = b.a(o4, "requires_device_idle");
            int a13 = b.a(o4, "requires_battery_not_low");
            int a14 = b.a(o4, "requires_storage_not_low");
            int a15 = b.a(o4, "trigger_content_update_delay");
            int a16 = b.a(o4, "trigger_max_content_delay");
            int a17 = b.a(o4, "content_uri_triggers");
            int a18 = b.a(o4, "id");
            int a19 = b.a(o4, "state");
            h hVar2 = t10;
            int a20 = b.a(o4, "worker_class_name");
            k kVar2 = u10;
            int a21 = b.a(o4, "input_merger_class_name");
            s sVar2 = x10;
            int a22 = b.a(o4, "input");
            q qVar2 = qVar;
            int a23 = b.a(o4, "output");
            g0Var = e10;
            try {
                int a24 = b.a(o4, "initial_delay");
                int a25 = b.a(o4, "interval_duration");
                int a26 = b.a(o4, "flex_duration");
                int a27 = b.a(o4, "run_attempt_count");
                int a28 = b.a(o4, "backoff_policy");
                int a29 = b.a(o4, "backoff_delay_duration");
                int a30 = b.a(o4, "period_start_time");
                int a31 = b.a(o4, "minimum_retention_duration");
                int a32 = b.a(o4, "schedule_requested_at");
                int a33 = b.a(o4, "run_in_foreground");
                int a34 = b.a(o4, "out_of_quota_policy");
                int i10 = a23;
                ArrayList arrayList2 = new ArrayList(o4.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!o4.moveToNext()) {
                        break;
                    }
                    String string = o4.getString(a18);
                    String string2 = o4.getString(a20);
                    int i11 = a20;
                    c cVar = new c();
                    int i12 = a10;
                    cVar.f11626a = u.c(o4.getInt(a10));
                    cVar.f11627b = o4.getInt(a11) != 0;
                    cVar.f11628c = o4.getInt(a12) != 0;
                    cVar.f11629d = o4.getInt(a13) != 0;
                    cVar.f11630e = o4.getInt(a14) != 0;
                    int i13 = a18;
                    int i14 = a11;
                    cVar.f11631f = o4.getLong(a15);
                    cVar.g = o4.getLong(a16);
                    cVar.f11632h = u.a(o4.getBlob(a17));
                    o oVar = new o(string, string2);
                    oVar.f4294b = u.e(o4.getInt(a19));
                    oVar.f4296d = o4.getString(a21);
                    oVar.f4297e = androidx.work.b.a(o4.getBlob(a22));
                    int i15 = i10;
                    oVar.f4298f = androidx.work.b.a(o4.getBlob(i15));
                    int i16 = a19;
                    i10 = i15;
                    int i17 = a24;
                    oVar.g = o4.getLong(i17);
                    int i18 = a21;
                    int i19 = a25;
                    oVar.f4299h = o4.getLong(i19);
                    int i20 = a22;
                    int i21 = a26;
                    oVar.i = o4.getLong(i21);
                    int i22 = a27;
                    oVar.f4301k = o4.getInt(i22);
                    int i23 = a28;
                    int i24 = i19;
                    oVar.f4302l = u.b(o4.getInt(i23));
                    a26 = i21;
                    int i25 = i22;
                    int i26 = a29;
                    oVar.f4303m = o4.getLong(i26);
                    int i27 = i23;
                    int i28 = a30;
                    oVar.f4304n = o4.getLong(i28);
                    int i29 = i26;
                    a30 = i28;
                    int i30 = a31;
                    oVar.f4305o = o4.getLong(i30);
                    a31 = i30;
                    int i31 = a32;
                    oVar.f4306p = o4.getLong(i31);
                    int i32 = a33;
                    oVar.f4307q = o4.getInt(i32) != 0;
                    int i33 = a34;
                    int i34 = i31;
                    oVar.f4308r = u.d(o4.getInt(i33));
                    oVar.f4300j = cVar;
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(oVar);
                    a34 = i33;
                    a19 = i16;
                    a21 = i18;
                    a32 = i34;
                    a18 = i13;
                    a33 = i32;
                    a11 = i14;
                    a24 = i17;
                    a10 = i12;
                    arrayList2 = arrayList3;
                    a20 = i11;
                    int i35 = i27;
                    a29 = i29;
                    a22 = i20;
                    a25 = i24;
                    a27 = i25;
                    a28 = i35;
                }
                ArrayList arrayList4 = arrayList;
                o4.close();
                g0Var.release();
                List<o> d10 = qVar2.d();
                List b10 = qVar2.b();
                if (!arrayList4.isEmpty()) {
                    p c10 = p.c();
                    String str = f2750v;
                    i = 0;
                    c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    p.c().d(str, i(kVar, sVar, hVar, arrayList4), new Throwable[0]);
                } else {
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    i = 0;
                }
                if (!((ArrayList) d10).isEmpty()) {
                    p c11 = p.c();
                    String str2 = f2750v;
                    c11.d(str2, "Running work:\n\n", new Throwable[i]);
                    p.c().d(str2, i(kVar, sVar, hVar, d10), new Throwable[i]);
                }
                if (!((ArrayList) b10).isEmpty()) {
                    p c12 = p.c();
                    String str3 = f2750v;
                    c12.d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    p.c().d(str3, i(kVar, sVar, hVar, b10), new Throwable[i]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th2) {
                th = th2;
                o4.close();
                g0Var.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            g0Var = e10;
            o4.close();
            g0Var.release();
            throw th;
        }
    }
}
