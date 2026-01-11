package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zbt;

public final class RevocationBoundService extends Service {
    public IBinder onBind(Intent intent) {
        String str;
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String valueOf = String.valueOf(intent.getAction());
                if (valueOf.length() != 0) {
                    str = "RevocationBoundService handling ".concat(valueOf);
                } else {
                    str = new String("RevocationBoundService handling ");
                }
                Log.v("RevocationService", str);
            }
            return new zbt(this);
        }
        String valueOf2 = String.valueOf(intent.getAction());
        Log.w("RevocationService", valueOf2.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(valueOf2) : new String("Unknown action sent to RevocationBoundService: "));
        return null;
    }
}
