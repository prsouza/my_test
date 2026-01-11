package a1;

import a1.d;
import e6.e;
import java.util.Map;
import java.util.Objects;
import lb.b;
import m8.a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f20c;

    public /* synthetic */ b(Object obj, Object obj2, int i) {
        this.f18a = i;
        this.f19b = obj;
        this.f20c = obj2;
    }

    public final void run() {
        switch (this.f18a) {
            case 0:
                d.c cVar = (d.c) this.f19b;
                e.D(cVar, "$policy");
                e.D((m) this.f20c, "$violation");
                cVar.f27b.a();
                return;
            case 1:
                ((m8.b) ((Map.Entry) this.f19b).getKey()).a((a) this.f20c);
                return;
            default:
                lb.b bVar = (lb.b) this.f19b;
                b.a aVar = (b.a) this.f20c;
                int i = b.a.f8161y;
                e.D(bVar, "this$0");
                e.D(aVar, "this$1");
                Object tag = aVar.f2311a.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
                bVar.e(((Integer) tag).intValue());
                return;
        }
    }
}
