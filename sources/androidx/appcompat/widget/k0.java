package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import j.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1301a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1302b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f1303c = new Rect();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f1304a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f1305b;

        /* renamed from: c  reason: collision with root package name */
        public static final Field f1306c;

        /* renamed from: d  reason: collision with root package name */
        public static final Field f1307d;

        /* renamed from: e  reason: collision with root package name */
        public static final Field f1308e;

        /* renamed from: f  reason: collision with root package name */
        public static final Field f1309f;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0043, ClassNotFoundException -> 0x003f, NoSuchFieldException -> 0x003b }
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch:{ NoSuchMethodException -> 0x0039, ClassNotFoundException -> 0x0037, NoSuchFieldException -> 0x0035 }
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch:{ NoSuchMethodException -> 0x0033, ClassNotFoundException -> 0x0031, NoSuchFieldException -> 0x002f }
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x002d }
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException -> 0x0047 }
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r2
                goto L_0x0047
            L_0x002f:
                r6 = r2
                goto L_0x0046
            L_0x0031:
                r6 = r2
                goto L_0x0046
            L_0x0033:
                r6 = r2
                goto L_0x0046
            L_0x0035:
                r5 = r2
                goto L_0x003d
            L_0x0037:
                r5 = r2
                goto L_0x0041
            L_0x0039:
                r5 = r2
                goto L_0x0045
            L_0x003b:
                r4 = r2
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r2
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r2
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r8 = r1
                r3 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                f1305b = r4
                f1306c = r5
                f1307d = r6
                f1308e = r7
                f1309f = r3
                f1304a = r0
                goto L_0x0064
            L_0x0058:
                f1305b = r2
                f1306c = r2
                f1307d = r2
                f1308e = r2
                f1309f = r2
                f1304a = r1
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k0.a.<clinit>():void");
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a10 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a10)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof h0.b) {
            return a(((h0.b) drawable).b());
        } else {
            if (drawable instanceof c) {
                return a(((c) drawable).f6976a);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1301a);
        } else {
            drawable.setState(f1302b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a10 = b.a(drawable);
            return new Rect(a10.left, a10.top, a10.right, a10.bottom);
        }
        Drawable a11 = h0.a.a(drawable);
        boolean z = a.f1304a;
        if (i < 29 && a.f1304a) {
            try {
                Object invoke = a.f1305b.invoke(a11, new Object[0]);
                if (invoke != null) {
                    return new Rect(a.f1306c.getInt(invoke), a.f1307d.getInt(invoke), a.f1308e.getInt(invoke), a.f1309f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1303c;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
