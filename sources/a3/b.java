package a3;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f38a = new HashSet();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void a(String str, Throwable th2) {
        ? r02 = f38a;
        if (!r02.contains(str)) {
            Log.w("LOTTIE", str, th2);
            r02.add(str);
        }
    }
}
