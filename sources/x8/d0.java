package x8;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import c3.k;
import cb.b;
import cb.c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e6.e;
import ge.g;
import ge.o0;
import pd.d;
import pd.f;

public final /* synthetic */ class d0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f13031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13032b;

    public /* synthetic */ d0(String str, Context context) {
        this.f13031a = str;
        this.f13032b = context;
    }

    public /* synthetic */ d0(e0 e0Var, String str) {
        this.f13032b = e0Var;
        this.f13031a = str;
    }

    public final void a(Location location) {
        String str = this.f13031a;
        Context context = (Context) this.f13032b;
        int i = c.f3327a;
        e.D(str, "$customUrl");
        e.D(context, "$context");
        Log.d("c", "Custom notification url: " + str);
        g.b(k.j(o0.f5434b), (f) null, new b(context, str, location, (d<? super b>) null), 3);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>>, s.g] */
    public final Object then(Task task) {
        e0 e0Var = (e0) this.f13032b;
        String str = this.f13031a;
        synchronized (e0Var) {
            e0Var.f13037b.remove(str);
        }
        return task;
    }
}
