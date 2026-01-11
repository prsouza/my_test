package c9;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f3276a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f3277b;

    public /* synthetic */ b(e eVar, f fVar) {
        this.f3276a = eVar;
        this.f3277b = fVar;
    }

    public final Object call() {
        e eVar = this.f3276a;
        f fVar = this.f3277b;
        k kVar = eVar.f3283b;
        synchronized (kVar) {
            FileOutputStream openFileOutput = kVar.f3307a.openFileOutput(kVar.f3308b, 0);
            try {
                openFileOutput.write(fVar.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }
}
