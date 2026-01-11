package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class zzik implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ Uri zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzim zze;

    public zzik(zzim zzim, boolean z, Uri uri, String str, String str2) {
        this.zze = zzim;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0 A[SYNTHETIC, Splitter:B:31:0x00b0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d A[Catch:{ RuntimeException -> 0x01b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f A[Catch:{ RuntimeException -> 0x01b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            com.google.android.gms.measurement.internal.zzim r2 = r1.zze
            boolean r0 = r1.zza
            android.net.Uri r3 = r1.zzb
            java.lang.String r4 = r1.zzc
            java.lang.String r5 = r1.zzd
            com.google.android.gms.measurement.internal.zzin r6 = r2.zza
            r6.zzg()
            com.google.android.gms.measurement.internal.zzin r6 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r6 = r6.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzlp r6 = r6.zzv()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.zznw.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r7 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r7 = r7.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzaf r7 = r7.zzf()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzek r8 = com.google.android.gms.measurement.internal.zzel.zzav     // Catch:{ RuntimeException -> 0x01b2 }
            r9 = 0
            boolean r7 = r7.zzs(r9, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.zznw.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r10 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r10 = r10.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzaf r10 = r10.zzf()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzek r11 = com.google.android.gms.measurement.internal.zzel.zzaw     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r10 = r10.zzs(r9, r11)     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r12 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r13 = "Activity created with data 'referrer' without required params"
            java.lang.String r14 = "utm_medium"
            java.lang.String r15 = "_cis"
            java.lang.String r9 = "utm_source"
            java.lang.String r1 = "utm_campaign"
            r16 = r4
            java.lang.String r4 = "gclid"
            if (r12 == 0) goto L_0x0052
        L_0x0050:
            r6 = 0
            goto L_0x00ac
        L_0x0052:
            boolean r12 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r1)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            boolean r12 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            if (r7 == 0) goto L_0x007c
            java.lang.String r12 = "utm_id"
            boolean r12 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
            java.lang.String r12 = "dclid"
            boolean r12 = r5.contains(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r12 != 0) goto L_0x0097
        L_0x007c:
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "srsltid"
            boolean r10 = r5.contains(r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r10 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r10 = 1
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.zzgi r6 = r6.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzey r6 = r6.zzaz()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            r6.zza(r13)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0050
        L_0x0097:
            java.lang.String r12 = "https://google.com/search?"
            java.lang.String r12 = r12.concat(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ RuntimeException -> 0x01b2 }
            android.os.Bundle r6 = r6.zzs(r12, r7, r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r6 == 0) goto L_0x00ac
            java.lang.String r7 = "referrer"
            r6.putString(r15, r7)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x00ac:
            java.lang.String r7 = "_cmp"
            if (r0 == 0) goto L_0x0115
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzlp r0 = r0.zzv()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.zznw.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r10 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r10 = r10.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzaf r10 = r10.zzf()     // Catch:{ RuntimeException -> 0x01b2 }
            r12 = 0
            boolean r8 = r10.zzs(r12, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.internal.measurement.zznw.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r10 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r10 = r10.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzaf r10 = r10.zzf()     // Catch:{ RuntimeException -> 0x01b2 }
            r12 = 0
            boolean r10 = r10.zzs(r12, r11)     // Catch:{ RuntimeException -> 0x01b2 }
            android.os.Bundle r0 = r0.zzs(r3, r8, r10)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x0115
            java.lang.String r3 = "intent"
            r0.putString(r15, r3)     // Catch:{ RuntimeException -> 0x01b2 }
            boolean r3 = r0.containsKey(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r3 != 0) goto L_0x0106
            if (r6 == 0) goto L_0x0106
            boolean r3 = r6.containsKey(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r3 == 0) goto L_0x0106
            r3 = 1
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x01b2 }
            r3 = 0
            java.lang.String r10 = r6.getString(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            r8[r3] = r10     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "_cer"
            java.lang.String r10 = "gclid=%s"
            java.lang.String r8 = java.lang.String.format(r10, r8)     // Catch:{ RuntimeException -> 0x01b2 }
            r0.putString(r3, r8)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x0106:
            com.google.android.gms.measurement.internal.zzin r3 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            r8 = r16
            r3.zzH(r8, r7, r0)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r3 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzr r3 = r3.zzb     // Catch:{ RuntimeException -> 0x01b2 }
            r3.zza(r8, r0)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0117
        L_0x0115:
            r8 = r16
        L_0x0117:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x011f
            goto L_0x01a1
        L_0x011f:
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "Activity created with referrer"
            r0.zzb(r3, r5)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzek r3 = com.google.android.gms.measurement.internal.zzel.zzZ     // Catch:{ RuntimeException -> 0x01b2 }
            r10 = 0
            boolean r0 = r0.zzs(r10, r3)     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r3 = "_ldl"
            java.lang.String r10 = "auto"
            if (r0 == 0) goto L_0x016d
            if (r6 == 0) goto L_0x0154
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            r0.zzH(r8, r7, r6)     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzr r0 = r0.zzb     // Catch:{ RuntimeException -> 0x01b2 }
            r0.zza(r8, r6)     // Catch:{ RuntimeException -> 0x01b2 }
            goto L_0x0165
        L_0x0154:
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.zzb(r1, r5)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x0165:
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            r1 = 1
            r4 = 0
            r0.zzY(r10, r3, r4, r1)     // Catch:{ RuntimeException -> 0x01b2 }
            return
        L_0x016d:
            boolean r0 = r5.contains(r4)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x01a2
            boolean r0 = r5.contains(r1)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r5.contains(r9)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            boolean r0 = r5.contains(r14)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "utm_term"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "utm_content"
            boolean r0 = r5.contains(r0)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 == 0) goto L_0x01a2
        L_0x0195:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ RuntimeException -> 0x01b2 }
            if (r0 != 0) goto L_0x01a1
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            r1 = 1
            r0.zzY(r10, r3, r5, r1)     // Catch:{ RuntimeException -> 0x01b2 }
        L_0x01a1:
            return
        L_0x01a2:
            com.google.android.gms.measurement.internal.zzin r0 = r2.zza     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzgi r0 = r0.zzs     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzaz()     // Catch:{ RuntimeException -> 0x01b2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzc()     // Catch:{ RuntimeException -> 0x01b2 }
            r0.zza(r13)     // Catch:{ RuntimeException -> 0x01b2 }
            return
        L_0x01b2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzin r1 = r2.zza
            com.google.android.gms.measurement.internal.zzgi r1 = r1.zzs
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzaz()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzd()
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            r1.zzb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.run():void");
    }
}
