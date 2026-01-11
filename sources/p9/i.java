package p9;

import aa.c;
import i2.z;
import java.lang.reflect.Field;
import p9.j;
import x9.a;

public final class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f9743d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f9744e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f9745f;
    public final /* synthetic */ i2.j g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f9746h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z, boolean z10, Field field, boolean z11, z zVar, i2.j jVar, a aVar, boolean z12) {
        super(str, z, z10);
        this.f9743d = field;
        this.f9744e = z11;
        this.f9745f = zVar;
        this.g = jVar;
        this.f9746h = aVar;
        this.i = z12;
    }

    public final void a(aa.a aVar, Object obj) {
        Object read = this.f9745f.read(aVar);
        if (read != null || !this.i) {
            this.f9743d.set(obj, read);
        }
    }

    public final void b(c cVar, Object obj) {
        z zVar;
        Object obj2 = this.f9743d.get(obj);
        if (this.f9744e) {
            zVar = this.f9745f;
        } else {
            zVar = new n(this.g, this.f9745f, this.f9746h.f13149b);
        }
        zVar.write(cVar, obj2);
    }

    public final boolean c(Object obj) {
        return this.f9755b && this.f9743d.get(obj) != obj;
    }
}
