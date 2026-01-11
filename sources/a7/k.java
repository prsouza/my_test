package a7;

import a8.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<j> f151a = new CopyOnWriteArrayList<>();

    public static j a(String str) throws GeneralSecurityException {
        Iterator<j> it = f151a.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.b(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(a.c("No KMS client does support: ", str));
    }
}
