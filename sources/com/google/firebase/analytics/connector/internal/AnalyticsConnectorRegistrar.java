package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import ge.g0;
import java.util.Arrays;
import java.util.List;
import k7.d;
import o7.a;
import o7.b;
import s7.b;
import s7.c;
import s7.f;
import s7.n;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements f {
    public static a lambda$getComponents$0(c cVar) {
        d dVar = (d) cVar.a(d.class);
        Context context = (Context) cVar.a(Context.class);
        m8.d dVar2 = (m8.d) cVar.a(m8.d.class);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar2);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (b.f9366c == null) {
            synchronized (b.class) {
                if (b.f9366c == null) {
                    Bundle bundle = new Bundle(1);
                    if (dVar.h()) {
                        dVar2.b(o7.d.f9370a, o7.c.f9369a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", dVar.g());
                    }
                    b.f9366c = new b(zzee.zzg(context, (String) null, (String) null, (String) null, bundle).zzd());
                }
            }
        }
        return b.f9366c;
    }

    @KeepForSdk
    @Keep
    public List<s7.b<?>> getComponents() {
        b.C0214b<a> a10 = s7.b.a(a.class);
        a10.a(new n(d.class, 1, 0));
        a10.a(new n(Context.class, 1, 0));
        a10.a(new n(m8.d.class, 1, 0));
        a10.f10945e = g0.f5398x;
        a10.c();
        return Arrays.asList(new s7.b[]{a10.b(), a9.f.a("fire-analytics", "20.1.2")});
    }
}
