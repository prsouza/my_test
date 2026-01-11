package ei;

import android.app.Activity;
import android.content.Context;
import io.nodle.cash.R;

public final class c {

    public interface a {
        void a();

        void b();
    }

    public interface b {
        void a();

        void b();
    }

    public static boolean a(Context context, String... strArr) {
        if (context != null) {
            for (String a10 : strArr) {
                if (d0.a.a(context, a10) != 0) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Can't check permissions for null context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r11, java.lang.String[] r12, int[] r13, java.lang.Object... r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = r2
        L_0x000c:
            int r4 = r12.length
            if (r3 >= r4) goto L_0x001f
            r4 = r12[r3]
            r5 = r13[r3]
            if (r5 != 0) goto L_0x0019
            r0.add(r4)
            goto L_0x001c
        L_0x0019:
            r1.add(r4)
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x001f:
            int r12 = r14.length
            r13 = r2
        L_0x0021:
            if (r13 >= r12) goto L_0x00e3
            r3 = r14[r13]
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0035
            boolean r4 = r3 instanceof ei.c.a
            if (r4 == 0) goto L_0x0035
            r4 = r3
            ei.c$a r4 = (ei.c.a) r4
            r4.b()
        L_0x0035:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x0045
            boolean r4 = r3 instanceof ei.c.a
            if (r4 == 0) goto L_0x0045
            r4 = r3
            ei.c$a r4 = (ei.c.a) r4
            r4.a()
        L_0x0045:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x00df
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x00df
            java.lang.String r4 = "EasyPermissions"
            java.lang.Class r5 = r3.getClass()
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r7 = "_"
            boolean r6 = r6.endsWith(r7)
            if (r6 != 0) goto L_0x0068
            goto L_0x0073
        L_0x0068:
            java.lang.String r6 = "org.androidannotations.api.view.HasViews"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0073 }
            boolean r6 = r6.isInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r6 = r2
        L_0x0074:
            if (r6 == 0) goto L_0x007a
            java.lang.Class r5 = r5.getSuperclass()
        L_0x007a:
            if (r5 == 0) goto L_0x00df
            java.lang.reflect.Method[] r6 = r5.getDeclaredMethods()
            int r7 = r6.length
            r8 = r2
        L_0x0082:
            if (r8 >= r7) goto L_0x00da
            r9 = r6[r8]
            java.lang.Class<ei.a> r10 = ei.a.class
            java.lang.annotation.Annotation r10 = r9.getAnnotation(r10)
            ei.a r10 = (ei.a) r10
            if (r10 == 0) goto L_0x00d7
            int r10 = r10.value()
            if (r10 != r11) goto L_0x00d7
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 > 0) goto L_0x00bb
            boolean r10 = r9.isAccessible()     // Catch:{ IllegalAccessException -> 0x00b4, InvocationTargetException -> 0x00ad }
            if (r10 != 0) goto L_0x00a7
            r10 = 1
            r9.setAccessible(r10)     // Catch:{ IllegalAccessException -> 0x00b4, InvocationTargetException -> 0x00ad }
        L_0x00a7:
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x00b4, InvocationTargetException -> 0x00ad }
            r9.invoke(r3, r10)     // Catch:{ IllegalAccessException -> 0x00b4, InvocationTargetException -> 0x00ad }
            goto L_0x00d7
        L_0x00ad:
            r9 = move-exception
            java.lang.String r10 = "runDefaultMethod:InvocationTargetException"
            android.util.Log.e(r4, r10, r9)
            goto L_0x00d7
        L_0x00b4:
            r9 = move-exception
            java.lang.String r10 = "runDefaultMethod:IllegalAccessException"
            android.util.Log.e(r4, r10, r9)
            goto L_0x00d7
        L_0x00bb:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Cannot execute method "
            java.lang.StringBuilder r12 = a.a.d(r12)
            java.lang.String r13 = r9.getName()
            r12.append(r13)
            java.lang.String r13 = " because it is non-void method and/or has input parameters."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00d7:
            int r8 = r8 + 1
            goto L_0x0082
        L_0x00da:
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x007a
        L_0x00df:
            int r13 = r13 + 1
            goto L_0x0021
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.c.b(int, java.lang.String[], int[], java.lang.Object[]):void");
    }

    public static void c(Activity activity, String str, int i, String... strArr) {
        fi.b bVar = new fi.b((androidx.appcompat.app.c) activity);
        if (str == null) {
            str = bVar.b().getString(R.string.rationale_ask);
        }
        String str2 = str;
        String string = bVar.b().getString(17039370);
        String string2 = bVar.b().getString(17039360);
        String[] strArr2 = (String[]) strArr.clone();
        boolean z = false;
        if (a(bVar.b(), (String[]) strArr2.clone())) {
            T t10 = bVar.f5200a;
            String[] strArr3 = (String[]) strArr2.clone();
            int[] iArr = new int[strArr3.length];
            for (int i10 = 0; i10 < strArr3.length; i10++) {
                iArr[i10] = 0;
            }
            b(i, strArr3, iArr, t10);
            return;
        }
        String[] strArr4 = (String[]) strArr2.clone();
        int length = strArr4.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (bVar.c(strArr4[i11])) {
                z = true;
                break;
            } else {
                i11++;
            }
        }
        if (z) {
            bVar.d(str2, string, string2, -1, i, strArr4);
        } else {
            bVar.a(i, strArr4);
        }
    }
}
