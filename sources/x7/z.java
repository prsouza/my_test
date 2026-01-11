package x7;

import a.a;
import android.util.Log;
import c8.f;
import java.io.File;
import java.io.IOException;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final String f13005a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13006b;

    public z(String str, f fVar) {
        this.f13005a = str;
        this.f13006b = fVar;
    }

    public final boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            StringBuilder d10 = a.d("Error creating marker: ");
            d10.append(this.f13005a);
            Log.e("FirebaseCrashlytics", d10.toString(), e10);
            return false;
        }
    }

    public final File b() {
        return this.f13006b.a(this.f13005a);
    }
}
