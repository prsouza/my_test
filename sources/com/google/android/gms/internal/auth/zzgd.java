package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzgd {
    private static final Class<?> zza;
    private static final zzgp<?, ?> zzb = zzj(false);
    private static final zzgp<?, ?> zzc = zzj(true);
    private static final zzgp<?, ?> zzd = new zzgr();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzgp<?, ?> zza() {
        return zzb;
    }

    public static zzgp<?, ?> zzb() {
        return zzc;
    }

    public static zzgp<?, ?> zzc() {
        return zzd;
    }

    public static <UT, UB> UB zzd(int i, List<Integer> list, zzet zzet, UB ub2, zzgp<UT, UB> zzgp) {
        if (zzet == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                int intValue = list.get(i11).intValue();
                if (zzet.zza()) {
                    if (i11 != i10) {
                        list.set(i10, Integer.valueOf(intValue));
                    }
                    i10++;
                } else {
                    ub2 = zze(i, intValue, ub2, zzgp);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return ub2;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzet.zza()) {
                    ub2 = zze(i, intValue2, ub2, zzgp);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static <UT, UB> UB zze(int i, int i10, UB ub2, zzgp<UT, UB> zzgp) {
        if (ub2 == null) {
            ub2 = zzgp.zzc();
        }
        zzgp.zzd(ub2, i, (long) i10);
        return ub2;
    }

    public static <T, UT, UB> void zzf(zzgp<UT, UB> zzgp, T t10, T t11) {
        zzgp.zzf(t10, zzgp.zzb(zzgp.zza(t10), zzgp.zza(t11)));
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzeq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzh(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> void zzi(zzfl zzfl, T t10, T t11, long j10) {
        zzgz.zzp(t10, j10, zzfl.zza(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10)));
    }

    private static zzgp<?, ?> zzj(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
