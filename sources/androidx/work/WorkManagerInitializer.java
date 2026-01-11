package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import n1.b;
import u1.p;
import v1.j;

public final class WorkManagerInitializer implements b<android.support.v4.media.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2631a = p.e("WrkMgrInitializer");

    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        p.c().a(f2631a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        j.t2(context, new a(new a.C0024a()));
        return j.s2(context);
    }
}
