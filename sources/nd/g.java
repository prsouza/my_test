package nd;

import a.b;
import e6.e;
import java.util.Collection;

public class g extends b {
    public static final int S0(Iterable iterable) {
        e.D(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
