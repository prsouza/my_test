package nh;

import ag.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import nh.g;
import nh.h;
import nh.i;

public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public transient j f9049a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9050b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f9051c;

    /* renamed from: s  reason: collision with root package name */
    public int f9052s;

    /* renamed from: t  reason: collision with root package name */
    public List<r> f9053t;

    /* renamed from: u  reason: collision with root package name */
    public Map<Integer, LinkedList<r>> f9054u;

    /* renamed from: v  reason: collision with root package name */
    public Stack<r> f9055v;

    /* renamed from: w  reason: collision with root package name */
    public Map<Integer, r> f9056w;

    /* renamed from: x  reason: collision with root package name */
    public int f9057x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9058y;
    public transient int z;

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    public a(a aVar) {
        this.f9049a = new j(aVar.f9049a.f9087a);
        this.f9050b = aVar.f9050b;
        this.f9052s = aVar.f9052s;
        ArrayList arrayList = new ArrayList();
        this.f9053t = arrayList;
        arrayList.addAll(aVar.f9053t);
        this.f9054u = new TreeMap();
        for (Integer num : aVar.f9054u.keySet()) {
            this.f9054u.put(num, (LinkedList) ((LinkedList) aVar.f9054u.get(num)).clone());
        }
        Stack<r> stack = new Stack<>();
        this.f9055v = stack;
        stack.addAll(aVar.f9055v);
        this.f9051c = new ArrayList();
        Iterator it = aVar.f9051c.iterator();
        while (it.hasNext()) {
            this.f9051c.add(((c) it.next()).clone());
        }
        this.f9056w = new TreeMap(aVar.f9056w);
        this.f9057x = aVar.f9057x;
        this.z = aVar.z;
        this.f9058y = aVar.f9058y;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List<nh.c>, java.util.ArrayList] */
    public a(j jVar, int i, int i10, int i11) {
        this.f9049a = jVar;
        this.f9050b = i;
        this.z = i11;
        this.f9052s = i10;
        if (i10 <= i && i10 >= 2) {
            int i12 = i - i10;
            if (i12 % 2 == 0) {
                this.f9053t = new ArrayList();
                this.f9054u = new TreeMap();
                this.f9055v = new Stack<>();
                this.f9051c = new ArrayList();
                for (int i13 = 0; i13 < i12; i13++) {
                    this.f9051c.add(new c(i13));
                }
                this.f9056w = new TreeMap();
                this.f9057x = 0;
                this.f9058y = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX WARNING: type inference failed for: r6v26, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r1v38, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r6v29, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v30, types: [java.util.List<nh.r>, java.util.ArrayList] */
    public final void a(byte[] bArr, byte[] bArr2, i iVar) {
        int i;
        int i10;
        h hVar = new h((h.a) ((h.a) new h.a().c(iVar.f9100a)).d(iVar.f9101b));
        g gVar = new g((g.a) ((g.a) new g.a().c(iVar.f9100a)).d(iVar.f9101b));
        int i11 = 0;
        while (i11 < (1 << this.f9050b)) {
            i.a aVar = (i.a) ((i.a) new i.a().c(iVar.f9100a)).d(iVar.f9101b);
            aVar.f9085e = i11;
            aVar.f9086f = iVar.f9084f;
            aVar.g = iVar.g;
            i iVar2 = new i((i.a) aVar.b(iVar.f9103d));
            j jVar = this.f9049a;
            jVar.d(jVar.c(bArr2, iVar2), bArr);
            m b10 = this.f9049a.b(iVar2);
            h.a aVar2 = (h.a) ((h.a) new h.a().c(hVar.f9100a)).d(hVar.f9101b);
            aVar2.f9081e = i11;
            aVar2.f9082f = hVar.f9080f;
            aVar2.g = hVar.g;
            h hVar2 = new h((h.a) aVar2.b(hVar.f9103d));
            r a10 = s.a(this.f9049a, b10, hVar2);
            g.a aVar3 = (g.a) ((g.a) new g.a().c(gVar.f9100a)).d(gVar.f9101b);
            aVar3.f9078f = i11;
            gVar = new g((g.a) aVar3.b(gVar.f9103d));
            while (!this.f9055v.isEmpty() && this.f9055v.peek().f9124a == (i = a10.f9124a)) {
                int i12 = i11 / (1 << i);
                if (i12 == 1) {
                    this.f9053t.add(a10);
                }
                if (i12 == 3 && (i10 = a10.f9124a) < this.f9050b - this.f9052s) {
                    c cVar = (c) this.f9051c.get(i10);
                    cVar.f9061a = a10;
                    int i13 = a10.f9124a;
                    cVar.f9063c = i13;
                    if (i13 == cVar.f9062b) {
                        cVar.f9066u = true;
                    }
                }
                if (i12 >= 3 && (i12 & 1) == 1) {
                    int i14 = a10.f9124a;
                    int i15 = this.f9050b;
                    if (i14 >= i15 - this.f9052s && i14 <= i15 - 2) {
                        if (this.f9054u.get(Integer.valueOf(i14)) == null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(a10);
                            this.f9054u.put(Integer.valueOf(a10.f9124a), linkedList);
                        } else {
                            ((LinkedList) this.f9054u.get(Integer.valueOf(a10.f9124a))).add(a10);
                        }
                    }
                }
                g.a aVar4 = (g.a) ((g.a) new g.a().c(gVar.f9100a)).d(gVar.f9101b);
                aVar4.f9077e = gVar.f9075e;
                aVar4.f9078f = (gVar.f9076f - 1) / 2;
                g gVar2 = new g((g.a) aVar4.b(gVar.f9103d));
                r b11 = s.b(this.f9049a, this.f9055v.pop(), a10, gVar2);
                r rVar = new r(b11.f9124a + 1, b11.a());
                g.a aVar5 = (g.a) ((g.a) new g.a().c(gVar2.f9100a)).d(gVar2.f9101b);
                aVar5.f9077e = gVar2.f9075e + 1;
                aVar5.f9078f = gVar2.f9076f;
                gVar = new g((g.a) aVar5.b(gVar2.f9103d));
                a10 = rVar;
            }
            this.f9055v.push(a10);
            i11++;
            iVar = iVar2;
            hVar = hVar2;
        }
        r pop = this.f9055v.pop();
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [java.util.List<nh.r>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, nh.r>] */
    /* JADX WARNING: type inference failed for: r4v22, types: [java.util.List<nh.r>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v23, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, nh.r>] */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v15, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r6v19, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v34, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v61, types: [java.util.List<nh.r>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v64, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, nh.r>] */
    /* JADX WARNING: type inference failed for: r9v47, types: [java.util.List<nh.r>, java.util.ArrayList] */
    public final void b(byte[] bArr, byte[] bArr2, i iVar) {
        int i;
        Object obj;
        List<r> list;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        i iVar2 = iVar;
        if (!this.f9058y) {
            int i10 = this.f9057x;
            if (i10 <= this.z - 1) {
                int i11 = this.f9050b;
                int i12 = 0;
                while (true) {
                    if (i12 >= i11) {
                        i12 = 0;
                        break;
                    } else if (((i10 >> i12) & 1) == 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (((this.f9057x >> (i12 + 1)) & 1) == 0 && i12 < this.f9050b - 1) {
                    this.f9056w.put(Integer.valueOf(i12), this.f9053t.get(i12));
                }
                h.a aVar = (h.a) ((h.a) new h.a().c(iVar2.f9100a)).d(iVar2.f9101b);
                int i13 = aVar.f9105b;
                long j10 = aVar.f9106c;
                int i14 = aVar.f9107d;
                int i15 = aVar.f9082f;
                int i16 = aVar.g;
                g.a aVar2 = (g.a) ((g.a) new g.a().c(iVar2.f9100a)).d(iVar2.f9101b);
                int i17 = aVar2.f9105b;
                long j11 = aVar2.f9106c;
                int i18 = aVar2.f9107d;
                if (i12 == 0) {
                    i.a aVar3 = (i.a) ((i.a) new i.a().c(iVar2.f9100a)).d(iVar2.f9101b);
                    aVar3.f9085e = this.f9057x;
                    aVar3.f9086f = iVar2.f9084f;
                    aVar3.g = iVar2.g;
                    i iVar3 = new i((i.a) aVar3.b(iVar2.f9103d));
                    j jVar = this.f9049a;
                    jVar.d(jVar.c(bArr4, iVar3), bArr3);
                    m b10 = this.f9049a.b(iVar3);
                    h.a aVar4 = (h.a) ((h.a) new h.a().c(i13)).d(j10);
                    aVar4.f9081e = this.f9057x;
                    aVar4.f9082f = i15;
                    aVar4.g = i16;
                    this.f9053t.set(0, s.a(this.f9049a, b10, new h((h.a) aVar4.b(i14))));
                    iVar2 = iVar3;
                } else {
                    g.a aVar5 = (g.a) ((g.a) new g.a().c(i17)).d(j11);
                    int i19 = i12 - 1;
                    aVar5.f9077e = i19;
                    aVar5.f9078f = this.f9057x >> i12;
                    g gVar = new g((g.a) aVar5.b(i18));
                    j jVar2 = this.f9049a;
                    jVar2.d(jVar2.c(bArr4, iVar2), bArr3);
                    r b11 = s.b(this.f9049a, (r) this.f9053t.get(i19), (r) this.f9056w.get(Integer.valueOf(i19)), gVar);
                    this.f9053t.set(i12, new r(b11.f9124a + 1, b11.a()));
                    this.f9056w.remove(Integer.valueOf(i19));
                    int i20 = 0;
                    while (true) {
                        i = this.f9050b;
                        if (i20 >= i12) {
                            break;
                        }
                        if (i20 < i - this.f9052s) {
                            list = this.f9053t;
                            obj = ((c) this.f9051c.get(i20)).f9061a;
                        } else {
                            list = this.f9053t;
                            obj = ((LinkedList) this.f9054u.get(Integer.valueOf(i20))).removeFirst();
                        }
                        list.set(i20, obj);
                        i20++;
                    }
                    int min = Math.min(i12, i - this.f9052s);
                    for (int i21 = 0; i21 < min; i21++) {
                        int i22 = ((1 << i21) * 3) + this.f9057x + 1;
                        if (i22 < (1 << this.f9050b)) {
                            c cVar = (c) this.f9051c.get(i21);
                            cVar.f9061a = null;
                            cVar.f9063c = cVar.f9062b;
                            cVar.f9064s = i22;
                            cVar.f9065t = true;
                            cVar.f9066u = false;
                        }
                    }
                }
                int i23 = 0;
                for (int i24 = 1; i23 < ((this.f9050b - this.f9052s) >> i24); i24 = 1) {
                    Iterator it = this.f9051c.iterator();
                    c cVar2 = null;
                    while (it.hasNext()) {
                        c cVar3 = (c) it.next();
                        if (!cVar3.f9066u && cVar3.f9065t) {
                            if (cVar2 == null || cVar3.b() < cVar2.b() || (cVar3.b() == cVar2.b() && cVar3.f9064s < cVar2.f9064s)) {
                                cVar2 = cVar3;
                            }
                        }
                    }
                    if (cVar2 != null) {
                        Stack<r> stack = this.f9055v;
                        j jVar3 = this.f9049a;
                        if (cVar2.f9066u || !cVar2.f9065t) {
                            throw new IllegalStateException("finished or not initialized");
                        }
                        i.a aVar6 = (i.a) ((i.a) new i.a().c(iVar2.f9100a)).d(iVar2.f9101b);
                        aVar6.f9085e = cVar2.f9064s;
                        aVar6.f9086f = iVar2.f9084f;
                        aVar6.g = iVar2.g;
                        i iVar4 = new i((i.a) aVar6.b(iVar2.f9103d));
                        h.a aVar7 = (h.a) ((h.a) new h.a().c(iVar4.f9100a)).d(iVar4.f9101b);
                        aVar7.f9081e = cVar2.f9064s;
                        h hVar = new h(aVar7);
                        g.a aVar8 = (g.a) ((g.a) new g.a().c(iVar4.f9100a)).d(iVar4.f9101b);
                        aVar8.f9078f = cVar2.f9064s;
                        g gVar2 = new g(aVar8);
                        jVar3.d(jVar3.c(bArr4, iVar4), bArr3);
                        r a10 = s.a(jVar3, jVar3.b(iVar4), hVar);
                        while (!stack.isEmpty() && stack.peek().f9124a == a10.f9124a && stack.peek().f9124a != cVar2.f9062b) {
                            g.a aVar9 = (g.a) ((g.a) new g.a().c(gVar2.f9100a)).d(gVar2.f9101b);
                            aVar9.f9077e = gVar2.f9075e;
                            aVar9.f9078f = (gVar2.f9076f - 1) / 2;
                            g gVar3 = new g((g.a) aVar9.b(gVar2.f9103d));
                            r b12 = s.b(jVar3, stack.pop(), a10, gVar3);
                            r rVar = new r(b12.f9124a + 1, b12.a());
                            g.a aVar10 = (g.a) ((g.a) new g.a().c(gVar3.f9100a)).d(gVar3.f9101b);
                            aVar10.f9077e = gVar3.f9075e + 1;
                            aVar10.f9078f = gVar3.f9076f;
                            gVar2 = new g((g.a) aVar10.b(gVar3.f9103d));
                            a10 = rVar;
                        }
                        r rVar2 = cVar2.f9061a;
                        if (rVar2 == null) {
                            cVar2.f9061a = a10;
                        } else if (rVar2.f9124a == a10.f9124a) {
                            g.a aVar11 = (g.a) ((g.a) new g.a().c(gVar2.f9100a)).d(gVar2.f9101b);
                            aVar11.f9077e = gVar2.f9075e;
                            aVar11.f9078f = (gVar2.f9076f - 1) / 2;
                            g gVar4 = new g((g.a) aVar11.b(gVar2.f9103d));
                            a10 = new r(cVar2.f9061a.f9124a + 1, s.b(jVar3, cVar2.f9061a, a10, gVar4).a());
                            cVar2.f9061a = a10;
                            g.a aVar12 = (g.a) ((g.a) new g.a().c(gVar4.f9100a)).d(gVar4.f9101b);
                            aVar12.f9077e = gVar4.f9075e + 1;
                            aVar12.f9078f = gVar4.f9076f;
                            ((g.a) aVar12.b(gVar4.f9103d)).e();
                        } else {
                            stack.push(a10);
                        }
                        if (cVar2.f9061a.f9124a == cVar2.f9062b) {
                            cVar2.f9066u = true;
                        } else {
                            cVar2.f9063c = a10.f9124a;
                            cVar2.f9064s++;
                        }
                    }
                    i23++;
                }
                this.f9057x++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        }
        throw new IllegalStateException("index already used");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    public a(a aVar, n nVar) {
        this.f9049a = new j(new l(nVar));
        this.f9050b = aVar.f9050b;
        this.f9052s = aVar.f9052s;
        ArrayList arrayList = new ArrayList();
        this.f9053t = arrayList;
        arrayList.addAll(aVar.f9053t);
        this.f9054u = new TreeMap();
        for (Integer num : aVar.f9054u.keySet()) {
            this.f9054u.put(num, (LinkedList) ((LinkedList) aVar.f9054u.get(num)).clone());
        }
        Stack<r> stack = new Stack<>();
        this.f9055v = stack;
        stack.addAll(aVar.f9055v);
        this.f9051c = new ArrayList();
        Iterator it = aVar.f9051c.iterator();
        while (it.hasNext()) {
            this.f9051c.add(((c) it.next()).clone());
        }
        this.f9056w = new TreeMap(aVar.f9056w);
        int i = aVar.f9057x;
        this.f9057x = i;
        this.z = aVar.z;
        this.f9058y = aVar.f9058y;
        if (this.f9053t == null) {
            throw new IllegalStateException("authenticationPath == null");
        } else if (this.f9054u == null) {
            throw new IllegalStateException("retain == null");
        } else if (this.f9055v == null) {
            throw new IllegalStateException("stack == null");
        } else if (this.f9051c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        } else if (!w.g(this.f9050b, (long) i)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<nh.c>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.TreeMap, java.util.Map<java.lang.Integer, java.util.LinkedList<nh.r>>] */
    public a(a aVar, byte[] bArr, byte[] bArr2, i iVar) {
        this.f9049a = new j(aVar.f9049a.f9087a);
        this.f9050b = aVar.f9050b;
        this.f9052s = aVar.f9052s;
        ArrayList arrayList = new ArrayList();
        this.f9053t = arrayList;
        arrayList.addAll(aVar.f9053t);
        this.f9054u = new TreeMap();
        for (Integer num : aVar.f9054u.keySet()) {
            this.f9054u.put(num, (LinkedList) ((LinkedList) aVar.f9054u.get(num)).clone());
        }
        Stack<r> stack = new Stack<>();
        this.f9055v = stack;
        stack.addAll(aVar.f9055v);
        this.f9051c = new ArrayList();
        Iterator it = aVar.f9051c.iterator();
        while (it.hasNext()) {
            this.f9051c.add(((c) it.next()).clone());
        }
        this.f9056w = new TreeMap(aVar.f9056w);
        this.f9057x = aVar.f9057x;
        this.z = aVar.z;
        this.f9058y = false;
        b(bArr, bArr2, iVar);
    }
}
