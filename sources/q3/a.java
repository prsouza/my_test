package q3;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f10298a;

    /* renamed from: q3.a$a  reason: collision with other inner class name */
    public static class C0198a implements e.a<ByteBuffer> {
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final e b(Object obj) {
            return new a((ByteBuffer) obj);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f10298a = byteBuffer;
    }

    public final Object a() throws IOException {
        this.f10298a.position(0);
        return this.f10298a;
    }

    public final void b() {
    }
}
