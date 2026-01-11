package l9;

import android.os.Bundle;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.savedstate.c;
import java.util.Map;
import java.util.Set;
import k9.d;

public final class b implements w0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f8151a;

    /* renamed from: b  reason: collision with root package name */
    public final w0.b f8152b;

    /* renamed from: c  reason: collision with root package name */
    public final a f8153c;

    public class a extends androidx.lifecycle.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f8154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, Bundle bundle, d dVar) {
            super(cVar, bundle);
            this.f8154d = dVar;
        }
    }

    /* renamed from: l9.b$b  reason: collision with other inner class name */
    public interface C0145b {
        Map<String, cc.a<u0>> a();
    }

    public b(c cVar, Bundle bundle, Set<String> set, w0.b bVar, d dVar) {
        this.f8151a = set;
        this.f8152b = bVar;
        this.f8153c = new a(cVar, bundle, dVar);
    }

    public final <T extends u0> T a(Class<T> cls) {
        if (this.f8151a.contains(cls.getName())) {
            return this.f8153c.a(cls);
        }
        return this.f8152b.a(cls);
    }
}
