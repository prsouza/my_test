package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f4887a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f4888b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4889c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f4890a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f4891b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f4890a = colorStateList;
            this.f4891b = configuration;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f4892a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f4893b;

        public b(Resources resources, Resources.Theme theme) {
            this.f4892a = resources;
            this.f4893b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.f4892a.equals(bVar.f4892a) || !Objects.equals(this.f4893b, bVar.f4893b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f4892a, this.f4893b});
        }
    }

    public static abstract class c {
        public static Handler c() {
            return new Handler(Looper.getMainLooper());
        }

        public final void a(int i) {
            c().post(new h(this, i));
        }

        public final void b(Typeface typeface) {
            c().post(new g(this, typeface));
        }

        public abstract void d(int i);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, (c) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r14, int r15, android.util.TypedValue r16, int r17, f0.f.c r18, boolean r19, boolean r20) {
        /*
            r8 = r15
            r0 = r16
            r5 = r17
            r9 = r18
            android.content.res.Resources r3 = r14.getResources()
            r1 = 1
            r3.getValue(r15, r0, r1)
            java.lang.String r10 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00d7
            java.lang.String r11 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r11.startsWith(r0)
            r12 = -3
            r13 = 0
            if (r0 != 0) goto L_0x002a
            if (r9 == 0) goto L_0x00b3
            r9.a(r12)
            goto L_0x00b3
        L_0x002a:
            s.e<java.lang.String, android.graphics.Typeface> r0 = g0.e.f5211b
            java.lang.String r1 = g0.e.c(r3, r15, r5)
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0040
            if (r9 == 0) goto L_0x003d
            r9.b(r0)
        L_0x003d:
            r13 = r0
            goto L_0x00b3
        L_0x0040:
            if (r20 == 0) goto L_0x0044
            goto L_0x00b3
        L_0x0044:
            java.lang.String r0 = r11.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            if (r0 == 0) goto L_0x0072
            android.content.res.XmlResourceParser r0 = r3.getXml(r15)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            f0.d$a r2 = f0.d.a(r0, r3)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            if (r2 != 0) goto L_0x0065
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r10, r0)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            if (r9 == 0) goto L_0x00b3
            r9.a(r12)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            goto L_0x00b3
        L_0x0065:
            r1 = r14
            r4 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            android.graphics.Typeface r13 = g0.e.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            goto L_0x00b3
        L_0x0072:
            r0 = r14
            android.graphics.Typeface r0 = g0.e.b(r14, r3, r15, r11, r5)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            if (r9 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x007f
            r9.b(r0)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            goto L_0x003d
        L_0x007f:
            r9.a(r12)     // Catch:{ XmlPullParserException -> 0x0099, IOException -> 0x0083 }
            goto L_0x003d
        L_0x0083:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1, r0)
            goto L_0x00ae
        L_0x0099:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r10, r1, r0)
        L_0x00ae:
            if (r9 == 0) goto L_0x00b3
            r9.a(r12)
        L_0x00b3:
            if (r13 != 0) goto L_0x00d6
            if (r9 != 0) goto L_0x00d6
            if (r20 == 0) goto L_0x00ba
            goto L_0x00d6
        L_0x00ba:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r15)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            return r13
        L_0x00d7:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = a.a.d(r2)
            java.lang.String r3 = r3.getResourceName(r15)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.f.b(android.content.Context, int, android.util.TypedValue, int, f0.f$c, boolean, boolean):android.graphics.Typeface");
    }
}
