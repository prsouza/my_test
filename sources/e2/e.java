package e2;

import androidx.work.impl.WorkDatabase;
import d2.d;
import d2.f;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f4540a;

    public e(WorkDatabase workDatabase) {
        this.f4540a = workDatabase;
    }

    public final int a(String str) {
        this.f4540a.c();
        try {
            Long a10 = ((f) this.f4540a.s()).a(str);
            int i = 0;
            int intValue = a10 != null ? a10.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            ((f) this.f4540a.s()).b(new d(str, (long) i));
            this.f4540a.p();
            return intValue;
        } finally {
            this.f4540a.l();
        }
    }

    public final int b(int i) {
        int a10;
        synchronized (e.class) {
            a10 = a("next_job_scheduler_id");
            if (a10 < 0 || a10 > i) {
                ((f) this.f4540a.s()).b(new d("next_job_scheduler_id", (long) 1));
                a10 = 0;
            }
        }
        return a10;
    }
}
