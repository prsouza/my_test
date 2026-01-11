package d2;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import l1.e;

public final class t implements s {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4320a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4321b;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        public final void e(e eVar, Object obj) {
            r rVar = (r) obj;
            String str = rVar.f4318a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = rVar.f4319b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
        }
    }

    public t(e0 e0Var) {
        this.f4320a = e0Var;
        this.f4321b = new a(e0Var);
    }

    public final List<String> a(String str) {
        g0 e10 = g0.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4320a.b();
        Cursor o4 = this.f4320a.o(e10);
        try {
            ArrayList arrayList = new ArrayList(o4.getCount());
            while (o4.moveToNext()) {
                arrayList.add(o4.getString(0));
            }
            return arrayList;
        } finally {
            o4.close();
            e10.release();
        }
    }
}
