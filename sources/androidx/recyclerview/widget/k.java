package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;

public final class k extends z {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f2505s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f2506h = new ArrayList<>();
    public ArrayList<RecyclerView.b0> i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f2507j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<a> f2508k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.b0>> f2509l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f2510m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f2511n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f2512o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f2513p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f2514q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.b0> f2515r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f2516a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.b0 f2517b;

        /* renamed from: c  reason: collision with root package name */
        public int f2518c;

        /* renamed from: d  reason: collision with root package name */
        public int f2519d;

        /* renamed from: e  reason: collision with root package name */
        public int f2520e;

        /* renamed from: f  reason: collision with root package name */
        public int f2521f;

        public a(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i10, int i11, int i12) {
            this.f2516a = b0Var;
            this.f2517b = b0Var2;
            this.f2518c = i;
            this.f2519d = i10;
            this.f2520e = i11;
            this.f2521f = i12;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("ChangeInfo{oldHolder=");
            d10.append(this.f2516a);
            d10.append(", newHolder=");
            d10.append(this.f2517b);
            d10.append(", fromX=");
            d10.append(this.f2518c);
            d10.append(", fromY=");
            d10.append(this.f2519d);
            d10.append(", toX=");
            d10.append(this.f2520e);
            d10.append(", toY=");
            d10.append(this.f2521f);
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.b0 f2522a;

        /* renamed from: b  reason: collision with root package name */
        public int f2523b;

        /* renamed from: c  reason: collision with root package name */
        public int f2524c;

        /* renamed from: d  reason: collision with root package name */
        public int f2525d;

        /* renamed from: e  reason: collision with root package name */
        public int f2526e;

        public b(RecyclerView.b0 b0Var, int i, int i10, int i11, int i12) {
            this.f2522a = b0Var;
            this.f2523b = i;
            this.f2524c = i10;
            this.f2525d = i11;
            this.f2526e = i12;
        }
    }

    public final void e(RecyclerView.b0 b0Var) {
        View view = b0Var.f2311a;
        view.animate().cancel();
        int size = this.f2507j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2507j.get(size).f2522a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(b0Var);
                this.f2507j.remove(size);
            }
        }
        k(this.f2508k, b0Var);
        if (this.f2506h.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        if (this.i.remove(b0Var)) {
            view.setAlpha(1.0f);
            c(b0Var);
        }
        for (int size2 = this.f2511n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f2511n.get(size2);
            k(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.f2511n.remove(size2);
            }
        }
        for (int size3 = this.f2510m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f2510m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f2522a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2510m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2509l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f2509l.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                c(b0Var);
                if (arrayList3.isEmpty()) {
                    this.f2509l.remove(size5);
                }
            }
        }
        this.f2514q.remove(b0Var);
        this.f2512o.remove(b0Var);
        this.f2515r.remove(b0Var);
        this.f2513p.remove(b0Var);
        j();
    }

    public final void f() {
        int size = this.f2507j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2507j.get(size);
            View view = bVar.f2522a.f2311a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f2522a);
            this.f2507j.remove(size);
        }
        int size2 = this.f2506h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2506h.get(size2));
            this.f2506h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.i.get(size3);
            b0Var.f2311a.setAlpha(1.0f);
            c(b0Var);
            this.i.remove(size3);
        }
        int size4 = this.f2508k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2508k.get(size4);
            RecyclerView.b0 b0Var2 = aVar.f2516a;
            if (b0Var2 != null) {
                l(aVar, b0Var2);
            }
            RecyclerView.b0 b0Var3 = aVar.f2517b;
            if (b0Var3 != null) {
                l(aVar, b0Var3);
            }
        }
        this.f2508k.clear();
        if (g()) {
            int size5 = this.f2510m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f2510m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList.get(size6);
                        View view2 = bVar2.f2522a.f2311a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f2522a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2510m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2509l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f2509l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.b0 b0Var4 = (RecyclerView.b0) arrayList2.get(size8);
                        b0Var4.f2311a.setAlpha(1.0f);
                        c(b0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2509l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2511n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f2511n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = (a) arrayList3.get(size10);
                            RecyclerView.b0 b0Var5 = aVar2.f2516a;
                            if (b0Var5 != null) {
                                l(aVar2, b0Var5);
                            }
                            RecyclerView.b0 b0Var6 = aVar2.f2517b;
                            if (b0Var6 != null) {
                                l(aVar2, b0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f2511n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    i(this.f2514q);
                    i(this.f2513p);
                    i(this.f2512o);
                    i(this.f2515r);
                    d();
                    return;
                }
            }
        }
    }

    public final boolean g() {
        return !this.i.isEmpty() || !this.f2508k.isEmpty() || !this.f2507j.isEmpty() || !this.f2506h.isEmpty() || !this.f2513p.isEmpty() || !this.f2514q.isEmpty() || !this.f2512o.isEmpty() || !this.f2515r.isEmpty() || !this.f2510m.isEmpty() || !this.f2509l.isEmpty() || !this.f2511n.isEmpty();
    }

    public final boolean h(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f2311a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b0Var.f2311a.getTranslationY());
        m(b0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(b0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f2507j.add(new b(b0Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i(List<RecyclerView.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2311a.animate().cancel();
        }
    }

    public final void j() {
        if (!g()) {
            d();
        }
    }

    public final void k(List<a> list, RecyclerView.b0 b0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = list.get(size);
                if (l(aVar, b0Var) && aVar.f2516a == null && aVar.f2517b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean l(a aVar, RecyclerView.b0 b0Var) {
        if (aVar.f2517b == b0Var) {
            aVar.f2517b = null;
        } else if (aVar.f2516a != b0Var) {
            return false;
        } else {
            aVar.f2516a = null;
        }
        b0Var.f2311a.setAlpha(1.0f);
        b0Var.f2311a.setTranslationX(0.0f);
        b0Var.f2311a.setTranslationY(0.0f);
        c(b0Var);
        return true;
    }

    public final void m(RecyclerView.b0 b0Var) {
        if (f2505s == null) {
            f2505s = new ValueAnimator().getInterpolator();
        }
        b0Var.f2311a.animate().setInterpolator(f2505s);
        e(b0Var);
    }
}
