package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzeq;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzeq<MessageType extends zzeq<MessageType, BuilderType>, BuilderType extends zzeo<MessageType, BuilderType>> extends zzdm<MessageType, BuilderType> {
    private static final Map<Object, zzeq<?, ?>> zzb = new ConcurrentHashMap();
    public zzgq zzc = zzgq.zza();

    public static <T extends zzeq> T zza(Class<T> cls) {
        Map<Object, zzeq<?, ?>> map = zzb;
        T t10 = (zzeq) map.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (zzeq) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (zzeq) ((zzeq) zzgz.zze(cls)).zzj(6, (Object) null, (Object) null);
            if (t10 != null) {
                map.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public static <T extends zzeq<T, ?>> T zzb(T t10, byte[] bArr) throws zzew {
        boolean z = false;
        T zzc2 = zzc(t10, bArr, 0, bArr.length, zzeg.zza());
        if (zzc2 != null) {
            byte byteValue = ((Byte) zzc2.zzj(1, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = zzfy.zza().zzb(zzc2.getClass()).zzi(zzc2);
                zzc2.zzj(2, true != z ? null : zzc2, (Object) null);
            }
            if (!z) {
                zzew zzew = new zzew(new zzgo(zzc2).getMessage());
                zzew.zze(zzc2);
                throw zzew;
            }
        }
        return zzc2;
    }

    public static <T extends zzeq<T, ?>> T zzc(T t10, byte[] bArr, int i, int i10, zzeg zzeg) throws zzew {
        T t11 = (zzeq) t10.zzj(4, (Object) null, (Object) null);
        try {
            zzgb<?> zzb2 = zzfy.zza().zzb(t11.getClass());
            zzb2.zzg(t11, bArr, 0, i10, new zzdp(zzeg));
            zzb2.zze(t11);
            if (t11.zza == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (zzew e10) {
            e10.zze(t11);
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzew) {
                throw ((zzew) e11.getCause());
            }
            zzew zzew = new zzew(e11);
            zzew.zze(t11);
            throw zzew;
        } catch (IndexOutOfBoundsException unused) {
            zzew zzf = zzew.zzf();
            zzf.zze(t11);
            throw zzf;
        }
    }

    public static <E> zzeu<E> zzd() {
        return zzfz.zze();
    }

    public static Object zzf(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static Object zzg(zzfq zzfq, String str, Object[] objArr) {
        return new zzga(zzfq, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    public static <T extends zzeq> void zzi(Class<T> cls, T t10) {
        zzb.put(cls, t10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfy.zza().zzb(getClass()).zzh(this, (zzeq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = zzfy.zza().zzb(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public final String toString() {
        return zzfs.zza(this, super.toString());
    }

    public final /* bridge */ /* synthetic */ zzfp zze() {
        zzeo zzeo = (zzeo) zzj(5, (Object) null, (Object) null);
        zzeo.zze(this);
        return zzeo;
    }

    public final /* bridge */ /* synthetic */ zzfq zzh() {
        return (zzeq) zzj(6, (Object) null, (Object) null);
    }

    public abstract Object zzj(int i, Object obj, Object obj2);
}
