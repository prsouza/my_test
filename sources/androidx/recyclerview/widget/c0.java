package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import m0.c;
import s.d;
import s.g;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final g<RecyclerView.b0, a> f2473a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final d<RecyclerView.b0> f2474b = new d<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static c<a> f2475d = new m0.d(20);

        /* renamed from: a  reason: collision with root package name */
        public int f2476a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.k.c f2477b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.k.c f2478c;

        /* JADX WARNING: type inference failed for: r0v0, types: [m0.c<androidx.recyclerview.widget.c0$a>, m0.d] */
        public static a a() {
            a aVar = (a) f2475d.b();
            return aVar == null ? new a() : aVar;
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [m0.c<androidx.recyclerview.widget.c0$a>, m0.d] */
        public static void b(a aVar) {
            aVar.f2476a = 0;
            aVar.f2477b = null;
            aVar.f2478c = null;
            f2475d.a(aVar);
        }
    }

    public final void a(RecyclerView.b0 b0Var) {
        a orDefault = this.f2473a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2473a.put(b0Var, orDefault);
        }
        orDefault.f2476a |= 1;
    }

    public final void b(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a orDefault = this.f2473a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2473a.put(b0Var, orDefault);
        }
        orDefault.f2478c = cVar;
        orDefault.f2476a |= 8;
    }

    public final void c(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a orDefault = this.f2473a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f2473a.put(b0Var, orDefault);
        }
        orDefault.f2477b = cVar;
        orDefault.f2476a |= 4;
    }

    public final RecyclerView.k.c d(RecyclerView.b0 b0Var, int i) {
        a m10;
        RecyclerView.k.c cVar;
        int f10 = this.f2473a.f(b0Var);
        if (f10 >= 0 && (m10 = this.f2473a.m(f10)) != null) {
            int i10 = m10.f2476a;
            if ((i10 & i) != 0) {
                int i11 = (~i) & i10;
                m10.f2476a = i11;
                if (i == 4) {
                    cVar = m10.f2477b;
                } else if (i == 8) {
                    cVar = m10.f2478c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    this.f2473a.k(f10);
                    a.b(m10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void e(RecyclerView.b0 b0Var) {
        a orDefault = this.f2473a.getOrDefault(b0Var, null);
        if (orDefault != null) {
            orDefault.f2476a &= -2;
        }
    }

    public final void f(RecyclerView.b0 b0Var) {
        int j10 = this.f2474b.j() - 1;
        while (true) {
            if (j10 < 0) {
                break;
            } else if (b0Var == this.f2474b.k(j10)) {
                d<RecyclerView.b0> dVar = this.f2474b;
                Object[] objArr = dVar.f10820c;
                Object obj = objArr[j10];
                Object obj2 = d.f10817t;
                if (obj != obj2) {
                    objArr[j10] = obj2;
                    dVar.f10818a = true;
                }
            } else {
                j10--;
            }
        }
        a remove = this.f2473a.remove(b0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
