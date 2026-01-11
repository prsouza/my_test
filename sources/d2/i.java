package d2;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.i0;
import h1.o;
import l1.e;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4282a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4283b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4284c;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        public final void e(e eVar, Object obj) {
            g gVar = (g) obj;
            String str = gVar.f4280a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            eVar.X(2, (long) gVar.f4281b);
        }
    }

    public class b extends i0 {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(e0 e0Var) {
        this.f4282a = e0Var;
        this.f4283b = new a(e0Var);
        this.f4284c = new b(e0Var);
    }

    public final g a(String str) {
        g0 e10 = g0.e("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4282a.b();
        g gVar = null;
        Cursor o4 = this.f4282a.o(e10);
        try {
            int a10 = j1.b.a(o4, "work_spec_id");
            int a11 = j1.b.a(o4, "system_id");
            if (o4.moveToFirst()) {
                gVar = new g(o4.getString(a10), o4.getInt(a11));
            }
            return gVar;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void b(g gVar) {
        this.f4282a.b();
        this.f4282a.c();
        try {
            this.f4283b.f(gVar);
            this.f4282a.p();
        } finally {
            this.f4282a.l();
        }
    }

    public final void c(String str) {
        this.f4282a.b();
        e a10 = this.f4284c.a();
        if (str == null) {
            a10.D(1);
        } else {
            a10.r(1, str);
        }
        this.f4282a.c();
        try {
            a10.x();
            this.f4282a.p();
        } finally {
            this.f4282a.l();
            this.f4284c.d(a10);
        }
    }
}
