package f0;

import android.graphics.Typeface;
import f0.f;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Typeface f4894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.c f4895b;

    public g(f.c cVar, Typeface typeface) {
        this.f4895b = cVar;
        this.f4894a = typeface;
    }

    public final void run() {
        this.f4895b.e(this.f4894a);
    }
}
