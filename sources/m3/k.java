package m3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.File;
import java.io.FileNotFoundException;
import m3.o;

public final class k implements o<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8416a;

    public static final class a implements p<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f8417a;

        public a(Context context) {
            this.f8417a = context;
        }

        public final o<Uri, File> b(s sVar) {
            return new k(this.f8417a);
        }
    }

    public static class b implements d<File> {

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f8418c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f8419a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f8420b;

        public b(Context context, Uri uri) {
            this.f8419a = context;
            this.f8420b = uri;
        }

        public final Class<File> a() {
            return File.class;
        }

        public final void b() {
        }

        public final void cancel() {
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super File> aVar) {
            Cursor query = this.f8419a.getContentResolver().query(this.f8420b, f8418c, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder d10 = a.a.d("Failed to find file path for: ");
                d10.append(this.f8420b);
                aVar.c(new FileNotFoundException(d10.toString()));
                return;
            }
            aVar.d(new File(str));
        }
    }

    public k(Context context) {
        this.f8416a = context;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new o.a(new b4.b(uri), new b(this.f8416a, uri));
    }

    public final boolean b(Object obj) {
        return a.b.m0((Uri) obj);
    }
}
