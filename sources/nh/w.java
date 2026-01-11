package nh;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Objects;

public final class w {

    public static class a extends ObjectInputStream {

        /* renamed from: c  reason: collision with root package name */
        public static final HashSet f9144c;

        /* renamed from: a  reason: collision with root package name */
        public final Class f9145a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9146b = false;

        static {
            HashSet hashSet = new HashSet();
            f9144c = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public a(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.f9145a = cls;
        }

        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (!this.f9146b) {
                if (objectStreamClass.getName().equals(this.f9145a.getName())) {
                    this.f9146b = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!f9144c.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long a(byte[] bArr, int i) {
        long j10 = 0;
        for (int i10 = 0; i10 < 0 + i; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return j10;
    }

    public static byte[] b(byte[] bArr) {
        Objects.requireNonNull(bArr, "in == null");
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[][] c(byte[][] bArr) {
        boolean z = true;
        if (bArr != null) {
            int i = 0;
            while (true) {
                if (i >= bArr.length) {
                    z = false;
                    break;
                } else if (bArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i10 = 0; i10 < bArr.length; i10++) {
                bArr2[i10] = new byte[bArr[i10].length];
                System.arraycopy(bArr[i10], 0, bArr2[i10], 0, bArr[i10].length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static void d(byte[] bArr, byte[] bArr2, int i) {
        Objects.requireNonNull(bArr2, "src == null");
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                bArr[i + i10] = bArr2[i10];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    public static Object e(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    public static byte[] f(byte[] bArr, int i, int i10) {
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i10 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i10 <= bArr.length) {
            byte[] bArr2 = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr2[i11] = bArr[i + i11];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    public static boolean g(int i, long j10) {
        if (j10 >= 0) {
            return j10 < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static int h(int i) {
        int i10 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static byte[] i(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] j(long j10, int i) {
        byte[] bArr = new byte[i];
        for (int i10 = i - 1; i10 >= 0; i10--) {
            bArr[i10] = (byte) ((int) j10);
            j10 >>>= 8;
        }
        return bArr;
    }
}
