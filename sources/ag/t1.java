package ag;

import ag.t;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

public final class t1 extends t {

    /* renamed from: b  reason: collision with root package name */
    public byte[] f449b;

    public t1(byte[] bArr) throws IOException {
        this.f449b = bArr;
    }

    public final synchronized int hashCode() {
        v();
        return super.hashCode();
    }

    public final synchronized Iterator<d> iterator() {
        v();
        return super.iterator();
    }

    public final synchronized void k(q qVar, boolean z) throws IOException {
        byte[] bArr = this.f449b;
        if (bArr != null) {
            qVar.h(z, 48, bArr);
        } else {
            super.q().k(qVar, z);
        }
    }

    public final synchronized int l() throws IOException {
        byte[] bArr = this.f449b;
        if (bArr != null) {
            return v1.a(bArr.length) + 1 + this.f449b.length;
        }
        return super.q().l();
    }

    public final synchronized s p() {
        v();
        return super.p();
    }

    public final synchronized s q() {
        v();
        return super.q();
    }

    public final synchronized d s(int i) {
        v();
        return this.f445a[i];
    }

    public final synchronized int size() {
        v();
        return this.f445a.length;
    }

    public final synchronized Enumeration t() {
        byte[] bArr = this.f449b;
        if (bArr != null) {
            return new s1(bArr);
        }
        return new t.a();
    }

    public final d[] u() {
        v();
        return this.f445a;
    }

    public final void v() {
        if (this.f449b != null) {
            d[] dVarArr = new d[10];
            s1 s1Var = new s1(this.f449b);
            int i = 0;
            boolean z = false;
            while (s1Var.hasMoreElements()) {
                s sVar = (s) s1Var.nextElement();
                Objects.requireNonNull(sVar, "'element' cannot be null");
                int i10 = i + 1;
                if ((i10 > dVarArr.length) || z) {
                    d[] dVarArr2 = new d[Math.max(dVarArr.length, (i10 >> 1) + i10)];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    dVarArr = dVarArr2;
                    z = false;
                }
                dVarArr[i] = sVar;
                i = i10;
            }
            if (i == 0) {
                dVarArr = e.f386d;
            } else if (dVarArr.length != i) {
                d[] dVarArr3 = new d[i];
                System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                dVarArr = dVarArr3;
            }
            this.f445a = dVarArr;
            this.f449b = null;
        }
    }
}
