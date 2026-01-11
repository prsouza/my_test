package g0;

import aa.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import f0.f;
import java.lang.reflect.Method;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f5210a;

    /* renamed from: b  reason: collision with root package name */
    public static final s.e<String, Typeface> f5211b = new s.e<>(16);

    public static class a extends b {
        public f.c I;

        public a(f.c cVar) {
            this.I = cVar;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f5210a = new j();
        } else if (i >= 28) {
            f5210a = new i();
        } else if (i >= 26) {
            f5210a = new h();
        } else {
            if (i >= 24) {
                Method method = g.f5219d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f5210a = new g();
                }
            }
            f5210a = new f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r7, f0.d.a r8, android.content.res.Resources r9, int r10, int r11, f0.f.c r12, boolean r13) {
        /*
            boolean r0 = r8 instanceof f0.d.C0074d
            r1 = -3
            if (r0 == 0) goto L_0x011c
            f0.d$d r8 = (f0.d.C0074d) r8
            java.lang.String r0 = r8.f4884d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r12 == 0) goto L_0x002f
            r12.b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            r0 = 1
            if (r13 == 0) goto L_0x0038
            int r4 = r8.f4883c
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            if (r12 != 0) goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            r0 = -1
            if (r13 == 0) goto L_0x0041
            int r13 = r8.f4882b
            goto L_0x0042
        L_0x0041:
            r13 = r0
        L_0x0042:
            android.os.Handler r4 = f0.f.c.c()
            g0.e$a r5 = new g0.e$a
            r5.<init>(r12)
            k0.e r8 = r8.f4881a
            k0.c r12 = new k0.c
            r12.<init>(r5, r4)
            if (r3 == 0) goto L_0x00b4
            java.lang.String r3 = k0.j.a(r8, r11)
            s.e<java.lang.String, android.graphics.Typeface> r6 = k0.j.f7369a
            java.lang.Object r6 = r6.get(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x006d
            k0.a r7 = new k0.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x012f
        L_0x006d:
            if (r13 != r0) goto L_0x007a
            k0.j$a r7 = k0.j.b(r3, r7, r8, r11)
            r12.a(r7)
            android.graphics.Typeface r2 = r7.f7373a
            goto L_0x012f
        L_0x007a:
            k0.f r0 = new k0.f
            r0.<init>(r3, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = k0.j.f7370b     // Catch:{ InterruptedException -> 0x00a6 }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00a6 }
            long r3 = (long) r13
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x009f, InterruptedException -> 0x009d, TimeoutException -> 0x0095 }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x009f, InterruptedException -> 0x009d, TimeoutException -> 0x0095 }
            k0.j$a r7 = (k0.j.a) r7     // Catch:{ InterruptedException -> 0x00a6 }
            r12.a(r7)     // Catch:{ InterruptedException -> 0x00a6 }
            android.graphics.Typeface r2 = r7.f7373a     // Catch:{ InterruptedException -> 0x00a6 }
            goto L_0x012f
        L_0x0095:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00a6 }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00a6 }
            throw r7     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x009d:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x009f:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00a6 }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00a6 }
            throw r8     // Catch:{ InterruptedException -> 0x00a6 }
        L_0x00a6:
            aa.b r7 = r12.f7351a
            android.os.Handler r8 = r12.f7352b
            k0.b r12 = new k0.b
            r12.<init>(r7, r1)
            r8.post(r12)
            goto L_0x012f
        L_0x00b4:
            java.lang.String r13 = k0.j.a(r8, r11)
            s.e<java.lang.String, android.graphics.Typeface> r0 = k0.j.f7369a
            java.lang.Object r0 = r0.get(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00cc
            k0.a r7 = new k0.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x012f
        L_0x00cc:
            k0.g r0 = new k0.g
            r0.<init>(r12)
            java.lang.Object r3 = k0.j.f7371c
            monitor-enter(r3)
            s.g<java.lang.String, java.util.ArrayList<m0.a<k0.j$a>>> r12 = k0.j.f7372d     // Catch:{ all -> 0x0119 }
            java.lang.Object r1 = r12.getOrDefault(r13, r2)     // Catch:{ all -> 0x0119 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x00e3
            r1.add(r0)     // Catch:{ all -> 0x0119 }
            monitor-exit(r3)     // Catch:{ all -> 0x0119 }
            goto L_0x012f
        L_0x00e3:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0119 }
            r1.<init>()     // Catch:{ all -> 0x0119 }
            r1.add(r0)     // Catch:{ all -> 0x0119 }
            r12.put(r13, r1)     // Catch:{ all -> 0x0119 }
            monitor-exit(r3)     // Catch:{ all -> 0x0119 }
            k0.h r12 = new k0.h
            r12.<init>(r13, r7, r8, r11)
            java.util.concurrent.ThreadPoolExecutor r7 = k0.j.f7370b
            k0.i r8 = new k0.i
            r8.<init>(r13)
            android.os.Looper r13 = android.os.Looper.myLooper()
            if (r13 != 0) goto L_0x010b
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r13.<init>(r0)
            goto L_0x0110
        L_0x010b:
            android.os.Handler r13 = new android.os.Handler
            r13.<init>()
        L_0x0110:
            k0.n r0 = new k0.n
            r0.<init>(r13, r12, r8)
            r7.execute(r0)
            goto L_0x012f
        L_0x0119:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0119 }
            throw r7
        L_0x011c:
            g0.k r13 = f5210a
            f0.d$b r8 = (f0.d.b) r8
            android.graphics.Typeface r2 = r13.a(r7, r8, r9, r11)
            if (r12 == 0) goto L_0x012f
            if (r2 == 0) goto L_0x012c
            r12.b(r2)
            goto L_0x012f
        L_0x012c:
            r12.a(r1)
        L_0x012f:
            if (r2 == 0) goto L_0x013a
            s.e<java.lang.String, android.graphics.Typeface> r7 = f5211b
            java.lang.String r8 = c(r9, r10, r11)
            r7.put(r8, r2)
        L_0x013a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.e.a(android.content.Context, f0.d$a, android.content.res.Resources, int, int, f0.f$c, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i10) {
        Typeface d10 = f5210a.d(context, resources, i, str, i10);
        if (d10 != null) {
            f5211b.put(c(resources, i, i10), d10);
        }
        return d10;
    }

    public static String c(Resources resources, int i, int i10) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i10;
    }
}
