package ea;

import ca.c;
import ca.e;
import java.io.IOException;
import java.util.Optional;

public final class a implements e<Optional<Boolean>> {
    /* renamed from: a */
    public final void b(c cVar, Optional<Boolean> optional) throws IOException {
        if (!optional.isPresent()) {
            cVar.a(0);
        } else if (optional.get().booleanValue()) {
            cVar.a(2);
        } else {
            cVar.a(1);
        }
    }
}
