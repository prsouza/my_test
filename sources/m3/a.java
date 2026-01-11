package m3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.h;
import com.bumptech.glide.load.data.m;
import java.io.InputStream;
import m3.o;

public final class a<Data> implements o<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f8386a;

    /* renamed from: b  reason: collision with root package name */
    public final C0152a<Data> f8387b;

    /* renamed from: m3.a$a  reason: collision with other inner class name */
    public interface C0152a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, C0152a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f8388a;

        public b(AssetManager assetManager) {
            this.f8388a = assetManager;
        }

        public final d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }

        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new a(this.f8388a, this);
        }
    }

    public static class c implements p<Uri, InputStream>, C0152a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f8389a;

        public c(AssetManager assetManager) {
            this.f8389a = assetManager;
        }

        public final d<InputStream> a(AssetManager assetManager, String str) {
            return new m(assetManager, str);
        }

        public final o<Uri, InputStream> b(s sVar) {
            return new a(this.f8389a, this);
        }
    }

    public a(AssetManager assetManager, C0152a<Data> aVar) {
        this.f8386a = assetManager;
        this.f8387b = aVar;
    }

    public final o.a a(Object obj, int i, int i10, g3.h hVar) {
        Uri uri = (Uri) obj;
        return new o.a(new b4.b(uri), this.f8387b.a(this.f8386a, uri.toString().substring(22)));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
