package c3;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3173a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3174b;

    public j(e eVar, long j10) {
        this.f3174b = eVar;
        this.f3173a = j10;
    }

    public final void run() {
        if (!t.c(this.f3174b.f3133d)) {
            this.f3174b.p(this.f3173a);
            this.f3174b.C = true;
        }
    }
}
