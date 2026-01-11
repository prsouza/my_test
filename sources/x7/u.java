package x7;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class u implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f12985b;

    public u(q qVar, long j10) {
        this.f12985b = qVar;
        this.f12984a = j10;
    }

    public final Object call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f12984a);
        this.f12985b.f12967k.c(bundle);
        return null;
    }
}
