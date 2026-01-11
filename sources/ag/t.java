package ag;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import xh.a;

public abstract class t extends s implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public d[] f445a;

    public class a implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        public int f446a = 0;

        public a() {
        }

        public final boolean hasMoreElements() {
            return this.f446a < t.this.f445a.length;
        }

        public final Object nextElement() {
            int i = this.f446a;
            d[] dVarArr = t.this.f445a;
            if (i < dVarArr.length) {
                this.f446a = i + 1;
                return dVarArr[i];
            }
            throw new NoSuchElementException("ASN1Sequence Enumeration");
        }
    }

    public t() {
        this.f445a = e.f386d;
    }

    public t(e eVar) {
        Objects.requireNonNull(eVar, "'elementVector' cannot be null");
        this.f445a = eVar.c();
    }

    public t(d[] dVarArr) {
        this.f445a = dVarArr;
    }

    public static t r(Object obj) {
        if (obj == null || (obj instanceof t)) {
            return (t) obj;
        }
        if (obj instanceof u) {
            return r(((u) obj).d());
        }
        if (obj instanceof byte[]) {
            try {
                return r(s.n((byte[]) obj));
            } catch (IOException e10) {
                StringBuilder d10 = a.a.d("failed to construct sequence from byte[]: ");
                d10.append(e10.getMessage());
                throw new IllegalArgumentException(d10.toString());
            }
        } else {
            if (obj instanceof d) {
                s d11 = ((d) obj).d();
                if (d11 instanceof t) {
                    return (t) d11;
                }
            }
            StringBuilder d12 = a.a.d("unknown object in getInstance: ");
            d12.append(obj.getClass().getName());
            throw new IllegalArgumentException(d12.toString());
        }
    }

    public int hashCode() {
        int length = this.f445a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f445a[length].d().hashCode();
        }
    }

    public Iterator<d> iterator() {
        return new a.C0254a(this.f445a);
    }

    public final boolean j(s sVar) {
        if (!(sVar instanceof t)) {
            return false;
        }
        t tVar = (t) sVar;
        int size = size();
        if (tVar.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            s d10 = this.f445a[i].d();
            s d11 = tVar.f445a[i].d();
            if (d10 != d11 && !d10.j(d11)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o() {
        return true;
    }

    public s p() {
        return new a1(this.f445a);
    }

    public s q() {
        return new m1(this.f445a);
    }

    public d s(int i) {
        return this.f445a[i];
    }

    public int size() {
        return this.f445a.length;
    }

    public Enumeration t() {
        return new a();
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i = 0;
        while (true) {
            stringBuffer.append(this.f445a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public d[] u() {
        return this.f445a;
    }
}
