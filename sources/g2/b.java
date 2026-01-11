package g2;

import android.os.Handler;
import android.os.Looper;
import e2.i;
import java.util.concurrent.Executor;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final i f5227a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5228b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final a f5229c = new a();

    public class a implements Executor {
        public a() {
        }

        public final void execute(Runnable runnable) {
            b.this.f5228b.post(runnable);
        }
    }

    public b(Executor executor) {
        this.f5227a = new i(executor);
    }

    public final void a(Runnable runnable) {
        this.f5227a.execute(runnable);
    }
}
