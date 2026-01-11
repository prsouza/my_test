package e7;

import a7.j;
import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import j7.r;
import j7.s;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

public final class c implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4748b = 0;

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f4749a = new a().f4750a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public KeyStore f4750a = null;

        public a() {
            int i = c.f4748b;
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.f4750a = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
            } catch (IOException | GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static void c(String str) throws GeneralSecurityException {
        if (!new c().d(str)) {
            String b10 = s.b(str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(256).setBlockModes(new String[]{CodePackage.GCM}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    public final synchronized a7.a a(String str) throws GeneralSecurityException {
        b bVar;
        bVar = new b(s.b(str), this.f4749a);
        byte[] a10 = r.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a10, bVar.b(bVar.a(a10, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d(java.lang.String r3) throws java.security.GeneralSecurityException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = j7.s.b(r3)     // Catch:{ all -> 0x0034 }
            java.security.KeyStore r0 = r2.f4749a     // Catch:{ NullPointerException -> 0x000d }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000d }
            monitor-exit(r2)
            return r3
        L_0x000d:
            java.lang.String r0 = "c"
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0034 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r2.f4749a = r0     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
        L_0x0025:
            java.security.KeyStore r0 = r2.f4749a     // Catch:{ all -> 0x0034 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.d(java.lang.String):boolean");
    }
}
