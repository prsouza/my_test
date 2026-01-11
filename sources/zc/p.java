package zc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.xxhash.XXHash64;
import xd.l;
import yd.h;

public enum p {
    Blake2_128(a.f14463b),
    Blake2_256(b.f14464b),
    Blake2_128Concat(c.f14465b),
    Twox128(new d(jc.c.f7148f)),
    Twox256(new e(jc.c.g)),
    Twox64Concat(new f(r3)),
    Identity(g.f14466b);
    
    private final l<byte[], byte[]> hashingFunction;

    public static final class a extends h implements l<byte[], byte[]> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f14463b = null;

        static {
            f14463b = new a();
        }

        public a() {
            super(1);
        }

        public final Object k(Object obj) {
            byte[] digest;
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "it");
            jc.c cVar = jc.c.f7149h;
            synchronized (jc.c.f7143a) {
                digest = jc.c.f7145c.digest(bArr);
            }
            e6.e.C(digest, "it.blake2b128()");
            return digest;
        }
    }

    public static final class b extends h implements l<byte[], byte[]> {

        /* renamed from: b  reason: collision with root package name */
        public static final b f14464b = null;

        static {
            f14464b = new b();
        }

        public b() {
            super(1);
        }

        public final Object k(Object obj) {
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "it");
            byte[] a10 = jc.c.f7149h.a(bArr);
            e6.e.C(a10, "it.blake2b256()");
            return a10;
        }
    }

    public static final class c extends h implements l<byte[], byte[]> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f14465b = null;

        static {
            f14465b = new c();
        }

        public c() {
            super(1);
        }

        public final Object k(Object obj) {
            byte[] J;
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "it");
            jc.c cVar = jc.c.f7149h;
            synchronized (jc.c.f7143a) {
                jc.a aVar = jc.c.f7145c;
                e6.e.D(aVar, "$this$hashConcat");
                byte[] digest = aVar.digest(bArr);
                e6.e.C(digest, "digest(bytes)");
                J = nd.d.J(digest, bArr);
            }
            return J;
        }
    }

    public static final /* synthetic */ class d extends yd.g implements l<byte[], byte[]> {
        public d(jc.d dVar) {
            super(dVar, jc.d.class, "hash", "hash([B)[B", 0);
        }

        public final Object k(Object obj) {
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "p1");
            return ((jc.d) this.f13605b).a(bArr);
        }
    }

    public static final /* synthetic */ class e extends yd.g implements l<byte[], byte[]> {
        public e(jc.d dVar) {
            super(dVar, jc.d.class, "hash", "hash([B)[B", 0);
        }

        public final Object k(Object obj) {
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "p1");
            return ((jc.d) this.f13605b).a(bArr);
        }
    }

    public static final /* synthetic */ class f extends yd.g implements l<byte[], byte[]> {
        public f(XXHash64 xXHash64) {
            super(xXHash64, jc.b.class, "hashConcat", "hashConcat(Lnet/jpountz/xxhash/XXHash64;[B)[B", 1);
        }

        public final Object k(Object obj) {
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "p1");
            XXHash64 xXHash64 = (XXHash64) this.f13605b;
            e6.e.D(xXHash64, "$this$hashConcat");
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 8);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putLong(xXHash64.hash(bArr, 0, bArr.length, 0));
            allocate.put(bArr);
            byte[] array = allocate.array();
            e6.e.C(array, "hashBytes.array()");
            return array;
        }
    }

    public static final class g extends h implements l<byte[], byte[]> {

        /* renamed from: b  reason: collision with root package name */
        public static final g f14466b = null;

        static {
            f14466b = new g();
        }

        public g() {
            super(1);
        }

        public final Object k(Object obj) {
            byte[] bArr = (byte[]) obj;
            e6.e.D(bArr, "it");
            return bArr;
        }
    }

    private p(l<? super byte[], byte[]> lVar) {
        this.hashingFunction = lVar;
    }

    public final l<byte[], byte[]> getHashingFunction() {
        return this.hashingFunction;
    }
}
