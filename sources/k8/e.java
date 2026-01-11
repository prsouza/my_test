package k8;

import i8.d;
import i8.f;
import i8.g;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class e implements j8.a<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7475e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f7476a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f7477b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public d<Object> f7478c = a.f7471a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7479d = false;

    public static final class a implements f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final SimpleDateFormat f7480a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f7480a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public final void a(Object obj, Object obj2) throws IOException {
            ((g) obj2).b(f7480a.format((Date) obj));
        }
    }

    public e() {
        b(String.class, b.f7472a);
        b(Boolean.class, c.f7473a);
        b(Date.class, f7475e);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, i8.d<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, i8.f<?>>, java.util.HashMap] */
    public final j8.a a(Class cls, d dVar) {
        this.f7476a.put(cls, dVar);
        this.f7477b.remove(cls);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Class<?>, i8.f<?>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map<java.lang.Class<?>, i8.d<?>>, java.util.HashMap] */
    public final <T> e b(Class<T> cls, f<? super T> fVar) {
        this.f7477b.put(cls, fVar);
        this.f7476a.remove(cls);
        return this;
    }
}
