package ui;

import c3.k;
import e6.e;
import fe.o;
import nd.f;
import xd.l;
import yd.h;

public final class c {

    public static final class a extends h implements l<Byte, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f12019b = new a();

        public a() {
            super(1);
        }

        public final Object k(Object obj) {
            k.T(16);
            String num = Integer.toString(((Number) obj).byteValue() & 255, 16);
            e.C(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            return o.q1(num, 2);
        }
    }

    public static final String a(byte[] bArr) {
        e.D(bArr, "$this$toHex");
        return f.M(bArr, a.f12019b);
    }

    public static final boolean b(long j10, int i) {
        return (j10 & (1 << i)) > 0;
    }

    public static final byte[] c(String str) {
        e.D(str, "$this$hexToBa");
        String t12 = o.t1(str, "0x");
        int length = t12.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i * 2;
            String substring = t12.substring(i10, i10 + 2);
            e.C(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            k.T(16);
            bArr[i] = (byte) Integer.parseInt(substring, 16);
        }
        return bArr;
    }
}
