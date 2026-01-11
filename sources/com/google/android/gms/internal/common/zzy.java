package com.google.android.gms.internal.common;

import h1.e;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzy {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        String str3;
        int i = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    if (sb3.length() != 0) {
                        str3 = "Exception during lenientFormat for ".concat(sb3);
                    } else {
                        str3 = new String("Exception during lenientFormat for ");
                    }
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", str3, e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 9 + name2.length());
                    e.b(sb4, "<", sb3, " threw ", name2);
                    sb4.append(">");
                    str2 = sb4.toString();
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb5 = new StringBuilder((length * 16) + str.length());
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                sb5.append(str, i11, str.length());
            } else {
                sb5.append(str, i11, indexOf);
                sb5.append(objArr[i]);
                i11 = indexOf + 2;
                i++;
            }
        }
        sb5.append(str, i11, str.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i12 = i + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
