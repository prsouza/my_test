package n3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import m3.o;
import m3.p;
import m3.s;

public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8882a;

    /* renamed from: b  reason: collision with root package name */
    public final o<File, DataT> f8883b;

    /* renamed from: c  reason: collision with root package name */
    public final o<Uri, DataT> f8884c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f8885d;

    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f8886a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f8887b;

        public a(Context context, Class<DataT> cls) {
            this.f8886a = context;
            this.f8887b = cls;
        }

        public final o<Uri, DataT> b(s sVar) {
            return new d(this.f8886a, sVar.b(File.class, this.f8887b), sVar.b(Uri.class, this.f8887b), this.f8887b);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: n3.d$d  reason: collision with other inner class name */
    public static final class C0165d<DataT> implements com.bumptech.glide.load.data.d<DataT> {
        public static final String[] z = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f8888a;

        /* renamed from: b  reason: collision with root package name */
        public final o<File, DataT> f8889b;

        /* renamed from: c  reason: collision with root package name */
        public final o<Uri, DataT> f8890c;

        /* renamed from: s  reason: collision with root package name */
        public final Uri f8891s;

        /* renamed from: t  reason: collision with root package name */
        public final int f8892t;

        /* renamed from: u  reason: collision with root package name */
        public final int f8893u;

        /* renamed from: v  reason: collision with root package name */
        public final h f8894v;

        /* renamed from: w  reason: collision with root package name */
        public final Class<DataT> f8895w;

        /* renamed from: x  reason: collision with root package name */
        public volatile boolean f8896x;

        /* renamed from: y  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f8897y;

        public C0165d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i, int i10, h hVar, Class<DataT> cls) {
            this.f8888a = context.getApplicationContext();
            this.f8889b = oVar;
            this.f8890c = oVar2;
            this.f8891s = uri;
            this.f8892t = i;
            this.f8893u = i10;
            this.f8894v = hVar;
            this.f8895w = cls;
        }

        public final Class<DataT> a() {
            return this.f8895w;
        }

        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8897y;
            if (dVar != null) {
                dVar.b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.d<DataT> c() throws java.io.FileNotFoundException {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                m3.o<java.io.File, DataT> r0 = r9.f8889b
                android.net.Uri r8 = r9.f8891s
                android.content.Context r2 = r9.f8888a     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = z     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f8892t
                int r3 = r9.f8893u
                g3.h r5 = r9.f8894v
                m3.o$a r0 = r0.a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f8888a
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f8891s
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f8891s
            L_0x0096:
                m3.o<android.net.Uri, DataT> r2 = r9.f8890c
                int r3 = r9.f8892t
                int r4 = r9.f8893u
                g3.h r5 = r9.f8894v
                m3.o$a r0 = r2.a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                com.bumptech.glide.load.data.d<Data> r1 = r0.f8428c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.d.C0165d.c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f8896x = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8897y;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        public final g3.a e() {
            return g3.a.LOCAL;
        }

        public final void f(g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c10 = c();
                if (c10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f8891s));
                    return;
                }
                this.f8897y = c10;
                if (this.f8896x) {
                    cancel();
                } else {
                    c10.f(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f8882a = context.getApplicationContext();
        this.f8883b = oVar;
        this.f8884c = oVar2;
        this.f8885d = cls;
    }

    public final o.a a(Object obj, int i, int i10, h hVar) {
        Uri uri = (Uri) obj;
        return new o.a(new b4.b(uri), new C0165d(this.f8882a, this.f8883b, this.f8884c, uri, i, i10, hVar, this.f8885d));
    }

    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && a.b.m0((Uri) obj);
    }
}
