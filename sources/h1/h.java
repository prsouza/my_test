package h1;

import b9.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.b;
import h1.g;
import java.util.Date;
import java.util.Objects;
import l1.e;
import q.a;

public final /* synthetic */ class h implements a, Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f5719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5720b;

    public /* synthetic */ h(Object obj, Object obj2) {
        this.f5719a = obj;
        this.f5720b = obj2;
    }

    public final Object apply(Object obj) {
        g.b bVar = (g.b) this.f5719a;
        a aVar = (a) this.f5720b;
        e z = ((l1.a) obj).z(bVar.f5708a);
        int i = 0;
        while (i < bVar.f5709b.size()) {
            int i10 = i + 1;
            Object obj2 = bVar.f5709b.get(i);
            if (obj2 == null) {
                z.D(i10);
            } else if (obj2 instanceof Long) {
                z.X(i10, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                z.G(i10, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                z.r(i10, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                z.g0(i10, (byte[]) obj2);
            }
            i = i10;
        }
        return aVar.apply(z);
    }

    public final Object then(Task task) {
        com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) this.f5719a;
        Date date = (Date) this.f5720b;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f4233k;
        Objects.requireNonNull(aVar);
        if (task.isSuccessful()) {
            b bVar = aVar.f4240h;
            synchronized (bVar.f4247b) {
                bVar.f4246a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
        } else {
            Exception exception = task.getException();
            if (exception != null) {
                if (exception instanceof f) {
                    b bVar2 = aVar.f4240h;
                    synchronized (bVar2.f4247b) {
                        bVar2.f4246a.edit().putInt("last_fetch_status", 2).apply();
                    }
                } else {
                    b bVar3 = aVar.f4240h;
                    synchronized (bVar3.f4247b) {
                        bVar3.f4246a.edit().putInt("last_fetch_status", 1).apply();
                    }
                }
            }
        }
        return task;
    }
}
