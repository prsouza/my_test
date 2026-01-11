package c9;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

public final /* synthetic */ class a implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f3273a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3274b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f3275c;

    public /* synthetic */ a(e eVar, f fVar) {
        this.f3273a = eVar;
        this.f3275c = fVar;
    }

    public final Task then(Object obj) {
        e eVar = this.f3273a;
        boolean z = this.f3274b;
        f fVar = this.f3275c;
        Void voidR = (Void) obj;
        Objects.requireNonNull(eVar);
        if (z) {
            synchronized (eVar) {
                eVar.f3284c = Tasks.forResult(fVar);
            }
        }
        return Tasks.forResult(fVar);
    }
}
