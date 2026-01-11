package pf;

import e6.e;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public int f10052a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f10053b = new int[10];

    public final int a() {
        if ((this.f10052a & 128) != 0) {
            return this.f10053b[7];
        }
        return 65535;
    }

    public final void b(u uVar) {
        e.D(uVar, "other");
        for (int i = 0; i < 10; i++) {
            boolean z = true;
            if (((1 << i) & uVar.f10052a) == 0) {
                z = false;
            }
            if (z) {
                c(i, uVar.f10053b[i]);
            }
        }
    }

    public final u c(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f10053b;
            if (i < iArr.length) {
                this.f10052a = (1 << i) | this.f10052a;
                iArr[i] = i10;
            }
        }
        return this;
    }
}
