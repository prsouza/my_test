package b7;

import a7.q;
import f7.c;
import h7.j0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class a {
    static {
        new c();
        new f();
        new g();
        new e();
        new i();
        new k();
        new h();
        new l();
        int i = j0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        boolean z;
        c.a();
        q.f(new c(), true);
        q.f(new e(), true);
        q.f(new f(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            q.f(new g(), true);
        }
        q.f(new h(), true);
        q.f(new i(), true);
        q.f(new k(), true);
        q.f(new l(), true);
        q.g(new b());
    }
}
