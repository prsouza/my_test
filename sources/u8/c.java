package u8;

import io.sentry.cache.EnvelopeCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import k7.d;
import org.json.JSONException;
import org.json.JSONObject;
import u8.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f11743a;

    /* renamed from: b  reason: collision with root package name */
    public final d f11744b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(d dVar) {
        this.f11744b = dVar;
    }

    public final File a() {
        if (this.f11743a == null) {
            synchronized (this) {
                if (this.f11743a == null) {
                    d dVar = this.f11744b;
                    dVar.a();
                    File filesDir = dVar.f7453a.getFilesDir();
                    this.f11743a = new File(filesDir, "PersistedInstallation." + this.f11744b.d() + EnvelopeCache.SUFFIX_CURRENT_SESSION_FILE);
                }
            }
        }
        return this.f11743a;
    }

    public final d b(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.c());
            jSONObject.put("Status", dVar.f().ordinal());
            jSONObject.put("AuthToken", dVar.a());
            jSONObject.put("RefreshToken", dVar.e());
            jSONObject.put("TokenCreationEpochInSecs", dVar.g());
            jSONObject.put("ExpiresInSecs", dVar.b());
            jSONObject.put("FisError", dVar.d());
            d dVar2 = this.f11744b;
            dVar2.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", dVar2.f7453a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    public final d c() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        a aVar = a.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", aVar.ordinal());
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        String optString4 = jSONObject.optString("FisError", (String) null);
        int i = d.f11745a;
        a.C0229a aVar2 = new a.C0229a();
        aVar2.d(0);
        aVar2.f11735b = aVar;
        aVar2.b(0);
        aVar2.f11734a = optString;
        aVar2.c(a.values()[optInt]);
        aVar2.f11736c = optString2;
        aVar2.f11737d = optString3;
        aVar2.d(optLong);
        aVar2.b(optLong2);
        aVar2.g = optString4;
        return aVar2.a();
        throw th;
    }
}
