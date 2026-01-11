package cj;

import e6.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3471a = new a();

    public static final class a extends i1.b {
        public a() {
            super(4, 5);
        }

        public final void a(l1.a aVar) {
            e.D(aVar, "database");
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("DROP TABLE `TxInDb`");
            aVar2.q("CREATE TABLE IF NOT EXISTS `TxInDb` (`tx_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `txhash` TEXT NOT NULL, `txLastRun` INTEGER NOT NULL, `txExpire` INTEGER NOT NULL, `txGasLeft` INTEGER NOT NULL, `tx` TEXT NOT NULL)");
            aVar2.q("CREATE UNIQUE INDEX IF NOT EXISTS `index_TxInDb_txhash` ON `TxInDb` (`txhash`)");
            aVar2.q("CREATE INDEX IF NOT EXISTS `index_TxInDb_tx_id` ON `TxInDb` (`tx_id`)");
        }
    }
}
