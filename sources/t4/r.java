package t4;

import java.util.Set;
import q4.b;
import q4.e;
import q4.f;
import q4.g;

public final class r implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f11385a;

    /* renamed from: b  reason: collision with root package name */
    public final q f11386b;

    /* renamed from: c  reason: collision with root package name */
    public final u f11387c;

    public r(Set<b> set, q qVar, u uVar) {
        this.f11385a = set;
        this.f11386b = qVar;
        this.f11387c = uVar;
    }

    public final <T> f a(String str, b bVar, e eVar) {
        if (this.f11385a.contains(bVar)) {
            return new t(this.f11386b, str, bVar, eVar, this.f11387c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f11385a}));
    }
}
