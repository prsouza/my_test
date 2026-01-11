package ki;

import java.io.IOException;
import java.lang.reflect.Array;

public final class u extends v<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f7643a;

    public u(v vVar) {
        this.f7643a = vVar;
    }

    public final void a(x xVar, Object obj) throws IOException {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                this.f7643a.a(xVar, Array.get(obj, i));
            }
        }
    }
}
