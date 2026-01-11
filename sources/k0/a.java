package k0;

import aa.b;
import android.graphics.Typeface;
import f0.f;
import g0.e;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f7348b;

    public a(b bVar, Typeface typeface) {
        this.f7347a = bVar;
        this.f7348b = typeface;
    }

    public final void run() {
        b bVar = this.f7347a;
        Typeface typeface = this.f7348b;
        f.c cVar = ((e.a) bVar).I;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}
