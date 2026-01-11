package m3;

import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m3.o;

public final class b<Data> implements o<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0154b<Data> f8390a;

    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: m3.b$a$a  reason: collision with other inner class name */
        public class C0153a implements C0154b<ByteBuffer> {
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            public final Object b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public final o<byte[], ByteBuffer> b(s sVar) {
            return new b(new C0153a());
        }
    }

    /* renamed from: m3.b$b  reason: collision with other inner class name */
    public interface C0154b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f8391a;

        /* renamed from: b  reason: collision with root package name */
        public final C0154b<Data> f8392b;

        public c(byte[] bArr, C0154b<Data> bVar) {
            this.f8391a = bArr;
            this.f8392b = bVar;
        }

        public final Class<Data> a() {
            return this.f8392b.a();
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super Data> aVar) {
            aVar.d(this.f8392b.b(this.f8391a));
        }
    }

    public static class d implements p<byte[], InputStream> {

        public class a implements C0154b<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public final o<byte[], InputStream> b(s sVar) {
            return new b(new a());
        }
    }

    public b(C0154b<Data> bVar) {
        this.f8390a = bVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        byte[] bArr = (byte[]) obj;
        return new o.a(new b4.b(bArr), new c(bArr, this.f8390a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
