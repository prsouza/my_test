package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import i0.c;

public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f8769e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f8769e = cVar;
    }

    public final void clearHeader() {
        this.f8769e.clearHeader();
    }

    public final MenuItem getItem() {
        return c(this.f8769e.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f8769e.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f8769e.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f8769e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f8769e.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f8769e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f8769e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f8769e.setIcon(drawable);
        return this;
    }
}
