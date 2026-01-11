package uf;

import a.a;
import ah.v;
import e6.e;
import java.io.OutputStream;

public final class s implements z {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f11978a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f11979b;

    public s(OutputStream outputStream, c0 c0Var) {
        this.f11978a = outputStream;
        this.f11979b = c0Var;
    }

    public final void H(e eVar, long j10) {
        e.D(eVar, "source");
        v.B(eVar.f11952b, 0, j10);
        while (j10 > 0) {
            this.f11979b.f();
            w wVar = eVar.f11951a;
            e.B(wVar);
            int min = (int) Math.min(j10, (long) (wVar.f11995c - wVar.f11994b));
            this.f11978a.write(wVar.f11993a, wVar.f11994b, min);
            int i = wVar.f11994b + min;
            wVar.f11994b = i;
            long j11 = (long) min;
            j10 -= j11;
            eVar.f11952b -= j11;
            if (i == wVar.f11995c) {
                eVar.f11951a = wVar.a();
                x.b(wVar);
            }
        }
    }

    public final void close() {
        this.f11978a.close();
    }

    public final c0 d() {
        return this.f11979b;
    }

    public final void flush() {
        this.f11978a.flush();
    }

    public final String toString() {
        StringBuilder d10 = a.d("sink(");
        d10.append(this.f11978a);
        d10.append(')');
        return d10.toString();
    }
}
