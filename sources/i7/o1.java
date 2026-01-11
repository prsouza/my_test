package i7;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class o1 extends AbstractList<String> implements f0, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f6335a;

    public class a implements ListIterator<String> {

        /* renamed from: a  reason: collision with root package name */
        public ListIterator<String> f6336a;

        public a(o1 o1Var, int i) {
            this.f6336a = o1Var.f6335a.listIterator(i);
        }

        public final void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            return this.f6336a.hasNext();
        }

        public final boolean hasPrevious() {
            return this.f6336a.hasPrevious();
        }

        public final Object next() {
            return this.f6336a.next();
        }

        public final int nextIndex() {
            return this.f6336a.nextIndex();
        }

        public final Object previous() {
            return this.f6336a.previous();
        }

        public final int previousIndex() {
            return this.f6336a.previousIndex();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }

        public final void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<String> f6337a;

        public b(o1 o1Var) {
            this.f6337a = o1Var.f6335a.iterator();
        }

        public final boolean hasNext() {
            return this.f6337a.hasNext();
        }

        public final Object next() {
            return this.f6337a.next();
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public o1(f0 f0Var) {
        this.f6335a = f0Var;
    }

    public final f0 R() {
        return this;
    }

    public final void T(i iVar) {
        throw new UnsupportedOperationException();
    }

    public final Object b0(int i) {
        return this.f6335a.b0(i);
    }

    public final List<?> f0() {
        return this.f6335a.f0();
    }

    public final Object get(int i) {
        return (String) this.f6335a.get(i);
    }

    public final Iterator<String> iterator() {
        return new b(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new a(this, i);
    }

    public final int size() {
        return this.f6335a.size();
    }
}
