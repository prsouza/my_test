package x8;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d8.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x8.p0;

public abstract class j extends Service {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f13062u = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13063a;

    /* renamed from: b  reason: collision with root package name */
    public p0 f13064b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f13065c = new Object();

    /* renamed from: s  reason: collision with root package name */
    public int f13066s;

    /* renamed from: t  reason: collision with root package name */
    public int f13067t = 0;

    public class a implements p0.a {
        public a() {
        }
    }

    public j() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("Firebase-Messaging-Intent-Handle");
        z8.a aVar = z8.a.HIGH_SPEED;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13063a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public final void a(Intent intent) {
        if (intent != null) {
            synchronized (o0.f13110b) {
                if (o0.f13111c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    o0.f13111c.release();
                }
            }
        }
        synchronized (this.f13065c) {
            int i = this.f13067t - 1;
            this.f13067t = i;
            if (i == 0) {
                stopSelfResult(this.f13066s);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f13064b == null) {
            this.f13064b = new p0(new a());
        }
        return this.f13064b;
    }

    public final void onDestroy() {
        this.f13063a.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i10) {
        synchronized (this.f13065c) {
            this.f13066s = i10;
            this.f13067t++;
        }
        Intent b10 = b(intent);
        if (b10 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f13063a.execute(new h(this, b10, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener((Executor) i.f13055b, new b(this, intent));
        return 3;
    }
}
