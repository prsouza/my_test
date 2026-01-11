package wc;

import cd.i;
import cd.j;
import e6.e;
import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nd.m;
import qc.d;
import rc.g;
import rc.h;
import xc.f;
import xd.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12652a = new a();

    /* renamed from: wc.a$a  reason: collision with other inner class name */
    public static abstract class C0244a {

        /* renamed from: wc.a$a$a  reason: collision with other inner class name */
        public static final class C0245a extends C0244a {

            /* renamed from: a  reason: collision with root package name */
            public final int f12653a;

            /* renamed from: b  reason: collision with root package name */
            public final LinkedHashMap<String, d> f12654b;

            public C0245a(LinkedHashMap<String, d> linkedHashMap) {
                this.f12654b = linkedHashMap;
                this.f12653a = linkedHashMap.size();
            }

            public final int a() {
                return this.f12653a;
            }
        }

        /* renamed from: wc.a$a$b */
        public static final class b extends C0244a {

            /* renamed from: a  reason: collision with root package name */
            public final int f12655a;

            /* renamed from: b  reason: collision with root package name */
            public final List<d> f12656b;

            public b(List<d> list) {
                this.f12656b = list;
                this.f12655a = list.size();
            }

            public final int a() {
                return this.f12655a;
            }
        }

        public abstract int a();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<dd.a<i>> f12657a;

        /* renamed from: b  reason: collision with root package name */
        public final f f12658b;

        /* renamed from: c  reason: collision with root package name */
        public final Set<String> f12659c;

        /* renamed from: d  reason: collision with root package name */
        public final Map<String, d> f12660d;

        public b(List<dd.a<i>> list, f fVar, Set<String> set, Map<String, d> map) {
            this.f12657a = list;
            this.f12658b = fVar;
            this.f12659c = set;
            this.f12660d = map;
        }
    }

    public final String a(dd.a<i> aVar, b bVar) {
        Set<String> set = bVar.f12659c;
        String c10 = c(aVar);
        if (c10 == null || !set.contains(c10)) {
            c10 = null;
        }
        if (c10 != null) {
            return c10;
        }
        String bigInteger = ((BigInteger) aVar.a(i.f3372t.d())).toString();
        e.C(bigInteger, "get(PortableType.id).toString()");
        return bigInteger;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wc.a.C0244a b(wc.a.b r12, java.util.List<dd.a<cd.s>> r13, boolean r14) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = nd.g.S0(r13)
            r0.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L_0x000d:
            boolean r1 = r13.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00a6
            java.lang.Object r1 = r13.next()
            dd.a r1 = (dd.a) r1
            cd.s r4 = cd.s.f3413t
            java.util.Objects.requireNonNull(r4)
            dd.c r5 = cd.s.f3412s
            de.h[] r6 = cd.s.f3410b
            r3 = r6[r3]
            dd.b r3 = r5.a(r4, r3)
            java.lang.Object r3 = r1.a(r3)
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "child[TypeDefCompositeField.type].toString()"
            e6.e.C(r3, r4)
            a9.c r4 = cd.s.f3411c
            r5 = r6[r2]
            java.util.Objects.requireNonNull(r4)
            java.lang.String r6 = "property"
            e6.e.D(r5, r6)
            java.lang.Object r4 = r4.f176b
            dd.b r4 = (dd.b) r4
            java.lang.Object r1 = r1.a(r4)
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            if (r1 == 0) goto L_0x0096
            if (r14 == 0) goto L_0x0095
            java.lang.String r5 = "_"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.util.List r1 = fe.o.y1(r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = nd.g.S0(r1)
            r5.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r1.next()
            int r7 = r2 + 1
            if (r2 < 0) goto L_0x0086
            java.lang.String r6 = (java.lang.String) r6
            if (r2 <= 0) goto L_0x0081
            java.lang.String r6 = fe.k.W0(r6)
        L_0x0081:
            r5.add(r6)
            r2 = r7
            goto L_0x006b
        L_0x0086:
            a.b.N0()
            throw r4
        L_0x008a:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            java.lang.String r6 = ""
            java.lang.String r1 = nd.m.b1(r5, r6, r7, r8, r9, r10)
        L_0x0095:
            r4 = r1
        L_0x0096:
            java.util.Map<java.lang.String, qc.d> r1 = r12.f12660d
            qc.d r1 = aa.b.J(r1, r3)
            md.f r2 = new md.f
            r2.<init>(r4, r1)
            r0.add(r2)
            goto L_0x000d
        L_0x00a6:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x00ad
            goto L_0x00c9
        L_0x00ad:
            java.util.Iterator r12 = r0.iterator()
        L_0x00b1:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c9
            java.lang.Object r13 = r12.next()
            md.f r13 = (md.f) r13
            A r13 = r13.f8541a
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00c5
            r13 = r3
            goto L_0x00c6
        L_0x00c5:
            r13 = r2
        L_0x00c6:
            if (r13 != 0) goto L_0x00b1
            goto L_0x00ca
        L_0x00c9:
            r2 = r3
        L_0x00ca:
            if (r2 == 0) goto L_0x00f6
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x00d5:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00f0
            java.lang.Object r14 = r13.next()
            md.f r14 = (md.f) r14
            A r0 = r14.f8541a
            java.lang.String r0 = (java.lang.String) r0
            e6.e.B(r0)
            B r14 = r14.f8542b
            qc.d r14 = (qc.d) r14
            r12.put(r0, r14)
            goto L_0x00d5
        L_0x00f0:
            wc.a$a$a r13 = new wc.a$a$a
            r13.<init>(r12)
            goto L_0x011c
        L_0x00f6:
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = nd.g.S0(r0)
            r12.<init>(r13)
            java.util.Iterator r13 = r0.iterator()
        L_0x0103:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0117
            java.lang.Object r14 = r13.next()
            md.f r14 = (md.f) r14
            B r14 = r14.f8542b
            qc.d r14 = (qc.d) r14
            r12.add(r14)
            goto L_0x0103
        L_0x0117:
            wc.a$a$b r13 = new wc.a$a$b
            r13.<init>(r12)
        L_0x011c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.a.b(wc.a$b, java.util.List, boolean):wc.a$a");
    }

    public final String c(dd.a<i> aVar) {
        j jVar = j.f3377u;
        Objects.requireNonNull(jVar);
        List list = (List) ((dd.a) aVar.a(i.f3372t.e())).a(j.f3374c.a(jVar, j.f3373b[0]));
        if (list.isEmpty()) {
            return null;
        }
        return m.b1(list, ".", (CharSequence) null, (CharSequence) null, (l) null, 62);
    }

    public final qc.a<?, ?> d(String str, C0244a aVar) {
        if (aVar instanceof C0244a.C0245a) {
            return new g(str, ((C0244a.C0245a) aVar).f12654b);
        }
        if (aVar instanceof C0244a.b) {
            return new h(str, ((C0244a.b) aVar).f12656b);
        }
        throw new md.e();
    }
}
