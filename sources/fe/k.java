package fe;

import ce.c;
import e6.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import nd.u;
import net.jpountz.lz4.LZ4FrameOutputStream;

public class k extends j {
    public static final String W0(String str) {
        e.D(str, "<this>");
        Locale locale = Locale.getDefault();
        e.C(locale, "getDefault()");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb2.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase(locale);
            e.C(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb2.append(upperCase);
        }
        String substring2 = str.substring(1);
        e.C(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        String sb3 = sb2.toString();
        e.C(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static boolean X0(String str, String str2) {
        e.D(str, "<this>");
        return str.endsWith(str2);
    }

    public static final boolean Y0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean Z0(CharSequence charSequence) {
        boolean z;
        e.D(charSequence, "<this>");
        if (charSequence.length() != 0) {
            c cVar = new c(0, charSequence.length() - 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!c3.k.t0(charSequence.charAt(((u) it).a()))) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a1(String str, int i, String str2, int i10, int i11, boolean z) {
        e.D(str, "<this>");
        e.D(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i10, i11);
        }
        return str.regionMatches(z, i, str2, i10, i11);
    }

    public static String b1(String str, String str2, String str3) {
        e.D(str, "<this>");
        int j12 = o.j1(str, str2, 0, false);
        if (j12 < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb2.append(str, i10, j12);
                sb2.append(str3);
                i10 = j12 + length;
                if (j12 >= str.length() || (j12 = o.j1(str, str2, j12 + i, false)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    e.C(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i10, j12);
                sb2.append(str3);
                i10 = j12 + length;
                break;
            } while ((j12 = o.j1(str, str2, j12 + i, false)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            e.C(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    public static final boolean c1(String str, String str2, int i, boolean z) {
        e.D(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return a1(str, i, str2, 0, str2.length(), z);
    }

    public static final boolean d1(String str, String str2, boolean z) {
        e.D(str, "<this>");
        e.D(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return a1(str, 0, str2, 0, str2.length(), z);
    }

    public static final Integer f1(String str) {
        int i;
        int i10;
        e.D(str, "<this>");
        c3.k.T(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        int i12 = -2147483647;
        boolean z = true;
        if (e.F(charAt, 48) >= 0) {
            i = 0;
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i12 = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                i = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                i = 1;
                z = false;
            }
        }
        int i13 = -59652323;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                return null;
            }
            i11 = i10 - digit;
            i++;
        }
        return z ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }
}
