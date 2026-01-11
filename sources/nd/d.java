package nd;

import e6.e;
import java.util.Arrays;
import java.util.List;
import jc.b;

public class d extends b {
    public static final <T> List<T> D(T[] tArr) {
        e.D(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        e.C(asList, "asList(this)");
        return asList;
    }

    public static final byte[] E(byte[] bArr, byte[] bArr2, int i, int i10, int i11) {
        e.D(bArr, "<this>");
        e.D(bArr2, "destination");
        System.arraycopy(bArr, i10, bArr2, i, i11 - i10);
        return bArr2;
    }

    public static /* synthetic */ byte[] F(byte[] bArr, byte[] bArr2, int i, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        E(bArr, bArr2, i, i10, i11);
        return bArr2;
    }

    public static Object[] G(Object[] objArr, Object[] objArr2, int i, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        e.D(objArr, "<this>");
        System.arraycopy(objArr, i10, objArr2, i, i11 - i10);
        return objArr2;
    }

    public static final byte[] H(byte[] bArr, int i, int i10) {
        e.D(bArr, "<this>");
        int length = bArr.length;
        if (i10 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i10);
            e.C(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + length + ").");
    }

    public static void I(Object[] objArr, Object obj) {
        int length = objArr.length;
        e.D(objArr, "<this>");
        Arrays.fill(objArr, 0, length, obj);
    }

    public static final byte[] J(byte[] bArr, byte[] bArr2) {
        e.D(bArr, "<this>");
        e.D(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        e.C(copyOf, "result");
        return copyOf;
    }
}
