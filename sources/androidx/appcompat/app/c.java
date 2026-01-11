package androidx.appcompat.app;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.j1;
import androidx.fragment.app.r;
import c0.h;
import d0.a;
import h.a;
import h.d;
import h.e;
import h.f;
import h.g;
import h.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c extends r implements e {

    /* renamed from: a  reason: collision with root package name */
    public g f863a;

    public c() {
        getSavedStateRegistry().b("androidx:appcompat", new h.c(this));
        addOnContextAvailableListener(new d(this));
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        h().d(view, layoutParams);
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(h().e(context));
    }

    public final void b() {
    }

    public final void closeOptionsMenu() {
        a i = i();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final void d() {
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a i = i();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
    }

    public final <T extends View> T findViewById(int i) {
        return h().g(i);
    }

    public final MenuInflater getMenuInflater() {
        return h().i();
    }

    public final Resources getResources() {
        int i = j1.f1294a;
        return super.getResources();
    }

    public f h() {
        if (this.f863a == null) {
            s.c<WeakReference<f>> cVar = f.f5524a;
            this.f863a = new g(this, (Window) null, this, this);
        }
        return this.f863a;
    }

    public final a i() {
        return h().j();
    }

    public final void initViewTreeOwners() {
        b.C0(getWindow().getDecorView(), this);
        ad.c.p0(getWindow().getDecorView(), this);
        ad.c.q0(getWindow().getDecorView(), this);
    }

    public final void invalidateOptionsMenu() {
        h().l();
    }

    public final Intent j() {
        return h.a(this);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h().m(configuration);
    }

    public final void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        h().o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = r2
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a i10 = i();
        if (menuItem.getItemId() != 16908332 || i10 == null || (((v) i10).f5625e.n() & 4) == 0) {
            return false;
        }
        Intent a10 = h.a(this);
        if (a10 == null) {
            return false;
        }
        if (shouldUpRecreateTask(a10)) {
            ArrayList arrayList = new ArrayList();
            Intent j10 = j();
            if (j10 == null) {
                j10 = h.a(this);
            }
            if (j10 != null) {
                ComponentName component = j10.getComponent();
                if (component == null) {
                    component = j10.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b10 = h.b(this, component);
                    while (b10 != null) {
                        arrayList.add(size, b10);
                        b10 = h.b(this, b10.getComponent());
                    }
                    arrayList.add(j10);
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e10);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = d0.a.f4256a;
                a.C0057a.a(this, intentArr, (Bundle) null);
                try {
                    int i11 = c0.b.f3053c;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a10);
            return true;
        }
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        h().p(bundle);
    }

    public final void onPostResume() {
        super.onPostResume();
        h().q();
    }

    public void onStart() {
        super.onStart();
        h().s();
    }

    public final void onStop() {
        super.onStop();
        h().t();
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().B(charSequence);
    }

    public final void openOptionsMenu() {
        h.a i = i();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i) {
        initViewTreeOwners();
        h().x(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        h().A(i);
    }

    public final void supportInvalidateOptionsMenu() {
        h().l();
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        h().y(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        h().z(view, layoutParams);
    }
}
