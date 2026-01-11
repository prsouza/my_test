package nh;

import a.a;
import ag.n;
import java.util.Map;
import java.util.Objects;
import lg.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final k f9094a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9095b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9096c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9097d;

    /* renamed from: e  reason: collision with root package name */
    public final n f9098e;

    public l(n nVar) {
        Objects.requireNonNull(nVar, "treeDigest == null");
        this.f9098e = nVar;
        b a10 = f.a(nVar);
        String c10 = a10.c();
        int d10 = c10.equals("SHAKE128") ? 32 : c10.equals("SHAKE256") ? 64 : a10.d();
        this.f9095b = d10;
        this.f9096c = 16;
        int ceil = (int) Math.ceil(((double) (d10 * 8)) / ((double) w.h(16)));
        int floor = ((int) Math.floor((double) (w.h(ceil * 15) / w.h(16)))) + 1 + ceil;
        this.f9097d = floor;
        String c11 = a10.c();
        Map<String, k> map = k.f9091c;
        Objects.requireNonNull(c11, "algorithmName == null");
        k kVar = k.f9091c.get(k.a(c11, d10, floor));
        this.f9094a = kVar;
        if (kVar == null) {
            StringBuilder d11 = a.d("cannot find OID for digest algorithm: ");
            d11.append(a10.c());
            throw new IllegalArgumentException(d11.toString());
        }
    }
}
