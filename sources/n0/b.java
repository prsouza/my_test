package n0;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f8778a;

    public interface a {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h(a aVar) {
        if (this.f8778a != null) {
            StringBuilder d10 = a.a.d("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            d10.append(getClass().getSimpleName());
            d10.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", d10.toString());
        }
        this.f8778a = aVar;
    }
}
