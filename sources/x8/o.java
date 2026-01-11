package x8;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import k7.d;

public final /* synthetic */ class o implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13107b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.C0052a f13108c;

    public /* synthetic */ o(FirebaseMessaging firebaseMessaging, String str, a.C0052a aVar) {
        this.f13106a = firebaseMessaging;
        this.f13107b = str;
        this.f13108c = aVar;
    }

    public final Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f13106a;
        String str = this.f13107b;
        a.C0052a aVar = this.f13108c;
        String str2 = (String) obj;
        a c10 = FirebaseMessaging.c(firebaseMessaging.f4208d);
        String d10 = firebaseMessaging.d();
        String a10 = firebaseMessaging.i.a();
        synchronized (c10) {
            String a11 = a.C0052a.a(str2, a10, System.currentTimeMillis());
            if (a11 != null) {
                SharedPreferences.Editor edit = c10.f4220a.edit();
                edit.putString(c10.a(d10, str), a11);
                edit.commit();
            }
        }
        if (aVar == null || !str2.equals(aVar.f4222a)) {
            d dVar = firebaseMessaging.f4205a;
            dVar.a();
            if ("[DEFAULT]".equals(dVar.f7454b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder d11 = a.a.d("Invoking onNewToken for app: ");
                    d dVar2 = firebaseMessaging.f4205a;
                    dVar2.a();
                    d11.append(dVar2.f7454b);
                    Log.d("FirebaseMessaging", d11.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new m(firebaseMessaging.f4208d).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
