package j7;

import ah.v;
import com.google.android.gms.security.ProviderInstaller;
import j7.m;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class l<T_WRAPPER extends m<T_ENGINE>, T_ENGINE> {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f7103c = Logger.getLogger(l.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static final List<Provider> f7104d;

    /* renamed from: e  reason: collision with root package name */
    public static final l<m.a, Cipher> f7105e = new l<>(new m.a());

    /* renamed from: f  reason: collision with root package name */
    public static final l<m.b, Mac> f7106f = new l<>(new m.b());

    /* renamed from: a  reason: collision with root package name */
    public T_WRAPPER f7107a;

    /* renamed from: b  reason: collision with root package name */
    public List<Provider> f7108b = f7104d;

    static {
        if (v.R()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f7103c.info(String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f7104d = arrayList;
        } else {
            f7104d = new ArrayList();
        }
    }

    public l(T_WRAPPER t_wrapper) {
        this.f7107a = t_wrapper;
    }

    public final T_ENGINE a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a10 : this.f7108b) {
            try {
                return this.f7107a.a(str, a10);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.f7107a.a(str, (Provider) null);
    }
}
