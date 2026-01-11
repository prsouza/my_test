package h2;

import androidx.work.impl.workers.ConstraintTrackingWorker;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z6.a f5793a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f5794b;

    public a(ConstraintTrackingWorker constraintTrackingWorker, z6.a aVar) {
        this.f5794b = constraintTrackingWorker;
        this.f5793a = aVar;
    }

    public final void run() {
        synchronized (this.f5794b.f2745v) {
            if (this.f5794b.f2746w) {
                this.f5794b.i();
            } else {
                this.f5794b.f2747x.l(this.f5793a);
            }
        }
    }
}
