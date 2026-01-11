package y7;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONObject;
import x7.e;
import y7.k;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f13524a;

    public /* synthetic */ j(k.a aVar) {
        this.f13524a = aVar;
    }

    public final Object call() {
        Map map;
        File file;
        BufferedWriter bufferedWriter;
        k.a aVar = this.f13524a;
        BufferedWriter bufferedWriter2 = null;
        aVar.f13532b.set((Object) null);
        synchronized (aVar) {
            if (aVar.f13531a.isMarked()) {
                b reference = aVar.f13531a.getReference();
                synchronized (reference) {
                    map = Collections.unmodifiableMap(new HashMap(reference.f13494a));
                }
                AtomicMarkableReference<b> atomicMarkableReference = aVar.f13531a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
            } else {
                map = null;
            }
        }
        if (map != null) {
            k kVar = k.this;
            e eVar = kVar.f13525a;
            String str = kVar.f13527c;
            if (aVar.f13533c) {
                file = eVar.f13501a.f(str, "internal-keys");
            } else {
                file = eVar.f13501a.f(str, "keys");
            }
            try {
                String jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), e.f13500b));
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                } catch (Exception e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    e.a(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedWriter = null;
                try {
                    Log.e("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    e.a(bufferedWriter, "Failed to close key/value metadata file.");
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter2 = bufferedWriter;
                    bufferedWriter = bufferedWriter2;
                    e.a(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedWriter = bufferedWriter2;
                e.a(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
            e.a(bufferedWriter, "Failed to close key/value metadata file.");
        }
        return null;
    }
}
