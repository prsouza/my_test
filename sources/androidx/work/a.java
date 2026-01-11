package androidx.work;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l6.a2;
import u1.k;
import u1.x;
import u1.y;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f2642a = ((ExecutorService) a(false));

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f2643b = ((ExecutorService) a(true));

    /* renamed from: c  reason: collision with root package name */
    public final x f2644c;

    /* renamed from: d  reason: collision with root package name */
    public final k f2645d;

    /* renamed from: e  reason: collision with root package name */
    public final a2 f2646e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2647f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2648h;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    public static final class C0024a {
    }

    public interface b {
        a a();
    }

    public a(C0024a aVar) {
        String str = y.f11662a;
        this.f2644c = new x();
        this.f2645d = new k();
        this.f2646e = new a2(0);
        this.f2647f = 4;
        this.g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2648h = 20;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new u1.b(z));
    }
}
