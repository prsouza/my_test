package l6;

import d9.c;
import d9.i;
import java.util.concurrent.Future;
import o6.z;

public final class b0 implements z {

    /* renamed from: a  reason: collision with root package name */
    public Object f7786a;

    /* renamed from: b  reason: collision with root package name */
    public Object f7787b;

    public /* synthetic */ b0() {
        this.f7787b = new c((String) null);
    }

    public /* synthetic */ b0(z zVar, z zVar2) {
        this.f7786a = zVar;
        this.f7787b = zVar2;
    }

    public final i a() {
        Future future = (Future) this.f7786a;
        if (future != null) {
            return (i) future.get();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new a0(((u2) ((z) this.f7786a)).a(), (z1) ((z) this.f7787b).zza());
    }
}
