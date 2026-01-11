package t4;

import com.github.mikephil.charting.BuildConfig;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import t4.h;

@AutoValue
public abstract class m {

    @AutoValue.Builder
    public static abstract class a {
        public final a a(String str, int i) {
            d().put(str, String.valueOf(i));
            return this;
        }

        public final a b(String str, String str2) {
            d().put(str, str2);
            return this;
        }

        public abstract m c();

        public abstract Map<String, String> d();

        public abstract a e(long j10);

        public abstract a f(String str);

        public abstract a g(long j10);
    }

    public static a a() {
        h.b bVar = new h.b();
        bVar.f11362f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract l e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public final a j() {
        h.b bVar = new h.b();
        bVar.f(h());
        bVar.f11358b = d();
        bVar.h(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f11362f = new HashMap(c());
        return bVar;
    }
}
