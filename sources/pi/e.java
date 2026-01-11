package pi;

import java.io.OutputStream;
import qg.d;
import rg.b;

public final class e extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final b f10070a;

    public e(d dVar) {
        b bVar = new b();
        this.f10070a = bVar;
        bVar.b(true, dVar);
    }

    public final void write(int i) {
        this.f10070a.c(new byte[]{(byte) i});
    }
}
