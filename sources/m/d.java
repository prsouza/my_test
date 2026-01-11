package m;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import java.lang.ref.WeakReference;
import m.a;

public final class d extends a implements e.a {

    /* renamed from: c  reason: collision with root package name */
    public Context f8311c;

    /* renamed from: s  reason: collision with root package name */
    public ActionBarContextView f8312s;

    /* renamed from: t  reason: collision with root package name */
    public a.C0149a f8313t;

    /* renamed from: u  reason: collision with root package name */
    public WeakReference<View> f8314u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8315v;

    /* renamed from: w  reason: collision with root package name */
    public e f8316w;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0149a aVar) {
        this.f8311c = context;
        this.f8312s = actionBarContextView;
        this.f8313t = aVar;
        e eVar = new e(actionBarContextView.getContext());
        eVar.f932l = 1;
        this.f8316w = eVar;
        eVar.f927e = this;
    }

    public final boolean a(e eVar, MenuItem menuItem) {
        return this.f8313t.d(this, menuItem);
    }

    public final void b(e eVar) {
        i();
        c cVar = this.f8312s.f1143s;
        if (cVar != null) {
            cVar.m();
        }
    }

    public final void c() {
        if (!this.f8315v) {
            this.f8315v = true;
            this.f8313t.b(this);
        }
    }

    public final View d() {
        WeakReference<View> weakReference = this.f8314u;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final Menu e() {
        return this.f8316w;
    }

    public final MenuInflater f() {
        return new f(this.f8312s.getContext());
    }

    public final CharSequence g() {
        return this.f8312s.getSubtitle();
    }

    public final CharSequence h() {
        return this.f8312s.getTitle();
    }

    public final void i() {
        this.f8313t.c(this, this.f8316w);
    }

    public final boolean j() {
        return this.f8312s.H;
    }

    public final void k(View view) {
        this.f8312s.setCustomView(view);
        this.f8314u = view != null ? new WeakReference<>(view) : null;
    }

    public final void l(int i) {
        this.f8312s.setSubtitle(this.f8311c.getString(i));
    }

    public final void m(CharSequence charSequence) {
        this.f8312s.setSubtitle(charSequence);
    }

    public final void n(int i) {
        this.f8312s.setTitle(this.f8311c.getString(i));
    }

    public final void o(CharSequence charSequence) {
        this.f8312s.setTitle(charSequence);
    }

    public final void p(boolean z) {
        this.f8305b = z;
        this.f8312s.setTitleOptional(z);
    }
}
