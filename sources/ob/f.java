package ob;

import bb.a;
import com.google.android.material.tabs.TabLayout;
import e6.e;
import tb.c;

public final class f implements TabLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f9406a;

    public f(h hVar) {
        this.f9406a = hVar;
    }

    public final void a(TabLayout.f fVar) {
        if (fVar != null) {
            c(fVar);
        }
    }

    public final void b() {
    }

    public final void c(TabLayout.f fVar) {
        e.D(fVar, "tab");
        a aVar = a.values()[fVar.f4044h];
        h hVar = this.f9406a;
        c cVar = hVar.f9410a;
        if (cVar != null) {
            e.D(aVar, "<set-?>");
            cVar.f11473w = aVar;
        }
        c cVar2 = hVar.f9410a;
        if (cVar2 != null) {
            cVar2.j(aVar, hVar.f9411b);
        }
    }
}
