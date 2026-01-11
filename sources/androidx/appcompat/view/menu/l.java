package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

public final class l extends e implements SubMenu {
    public g A;
    public e z;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.z = eVar;
        this.A = gVar;
    }

    public final boolean e(g gVar) {
        return this.z.e(gVar);
    }

    public final boolean f(e eVar, MenuItem menuItem) {
        return super.f(eVar, menuItem) || this.z.f(eVar, menuItem);
    }

    public final boolean g(g gVar) {
        return this.z.g(gVar);
    }

    public final MenuItem getItem() {
        return this.A;
    }

    public final String k() {
        g gVar = this.A;
        int i = gVar != null ? gVar.f948a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i;
    }

    public final e l() {
        return this.z.l();
    }

    public final boolean n() {
        return this.z.n();
    }

    public final boolean o() {
        return this.z.o();
    }

    public final boolean p() {
        return this.z.p();
    }

    public final void setGroupDividerEnabled(boolean z10) {
        this.z.setGroupDividerEnabled(z10);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        z(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        z(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        z(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z10) {
        this.z.setQwertyMode(z10);
    }

    public final void y(e.a aVar) {
        this.z.y(aVar);
    }

    public final SubMenu setHeaderIcon(int i) {
        z(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        z(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
