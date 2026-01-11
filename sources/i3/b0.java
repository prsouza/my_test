package i3;

import android.os.SystemClock;
import android.util.Log;
import c4.f;
import g3.a;
import g3.d;
import i3.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.o;

public final class b0 implements h, h.a {

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f6014a;

    /* renamed from: b  reason: collision with root package name */
    public final h.a f6015b;

    /* renamed from: c  reason: collision with root package name */
    public int f6016c;

    /* renamed from: s  reason: collision with root package name */
    public e f6017s;

    /* renamed from: t  reason: collision with root package name */
    public Object f6018t;

    /* renamed from: u  reason: collision with root package name */
    public volatile o.a<?> f6019u;

    /* renamed from: v  reason: collision with root package name */
    public f f6020v;

    public b0(i<?> iVar, h.a aVar) {
        this.f6014a = iVar;
        this.f6015b = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a() {
        Object obj = this.f6018t;
        if (obj != null) {
            this.f6018t = null;
            int i = f.f3234b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                d<X> e10 = this.f6014a.e(obj);
                g gVar = new g(e10, obj, this.f6014a.i);
                g3.f fVar = this.f6019u.f8426a;
                i<?> iVar = this.f6014a;
                this.f6020v = new f(fVar, iVar.f6053n);
                iVar.b().a(this.f6020v, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f6020v + ", data: " + obj + ", encoder: " + e10 + ", duration: " + f.a(elapsedRealtimeNanos));
                }
                this.f6019u.f8428c.b();
                this.f6017s = new e(Collections.singletonList(this.f6019u.f8426a), this.f6014a, this);
            } catch (Throwable th2) {
                this.f6019u.f8428c.b();
                throw th2;
            }
        }
        e eVar = this.f6017s;
        if (eVar != null && eVar.a()) {
            return true;
        }
        this.f6017s = null;
        this.f6019u = null;
        boolean z = false;
        while (!z) {
            if (!(this.f6016c < ((ArrayList) this.f6014a.c()).size())) {
                break;
            }
            List<o.a<?>> c10 = this.f6014a.c();
            int i10 = this.f6016c;
            this.f6016c = i10 + 1;
            this.f6019u = (o.a) ((ArrayList) c10).get(i10);
            if (this.f6019u != null && (this.f6014a.f6055p.c(this.f6019u.f8428c.e()) || this.f6014a.g(this.f6019u.f8428c.a()))) {
                this.f6019u.f8428c.f(this.f6014a.f6054o, new a0(this, this.f6019u));
                z = true;
            }
        }
        return z;
    }

    public final void cancel() {
        o.a<?> aVar = this.f6019u;
        if (aVar != null) {
            aVar.f8428c.cancel();
        }
    }

    public final void d() {
        throw new UnsupportedOperationException();
    }

    public final void e(g3.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, a aVar) {
        this.f6015b.e(fVar, exc, dVar, this.f6019u.f8428c.e());
    }

    public final void i(g3.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, a aVar, g3.f fVar2) {
        this.f6015b.i(fVar, obj, dVar, this.f6019u.f8428c.e(), fVar);
    }
}
