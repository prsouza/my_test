package nh;

import java.util.Objects;
import la.a;
import nh.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l f9087a;

    /* renamed from: b  reason: collision with root package name */
    public final a f9088b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f9089c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f9090d;

    public j(l lVar) {
        Objects.requireNonNull(lVar, "params == null");
        this.f9087a = lVar;
        int i = lVar.f9095b;
        this.f9088b = new a(lVar.f9098e, i);
        this.f9089c = new byte[i];
        this.f9090d = new byte[i];
    }

    public final byte[] a(byte[] bArr, int i, i iVar) {
        int i10 = this.f9087a.f9095b;
        if (bArr.length == i10) {
            iVar.a();
            int i11 = i + 0;
            if (i11 > this.f9087a.f9096c - 1) {
                throw new IllegalArgumentException("max chain length must not be greater than w");
            } else if (i == 0) {
                return bArr;
            } else {
                byte[] a10 = a(bArr, i - 1, iVar);
                i.a aVar = (i.a) ((i.a) new i.a().c(iVar.f9100a)).d(iVar.f9101b);
                aVar.f9085e = iVar.f9083e;
                aVar.f9086f = iVar.f9084f;
                aVar.g = i11 - 1;
                i iVar2 = new i((i.a) aVar.b(0));
                byte[] a11 = this.f9088b.a(this.f9090d, iVar2.a());
                i.a aVar2 = (i.a) ((i.a) new i.a().c(iVar2.f9100a)).d(iVar2.f9101b);
                aVar2.f9085e = iVar2.f9083e;
                aVar2.f9086f = iVar2.f9084f;
                aVar2.g = iVar2.g;
                byte[] a12 = this.f9088b.a(this.f9090d, new i((i.a) aVar2.b(1)).a());
                byte[] bArr2 = new byte[i10];
                for (int i12 = 0; i12 < i10; i12++) {
                    bArr2[i12] = (byte) (a10[i12] ^ a12[i12]);
                }
                a aVar3 = this.f9088b;
                Objects.requireNonNull(aVar3);
                int length = a11.length;
                int i13 = aVar3.f8155a;
                if (length != i13) {
                    throw new IllegalArgumentException("wrong key length");
                } else if (i10 == i13) {
                    return aVar3.b(0, a11, bArr2);
                } else {
                    throw new IllegalArgumentException("wrong in length");
                }
            }
        } else {
            throw new IllegalArgumentException(a8.a.b("startHash needs to be ", i10, "bytes"));
        }
    }

    public final m b(i iVar) {
        byte[][] bArr = new byte[this.f9087a.f9097d][];
        int i = 0;
        while (true) {
            l lVar = this.f9087a;
            if (i >= lVar.f9097d) {
                return new m(lVar, bArr);
            }
            i.a aVar = (i.a) ((i.a) new i.a().c(iVar.f9100a)).d(iVar.f9101b);
            aVar.f9085e = iVar.f9083e;
            aVar.f9086f = i;
            aVar.g = iVar.g;
            i iVar2 = new i((i.a) aVar.b(iVar.f9103d));
            if (i >= 0 && i < this.f9087a.f9097d) {
                bArr[i] = a(this.f9088b.a(this.f9089c, w.j((long) i, 32)), this.f9087a.f9096c - 1, iVar2);
                i++;
                iVar = iVar2;
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public final byte[] c(byte[] bArr, i iVar) {
        i.a aVar = (i.a) ((i.a) new i.a().c(iVar.f9100a)).d(iVar.f9101b);
        aVar.f9085e = iVar.f9083e;
        return this.f9088b.a(bArr, new i(aVar).a());
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f9087a.f9095b;
        if (length != i) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        } else if (bArr2.length == i) {
            this.f9089c = bArr;
            this.f9090d = bArr2;
        } else {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
    }
}
