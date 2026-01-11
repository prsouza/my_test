package ag;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import xh.a;

public abstract class w extends s implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final d[] f458a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f459b;

    public w() {
        this.f458a = e.f386d;
        this.f459b = true;
    }

    public w(d dVar) {
        Objects.requireNonNull(dVar, "'element' cannot be null");
        this.f458a = new d[]{dVar};
        this.f459b = true;
    }

    public w(e eVar) {
        Objects.requireNonNull(eVar, "'elementVector' cannot be null");
        d[] c10 = eVar.c();
        this.f458a = c10;
        this.f459b = c10.length < 2;
    }

    public w(boolean z, d[] dVarArr) {
        this.f458a = dVarArr;
        this.f459b = z || dVarArr.length < 2;
    }

    public static byte[] r(d dVar) {
        try {
            return dVar.d().i("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static boolean s(byte[] bArr, byte[] bArr2) {
        byte b10 = bArr[0] & -33;
        byte b11 = bArr2[0] & -33;
        if (b10 != b11) {
            return b10 < b11;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i = 1; i < min; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static void t(d[] dVarArr) {
        int length = dVarArr.length;
        if (length >= 2) {
            d dVar = dVarArr[0];
            d dVar2 = dVarArr[1];
            byte[] r10 = r(dVar);
            byte[] r11 = r(dVar2);
            if (s(r11, r10)) {
                d dVar3 = dVar2;
                dVar2 = dVar;
                dVar = dVar3;
            } else {
                byte[] bArr = r11;
                r11 = r10;
                r10 = bArr;
            }
            for (int i = 2; i < length; i++) {
                d dVar4 = dVarArr[i];
                byte[] r12 = r(dVar4);
                if (s(r10, r12)) {
                    dVarArr[i - 2] = dVar;
                    dVar = dVar2;
                    r11 = r10;
                    dVar2 = dVar4;
                    r10 = r12;
                } else if (s(r11, r12)) {
                    dVarArr[i - 2] = dVar;
                    dVar = dVar4;
                    r11 = r12;
                } else {
                    int i10 = i - 1;
                    while (true) {
                        i10--;
                        if (i10 <= 0) {
                            break;
                        }
                        d dVar5 = dVarArr[i10 - 1];
                        if (s(r(dVar5), r12)) {
                            break;
                        }
                        dVarArr[i10] = dVar5;
                    }
                    dVarArr[i10] = dVar4;
                }
            }
            dVarArr[length - 2] = dVar;
            dVarArr[length - 1] = dVar2;
        }
    }

    public final int hashCode() {
        int length = this.f458a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.f458a[length].d().hashCode();
        }
    }

    public final Iterator<d> iterator() {
        d[] dVarArr = this.f458a;
        return new a.C0254a(dVarArr.length < 1 ? e.f386d : (d[]) dVarArr.clone());
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof w)) {
            return false;
        }
        w wVar = (w) sVar;
        int length = this.f458a.length;
        if (wVar.f458a.length != length) {
            return false;
        }
        b1 b1Var = (b1) p();
        b1 b1Var2 = (b1) wVar.p();
        for (int i = 0; i < length; i++) {
            s d10 = b1Var.f458a[i].d();
            s d11 = b1Var2.f458a[i].d();
            if (d10 != d11 && !d10.j(d11)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return true;
    }

    public s p() {
        d[] dVarArr;
        if (this.f459b) {
            dVarArr = this.f458a;
        } else {
            dVarArr = (d[]) this.f458a.clone();
            t(dVarArr);
        }
        return new b1(dVarArr);
    }

    public s q() {
        return new n1(this.f459b, this.f458a);
    }

    public final String toString() {
        int length = this.f458a.length;
        if (length == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f458a[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
