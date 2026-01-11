package u8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.slf4j.Marker;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f11740c = {Marker.ANY_MARKER, "FCM", CodePackage.GCM, BuildConfig.FLAVOR};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f11741a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11742b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(k7.d r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f7453a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.f11741a = r0
            r4.a()
            k7.f r0 = r4.f7455c
            java.lang.String r0 = r0.f7469e
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            r4.a()
            k7.f r4 = r4.f7455c
            java.lang.String r0 = r4.f7466b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
        L_0x003e:
            r0 = r2
            goto L_0x004a
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r3.f11742b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.b.<init>(k7.d):void");
    }

    public final String a() {
        String str;
        PublicKey publicKey;
        synchronized (this.f11741a) {
            str = null;
            String string = this.f11741a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }
}
