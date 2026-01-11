package m3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import m3.o;

public final class f<Data> implements o<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f8399a;

    public static class a<Data> implements p<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f8400a;

        public a(d<Data> dVar) {
            this.f8400a = dVar;
        }

        public final o<File, Data> b(s sVar) {
            return new f(this.f8400a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public final Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            public final Object b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public final void c(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final File f8401a;

        /* renamed from: b  reason: collision with root package name */
        public final d<Data> f8402b;

        /* renamed from: c  reason: collision with root package name */
        public Data f8403c;

        public c(File file, d<Data> dVar) {
            this.f8401a = file;
            this.f8402b = dVar;
        }

        public final Class<Data> a() {
            return this.f8402b.a();
        }

        public final void b() {
            Data data = this.f8403c;
            if (data != null) {
                try {
                    this.f8402b.c(data);
                } catch (IOException unused) {
                }
            }
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super Data> aVar) {
            try {
                Data b10 = this.f8402b.b(this.f8401a);
                this.f8403c = b10;
                aVar.d(b10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            public final Object b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            public final void c(Object obj) throws IOException {
                ((InputStream) obj).close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f8399a = dVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        File file = (File) obj;
        return new o.a(new b4.b(file), new c(file, this.f8399a));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        File file = (File) obj;
        return true;
    }
}
