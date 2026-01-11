package cj;

import e6.e;
import i1.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0037a f3470a = new C0037a();

    /* renamed from: cj.a$a  reason: collision with other inner class name */
    public static final class C0037a extends b {
        public C0037a() {
            super(3, 4);
        }

        public final void a(l1.a aVar) {
            e.D(aVar, "database");
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxInDb` (`tx_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `txhash` TEXT NOT NULL, `txExpire` INTEGER NOT NULL, `txGasLeft` INTEGER NOT NULL, `tx` TEXT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxInDb_txhash` ON `TxInDb` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxInDb_tx_id` ON `TxInDb` (`tx_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxTargets` (`target_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `txhash` TEXT NOT NULL, `targets` TEXT NOT NULL, FOREIGN KEY(`txhash`) REFERENCES `TxInDb`(`txhash`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxTargets_txhash` ON `TxTargets` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxTargets_target_id` ON `TxTargets` (`target_id`)");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxEvents` (`event_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `txhash` TEXT NOT NULL, `events` TEXT NOT NULL, FOREIGN KEY(`txhash`) REFERENCES `TxInDb`(`txhash`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxEvents_txhash` ON `TxEvents` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxEvents_event_id` ON `TxEvents` (`event_id`)");
        }
    }
}
