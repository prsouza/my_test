package i7;

import i7.c0;
import i7.q0;
import i7.t.b;
import i7.x;
import i7.z;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

public final class t<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final t f6355d = new t(true);

    /* renamed from: a  reason: collision with root package name */
    public final i1<T, Object> f6356a = new h1(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f6357b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6358c;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6359a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6360b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                i7.s1[] r0 = i7.s1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6360b = r0
                r1 = 1
                i7.s1 r2 = i7.s1.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6360b     // Catch:{ NoSuchFieldError -> 0x001d }
                i7.s1 r3 = i7.s1.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6360b     // Catch:{ NoSuchFieldError -> 0x0028 }
                i7.s1 r4 = i7.s1.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f6360b     // Catch:{ NoSuchFieldError -> 0x0033 }
                i7.s1 r5 = i7.s1.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f6360b     // Catch:{ NoSuchFieldError -> 0x003e }
                i7.s1 r6 = i7.s1.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f6360b     // Catch:{ NoSuchFieldError -> 0x0049 }
                i7.s1 r7 = i7.s1.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f6360b     // Catch:{ NoSuchFieldError -> 0x0054 }
                i7.s1 r8 = i7.s1.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f6360b     // Catch:{ NoSuchFieldError -> 0x0060 }
                i7.s1 r9 = i7.s1.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x006c }
                i7.s1 r10 = i7.s1.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x0078 }
                i7.s1 r10 = i7.s1.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x0084 }
                i7.s1 r10 = i7.s1.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x0090 }
                i7.s1 r10 = i7.s1.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x009c }
                i7.s1 r10 = i7.s1.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                i7.s1 r10 = i7.s1.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                i7.s1 r10 = i7.s1.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                i7.s1 r10 = i7.s1.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x00cc }
                i7.s1 r10 = i7.s1.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f6360b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                i7.s1 r10 = i7.s1.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                i7.t1[] r9 = i7.t1.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f6359a = r9
                i7.t1 r10 = i7.t1.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f6359a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                i7.t1 r9 = i7.t1.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x00fd }
                i7.t1 r1 = i7.t1.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x0107 }
                i7.t1 r1 = i7.t1.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x0111 }
                i7.t1 r1 = i7.t1.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x011b }
                i7.t1 r1 = i7.t1.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x0125 }
                i7.t1 r1 = i7.t1.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x012f }
                i7.t1 r1 = i7.t1.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f6359a     // Catch:{ NoSuchFieldError -> 0x0139 }
                i7.t1 r1 = i7.t1.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.t.a.<clinit>():void");
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        void f();

        void g();

        void getNumber();

        q0.a j(q0.a aVar, q0 q0Var);

        t1 m();

        void n();
    }

    public t() {
        int i = i1.f6280w;
    }

    public static Object b(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int c(s1 s1Var, int i, Object obj) {
        int w6 = l.w(i);
        if (s1Var == s1.GROUP) {
            w6 *= 2;
        }
        return d(s1Var, obj) + w6;
    }

    public static int d(s1 s1Var, Object obj) {
        switch (a.f6360b[s1Var.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = l.f6317b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = l.f6317b;
                return 4;
            case 3:
                return l.A(((Long) obj).longValue());
            case 4:
                return l.A(((Long) obj).longValue());
            case 5:
                return l.l(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                Logger logger3 = l.f6317b;
                return 8;
            case 7:
                ((Integer) obj).intValue();
                Logger logger4 = l.f6317b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = l.f6317b;
                return 1;
            case 9:
                Logger logger6 = l.f6317b;
                return ((q0) obj).b();
            case 10:
                if (obj instanceof c0) {
                    return l.n((c0) obj);
                }
                Logger logger7 = l.f6317b;
                int b10 = ((q0) obj).b();
                return l.y(b10) + b10;
            case 11:
                if (obj instanceof i) {
                    return l.d((i) obj);
                }
                return l.v((String) obj);
            case 12:
                if (obj instanceof i) {
                    return l.d((i) obj);
                }
                Logger logger8 = l.f6317b;
                int length = ((byte[]) obj).length;
                return l.y(length) + length;
            case 13:
                return l.y(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger9 = l.f6317b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger10 = l.f6317b;
                return 8;
            case 16:
                return l.r(((Integer) obj).intValue());
            case 17:
                return l.t(((Long) obj).longValue());
            case 18:
                if (obj instanceof z.a) {
                    return l.l(((z.a) obj).getNumber());
                }
                return l.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(b<?> bVar, Object obj) {
        bVar.g();
        bVar.getNumber();
        bVar.f();
        return c((s1) null, 0, obj);
    }

    public static <T extends b<T>> boolean j(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        if (bVar.m() == t1.MESSAGE) {
            bVar.f();
            Object value = entry.getValue();
            if (value instanceof q0) {
                if (!((q0) value).j()) {
                    return false;
                }
            } else if (value instanceof c0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: a */
    public final t<T> clone() {
        t<T> tVar = new t<>();
        for (int i = 0; i < this.f6356a.e(); i++) {
            Map.Entry<T, Object> d10 = this.f6356a.d(i);
            tVar.n((b) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f6356a.f()) {
            tVar.n((b) next.getKey(), next.getValue());
        }
        tVar.f6358c = this.f6358c;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f6356a.equals(((t) obj).f6356a);
    }

    public final Object f(T t10) {
        Object obj = this.f6356a.get(t10);
        return obj instanceof c0 ? ((c0) obj).a((q0) null) : obj;
    }

    public final int g(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.m() != t1.MESSAGE) {
            return e(bVar, value);
        }
        bVar.f();
        bVar.n();
        if (value instanceof c0) {
            ((b) entry.getKey()).getNumber();
            return l.n((c0) value) + l.w(3) + l.x(2, 0) + (l.w(1) * 2);
        }
        ((b) entry.getKey()).getNumber();
        int x10 = l.x(2, 0) + (l.w(1) * 2);
        int w6 = l.w(3);
        int b10 = ((q0) value).b();
        return l.y(b10) + b10 + w6 + x10;
    }

    public final boolean h() {
        return this.f6356a.isEmpty();
    }

    public final int hashCode() {
        return this.f6356a.hashCode();
    }

    public final boolean i() {
        for (int i = 0; i < this.f6356a.e(); i++) {
            if (!j(this.f6356a.d(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j10 : this.f6356a.f()) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        if (this.f6358c) {
            return new c0.c(this.f6356a.entrySet().iterator());
        }
        return this.f6356a.entrySet().iterator();
    }

    public final void l() {
        if (!this.f6357b) {
            this.f6356a.h();
            this.f6357b = true;
        }
    }

    public final void m(Map.Entry<T, Object> entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).a((q0) null);
        }
        bVar.f();
        if (bVar.m() == t1.MESSAGE) {
            Object f10 = f(bVar);
            if (f10 == null) {
                this.f6356a.put(bVar, b(value));
                return;
            }
            this.f6356a.put(bVar, ((x.a) bVar.j(((q0) f10).d(), (q0) value)).k());
            return;
        }
        this.f6356a.put(bVar, b(value));
    }

    public final void n(T t10, Object obj) {
        t10.f();
        t10.g();
        o((s1) null, obj);
        if (obj instanceof c0) {
            this.f6358c = true;
        }
        this.f6356a.put(t10, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if ((r4 instanceof i7.c0) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ((r4 instanceof i7.z.a) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(i7.s1 r3, java.lang.Object r4) {
        /*
            r2 = this;
            java.nio.charset.Charset r0 = i7.z.f6396a
            java.util.Objects.requireNonNull(r4)
            int[] r0 = i7.t.a.f6359a
            i7.t1 r3 = r3.getJavaType()
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            r1 = 0
            switch(r3) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x0029;
                case 8: goto L_0x0020;
                case 9: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0046
        L_0x0017:
            boolean r3 = r4 instanceof i7.q0
            if (r3 != 0) goto L_0x0033
            boolean r3 = r4 instanceof i7.c0
            if (r3 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0020:
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 != 0) goto L_0x0033
            boolean r3 = r4 instanceof i7.z.a
            if (r3 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0029:
            boolean r3 = r4 instanceof i7.i
            if (r3 != 0) goto L_0x0033
            boolean r3 = r4 instanceof byte[]
            if (r3 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            r1 = r0
            goto L_0x0046
        L_0x0035:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0046
        L_0x0038:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0046
        L_0x003b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0046
        L_0x003e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0046
        L_0x0041:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0046
        L_0x0044:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Wrong object type used with protocol message reflection."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.t.o(i7.s1, java.lang.Object):void");
    }

    public t(boolean z) {
        int i = i1.f6280w;
        l();
        l();
    }
}
