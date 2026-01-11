package io.nodle.cash.data.local;

import android.content.Context;
import android.util.Log;
import e6.e;
import h1.b0;
import h1.e0;
import java.util.ArrayList;
import ra.c;

public abstract class CashDatabase extends e0 {

    /* renamed from: n  reason: collision with root package name */
    public static final a f6682n = new a();

    /* renamed from: o  reason: collision with root package name */
    public static volatile CashDatabase f6683o;

    public static final class a {
        public final CashDatabase a(Context context) {
            e.D(context, "context");
            CashDatabase cashDatabase = CashDatabase.f6683o;
            if (cashDatabase == null) {
                synchronized (this) {
                    try {
                        cashDatabase = CashDatabase.f6683o;
                        if (cashDatabase == null) {
                            Log.d("CashDatabase", "buildDatabase");
                            e0.a<CashDatabase> a10 = b0.a(context, CashDatabase.class, "wallet-data");
                            a10.c();
                            a aVar = new a();
                            if (a10.f5689d == null) {
                                a10.f5689d = new ArrayList<>();
                            }
                            a10.f5689d.add(aVar);
                            CashDatabase b10 = a10.b();
                            CashDatabase.f6683o = b10;
                            cashDatabase = b10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return cashDatabase;
        }
    }

    public abstract ra.a r();

    public abstract c s();
}
