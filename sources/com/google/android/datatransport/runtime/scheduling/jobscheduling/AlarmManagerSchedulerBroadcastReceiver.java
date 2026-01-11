package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import d5.a;
import t4.i;
import t4.q;
import t4.v;
import z4.n;
import z4.o;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3612a = 0;

    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        v.b(context);
        q.a a10 = q.a();
        a10.a(queryParameter);
        i.a aVar = (i.a) a10;
        aVar.f11368c = a.b(intValue);
        if (queryParameter2 != null) {
            aVar.f11367b = Base64.decode(queryParameter2, 0);
        }
        o oVar = v.a().f11398d;
        oVar.f13833e.execute(new n(oVar, aVar.b(), i, z4.a.f13793a));
    }
}
