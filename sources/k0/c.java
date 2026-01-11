package k0;

import aa.b;
import android.os.Handler;
import k0.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f7351a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7352b;

    public c(b bVar, Handler handler) {
        this.f7351a = bVar;
        this.f7352b = handler;
    }

    public final void a(j.a aVar) {
        int i = aVar.f7374b;
        if (i == 0) {
            this.f7352b.post(new a(this.f7351a, aVar.f7373a));
            return;
        }
        this.f7352b.post(new b(this.f7351a, i));
    }
}
