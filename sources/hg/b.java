package hg;

import ag.a1;
import ag.d;
import ag.d1;
import ag.e;
import ag.h0;
import ag.j0;
import ag.k;
import ag.m;
import ag.n0;
import ag.n1;
import ag.o;
import ag.s;
import ag.t;
import ag.w;
import ag.w0;
import ag.y;
import java.io.IOException;
import java.util.Enumeration;
import jg.a;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public k f5969a;

    /* renamed from: b  reason: collision with root package name */
    public a f5970b;

    /* renamed from: c  reason: collision with root package name */
    public o f5971c;

    /* renamed from: s  reason: collision with root package name */
    public w f5972s;

    /* renamed from: t  reason: collision with root package name */
    public n0 f5973t;

    public b(t tVar) {
        w wVar;
        n0 n0Var;
        Enumeration t10 = tVar.t();
        k s10 = k.s(t10.nextElement());
        this.f5969a = s10;
        int v10 = s10.v();
        if (v10 < 0 || v10 > 1) {
            throw new IllegalArgumentException("invalid version for private key info");
        }
        this.f5970b = a.j(t10.nextElement());
        this.f5971c = o.s(t10.nextElement());
        int i = -1;
        while (t10.hasMoreElements()) {
            y yVar = (y) t10.nextElement();
            int i10 = yVar.f464a;
            if (i10 > i) {
                if (i10 == 0) {
                    s s11 = yVar.s();
                    if (yVar.f465b) {
                        wVar = yVar instanceof j0 ? new h0((d) s11) : new n1((d) s11);
                    } else if (s11 instanceof w) {
                        wVar = (w) s11;
                        if (!(yVar instanceof j0)) {
                            wVar = (w) wVar.q();
                        }
                    } else if (s11 instanceof t) {
                        d[] u10 = ((t) s11).u();
                        wVar = yVar instanceof j0 ? new h0(u10) : new n1(false, u10);
                    } else {
                        StringBuilder d10 = a.a.d("unknown object in getInstance: ");
                        d10.append(yVar.getClass().getName());
                        throw new IllegalArgumentException(d10.toString());
                    }
                    this.f5972s = wVar;
                } else if (i10 != 1) {
                    throw new IllegalArgumentException("unknown optional field in private key info");
                } else if (v10 >= 1) {
                    s s12 = yVar.s();
                    if (s12 instanceof n0) {
                        n0Var = n0.t(s12);
                    } else {
                        byte[] bArr = o.s(s12).f430a;
                        if (bArr.length >= 1) {
                            byte b10 = bArr[0];
                            int length = bArr.length - 1;
                            byte[] bArr2 = new byte[length];
                            if (length != 0) {
                                System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
                            }
                            n0Var = new n0(bArr2, b10);
                        } else {
                            throw new IllegalArgumentException("truncated BIT STRING detected");
                        }
                    }
                    this.f5973t = n0Var;
                } else {
                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                }
                i = i10;
            } else {
                throw new IllegalArgumentException("invalid optional field in private key info");
            }
        }
    }

    public b(a aVar, d dVar, w wVar, byte[] bArr) throws IOException {
        this.f5969a = new k(bArr != null ? xh.b.f13291b : xh.b.f13290a);
        this.f5970b = aVar;
        this.f5971c = new w0(dVar);
        this.f5972s = wVar;
        this.f5973t = bArr == null ? null : new n0(bArr);
    }

    public static b j(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e(5);
        eVar.a(this.f5969a);
        eVar.a(this.f5970b);
        eVar.a(this.f5971c);
        w wVar = this.f5972s;
        if (wVar != null) {
            eVar.a(new d1(false, 0, wVar));
        }
        n0 n0Var = this.f5973t;
        if (n0Var != null) {
            eVar.a(new d1(false, 1, n0Var));
        }
        return new a1(eVar);
    }

    public final d k() throws IOException {
        return s.n(this.f5971c.f430a);
    }
}
