package aj;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.i0;
import h1.o;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.e;

public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f682a;

    /* renamed from: b  reason: collision with root package name */
    public final o f683b;

    /* renamed from: c  reason: collision with root package name */
    public final b f684c;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `SdkMetric` (`metric_id`,`value`,`row_id`) VALUES (?,?,nullif(?, 0))";
        }

        public final void e(e eVar, Object obj) {
            h hVar = (h) obj;
            eVar.X(1, (long) hVar.f680a);
            eVar.X(2, hVar.f681b);
            eVar.X(3, 0);
        }
    }

    public class b extends i0 {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "UPDATE sdkmetric SET value = value + 1 WHERE metric_id = ?";
        }
    }

    public j(e0 e0Var) {
        this.f682a = e0Var;
        new AtomicBoolean(false);
        this.f683b = new a(e0Var);
        this.f684c = new b(e0Var);
    }

    public final boolean b() {
        boolean z = false;
        g0 e10 = g0.e("SELECT EXISTS(SELECT metric_id FROM sdkmetric WHERE metric_id = 0)", 0);
        this.f682a.b();
        Cursor o4 = this.f682a.o(e10);
        try {
            if (o4.moveToFirst() && o4.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final long c(int i) {
        g0 e10 = g0.e("SELECT value from sdkmetric WHERE metric_id = ?", 1);
        e10.X(1, (long) i);
        this.f682a.b();
        Cursor o4 = this.f682a.o(e10);
        try {
            return o4.moveToFirst() ? o4.getLong(0) : 0;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void d(int i) {
        this.f682a.b();
        e a10 = this.f684c.a();
        a10.X(1, (long) i);
        this.f682a.c();
        try {
            a10.x();
            this.f682a.p();
        } finally {
            this.f682a.l();
            this.f684c.d(a10);
        }
    }

    public final void e(h hVar) {
        this.f682a.b();
        this.f682a.c();
        try {
            this.f683b.f(hVar);
            this.f682a.p();
        } finally {
            this.f682a.l();
        }
    }
}
