package w;

import b9.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import t.d;
import v.b;
import v.e;
import v.f;

public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f12523f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f12524a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f12525b;

    /* renamed from: c  reason: collision with root package name */
    public int f12526c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f12527d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f12528e = -1;

    public class a {
        public a(e eVar, d dVar) {
            new WeakReference(eVar);
            dVar.o(eVar.J);
            dVar.o(eVar.K);
            dVar.o(eVar.L);
            dVar.o(eVar.M);
            dVar.o(eVar.N);
        }
    }

    public o(int i) {
        int i10 = f12523f;
        f12523f = i10 + 1;
        this.f12525b = i10;
        this.f12526c = i;
    }

    public final boolean a(e eVar) {
        if (this.f12524a.contains(eVar)) {
            return false;
        }
        this.f12524a.add(eVar);
        return true;
    }

    public final void b(ArrayList<o> arrayList) {
        int size = this.f12524a.size();
        if (this.f12528e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.f12528e == oVar.f12525b) {
                    d(this.f12526c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int c(d dVar, int i) {
        int i10;
        int i11;
        if (this.f12524a.size() == 0) {
            return 0;
        }
        ArrayList<e> arrayList = this.f12524a;
        f fVar = (f) arrayList.get(0).V;
        dVar.u();
        fVar.c(dVar, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList.get(i12).c(dVar, false);
        }
        if (i == 0 && fVar.A0 > 0) {
            b.a(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.B0 > 0) {
            b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f12527d = new ArrayList<>();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f12527d.add(new a(arrayList.get(i13), dVar));
        }
        if (i == 0) {
            i10 = dVar.o(fVar.J);
            i11 = dVar.o(fVar.L);
            dVar.u();
        } else {
            i10 = dVar.o(fVar.K);
            i11 = dVar.o(fVar.M);
            dVar.u();
        }
        return i11 - i10;
    }

    public final void d(int i, o oVar) {
        Iterator<e> it = this.f12524a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            oVar.a(next);
            if (i == 0) {
                next.f12078p0 = oVar.f12525b;
            } else {
                next.f12080q0 = oVar.f12525b;
            }
        }
        this.f12528e = oVar.f12525b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i = this.f12526c;
        sb2.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String c10 = androidx.activity.result.d.c(sb2, this.f12525b, "] <");
        Iterator<e> it = this.f12524a.iterator();
        while (it.hasNext()) {
            StringBuilder c11 = m.c(c10, " ");
            c11.append(it.next().f12066j0);
            c10 = c11.toString();
        }
        return a8.a.c(c10, " >");
    }
}
