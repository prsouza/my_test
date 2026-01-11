package j7;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class p implements g7.a {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Mac> f7112a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7113b;

    /* renamed from: c  reason: collision with root package name */
    public final Key f7114c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7115d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        public final Object initialValue() {
            try {
                Mac a10 = l.f7106f.a(p.this.f7113b);
                a10.init(p.this.f7114c);
                return a10;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public p(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f7112a = aVar;
        this.f7113b = str;
        this.f7114c = key;
        if (key.getEncoded().length >= 16) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.f7115d = 20;
                    break;
                case 1:
                    this.f7115d = 32;
                    break;
                case 2:
                    this.f7115d = 48;
                    break;
                case 3:
                    this.f7115d = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException(a8.a.c("unknown Hmac algorithm: ", str));
            }
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.f7115d) {
            this.f7112a.get().update(bArr);
            return Arrays.copyOf(this.f7112a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
