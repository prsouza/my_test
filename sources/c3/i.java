package c3;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f3171a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3172b;

    public i(e eVar, long j10) {
        this.f3172b = eVar;
        this.f3171a = j10;
    }

    public final void run() {
        if (!t.c(this.f3172b.f3133d)) {
            this.f3172b.j(this.f3171a);
            e eVar = this.f3172b;
            eVar.C = false;
            if (eVar.D) {
                eVar.t();
            }
            e eVar2 = this.f3172b;
            eVar2.f3132c.v0("device_id", eVar2.g);
            e eVar3 = this.f3172b;
            eVar3.f3132c.v0("user_id", eVar3.f3135f);
            e eVar4 = this.f3172b;
            eVar4.f3132c.p0("opt_out", Long.valueOf(eVar4.i ? 1 : 0));
            e eVar5 = this.f3172b;
            eVar5.f3132c.p0("previous_session_id", Long.valueOf(eVar5.f3139l));
            e eVar6 = this.f3172b;
            eVar6.f3132c.p0("last_event_time", Long.valueOf(eVar6.f3143p));
        }
    }
}
