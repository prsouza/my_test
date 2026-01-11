package x8;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.emoji2.text.k;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import x8.r0;

@KeepForSdk
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13084b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static r0 f13085c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13086a;

    public m(Context context) {
        this.f13086a = context;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.Queue<x8.r0$a>, java.util.ArrayDeque] */
    public static Task<Integer> a(Context context, Intent intent) {
        r0 r0Var;
        Task<Void> task;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f13084b) {
            if (f13085c == null) {
                f13085c = new r0(context);
            }
            r0Var = f13085c;
        }
        synchronized (r0Var) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            r0.a aVar = new r0.a(intent);
            ScheduledExecutorService scheduledExecutorService = r0Var.f13121c;
            aVar.f13126b.getTask().addOnCompleteListener((Executor) scheduledExecutorService, new q0(scheduledExecutorService.schedule(new k(aVar, 2), 9000, TimeUnit.MILLISECONDS), 0));
            r0Var.f13122d.add(aVar);
            r0Var.b();
            task = aVar.f13126b.getTask();
        }
        return task.continueWith(i.f13055b, d.f5669c);
    }

    @KeepForSdk
    public final Task<Integer> b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f13086a;
        boolean z10 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (z10 && !z) {
            return a(context, intent);
        }
        c9.d dVar = c9.d.f3279a;
        return Tasks.call(dVar, new l(context, intent)).continueWithTask(dVar, new k(context, intent));
    }
}
