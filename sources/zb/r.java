package zb;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import le.x;
import zb.a;
import zb.a0;
import zb.q;
import zb.r;
import zb.r.a;
import zb.t;

public abstract class r<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a<MessageType, BuilderType> {

    /* renamed from: b  reason: collision with root package name */
    public c f14356b = c.f14273d;

    /* renamed from: c  reason: collision with root package name */
    public int f14357c = -1;

    public static abstract class a<MessageType extends r<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.C0285a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        public final MessageType f14358a;

        /* renamed from: b  reason: collision with root package name */
        public MessageType f14359b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14360c = false;

        public a(MessageType messagetype) {
            this.f14358a = messagetype;
            this.f14359b = (r) messagetype.g(h.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
        }

        public final a0 b() {
            return this.f14358a;
        }

        public final Object clone() {
            a aVar = (a) this.f14358a.g(h.NEW_BUILDER, (Object) null, (Object) null);
            aVar.h(j());
            return aVar;
        }

        public final BuilderType g(m mVar, p pVar) {
            k();
            try {
                this.f14359b.g(h.MERGE_FROM_STREAM, mVar, pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public final BuilderType h(MessageType messagetype) {
            k();
            this.f14359b.l(g.f14366a, messagetype);
            return this;
        }

        public final MessageType i() {
            MessageType j10 = j();
            Objects.requireNonNull(j10);
            if (j10.g(h.IS_INITIALIZED, Boolean.TRUE, (Object) null) != null) {
                return j10;
            }
            throw new x();
        }

        public final MessageType j() {
            if (this.f14360c) {
                return this.f14359b;
            }
            this.f14359b.p();
            this.f14360c = true;
            return this.f14359b;
        }

        public final void k() {
            if (this.f14360c) {
                MessageType messagetype = (r) this.f14359b.g(h.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
                messagetype.l(g.f14366a, this.f14359b);
                this.f14359b = messagetype;
                this.f14360c = false;
            }
        }
    }

    public static class b<T extends r<T, ?>> extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f14361a;

        public b(T t10) {
            this.f14361a = t10;
        }

        public final Object a(m mVar, p pVar) {
            return r.h(this.f14361a, mVar, pVar);
        }
    }

    public static class c implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final c f14362a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final a f14363b = new a();

        public static final class a extends RuntimeException {
        }

        public final q<e> a(q<e> qVar, q<e> qVar2) {
            if (qVar.equals(qVar2)) {
                return qVar;
            }
            throw f14363b;
        }

        public final void b(boolean z) {
            if (z) {
                throw f14363b;
            }
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            if (z && ((r) obj).m(this, (a0) obj2)) {
                return obj;
            }
            throw f14363b;
        }

        public final int d(boolean z, int i, boolean z10, int i10) {
            if (z == z10 && i == i10) {
                return i;
            }
            throw f14363b;
        }

        public final boolean e(boolean z, boolean z10, boolean z11, boolean z12) {
            if (z == z11 && z10 == z12) {
                return z10;
            }
            throw f14363b;
        }

        public final t.b f(t.b bVar, t.b bVar2) {
            if (bVar.equals(bVar2)) {
                return bVar;
            }
            throw f14363b;
        }

        public final <T extends a0> T g(T t10, T t11) {
            if (t10 == null && t11 == null) {
                return null;
            }
            if (t10 == null || t11 == null) {
                throw f14363b;
            }
            ((r) t10).m(this, t11);
            return t10;
        }

        public final double h(boolean z, double d10, boolean z10, double d11) {
            if (z == z10 && d10 == d11) {
                return d10;
            }
            throw f14363b;
        }

        public final <K, V> z<K, V> i(z<K, V> zVar, z<K, V> zVar2) {
            if (zVar.equals(zVar2)) {
                return zVar;
            }
            throw f14363b;
        }

        public final long j(boolean z, long j10, boolean z10, long j11) {
            if (z == z10 && j10 == j11) {
                return j10;
            }
            throw f14363b;
        }

        public final <T> t.c<T> k(t.c<T> cVar, t.c<T> cVar2) {
            if (cVar.equals(cVar2)) {
                return cVar;
            }
            throw f14363b;
        }

        public final float l(boolean z, float f10, boolean z10, float f11) {
            if (z == z10 && f10 == f11) {
                return f10;
            }
            throw f14363b;
        }

        public final c m(c cVar, c cVar2) {
            if (cVar.equals(cVar2)) {
                return cVar;
            }
            throw f14363b;
        }

        public final h n(boolean z, h hVar, boolean z10, h hVar2) {
            if (z == z10 && hVar.equals(hVar2)) {
                return hVar;
            }
            throw f14363b;
        }

        public final String o(boolean z, String str, boolean z10, String str2) {
            if (z == z10 && str.equals(str2)) {
                return str;
            }
            throw f14363b;
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends r<MessageType, BuilderType> implements b0 {

        /* renamed from: s  reason: collision with root package name */
        public q<e> f14364s = new q<>();

        public final /* bridge */ /* synthetic */ a0 b() {
            return b();
        }

        public final /* bridge */ /* synthetic */ a0.a c() {
            return c();
        }

        public final void l(i iVar, r rVar) {
            d dVar = (d) rVar;
            g(h.VISIT, iVar, dVar);
            this.f14356b = iVar.m(this.f14356b, dVar.f14356b);
            this.f14364s = iVar.a(this.f14364s, dVar.f14364s);
        }

        /* JADX WARNING: type inference failed for: r1v1, types: [zb.f0, zb.g0<FieldDescriptorType, java.lang.Object>] */
        public final void p() {
            r.super.p();
            q<e> qVar = this.f14364s;
            if (!qVar.f14354b) {
                qVar.f14353a.i();
                qVar.f14354b = true;
            }
        }
    }

    public static final class e implements q.a<e> {
        public final k a() {
            throw null;
        }

        public final void b() {
        }

        public final a0.a c(a0.a aVar, a0 a0Var) {
            a aVar2 = (a) aVar;
            aVar2.h((r) a0Var);
            return aVar2;
        }

        public final void c() {
        }

        public final int compareTo(Object obj) {
            Objects.requireNonNull((e) obj);
            return 0;
        }
    }

    public static class f implements i {

        /* renamed from: a  reason: collision with root package name */
        public int f14365a = 0;

        public final q<e> a(q<e> qVar, q<e> qVar2) {
            this.f14365a = qVar.f14353a.hashCode() + (this.f14365a * 53);
            return qVar;
        }

        public final void b(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            a0 a0Var = (a0) obj;
            g(a0Var, (a0) obj2);
            return a0Var;
        }

        public final int d(boolean z, int i, boolean z10, int i10) {
            this.f14365a = (this.f14365a * 53) + i;
            return i;
        }

        public final boolean e(boolean z, boolean z10, boolean z11, boolean z12) {
            int i = this.f14365a * 53;
            Charset charset = t.f14377a;
            this.f14365a = i + (z10 ? 1231 : 1237);
            return z10;
        }

        public final t.b f(t.b bVar, t.b bVar2) {
            this.f14365a = bVar.hashCode() + (this.f14365a * 53);
            return bVar;
        }

        public final <T extends a0> T g(T t10, T t11) {
            int i;
            if (t10 == null) {
                i = 37;
            } else if (t10 instanceof r) {
                r rVar = (r) t10;
                if (rVar.f14272a == 0) {
                    int i10 = this.f14365a;
                    this.f14365a = 0;
                    rVar.l(this, rVar);
                    rVar.f14272a = this.f14365a;
                    this.f14365a = i10;
                }
                i = rVar.f14272a;
            } else {
                i = t10.hashCode();
            }
            this.f14365a = (this.f14365a * 53) + i;
            return t10;
        }

        public final double h(boolean z, double d10, boolean z10, double d11) {
            long doubleToLongBits = Double.doubleToLongBits(d10);
            Charset charset = t.f14377a;
            this.f14365a = (this.f14365a * 53) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
            return d10;
        }

        public final <K, V> z<K, V> i(z<K, V> zVar, z<K, V> zVar2) {
            this.f14365a = zVar.hashCode() + (this.f14365a * 53);
            return zVar;
        }

        public final long j(boolean z, long j10, boolean z10, long j11) {
            Charset charset = t.f14377a;
            this.f14365a = (this.f14365a * 53) + ((int) ((j10 >>> 32) ^ j10));
            return j10;
        }

        public final <T> t.c<T> k(t.c<T> cVar, t.c<T> cVar2) {
            this.f14365a = cVar.hashCode() + (this.f14365a * 53);
            return cVar;
        }

        public final float l(boolean z, float f10, boolean z10, float f11) {
            this.f14365a = Float.floatToIntBits(f10) + (this.f14365a * 53);
            return f10;
        }

        public final c m(c cVar, c cVar2) {
            this.f14365a = cVar.hashCode() + (this.f14365a * 53);
            return cVar;
        }

        public final h n(boolean z, h hVar, boolean z10, h hVar2) {
            this.f14365a = hVar.hashCode() + (this.f14365a * 53);
            return hVar;
        }

        public final String o(boolean z, String str, boolean z10, String str2) {
            this.f14365a = str.hashCode() + (this.f14365a * 53);
            return str;
        }
    }

    public static class g implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final g f14366a = new g();

        public final q<e> a(q<e> qVar, q<e> qVar2) {
            if (qVar.f14354b) {
                qVar = qVar.clone();
            }
            for (int i = 0; i < qVar2.f14353a.f14290b.size(); i++) {
                qVar.c(qVar2.f14353a.d(i));
            }
            for (Map.Entry<FieldDescriptorType, Object> c10 : qVar2.f14353a.f()) {
                qVar.c(c10);
            }
            return qVar;
        }

        public final void b(boolean z) {
        }

        public final Object c(boolean z, Object obj, Object obj2) {
            return z ? g((a0) obj, (a0) obj2) : obj2;
        }

        public final int d(boolean z, int i, boolean z10, int i10) {
            return z10 ? i10 : i;
        }

        public final boolean e(boolean z, boolean z10, boolean z11, boolean z12) {
            return z11 ? z12 : z10;
        }

        public final t.b f(t.b bVar, t.b bVar2) {
            s sVar = (s) bVar;
            int i = sVar.f14376c;
            int i10 = ((s) bVar2).f14376c;
            s sVar2 = bVar;
            

            public enum h {
                IS_INITIALIZED,
                VISIT,
                MERGE_FROM_STREAM,
                MAKE_IMMUTABLE,
                NEW_MUTABLE_INSTANCE,
                NEW_BUILDER,
                GET_DEFAULT_INSTANCE,
                GET_PARSER
            }

            public interface i {
                q<e> a(q<e> qVar, q<e> qVar2);

                void b(boolean z);

                Object c(boolean z, Object obj, Object obj2);

                int d(boolean z, int i, boolean z10, int i10);

                boolean e(boolean z, boolean z10, boolean z11, boolean z12);

                t.b f(t.b bVar, t.b bVar2);

                <T extends a0> T g(T t10, T t11);

                double h(boolean z, double d10, boolean z10, double d11);

                <K, V> z<K, V> i(z<K, V> zVar, z<K, V> zVar2);

                long j(boolean z, long j10, boolean z10, long j11);

                <T> t.c<T> k(t.c<T> cVar, t.c<T> cVar2);

                float l(boolean z, float f10, boolean z10, float f11);

                c m(c cVar, c cVar2);

                h n(boolean z, h hVar, boolean z10, h hVar2);

                String o(boolean z, String str, boolean z10, String str2);
            }

            public static Object f(Method method, Object obj, Object... objArr) {
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

            public static <T extends r<T, ?>> T h(T t10, m mVar, p pVar) {
                T t11 = (r) t10.g(h.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
                try {
                    t11.g(h.MERGE_FROM_STREAM, mVar, pVar);
                    t11.p();
                    return t11;
                } catch (RuntimeException e10) {
                    if (e10.getCause() instanceof u) {
                        throw ((u) e10.getCause());
                    }
                    throw e10;
                }
            }

            public static <T extends r<T, ?>> T i(T t10, byte[] bArr) {
                p a10 = p.a();
                try {
                    int length = bArr.length;
                    boolean z = false;
                    m mVar = new m(bArr, length);
                    mVar.d(length);
                    T h10 = h(t10, mVar, a10);
                    mVar.c(0);
                    if (h10.g(h.IS_INITIALIZED, Boolean.TRUE, (Object) null) != null) {
                        z = true;
                    }
                    if (z) {
                        return h10;
                    }
                    throw new u(new x().getMessage());
                } catch (u e10) {
                    throw new IllegalArgumentException(e10);
                } catch (u e11) {
                    throw e11;
                } catch (u e12) {
                    throw e12;
                }
            }

            public static t.b j(t.b bVar) {
                s sVar = (s) bVar;
                int i10 = sVar.f14376c;
                return sVar.c(i10 == 0 ? 10 : i10 * 2);
            }

            public static <E> t.c<E> k(t.c<E> cVar) {
                int size = cVar.size();
                return cVar.c(size == 0 ? 10 : size * 2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!b().getClass().isInstance(obj)) {
                    return false;
                }
                try {
                    l(c.f14362a, (r) obj);
                    return true;
                } catch (c.a unused) {
                    return false;
                }
            }

            public abstract Object g(h hVar, Object obj, Object obj2);

            public final int hashCode() {
                if (this.f14272a == 0) {
                    f fVar = new f();
                    l(fVar, this);
                    this.f14272a = fVar.f14365a;
                }
                return this.f14272a;
            }

            public void l(i iVar, MessageType messagetype) {
                g(h.VISIT, iVar, messagetype);
                this.f14356b = iVar.m(this.f14356b, messagetype.f14356b);
            }

            public final boolean m(c cVar, a0 a0Var) {
                if (this == a0Var) {
                    return true;
                }
                if (!b().getClass().isInstance(a0Var)) {
                    return false;
                }
                l(cVar, (r) a0Var);
                return true;
            }

            /* renamed from: n */
            public final MessageType b() {
                return (r) g(h.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
            }

            public final d0<MessageType> o() {
                return (d0) g(h.GET_PARSER, (Object) null, (Object) null);
            }

            public void p() {
                g(h.MAKE_IMMUTABLE, (Object) null, (Object) null);
                Objects.requireNonNull(this.f14356b);
            }

            /* renamed from: q */
            public final BuilderType c() {
                BuilderType buildertype = (a) g(h.NEW_BUILDER, (Object) null, (Object) null);
                buildertype.h(this);
                return buildertype;
            }

            public final String toString() {
                String obj = super.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("# ");
                sb2.append(obj);
                c0.c(this, sb2, 0);
                return sb2.toString();
            }
        }
