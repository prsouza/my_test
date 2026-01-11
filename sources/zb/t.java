package zb;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f14377a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14378b;

    public interface a {
        int a();
    }

    public interface b extends c<Integer> {
    }

    public interface c<E> extends List<E>, RandomAccess {
        c<E> c(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14378b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 + 0 > Integer.MAX_VALUE) {
            try {
                throw u.b();
            } catch (u e10) {
                throw new IllegalArgumentException(e10);
            }
        }
    }
}
