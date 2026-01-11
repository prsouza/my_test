package c0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3054a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f3055b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f3056c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f3057d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f3058e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f3059f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3060a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f3061b;

        public a(c cVar, Object obj) {
            this.f3060a = cVar;
            this.f3061b = obj;
        }

        public final void run() {
            this.f3060a.f3064a = this.f3061b;
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f3062a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f3063b;

        public b(Application application, c cVar) {
            this.f3062a = application;
            this.f3063b = cVar;
        }

        public final void run() {
            this.f3062a.unregisterActivityLifecycleCallbacks(this.f3063b);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f3064a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f3065b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3066c;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3067s = false;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3068t = false;

        /* renamed from: u  reason: collision with root package name */
        public boolean f3069u = false;

        public c(Activity activity) {
            this.f3065b = activity;
            this.f3066c = activity.hashCode();
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.f3065b == activity) {
                this.f3065b = null;
                this.f3068t = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.f3068t && !this.f3069u && !this.f3067s) {
                Object obj = this.f3064a;
                int i = this.f3066c;
                boolean z = false;
                try {
                    Object obj2 = d.f3056c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i) {
                            d.g.postAtFrontOfQueue(new e(d.f3055b.get(activity), obj2));
                            z = true;
                        }
                    }
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th2);
                }
                if (z) {
                    this.f3069u = true;
                    this.f3064a = null;
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.f3065b == activity) {
                this.f3067s = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f3054a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f3055b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f3056c = r0
            java.lang.Class<?> r0 = f3054a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0053
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003c }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003c }
            r7[r2] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003c }
            r0.setAccessible(r2)     // Catch:{ all -> 0x003c }
        L_0x0053:
            f3057d = r0
            java.lang.Class<?> r0 = f3054a
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0059 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0059 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0059 }
            r7[r2] = r8     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0059 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0059 }
        L_0x006c:
            f3058e = r0
            java.lang.Class<?> r0 = f3054a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00ad }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00ad }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00ad }
            r1 = r0
        L_0x00ad:
            f3059f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.<clinit>():void");
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        Application application;
        c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f3059f == null) {
            return false;
        } else {
            if (f3058e == null && f3057d == null) {
                return false;
            }
            try {
                Object obj2 = f3056c.get(activity);
                if (obj2 == null || (obj = f3055b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = g;
                handler.post(new a(cVar, obj2));
                if (a()) {
                    Method method = f3059f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
