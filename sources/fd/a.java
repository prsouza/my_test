package fd;

import a.b;
import ea.e;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import nd.f;
import nd.m;
import nd.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5084a = new e();

    public static final byte[] a(BigInteger bigInteger) {
        Collection collection;
        e6.e.D(bigInteger, "$this$toUnsignedBytes");
        byte[] byteArray = bigInteger.toByteArray();
        e6.e.C(byteArray, "bytes");
        boolean z = false;
        if (byteArray.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (byteArray[0] != ((byte) 0) || byteArray.length <= 1) {
            return byteArray;
        } else {
            int length = byteArray.length - 1;
            if (length < 0) {
                length = 0;
            }
            if (length >= 0) {
                z = true;
            }
            if (z) {
                if (length == 0) {
                    collection = o.f8966a;
                } else {
                    int length2 = byteArray.length;
                    if (length >= length2) {
                        collection = f.Q(byteArray);
                    } else if (length == 1) {
                        collection = b.n0(Byte.valueOf(byteArray[length2 - 1]));
                    } else {
                        ArrayList arrayList = new ArrayList(length);
                        for (int i = length2 - length; i < length2; i++) {
                            arrayList.add(Byte.valueOf(byteArray[i]));
                        }
                        collection = arrayList;
                    }
                }
                return m.h1(collection);
            }
            throw new IllegalArgumentException(a8.a.b("Requested element count ", length, " is less than zero.").toString());
        }
    }
}
