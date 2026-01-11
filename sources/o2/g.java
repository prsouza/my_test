package o2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import io.sentry.cache.EnvelopeCache;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import uf.h;
import uf.p;
import uf.v;
import y2.t;
import z2.d;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, s<f>> f9210a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9211b = {80, 75, 3, 4};

    public class a implements n<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9212a;

        public a(String str) {
            this.f9212a = str;
        }

        /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, o2.s<o2.f>>, java.util.HashMap] */
        public final void a(Object obj) {
            f fVar = (f) obj;
            g.f9210a.remove(this.f9212a);
        }
    }

    public class b implements n<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9213a;

        public b(String str) {
            this.f9213a = str;
        }

        /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, o2.s<o2.f>>, java.util.HashMap] */
        public final void a(Object obj) {
            Throwable th2 = (Throwable) obj;
            g.f9210a.remove(this.f9213a);
        }
    }

    public class c implements Callable<q<f>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f9214a;

        public c(f fVar) {
            this.f9214a = fVar;
        }

        public final Object call() throws Exception {
            return new q(this.f9214a);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.Map<java.lang.String, o2.s<o2.f>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, o2.s<o2.f>>, java.util.HashMap] */
    public static s<f> a(String str, Callable<q<f>> callable) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            t2.g gVar = t2.g.f11275b;
            Objects.requireNonNull(gVar);
            fVar = gVar.f11276a.get(str);
        }
        if (fVar != null) {
            return new s<>(new c(fVar), false);
        }
        if (str != null) {
            ? r02 = f9210a;
            if (r02.containsKey(str)) {
                return (s) r02.get(str);
            }
        }
        s<f> sVar = new s<>(callable, false);
        if (str != null) {
            sVar.b(new a(str));
            sVar.a(new b(str));
            f9210a.put(str, sVar);
        }
        return sVar;
    }

    public static q<f> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip")) {
                if (!str.endsWith(".lottie")) {
                    return c(context.getAssets().open(str), str2);
                }
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new q<>((Throwable) e10);
        }
    }

    public static q<f> c(InputStream inputStream, String str) {
        try {
            h b10 = p.b(p.e(inputStream));
            String[] strArr = z2.c.f13770t;
            return d(new d(b10), str, true);
        } finally {
            a3.g.b(inputStream);
        }
    }

    public static q<f> d(z2.c cVar, String str, boolean z) {
        try {
            f a10 = t.a(cVar);
            if (str != null) {
                t2.g.f11275b.a(str, a10);
            }
            q<f> qVar = new q<>(a10);
            if (z) {
                a3.g.b(cVar);
            }
            return qVar;
        } catch (Exception e10) {
            q<f> qVar2 = new q<>((Throwable) e10);
            if (z) {
                a3.g.b(cVar);
            }
            return qVar2;
        } catch (Throwable th2) {
            if (z) {
                a3.g.b(cVar);
            }
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.util.Objects.requireNonNull(a3.c.f39a);
        r5 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o2.q<o2.f> e(android.content.Context r5, int r6, java.lang.String r7) {
        /*
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NotFoundException -> 0x005a }
            java.io.InputStream r5 = r5.openRawResource(r6)     // Catch:{ NotFoundException -> 0x005a }
            uf.b0 r5 = uf.p.e(r5)     // Catch:{ NotFoundException -> 0x005a }
            uf.v r6 = new uf.v     // Catch:{ NotFoundException -> 0x005a }
            r6.<init>(r5)     // Catch:{ NotFoundException -> 0x005a }
            uf.h r5 = r6.c()     // Catch:{ Exception -> 0x0034 }
            byte[] r0 = f9211b     // Catch:{ Exception -> 0x0034 }
            int r1 = r0.length     // Catch:{ Exception -> 0x0034 }
            r2 = 0
        L_0x0019:
            if (r2 >= r1) goto L_0x002c
            byte r3 = r0[r2]     // Catch:{ Exception -> 0x0034 }
            r4 = r5
            uf.v r4 = (uf.v) r4     // Catch:{ Exception -> 0x0034 }
            byte r4 = r4.readByte()     // Catch:{ Exception -> 0x0034 }
            if (r4 == r3) goto L_0x0029
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0034 }
            goto L_0x003b
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x0019
        L_0x002c:
            uf.v r5 = (uf.v) r5     // Catch:{ Exception -> 0x0034 }
            r5.close()     // Catch:{ Exception -> 0x0034 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0034 }
            goto L_0x003b
        L_0x0034:
            a3.b r5 = a3.c.f39a     // Catch:{ NotFoundException -> 0x005a }
            java.util.Objects.requireNonNull(r5)     // Catch:{ NotFoundException -> 0x005a }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ NotFoundException -> 0x005a }
        L_0x003b:
            boolean r5 = r5.booleanValue()     // Catch:{ NotFoundException -> 0x005a }
            if (r5 == 0) goto L_0x0050
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ NotFoundException -> 0x005a }
            uf.v$a r0 = new uf.v$a     // Catch:{ NotFoundException -> 0x005a }
            r0.<init>(r6)     // Catch:{ NotFoundException -> 0x005a }
            r5.<init>(r0)     // Catch:{ NotFoundException -> 0x005a }
            o2.q r5 = f(r5, r7)     // Catch:{ NotFoundException -> 0x005a }
            return r5
        L_0x0050:
            uf.v$a r5 = new uf.v$a     // Catch:{ NotFoundException -> 0x005a }
            r5.<init>(r6)     // Catch:{ NotFoundException -> 0x005a }
            o2.q r5 = c(r5, r7)     // Catch:{ NotFoundException -> 0x005a }
            return r5
        L_0x005a:
            r5 = move-exception
            o2.q r6 = new o2.q
            r6.<init>((java.lang.Throwable) r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.g.e(android.content.Context, int, java.lang.String):o2.q");
    }

    public static q<f> f(ZipInputStream zipInputStream, String str) {
        try {
            return g(zipInputStream, str);
        } finally {
            a3.g.b(zipInputStream);
        }
    }

    public static q<f> g(ZipInputStream zipInputStream, String str) {
        m mVar;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            f fVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(EnvelopeCache.SUFFIX_CURRENT_SESSION_FILE)) {
                    v vVar = new v(p.e(zipInputStream));
                    String[] strArr = z2.c.f13770t;
                    fVar = (f) d(new d(vVar), (String) null, false).f9292a;
                } else {
                    if (!name.contains(".png")) {
                        if (!name.contains(".webp")) {
                            zipInputStream.closeEntry();
                        }
                    }
                    String[] split = name.split("/");
                    hashMap.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new q<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<m> it = fVar.f9200d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        mVar = null;
                        break;
                    }
                    mVar = it.next();
                    if (mVar.f9267c.equals(str2)) {
                        break;
                    }
                }
                if (mVar != null) {
                    mVar.f9268d = a3.g.e((Bitmap) entry.getValue(), mVar.f9265a, mVar.f9266b);
                }
            }
            for (Map.Entry next : fVar.f9200d.entrySet()) {
                if (((m) next.getValue()).f9268d == null) {
                    StringBuilder d10 = a.a.d("There is no image for ");
                    d10.append(((m) next.getValue()).f9267c);
                    return new q<>((Throwable) new IllegalStateException(d10.toString()));
                }
            }
            if (str != null) {
                t2.g.f11275b.a(str, fVar);
            }
            return new q<>(fVar);
        } catch (IOException e10) {
            return new q<>((Throwable) e10);
        }
    }

    public static String h(Context context, int i) {
        StringBuilder d10 = a.a.d("rawRes");
        d10.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        d10.append(i);
        return d10.toString();
    }
}
