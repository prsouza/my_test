package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.d0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import g2.b;
import java.util.Objects;
import java.util.UUID;
import u1.p;
import v1.j;

public class SystemForegroundService extends d0 implements a.C0027a {

    /* renamed from: u  reason: collision with root package name */
    public static final String f2719u = p.e("SystemFgService");

    /* renamed from: b  reason: collision with root package name */
    public Handler f2720b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2721c;

    /* renamed from: s  reason: collision with root package name */
    public a f2722s;

    /* renamed from: t  reason: collision with root package name */
    public NotificationManager f2723t;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2724a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Notification f2725b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2726c;

        public a(int i, Notification notification, int i10) {
            this.f2724a = i;
            this.f2725b = notification;
            this.f2726c = i10;
        }

        public final void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f2724a, this.f2725b, this.f2726c);
            } else {
                SystemForegroundService.this.startForeground(this.f2724a, this.f2725b);
            }
        }
    }

    public final void a() {
        this.f2720b = new Handler(Looper.getMainLooper());
        this.f2723t = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f2722s = aVar;
        if (aVar.f2737y != null) {
            p.c().b(a.z, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.f2737y = this;
        }
    }

    public final void b(int i, int i10, Notification notification) {
        this.f2720b.post(new a(i, notification, i10));
    }

    public final void onCreate() {
        super.onCreate();
        a();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f2722s.g();
    }

    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        if (this.f2721c) {
            p.c().d(f2719u, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f2722s.g();
            a();
            this.f2721c = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f2722s;
        Objects.requireNonNull(aVar);
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            p.c().d(a.z, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = aVar.f2729b.f12152x;
            ((b) aVar.f2730c).a(new c2.b(aVar, workDatabase, stringExtra));
            aVar.f(intent);
            return 3;
        } else if ("ACTION_NOTIFY".equals(action)) {
            aVar.f(intent);
            return 3;
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            p.c().d(a.z, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            j jVar = aVar.f2729b;
            UUID fromString = UUID.fromString(stringExtra2);
            Objects.requireNonNull(jVar);
            ((b) jVar.f12153y).a(new e2.a(jVar, fromString));
            return 3;
        } else if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        } else {
            p.c().d(a.z, "Stopping foreground service", new Throwable[0]);
            a.C0027a aVar2 = aVar.f2737y;
            if (aVar2 == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) aVar2;
            systemForegroundService.f2721c = true;
            p.c().a(f2719u, "All commands completed.", new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
    }
}
