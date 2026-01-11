package x8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class r0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13119a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f13120b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f13121c;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<a> f13122d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public p0 f13123e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13124f = false;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f13125a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<Void> f13126b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f13125a = intent;
        }

        public final void a() {
            this.f13126b.trySetResult(null);
        }
    }

    public r0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.f13119a = applicationContext;
        this.f13120b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f13121c = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Queue<x8.r0$a>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Queue<x8.r0$a>, java.util.ArrayDeque] */
    public final void a() {
        while (!this.f13122d.isEmpty()) {
            ((a) this.f13122d.poll()).a();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Queue<x8.r0$a>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.util.Queue<x8.r0$a>, java.util.ArrayDeque] */
    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f13122d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            p0 p0Var = this.f13123e;
            if (p0Var == null || !p0Var.isBinderAlive()) {
                c();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f13123e.a((a) this.f13122d.poll());
        }
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder d10 = a.a.d("binder is dead. start connection? ");
            d10.append(!this.f13124f);
            Log.d("FirebaseMessaging", d10.toString());
        }
        if (!this.f13124f) {
            this.f13124f = true;
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f13119a, this.f13120b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f13124f = false;
                    a();
                }
            } catch (SecurityException e10) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e10);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f13124f = false;
        if (!(iBinder instanceof p0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f13123e = (p0) iBinder;
        b();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
