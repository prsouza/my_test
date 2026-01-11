package b2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import u1.p;

public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f2825h = p.e("BrdcstRcvrCnstrntTrckr");
    public final a g = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.g(intent);
            }
        }
    }

    public c(Context context, g2.a aVar) {
        super(context, aVar);
    }

    public final void d() {
        p.c().a(f2825h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f2829b.registerReceiver(this.g, f());
    }

    public final void e() {
        p.c().a(f2825h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f2829b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
