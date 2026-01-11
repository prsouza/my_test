package e8;

import ah.v;
import android.content.SharedPreferences;
import android.util.Log;
import b8.a;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class e implements SuccessContinuation<Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f4766a;

    public e(f fVar) {
        this.f4766a = fVar;
    }

    public final Task then(Object obj) throws Exception {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        f fVar = this.f4766a;
        b bVar = fVar.f4772f;
        j jVar = fVar.f4768b;
        Objects.requireNonNull(bVar);
        FileWriter fileWriter2 = null;
        try {
            Map c10 = bVar.c(jVar);
            Objects.requireNonNull((v) bVar.g);
            a aVar = new a((String) bVar.f4755f, c10);
            aVar.c("User-Agent", "Crashlytics Android SDK/18.2.10");
            aVar.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            bVar.a(aVar, jVar);
            bVar.f4756h.e0("Requesting settings from " + ((String) bVar.f4755f));
            bVar.f4756h.b1("Settings query params were: " + c10);
            jSONObject = bVar.d(aVar.b());
        } catch (IOException e10) {
            bVar.f4756h.g0("Settings request failed.", e10);
            jSONObject = null;
        }
        if (jSONObject != null) {
            c a10 = this.f4766a.f4769c.a(jSONObject);
            u2.e eVar = this.f4766a.f4771e;
            long j10 = a10.f4759c;
            Objects.requireNonNull(eVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable) null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) eVar.f11663a);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
                try {
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    x7.e.a(fileWriter, "Failed to close settings writer.");
                    this.f4766a.c(jSONObject, "Loaded settings: ");
                    f fVar2 = this.f4766a;
                    String str = fVar2.f4768b.f4780f;
                    SharedPreferences.Editor edit = x7.e.g(fVar2.f4767a).edit();
                    edit.putString("existing_instance_identifier", str);
                    edit.apply();
                    this.f4766a.f4773h.set(a10);
                    this.f4766a.i.get().trySetResult(a10);
                    return Tasks.forResult(null);
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    x7.e.a(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                x7.e.a(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            x7.e.a(fileWriter, "Failed to close settings writer.");
            this.f4766a.c(jSONObject, "Loaded settings: ");
            f fVar22 = this.f4766a;
            String str2 = fVar22.f4768b.f4780f;
            SharedPreferences.Editor edit2 = x7.e.g(fVar22.f4767a).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            this.f4766a.f4773h.set(a10);
            this.f4766a.i.get().trySetResult(a10);
        }
        return Tasks.forResult(null);
    }
}
