package fe;

import java.util.List;
import md.f;
import xd.p;
import yd.h;

public final class m extends h implements p<CharSequence, Integer, f<? extends Integer, ? extends Integer>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List<String> f5106b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f5107c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(List<String> list, boolean z) {
        super(2);
        this.f5106b = list;
        this.f5107c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            java.lang.String r0 = "$this$$receiver"
            e6.e.D(r13, r0)
            java.util.List<java.lang.String> r6 = r12.f5106b
            boolean r7 = r12.f5107c
            r0 = 0
            r8 = 0
            if (r7 != 0) goto L_0x004e
            int r1 = r6.size()
            r2 = 1
            if (r1 != r2) goto L_0x004e
            int r1 = r6.size()
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 4
            int r13 = fe.o.m1(r13, r1, r14, r0, r2)
            if (r13 >= 0) goto L_0x0033
            goto L_0x00d3
        L_0x0033:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            md.f r14 = new md.f
            r14.<init>(r13, r1)
            goto L_0x00d4
        L_0x003e:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "List has more than one element."
            r13.<init>(r14)
            throw r13
        L_0x0046:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            java.lang.String r14 = "List is empty."
            r13.<init>(r14)
            throw r13
        L_0x004e:
            ce.c r1 = new ce.c
            if (r14 >= 0) goto L_0x0053
            r14 = r0
        L_0x0053:
            int r0 = r13.length()
            r1.<init>(r14, r0)
            boolean r0 = r13 instanceof java.lang.String
            if (r0 == 0) goto L_0x009a
            int r9 = r1.f3431b
            if (r14 <= r9) goto L_0x0064
            goto L_0x00d3
        L_0x0064:
            java.util.Iterator r10 = r6.iterator()
        L_0x0068:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r11 = r10.next()
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0.length()
            r3 = r14
            r5 = r7
            boolean r0 = fe.k.a1(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0068
            goto L_0x0087
        L_0x0086:
            r11 = r8
        L_0x0087:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0095
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            md.f r14 = new md.f
            r14.<init>(r13, r11)
            goto L_0x00d4
        L_0x0095:
            if (r14 == r9) goto L_0x00d3
            int r14 = r14 + 1
            goto L_0x0064
        L_0x009a:
            int r9 = r1.f3431b
            if (r14 <= r9) goto L_0x009f
            goto L_0x00d3
        L_0x009f:
            java.util.Iterator r10 = r6.iterator()
        L_0x00a3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r11 = r10.next()
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r4 = r0.length()
            r2 = r13
            r3 = r14
            r5 = r7
            boolean r0 = fe.o.s1(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00a3
            goto L_0x00c0
        L_0x00bf:
            r11 = r8
        L_0x00c0:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x00ce
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            md.f r14 = new md.f
            r14.<init>(r13, r11)
            goto L_0x00d4
        L_0x00ce:
            if (r14 == r9) goto L_0x00d3
            int r14 = r14 + 1
            goto L_0x009f
        L_0x00d3:
            r14 = r8
        L_0x00d4:
            if (r14 == 0) goto L_0x00e9
            A r13 = r14.f8541a
            B r14 = r14.f8542b
            java.lang.String r14 = (java.lang.String) r14
            int r14 = r14.length()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            md.f r8 = new md.f
            r8.<init>(r13, r14)
        L_0x00e9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fe.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
