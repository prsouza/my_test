package d2;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.o;
import l1.e;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4278a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4279b;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        public final void e(e eVar, Object obj) {
            d dVar = (d) obj;
            String str = dVar.f4276a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            Long l10 = dVar.f4277b;
            if (l10 == null) {
                eVar.D(2);
            } else {
                eVar.X(2, l10.longValue());
            }
        }
    }

    public f(e0 e0Var) {
        this.f4278a = e0Var;
        this.f4279b = new a(e0Var);
    }

    public final Long a(String str) {
        g0 e10 = g0.e("SELECT long_value FROM Preference where `key`=?", 1);
        e10.r(1, str);
        this.f4278a.b();
        Long l10 = null;
        Cursor o4 = this.f4278a.o(e10);
        try {
            if (o4.moveToFirst()) {
                if (!o4.isNull(0)) {
                    l10 = Long.valueOf(o4.getLong(0));
                }
            }
            return l10;
        } finally {
            o4.close();
            e10.release();
        }
    }

    public final void b(d dVar) {
        this.f4278a.b();
        this.f4278a.c();
        try {
            this.f4279b.f(dVar);
            this.f4278a.p();
        } finally {
            this.f4278a.l();
        }
    }
}
