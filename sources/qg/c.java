package qg;

import java.math.BigInteger;
import java.util.Objects;
import xg.b;

public final class c extends b {
    public final BigInteger G;

    public c(BigInteger bigInteger, a aVar) {
        super(aVar);
        Objects.requireNonNull(bigInteger, "Scalar cannot be null");
        if (bigInteger.compareTo(b.f13229b) < 0 || bigInteger.compareTo(aVar.f10448h) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        this.G = bigInteger;
    }
}
