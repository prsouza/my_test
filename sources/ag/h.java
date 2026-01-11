package ag;

import b9.m;
import java.io.IOException;
import java.util.Objects;

public abstract class h extends s {

    /* renamed from: a  reason: collision with root package name */
    public n f400a;

    /* renamed from: b  reason: collision with root package name */
    public k f401b;

    /* renamed from: c  reason: collision with root package name */
    public s f402c;

    /* renamed from: s  reason: collision with root package name */
    public int f403s;

    /* renamed from: t  reason: collision with root package name */
    public s f404t;

    public h(e eVar) {
        int i = 0;
        s r10 = r(eVar, 0);
        if (r10 instanceof n) {
            this.f400a = (n) r10;
            r10 = r(eVar, 1);
            i = 1;
        }
        if (r10 instanceof k) {
            this.f401b = (k) r10;
            i++;
            r10 = r(eVar, i);
        }
        if (!(r10 instanceof y)) {
            this.f402c = r10;
            i++;
            r10 = r(eVar, i);
        }
        if (eVar.f388b != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if (r10 instanceof y) {
            y yVar = (y) r10;
            s(yVar.f464a);
            this.f404t = yVar.s();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public final int hashCode() {
        n nVar = this.f400a;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        k kVar = this.f401b;
        if (kVar != null) {
            hashCode ^= kVar.hashCode();
        }
        s sVar = this.f402c;
        if (sVar != null) {
            hashCode ^= sVar.hashCode();
        }
        return hashCode ^ this.f404t.hashCode();
    }

    public final boolean j(s sVar) {
        s sVar2;
        k kVar;
        n nVar;
        if (!(sVar instanceof h)) {
            return false;
        }
        if (this == sVar) {
            return true;
        }
        h hVar = (h) sVar;
        n nVar2 = this.f400a;
        if (nVar2 != null && ((nVar = hVar.f400a) == null || !nVar.m(nVar2))) {
            return false;
        }
        k kVar2 = this.f401b;
        if (kVar2 != null && ((kVar = hVar.f401b) == null || !kVar.m(kVar2))) {
            return false;
        }
        s sVar3 = this.f402c;
        if (sVar3 == null || ((sVar2 = hVar.f402c) != null && sVar2.m(sVar3))) {
            return this.f404t.m(hVar.f404t);
        }
        return false;
    }

    public int l() throws IOException {
        return getEncoded().length;
    }

    public final boolean o() {
        return true;
    }

    public s p() {
        return new o0(this.f400a, this.f401b, this.f402c, this.f403s, this.f404t);
    }

    public s q() {
        return new j1(this.f400a, this.f401b, this.f402c, this.f403s, this.f404t);
    }

    public final s r(e eVar, int i) {
        if (eVar.f388b > i) {
            return eVar.b(i).d();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    public final void s(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(m.b("invalid encoding value: ", i));
        }
        this.f403s = i;
    }

    public h(n nVar, k kVar, s sVar, int i, s sVar2) {
        this.f400a = nVar;
        this.f401b = kVar;
        this.f402c = sVar;
        s(i);
        Objects.requireNonNull(sVar2);
        this.f404t = sVar2;
    }
}
