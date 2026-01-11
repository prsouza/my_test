package p3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public interface s {

    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final k f9628a;

        /* renamed from: b  reason: collision with root package name */
        public final j3.b f9629b;

        /* renamed from: c  reason: collision with root package name */
        public final List<ImageHeaderParser> f9630c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, j3.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f9629b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f9630c = list;
            this.f9628a = new k(inputStream, bVar);
        }

        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f9628a.a(), (Rect) null, options);
        }

        public final void b() {
            w wVar = this.f9628a.f3576a;
            synchronized (wVar) {
                wVar.f9640c = wVar.f9638a.length;
            }
        }

        public final int c() throws IOException {
            return c.a(this.f9630c, this.f9628a.a(), this.f9629b);
        }

        public final ImageHeaderParser.ImageType d() throws IOException {
            return c.c(this.f9630c, this.f9628a.a(), this.f9629b);
        }
    }

    public static final class b implements s {

        /* renamed from: a  reason: collision with root package name */
        public final j3.b f9631a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f9632b;

        /* renamed from: c  reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f9633c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, j3.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.f9631a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f9632b = list;
            this.f9633c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f9633c.a().getFileDescriptor(), (Rect) null, options);
        }

        public final void b() {
        }

        public final int c() throws IOException {
            return c.b(this.f9632b, new com.bumptech.glide.load.b(this.f9633c, this.f9631a));
        }

        public final ImageHeaderParser.ImageType d() throws IOException {
            return c.d(this.f9632b, new com.bumptech.glide.load.a(this.f9633c, this.f9631a));
        }
    }

    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
