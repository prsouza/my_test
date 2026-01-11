package v;

import java.util.ArrayList;
import t.c;

public class l extends e {

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList<e> f12108r0 = new ArrayList<>();

    public void D() {
        this.f12108r0.clear();
        super.D();
    }

    public final void F(c cVar) {
        super.F(cVar);
        int size = this.f12108r0.size();
        for (int i = 0; i < size; i++) {
            this.f12108r0.get(i).F(cVar);
        }
    }

    public void T() {
        ArrayList<e> arrayList = this.f12108r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f12108r0.get(i);
                if (eVar instanceof l) {
                    ((l) eVar).T();
                }
            }
        }
    }
}
