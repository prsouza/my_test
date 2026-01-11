package x8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class n0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public static final Object f13096u = new Object();

    /* renamed from: v  reason: collision with root package name */
    public static Boolean f13097v;

    /* renamed from: w  reason: collision with root package name */
    public static Boolean f13098w;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13099a;

    /* renamed from: b  reason: collision with root package name */
    public final x f13100b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f13101c;

    /* renamed from: s  reason: collision with root package name */
    public final m0 f13102s;

    /* renamed from: t  reason: collision with root package name */
    public final long f13103t;

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public n0 f13104a;

        public a(n0 n0Var) {
            this.f13104a = n0Var;
        }

        public final void a() {
            if (n0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            n0.this.f13099a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final synchronized void onReceive(Context context, Intent intent) {
            n0 n0Var = this.f13104a;
            if (n0Var != null) {
                if (n0Var.e()) {
                    if (n0.a()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    n0 n0Var2 = this.f13104a;
                    n0Var2.f13102s.f13093f.schedule(n0Var2, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f13104a = null;
                }
            }
        }
    }

    public n0(m0 m0Var, Context context, x xVar, long j10) {
        this.f13102s = m0Var;
        this.f13099a = context;
        this.f13103t = j10;
        this.f13100b = xVar;
        this.f13101c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public static boolean b(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f13096u) {
            Boolean bool = f13098w;
            if (bool == null) {
                z = c(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f13098w = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean d(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f13096u) {
            Boolean bool = f13097v;
            if (bool == null) {
                z = c(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f13097v = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized boolean e() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13099a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        PowerManager.WakeLock wakeLock;
        if (d(this.f13099a)) {
            this.f13101c.acquire(f.f13038a);
        }
        try {
            this.f13102s.e(true);
            if (!this.f13100b.d()) {
                this.f13102s.e(false);
                if (d(this.f13099a)) {
                    try {
                        this.f13101c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!b(this.f13099a) || e()) {
                if (this.f13102s.g()) {
                    this.f13102s.e(false);
                } else {
                    this.f13102s.h(this.f13103t);
                }
                if (d(this.f13099a)) {
                    try {
                        wakeLock = this.f13101c;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (d(this.f13099a)) {
                    try {
                        this.f13101c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            this.f13102s.e(false);
            if (d(this.f13099a)) {
                wakeLock = this.f13101c;
            }
        } catch (Throwable th2) {
            if (d(this.f13099a)) {
                try {
                    this.f13101c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
