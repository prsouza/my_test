package nd;

import a.b;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import md.f;
import xd.l;

public class m extends j {
    public static final <T> boolean V0(Iterable<? extends T> iterable, T t10) {
        int i;
        e.D(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i10 < 0) {
                    b.N0();
                    throw null;
                } else if (e.r(t10, next)) {
                    i = i10;
                    break;
                } else {
                    i10++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(t10);
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> List<T> W0(Iterable<? extends T> iterable) {
        LinkedHashSet linkedHashSet;
        e.D(iterable, "<this>");
        if (iterable instanceof Collection) {
            linkedHashSet = new LinkedHashSet((Collection) iterable);
        } else {
            linkedHashSet = new LinkedHashSet();
            i1(iterable, linkedHashSet);
        }
        return j1(linkedHashSet);
    }

    public static final <T> T X0(List<? extends T> list) {
        e.D(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T Y0(List<? extends T> list) {
        e.D(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T, A extends Appendable> A Z0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        e.D(iterable, "<this>");
        e.D(charSequence, "separator");
        e.D(charSequence2, "prefix");
        e.D(charSequence3, "postfix");
        e.D(charSequence4, "truncated");
        a10.append(charSequence2);
        int i10 = 0;
        for (Object next : iterable) {
            i10++;
            if (i10 > 1) {
                a10.append(charSequence);
            }
            if (i >= 0 && i10 > i) {
                break;
            }
            b.E(a10, next, lVar);
        }
        if (i >= 0 && i10 > i) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static String b1(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, l lVar, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence4 = charSequence;
        CharSequence charSequence5 = (i & 2) != 0 ? BuildConfig.FLAVOR : charSequence2;
        CharSequence charSequence6 = (i & 4) != 0 ? BuildConfig.FLAVOR : charSequence3;
        int i10 = (i & 8) != 0 ? -1 : 0;
        String str = (i & 16) != 0 ? "..." : null;
        l lVar2 = (i & 32) != 0 ? null : lVar;
        e.D(iterable, "<this>");
        e.D(charSequence5, "prefix");
        e.D(charSequence6, "postfix");
        e.D(str, "truncated");
        StringBuilder sb2 = new StringBuilder();
        Z0(iterable, sb2, charSequence4, charSequence5, charSequence6, i10, str, lVar2);
        String sb3 = sb2.toString();
        e.C(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T c1(List<? extends T> list) {
        e.D(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(b.c0(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T d1(List<? extends T> list) {
        e.D(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T> List<T> e1(Collection<? extends T> collection, T t10) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> List<T> f1(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return j1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return d.D(array);
    }

    public static final <T> List g1(List list) {
        e.D(list, "<this>");
        int size = list.size();
        if (5 >= size) {
            return j1(list);
        }
        ArrayList arrayList = new ArrayList(5);
        if (list instanceof RandomAccess) {
            for (int i = size - 5; i < size; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - 5);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final byte[] h1(Collection<Byte> collection) {
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte byteValue : collection) {
            bArr[i] = byteValue.byteValue();
            i++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C i1(Iterable<? extends T> iterable, C c10) {
        e.D(iterable, "<this>");
        for (Object add : iterable) {
            c10.add(add);
        }
        return c10;
    }

    public static final <T> List<T> j1(Iterable<? extends T> iterable) {
        e.D(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return b.w0(k1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o.f8966a;
        }
        if (size != 1) {
            return l1(collection);
        }
        return b.n0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> k1(Iterable<? extends T> iterable) {
        e.D(iterable, "<this>");
        if (iterable instanceof Collection) {
            return l1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        i1(iterable, arrayList);
        return arrayList;
    }

    public static final <T> List<T> l1(Collection<? extends T> collection) {
        e.D(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> m1(Iterable<? extends T> iterable) {
        e.D(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return q.f8968a;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(aa.b.P(collection.size()));
                i1(iterable, linkedHashSet);
                return linkedHashSet;
            }
            Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : ((ArrayList) iterable).iterator().next());
            e.C(singleton, "singleton(element)");
            return singleton;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        i1(iterable, linkedHashSet2);
        int size2 = linkedHashSet2.size();
        if (size2 == 0) {
            return q.f8968a;
        }
        if (size2 != 1) {
            return linkedHashSet2;
        }
        Set<T> singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
        e.C(singleton2, "singleton(element)");
        return singleton2;
    }

    public static final <T, R> List<f<T, R>> n1(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        e.D(iterable, "<this>");
        e.D(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(g.S0(iterable), g.S0(iterable2)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new f(it.next(), it2.next()));
        }
        return arrayList;
    }
}
