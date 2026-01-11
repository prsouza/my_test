package ki;

import com.github.mikephil.charting.BuildConfig;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ki.c;
import ki.f;
import p002if.b0;
import p002if.d;
import p002if.r;
import p002if.v;
import p002if.z;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Method, b0<?>> f7567a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final d.a f7568b;

    /* renamed from: c  reason: collision with root package name */
    public final r f7569c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f.a> f7570d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c.a> f7571e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7572f;

    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final w f7573a = w.f7683c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f7574b = new Object[0];

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f7575c;

        public a(Class cls) {
            this.f7575c = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f7574b;
            }
            if (this.f7573a.c(method)) {
                return this.f7573a.b(method, this.f7575c, obj, objArr);
            }
            return a0.this.c(method).a(objArr);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final w f7577a;

        /* renamed from: b  reason: collision with root package name */
        public d.a f7578b;

        /* renamed from: c  reason: collision with root package name */
        public r f7579c;

        /* renamed from: d  reason: collision with root package name */
        public final List<f.a> f7580d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final List<c.a> f7581e = new ArrayList();

        public b() {
            w wVar = w.f7683c;
            this.f7577a = wVar;
        }

        public final b a() {
            r.a aVar = new r.a();
            aVar.d((r) null, "https://nodle.com");
            r a10 = aVar.a();
            List<String> list = a10.g;
            if (BuildConfig.FLAVOR.equals(list.get(list.size() - 1))) {
                this.f7579c = a10;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a10);
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<ki.f$a>, java.util.ArrayList] */
        public final a0 b() {
            List list;
            if (this.f7579c != null) {
                d.a aVar = this.f7578b;
                if (aVar == null) {
                    aVar = new v();
                }
                Executor a10 = this.f7577a.a();
                ArrayList arrayList = new ArrayList(this.f7581e);
                w wVar = this.f7577a;
                Objects.requireNonNull(wVar);
                c.a iVar = new i(a10);
                if (wVar.f7684a) {
                    list = Arrays.asList(new c.a[]{e.f7583a, iVar});
                } else {
                    list = Collections.singletonList(iVar);
                }
                arrayList.addAll(list);
                ArrayList arrayList2 = new ArrayList(this.f7580d.size() + 1 + this.f7577a.f7684a);
                arrayList2.add(new a());
                arrayList2.addAll(this.f7580d);
                arrayList2.addAll(this.f7577a.f7684a ? Collections.singletonList(s.f7640a) : Collections.emptyList());
                return new a0(aVar, this.f7579c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList));
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public a0(d.a aVar, r rVar, List list, List list2) {
        this.f7568b = aVar;
        this.f7569c = rVar;
        this.f7570d = list;
        this.f7571e = list2;
        this.f7572f = false;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f7571e.indexOf((Object) null) + 1;
        int size = this.f7571e.size();
        for (int i = indexOf; i < size; i++) {
            c<?, ?> a10 = this.f7571e.get(i).a(type, annotationArr);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f7571e.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f7571e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> T b(Class<T> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                    sb2.append(cls2.getName());
                    if (cls2 != cls) {
                        sb2.append(" which is an interface of ");
                        sb2.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb2.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f7572f) {
                w wVar = w.f7683c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!wVar.c(method) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.reflect.Method, ki.b0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.reflect.Method, ki.b0<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.reflect.Method, ki.b0<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final b0<?> c(Method method) {
        b0<?> b0Var;
        b0<?> b0Var2 = (b0) this.f7567a.get(method);
        if (b0Var2 != null) {
            return b0Var2;
        }
        synchronized (this.f7567a) {
            b0Var = (b0) this.f7567a.get(method);
            if (b0Var == null) {
                b0Var = b0.b(this, method);
                this.f7567a.put(method, b0Var);
            }
        }
        return b0Var;
    }

    public final <T> f<T, z> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f7570d.indexOf((Object) null) + 1;
        int size = this.f7570d.size();
        for (int i = indexOf; i < size; i++) {
            f<T, z> a10 = this.f7570d.get(i).a(type);
            if (a10 != null) {
                return a10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f7570d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f7570d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<b0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f7570d.indexOf((Object) null) + 1;
        int size = this.f7570d.size();
        for (int i = indexOf; i < size; i++) {
            f<b0, ?> b10 = this.f7570d.get(i).b(type, annotationArr, this);
            if (b10 != null) {
                return b10;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        sb2.append("  Tried:");
        int size2 = this.f7570d.size();
        while (indexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f7570d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final <T> f<T, String> f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f7570d.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(this.f7570d.get(i));
        }
        return;
    }
}
