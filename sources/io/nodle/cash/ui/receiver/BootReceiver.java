package io.nodle.cash.ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import e6.e;
import za.d;

public final class BootReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        e.D(context, "context");
        e.D(intent, "intent");
        Log.d("BootReceiver", "STARTING NODLE");
        d.f14195a.a(context);
    }
}
