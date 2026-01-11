package f7;

import a7.q;
import h7.j0;
import java.security.GeneralSecurityException;

public final class c {
    static {
        new b();
        int i = j0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        q.f(new b(), true);
        q.f(new a(), true);
        q.g(new d());
    }
}
