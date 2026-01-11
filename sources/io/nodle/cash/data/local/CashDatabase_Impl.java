package io.nodle.cash.data.local;

import android.content.Context;
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
import ra.b;
import ra.d;

public final class CashDatabase_Impl extends CashDatabase {

    /* renamed from: p  reason: collision with root package name */
    public volatile b f6684p;

    /* renamed from: q  reason: collision with root package name */
    public volatile d f6685q;

    public class a extends f0.a {
        public a() {
            super(16);
        }

        public final void a(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `TBL_NOTIFICATION` (`ID` INTEGER NOT NULL, `DATA` TEXT NOT NULL, `TIMESTAMP` INTEGER NOT NULL, `EXPIRE_TIMESTAMP` INTEGER NOT NULL, `IS_SEEN` INTEGER NOT NULL, PRIMARY KEY(`ID`))");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TBL_TRANSACTION` (`FROM` TEXT, `TO` TEXT, `AMOUNT` TEXT NOT NULL, `FEES` TEXT, `PURPOSE` TEXT, `BLOCK_HASH` TEXT, `BLOCK_NUMBER` INTEGER NOT NULL, `EXTRINSIC_INDEX` TEXT, `EXTRINSIC_HASH` TEXT NOT NULL, `TIMESTAMP` INTEGER NOT NULL, `TRANSACTION_TYPE` TEXT NOT NULL, `IS_PENDING` INTEGER NOT NULL, PRIMARY KEY(`EXTRINSIC_HASH`))");
            aVar2.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar2.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '435efff1526d56c1a062670c5cb22a31')");
        }

        public final void b(l1.a aVar) {
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("DROP TABLE IF EXISTS `TBL_NOTIFICATION`");
            aVar2.q("DROP TABLE IF EXISTS `TBL_TRANSACTION`");
            List<e0.b> list = CashDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    CashDatabase_Impl.this.g.get(i).b(aVar2);
                }
            }
        }

        public final void c(l1.a aVar) {
            List<e0.b> list = CashDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    CashDatabase_Impl.this.g.get(i).a(aVar);
                }
            }
        }

        public final void d(l1.a aVar) {
            CashDatabase_Impl.this.f5675a = aVar;
            CashDatabase_Impl.this.m(aVar);
            List<e0.b> list = CashDatabase_Impl.this.g;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    CashDatabase_Impl.this.g.get(i).c(aVar);
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
            HashMap hashMap = new HashMap(5);
            hashMap.put("ID", new d.a("ID", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("DATA", new d.a("DATA", "TEXT", true, 0, (String) null, 1));
            hashMap.put("TIMESTAMP", new d.a("TIMESTAMP", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("EXPIRE_TIMESTAMP", new d.a("EXPIRE_TIMESTAMP", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("IS_SEEN", new d.a("IS_SEEN", "INTEGER", true, 0, (String) null, 1));
            j1.d dVar = new j1.d("TBL_NOTIFICATION", hashMap, new HashSet(0), new HashSet(0));
            j1.d a10 = j1.d.a(aVar2, "TBL_NOTIFICATION");
            if (!dVar.equals(a10)) {
                return new f0.b(false, "TBL_NOTIFICATION(io.nodle.cash.data.local.entity.NotificationEntity).\n Expected:\n" + dVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(12);
            hashMap2.put("FROM", new d.a("FROM", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("TO", new d.a("TO", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("AMOUNT", new d.a("AMOUNT", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("FEES", new d.a("FEES", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("PURPOSE", new d.a("PURPOSE", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("BLOCK_HASH", new d.a("BLOCK_HASH", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("BLOCK_NUMBER", new d.a("BLOCK_NUMBER", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("EXTRINSIC_INDEX", new d.a("EXTRINSIC_INDEX", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("EXTRINSIC_HASH", new d.a("EXTRINSIC_HASH", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("TIMESTAMP", new d.a("TIMESTAMP", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("TRANSACTION_TYPE", new d.a("TRANSACTION_TYPE", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("IS_PENDING", new d.a("IS_PENDING", "INTEGER", true, 0, (String) null, 1));
            j1.d dVar2 = new j1.d("TBL_TRANSACTION", hashMap2, new HashSet(0), new HashSet(0));
            j1.d a11 = j1.d.a(aVar2, "TBL_TRANSACTION");
            if (dVar2.equals(a11)) {
                return new f0.b(true, (String) null);
            }
            return new f0.b(false, "TBL_TRANSACTION(io.nodle.cash.data.local.entity.TransactionEntity).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
        }
    }

    public final void d() {
        a();
        l1.a m02 = this.f5678d.m0();
        try {
            c();
            m02.q("DELETE FROM `TBL_NOTIFICATION`");
            m02.q("DELETE FROM `TBL_TRANSACTION`");
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
        return new u(this, new HashMap(0), new HashMap(0), "TBL_NOTIFICATION", "TBL_TRANSACTION");
    }

    public final l1.b f(m mVar) {
        f0 f0Var = new f0(mVar, new a(), "435efff1526d56c1a062670c5cb22a31", "f52adc20e883785d4b424331c920d955");
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
        hashMap.put(ra.a.class, Collections.emptyList());
        hashMap.put(ra.c.class, Collections.emptyList());
        return hashMap;
    }

    public final ra.a r() {
        ra.b bVar;
        if (this.f6684p != null) {
            return this.f6684p;
        }
        synchronized (this) {
            if (this.f6684p == null) {
                this.f6684p = new ra.b(this);
            }
            bVar = this.f6684p;
        }
        return bVar;
    }

    public final ra.c s() {
        ra.d dVar;
        if (this.f6685q != null) {
            return this.f6685q;
        }
        synchronized (this) {
            if (this.f6685q == null) {
                this.f6685q = new ra.d(this);
            }
            dVar = this.f6685q;
        }
        return dVar;
    }
}
