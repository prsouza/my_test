package v1;

import android.support.v4.media.b;
import android.text.TextUtils;
import e2.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import u1.g;
import u1.p;
import u1.s;
import u1.w;

public final class f extends b {
    public static final String E = p.e("WorkContinuationImpl");
    public final List<String> A;
    public final List<f> B = null;
    public boolean C;
    public b D;

    /* renamed from: v  reason: collision with root package name */
    public final j f12143v;

    /* renamed from: w  reason: collision with root package name */
    public final String f12144w;

    /* renamed from: x  reason: collision with root package name */
    public final g f12145x;

    /* renamed from: y  reason: collision with root package name */
    public final List<? extends w> f12146y;
    public final List<String> z;

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public f(j jVar, String str, g gVar, List<? extends w> list, List<f> list2) {
        this.f12143v = jVar;
        this.f12144w = str;
        this.f12145x = gVar;
        this.f12146y = list;
        this.z = new ArrayList(list.size());
        this.A = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String a10 = ((w) list.get(i)).a();
            this.z.add(a10);
            this.A.add(a10);
        }
    }

    public static boolean s2(f fVar, Set<String> set) {
        set.addAll(fVar.z);
        Set<String> t22 = t2(fVar);
        for (String contains : set) {
            if (((HashSet) t22).contains(contains)) {
                return true;
            }
        }
        List<f> list = fVar.B;
        if (list != null && !list.isEmpty()) {
            for (f s22 : list) {
                if (s2(s22, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.z);
        return false;
    }

    public static Set<String> t2(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.B;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                hashSet.addAll(fVar2.z);
            }
        }
        return hashSet;
    }

    public final s r2() {
        if (!this.C) {
            d dVar = new d(this);
            ((g2.b) this.f12143v.f12153y).a(dVar);
            this.D = dVar.f4539b;
        } else {
            p.c().f(E, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.z)}), new Throwable[0]);
        }
        return this.D;
    }
}
