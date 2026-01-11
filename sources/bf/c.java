package bf;

import a.b;
import c3.k;
import e6.e;
import fe.o;
import java.util.ArrayList;
import java.util.Collection;
import nd.f;
import nd.m;
import xd.l;
import yd.h;

public final class c {

    public static final class a extends h implements l<Byte, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3000b = new a();

        public a() {
            super(1);
        }

        public final Object k(Object obj) {
            k.T(16);
            String num = Integer.toString(((Number) obj).byteValue() & 255, 16);
            e.C(num, "toString(this, checkRadix(radix))");
            return o.q1(num, 2);
        }
    }

    public static final String a(byte[] bArr) {
        return f.M(bArr, a.f3000b);
    }

    public static final byte[] b(String str) {
        e.D(str, "<this>");
        String t12 = o.t1(str, "0x");
        int length = t12.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i * 2;
            String substring = t12.substring(i10, i10 + 2);
            e.C(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            k.T(16);
            bArr[i] = (byte) Integer.parseInt(substring, 16);
        }
        return bArr;
    }

    public static final byte[] c(byte[] bArr) {
        Collection collection;
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!(bArr[length] == 0)) {
                    int i10 = length + 1;
                    if (!(i10 >= 0)) {
                        throw new IllegalArgumentException(a8.a.b("Requested element count ", i10, " is less than zero.").toString());
                    } else if (i10 == 0) {
                        collection = nd.o.f8966a;
                    } else if (i10 >= bArr.length) {
                        collection = f.Q(bArr);
                    } else if (i10 == 1) {
                        collection = b.n0(Byte.valueOf(bArr[0]));
                    } else {
                        ArrayList arrayList = new ArrayList(i10);
                        int i11 = 0;
                        for (byte valueOf : bArr) {
                            arrayList.add(Byte.valueOf(valueOf));
                            i11++;
                            if (i11 == i10) {
                                break;
                            }
                        }
                        collection = arrayList;
                    }
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        collection = nd.o.f8966a;
        return m.h1(collection);
    }
}
