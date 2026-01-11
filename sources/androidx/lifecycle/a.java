package androidx.lifecycle;

import ah.v;
import android.os.Bundle;
import androidx.lifecycle.w0;
import androidx.savedstate.c;
import fb.g;
import java.util.Objects;
import l9.b;

public abstract class a extends w0.c {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.savedstate.a f2079a;

    /* renamed from: b  reason: collision with root package name */
    public final r f2080b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2081c;

    public a(c cVar, Bundle bundle) {
        this.f2079a = cVar.getSavedStateRegistry();
        this.f2080b = cVar.getLifecycle();
        this.f2081c = bundle;
    }

    public final <T extends u0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void b(u0 u0Var) {
        SavedStateHandleController.f(u0Var, this.f2079a, this.f2080b);
    }

    public final <T extends u0> T c(String str, Class<T> cls) {
        SavedStateHandleController i = SavedStateHandleController.i(this.f2079a, this.f2080b, str, this.f2081c);
        r0 r0Var = i.f2075c;
        g.h hVar = (g.h) ((b.a) this).f8154d;
        Objects.requireNonNull(hVar);
        Objects.requireNonNull(r0Var);
        cc.a aVar = ((b.C0145b) v.I(new g.i(hVar.f5070a, hVar.f5071b), b.C0145b.class)).a().get(cls.getName());
        if (aVar != null) {
            T t10 = (u0) aVar.get();
            t10.h("androidx.lifecycle.savedstate.vm.tag", i);
            return t10;
        }
        StringBuilder d10 = a.a.d("Expected the @HiltViewModel-annotated class '");
        d10.append(cls.getName());
        d10.append("' to be available in the multi-binding of @HiltViewModelMap but none was found.");
        throw new IllegalStateException(d10.toString());
    }
}
