package i7;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f6343a = Logger.getLogger(p1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final Unsafe f6344b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f6345c = d.f6244a;

    /* renamed from: d  reason: collision with root package name */
    public static final e f6346d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f6347e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f6348f;
    public static final long g = ((long) d(byte[].class));

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f6349h;

    public class a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public final Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            if (p1.f6349h) {
                return p1.a(obj, j10);
            }
            return p1.b(obj, j10);
        }

        public final byte d(Object obj, long j10) {
            if (p1.f6349h) {
                return (byte) ((p1.l(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
            }
            return (byte) ((p1.l(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
        }

        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final void k(Object obj, long j10, boolean z) {
            if (p1.f6349h) {
                p1.r(obj, j10, z ? (byte) 1 : 0);
            } else {
                p1.s(obj, j10, z ? (byte) 1 : 0);
            }
        }

        public final void l(Object obj, long j10, byte b10) {
            if (p1.f6349h) {
                p1.r(obj, j10, b10);
            } else {
                p1.s(obj, j10, b10);
            }
        }

        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            if (p1.f6349h) {
                return p1.a(obj, j10);
            }
            return p1.b(obj, j10);
        }

        public final byte d(Object obj, long j10) {
            if (p1.f6349h) {
                return (byte) ((p1.l(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
            }
            return (byte) ((p1.l(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
        }

        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final void k(Object obj, long j10, boolean z) {
            if (p1.f6349h) {
                p1.r(obj, j10, z ? (byte) 1 : 0);
            } else {
                p1.s(obj, j10, z ? (byte) 1 : 0);
            }
        }

        public final void l(Object obj, long j10, byte b10) {
            if (p1.f6349h) {
                p1.r(obj, j10, b10);
            } else {
                p1.s(obj, j10, b10);
            }
        }

        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            return this.f6350a.getBoolean(obj, j10);
        }

        public final byte d(Object obj, long j10) {
            return this.f6350a.getByte(obj, j10);
        }

        public final double e(Object obj, long j10) {
            return this.f6350a.getDouble(obj, j10);
        }

        public final float f(Object obj, long j10) {
            return this.f6350a.getFloat(obj, j10);
        }

        public final void k(Object obj, long j10, boolean z) {
            this.f6350a.putBoolean(obj, j10, z);
        }

        public final void l(Object obj, long j10, byte b10) {
            this.f6350a.putByte(obj, j10, b10);
        }

        public final void m(Object obj, long j10, double d10) {
            this.f6350a.putDouble(obj, j10, d10);
        }

        public final void n(Object obj, long j10, float f10) {
            this.f6350a.putFloat(obj, j10, f10);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f6350a;

        public e(Unsafe unsafe) {
            this.f6350a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f6350a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f6350a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f6350a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f6350a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f6350a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f6350a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i) {
            this.f6350a.putInt(obj, j10, i);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f6350a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f6350a.putObject(obj, j10, obj2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0074 A[SYNTHETIC, Splitter:B:13:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012a A[SYNTHETIC, Splitter:B:38:0x012a] */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<i7.p1> r0 = i7.p1.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f6343a = r0
            sun.misc.Unsafe r0 = o()
            f6344b = r0
            java.lang.Class<?> r8 = i7.d.f6244a
            f6345c = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = g(r8)
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r11 = g(r10)
            if (r0 != 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r12 = i7.d.a()
            if (r12 == 0) goto L_0x004b
            if (r9 == 0) goto L_0x0041
            i7.p1$c r9 = new i7.p1$c
            r9.<init>(r0)
            goto L_0x0050
        L_0x0041:
            if (r11 == 0) goto L_0x0049
            i7.p1$b r9 = new i7.p1$b
            r9.<init>(r0)
            goto L_0x0050
        L_0x0049:
            r9 = 0
            goto L_0x0050
        L_0x004b:
            i7.p1$d r9 = new i7.p1$d
            r9.<init>(r0)
        L_0x0050:
            f6346d = r9
            java.lang.String r9 = "copyMemory"
            java.lang.String r11 = "putLong"
            java.lang.String r12 = "putInt"
            java.lang.String r13 = "getInt"
            java.lang.String r14 = "putByte"
            java.lang.String r15 = "getByte"
            r16 = r1
            java.lang.String r1 = "platform method missing - proto runtime falling back to safer methods: "
            r17 = r2
            java.lang.String r2 = "objectFieldOffset"
            r18 = r3
            java.lang.String r3 = "getLong"
            r19 = 0
            r20 = r4
            r4 = 1
            if (r0 != 0) goto L_0x0074
            r21 = r5
            goto L_0x0094
        L_0x0074:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0103 }
            r21 = r5
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            java.lang.Class<java.lang.reflect.Field> r22 = java.lang.reflect.Field.class
            r5[r19] = r22     // Catch:{ all -> 0x00ff }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x00ff }
            r5 = 2
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x00ff }
            r4[r19] = r7     // Catch:{ all -> 0x00ff }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00ff }
            java.lang.reflect.Field r4 = f()     // Catch:{ all -> 0x00ff }
            if (r4 != 0) goto L_0x0098
        L_0x0094:
            r23 = r6
            goto L_0x011d
        L_0x0098:
            boolean r4 = i7.d.a()     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x00a1
            r23 = r6
            goto L_0x00fb
        L_0x00a1:
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            r0.getMethod(r15, r5)     // Catch:{ all -> 0x00ff }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ff }
            r5[r19] = r8     // Catch:{ all -> 0x00ff }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00ff }
            r23 = r6
            r6 = 1
            r5[r6] = r4     // Catch:{ all -> 0x00fd }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r10     // Catch:{ all -> 0x00fd }
            r0.getMethod(r12, r5)     // Catch:{ all -> 0x00fd }
            java.lang.Class[] r4 = new java.lang.Class[r6]     // Catch:{ all -> 0x00fd }
            r4[r19] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x00fd }
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r11, r5)     // Catch:{ all -> 0x00fd }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r5[r19] = r8     // Catch:{ all -> 0x00fd }
            r5[r6] = r8     // Catch:{ all -> 0x00fd }
            r4 = 2
            r5[r4] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r5)     // Catch:{ all -> 0x00fd }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x00fd }
            r4[r19] = r7     // Catch:{ all -> 0x00fd }
            r5 = 1
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 2
            r4[r5] = r7     // Catch:{ all -> 0x00fd }
            r5 = 3
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r5 = 4
            r4[r5] = r8     // Catch:{ all -> 0x00fd }
            r0.getMethod(r9, r4)     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            r0 = 1
            goto L_0x011f
        L_0x00fd:
            r0 = move-exception
            goto L_0x0107
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            r23 = r6
            goto L_0x0107
        L_0x0103:
            r0 = move-exception
            r21 = r5
            goto L_0x0100
        L_0x0107:
            java.util.logging.Logger r4 = f6343a
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.log(r5, r0)
        L_0x011d:
            r0 = r19
        L_0x011f:
            f6347e = r0
            sun.misc.Unsafe r0 = f6344b
            if (r0 != 0) goto L_0x012a
            r22 = r19
            r5 = 1
            goto L_0x023c
        L_0x012a:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0222 }
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.reflect.Field> r6 = java.lang.reflect.Field.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayBaseOffset"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            r5[r19] = r6     // Catch:{ all -> 0x021f }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r2 = "arrayIndexScale"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021f }
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r5[r19] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r2, r5)     // Catch:{ all -> 0x0222 }
            r2 = 2
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r13, r4)     // Catch:{ all -> 0x021d }
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r12, r6)     // Catch:{ all -> 0x0222 }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r3 = 2
            r4[r3] = r2     // Catch:{ all -> 0x0222 }
            r0.getMethod(r11, r4)     // Catch:{ all -> 0x0222 }
            java.lang.String r4 = "getObject"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x0222 }
            r5[r19] = r7     // Catch:{ all -> 0x0222 }
            r3 = 1
            r5[r3] = r2     // Catch:{ all -> 0x021a }
            r0.getMethod(r4, r5)     // Catch:{ all -> 0x021a }
            java.lang.String r4 = "putObject"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021a }
            r6[r19] = r7     // Catch:{ all -> 0x021a }
            r6[r3] = r2     // Catch:{ all -> 0x021a }
            r3 = 2
            r6[r3] = r7     // Catch:{ all -> 0x0222 }
            r0.getMethod(r4, r6)     // Catch:{ all -> 0x0222 }
            boolean r4 = i7.d.a()     // Catch:{ all -> 0x0222 }
            if (r4 == 0) goto L_0x01a7
            r5 = 1
            r22 = 1
            goto L_0x023c
        L_0x01a7:
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x021a }
            r0.getMethod(r15, r4)     // Catch:{ all -> 0x021a }
            r4 = 3
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x021a }
            r5[r19] = r7     // Catch:{ all -> 0x021a }
            r5[r3] = r2     // Catch:{ all -> 0x021a }
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0222 }
            r4 = 2
            r5[r4] = r3     // Catch:{ all -> 0x0222 }
            r0.getMethod(r14, r5)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getBoolean"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0222 }
            r5[r19] = r7     // Catch:{ all -> 0x0222 }
            r4 = 1
            r5[r4] = r2     // Catch:{ all -> 0x021f }
            r0.getMethod(r3, r5)     // Catch:{ all -> 0x021f }
            java.lang.String r3 = "putBoolean"
            r5 = 3
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x021f }
            r6[r19] = r7     // Catch:{ all -> 0x021f }
            r6[r4] = r2     // Catch:{ all -> 0x021f }
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getFloat"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putFloat"
            r4 = 3
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r6[r19] = r7     // Catch:{ all -> 0x021d }
            r6[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch:{ all -> 0x0222 }
            r5 = 2
            r6[r5] = r4     // Catch:{ all -> 0x0222 }
            r0.getMethod(r3, r6)     // Catch:{ all -> 0x0222 }
            java.lang.String r3 = "getDouble"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x0222 }
            r4[r19] = r7     // Catch:{ all -> 0x0222 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            java.lang.String r3 = "putDouble"
            r4 = 3
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x021d }
            r4[r19] = r7     // Catch:{ all -> 0x021d }
            r4[r5] = r2     // Catch:{ all -> 0x021d }
            java.lang.Class r2 = java.lang.Double.TYPE     // Catch:{ all -> 0x021d }
            r6 = 2
            r4[r6] = r2     // Catch:{ all -> 0x021d }
            r0.getMethod(r3, r4)     // Catch:{ all -> 0x021d }
            r22 = r5
            goto L_0x023c
        L_0x021a:
            r0 = move-exception
            r5 = r3
            goto L_0x0224
        L_0x021d:
            r0 = move-exception
            goto L_0x0224
        L_0x021f:
            r0 = move-exception
            r5 = r4
            goto L_0x0224
        L_0x0222:
            r0 = move-exception
            r5 = 1
        L_0x0224:
            java.util.logging.Logger r2 = f6343a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0)
            r22 = r19
        L_0x023c:
            f6348f = r22
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = d(r0)
            long r0 = (long) r0
            g = r0
            d(r23)
            e(r23)
            d(r21)
            e(r21)
            d(r20)
            e(r20)
            d(r18)
            e(r18)
            d(r17)
            e(r17)
            d(r16)
            e(r16)
            java.lang.reflect.Field r0 = f()
            if (r0 == 0) goto L_0x0279
            i7.p1$e r1 = f6346d
            if (r1 != 0) goto L_0x0276
            goto L_0x0279
        L_0x0276:
            r1.j(r0)
        L_0x0279:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0283
            r19 = r5
        L_0x0283:
            f6349h = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.p1.<clinit>():void");
    }

    public static boolean a(Object obj, long j10) {
        return ((byte) ((l(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    public static boolean b(Object obj, long j10) {
        return ((byte) ((l(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }

    public static <T> T c(Class<T> cls) {
        try {
            return f6344b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int d(Class<?> cls) {
        if (f6348f) {
            return f6346d.a(cls);
        }
        return -1;
    }

    public static int e(Class<?> cls) {
        if (f6348f) {
            return f6346d.b(cls);
        }
        return -1;
    }

    public static Field f() {
        Field field;
        Field field2;
        if (d.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean g(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f6345c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean h(Object obj, long j10) {
        return f6346d.c(obj, j10);
    }

    public static byte i(byte[] bArr, long j10) {
        return f6346d.d(bArr, g + j10);
    }

    public static double j(Object obj, long j10) {
        return f6346d.e(obj, j10);
    }

    public static float k(Object obj, long j10) {
        return f6346d.f(obj, j10);
    }

    public static int l(Object obj, long j10) {
        return f6346d.g(obj, j10);
    }

    public static long m(Object obj, long j10) {
        return f6346d.h(obj, j10);
    }

    public static Object n(Object obj, long j10) {
        return f6346d.i(obj, j10);
    }

    public static Unsafe o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void p(Object obj, long j10, boolean z) {
        f6346d.k(obj, j10, z);
    }

    public static void q(byte[] bArr, long j10, byte b10) {
        f6346d.l(bArr, g + j10, b10);
    }

    public static void r(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int l10 = l(obj, j11);
        int i = ((~((int) j10)) & 3) << 3;
        v(obj, j11, ((255 & b10) << i) | (l10 & (~(255 << i))));
    }

    public static void s(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i = (((int) j10) & 3) << 3;
        v(obj, j11, ((255 & b10) << i) | (l(obj, j11) & (~(255 << i))));
    }

    public static void t(Object obj, long j10, double d10) {
        f6346d.m(obj, j10, d10);
    }

    public static void u(Object obj, long j10, float f10) {
        f6346d.n(obj, j10, f10);
    }

    public static void v(Object obj, long j10, int i) {
        f6346d.o(obj, j10, i);
    }

    public static void w(Object obj, long j10, long j11) {
        f6346d.p(obj, j10, j11);
    }

    public static void x(Object obj, long j10, Object obj2) {
        f6346d.q(obj, j10, obj2);
    }
}
