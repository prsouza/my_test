package v;

import java.util.ArrayList;
import w.o;

public class i extends e implements h {

    /* renamed from: r0  reason: collision with root package name */
    public e[] f12105r0 = new e[4];

    /* renamed from: s0  reason: collision with root package name */
    public int f12106s0 = 0;

    public final void T(ArrayList<o> arrayList, int i, o oVar) {
        for (int i10 = 0; i10 < this.f12106s0; i10++) {
            oVar.a(this.f12105r0[i10]);
        }
        for (int i11 = 0; i11 < this.f12106s0; i11++) {
            w.i.a(this.f12105r0[i11], i, arrayList, oVar);
        }
    }
}
