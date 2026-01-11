package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.Recreator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public p.b<String, b> f2606a = new p.b<>();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2607b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2608c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f2609d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2610e = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0022a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f2608c) {
            Bundle bundle = this.f2607b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2607b.remove(str);
            if (this.f2607b.isEmpty()) {
                this.f2607b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void b(String str, b bVar) {
        if (this.f2606a.g(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void c() {
        Class<SavedStateHandleController.a> cls = SavedStateHandleController.a.class;
        if (this.f2610e) {
            if (this.f2609d == null) {
                this.f2609d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.f2609d;
                aVar.f2604a.add(cls.getName());
            } catch (NoSuchMethodException e10) {
                StringBuilder d10 = a.a.d("Class");
                d10.append(cls.getSimpleName());
                d10.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(d10.toString(), e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
