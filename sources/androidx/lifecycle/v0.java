package androidx.lifecycle;

import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import de.b;
import xd.a;

public final class v0<VM extends u0> {

    /* renamed from: a  reason: collision with root package name */
    public final b<VM> f2195a;

    /* renamed from: b  reason: collision with root package name */
    public final a<x0> f2196b;

    /* renamed from: c  reason: collision with root package name */
    public final a<w0.b> f2197c;

    /* renamed from: d  reason: collision with root package name */
    public VM f2198d;

    public v0(b<VM> bVar, a<? extends x0> aVar, a<? extends w0.b> aVar2) {
        this.f2195a = bVar;
        this.f2196b = aVar;
        this.f2197c = aVar2;
    }

    public final Object a() {
        VM vm = this.f2198d;
        if (vm != null) {
            return vm;
        }
        VM a10 = new w0(this.f2196b.c(), this.f2197c.c()).a(aa.b.G(this.f2195a));
        this.f2198d = a10;
        return a10;
    }
}
