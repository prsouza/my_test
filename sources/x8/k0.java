package x8;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<k0> f13075b;

    /* renamed from: a  reason: collision with root package name */
    public h0 f13076a;

    public k0(SharedPreferences sharedPreferences, Executor executor) {
    }

    public final synchronized j0 a() {
        String peek;
        j0 j0Var;
        h0 h0Var = this.f13076a;
        synchronized (h0Var.f13053d) {
            peek = h0Var.f13053d.peek();
        }
        Pattern pattern = j0.f13069d;
        j0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                j0Var = new j0(split[0], split[1]);
            }
        }
        return j0Var;
    }
}
