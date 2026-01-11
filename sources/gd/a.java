package gd;

import com.github.mikephil.charting.BuildConfig;
import d9.b;
import e6.e;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Objects;
import jc.c;
import md.f;
import nd.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5358a;

    /* renamed from: b  reason: collision with root package name */
    public static final dc.a f5359b = new dc.a();

    /* renamed from: c  reason: collision with root package name */
    public static final a f5360c = null;

    static {
        byte[] bytes = "SS58PRE".getBytes(fe.a.f5086b);
        e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        f5358a = bytes;
    }

    public static final byte[] a(String str) throws IllegalArgumentException {
        byte[] bArr;
        f fVar;
        byte[] digest;
        e.D(str, "ss58String");
        dc.a aVar = f5359b;
        Objects.requireNonNull(aVar);
        if (str.length() == 0) {
            bArr = new byte[0];
        } else {
            int length = str.length();
            byte[] bArr2 = new byte[length];
            int length2 = str.length();
            int i = 0;
            while (i < length2) {
                char charAt = str.charAt(i);
                int i10 = (charAt >= 0 && 127 >= charAt) ? aVar.f4428b[charAt] : -1;
                if (i10 >= 0) {
                    bArr2[i] = (byte) i10;
                    i++;
                } else {
                    throw new b("Illegal character " + charAt + " at " + i);
                }
            }
            int i11 = 0;
            while (i11 < length && bArr2[i11] == 0) {
                i11++;
            }
            int length3 = str.length();
            byte[] bArr3 = new byte[length3];
            int i12 = length3;
            int i13 = i11;
            while (i13 < length) {
                int i14 = 0;
                for (int i15 = i13; i15 < length; i15++) {
                    int i16 = (i14 * 58) + (bArr2[i15] & 255);
                    bArr2[i15] = (byte) (i16 / 256);
                    i14 = i16 % 256;
                }
                byte b10 = (byte) i14;
                if (bArr2[i13] == 0) {
                    i13++;
                }
                i12--;
                bArr3[i12] = b10;
            }
            while (i12 < length3 && bArr3[i12] == 0) {
                i12++;
            }
            bArr = aVar.a(bArr3, i12 - i11, length3);
        }
        if (bArr.length >= 2) {
            byte b11 = bArr[0];
            if (b11 >= 0 && 63 >= b11) {
                fVar = new f(1, Short.valueOf((short) bArr[0]));
            } else {
                byte b12 = bArr[0];
                if (64 > b12 || Byte.MAX_VALUE < b12) {
                    throw new IllegalArgumentException("Incorrect address byte");
                }
                fVar = new f(2, Short.valueOf((short) ((((byte) (((byte) ((bArr[0] & 255) << 2)) | ((byte) ((bArr[1] & 255) >> 6)))) & 255) | ((((byte) (bArr[1] & ((byte) 63))) & 255) << 8))));
            }
            int intValue = ((Number) fVar.f8541a).intValue();
            c cVar = c.f7149h;
            int i17 = intValue + 32;
            byte[] J = d.J(f5358a, a.b.O(bArr, 0, i17));
            synchronized (c.f7143a) {
                digest = c.f7146d.digest(J);
            }
            e.C(digest, "hash");
            if (Arrays.equals(a.b.O(digest, 0, 2), a.b.O(bArr, i17, 2))) {
                return a.b.O(bArr, intValue, 32);
            }
            throw new IllegalArgumentException("Invalid checksum");
        }
        throw new IllegalArgumentException("Invalid address");
    }

    public static final String b(byte[] bArr, short s10) {
        byte[] bArr2;
        byte[] digest;
        e.D(bArr, "publicKey");
        if (bArr.length > 32) {
            bArr = c.f7149h.a(bArr);
        }
        short s11 = s10 & 16383;
        boolean z = true;
        if (s11 >= 0 && 63 >= s11) {
            bArr2 = new byte[]{(byte) s11};
        } else if (64 > s11 || 16383 < s11) {
            throw new IllegalArgumentException("Reserved for future address format extensions");
        } else {
            bArr2 = new byte[]{(byte) (((byte) ((s11 & 252) >> 2)) | 64), (byte) (((s11 & 3) << 6) | (s11 >> 8))};
        }
        c cVar = c.f7149h;
        byte[] J = d.J(f5358a, bArr2);
        e.C(bArr, "normalizedKey");
        byte[] J2 = d.J(J, bArr);
        synchronized (c.f7143a) {
            digest = c.f7146d.digest(J2);
        }
        e.C(digest, "hash");
        byte[] J3 = d.J(d.J(bArr2, bArr), d.H(digest, 0, 2));
        dc.a aVar = f5359b;
        Objects.requireNonNull(aVar);
        if (J3.length != 0) {
            z = false;
        }
        if (z) {
            return BuildConfig.FLAVOR;
        }
        byte[] a10 = aVar.a(J3, 0, J3.length);
        int i = 0;
        while (i < a10.length && a10[i] == 0) {
            i++;
        }
        int length = a10.length * 2;
        byte[] bArr3 = new byte[length];
        int i10 = i;
        int i11 = length;
        while (i10 < a10.length) {
            int length2 = a10.length;
            int i12 = 0;
            for (int i13 = i10; i13 < length2; i13++) {
                int i14 = (i12 * 256) + (a10[i13] & 255);
                a10[i13] = (byte) (i14 / 58);
                i12 = i14 % 58;
            }
            byte b10 = (byte) i12;
            if (a10[i10] == 0) {
                i10++;
            }
            i11--;
            bArr3[i11] = (byte) aVar.f4427a[b10];
        }
        while (i11 < length && bArr3[i11] == aVar.f4427a[0]) {
            i11++;
        }
        while (true) {
            i--;
            if (i >= 0) {
                i11--;
                bArr3[i11] = (byte) aVar.f4427a[0];
            } else {
                try {
                    return new String(aVar.a(bArr3, i11, length), fe.a.f5087c);
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
    }
}
