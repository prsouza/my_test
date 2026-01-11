package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static C0025a f2664a = new C0025a();

    /* renamed from: b  reason: collision with root package name */
    public static b f2665b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static c f2666c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static d f2667d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static e f2668e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static f f2669f = new f();
    public static g g = new g();

    /* renamed from: androidx.work.impl.a$a  reason: collision with other inner class name */
    public class C0025a extends i1.b {
        public C0025a() {
            super(1, 2);
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar2.q("DROP TABLE IF EXISTS alarmInfo");
            aVar2.q("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends i1.b {
        public b() {
            super(3, 4);
        }

        public final void a(l1.a aVar) {
            ((m1.a) aVar).q("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    public class c extends i1.b {
        public c() {
            super(4, 5);
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar2.q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class d extends i1.b {
        public d() {
            super(6, 7);
        }

        public final void a(l1.a aVar) {
            ((m1.a) aVar).q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class e extends i1.b {
        public e() {
            super(7, 8);
        }

        public final void a(l1.a aVar) {
            ((m1.a) aVar).q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    public class f extends i1.b {
        public f() {
            super(8, 9);
        }

        public final void a(l1.a aVar) {
            ((m1.a) aVar).q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class g extends i1.b {
        public g() {
            super(11, 12);
        }

        public final void a(l1.a aVar) {
            ((m1.a) aVar).q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends i1.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f2670c;

        public h(Context context, int i, int i10) {
            super(i, i10);
            this.f2670c = context;
        }

        public final void a(l1.a aVar) {
            if (this.f5975b >= 10) {
                ((m1.a) aVar).Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f2670c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    public static class i extends i1.b {

        /* renamed from: c  reason: collision with root package name */
        public final Context f2671c;

        public i(Context context) {
            super(9, 10);
            this.f2671c = context;
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f2671c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = 0;
                long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j10 = 1;
                }
                aVar2.i();
                try {
                    aVar2.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                    aVar2.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                    sharedPreferences.edit().clear().apply();
                    aVar2.Y();
                } finally {
                    aVar2.h();
                }
            }
            SharedPreferences sharedPreferences2 = this.f2671c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar2.i();
                try {
                    aVar2.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    aVar2.Z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                    sharedPreferences2.edit().clear().apply();
                    aVar2.Y();
                } finally {
                    aVar2.h();
                }
            }
        }
    }
}
