package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import androidx.appcompat.widget.d;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.R;
import h1.e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.jpountz.lz4.LZ4BlockOutputStream;
import sun.misc.Unsafe;

final class zzft<T> implements zzgb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfq zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfe zzl;
    private final zzgp<?, ?> zzm;
    private final zzeh<?> zzn;
    private final zzfv zzo;
    private final zzfl zzp;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.internal.auth.zzfv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.gms.internal.auth.zzfq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.gms.internal.auth.zzfl} */
    /* JADX WARNING: type inference failed for: r1v2, types: [int] */
    /* JADX WARNING: type inference failed for: r1v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.google.android.gms.internal.auth.zzfe] */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.google.android.gms.internal.auth.zzgp<?, ?>] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.google.android.gms.internal.auth.zzeh<?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzft(int[] r3, int[] r4, java.lang.Object[] r5, int r6, int r7, com.google.android.gms.internal.auth.zzfq r8, boolean r9, boolean r10, int[] r11, int r12, int r13, com.google.android.gms.internal.auth.zzfv r14, com.google.android.gms.internal.auth.zzfe r15, com.google.android.gms.internal.auth.zzgp<?, ?> r16, com.google.android.gms.internal.auth.zzeh<?> r17, com.google.android.gms.internal.auth.zzfl r18) {
        /*
            r2 = this;
            r0 = r2
            r2.<init>()
            r1 = r3
            r0.zzc = r1
            r1 = r4
            r0.zzd = r1
            r1 = r5
            r0.zze = r1
            r1 = r6
            r0.zzf = r1
            r1 = r8
            r0.zzh = r1
            r1 = r10
            r0.zzi = r1
            r1 = r11
            r0.zzj = r1
            r1 = r12
            r0.zzk = r1
            r1 = r13
            r0.zzo = r1
            r1 = r14
            r0.zzl = r1
            r1 = r15
            r0.zzm = r1
            r1 = r16
            r0.zzn = r1
            r1 = r7
            r0.zzg = r1
            r1 = r17
            r0.zzp = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.auth.zzfq, boolean, boolean, int[], int, int, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl, byte[]):void");
    }

    private static Field zzA(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(d.a(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            e.b(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(a.e(sb2, " not found. Known fields are ", arrays));
        }
    }

    private final void zzB(T t10, T t11, int i) {
        long zzv = (long) (zzv(i) & 1048575);
        if (zzG(t11, i)) {
            Object zzf2 = zzgz.zzf(t10, zzv);
            Object zzf3 = zzgz.zzf(t11, zzv);
            if (zzf2 != null && zzf3 != null) {
                zzgz.zzp(t10, zzv, zzev.zzg(zzf2, zzf3));
                zzD(t10, i);
            } else if (zzf3 != null) {
                zzgz.zzp(t10, zzv, zzf3);
                zzD(t10, i);
            }
        }
    }

    private final void zzC(T t10, T t11, int i) {
        int zzv = zzv(i);
        int i10 = this.zzc[i];
        long j10 = (long) (zzv & 1048575);
        if (zzJ(t11, i10, i)) {
            Object zzf2 = zzJ(t10, i10, i) ? zzgz.zzf(t10, j10) : null;
            Object zzf3 = zzgz.zzf(t11, j10);
            if (zzf2 != null && zzf3 != null) {
                zzgz.zzp(t10, j10, zzev.zzg(zzf2, zzf3));
                zzE(t10, i10, i);
            } else if (zzf3 != null) {
                zzgz.zzp(t10, j10, zzf3);
                zzE(t10, i10, i);
            }
        }
    }

    private final void zzD(T t10, int i) {
        int zzs = zzs(i);
        long j10 = (long) (1048575 & zzs);
        if (j10 != 1048575) {
            zzgz.zzn(t10, j10, (1 << (zzs >>> 20)) | zzgz.zzc(t10, j10));
        }
    }

    private final void zzE(T t10, int i, int i10) {
        zzgz.zzn(t10, (long) (zzs(i10) & 1048575), i);
    }

    private final boolean zzF(T t10, T t11, int i) {
        return zzG(t10, i) == zzG(t11, i);
    }

    private final boolean zzG(T t10, int i) {
        int zzs = zzs(i);
        long j10 = (long) (zzs & 1048575);
        if (j10 != 1048575) {
            return (zzgz.zzc(t10, j10) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i);
        long j11 = (long) (zzv & 1048575);
        switch (zzu(zzv)) {
            case 0:
                return zzgz.zza(t10, j11) != Utils.DOUBLE_EPSILON;
            case 1:
                return zzgz.zzb(t10, j11) != 0.0f;
            case 2:
                return zzgz.zzd(t10, j11) != 0;
            case 3:
                return zzgz.zzd(t10, j11) != 0;
            case 4:
                return zzgz.zzc(t10, j11) != 0;
            case 5:
                return zzgz.zzd(t10, j11) != 0;
            case 6:
                return zzgz.zzc(t10, j11) != 0;
            case 7:
                return zzgz.zzt(t10, j11);
            case 8:
                Object zzf2 = zzgz.zzf(t10, j11);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zzeb) {
                    return !zzeb.zzb.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.zzf(t10, j11) != null;
            case 10:
                return !zzeb.zzb.equals(zzgz.zzf(t10, j11));
            case 11:
                return zzgz.zzc(t10, j11) != 0;
            case 12:
                return zzgz.zzc(t10, j11) != 0;
            case 13:
                return zzgz.zzc(t10, j11) != 0;
            case 14:
                return zzgz.zzd(t10, j11) != 0;
            case 15:
                return zzgz.zzc(t10, j11) != 0;
            case 16:
                return zzgz.zzd(t10, j11) != 0;
            case 17:
                return zzgz.zzf(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(T t10, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzG(t10, i) : (i11 & i12) != 0;
    }

    private static boolean zzI(Object obj, int i, zzgb zzgb) {
        return zzgb.zzi(zzgz.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzJ(T t10, int i, int i10) {
        return zzgz.zzc(t10, (long) (zzs(i10) & 1048575)) == i;
    }

    public static zzgq zzc(Object obj) {
        zzeq zzeq = (zzeq) obj;
        zzgq zzgq = zzeq.zzc;
        if (zzgq != zzgq.zza()) {
            return zzgq;
        }
        zzgq zzc2 = zzgq.zzc();
        zzeq.zzc = zzc2;
        return zzc2;
    }

    public static <T> zzft<T> zzj(Class<T> cls, zzfn zzfn, zzfv zzfv, zzfe zzfe, zzgp<?, ?> zzgp, zzeh<?> zzeh, zzfl zzfl) {
        if (zzfn instanceof zzga) {
            return zzk((zzga) zzfn, zzfv, zzfe, zzgp, zzeh, zzfl);
        }
        zzgm zzgm = (zzgm) zzfn;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0379  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.auth.zzft<T> zzk(com.google.android.gms.internal.auth.zzga r33, com.google.android.gms.internal.auth.zzfv r34, com.google.android.gms.internal.auth.zzfe r35, com.google.android.gms.internal.auth.zzgp<?, ?> r36, com.google.android.gms.internal.auth.zzeh<?> r37, com.google.android.gms.internal.auth.zzfl r38) {
        /*
            int r0 = r33.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r33.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = zza
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r32 = r12
            r12 = r9
            r9 = r32
        L_0x0166:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r33.zze()
            com.google.android.gms.internal.auth.zzfq r18 = r33.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0194:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0194
        L_0x01a6:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ae
        L_0x01ac:
            r2 = r24
        L_0x01ae:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01db
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d5
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bc
        L_0x01d5:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r3
            r3 = r24
        L_0x01df:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0296
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0223
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            r31 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r30
            r12 = r31
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r30
            goto L_0x0227
        L_0x0223:
            r31 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzA(r1, r12)
            r17[r3] = r12
        L_0x0269:
            r30 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r3 = r3 + 1
            r8 = r17[r3]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r1, r8)
            r17[r3] = r8
        L_0x0284:
            r3 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r26 = r1
            r29 = r11
            r25 = 1
            r11 = r0
            r0 = r7
            r7 = r3
            r3 = 0
            goto L_0x0391
        L_0x0296:
            r30 = r7
            r14 = r8
            r31 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030e
            r12 = 17
            if (r5 != r12) goto L_0x02ae
            goto L_0x030e
        L_0x02ae:
            r12 = 27
            if (r5 == r12) goto L_0x02fe
            r12 = 49
            if (r5 != r12) goto L_0x02b7
            goto L_0x02fe
        L_0x02b7:
            r12 = 12
            if (r5 == r12) goto L_0x02ee
            r12 = 30
            if (r5 == r12) goto L_0x02ee
            r12 = 44
            if (r5 != r12) goto L_0x02c4
            goto L_0x02ee
        L_0x02c4:
            r12 = 50
            if (r5 != r12) goto L_0x02e4
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e7
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e4:
            r25 = 1
            goto L_0x031b
        L_0x02e7:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031c
        L_0x02ee:
            if (r10 != 0) goto L_0x02e4
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030b
        L_0x02fe:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030b:
            r12 = r27
            goto L_0x031c
        L_0x030e:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031b:
            r12 = r7
        L_0x031c:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0379
            r8 = 17
            if (r5 > r8) goto L_0x0379
            int r8 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0355
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033f:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0351
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r3 = r3 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x033f
        L_0x0351:
            int r8 = r8 << r26
            r3 = r3 | r8
            goto L_0x0357
        L_0x0355:
            r27 = r8
        L_0x0357:
            int r8 = r6 + r6
            int r26 = r3 / 32
            int r26 = r26 + r8
            r8 = r17[r26]
            boolean r11 = r8 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x0366
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x036e
        L_0x0366:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r1, r8)
            r17[r26] = r8
        L_0x036e:
            r11 = r0
            r26 = r1
            long r0 = r15.objectFieldOffset(r8)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0379:
            r11 = r0
            r26 = r1
            r0 = r27
            r27 = r3
            r3 = 0
        L_0x0381:
            r1 = 18
            if (r5 < r1) goto L_0x038f
            r1 = 49
            if (r5 > r1) goto L_0x038f
            int r1 = r23 + 1
            r13[r23] = r7
            r23 = r1
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r1 = r9 + 1
            r30[r9] = r4
            int r4 = r1 + 1
            r8 = r2 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x039e
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r8 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r8
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r7
            r30[r1] = r2
            int r9 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r30[r4] = r0
            r0 = r11
            r8 = r14
            r14 = r24
            r1 = r26
            r4 = r27
            r3 = r28
            r11 = r29
            r7 = r30
            r12 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03ca:
            r30 = r7
            r29 = r11
            r31 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.auth.zzft r0 = new com.google.android.gms.internal.auth.zzft
            r4 = r0
            com.google.android.gms.internal.auth.zzfq r9 = r33.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r30
            r6 = r1
            r7 = r14
            r8 = r31
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzk(com.google.android.gms.internal.auth.zzga, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl):com.google.android.gms.internal.auth.zzft");
    }

    private static <T> int zzl(T t10, long j10) {
        return ((Integer) zzgz.zzf(t10, j10)).intValue();
    }

    private final <K, V> int zzm(T t10, byte[] bArr, int i, int i10, int i11, long j10, zzdp zzdp) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i11);
        Object object = unsafe.getObject(t10, j10);
        if (!((zzfk) object).zze()) {
            zzfk zzb2 = zzfk.zza().zzb();
            zzfl.zza(zzb2, object);
            unsafe.putObject(t10, j10, zzb2);
        }
        zzfj zzfj = (zzfj) zzz;
        throw null;
    }

    private final int zzn(T t10, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, zzdp zzdp) throws IOException {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i17 = i;
        int i18 = i11;
        int i19 = i12;
        int i20 = i13;
        long j11 = j10;
        int i21 = i16;
        zzdp zzdp2 = zzdp;
        Unsafe unsafe = zzb;
        long j12 = (long) (this.zzc[i21 + 2] & 1048575);
        switch (i15) {
            case 51:
                if (i20 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(Double.longBitsToDouble(zzdq.zzn(bArr, i))));
                    unsafe.putInt(t11, j12, i19);
                    return i17 + 8;
                }
                break;
            case 52:
                if (i20 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(Float.intBitsToFloat(zzdq.zzb(bArr, i))));
                    unsafe.putInt(t11, j12, i19);
                    return i17 + 4;
                }
                break;
            case 53:
            case 54:
                if (i20 == 0) {
                    int zzm2 = zzdq.zzm(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, Long.valueOf(zzdp2.zzb));
                    unsafe.putInt(t11, j12, i19);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i20 == 0) {
                    int zzj2 = zzdq.zzj(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, Integer.valueOf(zzdp2.zza));
                    unsafe.putInt(t11, j12, i19);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i20 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(zzdq.zzn(bArr, i)));
                    unsafe.putInt(t11, j12, i19);
                    return i17 + 8;
                }
                break;
            case 57:
            case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                if (i20 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(zzdq.zzb(bArr, i)));
                    unsafe.putInt(t11, j12, i19);
                    return i17 + 4;
                }
                break;
            case 58:
                if (i20 == 0) {
                    int zzm3 = zzdq.zzm(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(zzdp2.zzb != 0));
                    unsafe.putInt(t11, j12, i19);
                    return zzm3;
                }
                break;
            case 59:
                if (i20 == 2) {
                    int zzj3 = zzdq.zzj(bArr2, i17, zzdp2);
                    int i22 = zzdp2.zza;
                    if (i22 == 0) {
                        unsafe.putObject(t11, j11, BuildConfig.FLAVOR);
                    } else if ((i14 & 536870912) == 0 || zzhd.zzd(bArr2, zzj3, zzj3 + i22)) {
                        unsafe.putObject(t11, j11, new String(bArr2, zzj3, i22, zzev.zza));
                        zzj3 += i22;
                    } else {
                        throw zzew.zzb();
                    }
                    unsafe.putInt(t11, j12, i19);
                    return zzj3;
                }
                break;
            case 60:
                if (i20 == 2) {
                    int zzd2 = zzdq.zzd(zzy(i21), bArr2, i17, i10, zzdp2);
                    Object object = unsafe.getInt(t11, j12) == i19 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, zzdp2.zzc);
                    } else {
                        unsafe.putObject(t11, j11, zzev.zzg(object, zzdp2.zzc));
                    }
                    unsafe.putInt(t11, j12, i19);
                    return zzd2;
                }
                break;
            case 61:
                if (i20 == 2) {
                    int zza2 = zzdq.zza(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, zzdp2.zzc);
                    unsafe.putInt(t11, j12, i19);
                    return zza2;
                }
                break;
            case 63:
                if (i20 == 0) {
                    int zzj4 = zzdq.zzj(bArr2, i17, zzdp2);
                    int i23 = zzdp2.zza;
                    zzet zzx = zzx(i21);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i23));
                        unsafe.putInt(t11, j12, i19);
                    } else {
                        zzc(t10).zzf(i18, Long.valueOf((long) i23));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i20 == 0) {
                    int zzj5 = zzdq.zzj(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, Integer.valueOf(zzee.zzb(zzdp2.zza)));
                    unsafe.putInt(t11, j12, i19);
                    return zzj5;
                }
                break;
            case 67:
                if (i20 == 0) {
                    int zzm4 = zzdq.zzm(bArr2, i17, zzdp2);
                    unsafe.putObject(t11, j11, Long.valueOf(zzee.zzc(zzdp2.zzb)));
                    unsafe.putInt(t11, j12, i19);
                    return zzm4;
                }
                break;
            case 68:
                if (i20 == 3) {
                    int zzc2 = zzdq.zzc(zzy(i21), bArr, i, i10, (i18 & -8) | 4, zzdp);
                    Object object2 = unsafe.getInt(t11, j12) == i19 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, zzdp2.zzc);
                    } else {
                        unsafe.putObject(t11, j11, zzev.zzg(object2, zzdp2.zzc));
                    }
                    unsafe.putInt(t11, j12, i19);
                    return zzc2;
                }
                break;
        }
        return i17;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a9, code lost:
        if (r0 != r15) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f4, code lost:
        if (r0 != r15) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0317, code lost:
        if (r0 != r15) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f9, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fd, code lost:
        r1 = r20;
        r8 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0186, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r8 = r19;
        r1 = r20;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020d, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
        r18 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzo(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.auth.zzdp r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x0341
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.auth.zzdq.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003b
            int r2 = r2 / 3
            int r0 = r15.zzr(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.zzq(r5)
        L_0x003f:
            r2 = r0
            if (r2 != r10) goto L_0x004d
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = r10
            r19 = r16
            goto L_0x031a
        L_0x004d:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzu(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0216
            int[] r10 = r15.zzc
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x008f
            r23 = r1
            r20 = r2
            if (r7 == r13) goto L_0x0080
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0082
        L_0x0080:
            r7 = r19
        L_0x0082:
            if (r10 == r13) goto L_0x0089
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x0089:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0095
        L_0x008f:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x0095:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01f5;
                case 1: goto L_0x01df;
                case 2: goto L_0x01c2;
                case 3: goto L_0x01c2;
                case 4: goto L_0x01b0;
                case 5: goto L_0x0195;
                case 6: goto L_0x0173;
                case 7: goto L_0x0156;
                case 8: goto L_0x0136;
                case 9: goto L_0x0104;
                case 10: goto L_0x00e9;
                case 11: goto L_0x01b0;
                case 12: goto L_0x00d9;
                case 13: goto L_0x0173;
                case 14: goto L_0x0195;
                case 15: goto L_0x00c5;
                case 16: goto L_0x00a1;
                default: goto L_0x0099;
            }
        L_0x0099:
            r19 = r13
            r13 = r20
            r20 = r33
            goto L_0x020d
        L_0x00a1:
            if (r3 != 0) goto L_0x00bf
            int r17 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r4 = com.google.android.gms.internal.auth.zzee.zzc(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x00fd
        L_0x00bf:
            r13 = r20
            r20 = r33
            goto L_0x0131
        L_0x00c5:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0131
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.auth.zzee.zzb(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x00f9
        L_0x00d9:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0131
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x00f9
        L_0x00e9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0131
            int r0 = com.google.android.gms.internal.auth.zzdq.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
        L_0x00f9:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
        L_0x00fd:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x025e
        L_0x0104:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x012f
            com.google.android.gms.internal.auth.zzgb r0 = r15.zzy(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.auth.zzdq.zzd(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x0125
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x0186
        L_0x0125:
            java.lang.Object r3 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzev.zzg(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x0186
        L_0x012f:
            r2 = r34
        L_0x0131:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020d
        L_0x0136:
            r2 = r34
            r19 = r13
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x020d
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.auth.zzdq.zzg(r12, r4, r11)
            goto L_0x0150
        L_0x014c:
            int r0 = com.google.android.gms.internal.auth.zzdq.zzh(r12, r4, r11)
        L_0x0150:
            java.lang.Object r1 = r11.zzc
            r10.putObject(r14, r8, r1)
            goto L_0x0186
        L_0x0156:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x020d
            int r0 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r4, r11)
            long r3 = r11.zzb
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r5 = r16
        L_0x016f:
            com.google.android.gms.internal.auth.zzgz.zzk(r14, r8, r5)
            goto L_0x0186
        L_0x0173:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r1) goto L_0x020d
            int r0 = com.google.android.gms.internal.auth.zzdq.zzb(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x0186:
            r6 = r6 | r21
            r9 = r10
            r8 = r19
            r1 = r20
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x0019
        L_0x0195:
            r2 = r34
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r5) goto L_0x020d
            long r22 = com.google.android.gms.internal.auth.zzdq.zzn(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x020a
        L_0x01b0:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x020d
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r4, r11)
            int r1 = r11.zza
            r10.putInt(r14, r8, r1)
            goto L_0x020a
        L_0x01c2:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x020d
            int r17 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r4, r11)
            long r4 = r11.zzb
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x025a
        L_0x01df:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r1) goto L_0x020d
            int r0 = com.google.android.gms.internal.auth.zzdq.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.auth.zzgz.zzm(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x020a
        L_0x01f5:
            r19 = r13
            r13 = r20
            r20 = r33
            if (r3 != r5) goto L_0x020d
            long r0 = com.google.android.gms.internal.auth.zzdq.zzn(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.auth.zzgz.zzl(r14, r8, r0)
            int r0 = r4 + 8
        L_0x020a:
            r6 = r6 | r21
            goto L_0x0258
        L_0x020d:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x031a
        L_0x0216:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0270
            r1 = 2
            if (r3 != r1) goto L_0x0263
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.auth.zzeu r0 = (com.google.android.gms.internal.auth.zzeu) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0244
            int r1 = r0.size()
            if (r1 != 0) goto L_0x023c
            r1 = 10
            goto L_0x023d
        L_0x023c:
            int r1 = r1 + r1
        L_0x023d:
            com.google.android.gms.internal.auth.zzeu r0 = r0.zzd(r1)
            r10.putObject(r14, r8, r0)
        L_0x0244:
            r5 = r0
            com.google.android.gms.internal.auth.zzgb r0 = r15.zzy(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.auth.zzdq.zze(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0258:
            r9 = r10
            r2 = r13
        L_0x025a:
            r8 = r19
            r1 = r20
        L_0x025e:
            r10 = -1
            r13 = r34
            goto L_0x0019
        L_0x0263:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02f7
        L_0x0270:
            r1 = 49
            if (r0 > r1) goto L_0x02c3
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = r19
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.zzp(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02c1
        L_0x02ab:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x033a
        L_0x02c1:
            r2 = r0
            goto L_0x02f8
        L_0x02c3:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02fd
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x02f7
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            int r0 = r0.zzm(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02c1
            goto L_0x02ab
        L_0x02f7:
            r2 = r15
        L_0x02f8:
            r6 = r24
            r7 = r25
            goto L_0x031a
        L_0x02fd:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02c1
            goto L_0x02ab
        L_0x031a:
            com.google.android.gms.internal.auth.zzgq r4 = zzc(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.auth.zzdq.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r10 = r18
            r2 = r19
            r1 = r20
        L_0x033a:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0341:
            r24 = r6
            r1 = r8
            r28 = r9
            if (r7 == r1) goto L_0x0352
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0352:
            r1 = r34
            if (r0 != r1) goto L_0x0357
            return r0
        L_0x0357:
            com.google.android.gms.internal.auth.zzew r0 = com.google.android.gms.internal.auth.zzew.zzd()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzo(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzp(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzdp r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.auth.zzeu r12 = (com.google.android.gms.internal.auth.zzeu) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.auth.zzeu r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.auth.zzgb r1 = r15.zzy(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.auth.zzdq.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.auth.zzee.zzc(r4)
            r12.zze(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.auth.zzee.zzc(r8)
            r12.zze(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.auth.zzee.zzc(r8)
            r12.zze(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.auth.zzer r12 = (com.google.android.gms.internal.auth.zzer) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzee.zzb(r4)
            r12.zze(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.auth.zzer r12 = (com.google.android.gms.internal.auth.zzer) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzee.zzb(r4)
            r12.zze(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzee.zzb(r4)
            r12.zze(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.auth.zzdq.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.auth.zzdq.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.auth.zzeq r1 = (com.google.android.gms.internal.auth.zzeq) r1
            com.google.android.gms.internal.auth.zzgq r3 = r1.zzc
            com.google.android.gms.internal.auth.zzgq r4 = com.google.android.gms.internal.auth.zzgq.zza()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.auth.zzet r4 = r15.zzx(r8)
            com.google.android.gms.internal.auth.zzgp<?, ?> r5 = r0.zzm
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgd.zzd(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.auth.zzgq r3 = (com.google.android.gms.internal.auth.zzgq) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.auth.zzeb r4 = com.google.android.gms.internal.auth.zzeb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.auth.zzeb r6 = com.google.android.gms.internal.auth.zzeb.zzk(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.auth.zzeb r4 = com.google.android.gms.internal.auth.zzeb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.auth.zzeb r6 = com.google.android.gms.internal.auth.zzeb.zzk(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.auth.zzgb r1 = r15.zzy(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.auth.zzdq.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01fa
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01c2
            r12.add(r6)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.auth.zzev.zza
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cc:
            int r1 = r1 + r4
        L_0x01cd:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01e5
            r12.add(r6)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.auth.zzev.zza
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x01fa:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0255
            if (r4 != 0) goto L_0x0208
            r12.add(r6)
            goto L_0x021b
        L_0x0208:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.auth.zzhd.zzd(r3, r1, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.auth.zzev.zza
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021a:
            r1 = r8
        L_0x021b:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x0233
            r12.add(r6)
            goto L_0x021b
        L_0x0233:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.auth.zzhd.zzd(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.auth.zzev.zza
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzb()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzb()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzc()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.auth.zzdr r12 = (com.google.android.gms.internal.auth.zzdr) r12
            int r2 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r2, r7)
            long r5 = r7.zzb
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0274
            r5 = r13
            goto L_0x0275
        L_0x0274:
            r5 = r1
        L_0x0275:
            r12.zze(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.auth.zzdr r12 = (com.google.android.gms.internal.auth.zzdr) r12
            int r4 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = r13
            goto L_0x0294
        L_0x0293:
            r6 = r1
        L_0x0294:
            r12.zze(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r12.zze(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.auth.zzer r12 = (com.google.android.gms.internal.auth.zzer) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.auth.zzdq.zzb(r3, r1)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.auth.zzer r12 = (com.google.android.gms.internal.auth.zzer) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzb(r17, r18)
            r12.zze(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzb(r3, r4)
            r12.zze(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.auth.zzdq.zzn(r3, r1)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            long r8 = com.google.android.gms.internal.auth.zzdq.zzn(r17, r18)
            r12.zze(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.auth.zzdq.zzn(r3, r4)
            r12.zze(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.auth.zzdq.zzf(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.auth.zzdq.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zze(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.auth.zzff r12 = (com.google.android.gms.internal.auth.zzff) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zze(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zze(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.auth.zzem r12 = (com.google.android.gms.internal.auth.zzem) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.auth.zzdq.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.auth.zzem r12 = (com.google.android.gms.internal.auth.zzem) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.auth.zzdq.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.auth.zzef r12 = (com.google.android.gms.internal.auth.zzef) r12
            int r1 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.auth.zzdq.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.auth.zzew r1 = com.google.android.gms.internal.auth.zzew.zzf()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.auth.zzef r12 = (com.google.android.gms.internal.auth.zzef) r12
            long r8 = com.google.android.gms.internal.auth.zzdq.zzn(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.auth.zzdq.zzn(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.auth.zzdq.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.auth.zzdq.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzdp):int");
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, 0);
    }

    private final int zzr(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzt(i, i10);
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private final int zzt(int i, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i == i13) {
                return i12;
            }
            if (i < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzv(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzw(T t10, long j10) {
        return ((Long) zzgz.zzf(t10, j10)).longValue();
    }

    private final zzet zzx(int i) {
        int i10 = i / 3;
        return (zzet) this.zzd[i10 + i10 + 1];
    }

    private final zzgb zzy(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzgb zzgb = (zzgb) this.zzd[i11];
        if (zzgb != null) {
            return zzgb;
        }
        zzgb zzb2 = zzfy.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0205, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0236, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0238, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x023c
            int r3 = r8.zzv(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzu(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0228;
                case 1: goto L_0x021d;
                case 2: goto L_0x0212;
                case 3: goto L_0x0207;
                case 4: goto L_0x01ff;
                case 5: goto L_0x01f4;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01e2;
                case 8: goto L_0x01d5;
                case 9: goto L_0x01c7;
                case 10: goto L_0x01bb;
                case 11: goto L_0x01b4;
                case 12: goto L_0x01ad;
                case 13: goto L_0x01a6;
                case 14: goto L_0x019a;
                case 15: goto L_0x0192;
                case 16: goto L_0x0186;
                case 17: goto L_0x017b;
                case 18: goto L_0x016f;
                case 19: goto L_0x016f;
                case 20: goto L_0x016f;
                case 21: goto L_0x016f;
                case 22: goto L_0x016f;
                case 23: goto L_0x016f;
                case 24: goto L_0x016f;
                case 25: goto L_0x016f;
                case 26: goto L_0x016f;
                case 27: goto L_0x016f;
                case 28: goto L_0x016f;
                case 29: goto L_0x016f;
                case 30: goto L_0x016f;
                case 31: goto L_0x016f;
                case 32: goto L_0x016f;
                case 33: goto L_0x016f;
                case 34: goto L_0x016f;
                case 35: goto L_0x016f;
                case 36: goto L_0x016f;
                case 37: goto L_0x016f;
                case 38: goto L_0x016f;
                case 39: goto L_0x016f;
                case 40: goto L_0x016f;
                case 41: goto L_0x016f;
                case 42: goto L_0x016f;
                case 43: goto L_0x016f;
                case 44: goto L_0x016f;
                case 45: goto L_0x016f;
                case 46: goto L_0x016f;
                case 47: goto L_0x016f;
                case 48: goto L_0x016f;
                case 49: goto L_0x016f;
                case 50: goto L_0x0163;
                case 51: goto L_0x0147;
                case 52: goto L_0x012f;
                case 53: goto L_0x011d;
                case 54: goto L_0x010b;
                case 55: goto L_0x00fd;
                case 56: goto L_0x00eb;
                case 57: goto L_0x00dd;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0238
        L_0x001f:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x0031:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x0043:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x0051:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x0063:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x0071:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x007f:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x008d:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x009f:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x00b1:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x00c5:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r3 = com.google.android.gms.internal.auth.zzev.zza(r3)
            goto L_0x0236
        L_0x00dd:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x00eb:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x00fd:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0205
        L_0x010b:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x011d:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x012f:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0236
        L_0x0147:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x0238
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x0163:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x016f:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x017b:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            if (r3 == 0) goto L_0x01d1
            int r7 = r3.hashCode()
            goto L_0x01d1
        L_0x0186:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x0192:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
            goto L_0x0205
        L_0x019a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x01a6:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
            goto L_0x0205
        L_0x01ad:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
            goto L_0x0205
        L_0x01b4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
            goto L_0x0205
        L_0x01bb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x01c7:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            if (r3 == 0) goto L_0x01d1
            int r7 = r3.hashCode()
        L_0x01d1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0238
        L_0x01d5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgz.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0236
        L_0x01e2:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.auth.zzgz.zzt(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zza(r3)
            goto L_0x0236
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
            goto L_0x0205
        L_0x01f4:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x01ff:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzgz.zzc(r9, r5)
        L_0x0205:
            int r2 = r2 + r3
            goto L_0x0238
        L_0x0207:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x0212:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzgz.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
            goto L_0x0236
        L_0x021d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.auth.zzgz.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0236
        L_0x0228:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.auth.zzgz.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.auth.zzev.zzc(r3)
        L_0x0236:
            int r3 = r3 + r2
            r2 = r3
        L_0x0238:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x023c:
            int r2 = r2 * 53
            com.google.android.gms.internal.auth.zzgp<?, ?> r0 = r8.zzm
            java.lang.Object r9 = r0.zza(r9)
            int r9 = r9.hashCode()
            int r9 = r9 + r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zza(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0324, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033e, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0368, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x038a, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f1, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0228, code lost:
        r5 = r6 | r22;
        r6 = r31;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0262, code lost:
        r5 = r6 | r22;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0266, code lost:
        r3 = r8;
        r1 = r11;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0282, code lost:
        r7 = r33;
        r22 = r6;
        r20 = r8;
        r27 = r10;
        r8 = r11;
        r17 = r18;
        r6 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.auth.zzdp r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r31
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x03bb
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.auth.zzdq.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x0039
            int r3 = r3 / r8
            int r2 = r15.zzr(r0, r3)
            goto L_0x003d
        L_0x0039:
            int r2 = r15.zzq(r0)
        L_0x003d:
            r3 = -1
            if (r2 != r3) goto L_0x004f
            r19 = r0
            r2 = r1
            r17 = r3
            r8 = r4
            r22 = r5
            r27 = r10
            r7 = r11
            r20 = r16
            goto L_0x038d
        L_0x004f:
            int[] r3 = r15.zzc
            int r19 = r2 + 1
            r3 = r3[r19]
            int r8 = zzu(r3)
            r19 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r17
            r21 = r3
            r20 = r4
            long r3 = (long) r0
            r0 = 17
            if (r8 > r0) goto L_0x0291
            int[] r0 = r15.zzc
            int r22 = r2 + 2
            r0 = r0[r22]
            int r22 = r0 >>> 20
            r11 = 1
            int r22 = r11 << r22
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0087
            if (r6 == r11) goto L_0x0080
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0080:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r11 = r0
            goto L_0x0088
        L_0x0087:
            r11 = r6
        L_0x0088:
            r6 = r5
            r0 = 5
            switch(r8) {
                case 0: goto L_0x0248;
                case 1: goto L_0x022e;
                case 2: goto L_0x020b;
                case 3: goto L_0x020b;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01d3;
                case 6: goto L_0x01bd;
                case 7: goto L_0x019d;
                case 8: goto L_0x017b;
                case 9: goto L_0x014d;
                case 10: goto L_0x0136;
                case 11: goto L_0x01f4;
                case 12: goto L_0x00fe;
                case 13: goto L_0x01bd;
                case 14: goto L_0x01d3;
                case 15: goto L_0x00e4;
                case 16: goto L_0x00b9;
                default: goto L_0x008d;
            }
        L_0x008d:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 3
            r18 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0282
            com.google.android.gms.internal.auth.zzgb r0 = r15.zzy(r8)
            int r1 = r19 << 3
            r5 = r1 | 4
            r1 = r30
            r12 = r3
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.auth.zzdq.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x026c
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x0279
        L_0x00b9:
            if (r7 != 0) goto L_0x00d9
            r12 = r30
            int r7 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r23 = com.google.android.gms.internal.auth.zzee.zzc(r0)
            r0 = r10
            r1 = r29
            r8 = r2
            r18 = -1
            r2 = r3
            r31 = r11
            r11 = r20
            r4 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0228
        L_0x00d9:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            goto L_0x01f1
        L_0x00e4:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            if (r7 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.auth.zzee.zzb(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0262
        L_0x00fe:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            if (r7 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.auth.zzet r2 = r15.zzx(r8)
            if (r2 == 0) goto L_0x0131
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x011c
            goto L_0x0131
        L_0x011c:
            com.google.android.gms.internal.auth.zzgq r2 = zzc(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzf(r11, r1)
            r5 = r6
            r3 = r8
            r1 = r11
            r2 = r19
            r6 = r31
            goto L_0x02e0
        L_0x0131:
            r10.putInt(r14, r3, r1)
            goto L_0x0262
        L_0x0136:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.auth.zzdq.zza(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0262
        L_0x014d:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01f1
            com.google.android.gms.internal.auth.zzgb r0 = r15.zzy(r8)
            int r0 = com.google.android.gms.internal.auth.zzdq.zzd(r0, r12, r1, r13, r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x016c
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0262
        L_0x016c:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzev.zzg(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x0262
        L_0x017b:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 2
            r18 = -1
            if (r7 != r0) goto L_0x01f1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0192
            int r0 = com.google.android.gms.internal.auth.zzdq.zzg(r12, r1, r9)
            goto L_0x0196
        L_0x0192:
            int r0 = com.google.android.gms.internal.auth.zzdq.zzh(r12, r1, r9)
        L_0x0196:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r3, r1)
            goto L_0x0262
        L_0x019d:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            if (r7 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r1, r9)
            long r1 = r9.zzb
            r20 = 0
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01b6
            r1 = 1
            goto L_0x01b8
        L_0x01b6:
            r1 = r16
        L_0x01b8:
            com.google.android.gms.internal.auth.zzgz.zzk(r14, r3, r1)
            goto L_0x0262
        L_0x01bd:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            if (r7 != r0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.auth.zzdq.zzb(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
            goto L_0x0262
        L_0x01d3:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 1
            r18 = -1
            if (r7 != r0) goto L_0x01f1
            long r20 = com.google.android.gms.internal.auth.zzdq.zzn(r12, r1)
            r0 = r10
            r7 = r1
            r1 = r29
            r2 = r3
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0262
        L_0x01f1:
            r2 = r1
            goto L_0x0282
        L_0x01f4:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            r2 = r1
            if (r7 != 0) goto L_0x0282
            int r0 = com.google.android.gms.internal.auth.zzdq.zzj(r12, r2, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x0262
        L_0x020b:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            r2 = r1
            if (r7 != 0) goto L_0x0282
            int r7 = com.google.android.gms.internal.auth.zzdq.zzm(r12, r2, r9)
            long r1 = r9.zzb
            r0 = r10
            r20 = r1
            r1 = r29
            r2 = r3
            r4 = r20
            r0.putLong(r1, r2, r4)
        L_0x0228:
            r5 = r6 | r22
            r6 = r31
            r0 = r7
            goto L_0x0266
        L_0x022e:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r18 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0282
            int r0 = com.google.android.gms.internal.auth.zzdq.zzb(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.auth.zzgz.zzm(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x0262
        L_0x0248:
            r12 = r30
            r8 = r2
            r31 = r11
            r11 = r20
            r0 = 1
            r18 = -1
            r2 = r1
            if (r7 != r0) goto L_0x0282
            long r0 = com.google.android.gms.internal.auth.zzdq.zzn(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.auth.zzgz.zzl(r14, r3, r0)
            int r0 = r2 + 8
        L_0x0262:
            r5 = r6 | r22
            r6 = r31
        L_0x0266:
            r3 = r8
            r1 = r11
            r2 = r19
            goto L_0x02e0
        L_0x026c:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzev.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x0279:
            r5 = r6 | r22
            r12 = r30
            r6 = r31
            r13 = r32
            goto L_0x0266
        L_0x0282:
            r7 = r33
            r22 = r6
            r20 = r8
            r27 = r10
            r8 = r11
            r17 = r18
            r6 = r31
            goto L_0x038d
        L_0x0291:
            r12 = r3
            r11 = r20
            r18 = -1
            r4 = r2
            r2 = r1
            r0 = 27
            if (r8 != r0) goto L_0x02f3
            r0 = 2
            if (r7 != r0) goto L_0x02e4
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.auth.zzeu r0 = (com.google.android.gms.internal.auth.zzeu) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02bc
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02b4
            r1 = 10
            goto L_0x02b5
        L_0x02b4:
            int r1 = r1 + r1
        L_0x02b5:
            com.google.android.gms.internal.auth.zzeu r0 = r0.zzd(r1)
            r10.putObject(r14, r12, r0)
        L_0x02bc:
            r7 = r0
            com.google.android.gms.internal.auth.zzgb r0 = r15.zzy(r4)
            r1 = r11
            r3 = r2
            r2 = r30
            r20 = r4
            r4 = r32
            r22 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.auth.zzdq.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r24
        L_0x02e0:
            r11 = r33
            goto L_0x001a
        L_0x02e4:
            r20 = r4
            r22 = r5
            r24 = r6
            r15 = r2
            r27 = r10
            r17 = r18
            r18 = r11
            goto L_0x036b
        L_0x02f3:
            r3 = r2
            r20 = r4
            r22 = r5
            r24 = r6
            r0 = 49
            if (r8 > r0) goto L_0x0342
            r4 = r21
            long r5 = (long) r4
            r0 = r28
            r1 = r29
            r2 = r30
            r4 = r3
            r15 = r4
            r4 = r32
            r25 = r5
            r5 = r11
            r6 = r19
            r31 = r8
            r17 = r18
            r8 = r20
            r27 = r10
            r9 = r25
            r18 = r11
            r11 = r31
            r14 = r34
            int r0 = r0.zzp(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x033e
        L_0x0326:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r24
            goto L_0x03b7
        L_0x033e:
            r7 = r33
            r2 = r0
            goto L_0x036e
        L_0x0342:
            r15 = r3
            r31 = r8
            r27 = r10
            r17 = r18
            r4 = r21
            r18 = r11
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x0373
            r0 = 2
            if (r7 != r0) goto L_0x036b
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r20
            r6 = r12
            r8 = r34
            int r0 = r0.zzm(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x033e
            goto L_0x0326
        L_0x036b:
            r7 = r33
            r2 = r15
        L_0x036e:
            r8 = r18
            r6 = r24
            goto L_0x038d
        L_0x0373:
            r0 = r28
            r1 = r29
            r2 = r30
            r8 = r4
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r19
            r10 = r12
            r12 = r20
            r13 = r34
            int r0 = r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x033e
            goto L_0x0326
        L_0x038d:
            if (r8 != r7) goto L_0x0396
            if (r7 == 0) goto L_0x0396
            r0 = r2
            r1 = r8
            r5 = r22
            goto L_0x03c2
        L_0x0396:
            com.google.android.gms.internal.auth.zzgq r4 = zzc(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.auth.zzdq.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r9 = r34
            r11 = r7
            r1 = r8
            r2 = r19
            r3 = r20
            r5 = r22
        L_0x03b7:
            r10 = r27
            goto L_0x001a
        L_0x03bb:
            r22 = r5
            r24 = r6
            r27 = r10
            r7 = r11
        L_0x03c2:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x03d0
            long r3 = (long) r6
            r6 = r29
            r8 = r27
            r8.putInt(r6, r3, r5)
            goto L_0x03d2
        L_0x03d0:
            r6 = r29
        L_0x03d2:
            r3 = r28
            int r4 = r3.zzj
        L_0x03d6:
            int r5 = r3.zzk
            if (r4 >= r5) goto L_0x0402
            int[] r5 = r3.zzi
            r5 = r5[r4]
            int[] r8 = r3.zzc
            r8 = r8[r5]
            int r8 = r3.zzv(r5)
            r8 = r8 & r2
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzgz.zzf(r6, r8)
            if (r8 != 0) goto L_0x03ef
            goto L_0x03f5
        L_0x03ef:
            com.google.android.gms.internal.auth.zzet r9 = r3.zzx(r5)
            if (r9 != 0) goto L_0x03f8
        L_0x03f5:
            int r4 = r4 + 1
            goto L_0x03d6
        L_0x03f8:
            com.google.android.gms.internal.auth.zzfk r8 = (com.google.android.gms.internal.auth.zzfk) r8
            java.lang.Object r0 = r3.zzz(r5)
            com.google.android.gms.internal.auth.zzfj r0 = (com.google.android.gms.internal.auth.zzfj) r0
            r0 = 0
            throw r0
        L_0x0402:
            if (r7 != 0) goto L_0x040e
            r2 = r32
            if (r0 != r2) goto L_0x0409
            goto L_0x0414
        L_0x0409:
            com.google.android.gms.internal.auth.zzew r0 = com.google.android.gms.internal.auth.zzew.zzd()
            throw r0
        L_0x040e:
            r2 = r32
            if (r0 > r2) goto L_0x0415
            if (r1 != r7) goto L_0x0415
        L_0x0414:
            return r0
        L_0x0415:
            com.google.android.gms.internal.auth.zzew r0 = com.google.android.gms.internal.auth.zzew.zzd()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    public final T zzd() {
        return ((zzeq) this.zzg).zzj(4, (Object) null, (Object) null);
    }

    public final void zze(T t10) {
        int i;
        int i10 = this.zzj;
        while (true) {
            i = this.zzk;
            if (i10 >= i) {
                break;
            }
            long zzv = (long) (zzv(this.zzi[i10]) & 1048575);
            Object zzf2 = zzgz.zzf(t10, zzv);
            if (zzf2 != null) {
                ((zzfk) zzf2).zzc();
                zzgz.zzp(t10, zzv, zzf2);
            }
            i10++;
        }
        int length = this.zzi.length;
        while (i < length) {
            this.zzl.zza(t10, (long) this.zzi[i]);
            i++;
        }
        this.zzm.zze(t10);
    }

    public final void zzf(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzv = zzv(i);
            long j10 = (long) (1048575 & zzv);
            int i10 = this.zzc[i];
            switch (zzu(zzv)) {
                case 0:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzl(t10, j10, zzgz.zza(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 1:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzm(t10, j10, zzgz.zzb(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 2:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 3:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 4:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 5:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 6:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 7:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzk(t10, j10, zzgz.zzt(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 8:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 9:
                    zzB(t10, t11, i);
                    break;
                case 10:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 11:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 12:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 13:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 14:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 15:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 16:
                    if (!zzG(t11, i)) {
                        break;
                    } else {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i);
                        break;
                    }
                case 17:
                    zzB(t10, t11, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(t10, t11, j10);
                    break;
                case 50:
                    zzgd.zzi(this.zzp, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzJ(t11, i10, i)) {
                        break;
                    } else {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzE(t10, i10, i);
                        break;
                    }
                case 60:
                    zzC(t10, t11, i);
                    break;
                case 61:
                case 62:
                case 63:
                case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                case 65:
                case 66:
                case 67:
                    if (!zzJ(t11, i10, i)) {
                        break;
                    } else {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzE(t10, i10, i);
                        break;
                    }
                case 68:
                    zzC(t10, t11, i);
                    break;
            }
        }
        zzgd.zzf(this.zzm, t10, t11);
    }

    public final void zzg(T t10, byte[] bArr, int i, int i10, zzdp zzdp) throws IOException {
        if (this.zzh) {
            zzo(t10, bArr, i, i10, zzdp);
        } else {
            zzb(t10, bArr, i, i10, 0, zzdp);
        }
    }

    public final boolean zzh(T t10, T t11) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzv = zzv(i);
            long j10 = (long) (zzv & 1048575);
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(t10, t11, i) && Double.doubleToLongBits(zzgz.zza(t10, j10)) == Double.doubleToLongBits(zzgz.zza(t11, j10))) {
                        continue;
                    }
                case 1:
                    if (zzF(t10, t11, i) && Float.floatToIntBits(zzgz.zzb(t10, j10)) == Float.floatToIntBits(zzgz.zzb(t11, j10))) {
                        continue;
                    }
                case 2:
                    if (zzF(t10, t11, i) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                case 3:
                    if (zzF(t10, t11, i) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                case 4:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 5:
                    if (zzF(t10, t11, i) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                case 6:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 7:
                    if (zzF(t10, t11, i) && zzgz.zzt(t10, j10) == zzgz.zzt(t11, j10)) {
                        continue;
                    }
                case 8:
                    if (zzF(t10, t11, i) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                case 9:
                    if (zzF(t10, t11, i) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                case 10:
                    if (zzF(t10, t11, i) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                case 11:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 12:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 13:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 14:
                    if (zzF(t10, t11, i) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                case 15:
                    if (zzF(t10, t11, i) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                case 16:
                    if (zzF(t10, t11, i) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                case 17:
                    if (zzF(t10, t11, i) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case R.styleable.MapAttrs_zOrderOnTop /*25*/:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10));
                    break;
                case 50:
                    z = zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = (long) (zzs(i) & 1048575);
                    if (zzgz.zzc(t10, zzs) == zzgz.zzc(t11, zzs) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzm.zza(t10).equals(this.zzm.zza(t11))) {
            return false;
        }
        return true;
    }

    public final boolean zzi(T t10) {
        int i;
        int i10;
        T t11 = t10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.zzj) {
            int i14 = this.zzi[i13];
            int i15 = this.zzc[i14];
            int zzv = zzv(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = zzb.getInt(t11, (long) i17);
                }
                i = i12;
                i10 = i17;
            } else {
                i10 = i11;
                i = i12;
            }
            if ((268435456 & zzv) != 0 && !zzH(t10, i14, i10, i, i18)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(t11, i15, i14) && !zzI(t11, zzv, zzy(i14))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfk) zzgz.zzf(t11, (long) (zzv & 1048575))).isEmpty()) {
                            zzfj zzfj = (zzfj) zzz(i14);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(t11, (long) (zzv & 1048575));
                if (!list.isEmpty()) {
                    zzgb zzy = zzy(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzy.zzi(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzH(t10, i14, i10, i, i18) && !zzI(t11, zzv, zzy(i14))) {
                return false;
            }
            i13++;
            i11 = i10;
            i12 = i;
        }
        return true;
    }
}
