package x8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class l0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f13080b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13081c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f13082d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f13083e;

    public /* synthetic */ l0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, x xVar, t tVar) {
        this.f13079a = context;
        this.f13080b = scheduledExecutorService;
        this.f13081c = firebaseMessaging;
        this.f13082d = xVar;
        this.f13083e = tVar;
    }

    public final Object call() {
        k0 k0Var;
        Context context = this.f13079a;
        ScheduledExecutorService scheduledExecutorService = this.f13080b;
        FirebaseMessaging firebaseMessaging = this.f13081c;
        x xVar = this.f13082d;
        t tVar = this.f13083e;
        synchronized (k0.class) {
            WeakReference<k0> weakReference = k0.f13075b;
            k0Var = weakReference != null ? weakReference.get() : null;
            if (k0Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                k0 k0Var2 = new k0(sharedPreferences, scheduledExecutorService);
                synchronized (k0Var2) {
                    k0Var2.f13076a = h0.b(sharedPreferences, scheduledExecutorService);
                }
                k0.f13075b = new WeakReference<>(k0Var2);
                k0Var = k0Var2;
            }
        }
        return new m0(firebaseMessaging, xVar, k0Var, tVar, context, scheduledExecutorService);
    }
}
