package d9;

import android.content.Context;
import e9.b;
import xd.l;
import yd.h;

public final class e extends h implements l<Context, Context> {

    /* renamed from: b  reason: collision with root package name */
    public static final e f4376b = new e();

    public e() {
        super(1);
    }

    public final Object k(Object obj) {
        Context context = (Context) obj;
        e6.e.D(context, "context");
        f fVar = f.f4380d;
        return context instanceof b ? context : new b(context);
    }
}
