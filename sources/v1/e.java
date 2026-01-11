package v1;

import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import d2.o;
import d2.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u1.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12142a = p.e("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void a(a aVar, WorkDatabase workDatabase, List<d> list) {
        int i;
        if (list != null && list.size() != 0) {
            d2.p w6 = workDatabase.w();
            workDatabase.c();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = aVar.f2648h / 2;
                } else {
                    i = aVar.f2648h;
                }
                q qVar = (q) w6;
                List<o> c10 = qVar.c(i);
                List b10 = qVar.b();
                if (((ArrayList) c10).size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) c10).iterator();
                    while (it.hasNext()) {
                        qVar.k(((o) it.next()).f4293a, currentTimeMillis);
                    }
                }
                workDatabase.p();
                workDatabase.l();
                ArrayList arrayList = (ArrayList) c10;
                if (arrayList.size() > 0) {
                    o[] oVarArr = (o[]) arrayList.toArray(new o[arrayList.size()]);
                    for (d next : list) {
                        if (next.f()) {
                            next.e(oVarArr);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) b10;
                if (arrayList2.size() > 0) {
                    o[] oVarArr2 = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                    for (d next2 : list) {
                        if (!next2.f()) {
                            next2.e(oVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.l();
                throw th2;
            }
        }
    }
}
