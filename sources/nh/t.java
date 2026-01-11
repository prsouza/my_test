package nh;

import ag.n;
import fg.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class t {
    public static final Map<Integer, t> i;

    /* renamed from: a  reason: collision with root package name */
    public final e f9126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9128c;

    /* renamed from: d  reason: collision with root package name */
    public final n f9129d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9130e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9131f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final l f9132h;

    static {
        HashMap hashMap = new HashMap();
        n nVar = a.f5123a;
        hashMap.put(1, new t(10, nVar));
        hashMap.put(2, new t(16, nVar));
        hashMap.put(3, new t(20, nVar));
        n nVar2 = a.f5125c;
        hashMap.put(4, new t(10, nVar2));
        hashMap.put(5, new t(16, nVar2));
        hashMap.put(6, new t(20, nVar2));
        n nVar3 = a.g;
        hashMap.put(7, new t(10, nVar3));
        hashMap.put(8, new t(16, nVar3));
        hashMap.put(9, new t(20, nVar3));
        n nVar4 = a.f5129h;
        hashMap.put(10, new t(10, nVar4));
        hashMap.put(11, new t(16, nVar4));
        hashMap.put(12, new t(20, nVar4));
        i = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<ag.n, java.lang.String>, java.util.HashMap] */
    public t(int i10, n nVar) {
        if (i10 >= 2) {
            Objects.requireNonNull(nVar, "digest == null");
            this.f9127b = i10;
            int i11 = 2;
            while (true) {
                int i12 = this.f9127b;
                if (i11 > i12) {
                    throw new IllegalStateException("should never happen...");
                } else if ((i12 - i11) % 2 == 0) {
                    this.f9128c = i11;
                    String str = (String) f.f9074b.get(nVar);
                    if (str != null) {
                        this.f9131f = str;
                        this.f9129d = nVar;
                        l lVar = new l(nVar);
                        this.f9132h = lVar;
                        int i13 = lVar.f9095b;
                        this.g = i13;
                        int i14 = lVar.f9096c;
                        this.f9130e = i14;
                        int i15 = lVar.f9097d;
                        Map<String, e> map = e.f9070c;
                        this.f9126a = e.f9070c.get(e.a(str, i13, i14, i15, i10));
                        return;
                    }
                    throw new IllegalArgumentException("unrecognized digest oid: " + nVar);
                } else {
                    i11++;
                }
            }
        } else {
            throw new IllegalArgumentException("height must be >= 2");
        }
    }

    public final j a() {
        return new j(this.f9132h);
    }
}
