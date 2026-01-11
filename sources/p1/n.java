package p1;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import b9.m;
import java.util.ArrayList;
import java.util.Iterator;
import p1.i;

public class n extends i {
    public ArrayList<i> M = new ArrayList<>();
    public boolean N = true;
    public int O;
    public boolean P = false;
    public int Q = 0;

    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f9550a;

        public a(i iVar) {
            this.f9550a = iVar;
        }

        public final void a(i iVar) {
            this.f9550a.C();
            iVar.z(this);
        }
    }

    public static class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public n f9551a;

        public b(n nVar) {
            this.f9551a = nVar;
        }

        public final void a(i iVar) {
            n nVar = this.f9551a;
            int i = nVar.O - 1;
            nVar.O = i;
            if (i == 0) {
                nVar.P = false;
                nVar.o();
            }
            iVar.z(this);
        }

        public final void e(i iVar) {
            n nVar = this.f9551a;
            if (!nVar.P) {
                nVar.J();
                this.f9551a.P = true;
            }
        }
    }

    public final i A(View view) {
        for (int i = 0; i < this.M.size(); i++) {
            this.M.get(i).A(view);
        }
        this.f9530u.remove(view);
        return this;
    }

    public final void B(View view) {
        super.B(view);
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).B(view);
        }
    }

    public final void C() {
        if (this.M.isEmpty()) {
            J();
            o();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.O = this.M.size();
        if (!this.N) {
            for (int i = 1; i < this.M.size(); i++) {
                this.M.get(i - 1).a(new a(this.M.get(i)));
            }
            i iVar = this.M.get(0);
            if (iVar != null) {
                iVar.C();
                return;
            }
            return;
        }
        Iterator<i> it2 = this.M.iterator();
        while (it2.hasNext()) {
            it2.next().C();
        }
    }

    public final i D(long j10) {
        ArrayList<i> arrayList;
        this.f9527c = j10;
        if (j10 >= 0 && (arrayList = this.M) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.M.get(i).D(j10);
            }
        }
        return this;
    }

    public final void E(i.c cVar) {
        this.H = cVar;
        this.Q |= 8;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).E(cVar);
        }
    }

    public final i F(TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        ArrayList<i> arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.M.get(i).F(timeInterpolator);
            }
        }
        this.f9528s = timeInterpolator;
        return this;
    }

    public final void G(android.support.v4.media.b bVar) {
        super.G(bVar);
        this.Q |= 4;
        if (this.M != null) {
            for (int i = 0; i < this.M.size(); i++) {
                this.M.get(i).G(bVar);
            }
        }
    }

    public final void H() {
        this.Q |= 2;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).H();
        }
    }

    public final i I(long j10) {
        this.f9526b = j10;
        return this;
    }

    public final String K(String str) {
        String K = super.K(str);
        for (int i = 0; i < this.M.size(); i++) {
            StringBuilder c10 = m.c(K, "\n");
            c10.append(this.M.get(i).K(str + "  "));
            K = c10.toString();
        }
        return K;
    }

    public final n L(i iVar) {
        this.M.add(iVar);
        iVar.f9533x = this;
        long j10 = this.f9527c;
        if (j10 >= 0) {
            iVar.D(j10);
        }
        if ((this.Q & 1) != 0) {
            iVar.F(this.f9528s);
        }
        if ((this.Q & 2) != 0) {
            iVar.H();
        }
        if ((this.Q & 4) != 0) {
            iVar.G(this.I);
        }
        if ((this.Q & 8) != 0) {
            iVar.E(this.H);
        }
        return this;
    }

    public final i M(int i) {
        if (i < 0 || i >= this.M.size()) {
            return null;
        }
        return this.M.get(i);
    }

    public final i a(i.d dVar) {
        super.a(dVar);
        return this;
    }

    public final i b(View view) {
        for (int i = 0; i < this.M.size(); i++) {
            this.M.get(i).b(view);
        }
        this.f9530u.add(view);
        return this;
    }

    public final void cancel() {
        super.cancel();
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).cancel();
        }
    }

    public final void d(p pVar) {
        if (w(pVar.f9556b)) {
            Iterator<i> it = this.M.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(pVar.f9556b)) {
                    next.d(pVar);
                    pVar.f9557c.add(next);
                }
            }
        }
    }

    public final void h(p pVar) {
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).h(pVar);
        }
    }

    public final void i(p pVar) {
        if (w(pVar.f9556b)) {
            Iterator<i> it = this.M.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.w(pVar.f9556b)) {
                    next.i(pVar);
                    pVar.f9557c.add(next);
                }
            }
        }
    }

    /* renamed from: l */
    public final i clone() {
        n nVar = (n) super.clone();
        nVar.M = new ArrayList<>();
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            i l10 = this.M.get(i).clone();
            nVar.M.add(l10);
            l10.f9533x = nVar;
        }
        return nVar;
    }

    public final void n(ViewGroup viewGroup, q qVar, q qVar2, ArrayList<p> arrayList, ArrayList<p> arrayList2) {
        long j10 = this.f9526b;
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            i iVar = this.M.get(i);
            if (j10 > 0 && (this.N || i == 0)) {
                long j11 = iVar.f9526b;
                if (j11 > 0) {
                    iVar.I(j11 + j10);
                } else {
                    iVar.I(j10);
                }
            }
            iVar.n(viewGroup, qVar, qVar2, arrayList, arrayList2);
        }
    }

    public final void y(View view) {
        super.y(view);
        int size = this.M.size();
        for (int i = 0; i < size; i++) {
            this.M.get(i).y(view);
        }
    }

    public final i z(i.d dVar) {
        super.z(dVar);
        return this;
    }
}
