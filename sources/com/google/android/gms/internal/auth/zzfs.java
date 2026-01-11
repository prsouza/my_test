package com.google.android.gms.internal.auth;

import b9.m;
import com.github.mikephil.charting.BuildConfig;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

final class zzfs {
    public static String zza(zzfq zzfq, String str) {
        StringBuilder c10 = m.c("# ", str);
        zzd(zzfq, c10, 0);
        return c10.toString();
    }

    public static final void zzb(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i, str, zzb2);
            }
        } else {
            sb2.append(10);
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgn.zza(zzeb.zzl((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzeb) {
                sb2.append(": \"");
                sb2.append(zzgn.zza((zzeb) obj));
                sb2.append('\"');
            } else if (obj instanceof zzeq) {
                sb2.append(" {");
                zzd((zzeq) obj, sb2, i + 2);
                sb2.append("\n");
                while (i10 < i) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i + 2;
                zzb(sb2, i12, "key", entry.getKey());
                zzb(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb2.append("\n");
                while (i10 < i) {
                    sb2.append(' ');
                    i10++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj.toString());
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    private static void zzd(zzfq zzfq, StringBuilder sb2, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzfq.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str8 = (String) it.next();
            String substring = str8.startsWith("get") ? str8.substring(3) : str8;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                if (valueOf2.length() != 0) {
                    str7 = valueOf.concat(valueOf2);
                } else {
                    str7 = new String(valueOf);
                }
                Method method2 = (Method) hashMap.get(str8);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i, zzc(str7), zzeq.zzf(method2, zzfq, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                if (valueOf4.length() != 0) {
                    str6 = valueOf3.concat(valueOf4);
                } else {
                    str6 = new String(valueOf3);
                }
                Method method3 = (Method) hashMap.get(str8);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i, zzc(str6), zzeq.zzf(method3, zzfq, new Object[0]));
                }
            }
            if (substring.length() != 0) {
                str = "set".concat(substring);
            } else {
                str = new String("set");
            }
            if (((Method) hashMap2.get(str)) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (valueOf5.length() != 0) {
                        str5 = "get".concat(valueOf5);
                    } else {
                        str5 = new String("get");
                    }
                    if (hashMap.containsKey(str5)) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                if (valueOf7.length() != 0) {
                    str2 = valueOf6.concat(valueOf7);
                } else {
                    str2 = new String(valueOf6);
                }
                if (substring.length() != 0) {
                    str3 = "get".concat(substring);
                } else {
                    str3 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str3);
                if (substring.length() != 0) {
                    str4 = "has".concat(substring);
                } else {
                    str4 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str4);
                if (method4 != null) {
                    Object zzf = zzeq.zzf(method4, zzfq, new Object[0]);
                    if (method5 == null) {
                        if (zzf instanceof Boolean) {
                            if (!((Boolean) zzf).booleanValue()) {
                            }
                        } else if (zzf instanceof Integer) {
                            if (((Integer) zzf).intValue() == 0) {
                            }
                        } else if (zzf instanceof Float) {
                            if (((Float) zzf).floatValue() == 0.0f) {
                            }
                        } else if (!(zzf instanceof Double)) {
                            if (zzf instanceof String) {
                                z = zzf.equals(BuildConfig.FLAVOR);
                            } else if (zzf instanceof zzeb) {
                                z = zzf.equals(zzeb.zzb);
                            } else if (zzf instanceof zzfq) {
                                if (zzf == ((zzfq) zzf).zzh()) {
                                }
                            } else if ((zzf instanceof Enum) && ((Enum) zzf).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (((Double) zzf).doubleValue() == Utils.DOUBLE_EPSILON) {
                        }
                    } else if (!((Boolean) zzeq.zzf(method5, zzfq, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i, zzc(str2), zzf);
                }
            }
        }
        if (!(zzfq instanceof zzep)) {
            zzgq zzgq = ((zzeq) zzfq).zzc;
            if (zzgq != null) {
                zzgq.zze(sb2, i);
                return;
            }
            return;
        }
        zzep zzep = (zzep) zzfq;
        throw null;
    }
}
