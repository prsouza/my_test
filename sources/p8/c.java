package p8;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9714a;

    public /* synthetic */ c(g gVar) {
        this.f9714a = gVar;
    }

    public final Object call() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        g gVar = this.f9714a;
        synchronized (gVar) {
            k kVar = gVar.f9720a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c10;
                if (i < arrayList.size()) {
                    l lVar = (l) arrayList.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", lVar.b());
                    jSONObject.put("dates", new JSONArray(lVar.a()));
                    jSONArray.put(jSONObject);
                    i++;
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th2) {
                        try {
                            base64OutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
        }
        return byteArrayOutputStream;
        throw th;
    }
}
