package i2;

import aa.a;
import aa.c;
import java.util.concurrent.atomic.AtomicLong;

public final class h extends z<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f5981a;

    public h(z zVar) {
        this.f5981a = zVar;
    }

    public final Object read(a aVar) {
        return new AtomicLong(((Number) this.f5981a.read(aVar)).longValue());
    }

    public final void write(c cVar, Object obj) {
        this.f5981a.write(cVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
