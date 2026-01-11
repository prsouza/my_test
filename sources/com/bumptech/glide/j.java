package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.c;
import i3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import t3.c;
import v3.b;
import v3.d;
import v3.h;
import v3.i;
import v3.m;
import v3.n;
import v3.p;
import y3.e;
import y3.f;

public final class j implements ComponentCallbacks2, i {
    public static final f z;

    /* renamed from: a  reason: collision with root package name */
    public final b f3537a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3538b;

    /* renamed from: c  reason: collision with root package name */
    public final h f3539c;

    /* renamed from: s  reason: collision with root package name */
    public final n f3540s;

    /* renamed from: t  reason: collision with root package name */
    public final m f3541t;

    /* renamed from: u  reason: collision with root package name */
    public final p f3542u = new p();

    /* renamed from: v  reason: collision with root package name */
    public final a f3543v;

    /* renamed from: w  reason: collision with root package name */
    public final v3.b f3544w;

    /* renamed from: x  reason: collision with root package name */
    public final CopyOnWriteArrayList<e<Object>> f3545x;

    /* renamed from: y  reason: collision with root package name */
    public f f3546y;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            j jVar = j.this;
            jVar.f3539c.d(jVar);
        }
    }

    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f3548a;

        public b(n nVar) {
            this.f3548a = nVar;
        }
    }

    static {
        f fVar = (f) new f().d(Bitmap.class);
        fVar.I = true;
        z = fVar;
        ((f) new f().d(c.class)).I = true;
        f fVar2 = (f) ((f) ((f) new f().g(l.f6085b)).k(g.LOW)).o();
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    public j(b bVar, h hVar, m mVar, Context context) {
        v3.b bVar2;
        f fVar;
        n nVar = new n();
        v3.c cVar = bVar.f3499v;
        a aVar = new a();
        this.f3543v = aVar;
        this.f3537a = bVar;
        this.f3539c = hVar;
        this.f3541t = mVar;
        this.f3540s = nVar;
        this.f3538b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar3 = new b(nVar);
        Objects.requireNonNull((v3.e) cVar);
        boolean z10 = d0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z10) {
            bVar2 = new d(applicationContext, bVar3);
        } else {
            bVar2 = new v3.j();
        }
        this.f3544w = bVar2;
        if (c4.j.h()) {
            c4.j.f().post(aVar);
        } else {
            hVar.d(this);
        }
        hVar.d(bVar2);
        this.f3545x = new CopyOnWriteArrayList<>(bVar.f3495c.f3520e);
        d dVar = bVar.f3495c;
        synchronized (dVar) {
            if (dVar.f3523j == null) {
                Objects.requireNonNull((c.a) dVar.f3519d);
                f fVar2 = new f();
                fVar2.I = true;
                dVar.f3523j = fVar2;
            }
            fVar = dVar.f3523j;
        }
        synchronized (this) {
            f fVar3 = (f) fVar.clone();
            fVar3.b();
            this.f3546y = fVar3;
        }
        synchronized (bVar.f3500w) {
            if (!bVar.f3500w.contains(this)) {
                bVar.f3500w.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<com.bumptech.glide.j>, java.util.ArrayList] */
    public final void h(z3.h<?> hVar) {
        boolean z10;
        if (hVar != null) {
            boolean k10 = k(hVar);
            y3.c request = hVar.getRequest();
            if (!k10) {
                b bVar = this.f3537a;
                synchronized (bVar.f3500w) {
                    Iterator it = bVar.f3500w.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((j) it.next()).k(hVar)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (!z10 && request != null) {
                    hVar.e((y3.c) null);
                    request.clear();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final synchronized void i() {
        n nVar = this.f3540s;
        nVar.f12283c = true;
        Iterator it = ((ArrayList) c4.j.e(nVar.f12281a)).iterator();
        while (it.hasNext()) {
            y3.c cVar = (y3.c) it.next();
            if (cVar.isRunning()) {
                cVar.h();
                nVar.f12282b.add(cVar);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final synchronized void j() {
        n nVar = this.f3540s;
        nVar.f12283c = false;
        Iterator it = ((ArrayList) c4.j.e(nVar.f12281a)).iterator();
        while (it.hasNext()) {
            y3.c cVar = (y3.c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        nVar.f12282b.clear();
    }

    public final synchronized boolean k(z3.h<?> hVar) {
        y3.c request = hVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f3540s.a(request)) {
            return false;
        }
        this.f3542u.f12291a.remove(hVar);
        hVar.e((y3.c) null);
        return true;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final synchronized void onDestroy() {
        this.f3542u.onDestroy();
        Iterator it = ((ArrayList) c4.j.e(this.f3542u.f12291a)).iterator();
        while (it.hasNext()) {
            h((z3.h) it.next());
        }
        this.f3542u.f12291a.clear();
        n nVar = this.f3540s;
        Iterator it2 = ((ArrayList) c4.j.e(nVar.f12281a)).iterator();
        while (it2.hasNext()) {
            nVar.a((y3.c) it2.next());
        }
        nVar.f12282b.clear();
        this.f3539c.b(this);
        this.f3539c.b(this.f3544w);
        c4.j.f().removeCallbacks(this.f3543v);
        this.f3537a.d(this);
    }

    public final void onLowMemory() {
    }

    public final synchronized void onStart() {
        j();
        this.f3542u.onStart();
    }

    public final synchronized void onStop() {
        i();
        this.f3542u.onStop();
    }

    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3540s + ", treeNode=" + this.f3541t + "}";
    }
}
