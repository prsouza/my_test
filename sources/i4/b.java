package i4;

import a8.a;
import com.google.android.gms.common.api.Api;
import h4.g;
import h4.h;
import h4.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import k4.c;
import net.jpountz.lz4.LZ4FrameOutputStream;

public abstract class b extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6181c = new byte[0];

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f6182s = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public k f6183b;

    static {
        BigInteger valueOf = BigInteger.valueOf(-2147483648L);
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        new BigDecimal(valueOf3);
        new BigDecimal(valueOf4);
        new BigDecimal(valueOf);
        new BigDecimal(valueOf2);
    }

    public b(int i) {
        super(i);
    }

    public final String c(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", new Object[]{Integer.valueOf(length)});
    }

    public final void e(String str) throws g {
        throw new g((h) this, str);
    }

    public final void f(String str, k kVar) throws g {
        throw new c(this, a.c("Unexpected end-of-input", str));
    }

    public final void s() {
        int i = n4.h.f8923a;
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public abstract String t() throws IOException;

    public final void w() throws IOException {
        throw new j4.a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[]{c(t()), Integer.valueOf(LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK), Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER)}));
    }

    public final void y() throws IOException {
        throw new j4.a(this, String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[]{c(t()), Long.MIN_VALUE, Long.MAX_VALUE}));
    }
}
