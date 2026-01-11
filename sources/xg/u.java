package xg;

import java.util.Objects;
import xg.f;

public final class u implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.b f13285a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte f13286b;

    public u(f.b bVar, byte b10) {
        this.f13285a = bVar;
        this.f13286b = b10;
    }

    public final l a(l lVar) {
        if (lVar instanceof w) {
            return lVar;
        }
        w wVar = new w();
        f.b bVar = this.f13285a;
        byte[][] bArr = this.f13286b == 0 ? n.f13265d : n.f13267f;
        int length = (bArr.length + 1) >>> 1;
        f.b[] bVarArr = new f.b[length];
        bVarArr[0] = bVar;
        int length2 = bArr.length;
        for (int i = 3; i < length2; i += 2) {
            int i10 = i >>> 1;
            byte[] bArr2 = bArr[i];
            f.b bVar2 = (f.b) bVar.f13245a.l();
            f.b bVar3 = (f.b) bVar.m();
            int i11 = 0;
            for (int length3 = bArr2.length - 1; length3 >= 0; length3--) {
                i11++;
                byte b10 = bArr2[length3];
                if (b10 != 0) {
                    bVar2 = (f.b) bVar2.y(i11).a(b10 > 0 ? bVar : bVar3);
                    i11 = 0;
                }
            }
            if (i11 > 0) {
                bVar2 = bVar2.y(i11);
            }
            bVarArr[i10] = bVar2;
        }
        d dVar = bVar.f13245a;
        Objects.requireNonNull(dVar);
        dVar.n(bVarArr, 0, length, (e) null);
        wVar.f13287a = bVarArr;
        return wVar;
    }
}
