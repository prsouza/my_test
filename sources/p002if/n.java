package p002if;

import e6.e;
import java.io.IOException;

/* renamed from: if.n  reason: invalid package */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6545a = new a();

    /* renamed from: if.n$a */
    public static final class a extends n {
    }

    /* renamed from: if.n$b */
    public interface b {
        n a(d dVar);
    }

    public final void a(d dVar, h hVar) {
        e.D(dVar, "call");
    }

    public final void b(d dVar, IOException iOException) {
        e.D(dVar, "call");
        e.D(iOException, "ioe");
    }

    public final void c(d dVar, IOException iOException) {
        e.D(dVar, "call");
        e.D(iOException, "ioe");
    }
}
