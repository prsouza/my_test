package h1;

import android.content.SharedPreferences;
import h1.e0;
import java.util.Collections;
import java.util.Iterator;
import x8.h0;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5784a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5785b;

    public /* synthetic */ v(Object obj, int i) {
        this.f5784a = i;
        this.f5785b = obj;
    }

    public final void run() {
        switch (this.f5784a) {
            case 0:
                e0.e eVar = ((y) this.f5785b).f5790a;
                Collections.emptyList();
                eVar.a();
                return;
            default:
                h0 h0Var = (h0) this.f5785b;
                synchronized (h0Var.f13053d) {
                    SharedPreferences.Editor edit = h0Var.f13050a.edit();
                    String str = h0Var.f13051b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it = h0Var.f13053d.iterator();
                    while (it.hasNext()) {
                        sb2.append(it.next());
                        sb2.append(h0Var.f13052c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
        }
    }
}
