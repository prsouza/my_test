package pf;

import java.io.IOException;
import java.util.List;
import lf.a;
import pf.f;
import qf.h;

public final class h extends a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f9981e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.e f9982f;
    public final /* synthetic */ List g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, q qVar, f.e eVar, List list) {
        super(str, true);
        this.f9981e = qVar;
        this.f9982f = eVar;
        this.g = list;
    }

    public final long a() {
        try {
            f.this.f9952b.b(this.f9981e);
            return -1;
        } catch (IOException e10) {
            h.a aVar = qf.h.f10446c;
            qf.h hVar = qf.h.f10444a;
            StringBuilder d10 = a.a.d("Http2Connection.Listener failure for ");
            d10.append(f.this.f9954s);
            hVar.i(d10.toString(), 4, e10);
            try {
                this.f9981e.c(b.PROTOCOL_ERROR, e10);
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        }
    }
}
