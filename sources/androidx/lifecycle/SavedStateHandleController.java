package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import androidx.savedstate.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class SavedStateHandleController implements y {

    /* renamed from: a  reason: collision with root package name */
    public final String f2073a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2074b = false;

    /* renamed from: c  reason: collision with root package name */
    public final r0 f2075c;

    public static final class a implements a.C0022a {
        public final void a(c cVar) {
            if (cVar instanceof y0) {
                x0 viewModelStore = ((y0) cVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = cVar.getSavedStateRegistry();
                Objects.requireNonNull(viewModelStore);
                Iterator it = new HashSet(viewModelStore.f2207a.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.f(viewModelStore.f2207a.get((String) it.next()), savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(viewModelStore.f2207a.keySet()).isEmpty()) {
                    savedStateRegistry.c();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, r0 r0Var) {
        this.f2073a = str;
        this.f2075c = r0Var;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static void f(u0 u0Var, androidx.savedstate.a aVar, r rVar) {
        Object obj;
        Map<String, Object> map = u0Var.f2193a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = u0Var.f2193a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.f2074b) {
            savedStateHandleController.h(aVar, rVar);
            j(aVar, rVar);
        }
    }

    public static SavedStateHandleController i(androidx.savedstate.a aVar, r rVar, String str, Bundle bundle) {
        r0 r0Var;
        Bundle a10 = aVar.a(str);
        Class[] clsArr = r0.f2166e;
        if (a10 == null && bundle == null) {
            r0Var = new r0();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String next : bundle.keySet()) {
                    hashMap.put(next, bundle.get(next));
                }
            }
            if (a10 == null) {
                r0Var = new r0(hashMap);
            } else {
                ArrayList parcelableArrayList = a10.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a10.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                }
                r0Var = new r0(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, r0Var);
        savedStateHandleController.h(aVar, rVar);
        j(aVar, rVar);
        return savedStateHandleController;
    }

    public static void j(final androidx.savedstate.a aVar, final r rVar) {
        r.c b10 = rVar.b();
        if (b10 == r.c.INITIALIZED || b10.isAtLeast(r.c.STARTED)) {
            aVar.c();
        } else {
            rVar.a(new y() {
                public final void c(a0 a0Var, r.b bVar) {
                    if (bVar == r.b.ON_START) {
                        r.this.c(this);
                        aVar.c();
                    }
                }
            });
        }
    }

    public final void c(a0 a0Var, r.b bVar) {
        if (bVar == r.b.ON_DESTROY) {
            this.f2074b = false;
            a0Var.getLifecycle().c(this);
        }
    }

    public final void h(androidx.savedstate.a aVar, r rVar) {
        if (!this.f2074b) {
            this.f2074b = true;
            rVar.a(this);
            aVar.b(this.f2073a, this.f2075c.f2170d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
