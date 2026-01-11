package oa;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import ma.a;
import x8.d0;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public pa.a f9385a;

    /* renamed from: b  reason: collision with root package name */
    public d0 f9386b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9387c = false;

    /* renamed from: d  reason: collision with root package name */
    public Context f9388d;

    /* renamed from: e  reason: collision with root package name */
    public na.b f9389e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9390f = false;
    public a g;

    public b(Context context) {
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0) {
            this.g = new a(this);
        } else {
            this.g = new c();
        }
    }

    public final void a(d0 d0Var, na.b bVar, boolean z) {
        this.f9387c = true;
        this.f9386b = d0Var;
        this.f9389e = bVar;
        this.f9390f = z;
        this.g.a(d0Var, bVar, z);
    }

    public final void b(Context context, pa.a aVar) {
        this.f9385a = aVar;
        this.f9388d = context;
        StringBuilder d10 = a.a.d("Currently selected provider = ");
        d10.append(this.g.getClass().getSimpleName());
        aVar.a(d10.toString(), new Object[0]);
        this.g.b(context, aVar);
    }

    public final void c() {
        this.f9385a.a("FusedLocationProvider not working, falling back and using LocationManager", new Object[0]);
        c cVar = new c();
        this.g = cVar;
        cVar.b(this.f9388d, this.f9385a);
        if (this.f9387c) {
            this.g.a(this.f9386b, this.f9389e, this.f9390f);
        }
    }
}
