package zb;

import java.util.Map;
import zb.a0;
import zb.q.a;
import zb.r;
import zb.t;

public final class q<FieldDescriptorType extends a<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f14352d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final g0<FieldDescriptorType, Object> f14353a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14354b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14355c = false;

    public interface a<T extends a<T>> extends Comparable<T> {
        k a();

        void b();

        a0.a c(a0.a aVar, a0 a0Var);

        void c();
    }

    static {
        new q(true);
    }

    public q() {
        int i = g0.f14288u;
        this.f14353a = new f0(16);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r4 = ((zb.h) r6).size();
        r6 = zb.n.N2(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r0 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        return r5 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(zb.j r4, int r5, java.lang.Object r6) {
        /*
            int r5 = zb.n.D2(r5)
            zb.j r0 = zb.j.GROUP
            if (r4 != r0) goto L_0x000a
            int r5 = r5 * 2
        L_0x000a:
            int r4 = r4.ordinal()
            r0 = 4
            r1 = 8
            r2 = 1
            switch(r4) {
                case 0: goto L_0x0108;
                case 1: goto L_0x0100;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00df;
                case 5: goto L_0x00d7;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00c6;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00a5;
                case 10: goto L_0x0077;
                case 11: goto L_0x0068;
                case 12: goto L_0x005c;
                case 13: goto L_0x0040;
                case 14: goto L_0x00cf;
                case 15: goto L_0x00d7;
                case 16: goto L_0x002f;
                case 17: goto L_0x001d;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "There is no way to get here, but the compiler thinks otherwise."
            r4.<init>(r5)
            throw r4
        L_0x001d:
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            long r2 = r0 << r2
            r4 = 63
            long r0 = r0 >> r4
            long r0 = r0 ^ r2
            int r0 = zb.n.x2(r0)
            goto L_0x0110
        L_0x002f:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            int r6 = r4 << 1
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r0 = zb.n.N2(r4)
            goto L_0x0110
        L_0x0040:
            boolean r4 = r6 instanceof zb.t.a
            if (r4 == 0) goto L_0x0050
            zb.t$a r6 = (zb.t.a) r6
            int r4 = r6.a()
            int r0 = zb.n.C2(r4)
            goto L_0x0110
        L_0x0050:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            int r0 = zb.n.C2(r4)
            goto L_0x0110
        L_0x005c:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            int r0 = zb.n.N2(r4)
            goto L_0x0110
        L_0x0068:
            boolean r4 = r6 instanceof zb.h
            if (r4 == 0) goto L_0x006d
            goto L_0x00b2
        L_0x006d:
            byte[] r6 = (byte[]) r6
            java.util.logging.Logger r4 = zb.n.f14346v
            int r4 = r6.length
            int r6 = zb.n.N2(r4)
            goto L_0x00bc
        L_0x0077:
            boolean r4 = r6 instanceof zb.v
            if (r4 == 0) goto L_0x009a
            zb.v r6 = (zb.v) r6
            java.util.logging.Logger r4 = zb.n.f14346v
            zb.h$d r4 = r6.f14382b
            if (r4 == 0) goto L_0x0089
            zb.h$d r4 = r6.f14382b
            byte[] r4 = r4.f14307s
            int r4 = r4.length
            goto L_0x0095
        L_0x0089:
            zb.a0 r4 = r6.f14381a
            if (r4 == 0) goto L_0x0094
            zb.a0 r4 = r6.f14381a
            int r4 = r4.a()
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            int r6 = zb.n.N2(r4)
            goto L_0x00bc
        L_0x009a:
            zb.a0 r6 = (zb.a0) r6
            int r4 = r6.a()
            int r6 = zb.n.N2(r4)
            goto L_0x00bc
        L_0x00a5:
            zb.a0 r6 = (zb.a0) r6
            java.util.logging.Logger r4 = zb.n.f14346v
            int r0 = r6.a()
            goto L_0x0110
        L_0x00ae:
            boolean r4 = r6 instanceof zb.h
            if (r4 == 0) goto L_0x00bf
        L_0x00b2:
            zb.h r6 = (zb.h) r6
            int r4 = r6.size()
            int r6 = zb.n.N2(r4)
        L_0x00bc:
            int r0 = r6 + r4
            goto L_0x0110
        L_0x00bf:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = zb.n.y2(r6)
            goto L_0x0110
        L_0x00c6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            java.util.logging.Logger r4 = zb.n.f14346v
            r0 = r2
            goto L_0x0110
        L_0x00cf:
            java.lang.Integer r6 = (java.lang.Integer) r6
            r6.intValue()
            java.util.logging.Logger r4 = zb.n.f14346v
            goto L_0x0110
        L_0x00d7:
            java.lang.Long r6 = (java.lang.Long) r6
            r6.longValue()
            java.util.logging.Logger r4 = zb.n.f14346v
            goto L_0x010f
        L_0x00df:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r4 = r6.intValue()
            int r0 = zb.n.C2(r4)
            goto L_0x0110
        L_0x00ea:
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r0 = zb.n.x2(r0)
            goto L_0x0110
        L_0x00f5:
            java.lang.Long r6 = (java.lang.Long) r6
            long r0 = r6.longValue()
            int r0 = zb.n.x2(r0)
            goto L_0x0110
        L_0x0100:
            java.lang.Float r6 = (java.lang.Float) r6
            r6.floatValue()
            java.util.logging.Logger r4 = zb.n.f14346v
            goto L_0x0110
        L_0x0108:
            java.lang.Double r6 = (java.lang.Double) r6
            r6.doubleValue()
            java.util.logging.Logger r4 = zb.n.f14346v
        L_0x010f:
            r0 = r1
        L_0x0110:
            int r5 = r5 + r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.q.a(zb.j, int, java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r2 instanceof zb.v) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r2 instanceof zb.t.a) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(zb.j r1, java.lang.Object r2) {
        /*
            java.util.Objects.requireNonNull(r2)
            zb.k r1 = r1.f14325a
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0036;
                case 2: goto L_0x0033;
                case 3: goto L_0x0030;
                case 4: goto L_0x002d;
                case 5: goto L_0x002a;
                case 6: goto L_0x0020;
                case 7: goto L_0x0017;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003b
        L_0x000e:
            boolean r1 = r2 instanceof zb.a0
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof zb.v
            if (r1 == 0) goto L_0x003b
            goto L_0x0028
        L_0x0017:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof zb.t.a
            if (r1 == 0) goto L_0x003b
            goto L_0x0028
        L_0x0020:
            boolean r1 = r2 instanceof zb.h
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003b
        L_0x0028:
            r0 = 1
            goto L_0x003b
        L_0x002a:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x003b
        L_0x002d:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x003b
        L_0x0030:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x003b
        L_0x0033:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x003b
        L_0x0036:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x003b
        L_0x0039:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.q.d(zb.j, java.lang.Object):void");
    }

    public static void e(n nVar, j jVar, int i, Object obj) {
        if (jVar == j.GROUP) {
            nVar.V2(i, 3);
            ((a0) obj).c(nVar);
            nVar.V2(i, 4);
            return;
        }
        nVar.V2(i, jVar.f14326b);
        switch (jVar.ordinal()) {
            case 0:
                nVar.J2(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                nVar.R2(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                nVar.Q2(((Long) obj).longValue());
                return;
            case 3:
                nVar.Q2(((Long) obj).longValue());
                return;
            case 4:
                nVar.U2(((Integer) obj).intValue());
                return;
            case 5:
                nVar.J2(((Long) obj).longValue());
                return;
            case 6:
                nVar.R2(((Integer) obj).intValue());
                return;
            case 7:
                nVar.z2(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (!(obj instanceof h)) {
                    nVar.K2((String) obj);
                    return;
                }
                break;
            case 9:
                ((a0) obj).c(nVar);
                return;
            case 10:
                nVar.M2((a0) obj);
                return;
            case 11:
                if (!(obj instanceof h)) {
                    byte[] bArr = (byte[]) obj;
                    nVar.B2(bArr, bArr.length);
                    return;
                }
                break;
            case 12:
                nVar.W2(((Integer) obj).intValue());
                return;
            case 13:
                nVar.U2(obj instanceof t.a ? ((t.a) obj).a() : ((Integer) obj).intValue());
                return;
            case 14:
                nVar.R2(((Integer) obj).intValue());
                return;
            case 15:
                nVar.J2(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                nVar.W2((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                nVar.Q2((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
        nVar.L2((h) obj);
    }

    /* renamed from: b */
    public final q<FieldDescriptorType> clone() {
        q<FieldDescriptorType> qVar = new q<>();
        for (int i = 0; i < this.f14353a.f14290b.size(); i++) {
            Map.Entry<FieldDescriptorType, Object> d10 = this.f14353a.d(i);
            qVar.f((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f14353a.f()) {
            qVar.f((a) next.getKey(), next.getValue());
        }
        qVar.f14355c = this.f14355c;
        return qVar;
    }

    public final void c(Map.Entry<FieldDescriptorType, Object> entry) {
        g0<FieldDescriptorType, Object> g0Var;
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof v) {
            value = ((v) value).a();
        }
        aVar.b();
        if (aVar.a() == k.MESSAGE) {
            Object obj = this.f14353a.get(aVar);
            if (obj instanceof v) {
                obj = ((v) obj).a();
            }
            if (obj != null) {
                value = ((r.a) aVar.c(((a0) obj).c(), (a0) value)).i();
                g0Var = this.f14353a;
                g0Var.put(aVar, value);
            }
        }
        g0<FieldDescriptorType, Object> g0Var2 = this.f14353a;
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            g0Var = g0Var2;
            value = bArr2;
        } else {
            g0Var = g0Var2;
        }
        g0Var.put(aVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f14353a.equals(((q) obj).f14353a);
    }

    public final void f(FieldDescriptorType fielddescriptortype, Object obj) {
        fielddescriptortype.b();
        fielddescriptortype.c();
        d((j) null, obj);
        if (obj instanceof v) {
            this.f14355c = true;
        }
        this.f14353a.put(fielddescriptortype, obj);
    }

    public final int hashCode() {
        return this.f14353a.hashCode();
    }

    public q(boolean z) {
        int i = g0.f14288u;
        f0 f0Var = new f0(0);
        this.f14353a = f0Var;
        if (!this.f14354b) {
            f0Var.i();
            this.f14354b = true;
        }
    }
}
