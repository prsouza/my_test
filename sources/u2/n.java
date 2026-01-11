package u2;

import b3.a;
import c4.j;
import j3.k;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public abstract class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11677a;

    /* renamed from: b  reason: collision with root package name */
    public final Collection f11678b;

    public n(int i) {
        this.f11677a = i;
        if (i != 2) {
            char[] cArr = j.f3244a;
            this.f11678b = new ArrayDeque(20);
            return;
        }
        this.f11678b = new HashSet();
    }

    public final List b() {
        return (List) this.f11678b;
    }

    public final boolean c() {
        return ((List) this.f11678b).isEmpty() || (((List) this.f11678b).size() == 1 && ((a) ((List) this.f11678b).get(0)).c());
    }

    public abstract k d();

    public final k e() {
        k kVar = (k) ((Queue) this.f11678b).poll();
        return kVar == null ? d() : kVar;
    }

    public final void f(k kVar) {
        if (((Queue) this.f11678b).size() < 20) {
            ((Queue) this.f11678b).offer(kVar);
        }
    }

    public final String toString() {
        switch (this.f11677a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                if (!((List) this.f11678b).isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(((List) this.f11678b).toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n(Object obj) {
        this(Collections.singletonList(new a(obj)));
        this.f11677a = 0;
    }

    public n(List list) {
        this.f11677a = 0;
        this.f11678b = list;
    }
}
