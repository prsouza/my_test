package re;

import androidx.activity.result.d;
import c3.k;
import java.util.Map;
import nd.x;
import oe.b;
import pe.e;
import qe.a;

public abstract class o0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Key> f10734a;

    /* renamed from: b  reason: collision with root package name */
    public final b<Value> f10735b;

    public o0(b bVar, b bVar2, k kVar) {
        this.f10734a = bVar;
        this.f10735b = bVar2;
    }

    public abstract e a();

    /* renamed from: i */
    public final void f(a aVar, int i, Builder builder, boolean z) {
        int i10;
        Object obj;
        e6.e.D(builder, "builder");
        Object u10 = aVar.u(a(), i, this.f10734a);
        boolean z10 = true;
        if (z) {
            i10 = aVar.k(a());
            if (i10 != i + 1) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(d.b("Value must follow key in a map, index for key: ", i, ", returned index for value: ", i10).toString());
            }
        } else {
            i10 = i + 1;
        }
        if (!builder.containsKey(u10) || (this.f10735b.a().c() instanceof pe.d)) {
            obj = aVar.u(a(), i10, this.f10735b);
        } else {
            e a10 = a();
            b<Value> bVar = this.f10735b;
            x.t0(builder, u10);
            obj = aVar.u(a10, i10, bVar);
        }
        builder.put(u10, obj);
    }
}
