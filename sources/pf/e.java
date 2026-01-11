package pf;

import android.support.v4.media.a;
import com.github.mikephil.charting.BuildConfig;
import fe.k;
import jf.c;
import uf.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f9946a = i.f11956t.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f9947b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f9948c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f9949d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f9950e = new e();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            e6.e.C(binaryString, "Integer.toBinaryString(it)");
            String replace = c.i("%8s", binaryString).replace(' ', '0');
            e6.e.C(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i] = replace;
        }
        f9949d = strArr;
        String[] strArr2 = f9948c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i10 = 0; i10 < 1; i10++) {
            int i11 = iArr[i10];
            String[] strArr3 = f9948c;
            strArr3[i11 | 8] = e6.e.a0(strArr3[i11], "|PADDED");
        }
        String[] strArr4 = f9948c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            for (int i14 = 0; i14 < 1; i14++) {
                int i15 = iArr[i14];
                String[] strArr5 = f9948c;
                int i16 = i15 | i13;
                strArr5[i16] = strArr5[i15] + "|" + strArr5[i13];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i15]);
                sb2.append("|");
                strArr5[i16 | 8] = a.e(sb2, strArr5[i13], "|PADDED");
            }
        }
        int length = f9948c.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr6 = f9948c;
            if (strArr6[i17] == null) {
                strArr6[i17] = f9949d[i17];
            }
        }
    }

    public final String a(int i) {
        String[] strArr = f9947b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return c.i("0x%02x", Integer.valueOf(i));
    }

    public final String b(boolean z, int i, int i10, int i11, int i12) {
        String str;
        String str2;
        String a10 = a(i11);
        if (i12 == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            if (!(i11 == 2 || i11 == 3)) {
                if (i11 == 4 || i11 == 6) {
                    str = i12 == 1 ? "ACK" : f9949d[i12];
                } else if (!(i11 == 7 || i11 == 8)) {
                    String[] strArr = f9948c;
                    if (i12 < strArr.length) {
                        str2 = strArr[i12];
                        e6.e.B(str2);
                    } else {
                        str2 = f9949d[i12];
                    }
                    str = (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : k.b1(str2, "PRIORITY", "COMPRESSED") : k.b1(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = f9949d[i12];
        }
        return c.i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i10), a10, str);
    }
}
