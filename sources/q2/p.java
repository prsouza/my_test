package q2;

import a9.c;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o2.l;
import r2.a;
import v2.o;
import v2.q;
import w2.b;

public final class p implements l, a.C0206a {

    /* renamed from: a  reason: collision with root package name */
    public final Path f10281a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10282b;

    /* renamed from: c  reason: collision with root package name */
    public final l f10283c;

    /* renamed from: d  reason: collision with root package name */
    public final a<?, Path> f10284d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10285e;

    /* renamed from: f  reason: collision with root package name */
    public c f10286f = new c(1);

    public p(l lVar, b bVar, o oVar) {
        Objects.requireNonNull(oVar);
        this.f10282b = oVar.f12242d;
        this.f10283c = lVar;
        a<v2.l, Path> a10 = oVar.f12241c.a();
        this.f10284d = (r2.l) a10;
        bVar.d(a10);
        a10.a(this);
    }

    public final void b() {
        this.f10285e = false;
        this.f10283c.invalidateSelf();
    }

    public final void c(List<b> list, List<b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                b bVar = (b) arrayList.get(i);
                if (bVar instanceof r) {
                    r rVar = (r) bVar;
                    if (rVar.f10294c == q.a.SIMULTANEOUSLY) {
                        this.f10286f.d(rVar);
                        rVar.d(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final Path getPath() {
        if (this.f10285e) {
            return this.f10281a;
        }
        this.f10281a.reset();
        if (this.f10282b) {
            this.f10285e = true;
            return this.f10281a;
        }
        this.f10281a.set(this.f10284d.f());
        this.f10281a.setFillType(Path.FillType.EVEN_ODD);
        this.f10286f.e(this.f10281a);
        this.f10285e = true;
        return this.f10281a;
    }
}
