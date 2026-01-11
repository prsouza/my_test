package fh;

import ag.a1;
import ag.d;
import ag.e;
import ag.k;
import ag.m;
import ag.n;
import ag.o;
import ag.s;
import ag.t;
import ag.w0;
import kh.a;

public final class f extends m {

    /* renamed from: a  reason: collision with root package name */
    public k f5157a;

    /* renamed from: b  reason: collision with root package name */
    public n f5158b;

    /* renamed from: c  reason: collision with root package name */
    public byte[][] f5159c;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f5160s;

    /* renamed from: t  reason: collision with root package name */
    public byte[][] f5161t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f5162u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f5163v;

    /* renamed from: w  reason: collision with root package name */
    public a[] f5164w;

    public f(t tVar) {
        t tVar2 = tVar;
        int i = 0;
        if (tVar2.s(0) instanceof k) {
            this.f5157a = k.s(tVar2.s(0));
        } else {
            this.f5158b = n.t(tVar2.s(0));
        }
        t tVar3 = (t) tVar2.s(1);
        this.f5159c = new byte[tVar3.size()][];
        for (int i10 = 0; i10 < tVar3.size(); i10++) {
            this.f5159c[i10] = ((o) tVar3.s(i10)).f430a;
        }
        this.f5160s = ((o) ((t) tVar2.s(2)).s(0)).f430a;
        t tVar4 = (t) tVar2.s(3);
        this.f5161t = new byte[tVar4.size()][];
        for (int i11 = 0; i11 < tVar4.size(); i11++) {
            this.f5161t[i11] = ((o) tVar4.s(i11)).f430a;
        }
        this.f5162u = ((o) ((t) tVar2.s(4)).s(0)).f430a;
        this.f5163v = ((o) ((t) tVar2.s(5)).s(0)).f430a;
        t tVar5 = (t) tVar2.s(6);
        byte[][][][] bArr = new byte[tVar5.size()][][][];
        byte[][][][] bArr2 = new byte[tVar5.size()][][][];
        byte[][][] bArr3 = new byte[tVar5.size()][][];
        byte[][] bArr4 = new byte[tVar5.size()][];
        int i12 = 0;
        while (i12 < tVar5.size()) {
            t tVar6 = (t) tVar5.s(i12);
            t tVar7 = (t) tVar6.s(i);
            bArr[i12] = new byte[tVar7.size()][][];
            for (int i13 = i; i13 < tVar7.size(); i13++) {
                t tVar8 = (t) tVar7.s(i13);
                bArr[i12][i13] = new byte[tVar8.size()][];
                for (int i14 = 0; i14 < tVar8.size(); i14++) {
                    bArr[i12][i13][i14] = ((o) tVar8.s(i14)).f430a;
                }
            }
            t tVar9 = (t) tVar6.s(1);
            bArr2[i12] = new byte[tVar9.size()][][];
            for (int i15 = 0; i15 < tVar9.size(); i15++) {
                t tVar10 = (t) tVar9.s(i15);
                bArr2[i12][i15] = new byte[tVar10.size()][];
                for (int i16 = 0; i16 < tVar10.size(); i16++) {
                    bArr2[i12][i15][i16] = ((o) tVar10.s(i16)).f430a;
                }
            }
            t tVar11 = (t) tVar6.s(2);
            bArr3[i12] = new byte[tVar11.size()][];
            for (int i17 = 0; i17 < tVar11.size(); i17++) {
                bArr3[i12][i17] = ((o) tVar11.s(i17)).f430a;
            }
            bArr4[i12] = ((o) tVar6.s(3)).f430a;
            i12++;
            i = 0;
        }
        int length = this.f5163v.length - 1;
        this.f5164w = new a[length];
        int i18 = 0;
        while (i18 < length) {
            byte[] bArr5 = this.f5163v;
            int i19 = i18 + 1;
            this.f5164w[i18] = new a(bArr5[i18], bArr5[i19], c3.k.c0(bArr[i18]), c3.k.c0(bArr2[i18]), c3.k.a0(bArr3[i18]), c3.k.Y(bArr4[i18]));
            i18 = i19;
        }
    }

    public final s d() {
        e eVar = new e();
        d dVar = this.f5157a;
        if (dVar == null) {
            dVar = this.f5158b;
        }
        eVar.a(dVar);
        e eVar2 = new e();
        int i = 0;
        while (true) {
            byte[][] bArr = this.f5159c;
            if (i >= bArr.length) {
                break;
            }
            eVar2.a(new w0(bArr[i]));
            i++;
        }
        eVar.a(new a1(eVar2));
        e eVar3 = new e();
        eVar3.a(new w0(this.f5160s));
        eVar.a(new a1(eVar3));
        e eVar4 = new e();
        int i10 = 0;
        while (true) {
            byte[][] bArr2 = this.f5161t;
            if (i10 >= bArr2.length) {
                break;
            }
            eVar4.a(new w0(bArr2[i10]));
            i10++;
        }
        eVar.a(new a1(eVar4));
        e eVar5 = new e();
        eVar5.a(new w0(this.f5162u));
        eVar.a(new a1(eVar5));
        e eVar6 = new e();
        eVar6.a(new w0(this.f5163v));
        eVar.a(new a1(eVar6));
        e eVar7 = new e();
        for (int i11 = 0; i11 < this.f5164w.length; i11++) {
            e eVar8 = new e();
            byte[][][] b0 = c3.k.b0(this.f5164w[i11].f7557d);
            e eVar9 = new e();
            for (int i12 = 0; i12 < b0.length; i12++) {
                e eVar10 = new e();
                for (byte[] w0Var : b0[i12]) {
                    eVar10.a(new w0(w0Var));
                }
                eVar9.a(new a1(eVar10));
            }
            eVar8.a(new a1(eVar9));
            byte[][][] b02 = c3.k.b0(this.f5164w[i11].f7558e);
            e eVar11 = new e();
            for (int i13 = 0; i13 < b02.length; i13++) {
                e eVar12 = new e();
                for (byte[] w0Var2 : b02[i13]) {
                    eVar12.a(new w0(w0Var2));
                }
                eVar11.a(new a1(eVar12));
            }
            eVar8.a(new a1(eVar11));
            byte[][] Z = c3.k.Z(this.f5164w[i11].f7559f);
            e eVar13 = new e();
            for (byte[] w0Var3 : Z) {
                eVar13.a(new w0(w0Var3));
            }
            eVar8.a(new a1(eVar13));
            eVar8.a(new w0(c3.k.X(this.f5164w[i11].g)));
            eVar7.a(new a1(eVar8));
        }
        eVar.a(new a1(eVar7));
        return new a1(eVar);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, a[] aVarArr) {
        this.f5157a = new k(1);
        this.f5159c = c3.k.Z(sArr);
        this.f5160s = c3.k.X(sArr2);
        this.f5161t = c3.k.Z(sArr3);
        this.f5162u = c3.k.X(sArr4);
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        this.f5163v = bArr;
        this.f5164w = aVarArr;
    }
}
