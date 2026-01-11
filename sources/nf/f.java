package nf;

import a.a;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import mf.c;
import mf.e;
import p002if.a0;
import p002if.s;
import p002if.x;

public final class f implements s.a {

    /* renamed from: a  reason: collision with root package name */
    public int f9011a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9012b;

    /* renamed from: c  reason: collision with root package name */
    public final List<s> f9013c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9014d;

    /* renamed from: e  reason: collision with root package name */
    public final c f9015e;

    /* renamed from: f  reason: collision with root package name */
    public final x f9016f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9017h;
    public final int i;

    public f(e eVar, List<? extends s> list, int i10, c cVar, x xVar, int i11, int i12, int i13) {
        e6.e.D(eVar, "call");
        e6.e.D(list, "interceptors");
        e6.e.D(xVar, "request");
        this.f9012b = eVar;
        this.f9013c = list;
        this.f9014d = i10;
        this.f9015e = cVar;
        this.f9016f = xVar;
        this.g = i11;
        this.f9017h = i12;
        this.i = i13;
    }

    public static f a(f fVar, int i10, c cVar, x xVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = fVar.f9014d;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            cVar = fVar.f9015e;
        }
        c cVar2 = cVar;
        if ((i11 & 4) != 0) {
            xVar = fVar.f9016f;
        }
        x xVar2 = xVar;
        int i13 = (i11 & 8) != 0 ? fVar.g : 0;
        int i14 = (i11 & 16) != 0 ? fVar.f9017h : 0;
        int i15 = (i11 & 32) != 0 ? fVar.i : 0;
        Objects.requireNonNull(fVar);
        e6.e.D(xVar2, "request");
        return new f(fVar.f9012b, fVar.f9013c, i12, cVar2, xVar2, i13, i14, i15);
    }

    public final a0 b(x xVar) throws IOException {
        e6.e.D(xVar, "request");
        boolean z = true;
        if (this.f9014d < this.f9013c.size()) {
            this.f9011a++;
            c cVar = this.f9015e;
            if (cVar != null) {
                if (cVar.f8604e.b(xVar.f6627b)) {
                    if (!(this.f9011a == 1)) {
                        StringBuilder d10 = a.d("network interceptor ");
                        d10.append(this.f9013c.get(this.f9014d - 1));
                        d10.append(" must call proceed() exactly once");
                        throw new IllegalStateException(d10.toString().toString());
                    }
                } else {
                    StringBuilder d11 = a.d("network interceptor ");
                    d11.append(this.f9013c.get(this.f9014d - 1));
                    d11.append(" must retain the same host and port");
                    throw new IllegalStateException(d11.toString().toString());
                }
            }
            f a10 = a(this, this.f9014d + 1, (c) null, xVar, 58);
            s sVar = this.f9013c.get(this.f9014d);
            a0 a11 = sVar.a(a10);
            if (a11 != null) {
                if (this.f9015e != null) {
                    if (!(this.f9014d + 1 >= this.f9013c.size() || a10.f9011a == 1)) {
                        throw new IllegalStateException(("network interceptor " + sVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a11.f6458v == null) {
                    z = false;
                }
                if (z) {
                    return a11;
                }
                throw new IllegalStateException(("interceptor " + sVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + sVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
