package x7;

import android.util.Log;
import e8.i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f12895a;

    /* renamed from: b  reason: collision with root package name */
    public final i f12896b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f12897c;

    /* renamed from: s  reason: collision with root package name */
    public final u7.a f12898s;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicBoolean f12899t = new AtomicBoolean(false);

    public interface a {
    }

    public c0(a aVar, i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, u7.a aVar2) {
        this.f12895a = aVar;
        this.f12896b = iVar;
        this.f12897c = uncaughtExceptionHandler;
        this.f12898s = aVar2;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", (Throwable) null);
            return false;
        } else if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", (Throwable) null);
            return false;
        } else {
            boolean z = true;
            if (!this.f12898s.b()) {
                return true;
            }
            if (!Log.isLoggable("FirebaseCrashlytics", 3)) {
                z = false;
            }
            if (z) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", (Throwable) null);
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r3 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (r3 != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        android.util.Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r8.f12897c.uncaughtException(r9, r10);
        r8.f12899t.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Completed exception processing. Invoking default exception handler."
            java.lang.String r1 = "FirebaseCrashlytics"
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.f12899t
            r3 = 1
            r2.set(r3)
            r2 = 0
            r4 = 3
            r5 = 0
            boolean r6 = r8.a(r9, r10)     // Catch:{ Exception -> 0x001f }
            if (r6 == 0) goto L_0x0021
            x7.c0$a r6 = r8.f12895a     // Catch:{ Exception -> 0x001f }
            e8.i r7 = r8.f12896b     // Catch:{ Exception -> 0x001f }
            x7.k r6 = (x7.k) r6     // Catch:{ Exception -> 0x001f }
            r6.a(r7, r9, r10)     // Catch:{ Exception -> 0x001f }
            goto L_0x0031
        L_0x001d:
            r6 = move-exception
            goto L_0x0059
        L_0x001f:
            r6 = move-exception
            goto L_0x003c
        L_0x0021:
            java.lang.String r6 = "Uncaught exception will not be recorded by Crashlytics."
            boolean r7 = android.util.Log.isLoggable(r1, r4)     // Catch:{ Exception -> 0x001f }
            if (r7 == 0) goto L_0x002b
            r7 = r3
            goto L_0x002c
        L_0x002b:
            r7 = r5
        L_0x002c:
            if (r7 == 0) goto L_0x0031
            android.util.Log.d(r1, r6, r2)     // Catch:{ Exception -> 0x001f }
        L_0x0031:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r3 = r5
        L_0x0039:
            if (r3 == 0) goto L_0x004e
            goto L_0x004b
        L_0x003c:
            java.lang.String r7 = "An error occurred in the uncaught exception handler"
            android.util.Log.e(r1, r7, r6)     // Catch:{ all -> 0x001d }
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = r5
        L_0x0049:
            if (r3 == 0) goto L_0x004e
        L_0x004b:
            android.util.Log.d(r1, r0, r2)
        L_0x004e:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f12897c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f12899t
            r9.set(r5)
            return
        L_0x0059:
            boolean r4 = android.util.Log.isLoggable(r1, r4)
            if (r4 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r5
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            android.util.Log.d(r1, r0, r2)
        L_0x0066:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f12897c
            r0.uncaughtException(r9, r10)
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.f12899t
            r9.set(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.c0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
