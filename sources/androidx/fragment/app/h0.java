package androidx.fragment.app;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f1911a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Serializable f1912b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Serializable f1913c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Object f1914d;

    public final void a(Fragment fragment) {
        if (!((ArrayList) this.f1911a).contains(fragment)) {
            synchronized (((ArrayList) this.f1911a)) {
                ((ArrayList) this.f1911a).add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final void b() {
        ((HashMap) this.f1912b).values().removeAll(Collections.singleton((Object) null));
    }

    public final Fragment c(String str) {
        g0 g0Var = (g0) ((HashMap) this.f1912b).get(str);
        if (g0Var != null) {
            return g0Var.f1902c;
        }
        return null;
    }

    public final Fragment d(String str) {
        Fragment findFragmentByWho;
        for (g0 g0Var : ((HashMap) this.f1912b).values()) {
            if (g0Var != null && (findFragmentByWho = g0Var.f1902c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : ((HashMap) this.f1912b).values()) {
            if (g0Var != null) {
                arrayList.add(g0Var);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (g0 g0Var : ((HashMap) this.f1912b).values()) {
            if (g0Var != null) {
                arrayList.add(g0Var.f1902c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public final g0 g(String str) {
        return (g0) ((HashMap) this.f1912b).get(str);
    }

    public final List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f1911a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1911a)) {
            arrayList = new ArrayList((ArrayList) this.f1911a);
        }
        return arrayList;
    }

    public final void i(g0 g0Var) {
        Fragment fragment = g0Var.f1902c;
        if (!(((HashMap) this.f1912b).get(fragment.mWho) != null)) {
            ((HashMap) this.f1912b).put(fragment.mWho, g0Var);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    ((d0) this.f1914d).i(fragment);
                } else {
                    ((d0) this.f1914d).l(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (a0.K(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    public final void j(g0 g0Var) {
        Fragment fragment = g0Var.f1902c;
        if (fragment.mRetainInstance) {
            ((d0) this.f1914d).l(fragment);
        }
        if (((g0) ((HashMap) this.f1912b).put(fragment.mWho, (Object) null)) != null && a0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final f0 k(String str, f0 f0Var) {
        if (f0Var != null) {
            return (f0) ((HashMap) this.f1913c).put(str, f0Var);
        }
        return (f0) ((HashMap) this.f1913c).remove(str);
    }
}
