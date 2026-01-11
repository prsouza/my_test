package kg;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.n;
import ag.s;
import java.math.BigInteger;

public final class f extends m implements g {

    /* renamed from: a  reason: collision with root package name */
    public n f7546a;

    /* renamed from: b  reason: collision with root package name */
    public s f7547b;

    public f(int i, int i10, int i11, int i12) {
        this.f7546a = g.f7549k;
        e eVar = new e(3);
        eVar.a(new k((long) i));
        if (i11 == 0) {
            if (i12 == 0) {
                eVar.a(g.f7550l);
                eVar.a(new k((long) i10));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i11 <= i10 || i12 <= i11) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            eVar.a(g.f7551m);
            e eVar2 = new e(3);
            eVar2.a(new k((long) i10));
            eVar2.a(new k((long) i11));
            eVar2.a(new k((long) i12));
            eVar.a(new a1(eVar2));
        }
        this.f7547b = new a1(eVar);
    }

    public f(BigInteger bigInteger) {
        this.f7546a = g.f7548j;
        this.f7547b = new k(bigInteger);
    }

    public final s d() {
        e eVar = new e(2);
        eVar.a(this.f7546a);
        eVar.a(this.f7547b);
        return new a1(eVar);
    }
}
