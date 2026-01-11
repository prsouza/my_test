package u1;

import d2.o;
import io.nodle.cash.ui.worker.NodleWorker;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import u1.w;

public final class u extends w {

    public static final class a extends w.a<a, u> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a() {
            super(NodleWorker.class);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o oVar = this.f11660b;
            long millis = timeUnit.toMillis(1200000);
            Objects.requireNonNull(oVar);
            long j10 = 900000;
            if (millis < 900000) {
                p.c().f(o.f4292s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
                millis = 900000;
            }
            if (millis < 900000) {
                p.c().f(o.f4292s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            } else {
                j10 = millis;
            }
            if (millis < 300000) {
                p.c().f(o.f4292s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}), new Throwable[0]);
                millis = 300000;
            }
            if (millis > j10) {
                p.c().f(o.f4292s, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j10)}), new Throwable[0]);
                millis = j10;
            }
            oVar.f4299h = j10;
            oVar.i = millis;
        }

        public final w b() {
            if (!this.f11660b.f4307q) {
                return new u(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }

        public final w.a c() {
            return this;
        }
    }

    public u(a aVar) {
        super(aVar.f11659a, aVar.f11660b, aVar.f11661c);
    }
}
