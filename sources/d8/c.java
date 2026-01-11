package d8;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l6.t2;
import q4.d;
import q4.f;
import t4.t;
import x7.b0;
import z7.a0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final double f4361a;

    /* renamed from: b  reason: collision with root package name */
    public final double f4362b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4363c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4364d;

    /* renamed from: e  reason: collision with root package name */
    public final BlockingQueue<Runnable> f4365e;

    /* renamed from: f  reason: collision with root package name */
    public final ThreadPoolExecutor f4366f;
    public final f<a0> g;

    /* renamed from: h  reason: collision with root package name */
    public final t2 f4367h;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f4368j = 0;

    public final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f4369a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<b0> f4370b;

        public b(b0 b0Var, TaskCompletionSource taskCompletionSource, a aVar) {
            this.f4369a = b0Var;
            this.f4370b = taskCompletionSource;
        }

        public final void run() {
            c.this.b(this.f4369a, this.f4370b);
            ((AtomicInteger) c.this.f4367h.f8031b).set(0);
            c cVar = c.this;
            double min = Math.min(3600000.0d, Math.pow(cVar.f4362b, (double) cVar.a()) * (60000.0d / cVar.f4361a));
            StringBuilder d10 = a.a.d("Delay for: ");
            d10.append(String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(min / 1000.0d)}));
            d10.append(" s for report: ");
            d10.append(this.f4369a.c());
            String sb2 = d10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, (Throwable) null);
            }
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public c(f<a0> fVar, e8.c cVar, t2 t2Var) {
        double d10 = cVar.f4760d;
        double d11 = cVar.f4761e;
        this.f4361a = d10;
        this.f4362b = d11;
        this.f4363c = ((long) cVar.f4762f) * 1000;
        this.g = fVar;
        this.f4367h = t2Var;
        int i10 = (int) d10;
        this.f4364d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f4365e = arrayBlockingQueue;
        this.f4366f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    public final int a() {
        int i10;
        if (this.f4368j == 0) {
            this.f4368j = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f4368j) / this.f4363c);
        if (this.f4365e.size() == this.f4364d) {
            i10 = Math.min(100, this.i + currentTimeMillis);
        } else {
            i10 = Math.max(0, this.i - currentTimeMillis);
        }
        if (this.i != i10) {
            this.i = i10;
            this.f4368j = System.currentTimeMillis();
        }
        return i10;
    }

    public final void b(b0 b0Var, TaskCompletionSource<b0> taskCompletionSource) {
        StringBuilder d10 = a.a.d("Sending report through Google DataTransport: ");
        d10.append(b0Var.c());
        String sb2 = d10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, (Throwable) null);
        }
        ((t) this.g).a(new q4.a(b0Var.a(), d.HIGHEST), new b(taskCompletionSource, b0Var));
    }
}
