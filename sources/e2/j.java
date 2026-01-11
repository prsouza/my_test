package e2;

import androidx.work.WorkerParameters;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public v1.j f4550a;

    /* renamed from: b  reason: collision with root package name */
    public String f4551b;

    /* renamed from: c  reason: collision with root package name */
    public WorkerParameters.a f4552c;

    public j(v1.j jVar, String str, WorkerParameters.a aVar) {
        this.f4550a = jVar;
        this.f4551b = str;
        this.f4552c = aVar;
    }

    public final void run() {
        this.f4550a.A.g(this.f4551b, this.f4552c);
    }
}
