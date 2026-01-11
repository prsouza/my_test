package o2;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class j implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f9221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f9222b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9223c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f9224d;

    public j(WeakReference weakReference, Context context, int i, String str) {
        this.f9221a = weakReference;
        this.f9222b = context;
        this.f9223c = i;
        this.f9224d = str;
    }

    public final Object call() throws Exception {
        Context context = (Context) this.f9221a.get();
        if (context == null) {
            context = this.f9222b;
        }
        return g.e(context, this.f9223c, this.f9224d);
    }
}
