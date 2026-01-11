package x7;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class n implements SuccessContinuation<Void, Boolean> {
    public final Task then(Object obj) throws Exception {
        Void voidR = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }
}
