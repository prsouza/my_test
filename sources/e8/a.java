package e8;

import c3.k;
import e8.c;
import java.util.Objects;
import org.json.JSONObject;

public final class a implements h {
    public static c b(k kVar) {
        c.b bVar = new c.b(8);
        c.a aVar = new c.a(true, false);
        Objects.requireNonNull(kVar);
        return new c(System.currentTimeMillis() + ((long) 3600000), bVar, aVar, 10.0d, 1.2d, 60);
    }

    public final c a(k kVar, JSONObject jSONObject) {
        return b(kVar);
    }
}
