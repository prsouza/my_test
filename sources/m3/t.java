package m3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import g3.h;
import java.io.InputStream;
import m3.o;

public final class t<Data> implements o<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final o<Uri, Data> f8451a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f8452b;

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f8453a;

        public a(Resources resources) {
            this.f8453a = resources;
        }

        public final o<Integer, AssetFileDescriptor> b(s sVar) {
            return new t(this.f8453a, sVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f8454a;

        public b(Resources resources) {
            this.f8454a = resources;
        }

        public final o<Integer, ParcelFileDescriptor> b(s sVar) {
            return new t(this.f8454a, sVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f8455a;

        public c(Resources resources) {
            this.f8455a = resources;
        }

        public final o<Integer, InputStream> b(s sVar) {
            return new t(this.f8455a, sVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements p<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f8456a;

        public d(Resources resources) {
            this.f8456a = resources;
        }

        public final o<Integer, Uri> b(s sVar) {
            return new t(this.f8456a, w.f8459a);
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f8452b = resources;
        this.f8451a = oVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f8452b.getResourcePackageName(num.intValue()) + '/' + this.f8452b.getResourceTypeName(num.intValue()) + '/' + this.f8452b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f8451a.a(uri, i, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
