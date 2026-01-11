package io.nodle.sdk.core.database;

import aj.b;
import aj.e;
import aj.g;
import aj.i;
import aj.j;
import aj.k;
import aj.l;
import aj.p;
import aj.q;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h1.e0;
import h1.f0;
import h1.m;
import h1.u;
import j1.c;
import j1.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.b;

public final class SdkDatabase_Impl extends SdkDatabase {

    /* renamed from: n  reason: collision with root package name */
    public volatile b f6849n;

    /* renamed from: o  reason: collision with root package name */
    public volatile q f6850o;

    /* renamed from: p  reason: collision with root package name */
    public volatile j f6851p;

    /* renamed from: q  reason: collision with root package name */
    public volatile e f6852q;

    /* renamed from: r  reason: collision with root package name */
    public volatile l f6853r;

    public class a extends f0.a {
        public a() {
            super(7);
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `BundleEntry` (`bid` TEXT NOT NULL, `fid` TEXT NOT NULL, `destination` TEXT NOT NULL, `source` TEXT NOT NULL, `offset` INTEGER NOT NULL, `appdata` INTEGER NOT NULL, `constraints` TEXT NOT NULL, `tags` TEXT NOT NULL, `created` INTEGER NOT NULL, `expire` INTEGER NOT NULL, `bundle` TEXT NOT NULL, `row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_BundleEntry_bid` ON `BundleEntry` (`bid`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_BundleEntry_row_id` ON `BundleEntry` (`row_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `UserKeyPair` (`private_key` TEXT NOT NULL, `public_key` TEXT NOT NULL, `timestamp_in_sec` INTEGER NOT NULL, `expiry_after_sec` INTEGER NOT NULL, `row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserKeyPair_public_key` ON `UserKeyPair` (`public_key`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_UserKeyPair_row_id` ON `UserKeyPair` (`row_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `SdkEvent` (`timestamp` INTEGER NOT NULL, `code` INTEGER NOT NULL, `int1` INTEGER NOT NULL, `int2` INTEGER NOT NULL, `str1` TEXT NOT NULL, `str2` TEXT NOT NULL, `row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_SdkEvent_row_id` ON `SdkEvent` (`row_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `SdkMetric` (`metric_id` INTEGER NOT NULL, `value` INTEGER NOT NULL, `row_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_SdkMetric_metric_id` ON `SdkMetric` (`metric_id`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_SdkMetric_row_id` ON `SdkMetric` (`row_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `LOI` (`l_key` TEXT NOT NULL, `la` REAL NOT NULL, `lo` REAL NOT NULL, `al` REAL NOT NULL, `ac` REAL NOT NULL, `gt` INTEGER NOT NULL, PRIMARY KEY(`l_key`))");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxInDb` (`txhash` TEXT NOT NULL, `txLastRun` INTEGER NOT NULL, `txExpire` INTEGER NOT NULL, `txGasLeft` INTEGER NOT NULL, `tx` TEXT NOT NULL, `tx_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxInDb_txhash` ON `TxInDb` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxInDb_tx_id` ON `TxInDb` (`tx_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxTargets` (`txhash` TEXT NOT NULL, `targets` TEXT NOT NULL, `target_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`txhash`) REFERENCES `TxInDb`(`txhash`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxTargets_txhash` ON `TxTargets` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxTargets_target_id` ON `TxTargets` (`target_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxEvents` (`txhash` TEXT NOT NULL, `events` TEXT NOT NULL, `event_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, FOREIGN KEY(`txhash`) REFERENCES `TxInDb`(`txhash`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxEvents_txhash` ON `TxEvents` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxEvents_event_id` ON `TxEvents` (`event_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar2.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8431b86b929a383384c3330f278ab55c')");
        }

        public final void b(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("DROP TABLE IF EXISTS `BundleEntry`");
            aVar2.q("DROP TABLE IF EXISTS `UserKeyPair`");
            aVar2.q("DROP TABLE IF EXISTS `SdkEvent`");
            aVar2.q("DROP TABLE IF EXISTS `SdkMetric`");
            aVar2.q("DROP TABLE IF EXISTS `LOI`");
            aVar2.q("DROP TABLE IF EXISTS `TxInDb`");
            aVar2.q("DROP TABLE IF EXISTS `TxTargets`");
            aVar2.q("DROP TABLE IF EXISTS `TxEvents`");
            List<e0.b> list = SdkDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SdkDatabase_Impl.this.g.get(i).b(aVar2);
                }
            }
        }

        public final void c(l1.a aVar) {
            List<e0.b> list = SdkDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SdkDatabase_Impl.this.g.get(i).a(aVar);
                }
            }
        }

        public final void d(l1.a aVar) {
            SdkDatabase_Impl.this.f5675a = aVar;
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("PRAGMA foreign_keys = ON");
            SdkDatabase_Impl.this.m(aVar2);
            List<e0.b> list = SdkDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    SdkDatabase_Impl.this.g.get(i).c(aVar2);
                }
            }
        }

        public final void e() {
        }

        public final void f(l1.a aVar) {
            c.a(aVar);
        }

        public final f0.b g(l1.a aVar) {
            l1.a aVar2 = aVar;
            HashMap hashMap = new HashMap(12);
            hashMap.put("bid", new d.a("bid", "TEXT", true, 0, (String) null, 1));
            hashMap.put("fid", new d.a("fid", "TEXT", true, 0, (String) null, 1));
            hashMap.put("destination", new d.a("destination", "TEXT", true, 0, (String) null, 1));
            hashMap.put("source", new d.a("source", "TEXT", true, 0, (String) null, 1));
            hashMap.put("offset", new d.a("offset", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("appdata", new d.a("appdata", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("constraints", new d.a("constraints", "TEXT", true, 0, (String) null, 1));
            hashMap.put("tags", new d.a("tags", "TEXT", true, 0, (String) null, 1));
            hashMap.put("created", new d.a("created", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("expire", new d.a("expire", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("bundle", new d.a("bundle", "TEXT", true, 0, (String) null, 1));
            hashMap.put("row_id", new d.a("row_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new d.C0120d("index_BundleEntry_bid", true, Arrays.asList(new String[]{"bid"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new d.C0120d("index_BundleEntry_row_id", false, Arrays.asList(new String[]{"row_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar = new d("BundleEntry", hashMap, hashSet, hashSet2);
            d a10 = d.a(aVar2, "BundleEntry");
            if (!dVar.equals(a10)) {
                return new f0.b(false, "BundleEntry(io.nodle.sdk.core.database.BundleEntryImpl).\n Expected:\n" + dVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put("private_key", new d.a("private_key", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("public_key", new d.a("public_key", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("timestamp_in_sec", new d.a("timestamp_in_sec", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("expiry_after_sec", new d.a("expiry_after_sec", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("row_id", new d.a("row_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new d.C0120d("index_UserKeyPair_public_key", true, Arrays.asList(new String[]{"public_key"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new d.C0120d("index_UserKeyPair_row_id", false, Arrays.asList(new String[]{"row_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar2 = new d("UserKeyPair", hashMap2, hashSet3, hashSet4);
            d a11 = d.a(aVar2, "UserKeyPair");
            if (!dVar2.equals(a11)) {
                return new f0.b(false, "UserKeyPair(io.nodle.sdk.core.database.UserKeyPairImpl).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(7);
            hashMap3.put("timestamp", new d.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("code", new d.a("code", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("int1", new d.a("int1", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("int2", new d.a("int2", "INTEGER", true, 0, (String) null, 1));
            hashMap3.put("str1", new d.a("str1", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("str2", new d.a("str2", "TEXT", true, 0, (String) null, 1));
            hashMap3.put("row_id", new d.a("row_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new d.C0120d("index_SdkEvent_row_id", false, Arrays.asList(new String[]{"row_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar3 = new d("SdkEvent", hashMap3, hashSet5, hashSet6);
            d a12 = d.a(aVar2, "SdkEvent");
            if (!dVar3.equals(a12)) {
                return new f0.b(false, "SdkEvent(io.nodle.sdk.core.database.SdkEvent).\n Expected:\n" + dVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("metric_id", new d.a("metric_id", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, new d.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("row_id", new d.a("row_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(2);
            hashSet8.add(new d.C0120d("index_SdkMetric_metric_id", true, Arrays.asList(new String[]{"metric_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet8.add(new d.C0120d("index_SdkMetric_row_id", false, Arrays.asList(new String[]{"row_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar4 = new d("SdkMetric", hashMap4, hashSet7, hashSet8);
            d a13 = d.a(aVar2, "SdkMetric");
            if (!dVar4.equals(a13)) {
                return new f0.b(false, "SdkMetric(io.nodle.sdk.core.database.SdkMetric).\n Expected:\n" + dVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(6);
            hashMap5.put("l_key", new d.a("l_key", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("la", new d.a("la", "REAL", true, 0, (String) null, 1));
            hashMap5.put("lo", new d.a("lo", "REAL", true, 0, (String) null, 1));
            hashMap5.put("al", new d.a("al", "REAL", true, 0, (String) null, 1));
            hashMap5.put("ac", new d.a("ac", "REAL", true, 0, (String) null, 1));
            hashMap5.put("gt", new d.a("gt", "INTEGER", true, 0, (String) null, 1));
            d dVar5 = new d("LOI", hashMap5, new HashSet(0), new HashSet(0));
            d a14 = d.a(aVar2, "LOI");
            if (!dVar5.equals(a14)) {
                return new f0.b(false, "LOI(io.nodle.sdk.core.database.LOIImpl).\n Expected:\n" + dVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(6);
            hashMap6.put("txhash", new d.a("txhash", "TEXT", true, 0, (String) null, 1));
            hashMap6.put("txLastRun", new d.a("txLastRun", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("txExpire", new d.a("txExpire", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("txGasLeft", new d.a("txGasLeft", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("tx", new d.a("tx", "TEXT", true, 0, (String) null, 1));
            hashMap6.put("tx_id", new d.a("tx_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet9 = new HashSet(0);
            HashSet hashSet10 = new HashSet(2);
            hashSet10.add(new d.C0120d("index_TxInDb_txhash", true, Arrays.asList(new String[]{"txhash"}), Arrays.asList(new String[]{"ASC"})));
            hashSet10.add(new d.C0120d("index_TxInDb_tx_id", false, Arrays.asList(new String[]{"tx_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar6 = new d("TxInDb", hashMap6, hashSet9, hashSet10);
            d a15 = d.a(aVar2, "TxInDb");
            if (!dVar6.equals(a15)) {
                return new f0.b(false, "TxInDb(io.nodle.sdk.core.database.TxInDbImpl).\n Expected:\n" + dVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(3);
            hashMap7.put("txhash", new d.a("txhash", "TEXT", true, 0, (String) null, 1));
            hashMap7.put("targets", new d.a("targets", "TEXT", true, 0, (String) null, 1));
            hashMap7.put("target_id", new d.a("target_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet11 = new HashSet(1);
            hashSet11.add(new d.b("TxInDb", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"txhash"}), Arrays.asList(new String[]{"txhash"})));
            HashSet hashSet12 = new HashSet(2);
            hashSet12.add(new d.C0120d("index_TxTargets_txhash", true, Arrays.asList(new String[]{"txhash"}), Arrays.asList(new String[]{"ASC"})));
            hashSet12.add(new d.C0120d("index_TxTargets_target_id", false, Arrays.asList(new String[]{"target_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar7 = new d("TxTargets", hashMap7, hashSet11, hashSet12);
            d a16 = d.a(aVar2, "TxTargets");
            if (!dVar7.equals(a16)) {
                return new f0.b(false, "TxTargets(io.nodle.sdk.core.database.TxTargetsImpl).\n Expected:\n" + dVar7 + "\n Found:\n" + a16);
            }
            HashMap hashMap8 = new HashMap(3);
            hashMap8.put("txhash", new d.a("txhash", "TEXT", true, 0, (String) null, 1));
            hashMap8.put("events", new d.a("events", "TEXT", true, 0, (String) null, 1));
            hashMap8.put("event_id", new d.a("event_id", "INTEGER", true, 1, (String) null, 1));
            HashSet hashSet13 = new HashSet(1);
            hashSet13.add(new d.b("TxInDb", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"txhash"}), Arrays.asList(new String[]{"txhash"})));
            HashSet hashSet14 = new HashSet(2);
            hashSet14.add(new d.C0120d("index_TxEvents_txhash", true, Arrays.asList(new String[]{"txhash"}), Arrays.asList(new String[]{"ASC"})));
            hashSet14.add(new d.C0120d("index_TxEvents_event_id", false, Arrays.asList(new String[]{"event_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar8 = new d("TxEvents", hashMap8, hashSet13, hashSet14);
            d a17 = d.a(aVar2, "TxEvents");
            if (dVar8.equals(a17)) {
                return new f0.b(true, (String) null);
            }
            return new f0.b(false, "TxEvents(io.nodle.sdk.core.database.TxEventsImpl).\n Expected:\n" + dVar8 + "\n Found:\n" + a17);
        }
    }

    public final void d() {
        a();
        l1.a m02 = this.f5678d.m0();
        try {
            c();
            m02.q("PRAGMA defer_foreign_keys = TRUE");
            m02.q("DELETE FROM `BundleEntry`");
            m02.q("DELETE FROM `UserKeyPair`");
            m02.q("DELETE FROM `SdkEvent`");
            m02.q("DELETE FROM `SdkMetric`");
            m02.q("DELETE FROM `LOI`");
            m02.q("DELETE FROM `TxInDb`");
            m02.q("DELETE FROM `TxTargets`");
            m02.q("DELETE FROM `TxEvents`");
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
        return new u(this, new HashMap(0), new HashMap(0), "BundleEntry", "UserKeyPair", "SdkEvent", "SdkMetric", "LOI", "TxInDb", "TxTargets", "TxEvents");
    }

    public final l1.b f(m mVar) {
        f0 f0Var = new f0(mVar, new a(), "8431b86b929a383384c3330f278ab55c", "2238b889478ead106a0f9fbdd0e3fe94");
        Context context = mVar.f5748b;
        String str = mVar.f5749c;
        if (context != null) {
            return mVar.f5747a.a(new b.C0141b(context, str, f0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    public final List g() {
        return Arrays.asList(new i1.b[0]);
    }

    public final Set<Class<? extends i1.a>> h() {
        return new HashSet();
    }

    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(aj.a.class, Collections.emptyList());
        hashMap.put(p.class, Collections.emptyList());
        hashMap.put(i.class, Collections.emptyList());
        hashMap.put(g.class, Collections.emptyList());
        hashMap.put(aj.d.class, Collections.emptyList());
        hashMap.put(k.class, Collections.emptyList());
        return hashMap;
    }

    public final aj.a r() {
        aj.b bVar;
        if (this.f6849n != null) {
            return this.f6849n;
        }
        synchronized (this) {
            if (this.f6849n == null) {
                this.f6849n = new aj.b(this);
            }
            bVar = this.f6849n;
        }
        return bVar;
    }

    public final p s() {
        q qVar;
        if (this.f6850o != null) {
            return this.f6850o;
        }
        synchronized (this) {
            if (this.f6850o == null) {
                this.f6850o = new q(this);
            }
            qVar = this.f6850o;
        }
        return qVar;
    }

    public final aj.d t() {
        e eVar;
        if (this.f6852q != null) {
            return this.f6852q;
        }
        synchronized (this) {
            if (this.f6852q == null) {
                this.f6852q = new e(this);
            }
            eVar = this.f6852q;
        }
        return eVar;
    }

    public final i u() {
        j jVar;
        if (this.f6851p != null) {
            return this.f6851p;
        }
        synchronized (this) {
            if (this.f6851p == null) {
                this.f6851p = new j(this);
            }
            jVar = this.f6851p;
        }
        return jVar;
    }

    public final k v() {
        l lVar;
        if (this.f6853r != null) {
            return this.f6853r;
        }
        synchronized (this) {
            if (this.f6853r == null) {
                this.f6853r = new l(this);
            }
            lVar = this.f6853r;
        }
        return lVar;
    }
}
