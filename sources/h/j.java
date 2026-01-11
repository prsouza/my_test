package h;

import c3.k;
import n0.b0;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f5581a;

    public class a extends k {
        public a() {
        }

        public final void c() {
            j.this.f5581a.D.setAlpha(1.0f);
            j.this.f5581a.G.d((b0) null);
            j.this.f5581a.G = null;
        }

        public final void i() {
            j.this.f5581a.D.setVisibility(0);
        }
    }

    public j(g gVar) {
        this.f5581a = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            h.g r0 = r4.f5581a
            android.widget.PopupWindow r1 = r0.E
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            h.g r0 = r4.f5581a
            r0.L()
            h.g r0 = r4.f5581a
            boolean r1 = r0.I
            if (r1 == 0) goto L_0x0025
            android.view.ViewGroup r0 = r0.J
            if (r0 == 0) goto L_0x0025
            java.util.WeakHashMap<android.view.View, n0.a0> r1 = n0.x.f8842a
            boolean r0 = n0.x.g.c(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = r3
        L_0x0026:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x004c
            h.g r0 = r4.f5581a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r2 = 0
            r0.setAlpha(r2)
            h.g r0 = r4.f5581a
            androidx.appcompat.widget.ActionBarContextView r2 = r0.D
            n0.a0 r2 = n0.x.b(r2)
            r2.a(r1)
            r0.G = r2
            h.g r0 = r4.f5581a
            n0.a0 r0 = r0.G
            h.j$a r1 = new h.j$a
            r1.<init>()
            r0.d(r1)
            goto L_0x005a
        L_0x004c:
            h.g r0 = r4.f5581a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r0.setAlpha(r1)
            h.g r0 = r4.f5581a
            androidx.appcompat.widget.ActionBarContextView r0 = r0.D
            r0.setVisibility(r3)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.j.run():void");
    }
}
