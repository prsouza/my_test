package n;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import i0.c;
import s.g;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8754a;

    /* renamed from: b  reason: collision with root package name */
    public g<i0.b, MenuItem> f8755b;

    /* renamed from: c  reason: collision with root package name */
    public g<c, SubMenu> f8756c;

    public b(Context context) {
        this.f8754a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof i0.b)) {
            return menuItem;
        }
        i0.b bVar = (i0.b) menuItem;
        if (this.f8755b == null) {
            this.f8755b = new g<>();
        }
        MenuItem orDefault = this.f8755b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f8754a, bVar);
        this.f8755b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f8756c == null) {
            this.f8756c = new g<>();
        }
        SubMenu orDefault = this.f8756c.getOrDefault(cVar, null);
        if (orDefault != null) {
            return orDefault;
        }
        g gVar = new g(this.f8754a, cVar);
        this.f8756c.put(cVar, gVar);
        return gVar;
    }
}
