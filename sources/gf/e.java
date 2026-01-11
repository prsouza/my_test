package gf;

import aa.b;
import java.util.Arrays;
import ui.c;

public final class e extends b {
    public final qg.e I;
    public final long J;

    public e(qg.e eVar, long j10) {
        this.I = eVar;
        this.J = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.I.getEncoded(), eVar.I.getEncoded()) && this.J == eVar.J;
    }

    public final int hashCode() {
        StringBuilder sb2 = new StringBuilder();
        byte[] encoded = this.I.getEncoded();
        e6.e.C(encoded, "ed25519PublicKey.encoded");
        sb2.append(c.a(encoded));
        sb2.append(this.J);
        return sb2.toString().hashCode();
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("Ed25519SecurityParameter(ed25519PublicKey=");
        q10.append(this.I);
        q10.append(", timestamp=");
        q10.append(this.J);
        q10.append(")");
        return q10.toString();
    }
}
