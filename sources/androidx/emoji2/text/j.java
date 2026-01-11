package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import c3.k;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import k0.e;
import k0.l;

public final class j extends d.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1740d = new a();

    public static class a {
    }

    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1741a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1742b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1743c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1744d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1745e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1746f;
        public ThreadPoolExecutor g;

        /* renamed from: h  reason: collision with root package name */
        public d.h f1747h;
        public m i;

        /* renamed from: j  reason: collision with root package name */
        public k f1748j;

        public b(Context context, e eVar) {
            a aVar = j.f1740d;
            k.S(context, "Context cannot be null");
            this.f1741a = context.getApplicationContext();
            this.f1742b = eVar;
            this.f1743c = aVar;
        }

        public final void a(d.h hVar) {
            synchronized (this.f1744d) {
                this.f1747h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1744d) {
                this.f1747h = null;
                m mVar = this.i;
                if (mVar != null) {
                    a aVar = this.f1743c;
                    Context context = this.f1741a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(mVar);
                    this.i = null;
                }
                Handler handler = this.f1745e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1748j);
                }
                this.f1745e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1746f = null;
                this.g = null;
            }
        }

        public final void c() {
            synchronized (this.f1744d) {
                if (this.f1747h != null) {
                    if (this.f1746f == null) {
                        ThreadPoolExecutor a10 = b.a("emojiCompat");
                        this.g = a10;
                        this.f1746f = a10;
                    }
                    this.f1746f.execute(new l(this, 0));
                }
            }
        }

        public final l d() {
            try {
                a aVar = this.f1743c;
                Context context = this.f1741a;
                e eVar = this.f1742b;
                Objects.requireNonNull(aVar);
                k0.k a10 = k0.d.a(context, eVar);
                if (a10.f7375a == 0) {
                    l[] lVarArr = a10.f7376b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(androidx.activity.result.d.c(a.a.d("fetchFonts failed ("), a10.f7375a, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public j(Context context, e eVar) {
        super(new b(context, eVar));
    }
}
