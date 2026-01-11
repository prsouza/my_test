package nd;

import a.b;
import ce.c;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import xd.l;

public class f extends d {
    public static final boolean K(byte[] bArr, byte b10) {
        e.D(bArr, "<this>");
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (b10 == bArr[i]) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> int L(T[] tArr, T t10) {
        e.D(tArr, "<this>");
        int i = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (e.r(t10, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String M(byte[] bArr, l lVar) {
        e.D(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(BuildConfig.FLAVOR);
        int i = 0;
        for (byte b10 : bArr) {
            i++;
            if (i > 1) {
                sb2.append(BuildConfig.FLAVOR);
            }
            sb2.append((CharSequence) lVar.k(Byte.valueOf(b10)));
        }
        sb2.append(BuildConfig.FLAVOR);
        String sb3 = sb2.toString();
        e.C(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final byte[] N(byte[] bArr) {
        int i = 0;
        if (bArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                bArr2[length - i] = bArr[i];
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return bArr2;
    }

    public static final char O(char[] cArr) {
        e.D(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final byte[] P(byte[] bArr, c cVar) {
        e.D(bArr, "<this>");
        e.D(cVar, "indices");
        if (cVar.isEmpty()) {
            return new byte[0];
        }
        return d.H(bArr, Integer.valueOf(cVar.f3430a).intValue(), Integer.valueOf(cVar.f3431b).intValue() + 1);
    }

    public static final List<Byte> Q(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return o.f8966a;
        }
        if (length == 1) {
            return b.n0(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final List<Integer> R(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return o.f8966a;
        }
        if (length == 1) {
            return b.n0(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    public static final <T> List<T> S(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return o.f8966a;
        }
        if (length != 1) {
            return new ArrayList(new c(tArr, false));
        }
        return b.n0(tArr[0]);
    }
}
