package ae;

import e6.e;
import java.io.Serializable;
import sd.b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f342a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final c f343b = b.f11100a.b();

    public static final class a extends c implements Serializable {
        public final int a(int i) {
            return c.f343b.a(i);
        }

        public final int b() {
            return c.f343b.b();
        }

        public final int c(int i, int i10) {
            return c.f343b.c(i, i10);
        }
    }

    public abstract int a(int i);

    public abstract int b();

    public int c(int i, int i10) {
        int i11;
        int b10;
        int i12;
        int b11;
        boolean z;
        if (i10 > i) {
            int i13 = i10 - i;
            if (i13 > 0 || i13 == Integer.MIN_VALUE) {
                if (((-i13) & i13) == i13) {
                    i11 = a(31 - Integer.numberOfLeadingZeros(i13));
                } else {
                    do {
                        b10 = b() >>> 1;
                        i12 = b10 % i13;
                    } while ((i13 - 1) + (b10 - i12) < 0);
                    i11 = i12;
                }
                return i + i11;
            }
            do {
                b11 = b();
                if (i > b11 || b11 >= i10) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
            } while (!z);
            return b11;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i10);
        e.D(valueOf, "from");
        e.D(valueOf2, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + valueOf + ", " + valueOf2 + ").").toString());
    }
}
