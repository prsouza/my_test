package ph;

import hh.e;
import java.security.PrivateKey;
import lg.a;

public final class c implements a, PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public e f10064a;

    public c(e eVar) {
        this.f10064a = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        e eVar = this.f10064a;
        int i = eVar.F;
        e eVar2 = cVar.f10064a;
        if (i != eVar2.F || eVar.G != eVar2.G || !eVar.H.equals(eVar2.H) || !this.f10064a.I.equals(cVar.f10064a.I) || !this.f10064a.J.equals(cVar.f10064a.J) || !this.f10064a.K.equals(cVar.f10064a.K) || !this.f10064a.L.equals(cVar.f10064a.L)) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getEncoded() {
        /*
            r9 = this;
            fh.c r8 = new fh.c
            hh.e r0 = r9.f10064a
            int r1 = r0.F
            int r2 = r0.G
            wh.b r3 = r0.H
            wh.e r4 = r0.I
            wh.d r5 = r0.K
            wh.d r6 = r0.L
            wh.a r7 = r0.J
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            jg.a r1 = new jg.a     // Catch:{ IOException -> 0x0027 }
            ag.n r2 = fh.e.f5151b     // Catch:{ IOException -> 0x0027 }
            r1.<init>((ag.n) r2)     // Catch:{ IOException -> 0x0027 }
            hg.b r2 = new hg.b     // Catch:{ IOException -> 0x0027 }
            r2.<init>(r1, r8, r0, r0)     // Catch:{ IOException -> 0x0027 }
            byte[] r0 = r2.getEncoded()     // Catch:{  }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.c.getEncoded():byte[]");
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        e eVar = this.f10064a;
        int hashCode = eVar.I.hashCode();
        int hashCode2 = this.f10064a.K.hashCode();
        int hashCode3 = this.f10064a.L.hashCode();
        return this.f10064a.J.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (((((eVar.G * 37) + eVar.F) * 37) + eVar.H.f12683b) * 37)) * 37)) * 37)) * 37);
    }
}
