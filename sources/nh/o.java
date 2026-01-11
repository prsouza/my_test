package nh;

import ag.n;
import fg.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Integer, o> f9108e;

    /* renamed from: a  reason: collision with root package name */
    public final d f9109a;

    /* renamed from: b  reason: collision with root package name */
    public final t f9110b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9111c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9112d;

    static {
        HashMap hashMap = new HashMap();
        n nVar = a.f5123a;
        hashMap.put(1, new o(20, 2, nVar));
        android.support.v4.media.a.f(20, 4, nVar, hashMap, 2);
        android.support.v4.media.a.f(40, 2, nVar, hashMap, 3);
        android.support.v4.media.a.f(40, 4, nVar, hashMap, 4);
        android.support.v4.media.a.f(40, 8, nVar, hashMap, 5);
        android.support.v4.media.a.f(60, 3, nVar, hashMap, 6);
        android.support.v4.media.a.f(60, 6, nVar, hashMap, 7);
        android.support.v4.media.a.f(60, 12, nVar, hashMap, 8);
        n nVar2 = a.f5125c;
        hashMap.put(9, new o(20, 2, nVar2));
        android.support.v4.media.a.f(20, 4, nVar2, hashMap, 10);
        android.support.v4.media.a.f(40, 2, nVar2, hashMap, 11);
        android.support.v4.media.a.f(40, 4, nVar2, hashMap, 12);
        android.support.v4.media.a.f(40, 8, nVar2, hashMap, 13);
        android.support.v4.media.a.f(60, 3, nVar2, hashMap, 14);
        android.support.v4.media.a.f(60, 6, nVar2, hashMap, 15);
        android.support.v4.media.a.f(60, 12, nVar2, hashMap, 16);
        n nVar3 = a.g;
        hashMap.put(17, new o(20, 2, nVar3));
        android.support.v4.media.a.f(20, 4, nVar3, hashMap, 18);
        android.support.v4.media.a.f(40, 2, nVar3, hashMap, 19);
        android.support.v4.media.a.f(40, 4, nVar3, hashMap, 20);
        android.support.v4.media.a.f(40, 8, nVar3, hashMap, 21);
        android.support.v4.media.a.f(60, 3, nVar3, hashMap, 22);
        android.support.v4.media.a.f(60, 6, nVar3, hashMap, 23);
        android.support.v4.media.a.f(60, 12, nVar3, hashMap, 24);
        n nVar4 = a.f5129h;
        hashMap.put(25, new o(20, 2, nVar4));
        android.support.v4.media.a.f(20, 4, nVar4, hashMap, 26);
        android.support.v4.media.a.f(40, 2, nVar4, hashMap, 27);
        android.support.v4.media.a.f(40, 4, nVar4, hashMap, 28);
        android.support.v4.media.a.f(40, 8, nVar4, hashMap, 29);
        android.support.v4.media.a.f(60, 3, nVar4, hashMap, 30);
        android.support.v4.media.a.f(60, 6, nVar4, hashMap, 31);
        android.support.v4.media.a.f(60, 12, nVar4, hashMap, 32);
        f9108e = Collections.unmodifiableMap(hashMap);
    }

    public o(int i, int i10, n nVar) {
        this.f9111c = i;
        this.f9112d = i10;
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i10 == 0) {
            int i11 = i / i10;
            if (i11 != 1) {
                t tVar = new t(i11, nVar);
                this.f9110b = tVar;
                String str = tVar.f9131f;
                int i12 = tVar.g;
                int i13 = tVar.f9130e;
                int i14 = tVar.f9132h.f9097d;
                Map<String, d> map = d.f9067c;
                Objects.requireNonNull(str, "algorithmName == null");
                this.f9109a = d.f9067c.get(d.a(str, i12, i13, i14, i, i10));
                return;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }
}
