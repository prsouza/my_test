package yb;

import e6.e;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import xb.a;
import xb.c;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13581a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, byte[]> f13582b;

    /* renamed from: c  reason: collision with root package name */
    public final List<UUID> f13583c;

    /* renamed from: d  reason: collision with root package name */
    public final c f13584d;

    public b(String str, Map map, List list, c cVar) {
        e.D(str, Device.TYPE);
        e.D(cVar, "type");
        this.f13581a = str;
        this.f13582b = map;
        this.f13583c = list;
        this.f13584d = cVar;
    }

    public final c a() {
        return this.f13584d;
    }

    public final String b() {
        return this.f13581a;
    }
}
