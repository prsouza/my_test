package d2;

import android.database.Cursor;
import h1.e0;
import h1.g0;
import h1.o;
import java.util.ArrayList;
import java.util.List;
import l1.e;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f4274a;

    /* renamed from: b  reason: collision with root package name */
    public final o f4275b;

    public class a extends o {
        public a(e0 e0Var) {
            super(e0Var);
        }

        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        public final void e(e eVar, Object obj) {
            a aVar = (a) obj;
            String str = aVar.f4272a;
            if (str == null) {
                eVar.D(1);
            } else {
                eVar.r(1, str);
            }
            String str2 = aVar.f4273b;
            if (str2 == null) {
                eVar.D(2);
            } else {
                eVar.r(2, str2);
            }
        }
    }

    public c(e0 e0Var) {
        this.f4274a = e0Var;
        this.f4275b = new a(e0Var);
    }

    public final List<String> a(String str) {
        g0 e10 = g0.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4274a.b();
        Cursor o4 = this.f4274a.o(e10);
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

    public final boolean b(String str) {
        boolean z = true;
        g0 e10 = g0.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e10.D(1);
        } else {
            e10.r(1, str);
        }
        this.f4274a.b();
        boolean z10 = false;
        Cursor o4 = this.f4274a.o(e10);
        try {
            if (o4.moveToFirst()) {
                if (o4.getInt(0) == 0) {
                    z = false;
                }
                z10 = z;
            }
            return z10;
        } finally {
            o4.close();
            e10.release();
        }
    }
}
