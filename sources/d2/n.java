package d2;

import h1.e0;
import h1.i0;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.e;

public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4289a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4290b;

    /* renamed from: c  reason: collision with root package name */
    public final b f4291c;

    public class a extends i0 {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class b extends i0 {
        public b(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "DELETE FROM WorkProgress";
        }
    }

    public n(e0 e0Var) {
        this.f4289a = e0Var;
        new AtomicBoolean(false);
        this.f4290b = new a(e0Var);
        this.f4291c = new b(e0Var);
    }

    public final void a(String str) {
        this.f4289a.b();
        e a10 = this.f4290b.a();
        if (str == null) {
            a10.D(1);
        } else {
            a10.r(1, str);
        }
        this.f4289a.c();
        try {
            a10.x();
            this.f4289a.p();
        } finally {
            this.f4289a.l();
            this.f4290b.d(a10);
        }
    }

    public final void b() {
        this.f4289a.b();
        e a10 = this.f4291c.a();
        this.f4289a.c();
        try {
            a10.x();
            this.f4289a.p();
        } finally {
            this.f4289a.l();
            this.f4291c.d(a10);
        }
    }
}
