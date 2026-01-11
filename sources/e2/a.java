package e2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import v1.e;
import v1.j;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f4531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ UUID f4532c;

    public a(j jVar, UUID uuid) {
        this.f4531b = jVar;
        this.f4532c = uuid;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        WorkDatabase workDatabase = this.f4531b.f12152x;
        workDatabase.c();
        try {
            a(this.f4531b, this.f4532c.toString());
            workDatabase.p();
            workDatabase.l();
            j jVar = this.f4531b;
            e.a(jVar.f12151w, jVar.f12152x, jVar.z);
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
