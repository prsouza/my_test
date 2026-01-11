package ki;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p002if.q;
import p002if.r;
import p002if.t;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Method f7700a;

    /* renamed from: b  reason: collision with root package name */
    public final r f7701b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7702c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7703d;

    /* renamed from: e  reason: collision with root package name */
    public final q f7704e;

    /* renamed from: f  reason: collision with root package name */
    public final t f7705f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7706h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final v<?>[] f7707j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f7708k;

    public static final class a {

        /* renamed from: x  reason: collision with root package name */
        public static final Pattern f7709x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f7710y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final a0 f7711a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f7712b;

        /* renamed from: c  reason: collision with root package name */
        public final Annotation[] f7713c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[][] f7714d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f7715e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7716f;
        public boolean g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f7717h;
        public boolean i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f7718j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f7719k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f7720l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f7721m;

        /* renamed from: n  reason: collision with root package name */
        public String f7722n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f7723o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f7724p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f7725q;

        /* renamed from: r  reason: collision with root package name */
        public String f7726r;

        /* renamed from: s  reason: collision with root package name */
        public q f7727s;

        /* renamed from: t  reason: collision with root package name */
        public t f7728t;

        /* renamed from: u  reason: collision with root package name */
        public Set<String> f7729u;

        /* renamed from: v  reason: collision with root package name */
        public v<?>[] f7730v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f7731w;

        public a(a0 a0Var, Method method) {
            this.f7711a = a0Var;
            this.f7712b = method;
            this.f7713c = method.getAnnotations();
            this.f7715e = method.getGenericParameterTypes();
            this.f7714d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z) {
            String str3 = this.f7722n;
            if (str3 == null) {
                this.f7722n = str;
                this.f7723o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f7709x.matcher(substring).find()) {
                            throw e0.j(this.f7712b, (Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f7726r = str2;
                    Matcher matcher = f7709x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f7729u = linkedHashSet;
                    return;
                }
                return;
            }
            throw e0.j(this.f7712b, (Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void c(int i10, Type type) {
            if (e0.h(type)) {
                throw e0.k(this.f7712b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public y(a aVar) {
        this.f7700a = aVar.f7712b;
        this.f7701b = aVar.f7711a.f7569c;
        this.f7702c = aVar.f7722n;
        this.f7703d = aVar.f7726r;
        this.f7704e = aVar.f7727s;
        this.f7705f = aVar.f7728t;
        this.g = aVar.f7723o;
        this.f7706h = aVar.f7724p;
        this.i = aVar.f7725q;
        this.f7707j = aVar.f7730v;
        this.f7708k = aVar.f7731w;
    }
}
