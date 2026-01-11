package j2;

import c3.k;
import e6.e;
import fe.o;
import java.nio.ByteBuffer;
import nd.f;
import xd.l;
import yd.h;

public final class a {

    /* renamed from: j2.a$a  reason: collision with other inner class name */
    public static final class C0121a extends h implements l<Byte, CharSequence> {

        /* renamed from: b  reason: collision with root package name */
        public static final C0121a f7014b = new C0121a();

        public C0121a() {
            super(1);
        }

        public final Object k(Object obj) {
            k.T(16);
            String num = Integer.toString(((Number) obj).byteValue() & 255, 16);
            e.C(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            return o.q1(num, 2);
        }
    }

    public static final String a(byte b10) {
        byte[] array = ByteBuffer.allocate(1).put(b10).array();
        e.C(array, "ByteBuffer.allocate(1).put(this).array()");
        return c(array);
    }

    public static final String b(long j10) {
        byte[] array = ByteBuffer.allocate(8).putLong(j10).array();
        e.C(array, "ByteBuffer.allocate(8).putLong(this).array()");
        return c(array);
    }

    public static final String c(byte[] bArr) {
        return f.M(bArr, C0121a.f7014b);
    }
}
