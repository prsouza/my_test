package p1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o0;
import java.util.ArrayList;
import java.util.List;
import p1.i;

public class d extends o0 {

    public class a extends i.c {
    }

    public class b implements i.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f9514a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9515b;

        public b(View view, ArrayList arrayList) {
            this.f9514a = view;
            this.f9515b = arrayList;
        }

        public final void a(i iVar) {
            iVar.z(this);
            this.f9514a.setVisibility(8);
            int size = this.f9515b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f9515b.get(i)).setVisibility(0);
            }
        }

        public final void b() {
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e(i iVar) {
            iVar.z(this);
            iVar.a(this);
        }
    }

    public class c extends i.c {
    }

    public static boolean s(i iVar) {
        return !o0.h(iVar.f9529t) || !o0.h((List) null) || !o0.h((List) null);
    }

    public final void a(Object obj, View view) {
        ((i) obj).b(view);
    }

    public final void b(Object obj, ArrayList<View> arrayList) {
        i iVar = (i) obj;
        if (iVar != null) {
            int i = 0;
            if (iVar instanceof n) {
                n nVar = (n) iVar;
                int size = nVar.M.size();
                while (i < size) {
                    b(nVar.M(i), arrayList);
                    i++;
                }
            } else if (!s(iVar) && o0.h(iVar.f9530u)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    iVar.b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup, Object obj) {
        m.a(viewGroup, (i) obj);
    }

    public final boolean e(Object obj) {
        return obj instanceof i;
    }

    public final Object f(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    public final Object i(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            n nVar = new n();
            nVar.L(iVar);
            nVar.L(iVar2);
            nVar.N = false;
            iVar = nVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 == null) {
            return iVar;
        }
        n nVar2 = new n();
        if (iVar != null) {
            nVar2.L(iVar);
        }
        nVar2.L(iVar3);
        return nVar2;
    }

    public final Object j(Object obj, Object obj2) {
        n nVar = new n();
        if (obj != null) {
            nVar.L((i) obj);
        }
        nVar.L((i) obj2);
        return nVar;
    }

    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a(new b(view, arrayList));
    }

    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((i) obj).a(new e(this, obj2, arrayList, obj3, arrayList2));
    }

    public final void m(Object obj, Rect rect) {
        ((i) obj).E(new c());
    }

    public final void n(Object obj, View view) {
        if (view != null) {
            g(view, new Rect());
            ((i) obj).E(new a());
        }
    }

    public final void o(Object obj, j0.b bVar, Runnable runnable) {
        i iVar = (i) obj;
        bVar.b(new f(iVar));
        iVar.a(new g(runnable));
    }

    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        n nVar = (n) obj;
        ArrayList<View> arrayList2 = nVar.f9530u;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(nVar, arrayList);
    }

    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.f9530u.clear();
            nVar.f9530u.addAll(arrayList2);
            t(nVar, arrayList, arrayList2);
        }
    }

    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        n nVar = new n();
        nVar.L((i) obj);
        return nVar;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        i iVar = (i) obj;
        int i10 = 0;
        if (iVar instanceof n) {
            n nVar = (n) iVar;
            int size = nVar.M.size();
            while (i10 < size) {
                t(nVar.M(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!s(iVar)) {
            ArrayList<View> arrayList3 = iVar.f9530u;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i10 < i) {
                    iVar.b(arrayList2.get(i10));
                    i10++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        iVar.A(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
