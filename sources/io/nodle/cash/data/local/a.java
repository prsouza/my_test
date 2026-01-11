package io.nodle.cash.data.local;

import android.util.Log;
import e6.e;
import h1.e0;

public final class a extends e0.b {
    public final void a(l1.a aVar) {
        e.D(aVar, "db");
        Log.d("CashDatabase", "onCreate");
    }

    public final void b(l1.a aVar) {
        e.D(aVar, "db");
        Log.d("CashDatabase", "onDestructiveMigration");
    }
}
