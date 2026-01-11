package x8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import k7.d;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13141a;

    /* renamed from: b  reason: collision with root package name */
    public String f13142b;

    /* renamed from: c  reason: collision with root package name */
    public String f13143c;

    /* renamed from: d  reason: collision with root package name */
    public int f13144d;

    /* renamed from: e  reason: collision with root package name */
    public int f13145e = 0;

    public x(Context context) {
        this.f13141a = context;
    }

    public static String b(d dVar) {
        dVar.a();
        String str = dVar.f7455c.f7469e;
        if (str != null) {
            return str;
        }
        dVar.a();
        String str2 = dVar.f7455c.f7466b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        if (this.f13142b == null) {
            e();
        }
        return this.f13142b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f13141a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    public final boolean d() {
        int i;
        synchronized (this) {
            i = this.f13145e;
            if (i == 0) {
                PackageManager packageManager = this.f13141a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f13145e = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (PlatformVersion.isAtLeastO()) {
                            this.f13145e = 2;
                        } else {
                            this.f13145e = 1;
                        }
                        i = this.f13145e;
                    } else {
                        this.f13145e = 2;
                        i = 2;
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final synchronized void e() {
        PackageInfo c10 = c(this.f13141a.getPackageName());
        if (c10 != null) {
            this.f13142b = Integer.toString(c10.versionCode);
            this.f13143c = c10.versionName;
        }
    }
}
