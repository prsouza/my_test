package nh;

import ag.n;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, a> f9059a = new TreeMap();

    /* renamed from: b  reason: collision with root package name */
    public transient long f9060b;

    public b(long j10) {
        this.f9060b = j10;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    public b(b bVar, long j10) {
        for (Integer num : bVar.f9059a.keySet()) {
            this.f9059a.put(num, new a((a) bVar.f9059a.get(num)));
        }
        this.f9060b = j10;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r6v13, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(nh.o r28, long r29, byte[] r31, byte[] r32) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r31
            r3 = r32
            r27.<init>()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            r0.f9059a = r4
            int r4 = r1.f9111c
            r5 = 1
            long r7 = r5 << r4
            long r7 = r7 - r5
            r0.f9060b = r7
            r9 = 0
        L_0x001d:
            int r4 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r4 >= 0) goto L_0x0157
            nh.t r4 = r1.f9110b
            int r11 = r4.f9127b
            long r12 = r9 >> r11
            long r14 = r5 << r11
            long r14 = r14 - r5
            long r5 = r9 & r14
            int r5 = (int) r5
            nh.i$a r6 = new nh.i$a
            r6.<init>()
            nh.n$a r6 = r6.d(r12)
            nh.i$a r6 = (nh.i.a) r6
            r6.f9085e = r5
            nh.i r7 = new nh.i
            r7.<init>(r6)
            r6 = 1
            int r8 = r6 << r11
            int r6 = r8 + -1
            r19 = r12
            r12 = 0
            if (r5 >= r6) goto L_0x0086
            java.util.Map<java.lang.Integer, nh.a> r13 = r0.f9059a
            r21 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r13.get(r6)
            nh.a r6 = (nh.a) r6
            if (r6 == 0) goto L_0x0060
            if (r5 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            r23 = r4
            r6 = r12
            goto L_0x0082
        L_0x0060:
            nh.a r5 = new nh.a
            nh.j r6 = r4.a()
            int r13 = r4.f9127b
            int r12 = r4.f9128c
            r18 = 1
            int r22 = r18 << r13
            r23 = r4
            int r4 = r22 + -1
            r5.<init>((nh.j) r6, (int) r13, (int) r12, (int) r4)
            r5.a(r2, r3, r7)
            java.util.Map<java.lang.Integer, nh.a> r4 = r0.f9059a
            r6 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r4.put(r12, r5)
        L_0x0082:
            r0.a(r6, r2, r3, r7)
            goto L_0x008b
        L_0x0086:
            r23 = r4
            r21 = r6
            r6 = r12
        L_0x008b:
            r12 = r19
            r4 = 1
        L_0x008e:
            int r5 = r1.f9112d
            if (r4 >= r5) goto L_0x014d
            long r6 = r12 & r14
            int r5 = (int) r6
            long r12 = r12 >> r11
            nh.i$a r6 = new nh.i$a
            r6.<init>()
            nh.n$a r6 = r6.c(r4)
            nh.i$a r6 = (nh.i.a) r6
            nh.n$a r6 = r6.d(r12)
            nh.i$a r6 = (nh.i.a) r6
            r6.f9085e = r5
            nh.i r7 = new nh.i
            r7.<init>(r6)
            java.util.Map<java.lang.Integer, nh.a> r6 = r0.f9059a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r6.get(r1)
            if (r1 == 0) goto L_0x00e9
            r16 = 0
            int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r1 = r11
            r19 = r12
            r24 = r14
            goto L_0x00dc
        L_0x00c6:
            r1 = r11
            r19 = r12
            double r11 = (double) r8
            int r6 = r4 + 1
            r24 = r14
            double r13 = (double) r6
            double r11 = java.lang.Math.pow(r11, r13)
            long r11 = (long) r11
            long r11 = r9 % r11
            int r6 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            if (r6 == 0) goto L_0x00e0
            goto L_0x00ee
        L_0x00e0:
            r22 = r1
            r1 = r21
            r26 = r23
            r18 = 1
            goto L_0x0115
        L_0x00e9:
            r1 = r11
            r19 = r12
            r24 = r14
        L_0x00ee:
            java.util.Map<java.lang.Integer, nh.a> r6 = r0.f9059a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            nh.a r12 = new nh.a
            nh.j r13 = r23.a()
            r14 = r23
            int r15 = r14.f9127b
            r22 = r1
            int r1 = r14.f9128c
            r18 = 1
            int r23 = r18 << r15
            r26 = r14
            int r14 = r23 + -1
            r12.<init>((nh.j) r13, (int) r15, (int) r1, (int) r14)
            r12.a(r2, r3, r7)
            r6.put(r11, r12)
            r1 = r21
        L_0x0115:
            if (r5 >= r1) goto L_0x013a
            r5 = 0
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x011e
            goto L_0x0133
        L_0x011e:
            r11 = 1
            long r13 = r9 + r11
            double r11 = (double) r8
            double r5 = (double) r4
            double r5 = java.lang.Math.pow(r11, r5)
            long r5 = (long) r5
            long r13 = r13 % r5
            r5 = 0
            int r11 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0133
            r11 = r18
            goto L_0x0134
        L_0x0133:
            r11 = 0
        L_0x0134:
            if (r11 == 0) goto L_0x013c
            r0.a(r4, r2, r3, r7)
            goto L_0x013c
        L_0x013a:
            r5 = 0
        L_0x013c:
            int r4 = r4 + 1
            r21 = r1
            r12 = r19
            r11 = r22
            r14 = r24
            r23 = r26
            r6 = 0
            r1 = r28
            goto L_0x008e
        L_0x014d:
            r5 = 0
            r11 = 1
            long r9 = r9 + r11
            r1 = r28
            r5 = r11
            goto L_0x001d
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.b.<init>(nh.o, long, byte[], byte[]):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    public final a a(int i, byte[] bArr, byte[] bArr2, i iVar) {
        return (a) this.f9059a.put(Integer.valueOf(i), new a((a) this.f9059a.get(Integer.valueOf(i)), bArr, bArr2, iVar));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.Integer, nh.a>, java.util.TreeMap] */
    public final b b(n nVar) {
        b bVar = new b(this.f9060b);
        for (Integer num : this.f9059a.keySet()) {
            ? r32 = bVar.f9059a;
            a aVar = (a) this.f9059a.get(num);
            Objects.requireNonNull(aVar);
            r32.put(num, new a(aVar, nVar));
        }
        return bVar;
    }
}
