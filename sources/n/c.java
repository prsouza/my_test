package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;
import n0.b;

public final class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final i0.b f8757d;

    /* renamed from: e  reason: collision with root package name */
    public Method f8758e;

    public class a extends n0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f8759b;

        public a(Context context, ActionProvider actionProvider) {
            this.f8759b = actionProvider;
        }

        public final boolean a() {
            return this.f8759b.hasSubMenu();
        }

        public final View c() {
            return this.f8759b.onCreateActionView();
        }

        public final boolean e() {
            return this.f8759b.onPerformDefaultAction();
        }

        public final void f(SubMenu subMenu) {
            this.f8759b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f8761d;

        public b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public final boolean b() {
            return this.f8759b.isVisible();
        }

        public final View d(MenuItem menuItem) {
            return this.f8759b.onCreateActionView(menuItem);
        }

        public final boolean g() {
            return this.f8759b.overridesItemVisibility();
        }

        public final void h(b.a aVar) {
            this.f8761d = aVar;
            this.f8759b.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            b.a aVar = this.f8761d;
            if (aVar != null) {
                androidx.appcompat.view.menu.e eVar = g.this.f959n;
                eVar.f929h = true;
                eVar.r(true);
            }
        }
    }

    /* renamed from: n.c$c  reason: collision with other inner class name */
    public static class C0160c extends FrameLayout implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final CollapsibleActionView f8762a;

        public C0160c(View view) {
            super(view.getContext());
            this.f8762a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void c() {
            this.f8762a.onActionViewExpanded();
        }

        public final void e() {
            this.f8762a.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f8763a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f8763a = onActionExpandListener;
        }

        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f8763a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f8763a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f8765a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f8765a = onMenuItemClickListener;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f8765a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, i0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f8757d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f8757d.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f8757d.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        n0.b a10 = this.f8757d.a();
        if (a10 instanceof a) {
            return ((a) a10).f8759b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f8757d.getActionView();
        return actionView instanceof C0160c ? (View) ((C0160c) actionView).f8762a : actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f8757d.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f8757d.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f8757d.getContentDescription();
    }

    public final int getGroupId() {
        return this.f8757d.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f8757d.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f8757d.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f8757d.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f8757d.getIntent();
    }

    public final int getItemId() {
        return this.f8757d.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f8757d.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f8757d.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f8757d.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f8757d.getOrder();
    }

    public final SubMenu getSubMenu() {
        return d(this.f8757d.getSubMenu());
    }

    public final CharSequence getTitle() {
        return this.f8757d.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f8757d.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f8757d.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f8757d.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f8757d.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f8757d.isCheckable();
    }

    public final boolean isChecked() {
        return this.f8757d.isChecked();
    }

    public final boolean isEnabled() {
        return this.f8757d.isEnabled();
    }

    public final boolean isVisible() {
        return this.f8757d.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f8754a, actionProvider);
        i0.b bVar2 = this.f8757d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0160c(view);
        }
        this.f8757d.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f8757d.setAlphabeticShortcut(c10);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f8757d.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f8757d.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f8757d.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f8757d.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f8757d.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8757d.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8757d.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f8757d.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10) {
        this.f8757d.setNumericShortcut(c10);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f8757d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8757d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11) {
        this.f8757d.setShortcut(c10, c11);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f8757d.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f8757d.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f8757d.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8757d.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f8757d.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.f8757d.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        this.f8757d.setAlphabeticShortcut(c10, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f8757d.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c10, int i) {
        this.f8757d.setNumericShortcut(c10, i);
        return this;
    }

    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f8757d.setShortcut(c10, c11, i, i10);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f8757d.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(int i) {
        this.f8757d.setActionView(i);
        View actionView = this.f8757d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f8757d.setActionView((View) new C0160c(actionView));
        }
        return this;
    }
}
