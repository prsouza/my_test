package i7;

import i7.a;
import i7.e;
import i7.q0;
import i7.t;
import i7.x;
import i7.x.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {
    private static Map<Object, x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public m1 unknownFields = m1.f6324f;

    public static abstract class a<MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0105a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f6388a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f6389b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6390c = false;

        public a(MessageType messagetype) {
            this.f6388a = messagetype;
            this.f6389b = (x) messagetype.o(f.NEW_MUTABLE_INSTANCE);
        }

        public final q0 c() {
            return this.f6388a;
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f6388a;
            Objects.requireNonNull(messagetype);
            a aVar = (a) messagetype.o(f.NEW_BUILDER);
            aVar.n(l());
            return aVar;
        }

        public final MessageType k() {
            MessageType l10 = l();
            if (l10.j()) {
                return l10;
            }
            throw new k1();
        }

        public final MessageType l() {
            if (this.f6390c) {
                return this.f6389b;
            }
            MessageType messagetype = this.f6389b;
            Objects.requireNonNull(messagetype);
            b1 b1Var = b1.f6235c;
            Objects.requireNonNull(b1Var);
            b1Var.a(messagetype.getClass()).e(messagetype);
            this.f6390c = true;
            return this.f6389b;
        }

        public final void m() {
            if (this.f6390c) {
                MessageType messagetype = (x) this.f6389b.o(f.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f6389b;
                b1 b1Var = b1.f6235c;
                Objects.requireNonNull(b1Var);
                b1Var.a(messagetype.getClass()).a(messagetype, messagetype2);
                this.f6389b = messagetype;
                this.f6390c = false;
            }
        }

        public final BuilderType n(MessageType messagetype) {
            m();
            o(this.f6389b, messagetype);
            return this;
        }

        public final void o(MessageType messagetype, MessageType messagetype2) {
            b1 b1Var = b1.f6235c;
            Objects.requireNonNull(b1Var);
            b1Var.a(messagetype.getClass()).a(messagetype, messagetype2);
        }
    }

    public static class b<T extends x<T, ?>> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f6391a;

        public b(T t10) {
            this.f6391a = t10;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends x<MessageType, BuilderType> implements r0 {
        public t<d> extensions = t.f6355d;

        public final t<d> w() {
            t<d> tVar = this.extensions;
            if (tVar.f6357b) {
                this.extensions = tVar.clone();
            }
            return this.extensions;
        }
    }

    public static final class d implements t.b<d> {
        public final int compareTo(Object obj) {
            Objects.requireNonNull((d) obj);
            return 0;
        }

        public final void f() {
        }

        public final void g() {
        }

        public final void getNumber() {
        }

        public final q0.a j(q0.a aVar, q0 q0Var) {
            a aVar2 = (a) aVar;
            aVar2.n((x) q0Var);
            return aVar2;
        }

        public final t1 m() {
            throw null;
        }

        public final void n() {
        }
    }

    public static class e<ContainingType extends q0, Type> extends g {
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <T extends x<T, ?>> T m(T t10) throws a0 {
        if (t10.j()) {
            return t10;
        }
        throw new a0(new k1().getMessage());
    }

    public static <T extends x<?, ?>> T p(Class<T> cls) {
        T t10 = (x) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (x) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((x) p1.c(cls)).c();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    public static Object r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <T extends x<T, ?>> T s(T t10, i iVar, p pVar) throws a0 {
        try {
            j j10 = iVar.j();
            T u10 = u(t10, j10, pVar);
            j10.a(0);
            m(u10);
            return u10;
        } catch (a0 e10) {
            throw e10;
        } catch (a0 e11) {
            throw e11;
        }
    }

    public static <T extends x<T, ?>> T t(T t10, byte[] bArr, p pVar) throws a0 {
        int length = bArr.length;
        T t11 = (x) t10.o(f.NEW_MUTABLE_INSTANCE);
        try {
            f1 b10 = b1.f6235c.b(t11);
            b10.c(t11, bArr, 0, length + 0, new e.a(pVar));
            b10.e(t11);
            if (t11.memoizedHashCode == 0) {
                m(t11);
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw a0.h();
        }
    }

    public static <T extends x<T, ?>> T u(T t10, j jVar, p pVar) throws a0 {
        T t11 = (x) t10.o(f.NEW_MUTABLE_INSTANCE);
        try {
            f1 b10 = b1.f6235c.b(t11);
            k kVar = jVar.f6304c;
            if (kVar == null) {
                kVar = new k(jVar);
            }
            b10.d(t11, kVar, pVar);
            b10.e(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof a0) {
                throw ((a0) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends x<?, ?>> void v(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public final void a(l lVar) throws IOException {
        b1 b1Var = b1.f6235c;
        Objects.requireNonNull(b1Var);
        f1<?> a10 = b1Var.a(getClass());
        m mVar = lVar.f6319a;
        if (mVar == null) {
            mVar = new m(lVar);
        }
        a10.b(this, mVar);
    }

    public final int b() {
        if (this.memoizedSerializedSize == -1) {
            b1 b1Var = b1.f6235c;
            Objects.requireNonNull(b1Var);
            this.memoizedSerializedSize = b1Var.a(getClass()).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public final q0.a d() {
        a aVar = (a) o(f.NEW_BUILDER);
        aVar.n(this);
        return aVar;
    }

    public final int e() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c().getClass().isInstance(obj)) {
            return false;
        }
        b1 b1Var = b1.f6235c;
        Objects.requireNonNull(b1Var);
        return b1Var.a(getClass()).g(this, (x) obj);
    }

    public final q0.a h() {
        return (a) o(f.NEW_BUILDER);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        b1 b1Var = b1.f6235c;
        Objects.requireNonNull(b1Var);
        int j10 = b1Var.a(getClass()).j(this);
        this.memoizedHashCode = j10;
        return j10;
    }

    public final boolean j() {
        byte byteValue = ((Byte) o(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        b1 b1Var = b1.f6235c;
        Objects.requireNonNull(b1Var);
        boolean f10 = b1Var.a(getClass()).f(this);
        o(f.SET_MEMOIZED_IS_INITIALIZED);
        return f10;
    }

    public final void l(int i) {
        this.memoizedSerializedSize = i;
    }

    public final <MessageType extends x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType n() {
        return (a) o(f.NEW_BUILDER);
    }

    public abstract Object o(f fVar);

    /* renamed from: q */
    public final MessageType c() {
        return (x) o(f.GET_DEFAULT_INSTANCE);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }
}
