package p8;

import android.content.Context;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j0.j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p8.j;
import r8.b;

public final class g implements i, j {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f9719f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final b<k> f9720a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9721b;

    /* renamed from: c  reason: collision with root package name */
    public final b<a9.g> f9722c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<h> f9723d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f9724e;

    public g(Context context, String str, Set<h> set, b<a9.g> bVar) {
        e eVar = new e(context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), d.f9715a);
        this.f9720a = eVar;
        this.f9723d = set;
        this.f9724e = threadPoolExecutor;
        this.f9722c = bVar;
        this.f9721b = context;
    }

    public final Task<String> a() {
        if (!j.a(this.f9721b)) {
            return Tasks.forResult(BuildConfig.FLAVOR);
        }
        return Tasks.call(this.f9724e, new c(this));
    }

    public final synchronized j.a b() {
        boolean g;
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f9720a.get();
        synchronized (kVar) {
            g = kVar.g(currentTimeMillis);
        }
        if (g) {
            synchronized (kVar) {
                String d10 = kVar.d(System.currentTimeMillis());
                kVar.f9725a.edit().putString("last-used-date", d10).commit();
                kVar.f(d10);
            }
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public final Task<Void> c() {
        if (this.f9723d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!j0.j.a(this.f9721b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f9724e, new b(this));
    }
}
