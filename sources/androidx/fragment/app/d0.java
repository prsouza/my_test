package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.HashMap;
import java.util.Iterator;

public final class d0 extends u0 {

    /* renamed from: x  reason: collision with root package name */
    public static final a f1871x = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Fragment> f1872c = new HashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public final HashMap<String, d0> f1873s = new HashMap<>();

    /* renamed from: t  reason: collision with root package name */
    public final HashMap<String, x0> f1874t = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    public final boolean f1875u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1876v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1877w = false;

    public class a implements w0.b {
        public final <T extends u0> T a(Class<T> cls) {
            return new d0(true);
        }
    }

    public d0(boolean z) {
        this.f1875u = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f1872c.equals(d0Var.f1872c) || !this.f1873s.equals(d0Var.f1873s) || !this.f1874t.equals(d0Var.f1874t)) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (a0.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1876v = true;
    }

    public final int hashCode() {
        int hashCode = this.f1873s.hashCode();
        return this.f1874t.hashCode() + ((hashCode + (this.f1872c.hashCode() * 31)) * 31);
    }

    public final void i(Fragment fragment) {
        if (this.f1877w) {
            if (a0.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f1872c.containsKey(fragment.mWho)) {
            this.f1872c.put(fragment.mWho, fragment);
            if (a0.K(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public final void j(Fragment fragment) {
        if (a0.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k(fragment.mWho);
    }

    public final void k(String str) {
        d0 d0Var = this.f1873s.get(str);
        if (d0Var != null) {
            d0Var.f();
            this.f1873s.remove(str);
        }
        x0 x0Var = this.f1874t.get(str);
        if (x0Var != null) {
            x0Var.a();
            this.f1874t.remove(str);
        }
    }

    public final void l(Fragment fragment) {
        if (!this.f1877w) {
            if ((this.f1872c.remove(fragment.mWho) != null) && a0.K(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (a0.K(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f1872c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f1873s.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1874t.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
