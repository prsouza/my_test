package a0;

import java.util.ArrayList;
import java.util.HashSet;
import m0.c;
import m0.d;
import s.g;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c<ArrayList<T>> f12a = new d(10);

    /* renamed from: b  reason: collision with root package name */
    public final g<T, ArrayList<T>> f13b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<T> f14c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f15d = new HashSet<>();

    public final void a(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t10)) {
            if (!hashSet.contains(t10)) {
                hashSet.add(t10);
                ArrayList orDefault = this.f13b.getOrDefault(t10, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        a(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t10);
                arrayList.add(t10);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
