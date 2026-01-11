package ja;

import android.content.Context;
import java.util.Map;
import java.util.WeakHashMap;
import na.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f7120a;

    /* renamed from: b  reason: collision with root package name */
    public pa.a f7121b;

    /* renamed from: ja.a$a  reason: collision with other inner class name */
    public static class C0124a {

        /* renamed from: c  reason: collision with root package name */
        public static final Map<Context, ma.a> f7122c = new WeakHashMap();

        /* renamed from: a  reason: collision with root package name */
        public b f7123a = b.f8931d;

        /* renamed from: b  reason: collision with root package name */
        public ma.a f7124b;

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<android.content.Context, ma.a>, java.util.WeakHashMap] */
        public C0124a(a aVar, ma.a aVar2) {
            ? r02 = f7122c;
            if (!r02.containsKey(aVar.f7120a)) {
                r02.put(aVar.f7120a, aVar2);
            }
            ma.a aVar3 = (ma.a) r02.get(aVar.f7120a);
            this.f7124b = aVar3;
            aVar3.b(aVar.f7120a, aVar.f7121b);
        }
    }

    public a(Context context, pa.a aVar) {
        this.f7120a = context;
        this.f7121b = aVar;
    }
}
