package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class zzey extends zzhc {
    /* access modifiers changed from: private */
    public char zza = 0;
    /* access modifiers changed from: private */
    public long zzb = -1;
    private String zzc;
    private final zzew zzd = new zzew(this, 6, false, false);
    private final zzew zze = new zzew(this, 6, true, false);
    private final zzew zzf = new zzew(this, 6, false, true);
    private final zzew zzg = new zzew(this, 5, false, false);
    private final zzew zzh = new zzew(this, 5, true, false);
    private final zzew zzi = new zzew(this, 5, false, true);
    private final zzew zzj = new zzew(this, 4, false, false);
    private final zzew zzk = new zzew(this, 3, false, false);
    private final zzew zzl = new zzew(this, 2, false, false);

    public zzey(zzgi zzgi) {
        super(zzgi);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzex(str);
    }

    public static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = str2;
        }
        String zzp = zzp(z, obj);
        String zzp2 = zzp(z, obj2);
        String zzp3 = zzp(z, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(zzp2)) {
            sb2.append(str2);
            sb2.append(zzp2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    public static String zzp(boolean z, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            return str + round + "..." + str + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th2.getClass().getName() : th2.toString());
                String zzy = zzy(zzgi.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof zzex) {
                return ((zzex) obj).zza;
            } else {
                if (z) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public final zzew zzc() {
        return this.zzk;
    }

    public final zzew zzd() {
        return this.zzd;
    }

    public final zzew zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return false;
    }

    public final zzew zzh() {
        return this.zze;
    }

    public final zzew zzi() {
        return this.zzj;
    }

    public final zzew zzj() {
        return this.zzl;
    }

    public final zzew zzk() {
        return this.zzg;
    }

    public final zzew zzl() {
        return this.zzi;
    }

    public final zzew zzm() {
        return this.zzh;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @VisibleForTesting
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzs.zzy() != null) {
                    this.zzc = this.zzs.zzy();
                } else {
                    this.zzc = this.zzs.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i, boolean z, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzq(), i)) {
            Log.println(i, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (!z10 && i >= 5) {
            Preconditions.checkNotNull(str);
            zzgf zzo = this.zzs.zzo();
            if (zzo == null) {
                Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
            } else if (!zzo.zzx()) {
                Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                zzo.zzp(new zzev(this, i, str, obj, obj2, obj3));
            }
        }
    }
}
