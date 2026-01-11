package a9;

import android.content.Context;
import s7.b;
import s7.n;

public final class f {

    public interface a<T> {
        String c(T t10);
    }

    public static b<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        b.C0214b<d> a10 = b.a(d.class);
        a10.f10944d = 1;
        a10.f10945e = new s7.a(aVar);
        return a10.b();
    }

    public static b<?> b(String str, a<Context> aVar) {
        b.C0214b<d> a10 = b.a(d.class);
        a10.f10944d = 1;
        a10.a(new n(Context.class, 1, 0));
        a10.f10945e = new e(str, aVar);
        return a10.b();
    }
}
