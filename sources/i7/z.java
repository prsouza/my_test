package i7;

import i7.a;
import i7.x;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f6396a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6397b;

    public interface a {
        int getNumber();
    }

    public interface b<T extends a> {
    }

    public interface c {
        boolean a(int i);
    }

    public interface d<E> extends List<E>, RandomAccess {
        d<E> B(int i);

        void f();

        boolean p0();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6397b = bArr;
        ByteBuffer.wrap(bArr);
        j.f(bArr, 0, bArr.length, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static Object c(Object obj, Object obj2) {
        q0 q0Var = (q0) obj2;
        a.C0105a aVar = (a.C0105a) ((q0) obj).d();
        Objects.requireNonNull(aVar);
        x.a aVar2 = (x.a) aVar;
        if (aVar2.f6388a.getClass().isInstance(q0Var)) {
            aVar2.n((x) ((a) q0Var));
            return aVar2.l();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
