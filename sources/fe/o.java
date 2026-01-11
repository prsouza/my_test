package fe;

import a.b;
import b9.m;
import c3.k;
import ce.a;
import ce.c;
import e6.e;
import ee.d;
import ee.g;
import ee.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.f;

public class o extends k {
    public static final String A1(CharSequence charSequence, c cVar) {
        e.D(charSequence, "<this>");
        e.D(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.f3430a).intValue(), Integer.valueOf(cVar.f3431b).intValue() + 1).toString();
    }

    public static String B1(String str, String str2) {
        e.D(str2, "delimiter");
        int m12 = m1(str, str2, 0, false, 6);
        if (m12 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + m12, str.length());
        e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String C1(String str) {
        e.D(str, "<this>");
        e.D(str, "missingDelimiterValue");
        int o12 = o1(str, '.', 0, 6);
        if (o12 == -1) {
            return str;
        }
        String substring = str.substring(o12 + 1, str.length());
        e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final CharSequence D1(CharSequence charSequence) {
        e.D(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean t02 = k.t0(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!t02) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!t02) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean g1(CharSequence charSequence, CharSequence charSequence2) {
        e.D(charSequence, "<this>");
        e.D(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (k1(charSequence, charSequence2, 0, charSequence.length(), false, false) >= 0) {
                return true;
            }
        } else if (m1(charSequence, (String) charSequence2, 0, false, 2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean h1(CharSequence charSequence, CharSequence charSequence2) {
        e.D(charSequence, "<this>");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).endsWith((String) charSequence2);
        }
        return s1(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static final int i1(CharSequence charSequence) {
        e.D(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int j1(CharSequence charSequence, String str, int i, boolean z) {
        e.D(charSequence, "<this>");
        e.D(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return k1(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int k1(CharSequence charSequence, CharSequence charSequence2, int i, int i10, boolean z, boolean z10) {
        a aVar;
        if (!z10) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            aVar = new c(i, i10);
        } else {
            int i12 = i1(charSequence);
            if (i > i12) {
                i = i12;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            aVar = ad.c.D(i, i10);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int i11 = aVar.f3430a;
            int i13 = aVar.f3431b;
            int i14 = aVar.f3432c;
            if ((i14 <= 0 || i11 > i13) && (i14 >= 0 || i13 > i11)) {
                return -1;
            }
            while (true) {
                if (s1(charSequence2, 0, charSequence, i11, charSequence2.length(), z)) {
                    return i11;
                }
                if (i11 == i13) {
                    return -1;
                }
                i11 += i14;
            }
        } else {
            int i15 = aVar.f3430a;
            int i16 = aVar.f3431b;
            int i17 = aVar.f3432c;
            if ((i17 <= 0 || i15 > i16) && (i17 >= 0 || i16 > i15)) {
                return -1;
            }
            while (true) {
                if (k.a1((String) charSequence2, 0, (String) charSequence, i15, charSequence2.length(), z)) {
                    return i15;
                }
                if (i15 == i16) {
                    return -1;
                }
                i15 += i17;
            }
        }
    }

    public static int l1(CharSequence charSequence, char c10, int i, boolean z, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z = false;
        }
        e.D(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i);
        }
        return n1(charSequence, new char[]{c10}, i, z);
    }

    public static /* synthetic */ int m1(CharSequence charSequence, String str, int i, boolean z, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z = false;
        }
        return j1(charSequence, str, i, z);
    }

    public static final int n1(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z10;
        e.D(charSequence, "<this>");
        e.D(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            if (i < 0) {
                i = 0;
            }
            int i12 = i1(charSequence);
            if (i > i12) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(i);
                int length = cArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    } else if (k.h0(cArr[i10], charAt, z)) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (z10) {
                    return i;
                }
                if (i == i12) {
                    return -1;
                }
                i++;
            }
        } else {
            return ((String) charSequence).indexOf(f.O(cArr), i);
        }
    }

    public static int o1(CharSequence charSequence, char c10, int i, int i10) {
        boolean z;
        if ((i10 & 2) != 0) {
            i = i1(charSequence);
        }
        e.D(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(f.O(cArr), i);
        }
        int i12 = i1(charSequence);
        if (i > i12) {
            i = i12;
        }
        while (-1 < i) {
            char charAt = charSequence.charAt(i);
            int i11 = 0;
            while (true) {
                if (i11 >= 1) {
                    z = false;
                    break;
                } else if (k.h0(cArr[i11], charAt, false)) {
                    z = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final List<String> p1(CharSequence charSequence) {
        e.D(charSequence, "<this>");
        return g.j1(new l(r1(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new n(charSequence)));
    }

    public static final String q1(String str, int i) {
        CharSequence charSequence;
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i);
                int length = i - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                sb2.append(str);
                charSequence = sb2;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(a8.a.b("Desired length ", i, " is less than zero."));
    }

    public static d r1(CharSequence charSequence, String[] strArr, boolean z, int i) {
        v1(i);
        return new b(charSequence, 0, i, new m(nd.d.D(strArr), z));
    }

    public static final boolean s1(CharSequence charSequence, int i, CharSequence charSequence2, int i10, int i11, boolean z) {
        e.D(charSequence, "<this>");
        e.D(charSequence2, "other");
        if (i10 < 0 || i < 0 || i > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!k.h0(charSequence.charAt(i + i12), charSequence2.charAt(i10 + i12), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String t1(String str, CharSequence charSequence) {
        e.D(str, "<this>");
        if (!z1(str, charSequence)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        e.C(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String u1(String str, CharSequence charSequence, CharSequence charSequence2) {
        e.D(str, "<this>");
        e.D(charSequence, "prefix");
        if (str.length() < charSequence2.length() + charSequence.length() || !z1(str, charSequence) || !h1(str, charSequence2)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void v1(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(m.b("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List<String> w1(CharSequence charSequence, String str, boolean z, int i) {
        v1(i);
        int i10 = 0;
        int j12 = j1(charSequence, str, 0, z);
        if (j12 == -1 || i == 1) {
            return b.n0(charSequence.toString());
        }
        boolean z10 = i > 0;
        int i11 = 10;
        if (z10 && i <= 10) {
            i11 = i;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(i10, j12).toString());
            i10 = str.length() + j12;
            if ((z10 && arrayList.size() == i - 1) || (j12 = j1(charSequence, str, i10, z)) == -1) {
                arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i10, j12).toString());
            i10 = str.length() + j12;
            break;
        } while ((j12 = j1(charSequence, str, i10, z)) == -1);
        arrayList.add(charSequence.subSequence(i10, charSequence.length()).toString());
        return arrayList;
    }

    public static List x1(CharSequence charSequence, char[] cArr) {
        e.D(charSequence, "<this>");
        if (cArr.length == 1) {
            return w1(charSequence, String.valueOf(cArr[0]), false, 0);
        }
        v1(0);
        ee.k kVar = new ee.k(new b(charSequence, 0, 0, new l(cArr, false)));
        ArrayList arrayList = new ArrayList(nd.g.S0(kVar));
        Iterator<Object> it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(A1(charSequence, (c) it.next()));
        }
        return arrayList;
    }

    public static List y1(CharSequence charSequence, String[] strArr) {
        e.D(charSequence, "<this>");
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return w1(charSequence, str, false, 0);
            }
        }
        ee.k kVar = new ee.k(r1(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(nd.g.S0(kVar));
        Iterator<Object> it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(A1(charSequence, (c) it.next()));
        }
        return arrayList;
    }

    public static boolean z1(CharSequence charSequence, CharSequence charSequence2) {
        e.D(charSequence, "<this>");
        e.D(charSequence2, "prefix");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return k.d1((String) charSequence, (String) charSequence2, false);
        }
        return s1(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }
}
