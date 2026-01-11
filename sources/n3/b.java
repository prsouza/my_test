package n3;

import android.content.Context;
import android.net.Uri;
import g3.h;
import h3.a;
import java.io.InputStream;
import m3.o;
import m3.p;
import m3.s;

public final class b implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8878a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f8879a;

        public a(Context context) {
            this.f8879a = context;
        }

        public final o<Uri, InputStream> b(s sVar) {
            return new b(this.f8879a);
        }
    }

    public b(Context context) {
        this.f8878a = context.getApplicationContext();
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri = (Uri) obj;
        if (!(i != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i <= 512 && i10 <= 384)) {
            return null;
        }
        b4.b bVar = new b4.b(uri);
        Context context = this.f8878a;
        return new o.a(bVar, h3.a.c(context, uri, new a.C0093a(context.getContentResolver())));
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return a.b.m0(uri) && !uri.getPathSegments().contains("video");
    }
}
