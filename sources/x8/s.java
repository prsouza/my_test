package x8;

import a9.b;
import a9.d;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Set;
import s7.c;
import s7.e;
import s7.x;

public final /* synthetic */ class s implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ s f13127b = new s(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ s f13128c = new s(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13129a;

    public /* synthetic */ s(int i) {
        this.f13129a = i;
    }

    public final Object f(c cVar) {
        switch (this.f13129a) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(cVar);
            default:
                Set<d> c10 = ((x) cVar).c(d.class);
                a9.c cVar2 = a9.c.f174c;
                if (cVar2 == null) {
                    synchronized (a9.c.class) {
                        cVar2 = a9.c.f174c;
                        if (cVar2 == null) {
                            cVar2 = new a9.c(0);
                            a9.c.f174c = cVar2;
                        }
                    }
                }
                return new b(c10, cVar2);
        }
    }
}
