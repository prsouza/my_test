package o2;

import android.content.Context;
import java.util.concurrent.Callable;

public final class i implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f9218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9220c;

    public i(Context context, String str, String str2) {
        this.f9218a = context;
        this.f9219b = str;
        this.f9220c = str2;
    }

    public final Object call() throws Exception {
        return g.b(this.f9218a, this.f9219b, this.f9220c);
    }
}
