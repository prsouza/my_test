package v3;

import c4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import z3.h;

public final class p implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<h<?>> f12291a = Collections.newSetFromMap(new WeakHashMap());

    public final void onDestroy() {
        Iterator it = ((ArrayList) j.e(this.f12291a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onDestroy();
        }
    }

    public final void onStart() {
        Iterator it = ((ArrayList) j.e(this.f12291a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStart();
        }
    }

    public final void onStop() {
        Iterator it = ((ArrayList) j.e(this.f12291a)).iterator();
        while (it.hasNext()) {
            ((h) it.next()).onStop();
        }
    }
}
