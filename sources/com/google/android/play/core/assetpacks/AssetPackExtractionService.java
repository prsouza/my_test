package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import l6.b1;
import l6.n0;
import l6.s2;
import l6.v;

public class AssetPackExtractionService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public v f4196a;

    public final IBinder onBind(Intent intent) {
        return this.f4196a;
    }

    public final void onCreate() {
        n0 n0Var;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (b1.class) {
            if (b1.f7788a == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                b1.f7788a = new n0(new s2(applicationContext));
            }
            n0Var = b1.f7788a;
        }
        this.f4196a = (v) n0Var.f7940d.zza();
    }
}
