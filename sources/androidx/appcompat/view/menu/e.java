package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d0.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.z;

public class e implements i0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f922y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f923a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f924b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f925c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f926d;

    /* renamed from: e  reason: collision with root package name */
    public a f927e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f928f;
    public ArrayList<g> g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f929h;
    public ArrayList<g> i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f930j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f931k;

    /* renamed from: l  reason: collision with root package name */
    public int f932l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f933m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f934n;

    /* renamed from: o  reason: collision with root package name */
    public View f935o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f936p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f937q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f938r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f939s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f940t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f941u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public g f942v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f943w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f944x;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        boolean z = false;
        this.f923a = context;
        Resources resources = context.getResources();
        this.f924b = resources;
        this.f928f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.f929h = true;
        this.i = new ArrayList<>();
        this.f930j = new ArrayList<>();
        this.f931k = true;
        if (resources.getConfiguration().keyboard != 1 && z.e(ViewConfiguration.get(context), context)) {
            z = true;
        }
        this.f926d = z;
    }

    public final void A() {
        this.f936p = false;
        if (this.f937q) {
            this.f937q = false;
            r(this.f938r);
        }
    }

    public final void B() {
        if (!this.f936p) {
            this.f936p = true;
            this.f937q = false;
            this.f938r = false;
        }
    }

    public final MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = (-65536 & i12) >> 16;
        if (i14 >= 0) {
            int[] iArr = f922y;
            if (i14 < 6) {
                int i15 = (iArr[i14] << 16) | (65535 & i12);
                g gVar = new g(this, i10, i11, i12, i15, charSequence, this.f932l);
                ArrayList<g> arrayList = this.f928f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f951d <= i15) {
                            i13 = size + 1;
                            break;
                        }
                    } else {
                        i13 = 0;
                        break;
                    }
                }
                arrayList.add(i13, gVar);
                r(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f923a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(i iVar) {
        c(iVar, this.f923a);
    }

    public final void c(i iVar, Context context) {
        this.f941u.add(new WeakReference(iVar));
        iVar.e(context, this);
        this.f931k = true;
    }

    public final void clear() {
        g gVar = this.f942v;
        if (gVar != null) {
            e(gVar);
        }
        this.f928f.clear();
        r(true);
    }

    public final void clearHeader() {
        this.f934n = null;
        this.f933m = null;
        this.f935o = null;
        r(false);
    }

    public final void close() {
        d(true);
    }

    public final void d(boolean z) {
        if (!this.f939s) {
            this.f939s = true;
            Iterator<WeakReference<i>> it = this.f941u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f941u.remove(next);
                } else {
                    iVar.a(this, z);
                }
            }
            this.f939s = false;
        }
    }

    public boolean e(g gVar) {
        boolean z = false;
        if (!this.f941u.isEmpty() && this.f942v == gVar) {
            B();
            Iterator<WeakReference<i>> it = this.f941u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f941u.remove(next);
                } else {
                    z = iVar.c(gVar);
                    if (z) {
                        break;
                    }
                }
            }
            A();
            if (z) {
                this.f942v = null;
            }
        }
        return z;
    }

    public boolean f(e eVar, MenuItem menuItem) {
        a aVar = this.f927e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f928f.get(i11);
            if (gVar.f948a == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f960o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(g gVar) {
        boolean z = false;
        if (this.f941u.isEmpty()) {
            return false;
        }
        B();
        Iterator<WeakReference<i>> it = this.f941u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar = (i) next.get();
            if (iVar == null) {
                this.f941u.remove(next);
            } else {
                z = iVar.k(gVar);
                if (z) {
                    break;
                }
            }
        }
        A();
        if (z) {
            this.f942v = gVar;
        }
        return z;
    }

    public final MenuItem getItem(int i10) {
        return this.f928f.get(i10);
    }

    public final g h(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList<g> arrayList = this.f940t;
        arrayList.clear();
        i(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean o4 = o();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            if (o4) {
                c10 = gVar.f955j;
            } else {
                c10 = gVar.f954h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (o4 && c10 == 8 && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public final boolean hasVisibleItems() {
        if (this.f944x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f928f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(List<g> list, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean o4 = o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f928f.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = this.f928f.get(i12);
                if (gVar.hasSubMenu()) {
                    gVar.f960o.i(list, i10, keyEvent);
                }
                if (o4) {
                    c10 = gVar.f955j;
                } else {
                    c10 = gVar.f954h;
                }
                if (o4) {
                    i11 = gVar.f956k;
                } else {
                    i11 = gVar.i;
                }
                if (((modifiers & 69647) == (i11 & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (o4 && c10 == 8 && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return h(i10, keyEvent) != null;
    }

    public final void j() {
        ArrayList<g> m10 = m();
        if (this.f931k) {
            Iterator<WeakReference<i>> it = this.f941u.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f941u.remove(next);
                } else {
                    z |= iVar.i();
                }
            }
            if (z) {
                this.i.clear();
                this.f930j.clear();
                int size = m10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = m10.get(i10);
                    if (gVar.g()) {
                        this.i.add(gVar);
                    } else {
                        this.f930j.add(gVar);
                    }
                }
            } else {
                this.i.clear();
                this.f930j.clear();
                this.f930j.addAll(m());
            }
            this.f931k = false;
        }
    }

    public String k() {
        return "android:menu:actionviewstates";
    }

    public e l() {
        return this;
    }

    public final ArrayList<g> m() {
        if (!this.f929h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f928f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f928f.get(i10);
            if (gVar.isVisible()) {
                this.g.add(gVar);
            }
        }
        this.f929h = false;
        this.f931k = true;
        return this.g;
    }

    public boolean n() {
        return this.f943w;
    }

    public boolean o() {
        return this.f925c;
    }

    public boolean p() {
        return this.f926d;
    }

    public final boolean performIdentifierAction(int i10, int i11) {
        return t(findItem(i10), (i) null, i11);
    }

    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g h10 = h(i10, keyEvent);
        boolean t10 = h10 != null ? t(h10, (i) null, i11) : false;
        if ((i11 & 2) != 0) {
            d(true);
        }
        return t10;
    }

    public final void q() {
        this.f931k = true;
        r(true);
    }

    public final void r(boolean z) {
        if (!this.f936p) {
            if (z) {
                this.f929h = true;
                this.f931k = true;
            }
            if (!this.f941u.isEmpty()) {
                B();
                Iterator<WeakReference<i>> it = this.f941u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    i iVar = (i) next.get();
                    if (iVar == null) {
                        this.f941u.remove(next);
                    } else {
                        iVar.f();
                    }
                }
                A();
                return;
            }
            return;
        }
        this.f937q = true;
        if (z) {
            this.f938r = true;
        }
    }

    public final void removeGroup(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f928f.get(i11).f949b == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = this.f928f.size() - i11;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size2 || this.f928f.get(i11).f949b != i10) {
                    r(true);
                } else {
                    u(i11, false);
                    i12 = i13;
                }
            }
            r(true);
        }
    }

    public final void removeItem(int i10) {
        int size = size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (this.f928f.get(i11).f948a == i10) {
                break;
            } else {
                i11++;
            }
        }
        u(i11, true);
    }

    public final boolean s(MenuItem menuItem, int i10) {
        return t(menuItem, (i) null, i10);
    }

    public final void setGroupCheckable(int i10, boolean z, boolean z10) {
        int size = this.f928f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f928f.get(i11);
            if (gVar.f949b == i10) {
                gVar.f969x = (gVar.f969x & -5) | (z10 ? 4 : 0);
                gVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f943w = z;
    }

    public final void setGroupEnabled(int i10, boolean z) {
        int size = this.f928f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f928f.get(i11);
            if (gVar.f949b == i10) {
                gVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i10, boolean z) {
        int size = this.f928f.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f928f.get(i11);
            if (gVar.f949b == i10) {
                int i12 = gVar.f969x;
                int i13 = (i12 & -9) | (z ? 0 : 8);
                gVar.f969x = i13;
                if (i12 != i13) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            r(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f925c = z;
        r(false);
    }

    public final int size() {
        return this.f928f.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d2
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f961p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            androidx.appcompat.view.menu.e r1 = r7.f959n
            boolean r1 = r1.f(r1, r7)
            if (r1 == 0) goto L_0x0023
        L_0x0021:
            r1 = r2
            goto L_0x0043
        L_0x0023:
            android.content.Intent r1 = r7.g
            if (r1 == 0) goto L_0x0037
            androidx.appcompat.view.menu.e r3 = r7.f959n     // Catch:{ ActivityNotFoundException -> 0x002f }
            android.content.Context r3 = r3.f923a     // Catch:{ ActivityNotFoundException -> 0x002f }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002f }
            goto L_0x0021
        L_0x002f:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0037:
            n0.b r1 = r7.A
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0042
            goto L_0x0021
        L_0x0042:
            r1 = r0
        L_0x0043:
            n0.b r3 = r7.A
            if (r3 == 0) goto L_0x004f
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004f
            r4 = r2
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            boolean r5 = r7.f()
            if (r5 == 0) goto L_0x0062
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d1
            r6.d(r2)
            goto L_0x00d1
        L_0x0062:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d1
            r6.d(r2)
            goto L_0x00d1
        L_0x0073:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007a
            r6.d(r0)
        L_0x007a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008e
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f923a
            r9.<init>(r5, r6, r7)
            r7.f960o = r9
            java.lang.CharSequence r5 = r7.f952e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x008e:
            androidx.appcompat.view.menu.l r7 = r7.f960o
            if (r4 == 0) goto L_0x0095
            r3.f(r7)
        L_0x0095:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f941u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x009e
            goto L_0x00cb
        L_0x009e:
            if (r8 == 0) goto L_0x00a4
            boolean r0 = r8.h(r7)
        L_0x00a4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f941u
            java.util.Iterator r8 = r8.iterator()
        L_0x00aa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto L_0x00c4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f941u
            r3.remove(r9)
            goto L_0x00aa
        L_0x00c4:
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r3.h(r7)
            goto L_0x00aa
        L_0x00cb:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d1
            r6.d(r2)
        L_0x00d1:
            return r1
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.t(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public final void u(int i10, boolean z) {
        if (i10 >= 0 && i10 < this.f928f.size()) {
            this.f928f.remove(i10);
            if (z) {
                r(true);
            }
        }
    }

    public final void v(i iVar) {
        Iterator<WeakReference<i>> it = this.f941u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar2 = (i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f941u.remove(next);
            }
        }
    }

    public final void w(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(k());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((l) item.getSubMenu()).w(bundle);
                }
            }
            int i11 = bundle.getInt("android:menu:expandedactionview");
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void x(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).x(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(k(), sparseArray);
        }
    }

    public void y(a aVar) {
        this.f927e = aVar;
    }

    public final void z(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = this.f924b;
        if (view != null) {
            this.f935o = view;
            this.f933m = null;
            this.f934n = null;
        } else {
            if (i10 > 0) {
                this.f933m = resources.getText(i10);
            } else if (charSequence != null) {
                this.f933m = charSequence;
            }
            if (i11 > 0) {
                Context context = this.f923a;
                Object obj = d0.a.f4256a;
                this.f934n = a.b.b(context, i11);
            } else if (drawable != null) {
                this.f934n = drawable;
            }
            this.f935o = null;
        }
        r(false);
    }

    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f924b.getString(i10));
    }

    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f924b.getString(i10));
    }

    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        l lVar = new l(this.f923a, this, gVar);
        gVar.f960o = lVar;
        lVar.setHeaderTitle(gVar.f952e);
        return lVar;
    }

    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f924b.getString(i13));
    }

    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f924b.getString(i13));
    }
}
