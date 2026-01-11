package x1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d2.d;
import d2.f;
import d2.g;
import d2.i;
import e2.e;
import u1.p;
import v1.j;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12756a = p.e("Alarms");

    public static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.c(context, str), 603979776);
        if (service != null && alarmManager != null) {
            p.c().a(f12756a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, j jVar, String str, long j10) {
        int intValue;
        WorkDatabase workDatabase = jVar.f12152x;
        i iVar = (i) workDatabase.t();
        g a10 = iVar.a(str);
        if (a10 != null) {
            a(context, str, a10.f4281b);
            c(context, str, a10.f4281b, j10);
            return;
        }
        synchronized (e.class) {
            workDatabase.c();
            try {
                Long a11 = ((f) workDatabase.s()).a("next_alarm_manager_id");
                int i = 0;
                intValue = a11 != null ? a11.intValue() : 0;
                if (intValue != Integer.MAX_VALUE) {
                    i = intValue + 1;
                }
                ((f) workDatabase.s()).b(new d("next_alarm_manager_id", (long) i));
                workDatabase.p();
            } finally {
                workDatabase.l();
            }
        }
        iVar.b(new g(str, intValue));
        c(context, str, intValue, j10);
    }

    public static void c(Context context, String str, int i, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.c(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j10, service);
        }
    }
}
