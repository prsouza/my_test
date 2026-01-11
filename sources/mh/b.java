package mh;

import a9.c;
import ag.n;
import ag.w;
import ag.w0;
import fh.e;
import fh.i;
import fh.j;
import fh.k;
import fh.m;
import gh.g;
import gh.h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jh.a;
import nh.o;
import nh.p;
import nh.t;
import nh.u;

public final class b {
    public static hg.b a(a.b bVar, w wVar) throws IOException {
        int i;
        h X0;
        a.b bVar2 = bVar;
        w wVar2 = wVar;
        if (bVar2 instanceof a) {
            a aVar = (a) bVar2;
            return new hg.b(e.b(aVar.F), new w0(aVar.S0()), wVar2, (byte[]) null);
        } else if (bVar2 instanceof lh.b) {
            lh.b bVar3 = (lh.b) bVar2;
            return new hg.b(new jg.a(e.f5153d, new fh.h(e.c(bVar3.F))), new w0(bVar3.S0()), (w) null, (byte[]) null);
        } else {
            if (bVar2 instanceof ih.a) {
                jg.a aVar2 = new jg.a(e.f5154e);
                short[] S0 = ((ih.a) bVar2).S0();
                byte[] bArr = new byte[(S0.length * 2)];
                for (int i10 = 0; i10 != S0.length; i10++) {
                    short s10 = S0[i10];
                    int i11 = i10 * 2;
                    bArr[i11] = (byte) s10;
                    bArr[i11 + 1] = (byte) (s10 >>> 8);
                }
                return new hg.b(aVar2, new w0(bArr), (w) null, (byte[]) null);
            } else if (bVar2 instanceof g) {
                g gVar = (g) bVar2;
                c l10 = c.l();
                l10.m(1);
                l10.j(gVar);
                byte[] i12 = l10.i();
                c l11 = c.l();
                l11.m(1);
                l11.j(gVar.X0());
                return new hg.b(new jg.a(hg.a.f5968a), new w0(i12), wVar2, l11.i());
            } else if (bVar2 instanceof gh.b) {
                gh.b bVar4 = (gh.b) bVar2;
                c l12 = c.l();
                l12.m(bVar4.F);
                l12.j(bVar4);
                byte[] i13 = l12.i();
                c l13 = c.l();
                l13.m(bVar4.F);
                synchronized (bVar4) {
                    i = bVar4.F;
                    X0 = bVar4.H.get(0).X0();
                }
                try {
                    c l14 = c.l();
                    l14.m(i);
                    l14.k(X0.getEncoded());
                    ((ByteArrayOutputStream) l13.f176b).write(l14.i());
                    return new hg.b(new jg.a(hg.a.f5968a), new w0(i13), wVar2, l13.i());
                } catch (Exception e10) {
                    throw new RuntimeException(e10.getMessage(), e10);
                }
            } else if (bVar2 instanceof u) {
                u uVar = (u) bVar2;
                jg.a aVar3 = new jg.a(e.f5155f, new i(uVar.G.f9127b, e.e(uVar.F)));
                byte[] encoded = uVar.getEncoded();
                t tVar = uVar.G;
                int i14 = tVar.g;
                int i15 = tVar.f9127b;
                int a10 = (int) nh.w.a(encoded, 4);
                if (nh.w.g(i15, (long) a10)) {
                    byte[] f10 = nh.w.f(encoded, 4, i14);
                    int i16 = i14 + 4;
                    byte[] f11 = nh.w.f(encoded, i16, i14);
                    int i17 = i16 + i14;
                    byte[] f12 = nh.w.f(encoded, i17, i14);
                    int i18 = i17 + i14;
                    byte[] f13 = nh.w.f(encoded, i18, i14);
                    int i19 = i18 + i14;
                    byte[] f14 = nh.w.f(encoded, i19, encoded.length - i19);
                    try {
                        int i20 = ((nh.a) nh.w.e(f14, nh.a.class)).z;
                        return new hg.b(aVar3, i20 != (1 << i15) - 1 ? new m(a10, f10, f11, f12, f13, f14, i20) : new m(a10, f10, f11, f12, f13, f14), wVar2, (byte[]) null);
                    } catch (ClassNotFoundException e11) {
                        StringBuilder d10 = a.a.d("cannot parse BDS: ");
                        d10.append(e11.getMessage());
                        throw new IOException(d10.toString());
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else if (bVar2 instanceof p) {
                p pVar = (p) bVar2;
                n nVar = e.g;
                o oVar = pVar.G;
                jg.a aVar4 = new jg.a(nVar, new j(oVar.f9111c, oVar.f9112d, e.e(pVar.F)));
                byte[] encoded2 = pVar.getEncoded();
                o oVar2 = pVar.G;
                int i21 = oVar2.f9110b.g;
                int i22 = oVar2.f9111c;
                int i23 = (i22 + 7) / 8;
                long a11 = (long) ((int) nh.w.a(encoded2, i23));
                if (nh.w.g(i22, a11)) {
                    int i24 = i23 + 0;
                    byte[] f15 = nh.w.f(encoded2, i24, i21);
                    int i25 = i24 + i21;
                    byte[] f16 = nh.w.f(encoded2, i25, i21);
                    int i26 = i25 + i21;
                    byte[] f17 = nh.w.f(encoded2, i26, i21);
                    int i27 = i26 + i21;
                    byte[] f18 = nh.w.f(encoded2, i27, i21);
                    int i28 = i27 + i21;
                    byte[] f19 = nh.w.f(encoded2, i28, encoded2.length - i28);
                    try {
                        long j10 = ((nh.b) nh.w.e(f19, nh.b.class)).f9060b;
                        return new hg.b(aVar4, j10 != (1 << i22) - 1 ? new k(a11, f15, f16, f17, f18, f19, j10) : new k(a11, f15, f16, f17, f18, f19), wVar2, (byte[]) null);
                    } catch (ClassNotFoundException e12) {
                        StringBuilder d11 = a.a.d("cannot parse BDSStateMap: ");
                        d11.append(e12.getMessage());
                        throw new IOException(d11.toString());
                    }
                } else {
                    throw new IllegalArgumentException("index out of bounds");
                }
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }
}
