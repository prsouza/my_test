package v3;

import c4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set<i> f12259a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f12260b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12261c;

    public final void a() {
        this.f12261c = true;
        Iterator it = ((ArrayList) j.e(this.f12259a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onDestroy();
        }
    }

    public final void b(i iVar) {
        this.f12259a.remove(iVar);
    }

    public final void c() {
        this.f12260b = true;
        Iterator it = ((ArrayList) j.e(this.f12259a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }

    public final void d(i iVar) {
        this.f12259a.add(iVar);
        if (this.f12261c) {
            iVar.onDestroy();
        } else if (this.f12260b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    public final void e() {
        this.f12260b = false;
        Iterator it = ((ArrayList) j.e(this.f12259a)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStop();
        }
    }
}
