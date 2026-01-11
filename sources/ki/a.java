package ki;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import ki.f;
import md.m;
import mi.w;
import p002if.b0;
import p002if.z;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7560a = true;

    /* renamed from: ki.a$a  reason: collision with other inner class name */
    public static final class C0136a implements f<b0, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0136a f7561a = new C0136a();

        public final Object a(Object obj) throws IOException {
            b0 b0Var = (b0) obj;
            try {
                return e0.a(b0Var);
            } finally {
                b0Var.close();
            }
        }
    }

    public static final class b implements f<z, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7562a = new b();

        public final Object a(Object obj) throws IOException {
            return (z) obj;
        }
    }

    public static final class c implements f<b0, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7563a = new c();

        public final Object a(Object obj) throws IOException {
            return (b0) obj;
        }
    }

    public static final class d implements f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7564a = new d();

        public final Object a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    public static final class e implements f<b0, m> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7565a = new e();

        public final Object a(Object obj) throws IOException {
            ((b0) obj).close();
            return m.f8555a;
        }
    }

    public static final class f implements f<b0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f7566a = new f();

        public final Object a(Object obj) throws IOException {
            ((b0) obj).close();
            return null;
        }
    }

    public final f a(Type type) {
        if (z.class.isAssignableFrom(e0.f(type))) {
            return b.f7562a;
        }
        return null;
    }

    public final f<b0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (type == b0.class) {
            if (e0.i(annotationArr, w.class)) {
                return c.f7563a;
            }
            return C0136a.f7561a;
        } else if (type == Void.class) {
            return f.f7566a;
        } else {
            if (!this.f7560a || type != m.class) {
                return null;
            }
            try {
                return e.f7565a;
            } catch (NoClassDefFoundError unused) {
                this.f7560a = false;
                return null;
            }
        }
    }
}
