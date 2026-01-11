package x5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x5.i;

public final class b<T extends i<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, T> f12799a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f12800b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f12801c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12802d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12803e;

    public interface a {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T>] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean a(i<T> iVar) {
        int id2 = iVar.getId();
        if (this.f12800b.contains(Integer.valueOf(id2))) {
            return false;
        }
        i iVar2 = (i) this.f12799a.get(Integer.valueOf(c()));
        if (iVar2 != null) {
            e(iVar2, false);
        }
        boolean add = this.f12800b.add(Integer.valueOf(id2));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public final List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f12800b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final int c() {
        if (!this.f12802d || this.f12800b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f12800b.iterator().next()).intValue();
    }

    public final void d() {
        a aVar = this.f12801c;
        if (aVar != null) {
            new HashSet(this.f12800b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f3809a;
            ChipGroup.d dVar = chipGroup.f3777v;
            if (dVar != null) {
                chipGroup.f3778w.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f3778w.f12802d) {
                    ChipGroup.c cVar = aVar2.f3781a;
                    chipGroup2.getCheckedChipId();
                    cVar.a();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean e(i<T> iVar, boolean z) {
        int id2 = iVar.getId();
        if (!this.f12800b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z || this.f12800b.size() != 1 || !this.f12800b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f12800b.remove(Integer.valueOf(id2));
            if (iVar.isChecked()) {
                iVar.setChecked(false);
            }
            return remove;
        }
        iVar.setChecked(true);
        return false;
    }
}
