package n4;

import java.util.concurrent.ConcurrentHashMap;

public final class e extends ConcurrentHashMap<String, String> {

    /* renamed from: b  reason: collision with root package name */
    public static final e f8911b = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Object f8912a = new Object();

    public e() {
        super(180, 0.8f, 4);
    }

    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f8912a) {
                if (size() >= 180) {
                    clear();
                }
            }
        }
        String intern = str.intern();
        put(intern, intern);
        return intern;
    }
}
