package v3;

import c4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import y3.c;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f12281a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f12282b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12283c;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final boolean a(c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f12281a.remove(cVar);
        if (!this.f12282b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<y3.c>, java.util.ArrayList] */
    public final void b() {
        Iterator it = ((ArrayList) j.e(this.f12281a)).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.j() && !cVar.f()) {
                cVar.clear();
                if (!this.f12283c) {
                    cVar.i();
                } else {
                    this.f12282b.add(cVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f12281a.size() + ", isPaused=" + this.f12283c + "}";
    }
}
