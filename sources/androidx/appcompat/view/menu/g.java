package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import i0.b;
import java.util.Objects;
import n0.b;

public final class g implements b {
    public n0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f948a;

    /* renamed from: b  reason: collision with root package name */
    public final int f949b;

    /* renamed from: c  reason: collision with root package name */
    public final int f950c;

    /* renamed from: d  reason: collision with root package name */
    public final int f951d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f952e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f953f;
    public Intent g;

    /* renamed from: h  reason: collision with root package name */
    public char f954h;
    public int i = LZ4Constants.HASH_TABLE_SIZE;

    /* renamed from: j  reason: collision with root package name */
    public char f955j;

    /* renamed from: k  reason: collision with root package name */
    public int f956k = LZ4Constants.HASH_TABLE_SIZE;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f957l;

    /* renamed from: m  reason: collision with root package name */
    public int f958m = 0;

    /* renamed from: n  reason: collision with root package name */
    public e f959n;

    /* renamed from: o  reason: collision with root package name */
    public l f960o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f961p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f962q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f963r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f964s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f965t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f966u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f967v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f968w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f969x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f970y;
    public View z;

    public class a implements b.a {
        public a() {
        }
    }

    public g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f959n = eVar;
        this.f948a = i11;
        this.f949b = i10;
        this.f950c = i12;
        this.f951d = i13;
        this.f952e = charSequence;
        this.f970y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public final n0.b a() {
        return this.A;
    }

    public final i0.b b(n0.b bVar) {
        n0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f8778a = null;
        }
        this.z = null;
        this.A = bVar;
        this.f959n.r(true);
        n0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f970y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f959n.e(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f968w && (this.f966u || this.f967v)) {
            drawable = drawable.mutate();
            if (this.f966u) {
                drawable.setTintList(this.f964s);
            }
            if (this.f967v) {
                drawable.setTintMode(this.f965t);
            }
            this.f968w = false;
        }
        return drawable;
    }

    public final char e() {
        return this.f959n.o() ? this.f955j : this.f954h;
    }

    public final boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f959n.g(this);
        }
        return false;
    }

    public final boolean f() {
        n0.b bVar;
        if ((this.f970y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.d(this);
        }
        if (this.z != null) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return (this.f969x & 32) == 32;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        n0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.z = d10;
        return d10;
    }

    public final int getAlphabeticModifiers() {
        return this.f956k;
    }

    public final char getAlphabeticShortcut() {
        return this.f955j;
    }

    public final CharSequence getContentDescription() {
        return this.f962q;
    }

    public final int getGroupId() {
        return this.f949b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f957l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f958m;
        if (i10 == 0) {
            return null;
        }
        Drawable a02 = a.b.a0(this.f959n.f923a, i10);
        this.f958m = 0;
        this.f957l = a02;
        return d(a02);
    }

    public final ColorStateList getIconTintList() {
        return this.f964s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f965t;
    }

    public final Intent getIntent() {
        return this.g;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f948a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.i;
    }

    public final char getNumericShortcut() {
        return this.f954h;
    }

    public final int getOrder() {
        return this.f950c;
    }

    public final SubMenu getSubMenu() {
        return this.f960o;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f952e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f953f;
        return charSequence != null ? charSequence : this.f952e;
    }

    public final CharSequence getTooltipText() {
        return this.f963r;
    }

    public final boolean h() {
        return (this.f969x & 4) != 0;
    }

    public final boolean hasSubMenu() {
        return this.f960o != null;
    }

    public final i0.b i(View view) {
        int i10;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f948a) > 0) {
            view.setId(i10);
        }
        this.f959n.q();
        return this;
    }

    public final boolean isActionViewExpanded() {
        return this.C;
    }

    public final boolean isCheckable() {
        return (this.f969x & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f969x & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f969x & 16) != 0;
    }

    public final boolean isVisible() {
        n0.b bVar = this.A;
        if (bVar == null || !bVar.g()) {
            if ((this.f969x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f969x & 8) != 0 || !this.A.b()) {
            return false;
        } else {
            return true;
        }
    }

    public final void j(boolean z10) {
        int i10 = this.f969x;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.f969x = i11;
        if (i10 != i11) {
            this.f959n.r(false);
        }
    }

    public final void k(boolean z10) {
        if (z10) {
            this.f969x |= 32;
        } else {
            this.f969x &= -33;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f955j == c10) {
            return this;
        }
        this.f955j = Character.toLowerCase(c10);
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f969x;
        boolean z11 = z10 | (i10 & true);
        this.f969x = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f959n.r(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z10) {
        if ((this.f969x & 4) != 0) {
            e eVar = this.f959n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f928f.size();
            eVar.B();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar = eVar.f928f.get(i10);
                if (gVar.f949b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.A();
        } else {
            j(z10);
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f969x |= 16;
        } else {
            this.f969x &= -17;
        }
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f958m = 0;
        this.f957l = drawable;
        this.f968w = true;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f964s = colorStateList;
        this.f966u = true;
        this.f968w = true;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f965t = mode;
        this.f967v = true;
        this.f968w = true;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        if (this.f954h == c10) {
            return this;
        }
        this.f954h = c10;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f961p = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f954h = c10;
        this.f955j = Character.toLowerCase(c11);
        this.f959n.r(false);
        return this;
    }

    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f970y = i10;
            this.f959n.q();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f952e = charSequence;
        this.f959n.r(false);
        l lVar = this.f960o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f953f = charSequence;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f969x;
        boolean z11 = false;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.f969x = i11;
        if (i10 != i11) {
            z11 = true;
        }
        if (z11) {
            e eVar = this.f959n;
            eVar.f929h = true;
            eVar.r(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f952e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final MenuItem setActionView(int i10) {
        Context context = this.f959n.f923a;
        i(LayoutInflater.from(context).inflate(i10, new LinearLayout(context), false));
        return this;
    }

    public final i0.b setContentDescription(CharSequence charSequence) {
        this.f962q = charSequence;
        this.f959n.r(false);
        return this;
    }

    public final i0.b setTooltipText(CharSequence charSequence) {
        this.f963r = charSequence;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f955j == c10 && this.f956k == i10) {
            return this;
        }
        this.f955j = Character.toLowerCase(c10);
        this.f956k = KeyEvent.normalizeMetaState(i10);
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f954h == c10 && this.i == i10) {
            return this;
        }
        this.f954h = c10;
        this.i = KeyEvent.normalizeMetaState(i10);
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f954h = c10;
        this.i = KeyEvent.normalizeMetaState(i10);
        this.f955j = Character.toLowerCase(c11);
        this.f956k = KeyEvent.normalizeMetaState(i11);
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setIcon(int i10) {
        this.f957l = null;
        this.f958m = i10;
        this.f968w = true;
        this.f959n.r(false);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        setTitle((CharSequence) this.f959n.f923a.getString(i10));
        return this;
    }
}
