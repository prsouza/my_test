package qg;

import java.util.Objects;

public class b extends a.b {
    public final a F;

    public b(a aVar) {
        Objects.requireNonNull(aVar, "'parameters' cannot be null");
        this.F = aVar;
    }
}
