package nd;

import e6.e;
import java.util.Collection;

public class i extends h {
    public static final boolean U0(Collection collection, Iterable iterable) {
        e.D(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
