package uh;

import ag.n;
import e6.e;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import jg.b;
import mh.c;
import nh.v;
import xh.a;

public final class d implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public transient v f12014a;

    /* renamed from: b  reason: collision with root package name */
    public transient n f12015b;

    public d(b bVar) throws IOException {
        v vVar = (v) c.a(bVar);
        this.f12014a = vVar;
        this.f12015b = e.N(vVar.F);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                return this.f12015b.m(dVar.f12015b) && Arrays.equals(this.f12014a.getEncoded(), dVar.f12014a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final byte[] getEncoded() {
        try {
            return mh.d.a(this.f12014a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return (a.e(this.f12014a.getEncoded()) * 37) + this.f12015b.hashCode();
        } catch (IOException unused) {
            return this.f12015b.hashCode();
        }
    }
}
