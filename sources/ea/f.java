package ea;

import ca.c;
import ca.e;
import java.io.IOException;

public final class f implements e<Long> {
    /* renamed from: a */
    public final void b(c cVar, Long l10) throws IOException {
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Negative values are not supported: " + l10);
        } else if (l10.longValue() <= 4294967295L) {
            cVar.a((int) (l10.longValue() & 255));
            cVar.a((int) ((l10.longValue() >> 8) & 255));
            cVar.a((int) ((l10.longValue() >> 16) & 255));
            cVar.a((int) ((l10.longValue() >> 24) & 255));
        } else {
            throw new IllegalArgumentException("Value is too high: " + l10);
        }
    }
}
