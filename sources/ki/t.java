package ki;

import java.io.IOException;

public final class t extends v<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f7642a;

    public t(v vVar) {
        this.f7642a = vVar;
    }

    public final void a(x xVar, Object obj) throws IOException {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a10 : iterable) {
                this.f7642a.a(xVar, a10);
            }
        }
    }
}
