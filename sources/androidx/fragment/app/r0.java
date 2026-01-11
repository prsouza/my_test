package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import io.nodle.cash.R;
import j0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1981a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<e> f1982b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<e> f1983c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1984d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1985e = false;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1986a;

        public a(d dVar) {
            this.f1986a = dVar;
        }

        public final void run() {
            if (r0.this.f1982b.contains(this.f1986a)) {
                d dVar = this.f1986a;
                dVar.f1993a.applyState(dVar.f1995c.mView);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1988a;

        public b(d dVar) {
            this.f1988a = dVar;
        }

        public final void run() {
            r0.this.f1982b.remove(this.f1988a);
            r0.this.f1983c.remove(this.f1988a);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1990a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f1991b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.r0$e$b[] r0 = androidx.fragment.app.r0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1991b = r0
                r1 = 1
                androidx.fragment.app.r0$e$b r2 = androidx.fragment.app.r0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1991b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.r0$e$b r3 = androidx.fragment.app.r0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1991b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.r0$e$b r4 = androidx.fragment.app.r0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.r0$e$c[] r3 = androidx.fragment.app.r0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f1990a = r3
                androidx.fragment.app.r0$e$c r4 = androidx.fragment.app.r0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f1990a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.r0$e$c r3 = androidx.fragment.app.r0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f1990a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f1990a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.r0$e$c r1 = androidx.fragment.app.r0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r0.c.<clinit>():void");
        }
    }

    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        public final g0 f1992h;

        public d(e.c cVar, e.b bVar, g0 g0Var, j0.b bVar2) {
            super(cVar, bVar, g0Var.f1902c, bVar2);
            this.f1992h = g0Var;
        }

        public final void c() {
            super.c();
            this.f1992h.k();
        }

        public final void e() {
            e.b bVar = this.f1994b;
            if (bVar == e.b.ADDING) {
                Fragment fragment = this.f1992h.f1902c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                View requireView = this.f1995c.requireView();
                if (requireView.getParent() == null) {
                    this.f1992h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            } else if (bVar == e.b.REMOVING) {
                Fragment fragment2 = this.f1992h.f1902c;
                View requireView2 = fragment2.requireView();
                if (a0.K(2)) {
                    StringBuilder d10 = a.a.d("Clearing focus ");
                    d10.append(requireView2.findFocus());
                    d10.append(" on view ");
                    d10.append(requireView2);
                    d10.append(" for Fragment ");
                    d10.append(fragment2);
                    Log.v("FragmentManager", d10.toString());
                }
                requireView2.clearFocus();
            }
        }
    }

    public r0(ViewGroup viewGroup) {
        this.f1981a = viewGroup;
    }

    public static r0 f(ViewGroup viewGroup, a0 a0Var) {
        return g(viewGroup, a0Var.I());
    }

    public static r0 g(ViewGroup viewGroup, s0 s0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof r0) {
            return (r0) tag;
        }
        Objects.requireNonNull((a0.c) s0Var);
        d dVar = new d(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, dVar);
        return dVar;
    }

    public final void a(e.c cVar, e.b bVar, g0 g0Var) {
        synchronized (this.f1982b) {
            j0.b bVar2 = new j0.b();
            e d10 = d(g0Var.f1902c);
            if (d10 != null) {
                d10.d(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, g0Var, bVar2);
            this.f1982b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    public abstract void b(List<e> list, boolean z);

    public final void c() {
        if (!this.f1985e) {
            ViewGroup viewGroup = this.f1981a;
            WeakHashMap<View, n0.a0> weakHashMap = x.f8842a;
            if (!x.g.b(viewGroup)) {
                e();
                this.f1984d = false;
                return;
            }
            synchronized (this.f1982b) {
                if (!this.f1982b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1983c);
                    this.f1983c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (a0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.g) {
                            this.f1983c.add(eVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f1982b);
                    this.f1982b.clear();
                    this.f1983c.addAll(arrayList2);
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).e();
                    }
                    b(arrayList2, this.f1984d);
                    this.f1984d = false;
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final e d(Fragment fragment) {
        Iterator<e> it = this.f1982b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f1995c.equals(fragment) && !next.f1998f) {
                return next;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (a0.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1981a;
        WeakHashMap<View, n0.a0> weakHashMap = x.f8842a;
        boolean b10 = x.g.b(viewGroup);
        synchronized (this.f1982b) {
            i();
            Iterator<e> it = this.f1982b.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            Iterator it2 = new ArrayList(this.f1983c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (a0.K(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f1981a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f1982b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (a0.K(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (b10) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f1981a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    public final void h() {
        synchronized (this.f1982b) {
            i();
            this.f1985e = false;
            int size = this.f1982b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f1982b.get(size);
                e.c from = e.c.from(eVar.f1995c.mView);
                e.c cVar = eVar.f1993a;
                e.c cVar2 = e.c.VISIBLE;
                if (cVar == cVar2 && from != cVar2) {
                    this.f1985e = eVar.f1995c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<e> it = this.f1982b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f1994b == e.b.ADDING) {
                next.d(e.c.from(next.f1995c.requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public c f1993a;

        /* renamed from: b  reason: collision with root package name */
        public b f1994b;

        /* renamed from: c  reason: collision with root package name */
        public final Fragment f1995c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f1996d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<j0.b> f1997e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1998f = false;
        public boolean g = false;

        public class a implements b.a {
            public a() {
            }

            public final void onCancel() {
                e.this.b();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public e(c cVar, b bVar, Fragment fragment, j0.b bVar2) {
            this.f1993a = cVar;
            this.f1994b = bVar;
            this.f1995c = fragment;
            bVar2.b(new a());
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
        public final void a(Runnable runnable) {
            this.f1996d.add(runnable);
        }

        public final void b() {
            if (!this.f1998f) {
                this.f1998f = true;
                if (this.f1997e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f1997e).iterator();
                while (it.hasNext()) {
                    ((j0.b) it.next()).a();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
        public void c() {
            if (!this.g) {
                if (a0.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.g = true;
                Iterator it = this.f1996d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        public final void d(c cVar, b bVar) {
            int i = c.f1991b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (a0.K(2)) {
                        StringBuilder d10 = a.a.d("SpecialEffectsController: For fragment ");
                        d10.append(this.f1995c);
                        d10.append(" mFinalState = ");
                        d10.append(this.f1993a);
                        d10.append(" -> REMOVED. mLifecycleImpact  = ");
                        d10.append(this.f1994b);
                        d10.append(" to REMOVING.");
                        Log.v("FragmentManager", d10.toString());
                    }
                    this.f1993a = c.REMOVED;
                    this.f1994b = b.REMOVING;
                } else if (i == 3 && this.f1993a != c.REMOVED) {
                    if (a0.K(2)) {
                        StringBuilder d11 = a.a.d("SpecialEffectsController: For fragment ");
                        d11.append(this.f1995c);
                        d11.append(" mFinalState = ");
                        d11.append(this.f1993a);
                        d11.append(" -> ");
                        d11.append(cVar);
                        d11.append(". ");
                        Log.v("FragmentManager", d11.toString());
                    }
                    this.f1993a = cVar;
                }
            } else if (this.f1993a == c.REMOVED) {
                if (a0.K(2)) {
                    StringBuilder d12 = a.a.d("SpecialEffectsController: For fragment ");
                    d12.append(this.f1995c);
                    d12.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    d12.append(this.f1994b);
                    d12.append(" to ADDING.");
                    Log.v("FragmentManager", d12.toString());
                }
                this.f1993a = c.VISIBLE;
                this.f1994b = b.ADDING;
            }
        }

        public void e() {
        }

        public final String toString() {
            StringBuilder c10 = m.c("Operation ", "{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append("} ");
            c10.append("{");
            c10.append("mFinalState = ");
            c10.append(this.f1993a);
            c10.append("} ");
            c10.append("{");
            c10.append("mLifecycleImpact = ");
            c10.append(this.f1994b);
            c10.append("} ");
            c10.append("{");
            c10.append("mFragment = ");
            c10.append(this.f1995c);
            c10.append("}");
            return c10.toString();
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            public void applyState(View view) {
                int i = c.f1990a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (a0.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }

            public static c from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(m.b("Unknown visibility ", i));
            }
        }
    }
}
