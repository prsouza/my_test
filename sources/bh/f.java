package bh;

import androidx.fragment.app.o;
import java.math.BigInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final BigInteger f3032a;

    /* renamed from: b  reason: collision with root package name */
    public final BigInteger f3033b;

    /* renamed from: c  reason: collision with root package name */
    public final BigInteger f3034c;

    /* renamed from: d  reason: collision with root package name */
    public final BigInteger f3035d;

    /* renamed from: e  reason: collision with root package name */
    public final BigInteger f3036e;

    /* renamed from: f  reason: collision with root package name */
    public final BigInteger f3037f;
    public final int g;

    public f(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        a(bigIntegerArr, "v1");
        a(bigIntegerArr2, "v2");
        this.f3032a = bigIntegerArr[0];
        this.f3033b = bigIntegerArr[1];
        this.f3034c = bigIntegerArr2[0];
        this.f3035d = bigIntegerArr2[1];
        this.f3036e = bigInteger;
        this.f3037f = bigInteger2;
        this.g = i;
    }

    public static void a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(o.c("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
