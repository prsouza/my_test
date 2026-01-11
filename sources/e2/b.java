package e2;

import androidx.work.impl.WorkDatabase;
import d2.q;
import java.util.ArrayList;
import java.util.Iterator;
import v1.e;
import v1.j;

public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f4533b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f4534c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f4535s;

    public b(j jVar, String str, boolean z) {
        this.f4533b = jVar;
        this.f4534c = str;
        this.f4535s = z;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        WorkDatabase workDatabase = this.f4533b.f12152x;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((q) workDatabase.w()).g(this.f4534c)).iterator();
            while (it.hasNext()) {
                a(this.f4533b, (String) it.next());
            }
            workDatabase.p();
            workDatabase.l();
            if (this.f4535s) {
                j jVar = this.f4533b;
                e.a(jVar.f12151w, jVar.f12152x, jVar.z);
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
