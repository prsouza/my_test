package n4;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<SoftReference<a>, Boolean> f8920a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ReferenceQueue<a> f8921b = new ReferenceQueue<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8922a = new g();
    }
}
