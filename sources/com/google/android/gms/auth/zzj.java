package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.a;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zze;
import java.io.IOException;

final class zzj implements zzk<Boolean> {
    public final /* synthetic */ String zza;

    public zzj(String str) {
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle zzg = zze.zzb(iBinder).zzg(this.zza);
        Object unused = zzl.zzi(zzg);
        String string = zzg.getString("Error");
        Intent intent = (Intent) zzg.getParcelable("userRecoveryIntent");
        zzby zza2 = zzby.zza(string);
        if (zzby.SUCCESS.equals(zza2)) {
            return Boolean.TRUE;
        }
        if (zzby.zzb(zza2)) {
            Logger zzc = zzl.zzd;
            String valueOf = String.valueOf(zza2);
            zzc.w("GoogleAuthUtil", a.e(new StringBuilder(valueOf.length() + 31), "isUserRecoverableError status: ", valueOf));
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
