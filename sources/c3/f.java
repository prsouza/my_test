package c3;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3158b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f3159c;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            e eVar = f.this.f3159c;
            eVar.u(eVar.f3152y);
        }
    }

    public f(e eVar, long j10, long j11) {
        this.f3159c = eVar;
        this.f3157a = j10;
        this.f3158b = j11;
    }

    public final void run() {
        long j10 = this.f3157a;
        if (j10 >= 0) {
            m mVar = this.f3159c.f3132c;
            synchronized (mVar) {
                mVar.B0("events", j10);
            }
        }
        long j11 = this.f3158b;
        if (j11 >= 0) {
            m mVar2 = this.f3159c.f3132c;
            synchronized (mVar2) {
                mVar2.B0("identifys", j11);
            }
        }
        this.f3159c.F.set(false);
        long S = this.f3159c.f3132c.S();
        e eVar = this.f3159c;
        if (S > ((long) eVar.f3146s)) {
            eVar.H.a(new a());
            return;
        }
        eVar.f3152y = false;
        eVar.z = eVar.f3147t;
    }
}
