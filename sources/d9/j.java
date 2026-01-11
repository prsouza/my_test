package d9;

import e6.e;
import f9.b;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final b f4398a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4399b;

    public j(b bVar, c cVar) {
        e.D(bVar, "data");
        e.D(cVar, "localeBundle");
        this.f4398a = bVar;
        this.f4399b = cVar;
    }

    public final List<String> a(String str) {
        return this.f4398a.f5024b.get(str);
    }

    public final String b(String str, String str2) {
        Map map = this.f4398a.f5025c.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final String c(String str) {
        return this.f4398a.f5023a.get(str);
    }

    public final Locale d() {
        return this.f4399b.f4373a;
    }
}
