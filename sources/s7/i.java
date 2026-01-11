package s7;

import java.util.Objects;
import r8.b;

public final /* synthetic */ class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f10953a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10954b;

    public /* synthetic */ i(k kVar, b bVar) {
        this.f10953a = kVar;
        this.f10954b = bVar;
    }

    public final Object get() {
        k kVar = this.f10953a;
        b bVar = this.f10954b;
        Objects.requireNonNull(kVar);
        return bVar.f10939e.f(new x(bVar, kVar));
    }
}
