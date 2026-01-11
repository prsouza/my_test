package net.jpountz.lz4;

import a.a;
import b9.m;
import java.io.PrintStream;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private LZ4Factory(java.lang.String r22) throws java.lang.ClassNotFoundException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r21.<init>()
            r2 = 18
            net.jpountz.lz4.LZ4Compressor[] r2 = new net.jpountz.lz4.LZ4Compressor[r2]
            r0.highCompressors = r2
            r0.impl = r1
            java.lang.String r3 = "net.jpountz.lz4.LZ4"
            java.lang.String r4 = "Compressor"
            java.lang.String r5 = androidx.fragment.app.o.c(r3, r1, r4)
            java.lang.Object r5 = classInstance(r5)
            net.jpountz.lz4.LZ4Compressor r5 = (net.jpountz.lz4.LZ4Compressor) r5
            r0.fastCompressor = r5
            java.lang.String r5 = "net.jpountz.lz4.LZ4HC"
            java.lang.String r4 = androidx.fragment.app.o.c(r5, r1, r4)
            java.lang.Object r4 = classInstance(r4)
            net.jpountz.lz4.LZ4Compressor r4 = (net.jpountz.lz4.LZ4Compressor) r4
            r0.highCompressor = r4
            java.lang.String r5 = "FastDecompressor"
            java.lang.String r5 = androidx.fragment.app.o.c(r3, r1, r5)
            java.lang.Object r5 = classInstance(r5)
            net.jpountz.lz4.LZ4FastDecompressor r5 = (net.jpountz.lz4.LZ4FastDecompressor) r5
            r0.fastDecompressor = r5
            java.lang.String r5 = "SafeDecompressor"
            java.lang.String r1 = androidx.fragment.app.o.c(r3, r1, r5)
            java.lang.Object r1 = classInstance(r1)
            net.jpountz.lz4.LZ4SafeDecompressor r1 = (net.jpountz.lz4.LZ4SafeDecompressor) r1
            r0.safeDecompressor = r1
            java.lang.Class r1 = r4.getClass()
            r3 = 1
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r7 = 0
            r5[r7] = r6
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r5)
            r5 = 9
            r2[r5] = r4
            r2 = r3
        L_0x005e:
            r4 = 17
            if (r2 > r4) goto L_0x007a
            if (r2 != r5) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            net.jpountz.lz4.LZ4Compressor[] r4 = r0.highCompressors
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r6[r7] = r8
            java.lang.Object r6 = r1.newInstance(r6)
            net.jpountz.lz4.LZ4Compressor r6 = (net.jpountz.lz4.LZ4Compressor) r6
            r4[r2] = r6
        L_0x0077:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x007a:
            r1 = 20
            byte[] r2 = new byte[r1]
            r2 = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106} // fill-array
            r4 = 2
            net.jpountz.lz4.LZ4Compressor[] r4 = new net.jpountz.lz4.LZ4Compressor[r4]
            net.jpountz.lz4.LZ4Compressor r5 = r0.fastCompressor
            r4[r7] = r5
            net.jpountz.lz4.LZ4Compressor r5 = r0.highCompressor
            r4[r3] = r5
            java.util.List r3 = java.util.Arrays.asList(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r4 = r3.next()
            r8 = r4
            net.jpountz.lz4.LZ4Compressor r8 = (net.jpountz.lz4.LZ4Compressor) r8
            int r14 = r8.maxCompressedLength(r1)
            byte[] r4 = new byte[r14]
            r10 = 0
            r13 = 0
            r11 = 20
            r9 = r2
            r12 = r4
            int r5 = r8.compress((byte[]) r9, (int) r10, (int) r11, (byte[]) r12, (int) r13, (int) r14)
            byte[] r6 = new byte[r1]
            net.jpountz.lz4.LZ4FastDecompressor r15 = r0.fastDecompressor
            r17 = 0
            r19 = 0
            r20 = 20
            r16 = r4
            r18 = r6
            r15.decompress((byte[]) r16, (int) r17, (byte[]) r18, (int) r19, (int) r20)
            boolean r8 = java.util.Arrays.equals(r2, r6)
            if (r8 == 0) goto L_0x00ea
            java.util.Arrays.fill(r6, r7)
            net.jpountz.lz4.LZ4SafeDecompressor r15 = r0.safeDecompressor
            r17 = 0
            r20 = 0
            r16 = r4
            r18 = r5
            r19 = r6
            int r4 = r15.decompress(r16, r17, r18, r19, r20)
            if (r4 != r1) goto L_0x00e4
            boolean r4 = java.util.Arrays.equals(r2, r6)
            if (r4 == 0) goto L_0x00e4
            goto L_0x0094
        L_0x00e4:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00ea:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4Factory.<init>(java.lang.String):void");
    }

    private static <T> T classInstance(String str) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder d10 = a.d("Fastest instance is ");
        d10.append(fastestInstance());
        printStream.println(d10.toString());
        PrintStream printStream2 = System.out;
        StringBuilder d11 = a.d("Fastest Java instance is ");
        d11.append(fastestJavaInstance());
        printStream2.println(d11.toString());
    }

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            lZ4Factory = NATIVE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            lZ4Factory = JAVA_SAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            lZ4Factory = JAVA_UNSAFE_INSTANCE;
        }
        return lZ4Factory;
    }

    public LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public String toString() {
        StringBuilder c10 = m.c("LZ4Factory", ":");
        c10.append(this.impl);
        return c10.toString();
    }

    public LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public LZ4Compressor highCompressor(int i) {
        if (i > 17) {
            i = 17;
        } else if (i < 1) {
            i = 9;
        }
        return this.highCompressors[i];
    }
}
