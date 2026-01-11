package k0;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class n<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Callable<T> f7385a;

    /* renamed from: b  reason: collision with root package name */
    public m0.a<T> f7386b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f7387c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m0.a f7388a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f7389b;

        public a(m0.a aVar, Object obj) {
            this.f7388a = aVar;
            this.f7389b = obj;
        }

        public final void run() {
            this.f7388a.a(this.f7389b);
        }
    }

    public n(Handler handler, Callable<T> callable, m0.a<T> aVar) {
        this.f7385a = callable;
        this.f7386b = aVar;
        this.f7387c = handler;
    }

    public final void run() {
        T t10;
        try {
            t10 = this.f7385a.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f7387c.post(new a(this.f7386b, t10));
    }
}
