package l9;

import ah.v;
import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import java.util.Objects;
import java.util.Set;
import k9.d;

public final class a {

    /* renamed from: l9.a$a  reason: collision with other inner class name */
    public interface C0144a {
        c a();
    }

    public interface b {
        c a();
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Application f8148a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<String> f8149b;

        /* renamed from: c  reason: collision with root package name */
        public final d f8150c;

        public c(Application application, Set<String> set, d dVar) {
            this.f8148a = application;
            this.f8149b = set;
            this.f8150c = dVar;
        }

        public final w0.b a(androidx.savedstate.c cVar, Bundle bundle, w0.b bVar) {
            if (bVar == null) {
                bVar = new s0(this.f8148a, cVar, bundle);
            }
            return new b(cVar, bundle, this.f8149b, bVar, this.f8150c);
        }
    }

    public static w0.b a(ComponentActivity componentActivity, w0.b bVar) {
        c a10 = ((C0144a) v.I(componentActivity, C0144a.class)).a();
        Objects.requireNonNull(a10);
        return a10.a(componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null, bVar);
    }

    public static w0.b b(Fragment fragment, w0.b bVar) {
        c a10 = ((b) v.I(fragment, b.class)).a();
        Objects.requireNonNull(a10);
        return a10.a(fragment, fragment.getArguments(), bVar);
    }
}
