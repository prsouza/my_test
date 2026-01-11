package m3;

import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import m3.o;

public final class d implements o<File, ByteBuffer> {

    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a  reason: collision with root package name */
        public final File f8393a;

        public a(File file) {
            this.f8393a = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.d(c4.a.a(this.f8393a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public static class b implements p<File, ByteBuffer> {
        public final o<File, ByteBuffer> b(s sVar) {
            return new d();
        }
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        File file = (File) obj;
        return new o.a(new b4.b(file), new a(file));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
