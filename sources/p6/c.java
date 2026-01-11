package p6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import m3.u;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final u f9694a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f9695b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f9696c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f9697d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public b f9698e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f9699f = false;

    public c(u uVar, IntentFilter intentFilter, Context context) {
        this.f9694a = uVar;
        this.f9695b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f9696c = applicationContext != null ? applicationContext : context;
    }

    public abstract void a(Intent intent);

    public final void b() {
        b bVar;
        if ((this.f9699f || !this.f9697d.isEmpty()) && this.f9698e == null) {
            b bVar2 = new b(this);
            this.f9698e = bVar2;
            this.f9696c.registerReceiver(bVar2, this.f9695b);
        }
        if (!this.f9699f && this.f9697d.isEmpty() && (bVar = this.f9698e) != null) {
            this.f9696c.unregisterReceiver(bVar);
            this.f9698e = null;
        }
    }
}
