package x8;

import a9.g;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import k7.d;
import p8.j;
import r8.b;
import s8.f;
import z4.q;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final d f13130a;

    /* renamed from: b  reason: collision with root package name */
    public final x f13131b;

    /* renamed from: c  reason: collision with root package name */
    public final Rpc f13132c;

    /* renamed from: d  reason: collision with root package name */
    public final b<g> f13133d;

    /* renamed from: e  reason: collision with root package name */
    public final b<j> f13134e;

    /* renamed from: f  reason: collision with root package name */
    public final f f13135f;

    public t(d dVar, x xVar, b<g> bVar, b<j> bVar2, f fVar) {
        dVar.a();
        Rpc rpc = new Rpc(dVar.f7453a);
        this.f13130a = dVar;
        this.f13131b = xVar;
        this.f13132c = rpc;
        this.f13133d = bVar;
        this.f13134e = bVar2;
        this.f13135f = fVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(i.f13056c, new q(this));
    }

    public final void b(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i;
        String str3;
        String str4;
        j.a b10;
        PackageInfo c10;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        d dVar = this.f13130a;
        dVar.a();
        bundle.putString("gmp_app_id", dVar.f7455c.f7466b);
        x xVar = this.f13131b;
        synchronized (xVar) {
            if (xVar.f13144d == 0 && (c10 = xVar.c("com.google.android.gms")) != null) {
                xVar.f13144d = c10.versionCode;
            }
            i = xVar.f13144d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f13131b.a());
        x xVar2 = this.f13131b;
        synchronized (xVar2) {
            if (xVar2.f13143c == null) {
                xVar2.e();
            }
            str3 = xVar2.f13143c;
        }
        bundle.putString("app_ver_name", str3);
        d dVar2 = this.f13130a;
        dVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dVar2.f7454b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String a10 = ((s8.j) Tasks.await(this.f13135f.a())).a();
            if (!TextUtils.isEmpty(a10)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f13135f.getId()));
        bundle.putString("cliv", "fcm-23.0.4");
        j jVar = this.f13134e.get();
        g gVar = this.f13133d.get();
        if (jVar != null && gVar != null && (b10 = jVar.b()) != j.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b10.getCode()));
            bundle.putString("Firebase-Client", gVar.a());
        }
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f13132c.send(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
