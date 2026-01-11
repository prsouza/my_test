package dagger.hilt.android.internal.managers;

import ah.v;
import android.content.Context;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import dagger.hilt.android.internal.managers.c;
import fb.g;

public final class b implements w0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f4409a;

    public b(Context context) {
        this.f4409a = context;
    }

    public final <T extends u0> T a(Class<T> cls) {
        return new c.b(new g.d(((g.c) ((c.a) v.I(y.c.z(this.f4409a.getApplicationContext()), c.a.class)).b()).f5059a));
    }
}
