package k0;

import android.content.Context;
import java.util.concurrent.Callable;
import k0.j;

public final class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7360b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f7361c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7362d;

    public f(String str, Context context, e eVar, int i) {
        this.f7359a = str;
        this.f7360b = context;
        this.f7361c = eVar;
        this.f7362d = i;
    }

    public final Object call() throws Exception {
        return j.b(this.f7359a, this.f7360b, this.f7361c, this.f7362d);
    }
}
