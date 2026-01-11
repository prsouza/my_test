package j0;

import android.os.Handler;
import android.os.Looper;

public final class d {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
