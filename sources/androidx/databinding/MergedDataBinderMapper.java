package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends d {

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends d>> f1662a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public List<d> f1663b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f1664c = new CopyOnWriteArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.databinding.d>, java.util.concurrent.CopyOnWriteArrayList] */
    public final ViewDataBinding b(e eVar, View view, int i) {
        Iterator it = this.f1663b.iterator();
        while (it.hasNext()) {
            ViewDataBinding b10 = ((d) it.next()).b(eVar, view, i);
            if (b10 != null) {
                return b10;
            }
        }
        if (e()) {
            return b(eVar, view, i);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.databinding.d>, java.util.concurrent.CopyOnWriteArrayList] */
    public final ViewDataBinding c(e eVar, View[] viewArr, int i) {
        Iterator it = this.f1663b.iterator();
        while (it.hasNext()) {
            ViewDataBinding c10 = ((d) it.next()).c(eVar, viewArr, i);
            if (c10 != null) {
                return c10;
            }
        }
        if (e()) {
            return c(eVar, viewArr, i);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Class<? extends androidx.databinding.d>>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<androidx.databinding.d>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void d(d dVar) {
        if (this.f1662a.add(dVar.getClass())) {
            this.f1663b.add(dVar);
            for (d d10 : dVar.a()) {
                d(d10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
    public final boolean e() {
        Iterator it = this.f1664c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (d.class.isAssignableFrom(cls)) {
                    d((d) cls.newInstance());
                    this.f1664c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e10) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e10);
            } catch (InstantiationException e11) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e11);
            }
        }
        return z;
    }
}
