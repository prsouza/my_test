package androidx.work.impl;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d2.c;
import d2.e;
import d2.f;
import d2.h;
import d2.i;
import d2.k;
import d2.l;
import d2.n;
import d2.p;
import d2.q;
import d2.s;
import d2.t;
import h1.e0;
import h1.f0;
import h1.m;
import h1.u;
import j1.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l1.b;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f2655w = 0;

    /* renamed from: p  reason: collision with root package name */
    public volatile q f2656p;

    /* renamed from: q  reason: collision with root package name */
    public volatile c f2657q;

    /* renamed from: r  reason: collision with root package name */
    public volatile t f2658r;

    /* renamed from: s  reason: collision with root package name */
    public volatile i f2659s;

    /* renamed from: t  reason: collision with root package name */
    public volatile l f2660t;

    /* renamed from: u  reason: collision with root package name */
    public volatile n f2661u;

    /* renamed from: v  reason: collision with root package name */
    public volatile f f2662v;

    public class a extends f0.a {
        public a() {
            super(12);
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar2.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar2.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar2.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        public final void b(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("DROP TABLE IF EXISTS `Dependency`");
            aVar2.q("DROP TABLE IF EXISTS `WorkSpec`");
            aVar2.q("DROP TABLE IF EXISTS `WorkTag`");
            aVar2.q("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar2.q("DROP TABLE IF EXISTS `WorkName`");
            aVar2.q("DROP TABLE IF EXISTS `WorkProgress`");
            aVar2.q("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f2655w;
            List<e0.b> list = workDatabase_Impl.g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    WorkDatabase_Impl.this.g.get(i10).b(aVar2);
                }
            }
        }

        public final void c(l1.a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f2655w;
            List<e0.b> list = workDatabase_Impl.g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    WorkDatabase_Impl.this.g.get(i10).a(aVar);
                }
            }
        }

        public final void d(l1.a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f2655w;
            workDatabase_Impl.f5675a = aVar;
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(aVar2);
            List<e0.b> list = WorkDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    WorkDatabase_Impl.this.g.get(i10).c(aVar2);
                }
            }
        }

        public final void e() {
        }

        public final void f(l1.a aVar) {
            j1.c.a(aVar);
        }

        public final f0.b g(l1.a aVar) {
            l1.a aVar2 = aVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new d.C0120d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (List<String>) null));
            hashSet2.add(new d.C0120d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), (List<String>) null));
            d dVar = new d("Dependency", hashMap, hashSet, hashSet2);
            d a10 = d.a(aVar2, "Dependency");
            if (!dVar.equals(a10)) {
                return new f0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new d.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new d.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new d.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new d.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new d.a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new d.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new d.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new d.a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new d.C0120d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), (List<String>) null));
            hashSet4.add(new d.C0120d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"}), (List<String>) null));
            d dVar2 = new d("WorkSpec", hashMap2, hashSet3, hashSet4);
            d a11 = d.a(aVar2, "WorkSpec");
            if (!dVar2.equals(a11)) {
                return new f0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new d.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new d.C0120d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (List<String>) null));
            d dVar3 = new d("WorkTag", hashMap3, hashSet5, hashSet6);
            d a12 = d.a(aVar2, "WorkTag");
            if (!dVar3.equals(a12)) {
                return new f0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new d.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            d dVar4 = new d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            d a13 = d.a(aVar2, "SystemIdInfo");
            if (!dVar4.equals(a13)) {
                return new f0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new d.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new d.C0120d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (List<String>) null));
            d dVar5 = new d("WorkName", hashMap5, hashSet8, hashSet9);
            d a14 = d.a(aVar2, "WorkName");
            if (!dVar5.equals(a14)) {
                return new f0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new d.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new d.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            d dVar6 = new d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            d a15 = d.a(aVar2, "WorkProgress");
            if (!dVar6.equals(a15)) {
                return new f0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new d.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new d.a("long_value", "INTEGER", false, 0, (String) null, 1));
            d dVar7 = new d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            d a16 = d.a(aVar2, "Preference");
            if (dVar7.equals(a16)) {
                return new f0.b(true, (String) null);
            }
            return new f0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a16);
        }
    }

    public final void d() {
        a();
        l1.a m02 = this.f5678d.m0();
        try {
            c();
            m02.q("PRAGMA defer_foreign_keys = TRUE");
            m02.q("DELETE FROM `Dependency`");
            m02.q("DELETE FROM `WorkSpec`");
            m02.q("DELETE FROM `WorkTag`");
            m02.q("DELETE FROM `SystemIdInfo`");
            m02.q("DELETE FROM `WorkName`");
            m02.q("DELETE FROM `WorkProgress`");
            m02.q("DELETE FROM `Preference`");
            p();
        } finally {
            l();
            m02.o0("PRAGMA wal_checkpoint(FULL)").close();
            if (!m02.M()) {
                m02.q("VACUUM");
            }
        }
    }

    public final u e() {
        return new u(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public final b f(m mVar) {
        f0 f0Var = new f0(mVar, new a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = mVar.f5748b;
        String str = mVar.f5749c;
        if (context != null) {
            return mVar.f5747a.a(new b.C0141b(context, str, f0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    public final d2.b r() {
        c cVar;
        if (this.f2657q != null) {
            return this.f2657q;
        }
        synchronized (this) {
            if (this.f2657q == null) {
                this.f2657q = new c(this);
            }
            cVar = this.f2657q;
        }
        return cVar;
    }

    public final e s() {
        f fVar;
        if (this.f2662v != null) {
            return this.f2662v;
        }
        synchronized (this) {
            if (this.f2662v == null) {
                this.f2662v = new f(this);
            }
            fVar = this.f2662v;
        }
        return fVar;
    }

    public final h t() {
        i iVar;
        if (this.f2659s != null) {
            return this.f2659s;
        }
        synchronized (this) {
            if (this.f2659s == null) {
                this.f2659s = new i(this);
            }
            iVar = this.f2659s;
        }
        return iVar;
    }

    public final k u() {
        l lVar;
        if (this.f2660t != null) {
            return this.f2660t;
        }
        synchronized (this) {
            if (this.f2660t == null) {
                this.f2660t = new l(this);
            }
            lVar = this.f2660t;
        }
        return lVar;
    }

    public final d2.m v() {
        n nVar;
        if (this.f2661u != null) {
            return this.f2661u;
        }
        synchronized (this) {
            if (this.f2661u == null) {
                this.f2661u = new n(this);
            }
            nVar = this.f2661u;
        }
        return nVar;
    }

    public final p w() {
        q qVar;
        if (this.f2656p != null) {
            return this.f2656p;
        }
        synchronized (this) {
            if (this.f2656p == null) {
                this.f2656p = new q(this);
            }
            qVar = this.f2656p;
        }
        return qVar;
    }

    public final s x() {
        t tVar;
        if (this.f2658r != null) {
            return this.f2658r;
        }
        synchronized (this) {
            if (this.f2658r == null) {
                this.f2658r = new t(this);
            }
            tVar = this.f2658r;
        }
        return tVar;
    }
}
