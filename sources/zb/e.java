package zb;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f14278a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f14279b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f14280c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f14281d = ((long) b());

    public static class a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public final Unsafe run() {
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

    /* JADX WARNING: Removed duplicated region for block: B:9:0x005d A[SYNTHETIC, Splitter:B:9:0x005d] */
    static {
        /*
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            sun.misc.Unsafe r1 = f()
            f14278a = r1
            r2 = 3
            java.lang.String r3 = "copyMemory"
            java.lang.String r4 = "putByte"
            r5 = 2
            java.lang.String r6 = "getByte"
            r7 = 0
            java.lang.String r8 = "getLong"
            r9 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0056 }
            java.lang.String r10 = "objectFieldOffset"
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x0056 }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r7] = r12     // Catch:{ all -> 0x0056 }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ all -> 0x0056 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x0056 }
            r10[r7] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0056 }
            r10[r7] = r0     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r8, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x0056 }
            r10[r7] = r11     // Catch:{ all -> 0x0056 }
            java.lang.Class r12 = java.lang.Byte.TYPE     // Catch:{ all -> 0x0056 }
            r10[r9] = r12     // Catch:{ all -> 0x0056 }
            r1.getMethod(r4, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ all -> 0x0056 }
            r10[r7] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r8, r10)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ all -> 0x0056 }
            r10[r7] = r11     // Catch:{ all -> 0x0056 }
            r10[r9] = r11     // Catch:{ all -> 0x0056 }
            r10[r5] = r11     // Catch:{ all -> 0x0056 }
            r1.getMethod(r3, r10)     // Catch:{ all -> 0x0056 }
            r1 = r9
            goto L_0x0057
        L_0x0056:
            r1 = r7
        L_0x0057:
            f14279b = r1
            sun.misc.Unsafe r1 = f14278a
            if (r1 == 0) goto L_0x009f
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x009f }
            java.lang.String r10 = "arrayBaseOffset"
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x009f }
            java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
            r11[r7] = r12     // Catch:{ all -> 0x009f }
            r1.getMethod(r10, r11)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ all -> 0x009f }
            r10[r7] = r0     // Catch:{ all -> 0x009f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x009f }
            r10[r9] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r6, r10)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x009f }
            r6[r7] = r0     // Catch:{ all -> 0x009f }
            r6[r9] = r11     // Catch:{ all -> 0x009f }
            java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ all -> 0x009f }
            r6[r5] = r10     // Catch:{ all -> 0x009f }
            r1.getMethod(r4, r6)     // Catch:{ all -> 0x009f }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ all -> 0x009f }
            r4[r7] = r0     // Catch:{ all -> 0x009f }
            r4[r9] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r8, r4)     // Catch:{ all -> 0x009f }
            r4 = 5
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ all -> 0x009f }
            r4[r7] = r0     // Catch:{ all -> 0x009f }
            r4[r9] = r11     // Catch:{ all -> 0x009f }
            r4[r5] = r0     // Catch:{ all -> 0x009f }
            r4[r2] = r11     // Catch:{ all -> 0x009f }
            r0 = 4
            r4[r0] = r11     // Catch:{ all -> 0x009f }
            r1.getMethod(r3, r4)     // Catch:{ all -> 0x009f }
            r7 = r9
        L_0x009f:
            f14280c = r7
            int r0 = b()
            long r0 = (long) r0
            f14281d = r0
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r1 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ all -> 0x00b4 }
            r0.setAccessible(r9)     // Catch:{ all -> 0x00b4 }
            goto L_0x00b5
        L_0x00b4:
            r0 = 0
        L_0x00b5:
            c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.e.<clinit>():void");
    }

    public static byte a(byte[] bArr, long j10) {
        return f14278a.getByte(bArr, j10);
    }

    public static int b() {
        if (f14280c) {
            return f14278a.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    public static long c(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f14278a) == null) {
            return -1;
        }
        return unsafe.objectFieldOffset(field);
    }

    public static void d(byte[] bArr, long j10, byte b10) {
        f14278a.putByte(bArr, j10, b10);
    }

    public static long e(byte[] bArr, long j10) {
        return f14278a.getLong(bArr, j10);
    }

    public static Unsafe f() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }
}
