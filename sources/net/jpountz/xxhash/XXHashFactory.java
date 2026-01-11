package net.jpountz.xxhash;

import a8.a;
import androidx.fragment.app.o;
import b9.m;
import java.io.PrintStream;
import java.util.Random;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.StreamingXXHash64;

public final class XXHashFactory {
    private static XXHashFactory JAVA_SAFE_INSTANCE;
    private static XXHashFactory JAVA_UNSAFE_INSTANCE;
    private static XXHashFactory NATIVE_INSTANCE;
    private final XXHash32 hash32;
    private final XXHash64 hash64;
    private final String impl;
    private final StreamingXXHash32.Factory streamingHash32Factory;
    private final StreamingXXHash64.Factory streamingHash64Factory;

    private XXHashFactory(String str) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        this.impl = str;
        XXHash32 xXHash32 = (XXHash32) classInstance(a.c("net.jpountz.xxhash.XXHash32", str));
        this.hash32 = xXHash32;
        this.streamingHash32Factory = (StreamingXXHash32.Factory) classInstance(o.c("net.jpountz.xxhash.StreamingXXHash32", str, "$Factory"));
        XXHash64 xXHash64 = (XXHash64) classInstance(a.c("net.jpountz.xxhash.XXHash64", str));
        this.hash64 = xXHash64;
        this.streamingHash64Factory = (StreamingXXHash64.Factory) classInstance(o.c("net.jpountz.xxhash.StreamingXXHash64", str, "$Factory"));
        byte[] bArr = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr);
        int nextInt = random.nextInt();
        int hash = xXHash32.hash(bArr, 0, 100, nextInt);
        StreamingXXHash32 newStreamingHash32 = newStreamingHash32(nextInt);
        newStreamingHash32.update(bArr, 0, 100);
        int value = newStreamingHash32.getValue();
        long j10 = (long) nextInt;
        long hash2 = xXHash64.hash(bArr, 0, 100, j10);
        StreamingXXHash64 newStreamingHash64 = newStreamingHash64(j10);
        newStreamingHash64.update(bArr, 0, 100);
        long value2 = newStreamingHash64.getValue();
        if (hash != value) {
            throw new AssertionError();
        } else if (hash2 != value2) {
            throw new AssertionError();
        }
    }

    private static <T> T classInstance(String str) throws NoSuchFieldException, SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
        ClassLoader classLoader = XXHashFactory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get((Object) null);
    }

    public static XXHashFactory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public static XXHashFactory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    private static XXHashFactory instance(String str) {
        try {
            return new XXHashFactory(str);
        } catch (Exception e10) {
            throw new AssertionError(e10);
        }
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        StringBuilder d10 = a.a.d("Fastest instance is ");
        d10.append(fastestInstance());
        printStream.println(d10.toString());
        PrintStream printStream2 = System.out;
        StringBuilder d11 = a.a.d("Fastest Java instance is ");
        d11.append(fastestJavaInstance());
        printStream2.println(d11.toString());
    }

    public static synchronized XXHashFactory nativeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            xXHashFactory = NATIVE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory safeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            xXHashFactory = JAVA_SAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public static synchronized XXHashFactory unsafeInstance() {
        XXHashFactory xXHashFactory;
        synchronized (XXHashFactory.class) {
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            xXHashFactory = JAVA_UNSAFE_INSTANCE;
        }
        return xXHashFactory;
    }

    public XXHash32 hash32() {
        return this.hash32;
    }

    public XXHash64 hash64() {
        return this.hash64;
    }

    public StreamingXXHash32 newStreamingHash32(int i) {
        return this.streamingHash32Factory.newStreamingHash(i);
    }

    public StreamingXXHash64 newStreamingHash64(long j10) {
        return this.streamingHash64Factory.newStreamingHash(j10);
    }

    public String toString() {
        StringBuilder c10 = m.c("XXHashFactory", ":");
        c10.append(this.impl);
        return c10.toString();
    }
}
