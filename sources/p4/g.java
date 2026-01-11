package p4;

import h4.j;
import l4.a;

public final class g extends j {

    /* renamed from: c  reason: collision with root package name */
    public final g f9687c;

    /* renamed from: d  reason: collision with root package name */
    public a f9688d;

    /* renamed from: e  reason: collision with root package name */
    public g f9689e;

    /* renamed from: f  reason: collision with root package name */
    public String f9690f;
    public Object g;

    /* renamed from: h  reason: collision with root package name */
    public long f9691h;
    public boolean i;

    public g(int i10, g gVar, a aVar, Object obj) {
        this.f5834a = i10;
        this.f9687c = gVar;
        this.f9688d = aVar;
        this.f5835b = -1;
        this.g = obj;
    }

    public final String a() {
        if (!this.i) {
            return null;
        }
        String str = this.f9690f;
        if (str != null) {
            return str;
        }
        return String.valueOf(this.f9691h);
    }

    public final g e() {
        a aVar;
        g gVar = this.f9689e;
        if (gVar == null) {
            a aVar2 = this.f9688d;
            if (aVar2 == null) {
                aVar = null;
            } else {
                aVar = aVar2.a();
            }
            g gVar2 = new g(1, this, aVar, (Object) null);
            this.f9689e = gVar2;
            return gVar2;
        }
        gVar.f(1, (Object) null);
        return gVar;
    }

    public final g f(int i10, Object obj) {
        this.f5834a = i10;
        this.f5835b = -1;
        this.i = false;
        this.g = obj;
        a aVar = this.f9688d;
        if (aVar != null) {
            aVar.f7773b = null;
            aVar.f7774c = null;
            aVar.f7775d = null;
        }
        return this;
    }
}
