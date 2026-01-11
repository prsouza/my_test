package k0;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.e;
import s.g;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final e<String, Typeface> f7369a = new e<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f7370b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f7371c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final g<String, ArrayList<m0.a<a>>> f7372d = new g<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f7370b = threadPoolExecutor;
    }

    public static String a(e eVar, int i) {
        return eVar.f7358e + "-" + i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static k0.j.a b(java.lang.String r6, android.content.Context r7, k0.e r8, int r9) {
        /*
            s.e<java.lang.String, android.graphics.Typeface> r0 = f7369a
            java.lang.Object r0 = r0.get(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            k0.j$a r6 = new k0.j$a
            r6.<init>((android.graphics.Typeface) r0)
            return r6
        L_0x0010:
            k0.k r8 = k0.d.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0060 }
            int r0 = r8.f7375a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r0 = -2
            goto L_0x003d
        L_0x001f:
            k0.l[] r0 = r8.f7376b
            if (r0 == 0) goto L_0x003c
            int r3 = r0.length
            if (r3 != 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x002a:
            if (r4 >= r2) goto L_0x003b
            r5 = r0[r4]
            int r5 = r5.f7381e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r0 = r1
            goto L_0x003d
        L_0x0036:
            r0 = r5
            goto L_0x003d
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r2 = r3
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            k0.j$a r6 = new k0.j$a
            r6.<init>((int) r0)
            return r6
        L_0x0045:
            k0.l[] r8 = r8.f7376b
            g0.k r0 = g0.e.f5210a
            android.graphics.Typeface r7 = r0.b(r7, r8, r9)
            if (r7 == 0) goto L_0x005a
            s.e<java.lang.String, android.graphics.Typeface> r8 = f7369a
            r8.put(r6, r7)
            k0.j$a r6 = new k0.j$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x005a:
            k0.j$a r6 = new k0.j$a
            r6.<init>((int) r1)
            return r6
        L_0x0060:
            k0.j$a r6 = new k0.j$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.j.b(java.lang.String, android.content.Context, k0.e, int):k0.j$a");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f7373a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7374b;

        public a(int i) {
            this.f7373a = null;
            this.f7374b = i;
        }

        public a(Typeface typeface) {
            this.f7373a = typeface;
            this.f7374b = 0;
        }
    }
}
