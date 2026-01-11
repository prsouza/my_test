package di;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import fe.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.UUID;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final UUID f4511a;

    static {
        UUID fromString = UUID.fromString("00000000-0000-1000-8000-00805F9B34FB");
        e.C(fromString, "fromString(\"00000000-0000-1000-8000-00805F9B34FB\")");
        f4511a = fromString;
    }

    public static final String a(String str) {
        e.D(str, "<this>");
        String b12 = k.b1(str, ":", BuildConfig.FLAVOR);
        Locale locale = Locale.getDefault();
        e.C(locale, "getDefault()");
        String lowerCase = b12.toLowerCase(locale);
        e.C(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static final UUID b(byte[] bArr) {
        long j10;
        e.D(bArr, "<this>");
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException(e.a0("uuidBytes length invalid - ", Integer.valueOf(length)));
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            e.C(order, "wrap(this).order(ByteOrder.LITTLE_ENDIAN)");
            return new UUID(order.getLong(8), order.getLong(0));
        } else {
            if (length == 2) {
                j10 = ((long) ((byte) (bArr[0] & -1))) + ((long) (((byte) (bArr[1] & -1)) << 8));
            } else {
                j10 = ((long) (((byte) (bArr[3] & -1)) << 24)) + ((long) ((byte) (bArr[0] & -1))) + ((long) (((byte) (bArr[1] & -1)) << 8)) + ((long) (((byte) (bArr[2] & -1)) << 16));
            }
            UUID uuid = f4511a;
            return new UUID(uuid.getMostSignificantBits() + (j10 << 32), uuid.getLeastSignificantBits());
        }
    }
}
