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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final long f13058a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f13059b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f13060c;

    @VisibleForTesting
    public static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public i0 f13061a;

        public a(i0 i0Var) {
            this.f13061a = i0Var;
        }

        public final void a() {
            if (i0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f13061a.f13060c.f4208d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public final void onReceive(Context context, Intent intent) {
            i0 i0Var = this.f13061a;
            if (i0Var != null && i0Var.b()) {
                if (i0.a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                i0 i0Var2 = this.f13061a;
                i0Var2.f13060c.b(i0Var2, 0);
                this.f13061a.f13060c.f4208d.unregisterReceiver(this);
                this.f13061a = null;
            }
        }
    }

    @VisibleForTesting
    public i0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f13060c = firebaseMessaging;
        this.f13058a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.f4208d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f13059b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f13060c.f4208d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public final boolean c() throws IOException {
        boolean z = true;
        try {
            if (this.f13060c.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                StringBuilder d10 = a.a.d("Token retrieval failed: ");
                d10.append(e10.getMessage());
                d10.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", d10.toString());
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public final void run() {
        if (g0.a().c(this.f13060c.f4208d)) {
            this.f13059b.acquire();
        }
        try {
            this.f13060c.f(true);
            if (!this.f13060c.i.d()) {
                this.f13060c.f(false);
                if (g0.a().c(this.f13060c.f4208d)) {
                    this.f13059b.release();
                }
            } else if (!g0.a().b(this.f13060c.f4208d) || b()) {
                if (c()) {
                    this.f13060c.f(false);
                } else {
                    this.f13060c.h(this.f13058a);
                }
                if (!g0.a().c(this.f13060c.f4208d)) {
                    return;
                }
                this.f13059b.release();
            } else {
                new a(this).a();
                if (g0.a().c(this.f13060c.f4208d)) {
                    this.f13059b.release();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f13060c.f(false);
            if (!g0.a().c(this.f13060c.f4208d)) {
            }
        } catch (Throwable th2) {
            if (g0.a().c(this.f13060c.f4208d)) {
                this.f13059b.release();
            }
            throw th2;
        }
    }
}
