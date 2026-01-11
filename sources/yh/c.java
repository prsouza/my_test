package yh;

import a.a;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import xh.h;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f13663a = new d();

    public static byte[] a(String str) {
        try {
            return f13663a.b(str, str.length());
        } catch (Exception e10) {
            StringBuilder d10 = a.d("exception decoding Hex string: ");
            d10.append(e10.getMessage());
            throw new a(d10.toString(), e10);
        }
    }

    public static byte[] b(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d dVar = f13663a;
            Objects.requireNonNull(dVar);
            for (int i10 = 0; i10 < 0 + i; i10++) {
                byte b10 = bArr[i10] & 255;
                byteArrayOutputStream.write(dVar.f13664a[b10 >>> 4]);
                byteArrayOutputStream.write(dVar.f13664a[b10 & 15]);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            StringBuilder d10 = a.d("exception encoding Hex string: ");
            d10.append(e10.getMessage());
            throw new b(d10.toString(), e10);
        }
    }

    public static String c(byte[] bArr) {
        return h.a(b(bArr, bArr.length));
    }
}
