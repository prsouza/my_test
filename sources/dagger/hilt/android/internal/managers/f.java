package dagger.hilt.android.internal.managers;

import ah.v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import fb.g;
import java.util.Objects;
import k9.c;
import n9.b;

public final class f implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile g.f f4418a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4419b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f4420c;

    public interface a {
        c g();
    }

    public f(Fragment fragment) {
        this.f4420c = fragment;
    }

    public static final Context c(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final Object a() {
        if (this.f4418a == null) {
            synchronized (this.f4419b) {
                if (this.f4418a == null) {
                    this.f4418a = (g.f) b();
                }
            }
        }
        return this.f4418a;
    }

    public final Object b() {
        Objects.requireNonNull(this.f4420c.getHost(), "Hilt Fragments must be attached before creating the component.");
        aa.b.y(this.f4420c.getHost() instanceof b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f4420c.getHost().getClass());
        c g = ((a) v.I(this.f4420c.getHost(), a.class)).g();
        Fragment fragment = this.f4420c;
        g.e eVar = (g.e) g;
        Objects.requireNonNull(eVar);
        Objects.requireNonNull(fragment);
        eVar.f5066d = fragment;
        Class<Fragment> cls = Fragment.class;
        return new g.f(eVar.f5065c);
    }
}
