package sd;

import ae.b;
import ae.c;
import e6.e;
import java.lang.reflect.Method;

public class a {

    /* renamed from: sd.a$a  reason: collision with other inner class name */
    public static final class C0217a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f11099a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
            if (e6.e.r(r5, r0) != false) goto L_0x0036;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                e6.e.C(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x003d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = e6.e.r(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x0035
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                e6.e.C(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x002e
                r5 = r7[r3]
            L_0x002e:
                boolean r5 = e6.e.r(r5, r0)
                if (r5 == 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r8 = r3
            L_0x0036:
                if (r8 == 0) goto L_0x003a
                r5 = r6
                goto L_0x003d
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x003d:
                f11099a = r5
                int r0 = r1.length
            L_0x0040:
                if (r3 >= r0) goto L_0x0054
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = e6.e.r(r2, r4)
                if (r2 == 0) goto L_0x0051
                goto L_0x0054
            L_0x0051:
                int r3 = r3 + 1
                goto L_0x0040
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.a.C0217a.<clinit>():void");
        }
    }

    public void a(Throwable th2, Throwable th3) {
        e.D(th2, "cause");
        e.D(th3, "exception");
        Method method = C0217a.f11099a;
        if (method != null) {
            method.invoke(th2, new Object[]{th3});
        }
    }

    public c b() {
        return new b();
    }
}
