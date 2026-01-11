package pi;

import java.io.OutputStream;
import qg.e;
import rg.b;

public final class d extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final b f10069a;

    public d(e eVar) {
        e6.e.D(eVar, "key");
        b bVar = new b();
        this.f10069a = bVar;
        bVar.b(false, eVar);
    }

    public final void write(int i) {
        this.f10069a.c(new byte[]{(byte) i});
    }
}
