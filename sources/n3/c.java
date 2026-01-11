package n3;

import android.content.Context;
import android.net.Uri;
import b4.b;
import g3.h;
import h3.a;
import java.io.InputStream;
import m3.o;
import m3.p;
import m3.s;
import p3.b0;

public final class c implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8880a;

    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f8881a;

        public a(Context context) {
            this.f8881a = context;
        }

        public final o<Uri, InputStream> b(s sVar) {
            return new c(this.f8881a);
        }
    }

    public c(Context context) {
        this.f8880a = context.getApplicationContext();
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri = (Uri) obj;
        boolean z = true;
        if (i != Integer.MIN_VALUE && i10 != Integer.MIN_VALUE && i <= 512 && i10 <= 384) {
            Long l10 = (Long) hVar.c(b0.f9575d);
            if (l10 == null || l10.longValue() != -1) {
                z = false;
            }
            if (z) {
                b bVar = new b(uri);
                Context context = this.f8880a;
                return new o.a(bVar, h3.a.c(context, uri, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return a.b.m0(uri) && uri.getPathSegments().contains("video");
    }
}
