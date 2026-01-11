package kg;

import ag.a1;
import ag.k;
import ag.m;
import ag.s;
import eh.e;
import java.math.BigInteger;
import xg.d;
import xh.a;

public final class b extends m implements g {

    /* renamed from: v  reason: collision with root package name */
    public static final BigInteger f7534v = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    public f f7535a;

    /* renamed from: b  reason: collision with root package name */
    public d f7536b;

    /* renamed from: c  reason: collision with root package name */
    public d f7537c;

    /* renamed from: s  reason: collision with root package name */
    public BigInteger f7538s;

    /* renamed from: t  reason: collision with root package name */
    public BigInteger f7539t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f7540u;

    public b(d dVar, d dVar2, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        f fVar;
        int[] iArr;
        this.f7536b = dVar;
        this.f7537c = dVar2;
        this.f7538s = bigInteger;
        this.f7539t = bigInteger2;
        this.f7540u = a.a(bArr);
        if (xg.a.g(dVar)) {
            fVar = new f(dVar.f13237a.c());
        } else if (xg.a.f(dVar)) {
            int[] iArr2 = ((e) dVar.f13237a).a().f4837a;
            if (iArr2 == null) {
                iArr = null;
            } else {
                iArr = (int[]) iArr2.clone();
            }
            if (iArr.length == 3) {
                fVar = new f(iArr[2], iArr[1], 0, 0);
            } else if (iArr.length == 5) {
                fVar = new f(iArr[4], iArr[1], iArr[2], iArr[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        this.f7535a = fVar;
    }

    public final s d() {
        ag.e eVar = new ag.e(6);
        eVar.a(new k(f7534v));
        eVar.a(this.f7535a);
        eVar.a(new a(this.f7536b, this.f7540u));
        eVar.a(this.f7537c);
        eVar.a(new k(this.f7538s));
        BigInteger bigInteger = this.f7539t;
        if (bigInteger != null) {
            eVar.a(new k(bigInteger));
        }
        return new a1(eVar);
    }
}
