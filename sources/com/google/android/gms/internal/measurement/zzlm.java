package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.maps.R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.jpountz.lz4.LZ4BlockOutputStream;
import sun.misc.Unsafe;

final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i10, zzlj zzlj, boolean z, boolean z10, int[] iArr2, int i11, int i12, zzlo zzlo, zzkx zzkx, zzml zzml, zzjp zzjp, zzle zzle, byte[] bArr) {
        zzlj zzlj2 = zzlj;
        zzjp zzjp2 = zzjp;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i10;
        this.zzi = z;
        boolean z11 = false;
        if (zzjp2 != null && zzjp2.zzc(zzlj)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i11;
        this.zzl = i12;
        this.zzp = zzlo;
        this.zzm = zzkx;
        this.zzn = zzml;
        this.zzo = zzjp2;
        this.zzg = zzlj2;
        this.zzq = zzle;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmv.zzf(obj, j10)).longValue();
    }

    private final zzkg zzD(int i) {
        int i10 = i / 3;
        return (zzkg) this.zzd[i10 + i10 + 1];
    }

    private final zzlu zzE(int i) {
        int i10 = i / 3;
        int i11 = i10 + i10;
        zzlu zzlu = (zzlu) this.zzd[i11];
        if (zzlu != null) {
            return zzlu;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i10 = i / 3;
        return this.zzd[i10 + i10];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = (long) (zzB(i) & 1048575);
        if (zzO(obj2, i)) {
            Object zzf2 = zzmv.zzf(obj, zzB);
            Object zzf3 = zzmv.zzf(obj2, zzB);
            if (zzf2 != null && zzf3 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf2, zzf3));
                zzJ(obj, i);
            } else if (zzf3 != null) {
                zzmv.zzs(obj, zzB, zzf3);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int zzB = zzB(i);
        int i10 = this.zzc[i];
        long j10 = (long) (zzB & 1048575);
        if (zzR(obj2, i10, i)) {
            Object zzf2 = zzR(obj, i10, i) ? zzmv.zzf(obj, j10) : null;
            Object zzf3 = zzmv.zzf(obj2, j10);
            if (zzf2 != null && zzf3 != null) {
                zzmv.zzs(obj, j10, zzkk.zzg(zzf2, zzf3));
                zzK(obj, i10, i);
            } else if (zzf3 != null) {
                zzmv.zzs(obj, j10, zzf3);
                zzK(obj, i10, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j10 = (long) (1048575 & zzy);
        if (j10 != 1048575) {
            zzmv.zzq(obj, j10, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j10));
        }
    }

    private final void zzK(Object obj, int i, int i10) {
        zzmv.zzq(obj, (long) (zzy(i10) & 1048575), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044c, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r13 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzL(java.lang.Object r17, com.google.android.gms.internal.measurement.zznd r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.zzh
            if (r3 != 0) goto L_0x045d
            int[] r3 = r0.zzc
            int r3 = r3.length
            sun.misc.Unsafe r4 = zzb
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0453
            int r10 = r0.zzB(r7)
            int[] r11 = r0.zzc
            r12 = r11[r7]
            int r13 = zzA(r10)
            r14 = 17
            r15 = 1
            if (r13 > r14) goto L_0x003b
            int r14 = r7 + 2
            r11 = r11[r14]
            r14 = r11 & r5
            if (r14 == r9) goto L_0x0036
            long r8 = (long) r14
            int r8 = r4.getInt(r1, r8)
            r9 = r14
        L_0x0036:
            int r11 = r11 >>> 20
            int r11 = r15 << r11
            goto L_0x003c
        L_0x003b:
            r11 = 0
        L_0x003c:
            r10 = r10 & r5
            long r5 = (long) r10
            switch(r13) {
                case 0: goto L_0x0440;
                case 1: goto L_0x0433;
                case 2: goto L_0x0426;
                case 3: goto L_0x0419;
                case 4: goto L_0x040c;
                case 5: goto L_0x03ff;
                case 6: goto L_0x03f2;
                case 7: goto L_0x03e5;
                case 8: goto L_0x03d7;
                case 9: goto L_0x03c5;
                case 10: goto L_0x03b5;
                case 11: goto L_0x03a7;
                case 12: goto L_0x0399;
                case 13: goto L_0x038b;
                case 14: goto L_0x037d;
                case 15: goto L_0x036f;
                case 16: goto L_0x0361;
                case 17: goto L_0x034f;
                case 18: goto L_0x033f;
                case 19: goto L_0x032f;
                case 20: goto L_0x031f;
                case 21: goto L_0x030f;
                case 22: goto L_0x02ff;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02df;
                case 25: goto L_0x02cf;
                case 26: goto L_0x02c0;
                case 27: goto L_0x02ad;
                case 28: goto L_0x029e;
                case 29: goto L_0x028d;
                case 30: goto L_0x027e;
                case 31: goto L_0x026f;
                case 32: goto L_0x0260;
                case 33: goto L_0x0251;
                case 34: goto L_0x0242;
                case 35: goto L_0x0233;
                case 36: goto L_0x0224;
                case 37: goto L_0x0215;
                case 38: goto L_0x0206;
                case 39: goto L_0x01f7;
                case 40: goto L_0x01e8;
                case 41: goto L_0x01d9;
                case 42: goto L_0x01ca;
                case 43: goto L_0x01bb;
                case 44: goto L_0x01ac;
                case 45: goto L_0x019d;
                case 46: goto L_0x018e;
                case 47: goto L_0x017f;
                case 48: goto L_0x0170;
                case 49: goto L_0x015d;
                case 50: goto L_0x0154;
                case 51: goto L_0x0145;
                case 52: goto L_0x0136;
                case 53: goto L_0x0127;
                case 54: goto L_0x0118;
                case 55: goto L_0x0109;
                case 56: goto L_0x00fa;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00aa;
                case 62: goto L_0x009c;
                case 63: goto L_0x008e;
                case 64: goto L_0x0080;
                case 65: goto L_0x0072;
                case 66: goto L_0x0064;
                case 67: goto L_0x0056;
                case 68: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            r13 = 0
            goto L_0x044c
        L_0x0044:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            r2.zzq(r12, r5, r6)
            goto L_0x0041
        L_0x0056:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = zzC(r1, r5)
            r2.zzC(r12, r5)
            goto L_0x0041
        L_0x0064:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzA(r12, r5)
            goto L_0x0041
        L_0x0072:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = zzC(r1, r5)
            r2.zzy(r12, r5)
            goto L_0x0041
        L_0x0080:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzw(r12, r5)
            goto L_0x0041
        L_0x008e:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzi(r12, r5)
            goto L_0x0041
        L_0x009c:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzH(r12, r5)
            goto L_0x0041
        L_0x00aa:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzjb r5 = (com.google.android.gms.internal.measurement.zzjb) r5
            r2.zzd(r12, r5)
            goto L_0x0041
        L_0x00ba:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            r2.zzv(r12, r5, r6)
            goto L_0x0041
        L_0x00cd:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            zzT(r12, r5, r2)
            goto L_0x0041
        L_0x00dc:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            boolean r5 = zzS(r1, r5)
            r2.zzb(r12, r5)
            goto L_0x0041
        L_0x00eb:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzk(r12, r5)
            goto L_0x0041
        L_0x00fa:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = zzC(r1, r5)
            r2.zzm(r12, r5)
            goto L_0x0041
        L_0x0109:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = zzr(r1, r5)
            r2.zzr(r12, r5)
            goto L_0x0041
        L_0x0118:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = zzC(r1, r5)
            r2.zzJ(r12, r5)
            goto L_0x0041
        L_0x0127:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = zzC(r1, r5)
            r2.zzt(r12, r5)
            goto L_0x0041
        L_0x0136:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            float r5 = zzo(r1, r5)
            r2.zzo(r12, r5)
            goto L_0x0041
        L_0x0145:
            boolean r10 = r0.zzR(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            double r5 = zzn(r1, r5)
            r2.zzf(r12, r5)
            goto L_0x0041
        L_0x0154:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.zzM(r2, r12, r5, r7)
            goto L_0x0041
        L_0x015d:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            com.google.android.gms.internal.measurement.zzlw.zzO(r10, r5, r2, r6)
            goto L_0x0041
        L_0x0170:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzV(r10, r5, r2, r15)
            goto L_0x0041
        L_0x017f:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzU(r10, r5, r2, r15)
            goto L_0x0041
        L_0x018e:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzT(r10, r5, r2, r15)
            goto L_0x0041
        L_0x019d:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzS(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ac:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzK(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01bb:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzX(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ca:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzH(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01d9:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzL(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01e8:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzM(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01f7:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzP(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0206:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzY(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0215:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzQ(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0224:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzN(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0233:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzJ(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0242:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            com.google.android.gms.internal.measurement.zzlw.zzV(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0251:
            r11 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzU(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0260:
            r11 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzT(r10, r5, r2, r11)
            goto L_0x029b
        L_0x026f:
            r11 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzS(r10, r5, r2, r11)
            goto L_0x029b
        L_0x027e:
            r11 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzK(r10, r5, r2, r11)
            goto L_0x029b
        L_0x028d:
            r11 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzX(r10, r5, r2, r11)
        L_0x029b:
            r13 = r11
            goto L_0x044c
        L_0x029e:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzI(r10, r5, r2)
            goto L_0x0041
        L_0x02ad:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            com.google.android.gms.internal.measurement.zzlw.zzR(r10, r5, r2, r6)
            goto L_0x0041
        L_0x02c0:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzW(r10, r5, r2)
            goto L_0x0041
        L_0x02cf:
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r13 = 0
            com.google.android.gms.internal.measurement.zzlw.zzH(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02df:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzL(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ef:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzM(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ff:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzP(r10, r5, r2, r13)
            goto L_0x044c
        L_0x030f:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzY(r10, r5, r2, r13)
            goto L_0x044c
        L_0x031f:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzQ(r10, r5, r2, r13)
            goto L_0x044c
        L_0x032f:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzN(r10, r5, r2, r13)
            goto L_0x044c
        L_0x033f:
            r13 = 0
            int[] r10 = r0.zzc
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.zzlw.zzJ(r10, r5, r2, r13)
            goto L_0x044c
        L_0x034f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            r2.zzq(r12, r5, r6)
            goto L_0x044c
        L_0x0361:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.zzC(r12, r5)
            goto L_0x044c
        L_0x036f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzA(r12, r5)
            goto L_0x044c
        L_0x037d:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.zzy(r12, r5)
            goto L_0x044c
        L_0x038b:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzw(r12, r5)
            goto L_0x044c
        L_0x0399:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzi(r12, r5)
            goto L_0x044c
        L_0x03a7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzH(r12, r5)
            goto L_0x044c
        L_0x03b5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzjb r5 = (com.google.android.gms.internal.measurement.zzjb) r5
            r2.zzd(r12, r5)
            goto L_0x044c
        L_0x03c5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzlu r6 = r0.zzE(r7)
            r2.zzv(r12, r5, r6)
            goto L_0x044c
        L_0x03d7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            zzT(r12, r5, r2)
            goto L_0x044c
        L_0x03e5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            boolean r5 = com.google.android.gms.internal.measurement.zzmv.zzw(r1, r5)
            r2.zzb(r12, r5)
            goto L_0x044c
        L_0x03f2:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzk(r12, r5)
            goto L_0x044c
        L_0x03ff:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.zzm(r12, r5)
            goto L_0x044c
        L_0x040c:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.zzr(r12, r5)
            goto L_0x044c
        L_0x0419:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.zzJ(r12, r5)
            goto L_0x044c
        L_0x0426:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.zzt(r12, r5)
            goto L_0x044c
        L_0x0433:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            float r5 = com.google.android.gms.internal.measurement.zzmv.zzb(r1, r5)
            r2.zzo(r12, r5)
            goto L_0x044c
        L_0x0440:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            double r5 = com.google.android.gms.internal.measurement.zzmv.zza(r1, r5)
            r2.zzf(r12, r5)
        L_0x044c:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0453:
            com.google.android.gms.internal.measurement.zzml r3 = r0.zzn
            java.lang.Object r1 = r3.zzc(r1)
            r3.zzi(r1, r2)
            return
        L_0x045d:
            com.google.android.gms.internal.measurement.zzjp r2 = r0.zzo
            r2.zza(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzL(java.lang.Object, com.google.android.gms.internal.measurement.zznd):void");
    }

    private final void zzM(zznd zznd, int i, Object obj, int i10) throws IOException {
        if (obj != null) {
            zzlc zzlc = (zzlc) zzF(i10);
            throw null;
        }
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j10 = (long) (zzy & 1048575);
        if (j10 != 1048575) {
            return (zzmv.zzc(obj, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j11 = (long) (zzB & 1048575);
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j11)) != 0;
            case 2:
                return zzmv.zzd(obj, j11) != 0;
            case 3:
                return zzmv.zzd(obj, j11) != 0;
            case 4:
                return zzmv.zzc(obj, j11) != 0;
            case 5:
                return zzmv.zzd(obj, j11) != 0;
            case 6:
                return zzmv.zzc(obj, j11) != 0;
            case 7:
                return zzmv.zzw(obj, j11);
            case 8:
                Object zzf2 = zzmv.zzf(obj, j11);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j11) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j11));
            case 11:
                return zzmv.zzc(obj, j11) != 0;
            case 12:
                return zzmv.zzc(obj, j11) != 0;
            case 13:
                return zzmv.zzc(obj, j11) != 0;
            case 14:
                return zzmv.zzd(obj, j11) != 0;
            case 15:
                return zzmv.zzc(obj, j11) != 0;
            case 16:
                return zzmv.zzd(obj, j11) != 0;
            case 17:
                return zzmv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i10, int i11, int i12) {
        return i10 == 1048575 ? zzO(obj, i) : (i11 & i12) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzlu) {
        return zzlu.zzk(zzmv.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzR(Object obj, int i, int i10) {
        return zzmv.zzc(obj, (long) (zzy(i10) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zznd) throws IOException {
        if (obj instanceof String) {
            zznd.zzF(i, (String) obj);
        } else {
            zznd.zzd(i, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkc = (zzkc) obj;
        zzmm zzmm = zzkc.zzc;
        if (zzmm != zzmm.zzc()) {
            return zzmm;
        }
        zzmm zze2 = zzmm.zze();
        zzkc.zzc = zze2;
        return zze2;
    }

    public static zzlm zzl(Class cls, zzlg zzlg, zzlo zzlo, zzkx zzkx, zzml zzml, zzjp zzjp, zzle zzle) {
        if (zzlg instanceof zzlt) {
            return zzm((zzlt) zzlg, zzlo, zzkx, zzml, zzjp, zzle);
        }
        zzmi zzmi = (zzmi) zzlg;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0379  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r33, com.google.android.gms.internal.measurement.zzlo r34, com.google.android.gms.internal.measurement.zzkx r35, com.google.android.gms.internal.measurement.zzml r36, com.google.android.gms.internal.measurement.zzjp r37, com.google.android.gms.internal.measurement.zzle r38) {
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
            com.google.android.gms.internal.measurement.zzlj r18 = r33.zza()
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
            java.lang.reflect.Field r12 = zzG(r1, r12)
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
            java.lang.reflect.Field r8 = zzG(r1, r8)
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
            java.lang.reflect.Field r8 = zzG(r1, r8)
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
            java.lang.reflect.Field r8 = zzG(r1, r8)
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
            com.google.android.gms.internal.measurement.zzlm r0 = new com.google.android.gms.internal.measurement.zzlm
            r4 = r0
            com.google.android.gms.internal.measurement.zzlj r9 = r33.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmv.zzf(obj, j10)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0308, code lost:
        r7 = (r7 + r6) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x030a, code lost:
        r4 = r4 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04b8, code lost:
        r4 = androidx.appcompat.widget.d.a(r7, r1, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0545, code lost:
        r3 = r3 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        r7 = (r7 + r1) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016f, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01aa, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ba, code lost:
        r1 = r1 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzp(java.lang.Object r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x000c:
            int[] r6 = r14.zzc
            int r6 = r6.length
            if (r3 >= r6) goto L_0x054c
            int r6 = r14.zzB(r3)
            int[] r7 = r14.zzc
            r8 = r7[r3]
            int r9 = zzA(r6)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0036
            int r10 = r3 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r2) goto L_0x0037
            long r12 = (long) r10
            int r2 = r0.getInt(r15, r12)
            r5 = r2
            r2 = r10
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x0539;
                case 1: goto L_0x052d;
                case 2: goto L_0x0519;
                case 3: goto L_0x0505;
                case 4: goto L_0x04f1;
                case 5: goto L_0x04e5;
                case 6: goto L_0x04d9;
                case 7: goto L_0x04cd;
                case 8: goto L_0x049c;
                case 9: goto L_0x0489;
                case 10: goto L_0x0470;
                case 11: goto L_0x045c;
                case 12: goto L_0x0448;
                case 13: goto L_0x043c;
                case 14: goto L_0x0430;
                case 15: goto L_0x0417;
                case 16: goto L_0x03ff;
                case 17: goto L_0x03eb;
                case 18: goto L_0x03de;
                case 19: goto L_0x03d1;
                case 20: goto L_0x03c4;
                case 21: goto L_0x03b7;
                case 22: goto L_0x03aa;
                case 23: goto L_0x039d;
                case 24: goto L_0x0390;
                case 25: goto L_0x0383;
                case 26: goto L_0x0377;
                case 27: goto L_0x0367;
                case 28: goto L_0x035b;
                case 29: goto L_0x034e;
                case 30: goto L_0x0341;
                case 31: goto L_0x0334;
                case 32: goto L_0x0327;
                case 33: goto L_0x031a;
                case 34: goto L_0x030d;
                case 35: goto L_0x02f4;
                case 36: goto L_0x02df;
                case 37: goto L_0x02ca;
                case 38: goto L_0x02b5;
                case 39: goto L_0x02a0;
                case 40: goto L_0x028b;
                case 41: goto L_0x0275;
                case 42: goto L_0x025f;
                case 43: goto L_0x0249;
                case 44: goto L_0x0233;
                case 45: goto L_0x021d;
                case 46: goto L_0x0207;
                case 47: goto L_0x01f1;
                case 48: goto L_0x01db;
                case 49: goto L_0x01cb;
                case 50: goto L_0x01be;
                case 51: goto L_0x01ae;
                case 52: goto L_0x019e;
                case 53: goto L_0x0187;
                case 54: goto L_0x0172;
                case 55: goto L_0x015b;
                case 56: goto L_0x014e;
                case 57: goto L_0x0141;
                case 58: goto L_0x0132;
                case 59: goto L_0x0103;
                case 60: goto L_0x00ef;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0545
        L_0x0040:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlj r1 = (com.google.android.gms.internal.measurement.zzlj) r1
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzu(r8, r1, r6)
            goto L_0x0499
        L_0x0056:
            boolean r6 = r14.zzR(r15, r8, r3)
            if (r6 == 0) goto L_0x0545
            long r6 = zzC(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjj.zzA(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
        L_0x006e:
            int r1 = r1 + r8
            goto L_0x0499
        L_0x0071:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x016f
        L_0x008c:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01ba
        L_0x009a:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01aa
        L_0x00a8:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzv(r1)
            goto L_0x016f
        L_0x00be:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x016f
        L_0x00d4:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjb r1 = (com.google.android.gms.internal.measurement.zzjb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0121
        L_0x00ef:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzo(r8, r1, r6)
            goto L_0x0499
        L_0x0103:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzjb
            if (r6 == 0) goto L_0x0125
            com.google.android.gms.internal.measurement.zzjb r1 = (com.google.android.gms.internal.measurement.zzjb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x0121:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x030a
        L_0x0125:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzy(r1)
            goto L_0x016f
        L_0x0132:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x013e:
            int r1 = r1 + r11
            goto L_0x0499
        L_0x0141:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01aa
        L_0x014e:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01ba
        L_0x015b:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = zzr(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzv(r1)
        L_0x016f:
            int r1 = r1 + r6
            goto L_0x0499
        L_0x0172:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x019b
        L_0x0187:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            long r6 = zzC(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
        L_0x019b:
            int r1 = r1 + r6
            goto L_0x0499
        L_0x019e:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x01aa:
            int r1 = r1 + 4
            goto L_0x0499
        L_0x01ae:
            boolean r1 = r14.zzR(r15, r8, r3)
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x01ba:
            int r1 = r1 + 8
            goto L_0x0499
        L_0x01be:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.zzF(r3)
            com.google.android.gms.internal.measurement.zzle.zza(r8, r1, r6)
            goto L_0x0545
        L_0x01cb:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzj(r8, r1, r6)
            goto L_0x0499
        L_0x01db:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzt(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x01f1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzr(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x0207:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzi(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x021d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzg(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x0233:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zze(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x0249:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzw(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x025f:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzb(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x0275:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzg(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x028b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzi(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x02a0:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzl(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x02b5:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzy(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x02ca:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzn(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x02df:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzg(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x0308
        L_0x02f4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzi(r1)
            if (r1 <= 0) goto L_0x0545
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzz(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x0308:
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x030a:
            int r4 = r4 + r7
            goto L_0x0545
        L_0x030d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzs(r8, r1, r6)
            goto L_0x0499
        L_0x031a:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzq(r8, r6, r1)
            goto L_0x0499
        L_0x0327:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzh(r8, r6, r1)
            goto L_0x0499
        L_0x0334:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzf(r8, r6, r1)
            goto L_0x0499
        L_0x0341:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzd(r8, r6, r1)
            goto L_0x0499
        L_0x034e:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzv(r8, r6, r1)
            goto L_0x0499
        L_0x035b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzc(r8, r1)
            goto L_0x0499
        L_0x0367:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzp(r8, r1, r6)
            goto L_0x0499
        L_0x0377:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzu(r8, r1)
            goto L_0x0499
        L_0x0383:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = com.google.android.gms.internal.measurement.zzlw.zza(r8, r1, r6)
            goto L_0x0499
        L_0x0390:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzf(r8, r6, r1)
            goto L_0x0499
        L_0x039d:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzh(r8, r6, r1)
            goto L_0x0499
        L_0x03aa:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzk(r8, r6, r1)
            goto L_0x0499
        L_0x03b7:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzx(r8, r6, r1)
            goto L_0x0499
        L_0x03c4:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzm(r8, r6, r1)
            goto L_0x0499
        L_0x03d1:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzf(r8, r6, r1)
            goto L_0x0499
        L_0x03de:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzh(r8, r6, r1)
            goto L_0x0499
        L_0x03eb:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlj r1 = (com.google.android.gms.internal.measurement.zzlj) r1
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzu(r8, r1, r6)
            goto L_0x0499
        L_0x03ff:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0545
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjj.zzA(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x006e
        L_0x0417:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x016f
        L_0x0430:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01ba
        L_0x043c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01aa
        L_0x0448:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzv(r1)
            goto L_0x016f
        L_0x045c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x016f
        L_0x0470:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzjb r1 = (com.google.android.gms.internal.measurement.zzjb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x04b8
        L_0x0489:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlu r6 = r14.zzE(r3)
            int r1 = com.google.android.gms.internal.measurement.zzlw.zzo(r8, r1, r6)
        L_0x0499:
            int r4 = r4 + r1
            goto L_0x0545
        L_0x049c:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzjb
            if (r6 == 0) goto L_0x04bf
            com.google.android.gms.internal.measurement.zzjb r1 = (com.google.android.gms.internal.measurement.zzjb) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = r1.zzd()
            int r7 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
        L_0x04b8:
            int r1 = androidx.appcompat.widget.d.a(r7, r1, r6, r4)
            r4 = r1
            goto L_0x0545
        L_0x04bf:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzy(r1)
            goto L_0x016f
        L_0x04cd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x013e
        L_0x04d9:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01aa
        L_0x04e5:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01ba
        L_0x04f1:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzv(r1)
            goto L_0x016f
        L_0x0505:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x019b
        L_0x0519:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x019b
        L_0x052d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01aa
        L_0x0539:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0545
            int r1 = r8 << 3
            int r1 = com.google.android.gms.internal.measurement.zzjj.zzA(r1)
            goto L_0x01ba
        L_0x0545:
            int r3 = r3 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x054c:
            com.google.android.gms.internal.measurement.zzml r0 = r14.zzn
            java.lang.Object r1 = r0.zzc(r15)
            int r0 = r0.zza(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x055c
            return r4
        L_0x055c:
            com.google.android.gms.internal.measurement.zzjp r0 = r14.zzo
            r0.zza(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzp(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r6 = (r6 + r5) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b2, code lost:
        r6 = (r6 + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b4, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04d0, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0501, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x052c, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053b, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x054b, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054f, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0553
            int r4 = r11.zzB(r2)
            int r5 = zzA(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.zzju r4 = com.google.android.gms.internal.measurement.zzju.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.zzju r4 = com.google.android.gms.internal.measurement.zzju.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.zzc
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x053f;
                case 1: goto L_0x052f;
                case 2: goto L_0x0518;
                case 3: goto L_0x0503;
                case 4: goto L_0x04ed;
                case 5: goto L_0x04e0;
                case 6: goto L_0x04d3;
                case 7: goto L_0x04c4;
                case 8: goto L_0x0494;
                case 9: goto L_0x047f;
                case 10: goto L_0x0464;
                case 11: goto L_0x044e;
                case 12: goto L_0x0438;
                case 13: goto L_0x042a;
                case 14: goto L_0x041c;
                case 15: goto L_0x0401;
                case 16: goto L_0x03e6;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03c4;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0394;
                case 23: goto L_0x0388;
                case 24: goto L_0x037c;
                case 25: goto L_0x0370;
                case 26: goto L_0x0364;
                case 27: goto L_0x0354;
                case 28: goto L_0x0348;
                case 29: goto L_0x033c;
                case 30: goto L_0x0330;
                case 31: goto L_0x0324;
                case 32: goto L_0x0318;
                case 33: goto L_0x030c;
                case 34: goto L_0x0300;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x054f
        L_0x0038:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlj r4 = (com.google.android.gms.internal.measurement.zzlj) r4
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzu(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzR(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzC(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzv(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzjb r4 = (com.google.android.gms.internal.measurement.zzjb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzo(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjb
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.zzjb r4 = (com.google.android.gms.internal.measurement.zzjb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzy(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzr(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzv(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzC(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzR(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.lang.Object r5 = r11.zzF(r2)
            com.google.android.gms.internal.measurement.zzle.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzj(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zze(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzw(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzy(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzg(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzi(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzd(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzv(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzc(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzp(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzu(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zza(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzx(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzf(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzh(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlj r4 = (com.google.android.gms.internal.measurement.zzlj) r4
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzu(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzO(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.measurement.zzmv.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmv.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmv.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzv(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmv.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzjb r4 = (com.google.android.gms.internal.measurement.zzjb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlu r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlw.zzo(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzjb
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.measurement.zzjb r4 = (com.google.android.gms.internal.measurement.zzjb) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzy(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.measurement.zzmv.zzc(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjj.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzv(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.measurement.zzmv.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.measurement.zzmv.zzd(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjj.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzB(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzO(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjj.zzA(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.measurement.zzml r0 = r11.zzn
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzq(java.lang.Object):int");
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmv.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i10, int i11, long j10, zzio zzio) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i11);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzlc zzlc = (zzlc) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, zzio zzio) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i17 = i;
        int i18 = i11;
        int i19 = i12;
        int i20 = i13;
        long j11 = j10;
        int i21 = i16;
        zzio zzio2 = zzio;
        Unsafe unsafe = zzb;
        long j12 = (long) (this.zzc[i21 + 2] & 1048575);
        switch (i15) {
            case 51:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                    unsafe.putInt(obj2, j12, i19);
                    return i17 + 8;
                }
                break;
            case 52:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                    unsafe.putInt(obj2, j12, i19);
                    return i17 + 4;
                }
                break;
            case 53:
            case 54:
                if (i20 == 0) {
                    int zzm2 = zzip.zzm(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzio2.zzb));
                    unsafe.putInt(obj2, j12, i19);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i20 == 0) {
                    int zzj2 = zzip.zzj(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzio2.zza));
                    unsafe.putInt(obj2, j12, i19);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i20 == 1) {
                    unsafe.putObject(obj2, j11, Long.valueOf(zzip.zzn(bArr, i)));
                    unsafe.putInt(obj2, j12, i19);
                    return i17 + 8;
                }
                break;
            case 57:
            case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                if (i20 == 5) {
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzip.zzb(bArr, i)));
                    unsafe.putInt(obj2, j12, i19);
                    return i17 + 4;
                }
                break;
            case 58:
                if (i20 == 0) {
                    int zzm3 = zzip.zzm(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, Boolean.valueOf(zzio2.zzb != 0));
                    unsafe.putInt(obj2, j12, i19);
                    return zzm3;
                }
                break;
            case 59:
                if (i20 == 2) {
                    int zzj3 = zzip.zzj(bArr2, i17, zzio2);
                    int i22 = zzio2.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj2, j11, BuildConfig.FLAVOR);
                    } else if ((i14 & 536870912) == 0 || zzna.zzf(bArr2, zzj3, zzj3 + i22)) {
                        unsafe.putObject(obj2, j11, new String(bArr2, zzj3, i22, zzkk.zzb));
                        zzj3 += i22;
                    } else {
                        throw zzkm.zzc();
                    }
                    unsafe.putInt(obj2, j12, i19);
                    return zzj3;
                }
                break;
            case 60:
                if (i20 == 2) {
                    int zzd2 = zzip.zzd(zzE(i21), bArr2, i17, i10, zzio2);
                    Object object = unsafe.getInt(obj2, j12) == i19 ? unsafe.getObject(obj2, j11) : null;
                    if (object == null) {
                        unsafe.putObject(obj2, j11, zzio2.zzc);
                    } else {
                        unsafe.putObject(obj2, j11, zzkk.zzg(object, zzio2.zzc));
                    }
                    unsafe.putInt(obj2, j12, i19);
                    return zzd2;
                }
                break;
            case 61:
                if (i20 == 2) {
                    int zza2 = zzip.zza(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, zzio2.zzc);
                    unsafe.putInt(obj2, j12, i19);
                    return zza2;
                }
                break;
            case 63:
                if (i20 == 0) {
                    int zzj4 = zzip.zzj(bArr2, i17, zzio2);
                    int i23 = zzio2.zza;
                    zzkg zzD = zzD(i21);
                    if (zzD == null || zzD.zza(i23)) {
                        unsafe.putObject(obj2, j11, Integer.valueOf(i23));
                        unsafe.putInt(obj2, j12, i19);
                    } else {
                        zzd(obj).zzh(i18, Long.valueOf((long) i23));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i20 == 0) {
                    int zzj5 = zzip.zzj(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, Integer.valueOf(zzjf.zzb(zzio2.zza)));
                    unsafe.putInt(obj2, j12, i19);
                    return zzj5;
                }
                break;
            case 67:
                if (i20 == 0) {
                    int zzm4 = zzip.zzm(bArr2, i17, zzio2);
                    unsafe.putObject(obj2, j11, Long.valueOf(zzjf.zzc(zzio2.zzb)));
                    unsafe.putInt(obj2, j12, i19);
                    return zzm4;
                }
                break;
            case 68:
                if (i20 == 3) {
                    int zzc2 = zzip.zzc(zzE(i21), bArr, i, i10, (i18 & -8) | 4, zzio);
                    Object object2 = unsafe.getInt(obj2, j12) == i19 ? unsafe.getObject(obj2, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj2, j11, zzio2.zzc);
                    } else {
                        unsafe.putObject(obj2, j11, zzkk.zzg(object2, zzio2.zzc));
                    }
                    unsafe.putInt(obj2, j12, i19);
                    return zzc2;
                }
                break;
        }
        return i17;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f1, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0322, code lost:
        if (r0 != r15) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0345, code lost:
        if (r0 != r15) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0225, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0229, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x022f, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
        r19 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d9, code lost:
        if (r0 != r15) goto L_0x02db;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzu(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.measurement.zzio r36) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r34
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x036f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzk(r0, r12, r3, r11)
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
            int r0 = r15.zzx(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.zzw(r5)
        L_0x003f:
            r2 = r0
            if (r2 != r10) goto L_0x004d
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = r10
            r23 = r16
            goto L_0x0348
        L_0x004d:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = zzA(r1)
            r34 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x023a
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x008a
            r20 = r2
            if (r7 == r5) goto L_0x007e
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0080
        L_0x007e:
            r7 = r19
        L_0x0080:
            if (r0 == r5) goto L_0x0087
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0087:
            r2 = r7
            r7 = r0
            goto L_0x008e
        L_0x008a:
            r20 = r2
            r2 = r19
        L_0x008e:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x020b;
                case 1: goto L_0x01f1;
                case 2: goto L_0x01d1;
                case 3: goto L_0x01d1;
                case 4: goto L_0x01ba;
                case 5: goto L_0x019c;
                case 6: goto L_0x0186;
                case 7: goto L_0x0166;
                case 8: goto L_0x0144;
                case 9: goto L_0x0118;
                case 10: goto L_0x0101;
                case 11: goto L_0x01ba;
                case 12: goto L_0x00eb;
                case 13: goto L_0x0186;
                case 14: goto L_0x019c;
                case 15: goto L_0x00d1;
                case 16: goto L_0x009e;
                default: goto L_0x0092;
            }
        L_0x0092:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
        L_0x009b:
            r5 = r4
            goto L_0x022f
        L_0x009e:
            if (r3 != 0) goto L_0x00c4
            int r10 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r21 = com.google.android.gms.internal.measurement.zzjf.zzc(r0)
            r0 = r2
            r1 = r32
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r34
            r8 = r4
            r25 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x0229
        L_0x00c4:
            r25 = r5
            r19 = r7
            r8 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x022f
        L_0x00d1:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x009b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.measurement.zzjf.zzb(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x00eb:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x009b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x0101:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 2
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x009b
            int r0 = com.google.android.gms.internal.measurement.zzip.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x0118:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 2
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x009b
            com.google.android.gms.internal.measurement.zzlu r0 = r15.zzE(r10)
            int r0 = com.google.android.gms.internal.measurement.zzip.zzd(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0139
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x0139:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkk.zzg(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x0144:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 2
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x009b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x015b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzg(r12, r4, r11)
            goto L_0x015f
        L_0x015b:
            int r0 = com.google.android.gms.internal.measurement.zzip.zzh(r12, r4, r11)
        L_0x015f:
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0225
        L_0x0166:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x009b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x017f
            r1 = 1
            goto L_0x0181
        L_0x017f:
            r1 = r16
        L_0x0181:
            com.google.android.gms.internal.measurement.zzmv.zzm(r14, r8, r1)
            goto L_0x0225
        L_0x0186:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x009b
            int r0 = com.google.android.gms.internal.measurement.zzip.zzb(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0225
        L_0x019c:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 1
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x009b
            long r21 = com.google.android.gms.internal.measurement.zzip.zzn(r12, r4)
            r0 = r7
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0225
        L_0x01ba:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022f
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r5, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            goto L_0x0225
        L_0x01d1:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != 0) goto L_0x022f
            int r17 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r5, r11)
            long r4 = r11.zzb
            r0 = r7
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x0229
        L_0x01f1:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022f
            int r0 = com.google.android.gms.internal.measurement.zzip.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmv.zzp(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0225
        L_0x020b:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 1
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != r0) goto L_0x022f
            long r0 = com.google.android.gms.internal.measurement.zzip.zzn(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmv.zzo(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0225:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x0229:
            r7 = r19
            r1 = r20
            goto L_0x0289
        L_0x022f:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x0348
        L_0x023a:
            r20 = r34
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x029b
            r0 = 2
            if (r3 != r0) goto L_0x028e
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.measurement.zzkj r0 = (com.google.android.gms.internal.measurement.zzkj) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x026b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0263
            r1 = 10
            goto L_0x0264
        L_0x0263:
            int r1 = r1 + r1
        L_0x0264:
            com.google.android.gms.internal.measurement.zzkj r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
        L_0x026b:
            r8 = r0
            com.google.android.gms.internal.measurement.zzlu r0 = r15.zzE(r4)
            r1 = r17
            r2 = r33
            r3 = r5
            r23 = r4
            r4 = r35
            r5 = r8
            r8 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.measurement.zzip.zze(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
        L_0x0289:
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x028e:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0325
        L_0x029b:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f3
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r34
            r29 = r8
            r9 = r25
            r24 = r29
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r36
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02f1
        L_0x02db:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0368
        L_0x02f1:
            r2 = r0
            goto L_0x0326
        L_0x02f3:
            r34 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x032b
            r7 = r34
            r0 = 2
            if (r7 != r0) goto L_0x0325
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r23
            r6 = r24
            r8 = r36
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02f1
            goto L_0x02db
        L_0x0325:
            r2 = r15
        L_0x0326:
            r6 = r26
            r7 = r27
            goto L_0x0348
        L_0x032b:
            r7 = r34
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r36
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02f1
            goto L_0x02db
        L_0x0348:
            com.google.android.gms.internal.measurement.zzmm r4 = zzd(r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = com.google.android.gms.internal.measurement.zzip.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
        L_0x0368:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x036f:
            r26 = r6
            r1 = r8
            r28 = r9
            if (r7 == r1) goto L_0x0380
            long r1 = (long) r7
            r3 = r32
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0380:
            r1 = r35
            if (r0 != r1) goto L_0x0385
            return r0
        L_0x0385:
            com.google.android.gms.internal.measurement.zzkm r0 = com.google.android.gms.internal.measurement.zzkm.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzio r29) throws java.io.IOException {
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
            com.google.android.gms.internal.measurement.zzkj r12 = (com.google.android.gms.internal.measurement.zzkj) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.zzkj r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.measurement.zzlu r1 = r15.zzE(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzip.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjf.zzc(r4)
            r12.zzg(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjf.zzc(r8)
            r12.zzg(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjf.zzc(r8)
            r12.zzg(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.measurement.zzkd r12 = (com.google.android.gms.internal.measurement.zzkd) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjf.zzb(r4)
            r12.zzh(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzkd r12 = (com.google.android.gms.internal.measurement.zzkd) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjf.zzb(r4)
            r12.zzh(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjf.zzb(r4)
            r12.zzh(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.zzip.zzf(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzip.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.zzkc r1 = (com.google.android.gms.internal.measurement.zzkc) r1
            com.google.android.gms.internal.measurement.zzmm r3 = r1.zzc
            com.google.android.gms.internal.measurement.zzmm r4 = com.google.android.gms.internal.measurement.zzmm.zzc()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.measurement.zzkg r4 = r15.zzD(r8)
            com.google.android.gms.internal.measurement.zzml r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzlw.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.measurement.zzmm r3 = (com.google.android.gms.internal.measurement.zzmm) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.measurement.zzjb r4 = com.google.android.gms.internal.measurement.zzjb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.measurement.zzjb r6 = com.google.android.gms.internal.measurement.zzjb.zzl(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.measurement.zzjb r4 = com.google.android.gms.internal.measurement.zzjb.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.measurement.zzjb r6 = com.google.android.gms.internal.measurement.zzjb.zzl(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.measurement.zzlu r1 = r15.zzE(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.zzip.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01fa
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01c2
            r12.add(r6)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkk.zzb
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cc:
            int r1 = r1 + r4
        L_0x01cd:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01e5
            r12.add(r6)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkk.zzb
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x01fa:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0255
            if (r4 != 0) goto L_0x0208
            r12.add(r6)
            goto L_0x021b
        L_0x0208:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.zzna.zzf(r3, r1, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkk.zzb
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021a:
            r1 = r8
        L_0x021b:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x0233
            r12.add(r6)
            goto L_0x021b
        L_0x0233:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.zzna.zzf(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkk.zzb
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzc()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzc()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzd()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.measurement.zziq r12 = (com.google.android.gms.internal.measurement.zziq) r12
            int r2 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zziq r12 = (com.google.android.gms.internal.measurement.zziq) r12
            int r4 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r6, r7)
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
            com.google.android.gms.internal.measurement.zzkd r12 = (com.google.android.gms.internal.measurement.zzkd) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.measurement.zzip.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.zzkd r12 = (com.google.android.gms.internal.measurement.zzkd) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzb(r17, r18)
            r12.zzh(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzb(r3, r4)
            r12.zzh(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.measurement.zzip.zzn(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            long r8 = com.google.android.gms.internal.measurement.zzip.zzn(r17, r18)
            r12.zzg(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.measurement.zzip.zzn(r3, r4)
            r12.zzg(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.measurement.zzip.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.measurement.zzip.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzg(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.zzky r12 = (com.google.android.gms.internal.measurement.zzky) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.measurement.zzjv r12 = (com.google.android.gms.internal.measurement.zzjv) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.measurement.zzip.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.zzjv r12 = (com.google.android.gms.internal.measurement.zzjv) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.measurement.zzip.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.measurement.zzjl r12 = (com.google.android.gms.internal.measurement.zzjl) r12
            int r1 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.measurement.zzip.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.measurement.zzkm r1 = com.google.android.gms.internal.measurement.zzkm.zzf()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.zzjl r12 = (com.google.android.gms.internal.measurement.zzjl) r12
            long r8 = com.google.android.gms.internal.measurement.zzip.zzn(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.measurement.zzip.zzn(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.measurement.zzip.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.measurement.zzip.zzc(r21, r22, r23, r24, r25, r26)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzio):int");
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i10) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i10);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i10) {
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

    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bf, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.zzB(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzA(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0216;
                case 1: goto L_0x020b;
                case 2: goto L_0x0200;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01db;
                case 7: goto L_0x01d0;
                case 8: goto L_0x01c3;
                case 9: goto L_0x01b5;
                case 10: goto L_0x01a9;
                case 11: goto L_0x01a2;
                case 12: goto L_0x019b;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
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
            goto L_0x0226
        L_0x001f:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0043:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0051:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0063:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0071:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x007f:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x008d:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzS(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zza(r3)
            goto L_0x0224
        L_0x00d7:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x00e5:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x00f7:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x01f3
        L_0x0105:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0129:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = zzo(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x013b:
            boolean r3 = r8.zzR(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = zzn(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmv.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmv.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.zzmv.zzw(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zza(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmv.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzmv.zzc(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmv.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzmv.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.zzmv.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.zzmv.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzkk.zzc(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzml r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzh
            if (r1 != 0) goto L_0x023c
            return r0
        L_0x023c:
            com.google.android.gms.internal.measurement.zzjp r0 = r8.zzo
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzb(java.lang.Object):int");
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
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0380, code lost:
        if (r0 != r15) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x039c, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03c8, code lost:
        if (r0 != r15) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ea, code lost:
        if (r0 != r15) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0164, code lost:
        r5 = r6 | r25;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0168, code lost:
        r3 = r8;
        r1 = r11;
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x019f, code lost:
        r21 = r3;
        r13 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0202, code lost:
        r5 = r6 | r25;
        r3 = r2;
        r1 = r11;
        r6 = r27;
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020a, code lost:
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020e, code lost:
        r13 = r2;
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0211, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02b2, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b4, code lost:
        r5 = r6 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b6, code lost:
        r2 = r32;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ba, code lost:
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bf, code lost:
        r21 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02d4, code lost:
        r7 = r34;
        r22 = r6;
        r28 = r10;
        r8 = r18;
        r2 = r21;
        r6 = r27;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzio r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r32
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            r17 = 0
            if (r0 >= r13) goto L_0x045b
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.measurement.zzip.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003b
            int r3 = r3 / r8
            int r2 = r15.zzx(r0, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.zzw(r0)
        L_0x003f:
            r3 = -1
            if (r2 != r3) goto L_0x0051
            r32 = r0
            r2 = r1
            r19 = r3
            r8 = r4
            r22 = r5
            r28 = r10
            r7 = r11
            r21 = r16
            goto L_0x03ed
        L_0x0051:
            int[] r3 = r15.zzc
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = zzA(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02e4
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r25 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x008a
            r18 = r4
            if (r6 == r3) goto L_0x0082
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0082:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            goto L_0x008e
        L_0x008a:
            r18 = r4
            r27 = r6
        L_0x008e:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0299;
                case 1: goto L_0x027d;
                case 2: goto L_0x0256;
                case 3: goto L_0x0256;
                case 4: goto L_0x023d;
                case 5: goto L_0x0215;
                case 6: goto L_0x01ea;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01a4;
                case 9: goto L_0x016e;
                case 10: goto L_0x014a;
                case 11: goto L_0x023d;
                case 12: goto L_0x0113;
                case 13: goto L_0x01ea;
                case 14: goto L_0x0215;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00c2;
                default: goto L_0x0093;
            }
        L_0x0093:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bf
            com.google.android.gms.internal.measurement.zzlu r0 = r15.zzE(r13)
            int r1 = r32 << 3
            r7 = r1 | 4
            r1 = r31
            r2 = r11
            r3 = r33
            r11 = r4
            r4 = r7
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzip.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x02c2
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r11, r1)
            goto L_0x02cf
        L_0x00c2:
            if (r7 != 0) goto L_0x00eb
            r3 = r21
            int r7 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r3, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjf.zzc(r0)
            r11 = r20
            r0 = r10
            r1 = r30
            r8 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r32 = r11
            r11 = r18
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r0 = r7
            goto L_0x0168
        L_0x00eb:
            r32 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r2
            goto L_0x02d4
        L_0x00f5:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019f
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r3, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.measurement.zzjf.zzb(r1)
            r4 = r22
            r10.putInt(r14, r4, r1)
            goto L_0x0164
        L_0x0113:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x019f
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r3, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.measurement.zzkg r2 = r15.zzD(r8)
            if (r2 == 0) goto L_0x0146
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x0136
            goto L_0x0146
        L_0x0136:
            com.google.android.gms.internal.measurement.zzmm r2 = zzd(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r2 = r32
            r5 = r6
            goto L_0x0168
        L_0x0146:
            r10.putInt(r14, r4, r1)
            goto L_0x0164
        L_0x014a:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019f
            int r0 = com.google.android.gms.internal.measurement.zzip.zza(r12, r3, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
        L_0x0164:
            r5 = r6 | r25
            r2 = r32
        L_0x0168:
            r3 = r8
            r1 = r11
            r6 = r27
            goto L_0x020a
        L_0x016e:
            r8 = r2
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x019f
            com.google.android.gms.internal.measurement.zzlu r0 = r15.zzE(r8)
            int r0 = com.google.android.gms.internal.measurement.zzip.zzd(r0, r12, r3, r13, r9)
            r1 = r6 & r25
            if (r1 != 0) goto L_0x0191
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x0164
        L_0x0191:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkk.zzg(r1, r2)
            r10.putObject(r14, r4, r1)
            goto L_0x0164
        L_0x019f:
            r21 = r3
            r13 = r8
            goto L_0x0211
        L_0x01a4:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020e
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01be
            int r0 = com.google.android.gms.internal.measurement.zzip.zzg(r12, r3, r9)
            goto L_0x01c2
        L_0x01be:
            int r0 = com.google.android.gms.internal.measurement.zzip.zzh(r12, r3, r9)
        L_0x01c2:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x0202
        L_0x01c8:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x020e
            int r0 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r3, r9)
            long r7 = r9.zzb
            r17 = 0
            int r3 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01e4
            goto L_0x01e6
        L_0x01e4:
            r1 = r16
        L_0x01e6:
            com.google.android.gms.internal.measurement.zzmv.zzm(r14, r4, r1)
            goto L_0x0202
        L_0x01ea:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x020e
            int r0 = com.google.android.gms.internal.measurement.zzip.zzb(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x0202:
            r5 = r6 | r25
            r3 = r2
            r1 = r11
            r6 = r27
            r2 = r32
        L_0x020a:
            r11 = r34
            goto L_0x001a
        L_0x020e:
            r13 = r2
            r21 = r3
        L_0x0211:
            r18 = r11
            goto L_0x02d4
        L_0x0215:
            r11 = r18
            r32 = r20
            r3 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0236
            long r7 = com.google.android.gms.internal.measurement.zzip.zzn(r12, r3)
            r0 = r10
            r1 = r30
            r13 = r2
            r18 = r11
            r11 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x02b2
        L_0x0236:
            r13 = r2
            r18 = r11
            r21 = r3
            goto L_0x02d4
        L_0x023d:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bf
            int r0 = com.google.android.gms.internal.measurement.zzip.zzj(r12, r11, r9)
            int r1 = r9.zza
            r10.putInt(r14, r4, r1)
            goto L_0x02b4
        L_0x0256:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02bf
            int r7 = com.google.android.gms.internal.measurement.zzip.zzm(r12, r11, r9)
            long r2 = r9.zzb
            r0 = r10
            r1 = r30
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r6 | r25
            r2 = r32
            r11 = r34
            r0 = r7
            goto L_0x02ba
        L_0x027d:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bf
            int r0 = com.google.android.gms.internal.measurement.zzip.zzb(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzmv.zzp(r14, r4, r0)
            int r0 = r11 + 4
            goto L_0x02b4
        L_0x0299:
            r13 = r2
            r32 = r20
            r11 = r21
            r4 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02bf
            long r0 = com.google.android.gms.internal.measurement.zzip.zzn(r12, r11)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzmv.zzo(r14, r4, r0)
        L_0x02b2:
            int r0 = r11 + 8
        L_0x02b4:
            r5 = r6 | r25
        L_0x02b6:
            r2 = r32
            r11 = r34
        L_0x02ba:
            r3 = r13
            r1 = r18
            goto L_0x0336
        L_0x02bf:
            r21 = r11
            goto L_0x02d4
        L_0x02c2:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkk.zzg(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x02cf:
            r5 = r6 | r25
            r12 = r31
            goto L_0x02b6
        L_0x02d4:
            r7 = r34
            r22 = r6
            r28 = r10
            r8 = r18
            r2 = r21
            r6 = r27
            r21 = r13
            goto L_0x03ed
        L_0x02e4:
            r13 = r2
            r18 = r4
            r3 = r11
            r4 = r20
            r11 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r3 != r0) goto L_0x034a
            r0 = 2
            if (r7 != r0) goto L_0x033c
            java.lang.Object r0 = r10.getObject(r14, r11)
            com.google.android.gms.internal.measurement.zzkj r0 = (com.google.android.gms.internal.measurement.zzkj) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0315
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030d
            r1 = 10
            goto L_0x030e
        L_0x030d:
            int r1 = r1 + r1
        L_0x030e:
            com.google.android.gms.internal.measurement.zzkj r0 = r0.zzd(r1)
            r10.putObject(r14, r11, r0)
        L_0x0315:
            r7 = r0
            com.google.android.gms.internal.measurement.zzlu r0 = r15.zzE(r13)
            r1 = r18
            r2 = r31
            r3 = r21
            r8 = r4
            r4 = r33
            r22 = r5
            r5 = r7
            r27 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.measurement.zzip.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r31
            r11 = r34
            r2 = r8
            r3 = r13
            r5 = r22
        L_0x0336:
            r6 = r27
            r13 = r33
            goto L_0x001a
        L_0x033c:
            r22 = r5
            r27 = r6
            r32 = r4
            r28 = r10
            r15 = r21
            r21 = r13
            goto L_0x03cb
        L_0x034a:
            r22 = r5
            r27 = r6
            r5 = r4
            r0 = 49
            if (r3 > r0) goto L_0x03a0
            long r1 = (long) r8
            r0 = r29
            r23 = r1
            r1 = r30
            r2 = r31
            r8 = r3
            r3 = r21
            r4 = r33
            r32 = r5
            r5 = r18
            r6 = r32
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r23
            r25 = r11
            r15 = r21
            r12 = r34
            r11 = r20
            r21 = r13
            r12 = r25
            r14 = r35
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039c
        L_0x0382:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r3 = r21
            r5 = r22
            r6 = r27
            r10 = r28
            goto L_0x001a
        L_0x039c:
            r7 = r34
            r2 = r0
            goto L_0x03ce
        L_0x03a0:
            r20 = r3
            r32 = r5
            r28 = r10
            r25 = r11
            r15 = r21
            r21 = r13
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x03d3
            r0 = 2
            if (r7 != r0) goto L_0x03cb
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r25
            r8 = r35
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x039c
            goto L_0x0382
        L_0x03cb:
            r7 = r34
            r2 = r15
        L_0x03ce:
            r8 = r18
            r6 = r27
            goto L_0x03ed
        L_0x03d3:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r32
            r10 = r25
            r12 = r21
            r13 = r35
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x039c
            goto L_0x0382
        L_0x03ed:
            if (r8 != r7) goto L_0x03fb
            if (r7 == 0) goto L_0x03fb
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r22
            goto L_0x0464
        L_0x03fb:
            r9 = r29
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x0434
            r10 = r35
            com.google.android.gms.internal.measurement.zzjo r0 = r10.zzd
            com.google.android.gms.internal.measurement.zzjo r1 = com.google.android.gms.internal.measurement.zzjo.zza()
            if (r0 == r1) goto L_0x042f
            com.google.android.gms.internal.measurement.zzlj r0 = r9.zzg
            com.google.android.gms.internal.measurement.zzjo r1 = r10.zzd
            r11 = r32
            com.google.android.gms.internal.measurement.zzka r0 = r1.zzc(r0, r11)
            if (r0 != 0) goto L_0x0429
            com.google.android.gms.internal.measurement.zzmm r4 = zzd(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzip.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0449
        L_0x0429:
            r12 = r30
            r0 = r12
            com.google.android.gms.internal.measurement.zzjz r0 = (com.google.android.gms.internal.measurement.zzjz) r0
            throw r17
        L_0x042f:
            r12 = r30
            r11 = r32
            goto L_0x043a
        L_0x0434:
            r12 = r30
            r11 = r32
            r10 = r35
        L_0x043a:
            com.google.android.gms.internal.measurement.zzmm r4 = zzd(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.measurement.zzip.zzi(r0, r1, r2, r3, r4, r5)
        L_0x0449:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r22
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x001a
        L_0x045b:
            r22 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0464:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x046f
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x046f:
            int r3 = r9.zzk
        L_0x0471:
            int r4 = r9.zzl
            if (r3 >= r4) goto L_0x049c
            int[] r4 = r9.zzj
            r4 = r4[r3]
            int[] r5 = r9.zzc
            r5 = r5[r4]
            int r5 = r9.zzB(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzmv.zzf(r12, r5)
            if (r5 != 0) goto L_0x048a
            goto L_0x0490
        L_0x048a:
            com.google.android.gms.internal.measurement.zzkg r6 = r9.zzD(r4)
            if (r6 != 0) goto L_0x0493
        L_0x0490:
            int r3 = r3 + 1
            goto L_0x0471
        L_0x0493:
            com.google.android.gms.internal.measurement.zzld r5 = (com.google.android.gms.internal.measurement.zzld) r5
            java.lang.Object r0 = r9.zzF(r4)
            com.google.android.gms.internal.measurement.zzlc r0 = (com.google.android.gms.internal.measurement.zzlc) r0
            throw r17
        L_0x049c:
            if (r7 != 0) goto L_0x04a8
            r2 = r33
            if (r0 != r2) goto L_0x04a3
            goto L_0x04ae
        L_0x04a3:
            com.google.android.gms.internal.measurement.zzkm r0 = com.google.android.gms.internal.measurement.zzkm.zze()
            throw r0
        L_0x04a8:
            r2 = r33
            if (r0 > r2) goto L_0x04af
            if (r1 != r7) goto L_0x04af
        L_0x04ae:
            return r0
        L_0x04af:
            com.google.android.gms.internal.measurement.zzkm r0 = com.google.android.gms.internal.measurement.zzkm.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, (Object) null, (Object) null);
    }

    public final void zzf(Object obj) {
        int i;
        int i10 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i10 >= i) {
                break;
            }
            long zzB = (long) (zzB(this.zzj[i10]) & 1048575);
            Object zzf2 = zzmv.zzf(obj, zzB);
            if (zzf2 != null) {
                ((zzld) zzf2).zzc();
                zzmv.zzs(obj, zzB, zzf2);
            }
            i10++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, (long) this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j10 = (long) (1048575 & zzB);
            int i10 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzo(obj, j10, zzmv.zza(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 1:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzp(obj, j10, zzmv.zzb(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 2:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 3:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 4:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 5:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 6:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 7:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzm(obj, j10, zzmv.zzw(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 8:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 11:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 12:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 13:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 14:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 15:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 16:
                    if (!zzO(obj2, i)) {
                        break;
                    } else {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i);
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case R.styleable.MapAttrs_zOrderOnTop:
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j10);
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
                    if (!zzR(obj2, i10, i)) {
                        break;
                    } else {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i10, i);
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                case 65:
                case 66:
                case 67:
                    if (!zzR(obj2, i10, i)) {
                        break;
                    } else {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i10, i);
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    public final void zzh(Object obj, byte[] bArr, int i, int i10, zzio zzio) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i10, zzio);
        } else {
            zzc(obj, bArr, i, i10, 0, zzio);
        }
    }

    public final void zzi(Object obj, zznd zznd) throws IOException {
        if (!this.zzi) {
            zzL(obj, zznd);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                int i10 = this.zzc[i];
                switch (zzA(zzB)) {
                    case 0:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzf(i10, zzmv.zza(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzo(i10, zzmv.zzb(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzt(i10, zzmv.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzJ(i10, zzmv.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzr(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzm(i10, zzmv.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzk(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzb(i10, zzmv.zzw(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zzT(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zznd);
                            break;
                        }
                    case 9:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzv(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 10:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzd(i10, (zzjb) zzmv.zzf(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzH(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzi(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzw(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzy(i10, zzmv.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzA(i10, zzmv.zzc(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzC(i10, zzmv.zzd(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzO(obj, i)) {
                            break;
                        } else {
                            zznd.zzq(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 18:
                        zzlw.zzJ(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 19:
                        zzlw.zzN(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 20:
                        zzlw.zzQ(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 21:
                        zzlw.zzY(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 22:
                        zzlw.zzP(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 23:
                        zzlw.zzM(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 24:
                        zzlw.zzL(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case R.styleable.MapAttrs_zOrderOnTop:
                        zzlw.zzH(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 26:
                        zzlw.zzW(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd);
                        break;
                    case 27:
                        zzlw.zzR(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, zzE(i));
                        break;
                    case 28:
                        zzlw.zzI(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd);
                        break;
                    case 29:
                        zzlw.zzX(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 30:
                        zzlw.zzK(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 31:
                        zzlw.zzS(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                        zzlw.zzT(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 33:
                        zzlw.zzU(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 34:
                        zzlw.zzV(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, false);
                        break;
                    case 35:
                        zzlw.zzJ(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 36:
                        zzlw.zzN(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 37:
                        zzlw.zzQ(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 38:
                        zzlw.zzY(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 39:
                        zzlw.zzP(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 40:
                        zzlw.zzM(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 41:
                        zzlw.zzL(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 42:
                        zzlw.zzH(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 43:
                        zzlw.zzX(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 44:
                        zzlw.zzK(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 45:
                        zzlw.zzS(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 46:
                        zzlw.zzT(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 47:
                        zzlw.zzU(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 48:
                        zzlw.zzV(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, true);
                        break;
                    case 49:
                        zzlw.zzO(i10, (List) zzmv.zzf(obj, (long) (zzB & 1048575)), zznd, zzE(i));
                        break;
                    case 50:
                        zzM(zznd, i10, zzmv.zzf(obj, (long) (zzB & 1048575)), i);
                        break;
                    case 51:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzf(i10, zzn(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzo(i10, zzo(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzt(i10, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzJ(i10, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzr(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzm(i10, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzk(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzb(i10, zzS(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zzT(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zznd);
                            break;
                        }
                    case 60:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzv(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                    case 61:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzd(i10, (zzjb) zzmv.zzf(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzH(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzi(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzw(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzy(i10, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzA(i10, zzr(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzC(i10, zzC(obj, (long) (zzB & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzR(obj, i10, i)) {
                            break;
                        } else {
                            zznd.zzq(i10, zzmv.zzf(obj, (long) (zzB & 1048575)), zzE(i));
                            break;
                        }
                }
            }
            zzml zzml = this.zzn;
            zzml.zzi(zzml.zzc(obj), zznd);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j10 = (long) (zzB & 1048575);
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmv.zza(obj, j10)) == Double.doubleToLongBits(zzmv.zza(obj2, j10))) {
                        continue;
                    }
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmv.zzb(obj, j10)) == Float.floatToIntBits(zzmv.zzb(obj2, j10))) {
                        continue;
                    }
                case 2:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                case 3:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                case 4:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 5:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                case 6:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 7:
                    if (zzN(obj, obj2, i) && zzmv.zzw(obj, j10) == zzmv.zzw(obj2, j10)) {
                        continue;
                    }
                case 8:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                case 9:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                case 10:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                case 11:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 12:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 13:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 14:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                case 15:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                case 16:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                case 17:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case R.styleable.MapAttrs_zOrderOnTop:
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
                    z = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 50:
                    z = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
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
                    long zzy = (long) (zzy(i) & 1048575);
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        int i;
        int i10;
        Object obj2 = obj;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.zzk) {
            int i14 = this.zzj[i13];
            int i15 = this.zzc[i14];
            int zzB = zzB(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = zzb.getInt(obj2, (long) i17);
                }
                i = i12;
                i10 = i17;
            } else {
                i10 = i11;
                i = i12;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i14, i10, i, i18)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj2, i15, i14) && !zzQ(obj2, zzB, zzE(i14))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj2, (long) (zzB & 1048575))).isEmpty()) {
                            zzlc zzlc = (zzlc) zzF(i14);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj2, (long) (zzB & 1048575));
                if (!list.isEmpty()) {
                    zzlu zzE = zzE(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzE.zzk(list.get(i19))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzP(obj, i14, i10, i, i18) && !zzQ(obj2, zzB, zzE(i14))) {
                return false;
            }
            i13++;
            i11 = i10;
            i12 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj2);
        throw null;
    }
}
