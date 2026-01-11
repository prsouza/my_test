package x8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.fragment.app.m;
import java.util.Objects;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f13077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f13078b;

    public /* synthetic */ l(Context context, Intent intent) {
        this.f13077a = context;
        this.f13078b = intent;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Queue<android.content.Intent>, java.util.ArrayDeque] */
    public final Object call() {
        String str;
        int i;
        ComponentName componentName;
        Context context = this.f13077a;
        Intent intent = this.f13078b;
        g0 a10 = g0.a();
        Objects.requireNonNull(a10);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        a10.f13046d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (a10) {
            str = a10.f13043a;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            String str2 = serviceInfo.name;
                            if (str2 != null) {
                                if (str2.startsWith(".")) {
                                    a10.f13043a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    a10.f13043a = serviceInfo.name;
                                }
                                str = a10.f13043a;
                            }
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        str = null;
                    }
                }
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                m.g("Restricting intent to a specific service: ", str, "FirebaseMessaging");
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (a10.c(context)) {
                componentName = o0.a(context, intent2);
            } else {
                componentName = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i = 401;
        } catch (IllegalStateException e11) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e11);
            i = 402;
        }
        return Integer.valueOf(i);
    }
}
