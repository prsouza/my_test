package com.google.android.gms.measurement.internal;

import a.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzex;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzli;
import com.google.android.gms.internal.measurement.zzpa;
import com.google.android.gms.internal.measurement.zzpp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class zzlk extends zzkw {
    public zzlk(zzli zzli) {
        super(zzli);
    }

    public static final boolean zzA(zzav zzav, zzp zzp) {
        Preconditions.checkNotNull(zzav);
        Preconditions.checkNotNull(zzp);
        return !TextUtils.isEmpty(zzp.zzb) || !TextUtils.isEmpty(zzp.zzq);
    }

    public static final zzfw zzB(zzfs zzfs, String str) {
        for (zzfw zzfw : zzfs.zzi()) {
            if (zzfw.zzg().equals(str)) {
                return zzfw;
            }
        }
        return null;
    }

    public static final Object zzC(zzfs zzfs, String str) {
        zzfw zzB = zzB(zzfs, str);
        if (zzB == null) {
            return null;
        }
        if (zzB.zzy()) {
            return zzB.zzh();
        }
        if (zzB.zzw()) {
            return Long.valueOf(zzB.zzd());
        }
        if (zzB.zzu()) {
            return Double.valueOf(zzB.zza());
        }
        if (zzB.zzc() <= 0) {
            return null;
        }
        List<zzfw> zzi = zzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (zzfw zzfw : zzi) {
            if (zzfw != null) {
                Bundle bundle = new Bundle();
                for (zzfw zzfw2 : zzfw.zzi()) {
                    if (zzfw2.zzy()) {
                        bundle.putString(zzfw2.zzg(), zzfw2.zzh());
                    } else if (zzfw2.zzw()) {
                        bundle.putLong(zzfw2.zzg(), zzfw2.zzd());
                    } else if (zzfw2.zzu()) {
                        bundle.putDouble(zzfw2.zzg(), zzfw2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb2, int i, List list) {
        if (list != null) {
            int i10 = i + 1;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfw zzfw = (zzfw) it.next();
                if (zzfw != null) {
                    zzF(sb2, i10);
                    sb2.append("param {\n");
                    Double d10 = null;
                    zzI(sb2, i10, AppMeasurementSdk.ConditionalUserProperty.NAME, zzfw.zzx() ? this.zzs.zzj().zze(zzfw.zzg()) : null);
                    zzI(sb2, i10, "string_value", zzfw.zzy() ? zzfw.zzh() : null);
                    zzI(sb2, i10, "int_value", zzfw.zzw() ? Long.valueOf(zzfw.zzd()) : null);
                    if (zzfw.zzu()) {
                        d10 = Double.valueOf(zzfw.zza());
                    }
                    zzI(sb2, i10, "double_value", d10);
                    if (zzfw.zzc() > 0) {
                        zzD(sb2, i10, zzfw.zzi());
                    }
                    zzF(sb2, i10);
                    sb2.append("}\n");
                }
            }
        }
    }

    private final void zzE(StringBuilder sb2, int i, zzel zzel) {
        String str;
        if (zzel != null) {
            zzF(sb2, i);
            sb2.append("filter {\n");
            if (zzel.zzh()) {
                zzI(sb2, i, "complement", Boolean.valueOf(zzel.zzg()));
            }
            if (zzel.zzj()) {
                zzI(sb2, i, "param_name", this.zzs.zzj().zze(zzel.zze()));
            }
            if (zzel.zzk()) {
                int i10 = i + 1;
                zzex zzd = zzel.zzd();
                if (zzd != null) {
                    zzF(sb2, i10);
                    sb2.append("string_filter {\n");
                    if (zzd.zzi()) {
                        switch (zzd.zzj()) {
                            case 1:
                                str = "UNKNOWN_MATCH_TYPE";
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        zzI(sb2, i10, "match_type", str);
                    }
                    if (zzd.zzh()) {
                        zzI(sb2, i10, "expression", zzd.zzd());
                    }
                    if (zzd.zzg()) {
                        zzI(sb2, i10, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                    }
                    if (zzd.zza() > 0) {
                        zzF(sb2, i10 + 1);
                        sb2.append("expression_list {\n");
                        for (String append : zzd.zze()) {
                            zzF(sb2, i10 + 2);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    zzF(sb2, i10);
                    sb2.append("}\n");
                }
            }
            if (zzel.zzi()) {
                zzJ(sb2, i + 1, "number_filter", zzel.zzc());
            }
            zzF(sb2, i);
            sb2.append("}\n");
        }
    }

    private static final void zzF(StringBuilder sb2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            sb2.append("  ");
        }
    }

    private static final String zzG(boolean z, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("Dynamic ");
        }
        if (z10) {
            sb2.append("Sequence ");
        }
        if (z11) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final void zzH(StringBuilder sb2, int i, String str, zzgh zzgh) {
        if (zzgh != null) {
            zzF(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzgh.zzb() != 0) {
                zzF(sb2, 4);
                sb2.append("results: ");
                int i10 = 0;
                for (Long l10 : zzgh.zzk()) {
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l10);
                    i10 = i11;
                }
                sb2.append(10);
            }
            if (zzgh.zzd() != 0) {
                zzF(sb2, 4);
                sb2.append("status: ");
                int i12 = 0;
                for (Long l11 : zzgh.zzn()) {
                    int i13 = i12 + 1;
                    if (i12 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(l11);
                    i12 = i13;
                }
                sb2.append(10);
            }
            if (zzgh.zza() != 0) {
                zzF(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i14 = 0;
                for (zzfq zzfq : zzgh.zzj()) {
                    int i15 = i14 + 1;
                    if (i14 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(zzfq.zzh() ? Integer.valueOf(zzfq.zza()) : null);
                    sb2.append(":");
                    sb2.append(zzfq.zzg() ? Long.valueOf(zzfq.zzb()) : null);
                    i14 = i15;
                }
                sb2.append("}\n");
            }
            if (zzgh.zzc() != 0) {
                zzF(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i16 = 0;
                for (zzgj zzgj : zzgh.zzm()) {
                    int i17 = i16 + 1;
                    if (i16 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(zzgj.zzi() ? Integer.valueOf(zzgj.zzb()) : null);
                    sb2.append(": [");
                    int i18 = 0;
                    for (Long longValue : zzgj.zzf()) {
                        long longValue2 = longValue.longValue();
                        int i19 = i18 + 1;
                        if (i18 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i18 = i19;
                    }
                    sb2.append("]");
                    i16 = i17;
                }
                sb2.append("}\n");
            }
            zzF(sb2, 3);
            sb2.append("}\n");
        }
    }

    private static final void zzI(StringBuilder sb2, int i, String str, Object obj) {
        if (obj != null) {
            zzF(sb2, i + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    private static final void zzJ(StringBuilder sb2, int i, String str, zzeq zzeq) {
        if (zzeq != null) {
            zzF(sb2, i);
            sb2.append(str);
            sb2.append(" {\n");
            if (zzeq.zzg()) {
                int zzm = zzeq.zzm();
                zzI(sb2, i, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
            }
            if (zzeq.zzi()) {
                zzI(sb2, i, "match_as_float", Boolean.valueOf(zzeq.zzf()));
            }
            if (zzeq.zzh()) {
                zzI(sb2, i, "comparison_value", zzeq.zzc());
            }
            if (zzeq.zzk()) {
                zzI(sb2, i, "min_comparison_value", zzeq.zze());
            }
            if (zzeq.zzj()) {
                zzI(sb2, i, "max_comparison_value", zzeq.zzd());
            }
            zzF(sb2, i);
            sb2.append("}\n");
        }
    }

    public static int zza(zzgb zzgb, String str) {
        if (zzgb != null) {
            for (int i = 0; i < zzgb.zzb(); i++) {
                if (str.equals(zzgb.zzap(i).zzf())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static zzli zzl(zzli zzli, byte[] bArr) throws zzkm {
        zzjo zzb = zzjo.zzb();
        if (zzb != null) {
            return zzli.zzaA(bArr, zzb);
        }
        return zzli.zzaz(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j10 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(zzfr zzfr, String str, Object obj) {
        List zzp = zzfr.zzp();
        int i = 0;
        while (true) {
            if (i >= zzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((zzfw) zzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        zzfv zze = zzfw.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfr.zzj(i, zze);
        } else {
            zzfr.zze(zze);
        }
    }

    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzs.zzv().zzg();
        MessageDigest zzF = zzlp.zzF();
        if (zzF != null) {
            return zzlp.zzp(zzF.digest(bArr));
        }
        a.e(this.zzs, "Failed to get MD5");
        return 0;
    }

    public final Bundle zzf(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                zzpa.zzc();
                if (this.zzs.zzf().zzs((String) null, zzel.zzam)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(zzf((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        arrayList4.add(zzf((Map) arrayList3.get(i10), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.zzs.zzaz().zzd().zza("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable zzh(byte[] r5, android.os.Parcelable.Creator r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            com.google.android.gms.measurement.internal.zzgi r5 = r4.zzs     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzaz()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzd()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.zza(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlk.zzh(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzav zzi(com.google.android.gms.internal.measurement.zzaa r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.zze()
            r1 = 1
            android.os.Bundle r0 = r8.zzf(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001c
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r1.toString()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = "app"
        L_0x001e:
            r5 = r1
            java.lang.String r1 = r9.zzd()
            java.lang.String r1 = com.google.android.gms.measurement.internal.zzhf.zzb(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r9.zzd()
        L_0x002d:
            r3 = r1
            com.google.android.gms.measurement.internal.zzav r1 = new com.google.android.gms.measurement.internal.zzav
            com.google.android.gms.measurement.internal.zzat r4 = new com.google.android.gms.measurement.internal.zzat
            r4.<init>(r0)
            long r6 = r9.zza()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlk.zzi(com.google.android.gms.internal.measurement.zzaa):com.google.android.gms.measurement.internal.zzav");
    }

    public final zzfs zzj(zzaq zzaq) {
        zzfr zze = zzfs.zze();
        zze.zzl(zzaq.zze);
        zzas zzas = new zzas(zzaq.zzf);
        while (zzas.hasNext()) {
            String zza = zzas.next();
            zzfv zze2 = zzfw.zze();
            zze2.zzj(zza);
            Object zzf = zzaq.zzf.zzf(zza);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (zzfs) zze.zzaE();
    }

    public final String zzm(zzga zzga) {
        if (zzga == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder d10 = a.d("\nbatch {\n");
        for (zzgc zzgc : zzga.zzd()) {
            if (zzgc != null) {
                zzF(d10, 1);
                d10.append("bundle {\n");
                if (zzgc.zzbm()) {
                    zzI(d10, 1, "protocol_version", Integer.valueOf(zzgc.zzd()));
                }
                zzpp.zzc();
                if (this.zzs.zzf().zzs((String) null, zzel.zzaH) && zzgc.zzbp()) {
                    zzI(d10, 1, "session_stitching_token", zzgc.zzL());
                }
                zzI(d10, 1, "platform", zzgc.zzJ());
                if (zzgc.zzbi()) {
                    zzI(d10, 1, "gmp_version", Long.valueOf(zzgc.zzn()));
                }
                if (zzgc.zzbt()) {
                    zzI(d10, 1, "uploading_gmp_version", Long.valueOf(zzgc.zzs()));
                }
                if (zzgc.zzbg()) {
                    zzI(d10, 1, "dynamite_version", Long.valueOf(zzgc.zzk()));
                }
                if (zzgc.zzbd()) {
                    zzI(d10, 1, "config_version", Long.valueOf(zzgc.zzi()));
                }
                zzI(d10, 1, "gmp_app_id", zzgc.zzG());
                zzI(d10, 1, "admob_app_id", zzgc.zzx());
                zzI(d10, 1, "app_id", zzgc.zzy());
                zzI(d10, 1, "app_version", zzgc.zzB());
                if (zzgc.zzbb()) {
                    zzI(d10, 1, "app_version_major", Integer.valueOf(zzgc.zza()));
                }
                zzI(d10, 1, "firebase_instance_id", zzgc.zzF());
                if (zzgc.zzbf()) {
                    zzI(d10, 1, "dev_cert_hash", Long.valueOf(zzgc.zzj()));
                }
                zzI(d10, 1, "app_store", zzgc.zzA());
                if (zzgc.zzbs()) {
                    zzI(d10, 1, "upload_timestamp_millis", Long.valueOf(zzgc.zzr()));
                }
                if (zzgc.zzbq()) {
                    zzI(d10, 1, "start_timestamp_millis", Long.valueOf(zzgc.zzq()));
                }
                if (zzgc.zzbh()) {
                    zzI(d10, 1, "end_timestamp_millis", Long.valueOf(zzgc.zzm()));
                }
                if (zzgc.zzbl()) {
                    zzI(d10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgc.zzp()));
                }
                if (zzgc.zzbk()) {
                    zzI(d10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgc.zzo()));
                }
                zzI(d10, 1, "app_instance_id", zzgc.zzz());
                zzI(d10, 1, "resettable_device_id", zzgc.zzK());
                zzI(d10, 1, "ds_id", zzgc.zzE());
                if (zzgc.zzbj()) {
                    zzI(d10, 1, "limited_ad_tracking", Boolean.valueOf(zzgc.zzaY()));
                }
                zzI(d10, 1, "os_version", zzgc.zzI());
                zzI(d10, 1, "device_model", zzgc.zzD());
                zzI(d10, 1, "user_default_language", zzgc.zzM());
                if (zzgc.zzbr()) {
                    zzI(d10, 1, "time_zone_offset_minutes", Integer.valueOf(zzgc.zzf()));
                }
                if (zzgc.zzbc()) {
                    zzI(d10, 1, "bundle_sequential_index", Integer.valueOf(zzgc.zzb()));
                }
                if (zzgc.zzbo()) {
                    zzI(d10, 1, "service_upload", Boolean.valueOf(zzgc.zzaZ()));
                }
                zzI(d10, 1, "health_monitor", zzgc.zzH());
                if (!this.zzs.zzf().zzs((String) null, zzel.zzah) && zzgc.zzba() && zzgc.zzh() != 0) {
                    zzI(d10, 1, "android_id", Long.valueOf(zzgc.zzh()));
                }
                if (zzgc.zzbn()) {
                    zzI(d10, 1, "retry_counter", Integer.valueOf(zzgc.zze()));
                }
                if (zzgc.zzbe()) {
                    zzI(d10, 1, "consent_signals", zzgc.zzC());
                }
                List<zzgl> zzP = zzgc.zzP();
                if (zzP != null) {
                    for (zzgl zzgl : zzP) {
                        if (zzgl != null) {
                            zzF(d10, 2);
                            d10.append("user_property {\n");
                            zzI(d10, 2, "set_timestamp_millis", zzgl.zzs() ? Long.valueOf(zzgl.zzc()) : null);
                            zzI(d10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzf(zzgl.zzf()));
                            zzI(d10, 2, "string_value", zzgl.zzg());
                            zzI(d10, 2, "int_value", zzgl.zzr() ? Long.valueOf(zzgl.zzb()) : null);
                            zzI(d10, 2, "double_value", zzgl.zzq() ? Double.valueOf(zzgl.zza()) : null);
                            zzF(d10, 2);
                            d10.append("}\n");
                        }
                    }
                }
                List<zzfo> zzN = zzgc.zzN();
                if (zzN != null) {
                    for (zzfo zzfo : zzN) {
                        if (zzfo != null) {
                            zzF(d10, 2);
                            d10.append("audience_membership {\n");
                            if (zzfo.zzk()) {
                                zzI(d10, 2, "audience_id", Integer.valueOf(zzfo.zza()));
                            }
                            if (zzfo.zzm()) {
                                zzI(d10, 2, "new_audience", Boolean.valueOf(zzfo.zzj()));
                            }
                            zzH(d10, 2, "current_data", zzfo.zzd());
                            if (zzfo.zzn()) {
                                zzH(d10, 2, "previous_data", zzfo.zze());
                            }
                            zzF(d10, 2);
                            d10.append("}\n");
                        }
                    }
                }
                List<zzfs> zzO = zzgc.zzO();
                if (zzO != null) {
                    for (zzfs zzfs : zzO) {
                        if (zzfs != null) {
                            zzF(d10, 2);
                            d10.append("event {\n");
                            zzI(d10, 2, AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzs.zzj().zzd(zzfs.zzh()));
                            if (zzfs.zzu()) {
                                zzI(d10, 2, "timestamp_millis", Long.valueOf(zzfs.zzd()));
                            }
                            if (zzfs.zzt()) {
                                zzI(d10, 2, "previous_timestamp_millis", Long.valueOf(zzfs.zzc()));
                            }
                            if (zzfs.zzs()) {
                                zzI(d10, 2, "count", Integer.valueOf(zzfs.zza()));
                            }
                            if (zzfs.zzb() != 0) {
                                zzD(d10, 2, zzfs.zzi());
                            }
                            zzF(d10, 2);
                            d10.append("}\n");
                        }
                    }
                }
                zzF(d10, 1);
                d10.append("}\n");
            }
        }
        d10.append("}\n");
        return d10.toString();
    }

    public final String zzo(zzej zzej) {
        if (zzej == null) {
            return "null";
        }
        StringBuilder d10 = a.d("\nevent_filter {\n");
        if (zzej.zzp()) {
            zzI(d10, 0, "filter_id", Integer.valueOf(zzej.zzb()));
        }
        zzI(d10, 0, "event_name", this.zzs.zzj().zzd(zzej.zzg()));
        String zzG = zzG(zzej.zzk(), zzej.zzm(), zzej.zzn());
        if (!zzG.isEmpty()) {
            zzI(d10, 0, "filter_type", zzG);
        }
        if (zzej.zzo()) {
            zzJ(d10, 1, "event_count_filter", zzej.zzf());
        }
        if (zzej.zza() > 0) {
            d10.append("  filters {\n");
            for (zzel zzE : zzej.zzh()) {
                zzE(d10, 2, zzE);
            }
        }
        zzF(d10, 1);
        d10.append("}\n}\n");
        return d10.toString();
    }

    public final String zzp(zzes zzes) {
        if (zzes == null) {
            return "null";
        }
        StringBuilder d10 = a.d("\nproperty_filter {\n");
        if (zzes.zzj()) {
            zzI(d10, 0, "filter_id", Integer.valueOf(zzes.zza()));
        }
        zzI(d10, 0, "property_name", this.zzs.zzj().zzf(zzes.zze()));
        String zzG = zzG(zzes.zzg(), zzes.zzh(), zzes.zzi());
        if (!zzG.isEmpty()) {
            zzI(d10, 0, "filter_type", zzG);
        }
        zzE(d10, 1, zzes.zzb());
        d10.append("}\n");
        return d10.toString();
    }

    public final List zzq(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzs.zzaz().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzs.zzaz().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i = size;
            size = i10;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    public final Map zzs(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            zzpa.zzc();
            if (!this.zzs.zzf().zzs((String) null, zzel.zzam) ? (obj instanceof Bundle[]) || (obj instanceof ArrayList) || (obj instanceof Bundle) : (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (obj instanceof Parcelable[]) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void zzt(zzfv zzfv, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfv.zzg();
        zzfv.zze();
        zzfv.zzd();
        zzfv.zzf();
        if (obj instanceof String) {
            zzfv.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfv.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfv.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfv zze = zzfw.zze();
                    for (String next : bundle.keySet()) {
                        zzfv zze2 = zzfw.zze();
                        zze2.zzj(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfw) zze.zzaE());
                    }
                }
            }
            zzfv.zzb(arrayList);
        } else {
            this.zzs.zzaz().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zzu(zzgk zzgk, Object obj) {
        Preconditions.checkNotNull(obj);
        zzgk.zzc();
        zzgk.zzb();
        zzgk.zza();
        if (obj instanceof String) {
            zzgk.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzgk.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzgk.zzd(((Double) obj).doubleValue());
        } else {
            this.zzs.zzaz().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(this.zzs.zzaw().currentTimeMillis() - j10) > j11;
    }

    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzs.zzaz().zzd().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }
}
