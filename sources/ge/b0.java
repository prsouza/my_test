package ge;

import a.b;
import androidx.fragment.app.m;
import ee.g;
import ee.j;
import java.lang.Thread;
import java.util.List;
import l6.b1;
import pd.f;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List<a0> f5367a = g.j1(j.i1(m.d()));

    public static final void a(f fVar, Throwable th2) {
        Throwable th3;
        for (a0 handleException : f5367a) {
            try {
                handleException.handleException(fVar, th2);
            } catch (Throwable th4) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th2 == th4) {
                    th3 = th2;
                } else {
                    th3 = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                    b.D(th3, th2);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th3);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            b.D(th2, new k0(fVar));
        } catch (Throwable th5) {
            b1.k(th5);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
