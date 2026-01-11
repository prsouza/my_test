package p1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import b9.m;
import com.github.mikephil.charting.BuildConfig;
import ge.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public abstract class i implements Cloneable {
    public static final int[] J = {2, 1, 3, 4};
    public static final a K = new a();
    public static ThreadLocal<s.a<Animator, b>> L = new ThreadLocal<>();
    public ArrayList<p> A;
    public ArrayList<Animator> B = new ArrayList<>();
    public int C = 0;
    public boolean D = false;
    public boolean E = false;
    public ArrayList<d> F = null;
    public ArrayList<Animator> G = new ArrayList<>();
    public c H;
    public android.support.v4.media.b I = K;

    /* renamed from: a  reason: collision with root package name */
    public String f9525a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f9526b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f9527c = -1;

    /* renamed from: s  reason: collision with root package name */
    public TimeInterpolator f9528s = null;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Integer> f9529t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<View> f9530u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public q f9531v = new q();

    /* renamed from: w  reason: collision with root package name */
    public q f9532w = new q();

    /* renamed from: x  reason: collision with root package name */
    public n f9533x = null;

    /* renamed from: y  reason: collision with root package name */
    public int[] f9534y = J;
    public ArrayList<p> z;

    public class a extends android.support.v4.media.b {
        public final Path t0(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f9535a;

        /* renamed from: b  reason: collision with root package name */
        public String f9536b;

        /* renamed from: c  reason: collision with root package name */
        public p f9537c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f9538d;

        /* renamed from: e  reason: collision with root package name */
        public i f9539e;

        public b(View view, String str, i iVar, c0 c0Var, p pVar) {
            this.f9535a = view;
            this.f9536b = str;
            this.f9537c = pVar;
            this.f9538d = c0Var;
            this.f9539e = iVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a(i iVar);

        void b();

        void c();

        void d();

        void e(i iVar);
    }

    public static void c(q qVar, View view, p pVar) {
        qVar.f9558a.put(view, pVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (qVar.f9559b.indexOfKey(id2) >= 0) {
                qVar.f9559b.put(id2, (Object) null);
            } else {
                qVar.f9559b.put(id2, view);
            }
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        String k10 = x.i.k(view);
        if (k10 != null) {
            if (qVar.f9561d.containsKey(k10)) {
                qVar.f9561d.put(k10, null);
            } else {
                qVar.f9561d.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                s.d<View> dVar = qVar.f9560c;
                if (dVar.f10818a) {
                    dVar.d();
                }
                if (g0.k(dVar.f10819b, dVar.f10821s, itemIdAtPosition) >= 0) {
                    View g = qVar.f9560c.g(itemIdAtPosition, null);
                    if (g != null) {
                        x.d.r(g, false);
                        qVar.f9560c.i(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                x.d.r(view, true);
                qVar.f9560c.i(itemIdAtPosition, view);
            }
        }
    }

    public static s.a<Animator, b> q() {
        s.a<Animator, b> aVar = L.get();
        if (aVar != null) {
            return aVar;
        }
        s.a<Animator, b> aVar2 = new s.a<>();
        L.set(aVar2);
        return aVar2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public static boolean x(p pVar, p pVar2, String str) {
        Object obj = pVar.f9555a.get(str);
        Object obj2 = pVar2.f9555a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public i A(View view) {
        this.f9530u.remove(view);
        return this;
    }

    public void B(View view) {
        if (this.D) {
            if (!this.E) {
                int size = this.B.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.B.get(size).resume();
                }
                ArrayList<d> arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.F.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((d) arrayList2.get(i)).c();
                    }
                }
            }
            this.D = false;
        }
    }

    public void C() {
        J();
        s.a<Animator, b> q10 = q();
        Iterator<Animator> it = this.G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (q10.containsKey(next)) {
                J();
                if (next != null) {
                    next.addListener(new j(this, q10));
                    long j10 = this.f9527c;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f9526b;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f9528s;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.G.clear();
        o();
    }

    public i D(long j10) {
        this.f9527c = j10;
        return this;
    }

    public void E(c cVar) {
        this.H = cVar;
    }

    public i F(TimeInterpolator timeInterpolator) {
        this.f9528s = timeInterpolator;
        return this;
    }

    public void G(android.support.v4.media.b bVar) {
        if (bVar == null) {
            this.I = K;
        } else {
            this.I = bVar;
        }
    }

    public void H() {
    }

    public i I(long j10) {
        this.f9526b = j10;
        return this;
    }

    public final void J() {
        if (this.C == 0) {
            ArrayList<d> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).e(this);
                }
            }
            this.E = false;
        }
        this.C++;
    }

    public String K(String str) {
        StringBuilder d10 = a.a.d(str);
        d10.append(getClass().getSimpleName());
        d10.append("@");
        d10.append(Integer.toHexString(hashCode()));
        d10.append(": ");
        String sb2 = d10.toString();
        if (this.f9527c != -1) {
            StringBuilder c10 = m.c(sb2, "dur(");
            c10.append(this.f9527c);
            c10.append(") ");
            sb2 = c10.toString();
        }
        if (this.f9526b != -1) {
            StringBuilder c11 = m.c(sb2, "dly(");
            c11.append(this.f9526b);
            c11.append(") ");
            sb2 = c11.toString();
        }
        if (this.f9528s != null) {
            StringBuilder c12 = m.c(sb2, "interp(");
            c12.append(this.f9528s);
            c12.append(") ");
            sb2 = c12.toString();
        }
        if (this.f9529t.size() <= 0 && this.f9530u.size() <= 0) {
            return sb2;
        }
        String c13 = a8.a.c(sb2, "tgts(");
        if (this.f9529t.size() > 0) {
            for (int i = 0; i < this.f9529t.size(); i++) {
                if (i > 0) {
                    c13 = a8.a.c(c13, ", ");
                }
                StringBuilder d11 = a.a.d(c13);
                d11.append(this.f9529t.get(i));
                c13 = d11.toString();
            }
        }
        if (this.f9530u.size() > 0) {
            for (int i10 = 0; i10 < this.f9530u.size(); i10++) {
                if (i10 > 0) {
                    c13 = a8.a.c(c13, ", ");
                }
                StringBuilder d12 = a.a.d(c13);
                d12.append(this.f9530u.get(i10));
                c13 = d12.toString();
            }
        }
        return a8.a.c(c13, ")");
    }

    public i a(d dVar) {
        if (this.F == null) {
            this.F = new ArrayList<>();
        }
        this.F.add(dVar);
        return this;
    }

    public i b(View view) {
        this.f9530u.add(view);
        return this;
    }

    public void cancel() {
        int size = this.B.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            this.B.get(size).cancel();
        }
        ArrayList<d> arrayList = this.F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((d) arrayList2.get(i)).d();
            }
        }
    }

    public abstract void d(p pVar);

    public final void g(View view, boolean z10) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                p pVar = new p(view);
                if (z10) {
                    i(pVar);
                } else {
                    d(pVar);
                }
                pVar.f9557c.add(this);
                h(pVar);
                if (z10) {
                    c(this.f9531v, view, pVar);
                } else {
                    c(this.f9532w, view, pVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    g(viewGroup.getChildAt(i), z10);
                }
            }
        }
    }

    public void h(p pVar) {
    }

    public abstract void i(p pVar);

    public final void j(ViewGroup viewGroup, boolean z10) {
        k(z10);
        if (this.f9529t.size() > 0 || this.f9530u.size() > 0) {
            for (int i = 0; i < this.f9529t.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f9529t.get(i).intValue());
                if (findViewById != null) {
                    p pVar = new p(findViewById);
                    if (z10) {
                        i(pVar);
                    } else {
                        d(pVar);
                    }
                    pVar.f9557c.add(this);
                    h(pVar);
                    if (z10) {
                        c(this.f9531v, findViewById, pVar);
                    } else {
                        c(this.f9532w, findViewById, pVar);
                    }
                }
            }
            for (int i10 = 0; i10 < this.f9530u.size(); i10++) {
                View view = this.f9530u.get(i10);
                p pVar2 = new p(view);
                if (z10) {
                    i(pVar2);
                } else {
                    d(pVar2);
                }
                pVar2.f9557c.add(this);
                h(pVar2);
                if (z10) {
                    c(this.f9531v, view, pVar2);
                } else {
                    c(this.f9532w, view, pVar2);
                }
            }
            return;
        }
        g(viewGroup, z10);
    }

    public final void k(boolean z10) {
        if (z10) {
            this.f9531v.f9558a.clear();
            this.f9531v.f9559b.clear();
            this.f9531v.f9560c.b();
            return;
        }
        this.f9532w.f9558a.clear();
        this.f9532w.f9559b.clear();
        this.f9532w.f9560c.b();
    }

    /* renamed from: l */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.G = new ArrayList<>();
            iVar.f9531v = new q();
            iVar.f9532w = new q();
            iVar.z = null;
            iVar.A = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator m(ViewGroup viewGroup, p pVar, p pVar2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public void n(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        int i;
        Animator m10;
        Animator animator;
        p pVar;
        View view;
        p pVar2;
        Animator animator2;
        Animator animator3;
        p pVar3;
        ViewGroup viewGroup2 = viewGroup;
        s.a<Animator, b> q10 = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar4 = arrayList.get(i10);
            p pVar5 = arrayList2.get(i10);
            if (pVar4 != null && !pVar4.f9557c.contains(this)) {
                pVar4 = null;
            }
            if (pVar5 != null && !pVar5.f9557c.contains(this)) {
                pVar5 = null;
            }
            if (!(pVar4 == null && pVar5 == null)) {
                if ((pVar4 == null || pVar5 == null || v(pVar4, pVar5)) && (m10 = m(viewGroup2, pVar4, pVar5)) != null) {
                    if (pVar5 != null) {
                        View view2 = pVar5.f9556b;
                        String[] r10 = r();
                        if (r10 == null || r10.length <= 0) {
                            q qVar3 = qVar2;
                            animator3 = m10;
                            i = size;
                            pVar3 = null;
                        } else {
                            pVar2 = new p(view2);
                            p orDefault = qVar2.f9558a.getOrDefault(view2, null);
                            if (orDefault != null) {
                                int i11 = 0;
                                while (i11 < r10.length) {
                                    pVar2.f9555a.put(r10[i11], orDefault.f9555a.get(r10[i11]));
                                    i11++;
                                    m10 = m10;
                                    size = size;
                                    orDefault = orDefault;
                                }
                            }
                            animator3 = m10;
                            i = size;
                            int i12 = q10.f10843c;
                            for (int i13 = 0; i13 < i12; i13++) {
                                b orDefault2 = q10.getOrDefault(q10.i(i13), null);
                                if (orDefault2.f9537c != null && orDefault2.f9535a == view2 && orDefault2.f9536b.equals(this.f9525a) && orDefault2.f9537c.equals(pVar2)) {
                                    animator2 = null;
                                    break;
                                }
                            }
                            pVar3 = pVar2;
                        }
                        pVar2 = pVar3;
                        animator2 = animator3;
                        view = view2;
                        animator = animator2;
                        pVar = pVar2;
                    } else {
                        q qVar4 = qVar2;
                        pVar = null;
                        i = size;
                        view = pVar4.f9556b;
                        animator = m10;
                    }
                    if (animator != null) {
                        String str = this.f9525a;
                        x xVar = t.f9564a;
                        q10.put(animator, new b(view, str, this, new b0(viewGroup2), pVar));
                        this.G.add(animator);
                    }
                    i10++;
                    size = i;
                }
            }
            q qVar5 = qVar2;
            i = size;
            i10++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.G.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE));
            }
        }
    }

    public final void o() {
        int i = this.C - 1;
        this.C = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).a(this);
                }
            }
            for (int i11 = 0; i11 < this.f9531v.f9560c.j(); i11++) {
                View k10 = this.f9531v.f9560c.k(i11);
                if (k10 != null) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.d.r(k10, false);
                }
            }
            for (int i12 = 0; i12 < this.f9532w.f9560c.j(); i12++) {
                View k11 = this.f9532w.f9560c.k(i12);
                if (k11 != null) {
                    WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                    x.d.r(k11, false);
                }
            }
            this.E = true;
        }
    }

    public final p p(View view, boolean z10) {
        n nVar = this.f9533x;
        if (nVar != null) {
            return nVar.p(view, z10);
        }
        ArrayList<p> arrayList = z10 ? this.z : this.A;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            p pVar = arrayList.get(i10);
            if (pVar == null) {
                return null;
            }
            if (pVar.f9556b == view) {
                i = i10;
                break;
            }
            i10++;
        }
        if (i < 0) {
            return null;
        }
        return (z10 ? this.A : this.z).get(i);
    }

    public String[] r() {
        return null;
    }

    public final String toString() {
        return K(BuildConfig.FLAVOR);
    }

    public final p u(View view, boolean z10) {
        n nVar = this.f9533x;
        if (nVar != null) {
            return nVar.u(view, z10);
        }
        return (z10 ? this.f9531v : this.f9532w).f9558a.getOrDefault(view, null);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public boolean v(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return false;
        }
        String[] r10 = r();
        if (r10 != null) {
            int length = r10.length;
            int i = 0;
            while (i < length) {
                if (!x(pVar, pVar2, r10[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String x10 : pVar.f9555a.keySet()) {
            if (x(pVar, pVar2, x10)) {
            }
        }
        return false;
        return true;
    }

    public final boolean w(View view) {
        int id2 = view.getId();
        if ((this.f9529t.size() != 0 || this.f9530u.size() != 0) && !this.f9529t.contains(Integer.valueOf(id2)) && !this.f9530u.contains(view)) {
            return false;
        }
        return true;
    }

    public void y(View view) {
        if (!this.E) {
            for (int size = this.B.size() - 1; size >= 0; size--) {
                this.B.get(size).pause();
            }
            ArrayList<d> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size2 = arrayList2.size();
                for (int i = 0; i < size2; i++) {
                    ((d) arrayList2.get(i)).b();
                }
            }
            this.D = true;
        }
    }

    public i z(d dVar) {
        ArrayList<d> arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }
}
