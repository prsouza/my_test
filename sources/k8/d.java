package k8;

import java.io.IOException;
import java.io.Writer;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7474a;

    public d(e eVar) {
        this.f7474a = eVar;
    }

    public final void a(Object obj, Writer writer) throws IOException {
        e eVar = this.f7474a;
        f fVar = new f(writer, eVar.f7476a, eVar.f7477b, eVar.f7478c, eVar.f7479d);
        fVar.g(obj);
        fVar.i();
        fVar.f7482b.flush();
    }
}
