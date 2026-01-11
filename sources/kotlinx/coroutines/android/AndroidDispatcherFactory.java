package kotlinx.coroutines.android;

import android.os.Looper;
import ge.n1;
import he.b;
import he.d;
import java.util.List;
import le.k;

public final class AndroidDispatcherFactory implements k {
    public n1 createDispatcher(List<? extends k> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new b(d.a(mainLooper), (String) null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
