package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import i0.a;
import i0.b;
import i0.c;
import s.g;

public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f8768d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f8768d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return c(this.f8768d.add(charSequence));
    }

    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f8768d.addIntentOptions(i, i10, i11, componentName, intentArr, intent, i12, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr2[i13] = c(menuItemArr3[i13]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f8768d.addSubMenu(charSequence));
    }

    public final void clear() {
        g<b, MenuItem> gVar = this.f8755b;
        if (gVar != null) {
            gVar.clear();
        }
        g<c, SubMenu> gVar2 = this.f8756c;
        if (gVar2 != null) {
            gVar2.clear();
        }
        this.f8768d.clear();
    }

    public final void close() {
        this.f8768d.close();
    }

    public final MenuItem findItem(int i) {
        return c(this.f8768d.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return c(this.f8768d.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f8768d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f8768d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i10) {
        return this.f8768d.performIdentifierAction(i, i10);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        return this.f8768d.performShortcut(i, keyEvent, i10);
    }

    public final void removeGroup(int i) {
        if (this.f8755b != null) {
            int i10 = 0;
            while (true) {
                g<b, MenuItem> gVar = this.f8755b;
                if (i10 >= gVar.f10843c) {
                    break;
                }
                if (gVar.i(i10).getGroupId() == i) {
                    this.f8755b.k(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f8768d.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (this.f8755b != null) {
            int i10 = 0;
            while (true) {
                g<b, MenuItem> gVar = this.f8755b;
                if (i10 >= gVar.f10843c) {
                    break;
                } else if (gVar.i(i10).getItemId() == i) {
                    this.f8755b.k(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8768d.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z10) {
        this.f8768d.setGroupCheckable(i, z, z10);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.f8768d.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.f8768d.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.f8768d.setQwertyMode(z);
    }

    public final int size() {
        return this.f8768d.size();
    }

    public final MenuItem add(int i) {
        return c(this.f8768d.add(i));
    }

    public final SubMenu addSubMenu(int i) {
        return d(this.f8768d.addSubMenu(i));
    }

    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return c(this.f8768d.add(i, i10, i11, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        return d(this.f8768d.addSubMenu(i, i10, i11, charSequence));
    }

    public final MenuItem add(int i, int i10, int i11, int i12) {
        return c(this.f8768d.add(i, i10, i11, i12));
    }

    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return d(this.f8768d.addSubMenu(i, i10, i11, i12));
    }
}
