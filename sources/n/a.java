package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d0.a;
import i0.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f8740a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f8741b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f8742c;

    /* renamed from: d  reason: collision with root package name */
    public char f8743d;

    /* renamed from: e  reason: collision with root package name */
    public int f8744e = LZ4Constants.HASH_TABLE_SIZE;

    /* renamed from: f  reason: collision with root package name */
    public char f8745f;
    public int g = LZ4Constants.HASH_TABLE_SIZE;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f8746h;
    public Context i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f8747j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f8748k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f8749l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f8750m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8751n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8752o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f8753p = 16;

    public a(Context context, CharSequence charSequence) {
        this.i = context;
        this.f8740a = charSequence;
    }

    public final n0.b a() {
        return null;
    }

    public final b b(n0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f8746h;
        if (drawable == null) {
            return;
        }
        if (this.f8751n || this.f8752o) {
            this.f8746h = drawable;
            Drawable mutate = drawable.mutate();
            this.f8746h = mutate;
            if (this.f8751n) {
                mutate.setTintList(this.f8749l);
            }
            if (this.f8752o) {
                this.f8746h.setTintMode(this.f8750m);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.g;
    }

    public final char getAlphabeticShortcut() {
        return this.f8745f;
    }

    public final CharSequence getContentDescription() {
        return this.f8747j;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f8746h;
    }

    public final ColorStateList getIconTintList() {
        return this.f8749l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f8750m;
    }

    public final Intent getIntent() {
        return this.f8742c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f8744e;
    }

    public final char getNumericShortcut() {
        return this.f8743d;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f8740a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8741b;
        return charSequence != null ? charSequence : this.f8740a;
    }

    public final CharSequence getTooltipText() {
        return this.f8748k;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.f8753p & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.f8753p & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.f8753p & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f8753p & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f8745f = Character.toLowerCase(c10);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f8753p = z | (this.f8753p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f8753p = (z ? 2 : 0) | (this.f8753p & -3);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8747j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f8753p = (z ? 16 : 0) | (this.f8753p & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f8746h = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8749l = colorStateList;
        this.f8751n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8750m = mode;
        this.f8752o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f8742c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f8743d = c10;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f8743d = c10;
        this.f8745f = Character.toLowerCase(c11);
        return this;
    }

    public final void setShowAsAction(int i10) {
    }

    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8740a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8741b = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8748k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i10 = 8;
        int i11 = this.f8753p & 8;
        if (z) {
            i10 = 0;
        }
        this.f8753p = i11 | i10;
        return this;
    }

    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f8745f = Character.toLowerCase(c10);
        this.g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b m14setContentDescription(CharSequence charSequence) {
        this.f8747j = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f8743d = c10;
        this.f8744e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public final MenuItem setTitle(int i10) {
        this.f8740a = this.i.getResources().getString(i10);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b m15setTooltipText(CharSequence charSequence) {
        this.f8748k = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i10) {
        Context context = this.i;
        Object obj = d0.a.f4256a;
        this.f8746h = a.b.b(context, i10);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f8743d = c10;
        this.f8744e = KeyEvent.normalizeMetaState(i10);
        this.f8745f = Character.toLowerCase(c11);
        this.g = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
