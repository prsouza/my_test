package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i0.b;
import java.util.ArrayList;
import m.a;
import n.c;
import s.g;

public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8317a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8318b;

    public static class a implements a.C0149a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f8319a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f8320b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f8321c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final g<Menu, Menu> f8322d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f8320b = context;
            this.f8319a = callback;
        }

        public final boolean a(a aVar, Menu menu) {
            return this.f8319a.onCreateActionMode(e(aVar), f(menu));
        }

        public final void b(a aVar) {
            this.f8319a.onDestroyActionMode(e(aVar));
        }

        public final boolean c(a aVar, Menu menu) {
            return this.f8319a.onPrepareActionMode(e(aVar), f(menu));
        }

        public final boolean d(a aVar, MenuItem menuItem) {
            return this.f8319a.onActionItemClicked(e(aVar), new c(this.f8320b, (b) menuItem));
        }

        public final ActionMode e(a aVar) {
            int size = this.f8321c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f8321c.get(i);
                if (eVar != null && eVar.f8318b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f8320b, aVar);
            this.f8321c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f8322d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            n.e eVar = new n.e(this.f8320b, (i0.a) menu);
            this.f8322d.put(menu, eVar);
            return eVar;
        }
    }

    public e(Context context, a aVar) {
        this.f8317a = context;
        this.f8318b = aVar;
    }

    public final void finish() {
        this.f8318b.c();
    }

    public final View getCustomView() {
        return this.f8318b.d();
    }

    public final Menu getMenu() {
        return new n.e(this.f8317a, (i0.a) this.f8318b.e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f8318b.f();
    }

    public final CharSequence getSubtitle() {
        return this.f8318b.g();
    }

    public final Object getTag() {
        return this.f8318b.f8304a;
    }

    public final CharSequence getTitle() {
        return this.f8318b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f8318b.f8305b;
    }

    public final void invalidate() {
        this.f8318b.i();
    }

    public final boolean isTitleOptional() {
        return this.f8318b.j();
    }

    public final void setCustomView(View view) {
        this.f8318b.k(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f8318b.m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f8318b.f8304a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f8318b.o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f8318b.p(z);
    }

    public final void setSubtitle(int i) {
        this.f8318b.l(i);
    }

    public final void setTitle(int i) {
        this.f8318b.n(i);
    }
}
