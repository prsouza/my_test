package y7;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import x7.e;

public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f13523a;

    public /* synthetic */ i(k kVar) {
        this.f13523a = kVar;
    }

    public final Object call() {
        boolean z;
        BufferedWriter bufferedWriter;
        String str;
        BufferedWriter bufferedWriter2;
        k kVar = this.f13523a;
        synchronized (kVar.f13530f) {
            z = false;
            bufferedWriter = null;
            if (kVar.f13530f.isMarked()) {
                str = kVar.f13530f.getReference();
                kVar.f13530f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            File f10 = kVar.f13525a.f13501a.f(kVar.f13527c, "user-data");
            try {
                String obj = new d(str).toString();
                bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f10), e.f13500b));
                try {
                    bufferedWriter2.write(obj);
                    bufferedWriter2.flush();
                } catch (Exception e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    e.a(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedWriter2 = null;
                try {
                    Log.e("FirebaseCrashlytics", "Error serializing user metadata.", e);
                    e.a(bufferedWriter2, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedWriter = bufferedWriter2;
                    bufferedWriter2 = bufferedWriter;
                    e.a(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedWriter2 = bufferedWriter;
                e.a(bufferedWriter2, "Failed to close user metadata file.");
                throw th;
            }
            e.a(bufferedWriter2, "Failed to close user metadata file.");
        }
        return null;
    }
}
