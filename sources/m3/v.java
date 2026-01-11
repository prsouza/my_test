package m3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import g3.h;
import java.io.File;
import java.io.InputStream;
import m3.o;

public final class v<Data> implements o<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final o<Uri, Data> f8458a;

    public static final class a implements p<String, AssetFileDescriptor> {
        public final o<String, AssetFileDescriptor> b(s sVar) {
            return new v(sVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        public final o<String, ParcelFileDescriptor> b(s sVar) {
            return new v(sVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<String, InputStream> {
        public final o<String, InputStream> b(s sVar) {
            return new v(sVar.b(Uri.class, InputStream.class));
        }
    }

    public v(o<Uri, Data> oVar) {
        this.f8458a = oVar;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.f8458a.b(uri)) {
            return null;
        }
        return this.f8458a.a(uri, i, i10, hVar);
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        return true;
    }
}
