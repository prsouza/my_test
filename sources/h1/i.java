package h1;

import c9.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import l8.h;
import q.a;
import q4.e;
import x8.m;
import x8.z;
import y8.b;

public final /* synthetic */ class i implements a, Continuation, e, SuccessContinuation {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ i f5729b = new i(1);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ i f5730c = new i(2);

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ i f5731s = new i(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5732a;

    public /* synthetic */ i(int i) {
        this.f5732a = i;
    }

    public final Object apply(Object obj) {
        switch (this.f5732a) {
            case 0:
                return Long.valueOf(((l1.e) obj).n0());
            default:
                b bVar = (b) obj;
                Objects.requireNonNull(bVar);
                h hVar = z.f13147a;
                Objects.requireNonNull(hVar);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    hVar.a(bVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    public final Object then(Task task) {
        Object obj = m.f13084b;
        return 403;
    }

    public final Task then(Object obj) {
        f fVar = (f) obj;
        return Tasks.forResult(null);
    }
}
