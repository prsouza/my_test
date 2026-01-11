package j7;

import java.security.SecureRandom;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f7119a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        public final Object initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        f7119a.get().nextBytes(bArr);
        return bArr;
    }
}
