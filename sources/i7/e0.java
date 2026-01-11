package i7;

import com.github.mikephil.charting.BuildConfig;
import i7.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

public final class e0 extends c<String> implements f0, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final List<Object> f6256b;

    static {
        new e0(10).f6238a = false;
    }

    public e0(int i) {
        this.f6256b = new ArrayList(i);
    }

    public static String d(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof i)) {
            return new String((byte[]) obj, z.f6396a);
        }
        i iVar = (i) obj;
        Objects.requireNonNull(iVar);
        return iVar.size() == 0 ? BuildConfig.FLAVOR : iVar.n(z.f6396a);
    }

    public final z.d B(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f6256b);
            return new e0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final f0 R() {
        return this.f6238a ? new o1(this) : this;
    }

    public final void T(i iVar) {
        b();
        this.f6256b.add(iVar);
        this.modCount++;
    }

    public final void add(int i, Object obj) {
        b();
        this.f6256b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final Object b0(int i) {
        return this.f6256b.get(i);
    }

    public final void clear() {
        b();
        this.f6256b.clear();
        this.modCount++;
    }

    public final List<?> f0() {
        return Collections.unmodifiableList(this.f6256b);
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f6256b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            Objects.requireNonNull(iVar);
            str = iVar.size() == 0 ? BuildConfig.FLAVOR : iVar.n(z.f6396a);
            if (iVar.i()) {
                this.f6256b.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, z.f6396a);
            boolean z = false;
            if (q1.f6351a.c(bArr, 0, bArr.length) == 0) {
                z = true;
            }
            if (z) {
                this.f6256b.set(i, str);
            }
        }
        return str;
    }

    public final Object remove(int i) {
        b();
        Object remove = this.f6256b.remove(i);
        this.modCount++;
        return d(remove);
    }

    public final Object set(int i, Object obj) {
        b();
        return d(this.f6256b.set(i, (String) obj));
    }

    public final int size() {
        return this.f6256b.size();
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof f0) {
            collection = ((f0) collection).f0();
        }
        boolean addAll = this.f6256b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public e0(ArrayList<Object> arrayList) {
        this.f6256b = arrayList;
    }
}
