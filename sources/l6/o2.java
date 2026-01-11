package l6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import m3.u;
import o6.w;

public final class o2 {

    /* renamed from: e  reason: collision with root package name */
    public static final u f7959e = new u("AssetPackManager");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7960a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7961b;

    /* renamed from: c  reason: collision with root package name */
    public final x f7962c;

    /* renamed from: d  reason: collision with root package name */
    public final w f7963d;

    public o2(a0 a0Var, w wVar, x xVar, w wVar2) {
        new Handler(Looper.getMainLooper());
        this.f7960a = a0Var;
        this.f7961b = wVar;
        this.f7962c = xVar;
        this.f7963d = wVar2;
    }

    public final void a(boolean z) {
        boolean z10;
        x xVar = this.f7962c;
        synchronized (xVar) {
            z10 = xVar.f9698e != null;
        }
        x xVar2 = this.f7962c;
        synchronized (xVar2) {
            xVar2.f9699f = z;
            xVar2.b();
        }
        if (z && !z10) {
            ((Executor) this.f7963d.zza()).execute(new n2(this));
        }
    }
}
