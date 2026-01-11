package v1;

import androidx.work.impl.WorkDatabase;
import h1.e0;
import l1.a;

public final class h extends e0.b {
    public final void c(a aVar) {
        m1.a aVar2 = (m1.a) aVar;
        aVar2.i();
        try {
            int i = WorkDatabase.f2654o;
            aVar2.q("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f2653n) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar2.Y();
        } finally {
            aVar2.h();
        }
    }
}
