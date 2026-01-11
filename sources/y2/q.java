package y2;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;
import s.h;
import z2.c;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f13407a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static h<WeakReference<Interpolator>> f13408b;

    /* renamed from: c  reason: collision with root package name */
    public static c.a f13409c = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> b3.a<T> a(z2.c r16, o2.f r17, float r18, y2.h0<T> r19, boolean r20) throws java.io.IOException {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            if (r20 == 0) goto L_0x0152
            java.lang.Class<y2.q> r3 = y2.q.class
            r16.c()
            r4 = 0
            r14 = r4
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
        L_0x0016:
            boolean r12 = r16.s()
            if (r12 == 0) goto L_0x0058
            z2.c$a r12 = f13409c
            int r12 = r0.S(r12)
            switch(r12) {
                case 0: goto L_0x0052;
                case 1: goto L_0x004d;
                case 2: goto L_0x0048;
                case 3: goto L_0x0043;
                case 4: goto L_0x003e;
                case 5: goto L_0x0033;
                case 6: goto L_0x002e;
                case 7: goto L_0x0029;
                default: goto L_0x0025;
            }
        L_0x0025:
            r16.a0()
            goto L_0x0016
        L_0x0029:
            android.graphics.PointF r13 = y2.p.b(r0, r1)
            goto L_0x0016
        L_0x002e:
            android.graphics.PointF r15 = y2.p.b(r0, r1)
            goto L_0x0016
        L_0x0033:
            int r7 = r16.y()
            r12 = 1
            if (r7 != r12) goto L_0x003c
            r7 = r12
            goto L_0x0016
        L_0x003c:
            r7 = 0
            goto L_0x0016
        L_0x003e:
            android.graphics.PointF r9 = y2.p.b(r0, r1)
            goto L_0x0016
        L_0x0043:
            android.graphics.PointF r8 = y2.p.b(r0, r1)
            goto L_0x0016
        L_0x0048:
            java.lang.Object r10 = r2.a(r0, r1)
            goto L_0x0016
        L_0x004d:
            java.lang.Object r11 = r2.a(r0, r1)
            goto L_0x0016
        L_0x0052:
            double r5 = r16.w()
            float r14 = (float) r5
            goto L_0x0016
        L_0x0058:
            r16.f()
            if (r7 == 0) goto L_0x0062
            android.view.animation.LinearInterpolator r0 = f13407a
            r12 = r11
            goto L_0x0140
        L_0x0062:
            if (r8 == 0) goto L_0x013c
            if (r9 == 0) goto L_0x013c
            float r0 = r8.x
            float r2 = -r1
            float r0 = a3.f.b(r0, r2, r1)
            r8.x = r0
            float r0 = r8.y
            r5 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r6 = 1120403456(0x42c80000, float:100.0)
            float r0 = a3.f.b(r0, r5, r6)
            r8.y = r0
            float r0 = r9.x
            float r0 = a3.f.b(r0, r2, r1)
            r9.x = r0
            float r0 = r9.y
            float r0 = a3.f.b(r0, r5, r6)
            r9.y = r0
            float r2 = r8.x
            float r5 = r8.y
            float r6 = r9.x
            java.lang.ThreadLocal<android.graphics.PathMeasure> r7 = a3.g.f50a
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x009d
            r7 = 527(0x20f, float:7.38E-43)
            float r7 = (float) r7
            float r7 = r7 * r2
            int r2 = (int) r7
            goto L_0x009f
        L_0x009d:
            r2 = 17
        L_0x009f:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00a8
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = (int) r2
        L_0x00a8:
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x00b1
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r6
            int r2 = (int) r2
        L_0x00b1:
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x00ba
            int r2 = r2 * 31
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = (int) r2
        L_0x00ba:
            monitor-enter(r3)
            s.h<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f13408b     // Catch:{ all -> 0x0139 }
            if (r0 != 0) goto L_0x00c6
            s.h r0 = new s.h     // Catch:{ all -> 0x0139 }
            r0.<init>()     // Catch:{ all -> 0x0139 }
            f13408b = r0     // Catch:{ all -> 0x0139 }
        L_0x00c6:
            s.h<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r0 = f13408b     // Catch:{ all -> 0x0139 }
            r5 = 0
            java.lang.Object r0 = r0.c(r2, r5)     // Catch:{ all -> 0x0139 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0139 }
            monitor-exit(r3)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00da
            java.lang.Object r5 = r0.get()
            r6 = r5
            android.view.animation.Interpolator r6 = (android.view.animation.Interpolator) r6
            goto L_0x00db
        L_0x00da:
            r6 = r5
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            if (r6 != 0) goto L_0x013e
        L_0x00df:
            float r0 = r8.x
            float r0 = r0 / r1
            r8.x = r0
            float r0 = r8.y
            float r0 = r0 / r1
            r8.y = r0
            float r0 = r9.x
            float r0 = r0 / r1
            r9.x = r0
            float r5 = r9.y
            float r5 = r5 / r1
            r9.y = r5
            float r1 = r8.x     // Catch:{ IllegalArgumentException -> 0x00fe }
            float r6 = r8.y     // Catch:{ IllegalArgumentException -> 0x00fe }
            android.view.animation.PathInterpolator r7 = new android.view.animation.PathInterpolator     // Catch:{ IllegalArgumentException -> 0x00fe }
            r7.<init>(r1, r6, r0, r5)     // Catch:{ IllegalArgumentException -> 0x00fe }
            r6 = r7
            goto L_0x0129
        L_0x00fe:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "The Path cannot loop back on itself."
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0123
            float r0 = r8.x
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            float r1 = r8.y
            float r5 = r9.x
            float r4 = java.lang.Math.max(r5, r4)
            float r5 = r9.y
            android.view.animation.PathInterpolator r6 = new android.view.animation.PathInterpolator
            r6.<init>(r0, r1, r4, r5)
            goto L_0x0129
        L_0x0123:
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r6 = r0
        L_0x0129:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013e }
            r0.<init>(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013e }
            monitor-enter(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013e }
            s.h<java.lang.ref.WeakReference<android.view.animation.Interpolator>> r1 = f13408b     // Catch:{ all -> 0x0136 }
            r1.g(r2, r0)     // Catch:{ all -> 0x0136 }
            monitor-exit(r3)     // Catch:{ all -> 0x0136 }
            goto L_0x013e
        L_0x0136:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0136 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013e }
        L_0x0139:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0139 }
            throw r0
        L_0x013c:
            android.view.animation.LinearInterpolator r6 = f13407a
        L_0x013e:
            r0 = r6
            r12 = r10
        L_0x0140:
            b3.a r1 = new b3.a
            r2 = 0
            r9 = r1
            r10 = r17
            r6 = r13
            r13 = r0
            r3 = r15
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r1.f2854m = r3
            r1.f2855n = r6
            return r1
        L_0x0152:
            java.lang.Object r0 = r2.a(r0, r1)
            b3.a r1 = new b3.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.q.a(z2.c, o2.f, float, y2.h0, boolean):b3.a");
    }
}
