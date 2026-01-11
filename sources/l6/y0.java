package l6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.h;
import o6.z;
import y.c;

public final class y0 implements z, h {

    /* renamed from: a  reason: collision with root package name */
    public final int f8103a;

    public /* synthetic */ y0(int i) {
        this.f8103a = i;
    }

    public void a() {
    }

    public int b() {
        return this.f8103a;
    }

    public /* synthetic */ Object zza() {
        switch (this.f8103a) {
            case 0:
                return new x0();
            default:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(q2.f7999a);
                c.s0(newSingleThreadExecutor);
                return newSingleThreadExecutor;
        }
    }
}
