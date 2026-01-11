package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v4.media.a;
import androidx.activity.result.d;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class zzfp implements ServiceConnection {
    public final /* synthetic */ zzfq zza;
    /* access modifiers changed from: private */
    public final String zzb;

    public zzfp(zzfq zzfq, String str) {
        this.zza = zzfq;
        this.zzb = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                zzbr zzb2 = zzbq.zzb(iBinder);
                if (zzb2 == null) {
                    this.zza.zza.zzaz().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                this.zza.zza.zzaz().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaA().zzp(new zzfo(this, zzb2, this));
            } catch (RuntimeException e10) {
                this.zza.zza.zzaz().zzk().zzb("Exception occurred while calling Install Referrer API", e10);
            }
        } else {
            a.g(this.zza.zza, "Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        d.g(this.zza.zza, "Install Referrer Service disconnected");
    }
}
