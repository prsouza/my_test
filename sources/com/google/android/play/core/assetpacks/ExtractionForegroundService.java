package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import l6.r0;

public class ExtractionForegroundService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f4197a = new r0(this);

    public final IBinder onBind(Intent intent) {
        return this.f4197a;
    }
}
