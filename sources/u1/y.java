package u1;

import a8.a;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11662a = p.e("WorkerFactory");

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th2) {
            p.c().b(f11662a, a.c("Invalid class: ", str), th2);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Throwable th3) {
                p.c().b(f11662a, a.c("Could not instantiate ", str), th3);
            }
        }
        if (listenableWorker == null || !listenableWorker.f2627s) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
