package k0;

import android.content.Context;
import java.util.concurrent.Callable;
import k0.j;

public final class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f7366c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7367d;

    public h(String str, Context context, e eVar, int i) {
        this.f7364a = str;
        this.f7365b = context;
        this.f7366c = eVar;
        this.f7367d = i;
    }

    public final Object call() throws Exception {
        try {
            return j.b(this.f7364a, this.f7365b, this.f7366c, this.f7367d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
