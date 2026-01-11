package ff;

import ah.v;
import df.c;
import df.e;
import java.util.HashMap;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5110a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile HashMap<String, a> f5111b;

    static {
        c cVar = new c(a.b.f0("edffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff7f"), new ef.b());
        df.b bVar = new df.b(cVar, a.b.f0("a3785913ca4deb75abd841414d0a700098e879777940c78c73fe6f2bee6c0352"), cVar.a(a.b.f0("b0a00e4a271beec478e42fad0618432fa7d7fb3d99004d2b0bdfc14f8024832b")));
        a aVar = new a(bVar, new v(), new e(bVar, a.b.f0("5866666666666666666666666666666666666666666666666666666666666666"), true));
        f5110a = aVar;
        f5111b = new HashMap<>();
        String lowerCase = aVar.f5109t.toLowerCase(Locale.ENGLISH);
        synchronized (b.class) {
            HashMap<String, a> hashMap = new HashMap<>(f5111b);
            hashMap.put(lowerCase, aVar);
            f5111b = hashMap;
        }
    }
}
