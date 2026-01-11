package androidx.savedstate;

import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class Recreator implements y {

    /* renamed from: a  reason: collision with root package name */
    public final c f2603a;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f2604a = new HashSet();

        public a(a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f2604a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f2603a = cVar;
    }

    public final void c(a0 a0Var, r.b bVar) {
        if (bVar == r.b.ON_CREATE) {
            a0Var.getLifecycle().c(this);
            Bundle a10 = this.f2603a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a10 != null) {
                ArrayList<String> stringArrayList = a10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0022a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0022a) declaredConstructor.newInstance(new Object[0])).a(this.f2603a);
                                } catch (Exception e10) {
                                    throw new RuntimeException(a8.a.c("Failed to instantiate ", next), e10);
                                }
                            } catch (NoSuchMethodException e11) {
                                StringBuilder d10 = a.a.d("Class");
                                d10.append(asSubclass.getSimpleName());
                                d10.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(d10.toString(), e11);
                            }
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(o.c("Class ", next, " wasn't found"), e12);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
