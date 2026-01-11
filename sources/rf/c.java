package rf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import lf.d;
import nd.x;
import p002if.v;
import pf.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f10770a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f10771b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f10772c = null;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package packageR = v.class.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(v.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(e.class.getName(), "okhttp.Http2");
        linkedHashMap.put(d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f10771b = x.x0(linkedHashMap);
    }
}
