package pd;

import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.io.Serializable;
import java.util.Objects;
import pd.f;
import xd.p;
import yd.h;

public final class c implements f, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final f f9875a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f9876b;

    public static final class a extends h implements p<String, f.a, String> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f9877b = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            f.a aVar = (f.a) obj2;
            e.D(str, "acc");
            e.D(aVar, "element");
            if (str.length() == 0) {
                return aVar.toString();
            }
            return str + ", " + aVar;
        }
    }

    public c(f fVar, f.a aVar) {
        e.D(fVar, "left");
        e.D(aVar, "element");
        this.f9875a = fVar;
        this.f9876b = aVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            Objects.requireNonNull(cVar);
            int i = 2;
            c cVar2 = cVar;
            int i10 = 2;
            while (true) {
                f fVar = cVar2.f9875a;
                cVar2 = fVar instanceof c ? (c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i10++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f9875a;
                cVar3 = fVar2 instanceof c ? (c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i10 != i) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar4 = this;
            while (true) {
                f.a aVar = cVar4.f9876b;
                if (e.r(cVar.get(aVar.getKey()), aVar)) {
                    f fVar3 = cVar4.f9875a;
                    if (!(fVar3 instanceof c)) {
                        f.a aVar2 = (f.a) fVar3;
                        z = e.r(cVar.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    cVar4 = (c) fVar3;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final <R> R fold(R r10, p<? super R, ? super f.a, ? extends R> pVar) {
        return pVar.invoke(this.f9875a.fold(r10, pVar), this.f9876b);
    }

    public final <E extends f.a> E get(f.b<E> bVar) {
        e.D(bVar, "key");
        c cVar = this;
        while (true) {
            E e10 = cVar.f9876b.get(bVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar.f9875a;
            if (!(fVar instanceof c)) {
                return fVar.get(bVar);
            }
            cVar = (c) fVar;
        }
    }

    public final int hashCode() {
        return this.f9876b.hashCode() + this.f9875a.hashCode();
    }

    public final f minusKey(f.b<?> bVar) {
        e.D(bVar, "key");
        if (this.f9876b.get(bVar) != null) {
            return this.f9875a;
        }
        f minusKey = this.f9875a.minusKey(bVar);
        if (minusKey == this.f9875a) {
            return this;
        }
        if (minusKey == h.f9881a) {
            return this.f9876b;
        }
        return new c(minusKey, this.f9876b);
    }

    public final f plus(f fVar) {
        e.D(fVar, "context");
        if (fVar == h.f9881a) {
            return this;
        }
        return (f) fVar.fold(this, g.f9880b);
    }

    public final String toString() {
        return '[' + ((String) fold(BuildConfig.FLAVOR, a.f9877b)) + ']';
    }
}
