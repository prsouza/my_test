package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

public final class zzah {
    public static final zzah zza = new zzah((Boolean) null, (Boolean) null);
    private final EnumMap zzb;

    public zzah(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzag.class);
        this.zzb = enumMap;
        enumMap.put(zzag.AD_STORAGE, bool);
        enumMap.put(zzag.ANALYTICS_STORAGE, bool2);
    }

    public static zzah zza(Bundle bundle) {
        if (bundle == null) {
            return zza;
        }
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzag : zzag.values()) {
            enumMap.put(zzag, zzn(bundle.getString(zzag.zzd)));
        }
        return new zzah(enumMap);
    }

    public static zzah zzb(String str) {
        EnumMap enumMap = new EnumMap(zzag.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzag[] zzagArr = zzag.zzc;
                int length = zzagArr.length;
                if (i >= 2) {
                    break;
                }
                zzag zzag = zzagArr[i];
                int i10 = i + 2;
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzag, bool);
                }
                i++;
            }
        }
        return new zzah(enumMap);
    }

    public static String zzg(Bundle bundle) {
        String string;
        for (zzag zzag : zzag.values()) {
            if (bundle.containsKey(zzag.zzd) && (string = bundle.getString(zzag.zzd)) != null && zzn(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzj(int i, int i10) {
        return i <= i10;
    }

    public static final int zzm(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzn(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzah = (zzah) obj;
        for (zzag zzag : zzag.values()) {
            if (zzm((Boolean) this.zzb.get(zzag)) != zzm((Boolean) zzah.zzb.get(zzag))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean zzm : this.zzb.values()) {
            i = (i * 31) + zzm(zzm);
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        zzag[] values = zzag.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzag zzag = values[i];
            if (i != 0) {
                sb2.append(", ");
            }
            sb2.append(zzag.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzag);
            if (bool == null) {
                sb2.append("uninitialized");
            } else {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            }
        }
        return sb2.toString();
    }

    public final zzah zzc(zzah zzah) {
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzag : zzag.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzag);
            Boolean bool2 = (Boolean) zzah.zzb.get(zzag);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(zzag, bool);
        }
        return new zzah(enumMap);
    }

    public final zzah zzd(zzah zzah) {
        EnumMap enumMap = new EnumMap(zzag.class);
        for (zzag zzag : zzag.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzag);
            if (bool == null) {
                bool = (Boolean) zzah.zzb.get(zzag);
            }
            enumMap.put(zzag, bool);
        }
        return new zzah(enumMap);
    }

    public final Boolean zze() {
        return (Boolean) this.zzb.get(zzag.AD_STORAGE);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzag.ANALYTICS_STORAGE);
    }

    public final String zzh() {
        char c10;
        StringBuilder sb2 = new StringBuilder("G1");
        zzag[] zzagArr = zzag.zzc;
        int length = zzagArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.zzb.get(zzagArr[i]);
            if (bool == null) {
                c10 = '-';
            } else {
                c10 = bool.booleanValue() ? '1' : '0';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final boolean zzi(zzag zzag) {
        Boolean bool = (Boolean) this.zzb.get(zzag);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzk(zzah zzah) {
        return zzl(zzah, (zzag[]) this.zzb.keySet().toArray(new zzag[0]));
    }

    public final boolean zzl(zzah zzah, zzag... zzagArr) {
        for (zzag zzag : zzagArr) {
            Boolean bool = (Boolean) this.zzb.get(zzag);
            Boolean bool2 = (Boolean) zzah.zzb.get(zzag);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzah(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzag.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
