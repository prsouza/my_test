package m3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.i;
import com.bumptech.glide.load.data.n;
import g3.h;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m3.o;

public final class x<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f8462b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f8463a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f8464a;

        public a(ContentResolver contentResolver) {
            this.f8464a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f8464a, uri);
        }

        public final o<Uri, AssetFileDescriptor> b(s sVar) {
            return new x(this);
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f8465a;

        public b(ContentResolver contentResolver) {
            this.f8465a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.f8465a, uri);
        }

        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new x(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f8466a;

        public d(ContentResolver contentResolver) {
            this.f8466a = contentResolver;
        }

        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new n(this.f8466a, uri);
        }

        public final o<Uri, InputStream> b(s sVar) {
            return new x(this);
        }
    }

    public x(c<Data> cVar) {
        this.f8463a = cVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new o.a(new b4.b(uri), this.f8463a.a(uri));
    }

    public final boolean b(Object obj) {
        return f8462b.contains(((Uri) obj).getScheme());
    }
}
